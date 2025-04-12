/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  android.os.SystemClock
 *  android.system.Os
 *  android.system.OsConstants
 *  android.view.KeyEvent
 */
import android.os.Process;
import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import android.view.KeyEvent;
import com.google.firebase.perf.metrics.Trace;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.Reader;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlin.text.StringsKt;

/*
 * Renamed from bo1
 */
public final class bo1_1 {
    public static boolean a;
    public static boolean b;
    public static long c;
    public static long d;
    public static boolean e;
    public static long f;

    public static final long a(float f5, float f6) {
        long l2 = Float.floatToRawIntBits(f5);
        long l3 = Float.floatToRawIntBits(f6);
        return l3 & 0xFFFFFFFFL | (l2 <<= 32);
    }

    public static final long b(long l2) {
        long l3 = 9205357640488583168L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            float f5 = Float.intBitsToFloat((int)(l2 >> 32));
            float f6 = 2.0f;
            float f7 = Float.intBitsToFloat((int)(l2 & 0xFFFFFFFFL)) / f6;
            return h72.a(f5 /= f6, f7);
        }
        IllegalStateException illegalStateException = new IllegalStateException("Size is unspecified");
        throw illegalStateException;
    }

    public static final long c(KeyEvent keyEvent) {
        return to1_0.a(keyEvent.getKeyCode());
    }

    public static final int d(KeyEvent keyEvent) {
        int n3;
        int n4 = keyEvent.getAction();
        if (n4 != 0) {
            n3 = 1;
            if (n4 != n3) {
                n3 = 0;
            }
        } else {
            n3 = 2;
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void e() {
        long l2;
        Object var0 = null;
        int n3 = 1;
        boolean bl2 = e;
        if (bl2) return;
        bl2 = a;
        if (bl2) {
            return;
        }
        long l3 = SystemClock.uptimeMillis();
        int n4 = Process.myPid();
        Object object = Gj0.b(n4, "/proc/", "/stat");
        Object object2 = new FileReader((String)object);
        Object object3 = new BufferedReader((Reader)object2);
        try {
            object = ((BufferedReader)object3).readLine();
            object2 = null;
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                xj3_1.b((Closeable)object3, throwable);
                throw throwable2;
            }
        }
        xj3_1.b((Closeable)object3, null);
        Intrinsics.checkNotNull(object);
        object = StringsKt.f0((String)object, ") ");
        object3 = new char[n3];
        int n7 = 32;
        object3[0] = n7;
        object = StringsKt.Z((CharSequence)object, (char[])object3);
        int n8 = 19;
        try {
            object = object.get(n8);
            object = (String)object;
            l2 = Long.parseLong((String)object);
        }
        catch (Exception exception) {
            l2 = 0L;
        }
        n7 = OsConstants._SC_CLK_TCK;
        long l4 = Os.sysconf((int)n7);
        int n10 = 1000;
        long l7 = n10;
        l2 = l2 * l7 / l4;
        l4 = SystemClock.elapsedRealtime();
        l7 = SystemClock.uptimeMillis();
        l3 -= (l7 -= (l4 -= l2));
        l2 = SystemClock.uptimeMillis();
        l4 = f;
        l3 = kotlin.ranges.f.d(l3, l2 -= l4);
        object = fq2_1.h;
        ((Trace)object).start();
        object3 = "Cold Start Time (Seconds)";
        try {
            object2 = TimeUnit.MILLISECONDS;
            l3 = ((TimeUnit)((Object)object2)).toSeconds(l3);
            ((Trace)object).putMetric((String)object3, l3);
        }
        finally {
            ((Trace)object).stop();
        }
        a = n3;
        b = false;
    }

    public static void f() {
        boolean bl2 = e;
        if (!bl2 && !(bl2 = a)) {
            Object object = fq2_1.a;
            long l2 = d;
            long l3 = c;
            l2 -= l3;
            Trace trace = fq2_1.h;
            trace.start();
            String string2 = "Hot Start Time (Seconds)";
            try {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                l2 = timeUnit.toSeconds(l2);
                trace.putMetric(string2, l2);
                object = Unit.a;
                a = true;
                b = false;
                return;
            }
            finally {
                trace.stop();
            }
        }
    }
}

