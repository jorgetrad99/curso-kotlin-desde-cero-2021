fun main(args: Array<String>) {
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi Mi A3")
        .run {
            removeIf { movil -> movil.contains("Google") }
            this
        }
    println(moviles)
}