import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BioScreen2() {

    val name = "Irah Christine B. Brutas"
    val section = "3IT-A"
    val age = "21"

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Name: $name")
        Text(text = "Section: $section")
        Text(text = "Age: $age")
    }
}