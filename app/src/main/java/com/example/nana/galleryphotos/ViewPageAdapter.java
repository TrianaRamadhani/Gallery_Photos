package com.example.nana.galleryphotos;

/**
 * Created by N A N A on 2018/05/01.
 */

    import android.content.Context;
    import android.support.v4.view.PagerAdapter;
    import android.support.v4.view.ScrollingView;
    import android.support.v4.view.ViewPager;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.ImageView;
    import android.widget.ScrollView;
    import android.widget.TextView;

class ViewPagerAdapter extends PagerAdapter {

    Context context;

    int[] flag;
    String[] judul;
    String[] keterangan;
    LayoutInflater inflater;

    public ViewPagerAdapter(Context context, String[] judul, String[] keterangan, int[] flag) {
        this.context = context;
        this.judul = judul;
        this.keterangan = keterangan;
        this.flag = flag;

    }

    @Override
    public int getCount() {
        return flag.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((ScrollView) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        TextView teksJudul;
        TextView teksKeterangan;

        ImageView imgflag;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.galeri_item, container, false);


        teksJudul = (TextView) itemView.findViewById(R.id.textView);
        teksKeterangan = (TextView) itemView.findViewById(R.id.textView2);
        teksJudul.setText(judul[position]);
        teksKeterangan.setText(keterangan[position]);

        imgflag = (ImageView) itemView.findViewById(R.id.imgItem);
        imgflag.setImageResource(flag[position]);

        ((ViewPager) container).addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ScrollView) object);
    }
}
