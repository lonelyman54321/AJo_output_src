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
import kotlin.jvm.internal.Lambda;

public final class xq
extends Lambda
implements Function0 {
    public static final xq c;

    static {
        xq xq2;
        c = xq2 = new Lambda(0);
    }

    public final Object invoke() {
        Looper looper = Looper.getMainLooper();
        Handler handler = new Handler(looper);
        return handler;
    }
}

