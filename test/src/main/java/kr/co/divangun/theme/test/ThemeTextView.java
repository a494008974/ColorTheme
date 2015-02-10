package kr.co.divangun.theme.test;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.TextView;

public class ThemeTextView extends TextView {

    public ThemeTextView(Context context) {
        super(context);
    }

    public ThemeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        int mColorId = context.obtainStyledAttributes(attrs, R.styleable.CustomTheme).getResourceId(R.styleable.CustomTheme_textColor, -1);

        int primaryId = context.getResources().getIdentifier("colorPrimary", "color", context.getPackageName());
        int secondaryId = context.getResources().getIdentifier("colorSecondary", "color", context.getPackageName());

        if(primaryId == mColorId){
            setTextColor(Color.BLUE);
        }

        if(secondaryId == mColorId){
            setTextColor(Color.GREEN);
        }
    }

    public ThemeTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
