package service

import com.google.inject.AbstractModule
import com.google.inject.Singleton
import service.impl.StashServiceImpl

class ServiceModule: AbstractModule() {
    
    override fun configure() {
        bind(StashService::class.java).to(StashServiceImpl::class.java).`in`(Singleton::class.java)
    }
    
}