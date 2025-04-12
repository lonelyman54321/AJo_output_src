/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class eg1$b {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static eg1_2 a(Context var0) {
        block29: {
            block31: {
                block30: {
                    block27: {
                        var1_1 = 2;
                        var2_2 = 1;
                        var3_3 = 0;
                        var4_4 = null;
                        var5_5 /* !! */  = mg1_0.g;
                        synchronized (var5_5 /* !! */ ) {
                            var6_6 /* !! */  = mg1_0.class;
                            try {
                                block26: {
                                    var7_7 = td0.b(var6_6 /* !! */ );
                                    var8_8 /* !! */  = null;
                                    if (var7_7) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            var7_7 = false;
                                            var9_10 /* !! */  = null;
                                            break block26;
                                            break;
                                        }
                                    }
                                    try {
                                        var9_10 /* !! */  = mg1_0.h;
                                    }
                                    catch (Throwable var9_9) {
                                        var10_15 = var9_9;
                                        td0.a(var6_6 /* !! */ , var9_9);
                                        ** continue;
                                    }
                                }
                                if (var9_10 /* !! */  == null) {
                                    var9_10 /* !! */  = mg1$a.a();
                                }
                                var6_6 /* !! */  = var9_10 /* !! */ ;
                            }
                            catch (Throwable var9_14) {
                                ** break block28
                            }
                            ** if (var9_10 /* !! */  != null) goto lbl32
                        }
lbl31:
                        // 1 sources

                        return null;
lbl32:
                        // 1 sources

                        var11_16 = ng1_1.a("com.android.billingclient.api.BillingClient");
                        var9_10 /* !! */  = ng1_1.a("com.android.billingclient.api.Purchase");
                        var5_5 /* !! */  = ng1_1.a("com.android.billingclient.api.Purchase$PurchasesResult");
                        var12_17 = ng1_1.a("com.android.billingclient.api.SkuDetails");
                        var13_18 = ng1_1.a("com.android.billingclient.api.PurchaseHistoryRecord");
                        var14_19 = ng1_1.a("com.android.billingclient.api.SkuDetailsResponseListener");
                        var10_15 = "com.android.billingclient.api.PurchaseHistoryResponseListener";
                        var15_20 = ng1_1.a((String)var10_15);
                        if (var11_16 == null || var5_5 /* !! */  == null || var9_10 /* !! */  == null || var12_17 == null || var14_19 == null || var13_18 == null || var15_20 == null) {
                            var1_1 = 0;
                            var16_21 = null;
                            eg1_2.b();
                            return null;
                        }
                        var17_23 /* !! */  = new Class[var2_2];
                        var17_23 /* !! */ [0] = String.class;
                        var10_15 = ng1_1.c(var11_16, "queryPurchases", var17_23 /* !! */ );
                        var18_24 /* !! */  = new Class[]{};
                        var5_5 /* !! */  = ng1_1.c((Class)var5_5 /* !! */ , "getPurchasesList", var18_24 /* !! */ );
                        var18_24 /* !! */  = new Class[]{};
                        var17_23 /* !! */  = ng1_1.c((Class)var9_10 /* !! */ , "getOriginalJson", var18_24 /* !! */ );
                        var18_24 /* !! */  = new Class[]{};
                        var18_24 /* !! */  = ng1_1.c(var12_17, "getOriginalJson", var18_24 /* !! */ );
                        var9_10 /* !! */  = "getOriginalJson";
                        var19_25 /* !! */  = new Class[]{};
                        var19_25 /* !! */  = ng1_1.c(var13_18, (String)var9_10 /* !! */ , var19_25 /* !! */ );
                        var8_8 /* !! */  = "querySkuDetailsAsync";
                        var7_7 = td0.b(var6_6 /* !! */ );
                        if (var7_7) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                var7_7 = false;
                                var9_10 /* !! */  = null;
                                break block27;
                                break;
                            }
                        }
                        try {
                            var9_10 /* !! */  = var6_6 /* !! */ .a;
                        }
                        catch (Throwable var9_11 /* !! */ ) {
                            var20_26 = var9_11 /* !! */ ;
                            td0.a(var6_6 /* !! */ , (Throwable)var9_11 /* !! */ );
                            ** continue;
                        }
                    }
                    var20_26 = new Class[var1_1];
                    var20_26[0] = var9_10 /* !! */ ;
                    var21_27 = 1;
                    var20_26[var21_27] = var14_19;
                    var9_10 /* !! */  = ng1_1.c(var11_16, (String)var8_8 /* !! */ , (Class[])var20_26);
                    var20_26 = "queryPurchaseHistoryAsync";
                    var16_22 /* !! */  = new Class[var1_1];
                    var8_8 /* !! */  = String.class;
                    var16_22 /* !! */ [0] = var8_8 /* !! */ ;
                    var16_22 /* !! */ [var21_27] = var15_20;
                    var22_28 = ng1_1.c(var11_16, (String)var20_26, var16_22 /* !! */ );
                    if (var10_15 == null || var5_5 /* !! */  == null || var17_23 /* !! */  == null || var18_24 /* !! */  == null || var19_25 /* !! */  == null || var9_10 /* !! */  == null || var22_28 == null) break block29;
                    var16_22 /* !! */  = ng1_1.a("com.android.billingclient.api.BillingClient$Builder");
                    var20_26 = ng1_1.a("com.android.billingclient.api.PurchasesUpdatedListener");
                    if (var16_22 /* !! */  != null && var20_26 != null) break block30;
                    var23_29 = var9_10 /* !! */ ;
                    var24_30 = var6_6 /* !! */ ;
                    ** GOTO lbl-1000
                }
                var25_31 = 1;
                var8_8 /* !! */  = new Class[var25_31];
                var8_8 /* !! */ [0] = Context.class;
                var8_8 /* !! */  = ng1_1.c(var11_16, "newBuilder", var8_8 /* !! */ );
                var17_23 /* !! */  = new Class[]{};
                var10_15 = ng1_1.c((Class)var16_22 /* !! */ , "enablePendingPurchases", var17_23 /* !! */ );
                var24_30 = var6_6 /* !! */ ;
                var6_6 /* !! */  = new Class[var25_31];
                var6_6 /* !! */ [0] = var20_26;
                var6_6 /* !! */  = ng1_1.c((Class)var16_22 /* !! */ , "setListener", var6_6 /* !! */ );
                var17_23 /* !! */  = "build";
                var5_5 /* !! */  = new Class[]{};
                var5_5 /* !! */  = ng1_1.c((Class)var16_22 /* !! */ , (String)var17_23 /* !! */ , var5_5 /* !! */ );
                if (var8_8 /* !! */  != null && var10_15 != null && var6_6 /* !! */  != null && var5_5 /* !! */  != null) break block31;
                var23_29 = var9_10 /* !! */ ;
                ** GOTO lbl-1000
            }
            var23_29 = var9_10 /* !! */ ;
            var26_32 = 1;
            var9_10 /* !! */  = new Object[var26_32];
            var9_10 /* !! */ [0] = var0;
            var3_3 = 0;
            var4_4 = null;
            if ((var9_10 /* !! */  = ng1_1.d(var11_16, null, (Method)var8_8 /* !! */ , var9_10 /* !! */ )) == null) lbl-1000:
            // 4 sources

            {
                while (true) {
                    var26_32 = 0;
                    var17_23 /* !! */  = null;
                    break;
                }
            } else {
                var4_4 = var20_26.getClassLoader();
                var8_8 /* !! */  = new Class[var26_32];
                var26_32 = 0;
                var17_23 /* !! */  = null;
                var8_8 /* !! */ [0] = var20_26;
                var20_26 = new Object();
                var20_26 = Proxy.newProxyInstance((ClassLoader)var4_4, var8_8 /* !! */ , (InvocationHandler)var20_26);
                var3_3 = 1;
                var4_4 = new Object[var3_3];
                var4_4[0] = var20_26;
                if ((var9_10 /* !! */  = ng1_1.d((Class)var16_22 /* !! */ , var9_10 /* !! */ , (Method)var6_6 /* !! */ , var4_4)) == null) ** continue;
                var20_26 = new Object[0];
                if ((var9_10 /* !! */  = ng1_1.d((Class)var16_22 /* !! */ , var9_10 /* !! */ , (Method)var10_15, (Object[])var20_26)) == null) {
                    var7_7 = false;
                    var9_10 /* !! */  = null;
                } else {
                    var20_26 = new Object[]{};
                    var9_10 /* !! */  = ng1_1.d((Class)var16_22 /* !! */ , var9_10 /* !! */ , (Method)var5_5 /* !! */ , (Object[])var20_26);
                }
                var17_23 /* !! */  = var9_10 /* !! */ ;
            }
            if (var17_23 /* !! */  == null) {
                eg1_2.b();
                return null;
            }
            var10_15 = var9_10 /* !! */ ;
            var9_10 /* !! */  = new eg1_2(var17_23 /* !! */ , var11_16, var12_17, var13_18, var14_19, var15_20, (Method)var18_24 /* !! */ , (Method)var19_25 /* !! */ , (Method)var23_29, var22_28, (mg1_0)var24_30);
            var16_22 /* !! */  = eg1_2.class;
            var2_2 = (int)td0.b(var16_22 /* !! */ );
            if (var2_2 == 0) {
                try {
                    eg1_2.m = var9_10 /* !! */ ;
                }
                catch (Throwable var9_12) {
                    var20_26 = var9_12;
                    td0.a(var16_22 /* !! */ , var9_12);
                }
            }
            var16_22 /* !! */  = eg1_2.class;
            var7_7 = td0.b(var16_22 /* !! */ );
            if (var7_7 != false) return null;
            try {
                return eg1_2.m;
            }
            catch (Throwable var9_13) {
                var20_26 = var9_13;
                td0.a(var16_22 /* !! */ , var9_13);
            }
            return null;
        }
        eg1_2.b();
        return null;
lbl-1000:
        // 1 sources

        {
            throw var9_14;
        }
    }

    public static ConcurrentHashMap b() {
        Class<eg1_2> clazz = eg1_2.class;
        boolean bl2 = td0.b(clazz);
        ConcurrentHashMap concurrentHashMap = null;
        if (!bl2) {
            try {
                concurrentHashMap = eg1_2.o;
            }
            catch (Throwable throwable) {
                td0.a(clazz, throwable);
            }
        }
        return concurrentHashMap;
    }

    public static ConcurrentHashMap d() {
        Class<eg1_2> clazz = eg1_2.class;
        boolean bl2 = td0.b(clazz);
        ConcurrentHashMap concurrentHashMap = null;
        if (!bl2) {
            try {
                concurrentHashMap = eg1_2.q;
            }
            catch (Throwable throwable) {
                td0.a(clazz, throwable);
            }
        }
        return concurrentHashMap;
    }

    public static ConcurrentHashMap e() {
        Class<eg1_2> clazz = eg1_2.class;
        boolean bl2 = td0.b(clazz);
        ConcurrentHashMap concurrentHashMap = null;
        if (!bl2) {
            try {
                concurrentHashMap = eg1_2.p;
            }
            catch (Throwable throwable) {
                td0.a(clazz, throwable);
            }
        }
        return concurrentHashMap;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final eg1_2 c(Context context) {
        synchronized (this) {
            Object object = "context";
            try {
                Intrinsics.checkNotNullParameter(context, (String)object);
                object = eg1_2.class;
                boolean bl2 = td0.b(object);
                eg1_2 eg1_22 = null;
                if (!bl2) {
                    try {
                        eg1_22 = eg1_2.m;
                    }
                    catch (Throwable throwable) {
                        td0.a(object, throwable);
                    }
                }
                if (eg1_22 != null) return eg1_22;
                return eg1$b.a(context);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

