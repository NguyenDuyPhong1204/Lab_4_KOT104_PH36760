data class Movie(
    val title: String,
    val year: String,
    val posterUrl: String,
    val duration: String,
    val releaseDate: String,
    val type: String,
    val shotDescription: String
) {
    companion object {
        fun getSampleMovies(): List<Movie> = listOf(
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
    }
}