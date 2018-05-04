package com.example.nana.galleryphotos;

    import android.app.Activity;
    import android.support.v4.view.PagerAdapter;
    import android.support.v4.view.ViewPager;
    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.View;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    PagerAdapter adapter;
    String[] judul;
    String[] keterangan;
    int[] gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        judul = new String[]{
                "UTS Mobile Programming", "Doraemon", "Nobita", "Shizuka", "Takeshi Giant", "Suneo", "Dorami", "Doraemon dan Kawannya", "Thanks"
        };

        keterangan = new String[] {

                "Monggo Di Slide Right utowo geser ke kanan hehe",
                "Doraemon adalah robot kucing berwarna biru , berasal dari abad ke-22 , pergi ke abad ke-20 untuk menolong Nobita ",
                "Nobita adalah seorang yang gagal jika Doraemon tidak datang dari masa depan untuk membantu dia agar dia bisa memiliki masa depan yang lebih baik",
                "Shizuka adalah teman sekelas Nobita dan temannya sejak kecil. Ia rajin, baik, manis dan aktif",
                "Giant memiliki badan besar, Giant mudah marah dan suka melakukan kekerasan atau paksaan apabila permintaannya tak dituruti , atau ada yang mengejeknya",
                "Suneo adalah seorang anak orang kaya , akibatnya ia sering memamerkan barang pada teman -temannya , yang membuat teman-temannya iri",
                "Dorami adalah adik Doraemon. Dia berwarna kuning dan memiliki telinga yang menyerupai pita merah besar",
                "Doramon adalah judul sebuah manga dan anime yang sangat populer yang dikarang Fujiko F.sejak 1 Juni 1969 dan berkisah tentang kehidupan seorang anak pemalas kelas 5 sekolah dasar yang bernama Nobi Nobita ",
                "Byeeeeeeeeeeee"

        };

        gambar = new int[] {
                R.drawable.hh, R.drawable.aa1, R.drawable.bb2, R.drawable.cc3, R.drawable.dd4, R.drawable.ee5, R.drawable.ff6, R.drawable.gg7, R.drawable.th
        };
        getSupportActionBar().setTitle("Gallery Photos");
        getSupportActionBar().setSubtitle("By Triana 15670020 ");

        viewPager = (ViewPager) findViewById(R.id.pager);
        adapter = new ViewPagerAdapter(MainActivity.this,judul,keterangan,gambar);
        viewPager.setAdapter(adapter);
    }
}