package androidx.compose.samples.crane.data

import javax.inject.Inject
import javax.inject.Singleton
private const val DEFAULT_IMAGE_WIDTH = "250"
/**
 * Annotated with Singleton as the class created a lot of objects.
 */
@Singleton
class DestinationsLocalDataSource @Inject constructor() {

    val craneRestaurants = listOf(
        ExploreModel(
            city = NAPLES,
            description = "1286 Restaurants",
            imageUrl = "https://images.unsplash.com/photo-1534308983496-4fabb1a015ee?ixlib=rb-1.2.1&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        )
    )

    val craneHotels = listOf(
        ExploreModel(
            city = MALDIVAS,
            description = "1286 Available Properties",
            imageUrl = "https://images.unsplash.com/photo-1520250497591-112f2f40a3f4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        )
    )

    val craneDestinations = listOf(
        ExploreModel(
            city = KHUMBUVALLEY,
            description = "Nonstop - 5h 16m+",
            imageUrl = "https://images.unsplash.com/photo-1544735716-392fe2489ffa?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        )
    )
}