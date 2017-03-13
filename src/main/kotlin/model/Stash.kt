package model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Stash(
        @JsonProperty("accountName") val accountName: String,
        @JsonProperty("lastCharacterName") val lastCharacterName: String,
        @JsonProperty("id") val id: String,
        @JsonProperty("stash") val stashName: String,
        @JsonProperty("stashType") val stashType: StashType,
        @JsonProperty("items") val items: List<Item>,
        @JsonProperty("public") val isPublic: Boolean
)

enum class StashType {
    NormalStash,
    PremiumStash,
    QuadStash,
    EssenceStash,
    CurrencyStash,
    DivinationStash
}
