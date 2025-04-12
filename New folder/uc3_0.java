/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Layout$Alignment
 *  android.text.TextDirectionHeuristic
 *  android.text.TextPaint
 *  android.text.TextUtils$TruncateAt
 */
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/*
 * Renamed from uc3
 */
public final class uc3_0 {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final TextPaint d;
    public final int e;
    public final TextDirectionHeuristic f;
    public final Layout.Alignment g;
    public final int h;
    public final TextUtils.TruncateAt i;
    public final int j;
    public final float k;
    public final float l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int[] t;
    public final int[] u;

    public uc3_0(CharSequence charSequence, int n3, int n4, TextPaint textPaint, int n7, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int n8, TextUtils.TruncateAt truncateAt, int n10, float f5, float f6, int n14, boolean bl2, boolean bl3, int n15, int n16, int n17, int n18, int[] nArray, int[] nArray2) {
        int n19 = n3;
        this.a = charSequence;
        this.b = n3;
        this.c = n4;
        this.d = textPaint;
        this.e = n7;
        this.f = textDirectionHeuristic;
        this.g = alignment;
        this.h = n8;
        this.i = truncateAt;
        this.j = n10;
        this.k = f5;
        this.l = f6;
        this.m = n14;
        this.n = bl2;
        this.o = bl3;
        this.p = n15;
        this.q = n16;
        this.r = n17;
        this.s = n18;
        this.t = nArray;
        this.u = nArray2;
        if (n3 >= 0 && n3 <= n4) {
            n19 = charSequence.length();
            if (n4 >= 0 && n4 <= n19) {
                if (n8 >= 0) {
                    if (n7 >= 0) {
                        if (n10 >= 0) {
                            IllegalArgumentException illegalArgumentException = null;
                            float f7 = f5 - 0.0f;
                            n19 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
                            if (n19 >= 0) {
                                return;
                            }
                            String string2 = "invalid lineSpacingMultiplier value".toString();
                            illegalArgumentException = new IllegalArgumentException(string2);
                            throw illegalArgumentException;
                        }
                        String string3 = "invalid ellipsizedWidth value".toString();
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
                        throw illegalArgumentException;
                    }
                    String string4 = "invalid width value".toString();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string4);
                    throw illegalArgumentException;
                }
                String string5 = "invalid maxLines value".toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string5);
                throw illegalArgumentException;
            }
            String string6 = "invalid end value".toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string6);
            throw illegalArgumentException;
        }
        String string7 = "invalid start value".toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string7);
        throw illegalArgumentException;
    }
}

