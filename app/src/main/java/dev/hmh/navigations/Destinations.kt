package dev.hmh.navigations

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

sealed class Destinations(val route: String) {
    object Home : Destinations("home_screen")

    //object Detail : Destinations("detail_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY2}")
    object Detail :
        Destinations("detail_screen?$DETAIL_ARGUMENT_KEY={$DETAIL_ARGUMENT_KEY}&$DETAIL_ARGUMENT_KEY2={$DETAIL_ARGUMENT_KEY2}") {
        /*  fun getInt(id: Int = 0): String {
              // return "detail_screen/$id"
              return "detail_screen?$DETAIL_ARGUMENT_KEY2=$id"
          }*/

        fun getNameAndId(
            id: Int=0,
            name: String="MUD"
        ): String {
            return "detail_screen?$DETAIL_ARGUMENT_KEY=$id&$DETAIL_ARGUMENT_KEY2=$name"
        }

        /*fun getInt(id: Int): String {
            // return "detail_screen/$id"
            return this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id.toString())
        }*/

        /* fun getNameAndId(
             id: Int,
             name: String
         ): String {
             return "detail_screen/$id/$name"
         }*/

    }
}
