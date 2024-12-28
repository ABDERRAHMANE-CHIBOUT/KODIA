package com.koDea.fixMasterClient.presentation.booking.Jobs
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.koDea.fixMasterClient.util.navigation.Route
import java.util.Calendar

data class Job(
    var id: String = "",
    val category: String = "",
    val city: String = "",
    val day: String = "",
    val description: String = "",
    val hour: String = "",
    val max: Int = 0,
    val min: Int = 0,
    val status: String = "",
    val street: String = "",
    val title: String = "",
    val userId: String = "",
    val wilya: String = "",
)


@Composable
fun JobCard(job: Job,navHostController: NavHostController) {
    ElevatedCard(
        modifier = Modifier
            .padding(vertical = 8.dp, horizontal = 16.dp)
            .clickable {
                //navHostController.navigate(Screen.JobsDetails.route + "/${job.id}")
                navHostController.navigate(Route.JobDetailsScreen.route +"/${job.id}")
            },
        shape = MaterialTheme.shapes.medium,
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                val calendar = Calendar.getInstance()
                val year = calendar.get(Calendar.YEAR)
                val month = calendar.get(Calendar.MONTH) + 1
                val day = calendar.get(Calendar.DAY_OF_MONTH)
                val formattedDate = String.format("%02d/%02d/%04d", day, month, year)

                Text(
                    text = "Posted: ${formattedDate}",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
                )
                Text(
                    text = job.category,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = job.title,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onSurface,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "${job.city}, ${job.wilya}",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurface,
                maxLines = 3,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Budget: ${job.min} - ${job.max} DA",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}


