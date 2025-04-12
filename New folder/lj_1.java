/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextPaint
 */
import android.text.TextPaint;

/*
 * Renamed from lj
 */
public final class lj_1 {
    public static final int a(int n3, CharSequence charSequence) {
        int n4 = charSequence.length();
        while (n3 < n4) {
            char c2;
            char c3 = charSequence.charAt(n3);
            if (c3 == (c2 = '\n')) {
                return n3;
            }
            ++n3;
        }
        return charSequence.length();
    }

    public static final int b(int n3, CharSequence charSequence) {
        while (n3 > 0) {
            int n4;
            int n7 = n3 + -1;
            if ((n7 = (int)charSequence.charAt(n7)) == (n4 = 10)) {
                return n3;
            }
            n3 += -1;
        }
        return 0;
    }

    public static final void c(TextPaint textPaint, float f5) {
        int n3 = Float.isNaN(f5);
        if (n3 == 0) {
            int n4;
            n3 = 0;
            float f6 = 0.0f;
            float f7 = f5 - 0.0f;
            Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
            if (object < 0) {
                n4 = 0;
                f5 = 0.0f;
            }
            n3 = 1065353216;
            f6 = 1.0f;
            float f8 = f5 - f6;
            object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
            if (object > 0) {
                n4 = 1065353216;
                f5 = 1.0f;
            }
            n3 = 255;
            f6 = n3;
            n4 = Math.round(f5 *= f6);
            textPaint.setAlpha(n4);
        }
    }
}

