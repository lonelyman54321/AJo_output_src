/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import com.clevertap.android.sdk.b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/*
 * Renamed from se
 */
public final class se_0
implements Callable {
    public final /* synthetic */ Map a;
    public final /* synthetic */ we b;

    public se_0(we we2, HashMap hashMap) {
        this.b = we2;
        this.a = hashMap;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        var1_1 = this.b;
        var2_2 = var1_1.k;
        var3_3 = var1_1.e;
        var4_4 = this.a;
        if (var4_4 == null) return null;
        var5_5 = var4_4.isEmpty();
        if (var5_5) {
            return null;
        }
        var6_6 = new JSONObject();
        var7_7 = var4_4.keySet();
        var8_9 = var7_7.iterator();
lbl13:
        // 5 sources

        while (true) {
            var5_5 = var8_9.hasNext();
            var9_10 = 0;
            var10_11 = null;
            if (!var5_5) ** GOTO lbl-1000
            var7_7 = var8_9.next();
            var7_7 = (String)var7_7;
            var11_12 = var4_4.get(var7_7);
            var2_2.getClass();
            var7_7 = ha3_1.c((String)var7_7);
            var12_13 = var7_7.c;
            var12_13 = var12_13.toString();
            var13_14 = var7_7.a;
            var14_15 = var1_1.j;
            if (var13_14 != 0) {
            }
            ** GOTO lbl38
            break;
        }
        {
            block14: {
                catch (Throwable v0) {
                    var7_7 = var3_3.b();
                    var7_7.getClass();
                    com.clevertap.android.sdk.b.m();
                    return null;
                }
                {
                    var14_15.b((da3_1)var7_7);
lbl38:
                    // 2 sources

                    var5_5 = var12_13.isEmpty();
                    var13_14 = 512;
                    if (!var5_5) break block14;
                    var7_7 = new String[]{};
                    var9_10 = 2;
                    var7_7 = zB1.a((String[])var7_7, var13_14, var9_10);
                    var14_15.b((da3_1)var7_7);
                    var10_11 = var3_3.b();
                    var7_7 = var7_7.b;
                    var10_11.getClass();
                    com.clevertap.android.sdk.b.f((String)var7_7);
                    ** GOTO lbl13
                }
            }
            try {
                var7_7 = ha3$b_0.Profile;
                var7_7 = ha3_1.d(var11_12, (ha3$b_0)var7_7);
                {
                    var11_12 = var7_7.c;
                    var15_16 = var7_7.a;
                    if (var15_16 == 0) ** break block15
                    var14_15.b((da3_1)var7_7);
                }
            }
            catch (Throwable v1) {}
            var7_7 = var11_12 != null ? var11_12.toString() : "";
            {
                var7_7 = new String[]{var7_7, var12_13};
                var9_10 = 3;
                var21_22 = 512;
                var7_7 = zB1.a((String[])var7_7, var21_22, var9_10);
                var14_15.b((da3_1)var7_7);
                var10_11 = var3_3.b();
                var7_7 = var7_7.b;
                var10_11.getClass();
                com.clevertap.android.sdk.b.f((String)var7_7);
                ** continue;
            }
            {
                block18: {
                    block17: {
                        block16: {
                            if (!(var5_5 = var12_13.equalsIgnoreCase((String)(var7_7 = "Phone")))) break block18;
                            try {
                                var11_12 = var11_12.toString();
                                var7_7 = var1_1.i;
                                var7_7 = var7_7.e();
                                var7_7 = var7_7.d;
                                if (var7_7 != null && (var15_16 = (int)var7_7.isEmpty()) == 0) break block16;
                            }
                            catch (Exception var7_8) {
                                break block17;
                            }
                            var16_17 = "+";
                            var15_16 = (int)var11_12.startsWith((String)var16_17);
                            if (var15_16 == 0) {
                                var16_17 = new String[]{var11_12};
                                var17_18 = 4;
                                var16_17 = zB1.a((String[])var16_17, var13_14, var17_18);
                                var14_15.b((da3_1)var16_17);
                                var18_19 = var3_3.b();
                                var16_17 = var16_17.b;
                                var18_19.getClass();
                                com.clevertap.android.sdk.b.f((String)var16_17);
                            }
                        }
                        var16_17 = var3_3.b();
                        var18_19 = var3_3.a;
                        var19_20 = new StringBuilder();
                        var20_21 = "Profile phone is: ";
                        var19_20.append(var20_21);
                        var19_20.append(var11_12);
                        var20_21 = " device country code is: ";
                        var19_20.append(var20_21);
                        if (var7_7 == null) {
                            var7_7 = "null";
                        }
                        var19_20.append((String)var7_7);
                        var7_7 = var19_20.toString();
                        var16_17.b((String)var18_19, (String)var7_7);
                        break block18;
                    }
                    var10_11 = new String[]{};
                    var21_22 = 5;
                    var22_23 = 512;
                    var10_11 = zB1.a((String[])var10_11, var22_23, var21_22);
                    var14_15.b((da3_1)var10_11);
                    var10_11 = var3_3.b();
                    var11_12 = new StringBuilder();
                    var12_13 = "Invalid phone number: ";
                    var11_12.append((String)var12_13);
                    var7_7 = var7_8.getLocalizedMessage();
                    var11_12.append((String)var7_7);
                    var7_7 = var11_12.toString();
                    var10_11.getClass();
                    com.clevertap.android.sdk.b.f((String)var7_7);
                    ** GOTO lbl13
                }
                var6_6.put((String)var12_13, var11_12);
                ** GOTO lbl13
            }
        }
lbl-1000:
        // 1 sources

        {
            var7_7 = var3_3.b();
            var2_2 = var3_3.a;
            var4_4 = new StringBuilder();
            var8_9 = "Constructed custom profile: ";
            var4_4.append((String)var8_9);
            var4_4.append(var6_6);
            var4_4 = var4_4.toString();
            var7_7.b((String)var2_2, (String)var4_4);
            var7_7 = var1_1.c;
            var7_7.W(var6_6, false);
            return null;
        }
    }
}

