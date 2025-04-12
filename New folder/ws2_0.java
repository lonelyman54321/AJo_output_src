/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$FontMetricsInt
 *  android.text.style.ReplacementSpan
 */
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ws2
 */
public final class ws2_0
extends ReplacementSpan {
    public final float a;
    public final int b;
    public final float c;
    public final int d;
    public final float e;
    public final int f;
    public Paint.FontMetricsInt g;
    public int h;
    public int i;
    public boolean j;

    public ws2_0(float f5, int n3, float f6, int n4, float f7, int n7) {
        this.a = f5;
        this.b = n3;
        this.c = f6;
        this.d = n4;
        this.e = f7;
        this.f = n7;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fontMetrics");
        return null;
    }

    public final int b() {
        boolean bl2 = this.j;
        if (bl2) {
            return this.i;
        }
        String string2 = "PlaceholderSpan is not laid out yet.".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final int c() {
        boolean bl2 = this.j;
        if (bl2) {
            return this.h;
        }
        String string2 = "PlaceholderSpan is not laid out yet.".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int n3, int n4, float f5, int n7, int n8, int n10, Paint paint) {
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final int getSize(Paint object, CharSequence charSequence, int n3, int n4, Paint.FontMetricsInt fontMetricsInt) {
        void var5_13;
        double d2;
        Paint.FontMetricsInt fontMetricsInt2;
        int n7;
        this.j = n7 = 1;
        float f5 = object.getTextSize();
        this.g = fontMetricsInt2 = object.getFontMetricsInt();
        Paint.FontMetricsInt fontMetricsInt3 = this.a();
        int n8 = fontMetricsInt3.descent;
        Paint.FontMetricsInt fontMetricsInt4 = this.a();
        int n10 = fontMetricsInt4.ascent;
        if (n8 <= n10) {
            String string2 = "Invalid fontMetrics: line height can not be negative.".toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        float f6 = this.e;
        float f7 = this.a;
        String string3 = "Unsupported unit.";
        int n14 = this.b;
        if (n14 != 0) {
            if (n14 != n7) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
                throw illegalArgumentException;
            }
            f7 *= f5;
        } else {
            f7 *= f6;
        }
        double d5 = Math.ceil(f7);
        this.h = n10 = (int)d5;
        f7 = this.c;
        n14 = this.d;
        if (n14 != 0) {
            if (n14 != n7) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
                throw illegalArgumentException;
            }
            d2 = Math.ceil(f7 *= f5);
        } else {
            d2 = Math.ceil(f7 *= f6);
        }
        f6 = (float)d2;
        n8 = (int)f6;
        this.i = n8;
        if (var5_13 != null) {
            var5_13.ascent = n8 = this.a().ascent;
            var5_13.descent = n8 = this.a().descent;
            Paint.FontMetricsInt fontMetricsInt5 = this.a();
            var5_13.leading = n8 = fontMetricsInt5.leading;
            n8 = this.f;
            switch (n8) {
                default: {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown verticalAlign.");
                    throw illegalArgumentException;
                }
                case 3: 
                case 6: {
                    n8 = var5_13.descent;
                    n7 = var5_13.ascent;
                    n8 -= n7;
                    n7 = this.b();
                    if (n8 >= n7) break;
                    n8 = var5_13.ascent;
                    n7 = this.b();
                    int n15 = var5_13.descent;
                    n10 = var5_13.ascent;
                    n7 = (n7 - (n15 -= n10)) / 2;
                    var5_13.ascent = n8 -= n7;
                    var5_13.descent = n7 = this.b() + n8;
                    break;
                }
                case 2: 
                case 5: {
                    n8 = var5_13.ascent;
                    n7 = var5_13.descent;
                    int n15 = this.b();
                    if (n8 <= (n7 -= n15)) break;
                    n8 = var5_13.descent;
                    n7 = this.b();
                    var5_13.ascent = n8 -= n7;
                    break;
                }
                case 1: 
                case 4: {
                    n8 = var5_13.ascent;
                    n7 = this.b() + n8;
                    n8 = var5_13.descent;
                    if (n7 <= n8) break;
                    n8 = var5_13.ascent;
                    var5_13.descent = n7 = this.b() + n8;
                    break;
                }
                case 0: {
                    n8 = var5_13.ascent;
                    n7 = -this.b();
                    if (n8 <= n7) break;
                    var5_13.ascent = n8 = -this.b();
                }
            }
            n8 = this.a().top;
            n7 = var5_13.ascent;
            var5_13.top = n8 = Math.min(n8, n7);
            Paint.FontMetricsInt fontMetricsInt6 = this.a();
            n8 = fontMetricsInt6.bottom;
            n7 = var5_13.descent;
            var5_13.bottom = n8 = Math.max(n8, n7);
        }
        return this.c();
    }
}

