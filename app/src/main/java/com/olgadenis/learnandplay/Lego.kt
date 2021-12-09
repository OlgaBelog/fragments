package com.olgadenis.learnandplay

data class Lego (
    val name: String,
    val collect: String,
    val image: Int
)

public val legoList:List<Lego> = listOf(
    Lego("Доктор", "Профессии", R.drawable.lego_doctor),
    Lego("Пожарный", "Профессии", R.drawable.lego_fireman),
    Lego("Полицейский", "Профессии", R.drawable.lego_police),
    Lego("Строитель", "Профессии", R.drawable.lego_builder),
    Lego("Супермэн", "СуперГерои", R.drawable.lego_supermen),
    Lego("Ниндзя", "СуперГерои", R.drawable.lego_ninja),
    Lego("Марти МакФлай", "СуперГерои", R.drawable.lego_marty_mcfly),
    Lego("Бэтмэн", "СуперГерои", R.drawable.batmen),
    Lego("Продавец бургеров", "Профессии", R.drawable.burgersailer),
    Lego("Ночной ветер", "СуперГерои", R.drawable.nightwing))