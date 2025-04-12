/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.text.BoringLayout$Metrics
 *  android.text.Layout
 *  android.text.Spanned
 *  android.text.TextDirectionHeuristic
 *  android.text.TextPaint
 */
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

public final class Ip1 {
    public final CharSequence a;
    public final TextPaint b;
    public final int c;
    public float d;
    public float e;
    public BoringLayout.Metrics f;
    public boolean g;

    public Ip1(CharSequence charSequence, TextPaint textPaint, int n3) {
        float f5;
        this.a = charSequence;
        this.b = textPaint;
        this.c = n3;
        this.d = f5 = 0.0f / 0.0f;
        this.e = f5;
    }

    public final BoringLayout.Metrics a() {
        int n3 = this.g;
        if (n3 == 0) {
            n3 = this.c;
            TextDirectionHeuristic textDirectionHeuristic = Wl3.a(n3);
            int n4 = Build.VERSION.SDK_INT;
            int n7 = 33;
            CharSequence charSequence = this.a;
            TextPaint textPaint = this.b;
            textDirectionHeuristic = n4 >= n7 ? sz.b(charSequence, textPaint, textDirectionHeuristic) : tz.b(charSequence, textPaint, textDirectionHeuristic);
            this.f = textDirectionHeuristic;
            n3 = 1;
            this.g = n3;
        }
        return this.f;
    }

    public final float b() {
        float f5 = this.d;
        int n3 = Float.isNaN(f5);
        if (n3 == 0) {
            f5 = this.d;
        } else {
            float f6;
            float f7;
            float f8;
            boolean bl2;
            Class clazz;
            float f11;
            BoringLayout.Metrics metrics = this.a();
            if (metrics != null) {
                n3 = metrics.width;
            } else {
                n3 = -1;
                f5 = 0.0f / 0.0f;
            }
            f5 = n3;
            TextPaint textPaint = this.b;
            CharSequence charSequence = this.a;
            float f12 = f5 - 0.0f;
            float f14 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
            if (f14 < 0) {
                n3 = 0;
                metrics = null;
                f14 = charSequence.length();
                double d2 = Math.ceil(Layout.getDesiredWidth((CharSequence)charSequence, (int)0, (int)f14, (TextPaint)textPaint));
                f5 = (float)d2;
            }
            if ((f14 = (f11 = f5 - 0.0f) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1)) != false && ((f14 = (float)(charSequence instanceof Spanned)) != false && ((f14 = (float)ki2_2.b((Spanned)(charSequence = (Spanned)charSequence), clazz = bu1_0.class)) != false || (bl2 = ki2_2.b((Spanned)charSequence, clazz = au1_0.class))) || (f8 = (f7 = (f6 = textPaint.getLetterSpacing()) - 0.0f) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) != false)) {
                f8 = 0x3F000000;
                f6 = 0.5f;
                f5 += f6;
            }
            this.d = f5;
        }
        return f5;
    }
}

