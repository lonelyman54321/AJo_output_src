/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 */
package androidx.appcompat.graphics.drawable;

import android.animation.TimeInterpolator;

public final class a$e
implements TimeInterpolator {
    public int[] a;
    public int b;
    public int c;

    public final float getInterpolation(float f5) {
        float f6;
        int n3;
        int n4;
        float f7 = this.c;
        f5 *= f7;
        f7 = 0.5f;
        int n7 = (int)(f5 += f7);
        int n8 = this.b;
        int[] nArray = this.a;
        for (n3 = 0; n3 < n8 && n7 >= (n4 = nArray[n3]); n7 -= n4, ++n3) {
        }
        if (n3 < n8) {
            f5 = n7;
            int n10 = this.c;
            f6 = n10;
            f5 /= f6;
        } else {
            n7 = 0;
            f5 = 0.0f;
        }
        f6 = n3;
        f7 = n8;
        return f6 / f7 + f5;
    }
}

