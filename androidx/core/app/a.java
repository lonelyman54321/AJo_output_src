/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Build$VERSION
 */
package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import androidx.core.app.ActivityRecreator$1;
import androidx.core.app.ActivityRecreator$2;
import androidx.core.app.c;
import androidx.core.app.c$a;

public final class a
implements Runnable {
    public final /* synthetic */ Activity a;

    public /* synthetic */ a(Activity activity) {
        this.a = activity;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        block10: {
            block11: {
                var1_1 = 0;
                var2_2 = null;
                var3_4 = 1;
                var4_5 = this.a;
                var5_6 = var4_5.isFinishing();
                if (var5_6 != 0) return;
                var5_6 = Build.VERSION.SDK_INT;
                var6_7 = 28;
                if (var5_6 >= var6_7) {
                    var2_2 = c.a;
                    var4_5.recreate();
                    return;
                }
                var7_8 = c.a;
                var6_7 = 27;
                var8_9 = 26;
                if (var5_6 != var8_9 && var5_6 != var6_7) {
                    var9_10 = false;
                    var10_11 = null;
                } else {
                    var9_10 = true;
                }
                var11_12 = c.f;
                if (var9_10 && var11_12 == null || (var10_11 = c.e) == null && (var10_11 = c.d) == null) break block10;
                try {
                    var10_11 = c.c;
                    var10_11 = var10_11.get(var4_5);
                    if (var10_11 == null) break block10;
                    var12_13 = c.b;
                    if ((var12_13 = var12_13.get(var4_5)) == null) break block10;
                    var13_14 = var4_5.getApplication();
                    var14_15 = new c$a(var4_5);
                    var13_14.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)var14_15);
                    var15_16 = c.g;
                    var16_17 = new ActivityRecreator$1(var14_15, var10_11);
                    var15_16.post((Runnable)var16_17);
                    if (var5_6 != var8_9 && var5_6 != var6_7) {
                        var5_6 = 0;
                        var17_18 = null;
                    } else {
                        var5_6 = 1;
                    }
                    if (var5_6 == 0) break block11;
                }
                catch (Throwable v0) {
                    break block10;
                }
                try {
                    var17_18 = 0;
                    var6_7 = 9;
                    var7_8 = new Object[var6_7];
                    var7_8[0] = var10_11;
                    var7_8[var3_4] = null;
                    var1_1 = 2;
                    var7_8[var1_1] = null;
                    var1_1 = 3;
                    var7_8[var1_1] = var17_18;
                    var2_2 = Boolean.FALSE;
                    var3_4 = 4;
                    var7_8[var3_4] = var2_2;
                    var3_4 = 5;
                    var7_8[var3_4] = null;
                    var3_4 = 6;
                    var7_8[var3_4] = null;
                    var3_4 = 7;
                    var7_8[var3_4] = var2_2;
                    var3_4 = 8;
                    var7_8[var3_4] = var2_2;
                    var11_12.invoke(var12_13, var7_8);
                    ** GOTO lbl-1000
                }
                catch (Throwable var2_3) {
                    ** GOTO lbl77
                }
            }
            var4_5.recreate();
lbl-1000:
            // 2 sources

            {
                var2_2 = new ActivityRecreator$2(var13_14, var14_15);
                var15_16.post((Runnable)var2_2);
                return;
lbl77:
                // 1 sources

                var18_19 = new ActivityRecreator$2(var13_14, var14_15);
                var15_16.post((Runnable)var18_19);
                throw var2_3;
            }
        }
        var4_5.recreate();
    }
}

