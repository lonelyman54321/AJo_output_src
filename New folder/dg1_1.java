/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/*
 * Renamed from DG1
 */
public final class dg1_1
implements Executor {
    public final Handler a;

    public dg1_1() {
        Handler handler;
        Looper looper = Looper.getMainLooper();
        this.a = handler = new Handler(looper);
    }

    public final void execute(Runnable runnable2) {
        this.a.post(runnable2);
    }
}

