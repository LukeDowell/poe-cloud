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
        @JsonProperty("sockets") val sockets: List<Socket>,
        @JsonProperty("name") val name: String,
        @JsonProperty("typeLine") val typeLine: String,
        @JsonProperty("identified") val isIdentified: Boolean,
        @JsonProperty("corrupted") val isCorrupted: Boolean,
        @JsonProperty("lockedToCharacter") val isLockedToCharacter: Boolean,
        @JsonProperty("note") val note: String,
        @JsonProperty("properties") val properties: List<Property>,
        @JsonProperty("requirements") val requirements: List<Property>,
        @JsonProperty("explicitMods") val explicitMods: List<String>,
        @JsonProperty("implicitMods") val implicitMods: List<String>,
        @JsonProperty("enchantMods") val enchantMods: List<String>,
        @JsonProperty("craftedMods") val craftedMods: List<String>,
        @JsonProperty("flavourText") val flavorText: List<String>, // As if I'd ever write 'flavour'. Communists.
        @JsonProperty("frameType") val frameType: Int, // todo figure out how to convert this into enum
        @JsonProperty("x") val x: Int,
        @JsonProperty("y") val y: Int,
        @JsonProperty("inventoryId") val inventoryId: String,
        @JsonProperty("socketedItems") val socketedItems: List<Any>, // todo what model is this?
        @JsonProperty("additionalProperties") val additionalProperties: List<Property>,
        @JsonProperty("secDescrText") val secondDescriptionText: String,
        @JsonProperty("descrText") val descriptionText: String,
        @JsonProperty("artFilename") val artFilename: String,
        @JsonProperty("duplicated") val isDuplicated: Boolean,
        @JsonProperty("maxStackSize") val maxStackSize: Int,
        @JsonProperty("nextLevelRequirements") val nextLevelRequirements: List<Property>,
        @JsonProperty("stackSize") val stackSize: Int,
        @JsonProperty("talismanTier") val talismanTier: Int,
        @JsonProperty("utilityMods") val utilityMods: List<String>,
        @JsonProperty("support") val isSupport: Boolean,
        @JsonProperty("cosmeticMods") val cosmeticMods: List<String>,
        @JsonProperty("prophecyDiffText") val prophecyDifficultyText: String,
        @JsonProperty("prophecyText") val prophecyText: String,
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