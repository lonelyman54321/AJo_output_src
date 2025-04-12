/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Trace
 */
import android.os.Trace;

/*
 * Renamed from hp3
 */
public final class hp3_0 {
    public static void a(int n3, String string2) {
        Trace.beginAsyncSection((String)string2, (int)n3);
    }

    public static void b(int n3, String string2) {
        Trace.endAsyncSection((String)string2, (int)n3);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}

