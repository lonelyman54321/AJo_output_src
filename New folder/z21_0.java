/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
import android.os.Handler;

/*
 * Renamed from z21
 */
public final class z21_0
implements fr0_1 {
    public final /* synthetic */ c21_0 a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ z21_0(c21_0 c21_02, Runnable runnable2) {
        this.a = c21_02;
        this.b = runnable2;
    }

    public final void dispose() {
        Handler handler = this.a.b;
        Runnable runnable2 = this.b;
        handler.removeCallbacks(runnable2);
    }
}

