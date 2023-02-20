package androidx.compose.samples.crane.util

import android.os.Bundle
import androidx.compose.runtime.Composable
import androidx.compose.samples.crane.CraneApplication
import androidx.compose.samples.crane.ViewModelFactory
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSavedStateRegistryOwner

@Composable
fun getViewModelFactory(defaultArgs: Bundle? = null): ViewModelFactory {
    val repository = (LocalContext.current.applicationContext as CraneApplication).destinationRepository
    return ViewModelFactory(repository, LocalSavedStateRegistryOwner.current, defaultArgs)
}