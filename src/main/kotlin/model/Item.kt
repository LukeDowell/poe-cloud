package model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Item(
        @JsonProperty("verified") val isVerified: Boolean,
        @JsonProperty("w") val width: Int,
        @JsonProperty("h") val height: Int,
        @JsonProperty("ilvl") val itemLevel: Int,
        @JsonProperty("icon") val icon: String,
        @JsonProperty("league") val league: String,
        @JsonProperty("id") val id: String,
        @JsonProperty("sockets") val sockets: List<Socket> = listOf(),
        @JsonProperty("name") val name: String,
        @JsonProperty("typeLine") val typeLine: String,
        @JsonProperty("identified") val isIdentified: Boolean,
        @JsonProperty("corrupted") val isCorrupted: Boolean,
        @JsonProperty("lockedToCharacter") val isLockedToCharacter: Boolean,
        @JsonProperty("note") val note: String?,
        @JsonProperty("properties") val properties: List<Property> = listOf(),
        @JsonProperty("requirements") val requirements: List<Property> = listOf(),
        @JsonProperty("explicitMods") val explicitMods: List<String> = listOf(),
        @JsonProperty("implicitMods") val implicitMods: List<String> = listOf(),
        @JsonProperty("enchantMods") val enchantMods: List<String> = listOf(),
        @JsonProperty("craftedMods") val craftedMods: List<String> = listOf(),
        @JsonProperty("flavourText") val flavorText: List<String> = listOf(), // As if I'd ever write 'flavour'. Communists.
        @JsonProperty("frameType") val frameType: Int, // todo figure out how to convert this into enum
        @JsonProperty("x") val x: Int,
        @JsonProperty("y") val y: Int,
        @JsonProperty("inventoryId") val inventoryId: String,
        @JsonProperty("socketedItems") val socketedItems: List<Any> = listOf(), // todo what model is this?
        @JsonProperty("additionalProperties") val additionalProperties: List<Property> = listOf(),
        @JsonProperty("secDescrText") val secondDescriptionText: String?,
        @JsonProperty("descrText") val descriptionText: String?,
        @JsonProperty("artFilename") val artFilename: String?,
        @JsonProperty("duplicated") val isDuplicated: Boolean,
        @JsonProperty("maxStackSize") val maxStackSize: Int,
        @JsonProperty("nextLevelRequirements") val nextLevelRequirements: List<Property> = listOf(),
        @JsonProperty("stackSize") val stackSize: Int,
        @JsonProperty("talismanTier") val talismanTier: Int,
        @JsonProperty("utilityMods") val utilityMods: List<String> = listOf(),
        @JsonProperty("support") val isSupport: Boolean,
        @JsonProperty("cosmeticMods") val cosmeticMods: List<String> = listOf(),
        @JsonProperty("prophecyDiffText") val prophecyDifficultyText: String?,
        @JsonProperty("prophecyText") val prophecyText: String?,
        @JsonProperty("isRelic") val isRelic: Boolean
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class Socket (
        @JsonProperty("group_id") val groupId: Int,
        @JsonProperty("attr") val attribute: String // todo attribute, S=Strength, I=Intelligence, D=Dexterity, G=white
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class Property (
        @JsonProperty("name") val name: String,
        @JsonProperty("values") val values: Any, //todo array[0] is value, array[1] is valueTypes
        @JsonProperty("displayMode") val displayMode: Int,
        @JsonProperty("type") val type: Int,
        @JsonProperty("progress") val progress: Int
)