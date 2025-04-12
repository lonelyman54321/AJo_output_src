/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;
import io.reactivex.android.schedulers.HandlerScheduler;

/*
 * Renamed from Ti$a
 */
public final class ti$a_0 {
    public static final HandlerScheduler a;

    static {
        HandlerScheduler handlerScheduler;
        Looper looper = Looper.getMainLooper();
        Handler handler = new Handler(looper);
        a = handlerScheduler = new HandlerScheduler(handler);
    }
}

