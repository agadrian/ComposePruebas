import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
                    .background(Color.Blue)
                    .align(Alignment.Center)


            )
        }
    }

    @Preview
    @Composable
    fun ej2() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray),
            contentAlignment = Alignment.Center

        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(200.dp, 250.dp)
                    .padding(30.dp)
                    .background(Color.Blue)


            ) {
                Text(
                    "Ejemplo de uso  contendeor Box",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(bottom = 20.dp)
                        .align(Alignment.BottomCenter)
                )
            }
        }
    }


    @Preview
    @Composable
    fun ej3() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray),
            contentAlignment = Alignment.Center

        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()

            ) {
                Box(

                    modifier = Modifier
                        .fillMaxWidth(0.3f)
                        .background(color = Color.Red)
                        .height(120.dp)
                        .weight(0.2f)
                        .align(Alignment.CenterHorizontally)
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.3f)
                        .background(color = Color.Gray)
                        .height(180.dp)
                        .weight(0.4f)
                        .align(Alignment.CenterHorizontally)
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.3f)
                        .background(color = Color.Blue)
                        .height(120.dp)
                        .weight(0.4f)
                        .align(Alignment.CenterHorizontally)
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.3f)
                        .background(color = Color.Green)
                        .height(120.dp)
                        .weight(0.2f)
                        .align(Alignment.CenterHorizontally)
                )
            }

        }
    }

    @Preview
    @Composable
    fun ej4() {
        val bordeRojo = Color.Red
        val bordeAzul = Color.Blue
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray),
            contentAlignment = Alignment.BottomStart,



        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Box(

                    modifier = Modifier
                        .size(100.dp, 300.dp)
                        .height(120.dp)
                        .align(Alignment.Bottom)
                        .border(2.dp, bordeRojo)
                ){
                    Text(
                        "Ejemplo 1",
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .padding(top = 5.dp)
                    )
                }

                Box(
                    modifier = Modifier
                        .size(100.dp, 200.dp)
                        .height(120.dp)
                        .align(Alignment.Bottom)
                        .border(2.dp, bordeAzul)
                ){
                    Text(
                        "Ejemplo 2",
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .padding(top = 5.dp)
                    )
                }

                Box(
                    modifier = Modifier
                        .size(100.dp, 100.dp)
                        .height(120.dp)
                        .align(Alignment.Bottom)
                        .border(2.dp, bordeRojo)
                ){
                    Text(
                        "Ejemplo 3",
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .padding(top = 5.dp)
                    )
                }

                Box(
                    modifier = Modifier
                        .size(100.dp, 25.dp)
                        .height(120.dp)
                        .align(Alignment.Bottom)
                        .border(2.dp, bordeAzul)
                ){
                    Text(
                        "Ejemplo 4",
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .padding(top = 5.dp)
                    )
                }
            }

        }
    }
}