package br.senai.sp.jandira.editarperfil_sinalibras

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.editarperfil_sinalibras.ui.theme.EditarPerfilSinaLibrasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EditarPerfilSinaLibrasTheme {
                EditarPerfil()
            }
        }
    }
}

@Composable
fun EditarPerfil() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFC7E2FE))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {




        Box(modifier = Modifier
            .fillMaxWidth()
            .height(45.dp)

        ) {

            IconButton(
                onClick = { /* Ação de voltar */ },
                modifier = Modifier.align(Alignment.TopStart)
            ) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Voltar", tint = Color.Black)
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Editar Perfil",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 10.dp)
                    .align(Alignment.TopCenter)
            )
        }



        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color(0xFF58B86E), shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_perfil),
                contentDescription = "Imagem de Perfil",
                modifier = Modifier.size(90.dp)
            )
            Box(
                modifier = Modifier
                    .size(30.dp)
                    .background(Color(0xFF3F51B5), shape = CircleShape)
                    .align(Alignment.BottomEnd)
            ) {
                Icon(
                    Icons.Default.Edit,
                    contentDescription = "Editar",
                    tint = Color.White,
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(
            value = "Abracadabra Souza",
            onValueChange = {},
            label = { Text("Nome") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )

        OutlinedTextField(
            value = "08/17/2023",
            onValueChange = {},
            label = { Text("Data de Nascimento") },
            trailingIcon = {
                Icon(Icons.Default.DateRange, contentDescription = "Selecionar data")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )

        OutlinedTextField(
            value = "abracadabraSouza@gmail.com",
            onValueChange = {},
            label = { Text("Email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )

        Card(
            modifier = Modifier
                .border(
                    width = 2.dp,
                    color = Color(0xFF65558F),
                    shape = RoundedCornerShape(16.dp)
                )
                .background(Color.Transparent)
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .clickable { /* Ação para alterar senha */ },
            shape = RoundedCornerShape(12.dp),



        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Alterar Senha", fontSize = 16.sp, fontWeight = FontWeight.Medium)
                Icon(Icons.Default.ArrowForward, contentDescription = "Alterar Senha")
            }
        }

        Spacer(modifier = Modifier.height(224.dp))


        Button(
            onClick = { /* Ação de salvar */ },
            modifier = Modifier
                .width(412.dp)
                .height(56.dp)
                .padding(horizontal = 32.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3F51B5)),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(
                text = "Salvar Alterações",
                fontSize = 20.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    EditarPerfilSinaLibrasTheme {
        EditarPerfil()
    }
}