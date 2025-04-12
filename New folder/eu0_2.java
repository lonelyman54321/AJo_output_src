/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from eu0
 */
public final class eu0_2
implements Function0 {
    public final Object invoke() {
        Looper looper = Looper.getMainLooper();
        Handler handler = new Handler(looper);
        return handler;
    }
}

