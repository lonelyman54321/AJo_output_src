/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;
import java.io.File;

public final class mL0 {
    public static final mL0 a;
    public static final File b;
    public static int c;
    public static long d;
    public static boolean e;

    static {
        Object object = new Object();
        a = object;
        b = object = new File("/proc/self/fd");
        c = 30;
        d = SystemClock.uptimeMillis();
        e = true;
    }
}

