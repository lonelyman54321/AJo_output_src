/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;

/*
 * Renamed from CG1
 */
public final class cg1_0
extends Handler {
    public Runnable a;

    public cg1_0() {
        Looper looper = Looper.getMainLooper();
        super(looper);
        this.a = null;
    }
}

