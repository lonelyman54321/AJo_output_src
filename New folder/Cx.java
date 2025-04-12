/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Log
 */
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

public final class Cx {
    public static final Object a;

    static {
        Object object;
        a = object = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static void a(String object, Throwable object2) {
        Object object3;
        if (object2 == null) {
            object = null;
        } else {
            block7: {
                object = a;
                // MONITORENTER : object
                for (object3 = object2; object3 != null; object3 = ((Throwable)object3).getCause()) {
                    boolean bl2 = object3 instanceof UnknownHostException;
                    if (!bl2) continue;
                    object2 = "UnknownHostException (no network)";
                    // MONITOREXIT : object
                    break block7;
                }
                object2 = Log.getStackTraceString((Throwable)object2);
                object2 = ((String)object2).trim();
                object3 = "\t";
                String string2 = "    ";
                object2 = ((String)object2).replace((CharSequence)object3, string2);
                // MONITOREXIT : object
            }
            object = object2;
        }
        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
        if (bl3) return;
        object2 = "\n";
        object3 = "\n  ";
        ((String)object).replace((CharSequence)object2, (CharSequence)object3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(String string2) {
        Object object = a;
        synchronized (object) {
            Cx.a(string2, null);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(String string2) {
        Object object = a;
        synchronized (object) {
            Cx.a(string2, null);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d(String string2, Throwable throwable) {
        Object object = a;
        synchronized (object) {
            Cx.a(string2, throwable);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void e(String string2) {
        Object object = a;
        synchronized (object) {
            Cx.a(string2, null);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void f(String string2) {
        Object object = a;
        synchronized (object) {
            Cx.a(string2, null);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void g(String string2, Throwable throwable) {
        Object object = a;
        synchronized (object) {
            Cx.a(string2, throwable);
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static final int h(float[] var0, int var1_1, float var2_2) {
        block4: {
            var3_3 = 0.0f;
            cfr_temp_0 = var2_2 - 0.0f;
            var4_4 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
            if (var4_4 >= 0) ** GOTO lbl17
            var4_4 = -1251999744;
            var5_5 = -8.34465E-7f;
            cfr_temp_1 = var2_2 - var5_5;
            var6_7 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
            if (var6_7 >= 0) {
                var6_7 = (float)false;
                var2_2 = 0.0f;
            } else {
                while (true) {
                    var6_7 = 2143289344;
                    var2_2 = 0.0f / 0.0f;
                    break block4;
                    break;
                }
lbl17:
                // 1 sources

                var3_3 = 1.0f;
                cfr_temp_2 = var2_2 - var3_3;
                var4_4 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                if (var4_4 > 0) {
                    var4_4 = 1065353223;
                    if ((var6_7 = (cfr_temp_3 = var2_2 - (var5_6 = 1.0000008f)) == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1)) > 0) ** continue;
                    var6_7 = 1065353216;
                    var2_2 = 1.0f;
                }
            }
        }
        var0[var1_1] = var2_2;
        return Float.isNaN(var2_2) ^ 1;
    }
}

