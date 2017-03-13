import com.github.kittinunf.fuel.core.FuelManager
import com.google.inject.Guice
import service.ServiceModule
import service.StashService

fun main(args: Array<String>) {
    
    try {
        // Fuel config
        FuelManager.instance.basePath = "http://api.pathofexile.com"
    
        // GOooo
        val injector = Guice.createInjector(ServiceModule())
        val stashService = injector.getInstance(StashService::class.java)
    
        val stashRequest = stashService.getStashes()
        
        println(stashRequest.stashes.size)
    
    } catch(e: Exception) {
        e.printStackTrace()
    }
}