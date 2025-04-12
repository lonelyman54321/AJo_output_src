/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 */
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public final class M31 {
    public static final boolean e;
    public static final boolean f;
    public static final File g;
    public static volatile M31 h;
    public final int a;
    public int b;
    public boolean c = true;
    public final AtomicBoolean d;

    static {
        File file;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        boolean bl2 = false;
        n4 = n3 < n4 ? 1 : 0;
        e = n4;
        n4 = 28;
        if (n3 >= n4) {
            bl2 = true;
        }
        f = bl2;
        g = file = new File("/proc/self/fd");
    }

    public M31() {
        AtomicBoolean atomicBoolean;
        this.d = atomicBoolean = new AtomicBoolean(false);
        this.a = 20000;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static M31 a() {
        Object object = h;
        if (object != null) return h;
        object = M31.class;
        synchronized (object) {
            try {
                M31 m31 = h;
                if (m31 != null) return h;
                h = m31 = new M31();
                return h;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public final int b() {
        Object object;
        String string2;
        String string3;
        int n3;
        boolean bl2 = true;
        do {
            block3: {
                block2: {
                    if (!bl2 || (bl2 = false)) break block2;
                    int n4 = Build.VERSION.SDK_INT;
                    n3 = 28;
                    if (n4 != n3) break block3;
                    String string4 = "ONEPLUS A6000";
                    String string5 = "ONEPLUS A6003";
                    string3 = "GM1900";
                    String string6 = "GM1901";
                    String string7 = "GM1903";
                    String string8 = "GM1911";
                    String string9 = "GM1915";
                    String string10 = "ONEPLUS A3000";
                    String string11 = "ONEPLUS A3010";
                    String string12 = "ONEPLUS A5010";
                    String string13 = "ONEPLUS A5000";
                    String string14 = "ONEPLUS A3003";
                    String string15 = "ONEPLUS A6010";
                    String string16 = "ONEPLUS A6013";
                    object = Arrays.asList(string3, string6, string7, string8, string9, string10, string11, string12, string13, string14, string4, string5, string15, string16).iterator();
                }
                if ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) continue;
            }
            object = this;
            return this.a;
        } while ((n3 = (int)((string3 = Build.MODEL).startsWith(string2 = (String)object.next()) ? 1 : 0)) == 0);
        return 500;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean c(int n3, int n4, boolean n7, boolean bl2) {
        AtomicBoolean atomicBoolean;
        int n8 = 2;
        if (n7 == 0) {
            Log.isLoggable((String)"HardwareConfig", (int)n8);
            return false;
        }
        n7 = f ? 1 : 0;
        if (n7 == 0) {
            Log.isLoggable((String)"HardwareConfig", (int)n8);
            return false;
        }
        n7 = e ? 1 : 0;
        if (n7 != 0 && (n7 = (int)((atomicBoolean = this.d).get() ? 1 : 0)) == 0) {
            Log.isLoggable((String)"HardwareConfig", (int)n8);
            return false;
        }
        if (bl2) {
            Log.isLoggable((String)"HardwareConfig", (int)n8);
            return false;
        }
        if (n3 >= 0 && n4 >= 0) {
            block12: {
                // MONITORENTER : this
                n3 = this.b;
                n4 = 1;
                this.b = n3 += n4;
                n7 = 50;
                if (n3 < n7) break block12;
                this.b = 0;
                Object object = g;
                object = object.list();
                n3 = ((String[])object).length;
                long l2 = n3;
                n7 = this.b();
                long l3 = n7;
                long l4 = l2 - l3;
                if ((n3 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1))) < 0) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    object = null;
                }
                this.c = n3;
                if (n3 == 0) {
                    object = "Downsampler";
                    n7 = 5;
                    Log.isLoggable((String)object, (int)n7);
                }
            }
            n3 = this.c ? 1 : 0;
            // MONITOREXIT : this
            if (n3 != 0) return n4 != 0;
            Log.isLoggable((String)"HardwareConfig", (int)n8);
            return false;
        }
        Log.isLoggable((String)"HardwareConfig", (int)n8);
        return false;
    }
}

