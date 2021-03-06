/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: SWCook API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.example.swcook.front.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.util.*

/**
 * @property id
 * @property title
 * @property description
 * @property cookingTime
 * @property datePublished
 * @property steps
 * @property ingredients
 */
@JsonClass(generateAdapter = true)
data class Recipe(
    @Json(name = "id") @field:Json(name = "id") var id: UUID,
    @Json(name = "title") @field:Json(name = "title") var title: String,
    @Json(name = "description") @field:Json(name = "description") var description: String,
    @Json(name = "cooking_time") @field:Json(name = "cooking_time") var cookingTime: Int,
    @Json(name = "date_published") @field:Json(name = "date_published") var datePublished: Date? = null,
    @Json(name = "steps") @field:Json(name = "steps") var steps: List<Step>? = null,
    @Json(name = "ingredients") @field:Json(name = "ingredients") var ingredients: List<Ingredient>? = null
)
