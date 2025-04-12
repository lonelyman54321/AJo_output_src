/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.widget.TextView
 */
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.TextView;

public final class Hm3$a {
    public static int a(TextView textView) {
        return textView.getBreakStrategy();
    }

    public static int b(TextView textView) {
        return textView.getHyphenationFrequency();
    }

    public static void c(TextView textView, int n3) {
        textView.setBreakStrategy(n3);
    }

    public static void d(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static void e(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    public static void f(TextView textView, int n3) {
        textView.setHyphenationFrequency(n3);
    }
}

