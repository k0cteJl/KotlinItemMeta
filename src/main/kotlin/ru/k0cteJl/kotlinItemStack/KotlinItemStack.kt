package ru.k0cteJl.kotlinItemStack

import org.bukkit.plugin.java.JavaPlugin

class KotlinItemStack : JavaPlugin() {

    ////ItemStackBuilder
    //val item = ItemStackBuilder(material = Material.IRON_SWORD, name = "Серебрянный меч", customModelData = 1000).build()

    ////Более красивое создание предмета
    //val item = ItemStack(Material.IRON_SWORD)
    //    .setItemName("Серебрянный меч")
    //    .setItemLore(listOf("123", "456"))
    //    .setCustomModelData(1000)
    //    .setItemAmount(1)

    ////Проверка на то что предмет имеет CustomModelData с определённым значением
    //val item = ItemStackBuilder(material = Material.IRON_SWORD, name = "Серебрянный меч", customModelData = 1000).build()
    //if(item.isModel(1000)){
    //    ...
    //}

    ////Проверка на то что предмет имеет CustomModelData с любым значением
    //val item = ItemStackBuilder(material = Material.IRON_SWORD, name = "Серебрянный меч", customModelData = 1000).build()
    //if(item.hasCustomModelData()){
    //    ...
    //}

    ////Проверка на то что предмет имеет ItemMeta
    //val item = ItemStackBuilder(material = Material.IRON_SWORD, name = "Серебрянный меч", customModelData = 1000).build()
    //if(item.itemMetaNotNull()){
    //    ...
    //}

}