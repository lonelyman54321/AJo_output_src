/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler$Callback
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;

public interface VV {
    public static final ph3_0 a;

    static {
        ph3_0 ph3_02;
        a = ph3_02 = new Object();
    }

    public long a();

    public rh3_0 b(Looper var1, Handler.Callback var2);

    public long currentTimeMillis();

    public long elapsedRealtime();

    public long nanoTime();
}

