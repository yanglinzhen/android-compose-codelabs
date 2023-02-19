package androidx.compose.samples.crane

import android.content.Context
import androidx.annotation.VisibleForTesting
import androidx.compose.samples.crane.data.DestinationsLocalDataSource
import androidx.compose.samples.crane.data.DestinationsRepository
import androidx.compose.samples.crane.home.MainViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

object ServiceLocator {
    private val lock = Any()
    @Volatile
    var destinationsRepository: DestinationsRepository? = null
        @VisibleForTesting set

    @Volatile
    var ioDispatcher: CoroutineDispatcher = Dispatchers.IO
        @VisibleForTesting set
    fun provideDestinationRepository(context: Context): DestinationsRepository {
        synchronized(lock) {
            return destinationsRepository ?: destinationsRepository ?: createDestinationRepository(context)
        }
    }
    private fun createDestinationRepository(context: Context): DestinationsRepository {
        val newRepo =  DestinationsRepository(DestinationsLocalDataSource())
        destinationsRepository = newRepo
        return newRepo
    }

    fun createMainViewModel(context: Context) = MainViewModel(
        provideDestinationRepository(context),
        ioDispatcher
    )
}