package service.impl

import com.github.kittinunf.fuel.httpGet
import model.StashRequest
import service.StashService

class StashServiceImpl: StashService {
    
    override fun getStashesWithChangeId(id: String): StashRequest {
        return StashRequest("", listOf())
    }
    
    override fun getStashes(): StashRequest {
        "/public-stash-tabs".httpGet().responseObject(StashRequest.Deserializer()) { req, res, result ->
            result.fold(
                success = {
                    val stashes = it.stashes
    
                    println("Stash Size: ${stashes.size}")
                    stashes.forEach(::println)
                },
                    
                failure = ::println
            )
        }
        return StashRequest("", listOf())
    }
    
}
