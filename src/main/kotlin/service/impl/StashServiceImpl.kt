package service.impl

import com.github.kittinunf.fuel.httpGet
import model.StashRequest
import service.StashService

class StashServiceImpl: StashService {
    
    override fun getStashesWithChangeId(id: String): StashRequest {
        return StashRequest("", listOf())
    }
    
    override fun getStashes(): StashRequest {
        "/public-stash-tabs".httpGet().responseObject(StashRequest.Deserializer()) { request, response, result ->
            
            println("starting")
            
            result.fold(
                { success ->
                    println(success)
                },
                { error ->
                    println(error)
                }
            )
        }
    
        return StashRequest("", listOf())
    }
    
}
