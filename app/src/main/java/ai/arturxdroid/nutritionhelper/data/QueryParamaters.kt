package ai.arturxdroid.nutritionhelper.data

sealed class Intolerance(val value: String) {
    object Dairy : Intolerance("dairy")
    object Egg : Intolerance("egg")
    object Gluten : Intolerance("gluten")
    object Peanut : Intolerance("peanut")
    object Sesame : Intolerance("sesame")
    object Seafood : Intolerance("seafood")
    object Shellfish : Intolerance("shellfish")
    object Soy : Intolerance("soy")
    object Sulfite : Intolerance("sulfite")
    object TreeNut : Intolerance("tree nut")
    object Wheat : Intolerance("whey")
}

sealed class Cuisine(val value: String) {
    object African:Cuisine("african")
    object Chinese:Cuisine("chinese")
    object Japanese:Cuisine("japanese")
    object Korean:Cuisine("korean")
    object Vietnamese:Cuisine("vietnamese")
    object Thai:Cuisine("thai")
    object Indian:Cuisine("indian")
    object British:Cuisine("british")
    object Irish:Cuisine("irish")
    object French:Cuisine("french")
    object Italian:Cuisine("italian")
    object Mexican:Cuisine("mexican")
    object Spanish:Cuisine("spanish")
    object MiddleEastern:Cuisine("middle eastern")
    object Jewish:Cuisine("jewish")
    object American:Cuisine("american")
    object Cajun:Cuisine("cajun")
    object Southern:Cuisine("southern")
    object Greek:Cuisine("greek")
    object German:Cuisine("german")
    object Nordic:Cuisine("nordic")
    object EasternEuropean:Cuisine("eastern european")
    object Caribbean:Cuisine("caribbean")
    object LatinAmerican:Cuisine("latin american")
}

sealed class Diet(val value: String){
    object Pescetarian:Diet("pescetarian")
    object LactoVegetarian:Diet("lacto vegetarian")
    object OnoVegetarian:Diet("ono vegetarian")
    object Vegetarian:Diet("vegetarian")
    object Vegan:Diet("vegan")
}

sealed class DishType(val value: String){
    object MainCourse:DishType("main course")
    object SideDish:DishType("side dish")
    object Dessert:DishType("dessert")
    object Appetizer:DishType("appetizer")
    object Salad:DishType("salad")
    object Bread:DishType("bread")
    object Breakfast:DishType("breakfast")
    object Soup:DishType("soup")
    object Beverage:DishType("beverage")
    object Sauce:DishType("sauce")
    object Drink:DishType("drink")
}