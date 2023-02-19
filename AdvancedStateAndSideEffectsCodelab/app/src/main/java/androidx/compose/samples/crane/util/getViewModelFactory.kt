package androidx.compose.samples.crane.util

import androidx.compose.runtime.Composable
import androidx.compose.samples.crane.CraneApplication
import androidx.compose.samples.crane.ViewModelFactory
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSavedStateRegistryOwner

@Composable
fun getViewModelFactory(): ViewModelFactory {
    val repository = (LocalContext.current.applicationContext as CraneApplication).destinationRepository
    return ViewModelFactory(repository, LocalSavedStateRegistryOwner.current)
}