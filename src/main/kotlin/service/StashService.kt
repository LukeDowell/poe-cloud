package service

import model.StashRequest

/**
 * http://pathofexile.gamepedia.com/Public_stash_tab_API
 */
interface StashService {
    
    fun getStashes(): StashRequest
    
    fun getStashesWithChangeId(id: String): StashRequest
}