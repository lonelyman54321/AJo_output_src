/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

public final class x82
implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ x82(Context context, String string2) {
        this.a = context;
        this.b = "com.facebook.sdk.attributionTracking";
        this.c = string2;
    }

    /*
     * Unable to fully structure code
     */
    public final void run() {
        block18: {
            var1_1 = this.a;
            var2_3 = this.b;
            var3_4 = this.c;
            var4_6 = y82_0.class;
            var5_7 = td0.b(var4_6);
            if (var5_7) break block18;
            var6_8 = "$context";
            Intrinsics.checkNotNullParameter(var1_1, (String)var6_8);
            var5_7 = false;
            var6_8 = null;
            var1_1 = var1_1.getSharedPreferences((String)var2_3, 0);
            var2_3 = new StringBuilder();
            var2_3.append(var3_4);
            var6_8 = "pingForOnDevice";
            var2_3.append((String)var6_8);
            var2_3 = var2_3.toString();
            var7_9 = 0L;
            var9_10 = var1_1.getLong((String)var2_3, var7_9);
            var11_11 = var9_10 == var7_9 ? 0 : (var9_10 < var7_9 ? -1 : 1);
            if (var11_11 != false) break block18;
            var6_8 = li2_0.a;
            var6_8 = li2_0.class;
            var12_12 = td0.b(var6_8);
            if (var12_12) ** GOTO lbl50
            var13_13 = "applicationId";
            Intrinsics.checkNotNullParameter(var3_4, (String)var13_13);
            var13_13 = li2_0.a;
            var14_14 = LI2$a.MOBILE_APP_INSTALL;
            var15_15 = mz0_2.a;
            try {
                var13_13.b(var14_14, var3_4, var15_15);
                ** GOTO lbl50
            }
            catch (Throwable var3_5) {
                td0.a(var6_8, var3_5);
lbl50:
                // 3 sources

                var1_1 = var1_1.edit();
            }
            var7_9 = System.currentTimeMillis();
            var1_1.putLong((String)var2_3, var7_9);
            var1_1.apply();
            {
                catch (Throwable var1_2) {
                    td0.a(var4_6, var1_2);
                }
            }
        }
    }
}

