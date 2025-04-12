/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.icu.text.DecimalFormatSymbols
 *  android.text.PrecomputedText$Params
 *  android.widget.TextView
 */
import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

public final class Hm3$c {
    public static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static PrecomputedText.Params b(TextView textView) {
        return textView.getTextMetricsParams();
    }

    public static void c(TextView textView, int n3) {
        textView.setFirstBaselineToTopHeight(n3);
    }
}

