package toong.vn.androidspannable;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.text_title);
        TextView textView2 = findViewById(R.id.text_title_2);

        Spannable spannable = new SpannableString("Your big island ADVENTURE");

        Utils.setFontSizeForPath(spannable, "big", (int) textView.getTextSize() + 20);
        Utils.increaseFontSizeForPath(spannable, "big", 3);
        textView.setText(spannable);

        Spannable spannable2 = new SpannableString("Your big island ADVENTURE2");
        Utils.setColorForPath(spannable2, new String[] { "big", "ADVENTURE" }, Color.BLUE);
        textView2.setText(spannable2);
    }
}
