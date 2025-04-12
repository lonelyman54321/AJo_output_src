/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Layout$Alignment
 *  android.text.StaticLayout
 *  android.text.StaticLayout$Builder
 *  android.text.TextPaint
 *  android.widget.TextView
 */
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

public final class Cn$a {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int n3, int n4, TextView textView, TextPaint textPaint, Cn$d cn$d) {
        int n7 = charSequence.length();
        charSequence = StaticLayout.Builder.obtain((CharSequence)charSequence, (int)0, (int)n7, (TextPaint)textPaint, (int)n3);
        alignment = charSequence.setAlignment(alignment);
        float f5 = textView.getLineSpacingExtra();
        float f6 = textView.getLineSpacingMultiplier();
        alignment = alignment.setLineSpacing(f5, f6);
        n3 = textView.getIncludeFontPadding() ? 1 : 0;
        alignment = alignment.setIncludePad(n3 != 0);
        n3 = textView.getBreakStrategy();
        alignment = alignment.setBreakStrategy(n3);
        n3 = textView.getHyphenationFrequency();
        alignment = alignment.setHyphenationFrequency(n3);
        n3 = -1;
        f5 = 0.0f / 0.0f;
        if (n4 == n3) {
            n4 = -1 >>> 1;
        }
        alignment.setMaxLines(n4);
        try {
            cn$d.a((StaticLayout.Builder)charSequence, textView);
        }
        catch (ClassCastException classCastException) {
            return charSequence.build();
        }
        return charSequence.build();
    }
}

