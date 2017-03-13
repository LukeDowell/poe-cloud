package model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.github.kittinunf.fuel.core.ResponseDeserializable

@JsonIgnoreProperties(ignoreUnknown = true)
data class StashRequest(
        @JsonProperty("next_change_id") val changeId: String,
        @JsonProperty("stashes") val stashes: List<Stash>
) {
    class Deserializer : ResponseDeserializable<StashRequest> {
        override fun deserialize(content: String): StashRequest? = jacksonObjectMapper().readValue(content, StashRequest::class.java)
    }
}