import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

class Ejercicios {
    @Preview
    @Composable
    fun ej1() {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier.size(height = 50.dp, width = 50.dp)
                    .background(Color.Red)
                    .align(Alignment.Center)


            )
        }
    }

    @Preview
    @Composable
    fun ej2() {
        Box(
            modifier = Modifier.fillMaxSize().background(Color.LightGray)
        ) {
            Box(
                modifier = Modifier.size(height = 100.dp, width = 120.dp)
                    .background(Color.Red)
                    .align(Alignment.Center)
            )
            Text("Hola klk", textAlign = TextAlign.Center)

        }
    }
}