package com.blankthings.baseapp.navigation

import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import kotlinx.serialization.Serializable

@Serializable
sealed interface Routes {
    @Serializable data object Splash: Routes
    @Serializable data object Login: Routes
    @Serializable data object CreateAccount: Routes
    @Serializable data object ForgotPassword: Routes

    @Serializable data object Authorized: Routes
    @Serializable data object Home: Routes
    @Serializable data object Account: Routes
    @Serializable data object Settings: Routes
}

class NavActions(val navHostController: NavHostController) {
    val navigateToForgotPassword: () -> Unit = {
        navHostController.navigate(Routes.ForgotPassword)
    }

    val navigateToCreateAccount: () -> Unit = {
        navHostController.navigate(Routes.CreateAccount)
    }

    val navigateToLogin: () -> Unit = {
        navHostController.navigate(Routes.Login)
    }

    val navigateToAuthorized: () -> Unit = {
        navHostController.navigate(Routes.Authorized)
    }

    val navigateToHome: () -> Unit = {
        navHostController.navigate(Routes.Home) {
            popUpTo(navHostController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }
    val navigateToAccount: () -> Unit = {
        navHostController.navigate(Routes.Account) {
            popUpTo(navHostController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }
    val navigateToSettings: () -> Unit = {
        navHostController.navigate(Routes.Settings) {
            popUpTo(navHostController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }
}