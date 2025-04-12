/*
 * Decompiled with CFR 0.152.
 */
package androidx.core.widget;

import androidx.core.widget.AutoScrollHelper;

public final class AutoScrollHelper$a {
    public int a;
    public int b;
    public float c;
    public float d;
    public long e;
    public long f;
    public long g;
    public float h;
    public int i;

    public final float a(long l2) {
        long l3;
        long l4 = this.e;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object < 0) {
            return 0.0f;
        }
        long l8 = this.g;
        long l12 = 0L;
        float f5 = 1.0f;
        Object object2 = l8 == l12 ? 0 : (l8 < l12 ? -1 : 1);
        if (object2 >= 0 && (l3 = l2 == l8 ? 0 : (l2 < l8 ? -1 : 1)) >= 0) {
            float f6 = this.h;
            float f7 = f5 - f6;
            float f8 = l2 -= l8;
            float f11 = this.i;
            return AutoScrollHelper.b(f8 / f11, 0.0f, f5) * f6 + f7;
        }
        float f12 = l2 - l4;
        float f14 = this.a;
        return AutoScrollHelper.b(f12 / f14, 0.0f, f5) * 0.5f;
    }
}

