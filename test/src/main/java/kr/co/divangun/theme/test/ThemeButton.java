package kr.co.divangun.theme.test;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by Alpaca on 2015. 2. 10..
 */
public class ThemeButton extends Button {
    public ThemeButton(Context context) {
        super(context);
    }

    public ThemeButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        initButton(context,attrs);
    }

    public ThemeButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void initButton(Context context, AttributeSet attrs){
        int mColorId = context.obtainStyledAttributes(attrs, R.styleable.CustomTheme).getResourceId(R.styleable.CustomTheme_textColor, -1);
        int mBackgroundId = context.obtainStyledAttributes(attrs, R.styleable.CustomTheme).getResourceId(R.styleable.CustomTheme_backgroundColor, -1);

        int primaryId = context.getResources().getIdentifier("colorPrimary", "color", context.getPackageName());
        int secondaryId = context.getResources().getIdentifier("colorSecondary", "color", context.getPackageName());

        if(primaryId == mColorId){
            setTextColor(Color.BLUE);
        }

        if(secondaryId == mColorId){
            setTextColor(Color.GREEN);
        }

        if(primaryId == mBackgroundId) {
//            setBackgroundColor(Color.BLUE);
            getBackground().setColorFilter(new PorterDuffColorFilter(Color.RED, PorterDuff.Mode.SRC_IN));
        }
        else if(secondaryId == mBackgroundId){
//            setBackgroundColor(Color.GREEN);
            getBackground().setColorFilter(new PorterDuffColorFilter(Color.RED, PorterDuff.Mode.SRC_IN));
        }
    }
}
