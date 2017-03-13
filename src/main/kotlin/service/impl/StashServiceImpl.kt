package service.impl

import com.github.kittinunf.fuel.httpGet
import model.StashRequest
import service.StashService

class StashServiceImpl: StashService {
    
    override fun getStashesWithChangeId(id: String): StashRequest {
        return StashRequest("", listOf())
    }
    
    override fun getStashes(): StashRequest {
        var stashRequest = StashRequest("", listOf())
        val (request, response, result) = "/public-stash-tabs".httpGet().responseObject(StashRequest.Deserializer())
        
        result.fold(
            success = { stashRequest = it },
            failure = ::println
        )
        
        return stashRequest
    }
}
