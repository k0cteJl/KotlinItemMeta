package ru.k0cteJl.kotlinItemStack

import org.bukkit.inventory.ItemStack

fun ItemStack.isModel(i: Int): Boolean{
    return this.itemMeta != null && this.itemMeta.hasCustomModelData()
}

fun ItemStack.itemMetaNotNull(): Boolean{
    return this.itemMeta != null
}

fun ItemStack.hasCustomModelData(): Boolean{
    return this.itemMeta != null && this.itemMeta.hasCustomModelData()
}

fun ItemStack.setCustomModelData(i: Int): ItemStack{
    val meta = itemMeta
    meta.setCustomModelData(i)
    setItemMeta(meta)
    return this
}

fun ItemStack.setDisplayName(s: String): ItemStack{
    return this.setDisplayName(s)
}

fun ItemStack.setItemName(s: String): ItemStack{
    return this.setItemName(s)
}

fun ItemStack.setItemLore(l: List<String>): ItemStack{
    val item = this
    item.lore = l
    return item
}

fun ItemStack.setItemAmount(i: Int): ItemStack{
    val item = this
    item.amount = i
    return item
}