/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 */
import android.view.MotionEvent;

public final class nQ1 {
    public static final nQ1 a;

    static {
        nQ1 nQ12;
        a = nQ12 = new Object();
    }

    public final boolean a(MotionEvent motionEvent, int n3) {
        boolean bl2;
        float f5;
        boolean bl3;
        float f6 = kq1_0.a(motionEvent, n3);
        boolean bl4 = Float.isInfinite(f6);
        if (!(bl4 || (bl3 = Float.isNaN(f6)) || (n3 = (int)(Float.isInfinite(f5 = lq1_0.a(motionEvent, n3)) ? 1 : 0)) != 0 || (bl2 = Float.isNaN(f5)))) {
            bl2 = true;
            f5 = Float.MIN_VALUE;
        } else {
            bl2 = false;
            f5 = 0.0f;
            motionEvent = null;
        }
        return bl2;
    }
}

