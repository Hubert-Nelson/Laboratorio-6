package com.example.menus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.rounded.Dashboard
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.menus.ui.theme.MenusTheme
import androidx.compose.material.icons.rounded.Dashboard
import androidx.compose.material.icons.filled.DeleteForever

import androidx.compose.material.icons.rounded.*


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MenusTheme {
                AppNavigation()
            }
        }
    }
}

object Destinations {
    const val HOME_ROUTE = "inicio"
    const val PROFILE_ROUTE = "mi_perfil"
    const val SETTINGS_ROUTE = "configuracion"
    const val DASHBOARD_ROUTE = "tablero"
    const val FAVORITES_ROUTE = "favoritos"
    const val REMOVE_ROUTE = "eliminar"
}


@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Destinations.HOME_ROUTE) {
        composable(Destinations.HOME_ROUTE) { HomeScreen(navController) }
        composable(Destinations.PROFILE_ROUTE) { UserProfileScreen(navController) }
        composable(Destinations.SETTINGS_ROUTE) { SettingsScreen(navController) }
        composable(Destinations.DASHBOARD_ROUTE) { DashboardScreen(navController) }
        composable(Destinations.FAVORITES_ROUTE) { FavoritesScreen(navController) }
        composable(Destinations.REMOVE_ROUTE) { RemoveScreen(navController) }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RemoveScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Eliminar Elementos") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Volver")
                    }
                }
            )
        },
        content = { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
                    .padding(20.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Pantalla para eliminar elementos.", fontSize = 20.sp)
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavoritesScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Mis Favoritos") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Volver")
                    }
                }
            )
        },
        content = { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Aquí puedes ver tus elementos favoritos.")
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Panel de Control") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Volver")
                    }
                }
            )
        },
        content = { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Bienvenido al tablero principal.")
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Ajustes de la Aplicación") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Volver")
                    }
                }
            )
        },
        content = { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Personaliza tu experiencia aquí.")
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserProfileScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Perfil de Usuario") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Volver")
                    }
                }
            )
        },
        content = { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Información detallada de tu perfil.")
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    var clickCount by remember { mutableStateOf(0) }
    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = {  }) {
                        Icon(
                            Icons.Rounded.Menu,
                            contentDescription = "Menú lateral",
                            tint = MaterialTheme.colorScheme.primary
                        )
                    }
                },
                title = {
                    Text(
                        "Mi Aplicación Personal",
                        style = MaterialTheme.typography.titleLarge,
                        color = MaterialTheme.colorScheme.onPrimaryContainer
                    )
                },
                actions = {
                    IconButton(onClick = {  }) {
                        Icon(
                            Icons.Rounded.Search,
                            contentDescription = "Buscar contenido",
                            tint = MaterialTheme.colorScheme.primary
                        )
                    }
                    IconButton(onClick = {
                        navController.navigate(Destinations.PROFILE_ROUTE)
                    }) {
                        Icon(
                            Icons.Outlined.AccountCircle,
                            contentDescription = "Ver perfil",
                            tint = MaterialTheme.colorScheme.primary
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            )
        },
        bottomBar = { CustomBottomBar(navController) },
        floatingActionButton = { CustomFAB { clickCount++ } },
        content = { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
                    .padding(24.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Botón presionado $clickCount veces",
                    fontSize = 32.sp,
                    color = MaterialTheme.colorScheme.secondary,
                    modifier = Modifier.padding(bottom = 20.dp)
                )
                CustomAppContent(padding)
            }
        }
    )
}

@Composable
fun CustomBottomBar(navController: NavController) {
    BottomAppBar(
        containerColor = MaterialTheme.colorScheme.primaryContainer
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { navController.navigate(Destinations.HOME_ROUTE) }) {
                Icon(
                    Icons.Filled.Home,
                    contentDescription = "Inicio Principal",
                    tint = MaterialTheme.colorScheme.onPrimaryContainer
                )
            }
            IconButton(onClick = { navController.navigate(Destinations.SETTINGS_ROUTE) }) {
                Icon(
                    Icons.Rounded.Settings,
                    contentDescription = "Configuración",
                    tint = MaterialTheme.colorScheme.onPrimaryContainer
                )
            }
            IconButton(onClick = { navController.navigate(Destinations.DASHBOARD_ROUTE) }) {
                Icon(
                    Icons.Rounded.Dashboard,
                    contentDescription = "Tablero",
                    tint = MaterialTheme.colorScheme.onPrimaryContainer
                )
            }
            IconButton(onClick = { navController.navigate(Destinations.FAVORITES_ROUTE) }) {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = "Mis Favoritos",
                    tint = MaterialTheme.colorScheme.onPrimaryContainer
                )
            }
            IconButton(onClick = { navController.navigate(Destinations.REMOVE_ROUTE) }) {
                Icon(
                    Icons.Filled.DeleteForever,
                    contentDescription = "Eliminar Elementos",
                    tint = MaterialTheme.colorScheme.onPrimaryContainer
                )
            }
        }
    }
}

@Composable
fun CustomFAB(onClick: () -> Unit) {
    FloatingActionButton(
        onClick = { onClick() },
        containerColor = MaterialTheme.colorScheme.tertiary,
        content = {
            Text(
                fontSize = 28.sp,
                text = "+",
                color = MaterialTheme.colorScheme.onTertiary
            )
        }
    )
}

@Composable
fun CustomAppContent(padding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Bienvenido a tu aplicación personalizada.\nExplora las opciones de arriba y abajo.",
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MenusTheme {
        AppNavigation()
    }
}