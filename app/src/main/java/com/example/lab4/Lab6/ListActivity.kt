package com.example.lab4.Lab6

import Movie
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.example.lab4.Lab6.Model.Entities.Screen
import com.example.lab4.R

class ListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
//            val listMovie = listOf(
//                Movie(
//                    "KungfuPanda",
//                    "2014",
//                    "https://cloudcdnvod.tek4tv.vn/Mam/attach/upload/29022024144444/144441_4__khung_tron_phai.jpg",
//                    "1:20:00",
//                    "10/7/2015",
//                    "Hoạt hình",
//                    "Kung Fu Panda xoay quanh Po, một chú gấu trúc làm việc trong tiệm mì của cha mình, ông Ping. Po có niềm đam mê mãnh liệt với Kung Fu và ngưỡng mộ Ngũ Đại Hiệp (Furious Five), một nhóm võ sĩ tài ba. Cuộc sống của Po thay đổi hoàn toàn khi anh được chọn là \"Chiến binh Rồng\" (Dragon Warrior), người được tiên tri sẽ bảo vệ Thung lũng Bình yên (Valley of Peace) khỏi các mối đe dọa."
//                ),
//                Movie(
//                    "Doraemon",
//                    "2014",
//                    "https://baodongnai.com.vn/file/e7837c02876411cd0187645a2551379f/052024/18_2_20240523155958.jpg",
//                    "1:20:00",
//                    "10/7/2015",
//                    "Hoạt hình",
//                    "Doraemon, một chú mèo máy màu xanh đến từ thế kỷ 22, được gửi về quá khứ để giúp đỡ Nobita Nobi, một cậu bé học sinh tiểu học vụng về và thường gặp rắc rối. Nhiệm vụ của Doraemon là giúp Nobita thay đổi số phận của mình, trở thành một người thành công và hạnh phúc, từ đó cải thiện tương lai của hậu duệ Nobita."
//                ),
//                Movie(
//                    "Conan",
//                    "2014",
//                    "https://phunuvietnam.mediacdn.vn/179072216278405120/2022/11/4/edogawa-conan--166754179290680712885.jpg",
//                    "1:20:00",
//                    "10/7/2015",
//                    "Hoạt hình",
//                    "Thám tử lừng danh Conan xoay quanh Shinichi Kudo, một thám tử học sinh trung học tài giỏi. Trong một lần điều tra một vụ án, cậu bị hai kẻ áo đen bí ẩn ép uống một loại thuốc độc khiến cơ thể bị thu nhỏ lại và trở thành một cậu bé tiểu học. Để che giấu danh tính và điều tra tổ chức đứng sau loại thuốc độc, Shinichi lấy tên là Conan Edogawa và sống nhờ tại nhà của bạn gái mình, Ran Mouri, có cha là thám tử tư Kogoro Mouri."
//                ),
//                Movie(
//                    "Dragon Ball",
//                    "2014",
//                    "https://upload.wikimedia.org/wikipedia/vi/4/4f/Dragon_Ball_Super_artwork.jpg",
//                    "1:20:00",
//                    "10/7/2015",
//                    "Hoạt hình",
//                    "Dragon Ball kể về cuộc phiêu lưu của Son Goku, một cậu bé với sức mạnh phi thường và đuôi khỉ, khi cậu lớn lên và tìm kiếm các viên ngọc rồng (Dragon Balls). Các viên ngọc rồng này có khả năng triệu hồi rồng thần Shenron, người có thể ban cho người thu thập đủ bảy viên ngọc rồng một điều ước bất kỳ."
//                )
//            )

            MovieScreen(listMovie = Movie.getSampleMovies(), navController = navController)
        }
    }
}

@Composable
fun MovieItem(movie: Movie, type: ListType) {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
    ) {
        Column(
            modifier = Modifier.then(getItemSizeModifier(listType = type))
        ) {
            AsyncImage(
                model = movie.posterUrl,
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .wrapContentHeight()
                    .fillMaxWidth()
            )

            Column(modifier = Modifier.padding(8.dp)) {
                Text(
                    text = movie.title, style =
                    MaterialTheme.typography.titleSmall, maxLines = 2
                )
                BoldValueText(
                    label = "Thời lượng: ", value =
                    movie.duration
                )
                BoldValueText(
                    label = "Khởi chiếu: ", value =
                    movie.releaseDate
                )
            }
        }
    }
}


@Composable
fun MovieScreen(listMovie: List<Movie>, navController: NavController) {
//    val navController = rememberNavController()
    var listType by remember { mutableStateOf(ListType.ROW) }
    Column (modifier = Modifier.clickable {  navController.navigate(Screen.SCREEN1.route)}){
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = { listType = ListType.ROW }) {
                Text("Row")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { listType = ListType.COLUMN }) {
                Text("Column")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { listType = ListType.GRID }) {
                Text("Grid")
            }
        }
        when (listType) {
            ListType.ROW -> MovieRow(listMovie)
            ListType.COLUMN -> MovieColumn(listMovie)
            ListType.GRID -> MovieGrid(listMovie)
        }
    }

}

@Composable
fun MovieRow(listMovie: List<Movie>) {

    LazyRow(
        state = rememberLazyListState(),
        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(listMovie.size) { index ->
            MovieItem(movie = listMovie[index], type = ListType.ROW)
        }
    }
}

@Composable
fun MovieColumn(listMovie: List<Movie>) {

    LazyColumn(
        state = rememberLazyListState(),
        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(listMovie.size) { index ->
            MovieColumnItem(movie = listMovie[index], type = ListType.COLUMN)
        }
    }
}

@Composable
fun MovieGrid(listMovie: List<Movie>) {
    val gridState = rememberLazyStaggeredGridState()

    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(2),
        state = gridState,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalItemSpacing = 8.dp,
        contentPadding = PaddingValues(8.dp)
    ) {
        items(listMovie.size) { index ->
            MovieItem(movie = listMovie[index], type = ListType.GRID)
        }
    }

}


@Composable
fun MovieColumnItem(movie: Movie, type: ListType) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor =
            Color.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation =
            6.dp
        ),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            AsyncImage(
                model = movie.posterUrl,
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .then(getItemSizeModifier(type))
                    .wrapContentHeight()
            )
            Column(
                modifier = Modifier.padding(8.dp)
            ) {
                Text(
                    text = movie.title,
                    style = MaterialTheme.typography.titleSmall,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                BoldValueText(
                    label = "Thời lượng: ", value =
                    movie.duration
                )
                BoldValueText(
                    label = "Khởi chiếu: ", value =
                    movie.releaseDate
                )
                BoldValueText(label = "Thể loại: ", value = movie.type)
                Text(
                    text = "Tóm tắt nội dung",
                    style = MaterialTheme.typography.bodySmall,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(
                        top = 4.dp, bottom =
                        2.dp
                    )
                )
                Text(
                    text = movie.shotDescription,
                    style = MaterialTheme.typography.bodySmall,
                    maxLines = 5,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(end = 2.dp)
                )
            }
        }
    }
}

@Composable
fun BoldValueText(
    label: String, value: String, style: TextStyle =
        MaterialTheme.typography.bodySmall
) {
    Text(buildAnnotatedString {
        append(label)
        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
            append(value)
        }
    }, style = style)
}


@Composable
private fun getItemSizeModifier(listType: ListType): Modifier {
    return when (listType) {
        ListType.ROW -> Modifier.width(175.dp)
        ListType.COLUMN -> Modifier
            .width(130.dp)

        ListType.GRID -> Modifier
            .fillMaxWidth()
    }
}


val listMovie = listOf(
    Movie(
        "KungfuPanda",
        "2014",
        "https://cloudcdnvod.tek4tv.vn/Mam/attach/upload/29022024144444/144441_4__khung_tron_phai.jpg",
        "1:20:00",
        "10/7/2015",
        "Hoạt hình",
        "Kung Fu Panda xoay quanh Po, một chú gấu trúc làm việc trong tiệm mì của cha mình, ông Ping. Po có niềm đam mê mãnh liệt với Kung Fu và ngưỡng mộ Ngũ Đại Hiệp (Furious Five), một nhóm võ sĩ tài ba. Cuộc sống của Po thay đổi hoàn toàn khi anh được chọn là \"Chiến binh Rồng\" (Dragon Warrior), người được tiên tri sẽ bảo vệ Thung lũng Bình yên (Valley of Peace) khỏi các mối đe dọa."
    ),
    Movie(
        "Doraemon",
        "2014",
        "https://baodongnai.com.vn/file/e7837c02876411cd0187645a2551379f/052024/18_2_20240523155958.jpg",
        "1:20:00",
        "10/7/2015",
        "Hoạt hình",
        "Doraemon, một chú mèo máy màu xanh đến từ thế kỷ 22, được gửi về quá khứ để giúp đỡ Nobita Nobi, một cậu bé học sinh tiểu học vụng về và thường gặp rắc rối. Nhiệm vụ của Doraemon là giúp Nobita thay đổi số phận của mình, trở thành một người thành công và hạnh phúc, từ đó cải thiện tương lai của hậu duệ Nobita."
    ),
    Movie(
        "Conan",
        "2014",
        "https://phunuvietnam.mediacdn.vn/179072216278405120/2022/11/4/edogawa-conan--166754179290680712885.jpg",
        "1:20:00",
        "10/7/2015",
        "Hoạt hình",
        "Thám tử lừng danh Conan xoay quanh Shinichi Kudo, một thám tử học sinh trung học tài giỏi. Trong một lần điều tra một vụ án, cậu bị hai kẻ áo đen bí ẩn ép uống một loại thuốc độc khiến cơ thể bị thu nhỏ lại và trở thành một cậu bé tiểu học. Để che giấu danh tính và điều tra tổ chức đứng sau loại thuốc độc, Shinichi lấy tên là Conan Edogawa và sống nhờ tại nhà của bạn gái mình, Ran Mouri, có cha là thám tử tư Kogoro Mouri."
    ),
    Movie(
        "Dragon Ball",
        "2014",
        "https://upload.wikimedia.org/wikipedia/vi/4/4f/Dragon_Ball_Super_artwork.jpg",
        "1:20:00",
        "10/7/2015",
        "Hoạt hình",
        "Dragon Ball kể về cuộc phiêu lưu của Son Goku, một cậu bé với sức mạnh phi thường và đuôi khỉ, khi cậu lớn lên và tìm kiếm các viên ngọc rồng (Dragon Balls). Các viên ngọc rồng này có khả năng triệu hồi rồng thần Shenron, người có thể ban cho người thu thập đủ bảy viên ngọc rồng một điều ước bất kỳ."
    )
)


@Preview(showBackground = true)
@Composable
fun PreviewMovie() {
//    MovieScreen(listMovie = listMovie, navController = n)
}

