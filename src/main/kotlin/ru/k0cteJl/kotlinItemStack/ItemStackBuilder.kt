package ru.k0cteJl.kotlinItemStack

import org.bukkit.Material
import org.bukkit.enchantments.Enchantment
import org.bukkit.inventory.ItemRarity
import org.bukkit.inventory.ItemStack

data class ItemStackBuilder(
    var material: Material,
    var amount: Int = 1,
    var name: String? = null,
    var lore: List<String>? = null,
    var customModelData: Int? = null,
    var enchantments: MutableMap<Enchantment, Int>? = null,
    var rarity: ItemRarity? = null
){

    fun build(): ItemStack{
        val item = ItemStack(material, amount)
        val itemMeta = item.itemMeta
        name?.let { itemMeta.setItemName(name!!) }
        lore?.let { itemMeta.lore = lore!! }
        customModelData?.let { itemMeta.setCustomModelData(customModelData!!) }
        rarity?.let { itemMeta.setRarity(rarity!!) }
        enchantments?.let { item.addEnchantments(enchantments!!) }
        item.setItemMeta(itemMeta)
        return item
    }

}