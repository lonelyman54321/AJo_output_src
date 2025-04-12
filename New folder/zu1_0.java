/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint$FontMetricsInt
 *  android.text.style.LineHeightSpan
 */
import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/*
 * Renamed from zu1
 */
public final class zu1_0
implements LineHeightSpan {
    public final float a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;

    public zu1_0(float f5, int n3, boolean bl2, boolean bl3, float f6) {
        float f7;
        float f8;
        int n4;
        this.a = f5;
        this.b = 0;
        this.c = n3;
        this.d = bl2;
        this.e = bl3;
        this.f = f6;
        this.g = n4 = -1 << -1;
        this.h = n4;
        this.i = n4;
        this.j = n4;
        f5 = 0.0f;
        IllegalStateException illegalStateException = null;
        float f11 = 0.0f - f6;
        n4 = (int)(f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1));
        if (n4 <= 0 && (n4 = (int)((f8 = f6 - (f5 = 1.0f)) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1))) <= 0 || (n4 = (int)((f7 = f6 - (f5 = -1.0f)) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1))) == 0) {
            return;
        }
        String string2 = "topRatio should be in [0..1] range or -1".toString();
        illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void chooseHeight(CharSequence charSequence, int n3, int n4, int n7, int n8, Paint.FontMetricsInt fontMetricsInt) {
        int n10 = fontMetricsInt.descent;
        n7 = fontMetricsInt.ascent;
        n8 = n10 - n7;
        if (n8 <= 0) {
            return;
        }
        n8 = this.b;
        boolean bl2 = false;
        int n14 = 1;
        float f5 = Float.MIN_VALUE;
        n3 = n3 == n8 ? 1 : 0;
        n8 = this.c;
        if (n4 == n8) {
            bl2 = true;
        }
        n4 = (int)(this.e ? 1 : 0);
        n8 = (int)(this.d ? 1 : 0);
        if (n3 != 0 && bl2 && n8 != 0 && n4 != 0) {
            return;
        }
        n14 = this.g;
        int n15 = -1 << -1;
        float f6 = -0.0f;
        if (n14 == n15) {
            float f7;
            n10 -= n7;
            double d2 = Math.ceil(this.a);
            float f8 = (float)d2;
            n7 = (int)f8;
            n10 = n7 - n10;
            f6 = this.f;
            f5 = -1.0f;
            float f11 = f6 - f5;
            n14 = (int)(f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1));
            if (n14 == 0) {
                n14 = fontMetricsInt.ascent;
                f5 = Math.abs((float)n14);
                n15 = fontMetricsInt.descent;
                int n16 = fontMetricsInt.ascent;
                f6 = n15 -= n16;
                f6 = f5 / f6;
            }
            if (n10 <= 0) {
                f7 = (float)n10 * f6;
                d2 = Math.ceil(f7);
            } else {
                f7 = n10;
                n14 = 1065353216;
                f5 = (1.0f - f6) * f7;
                d2 = Math.ceil(f5);
            }
            f7 = (float)d2;
            n10 = (int)f7;
            n14 = fontMetricsInt.descent;
            this.i = n10 += n14;
            this.h = n7 = n10 - n7;
            if (n8 != 0) {
                n7 = fontMetricsInt.ascent;
            }
            this.g = n7;
            if (n4 != 0) {
                n10 = n14;
            }
            this.j = n10;
            this.k = n4 = fontMetricsInt.ascent - n7;
            this.l = n10 -= n14;
        }
        n10 = n3 != 0 ? this.g : this.h;
        fontMetricsInt.ascent = n10;
        n10 = bl2 ? this.j : this.i;
        fontMetricsInt.descent = n10;
    }
}

