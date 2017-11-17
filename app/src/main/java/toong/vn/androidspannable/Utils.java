package toong.vn.androidspannable;

import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;

/**
 * Created by PhanVanLinh on 16/11/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class Utils {

    public static void setColorForPath(Spannable spannable, String[] paths, int color) {
        for (int i = 0; i < paths.length; i++) {
            int indexOfPath = spannable.toString().indexOf(paths[i]);
            if (indexOfPath == -1) {
                return;
            }
            spannable.setSpan(new ForegroundColorSpan(color), indexOfPath,
                    indexOfPath + paths[i].length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
    }

public static void setFontSizeForPath(Spannable spannable, String path, int fontSizeInPixel) {
    int startIndexOfPath = spannable.toString().indexOf(path);
    spannable.setSpan(new AbsoluteSizeSpan(fontSizeInPixel), startIndexOfPath,
            startIndexOfPath + path.length(), 0);
}

    public static void increaseFontSizeForPath(Spannable spannable, String path,
            float increaseTime) {
        int startIndexOfPath = spannable.toString().indexOf(path);
        spannable.setSpan(new RelativeSizeSpan(increaseTime), startIndexOfPath,
                startIndexOfPath + path.length(), 0);
    }
}
