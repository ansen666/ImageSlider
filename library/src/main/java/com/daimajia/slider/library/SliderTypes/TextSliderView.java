package com.daimajia.slider.library.SliderTypes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.slider.library.R;

/**
 * This is a slider with a description TextView.
 */
public class TextSliderView extends BaseSliderView{
    public TextSliderView(Context context) {
        super(context);
    }

    @Override
    public View getView() {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.render_type_text,null);
        ImageView target = v.findViewById(R.id.daimajia_slider_image);

        TextView description = v.findViewById(R.id.description);
        description.setText(getDescription());
        v.findViewById(R.id.description_layout).setVisibility(View.INVISIBLE);
        bindEventAndShow(v, target);
        return v;
    }
}
