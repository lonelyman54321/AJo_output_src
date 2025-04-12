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
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class hg1$a
implements InvocationHandler {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final hg1_2 a(Context var1_1) {
        block12: {
            block13: {
                block11: {
                    block14: {
                        var2_2 = 2;
                        var3_3 = ng1_1.a("com.android.billingclient.api.BillingClient");
                        var4_4 /* !! */  = ng1_1.a("com.android.billingclient.api.Purchase");
                        var5_5 = ng1_1.a("com.android.billingclient.api.ProductDetails");
                        var6_6 = ng1_1.a("com.android.billingclient.api.PurchaseHistoryRecord");
                        var7_7 = ng1_1.a("com.android.billingclient.api.QueryProductDetailsParams$Product");
                        var8_8 /* !! */  = ng1_1.a("com.android.billingclient.api.BillingResult");
                        var9_9 = ng1_1.a("com.android.billingclient.api.QueryProductDetailsParams");
                        var10_10 /* !! */  = ng1_1.a("com.android.billingclient.api.QueryPurchaseHistoryParams");
                        var11_11 = ng1_1.a("com.android.billingclient.api.QueryPurchasesParams");
                        var12_12 = ng1_1.a("com.android.billingclient.api.QueryProductDetailsParams$Builder");
                        var13_13 = ng1_1.a("com.android.billingclient.api.QueryPurchaseHistoryParams$Builder");
                        var14_14 /* !! */  = ng1_1.a("com.android.billingclient.api.QueryPurchasesParams$Builder");
                        var15_15 /* !! */  = ng1_1.a("com.android.billingclient.api.QueryProductDetailsParams$Product$Builder");
                        var16_16 /* !! */  = ng1_1.a("com.android.billingclient.api.BillingClient$Builder");
                        var17_17 = ng1_1.a("com.android.billingclient.api.PurchasesUpdatedListener");
                        var18_18 = ng1_1.a("com.android.billingclient.api.BillingClientStateListener");
                        var19_19 = ng1_1.a("com.android.billingclient.api.ProductDetailsResponseListener");
                        var20_20 = ng1_1.a("com.android.billingclient.api.PurchasesResponseListener");
                        var21_21 /* !! */  = ng1_1.a("com.android.billingclient.api.PurchaseHistoryResponseListener");
                        if (var3_3 == null || var4_4 /* !! */  == null || var5_5 == null || var6_6 == null || var7_7 == null || var8_8 /* !! */  == null || var9_9 == null || var10_10 /* !! */  == null || var11_11 == null || var12_12 == null || var13_13 == null || var14_14 /* !! */  == null || var15_15 /* !! */  == null || var16_16 /* !! */  == null || var17_17 == null || var18_18 == null || var19_19 == null || var20_20 == null || var21_21 /* !! */  == null) break block12;
                        var22_22 /* !! */  = var16_16 /* !! */ ;
                        var16_16 /* !! */  = new Class[var2_2];
                        var16_16 /* !! */ [0] = var11_11;
                        var2_2 = 1;
                        var16_16 /* !! */ [var2_2] = var20_20;
                        var16_16 /* !! */  = ng1_1.c(var3_3, "queryPurchasesAsync", var16_16 /* !! */ );
                        var23_23 /* !! */  = new Class[]{};
                        var20_20 = var16_16 /* !! */ ;
                        var16_16 /* !! */  = "newBuilder";
                        var23_23 /* !! */  = ng1_1.c((Class)var11_11, (String)var16_16 /* !! */ , var23_23 /* !! */ );
                        var11_11 = new Class[]{};
                        var24_26 = "build";
                        var11_11 = ng1_1.c((Class)var14_14 /* !! */ , (String)var24_26, (Class[])var11_11);
                        var25_27 /* !! */  = String.class;
                        var26_28 /* !! */  = var23_23 /* !! */ ;
                        var27_29 /* !! */  = var11_11;
                        var23_23 /* !! */  = new Class[]{var25_27 /* !! */ };
                        var28_30 /* !! */  = var8_8 /* !! */ ;
                        var8_8 /* !! */  = "setProductType";
                        var23_23 /* !! */  = ng1_1.c((Class)var14_14 /* !! */ , (String)var8_8 /* !! */ , var23_23 /* !! */ );
                        var14_14 /* !! */  = new Class[]{};
                        var11_11 = "getOriginalJson";
                        var29_31 = ng1_1.c((Class)var4_4 /* !! */ , (String)var11_11, var14_14 /* !! */ );
                        var30_32 /* !! */  = var23_23 /* !! */ ;
                        var31_33 /* !! */  = var4_4 /* !! */ ;
                        var23_23 /* !! */  = new Class[]{var10_10 /* !! */ , var21_21 /* !! */ };
                        var23_23 /* !! */  = ng1_1.c(var3_3, "queryPurchaseHistoryAsync", var23_23 /* !! */ );
                        var4_4 /* !! */  = new Class[]{};
                        var32_34 = ng1_1.c((Class)var10_10 /* !! */ , (String)var16_16 /* !! */ , var4_4 /* !! */ );
                        var4_4 /* !! */  = new Class[]{};
                        var33_35 = ng1_1.c((Class)var13_13, (String)var24_26, var4_4 /* !! */ );
                        var34_36 /* !! */  = var10_10 /* !! */ ;
                        var10_10 /* !! */  = new Class[]{var25_27 /* !! */ };
                        var35_37 = ng1_1.c((Class)var13_13, (String)var8_8 /* !! */ , var10_10 /* !! */ );
                        var10_10 /* !! */  = new Class[]{};
                        var11_11 = ng1_1.c(var6_6, (String)var11_11, var10_10 /* !! */ );
                        var4_4 /* !! */  = new Class[2];
                        var4_4 /* !! */ [0] = var9_9;
                        var36_38 = 1;
                        var4_4 /* !! */ [var36_38] = var19_19;
                        var37_39 = ng1_1.c(var3_3, "queryProductDetailsAsync", var4_4 /* !! */ );
                        var4_4 /* !! */  = null;
                        var10_10 /* !! */  = new Class[]{};
                        var38_40 = ng1_1.c(var9_9, (String)var16_16 /* !! */ , var10_10 /* !! */ );
                        var10_10 /* !! */  = new Class[]{};
                        var39_41 = ng1_1.c(var12_12, (String)var24_26, var10_10 /* !! */ );
                        var10_10 /* !! */  = new Class[var36_38];
                        var10_10 /* !! */ [0] = var40_42 = List.class;
                        var41_43 = ng1_1.c(var12_12, "setProductList", var10_10 /* !! */ );
                        var14_14 /* !! */  = new Class[]{};
                        var42_44 = ng1_1.c(var7_7, (String)var16_16 /* !! */ , var14_14 /* !! */ );
                        var14_14 /* !! */  = new Class[]{};
                        var43_45 = ng1_1.c((Class)var15_15 /* !! */ , (String)var24_26, var14_14 /* !! */ );
                        var44_46 /* !! */  = var13_13;
                        var45_47 = 1;
                        var13_13 = new Class[var45_47];
                        var13_13[0] = var25_27 /* !! */ ;
                        var46_48 = ng1_1.c((Class)var15_15 /* !! */ , "setProductId", (Class[])var13_13);
                        var14_14 /* !! */  = new Class[var45_47];
                        var14_14 /* !! */ [0] = var25_27 /* !! */ ;
                        var47_49 = ng1_1.c((Class)var15_15 /* !! */ , (String)var8_8 /* !! */ , var14_14 /* !! */ );
                        var8_8 /* !! */  = new Class[]{};
                        var48_50 = ng1_1.c(var5_5, "toString", var8_8 /* !! */ );
                        var8_8 /* !! */  = new Class[var45_47];
                        var8_8 /* !! */ [0] = var18_18;
                        var49_51 = ng1_1.c(var3_3, "startConnection", var8_8 /* !! */ );
                        var14_14 /* !! */  = "getResponseCode";
                        var8_8 /* !! */  = new Class[]{};
                        var10_10 /* !! */  = var28_30 /* !! */ ;
                        var50_52 = ng1_1.c(var28_30 /* !! */ , (String)var14_14 /* !! */ , var8_8 /* !! */ );
                        if (var20_20 == null || var26_28 /* !! */  == null || var27_29 /* !! */  == null || var30_32 /* !! */  == null || var29_31 == null || var23_23 /* !! */  == null || var32_34 == null || var33_35 == null || var35_37 == null || var11_11 == null || var37_39 == null || var38_40 == null || var39_41 == null || var41_43 == null || var42_44 == null || var43_45 == null || var46_48 == null || var47_49 == null || var48_50 == null || var49_51 == null || var50_52 == null) break block13;
                        var36_38 = 1;
                        var4_4 /* !! */  = new Class[var36_38];
                        var51_53 = 0;
                        var13_13 = null;
                        var4_4 /* !! */ [0] = Context.class;
                        var16_16 /* !! */  = ng1_1.c(var3_3, (String)var16_16 /* !! */ , var4_4 /* !! */ );
                        var8_8 /* !! */  = new Class[var36_38];
                        var8_8 /* !! */ [0] = var17_17;
                        var14_14 /* !! */  = var22_22 /* !! */ ;
                        var4_4 /* !! */  = ng1_1.c((Class)var22_22 /* !! */ , "setListener", var8_8 /* !! */ );
                        var8_8 /* !! */  = new Class[]{};
                        var20_20 = var15_15 /* !! */ ;
                        var15_15 /* !! */  = ng1_1.c((Class)var22_22 /* !! */ , "enablePendingPurchases", var8_8 /* !! */ );
                        var8_8 /* !! */  = new Class[0];
                        if ((var24_26 = ng1_1.c((Class)var22_22 /* !! */ , (String)var24_26, var8_8 /* !! */ )) != null && var4_4 /* !! */  != null && var16_16 /* !! */  != null && var15_15 /* !! */  != null) break block14;
                        var25_27 /* !! */  = var11_11;
                        ** GOTO lbl-1000
                    }
                    var25_27 /* !! */  = var11_11;
                    var52_54 = 1;
                    var11_11 = new Object[var52_54];
                    var11_11[0] = var1_1;
                    var16_16 /* !! */  = ng1_1.d(var3_3, null, (Method)var16_16 /* !! */ , var11_11);
                    var11_11 = var17_17.getClassLoader();
                    var13_13 = new Class[var52_54];
                    var13_13[0] = var17_17;
                    var8_8 /* !! */  = this;
                    var11_11 = Proxy.newProxyInstance((ClassLoader)var11_11, var13_13, (InvocationHandler)this);
                    var51_53 = 1;
                    var13_13 = new Object[var51_53];
                    var52_54 = 0;
                    var8_8 /* !! */  = null;
                    var13_13[0] = var11_11;
                    if ((var16_16 /* !! */  = ng1_1.d((Class)var22_22 /* !! */ , var16_16 /* !! */ , (Method)var4_4 /* !! */ , var13_13)) == null) lbl-1000:
                    // 2 sources

                    {
                        var15_15 /* !! */  = null;
                    } else {
                        var11_11 = new Object[]{};
                        var16_16 /* !! */  = ng1_1.d((Class)var22_22 /* !! */ , var16_16 /* !! */ , (Method)var15_15 /* !! */ , var11_11);
                        var11_11 = new Object[]{};
                        var15_15 /* !! */  = var16_16 /* !! */  = ng1_1.d((Class)var22_22 /* !! */ , var16_16 /* !! */ , (Method)var24_26, var11_11);
                    }
                    if (var15_15 /* !! */  == null) {
                        hg1_2.b();
lbl135:
                        // 3 sources

                        return null;
                    }
                    var14_14 /* !! */  = var16_16 /* !! */ ;
                    var24_26 = var20_20;
                    var4_4 /* !! */  = var31_33 /* !! */ ;
                    var8_8 /* !! */  = var10_10 /* !! */ ;
                    var10_10 /* !! */  = var34_36 /* !! */ ;
                    var13_13 = var44_46 /* !! */ ;
                    var17_17 = var20_20;
                    var40_42 = var18_18;
                    var18_18 = var19_19;
                    var19_19 = var21_21 /* !! */ ;
                    var20_20 = var29_31;
                    var21_21 /* !! */  = var23_23 /* !! */ ;
                    var53_55 = var32_34;
                    var22_22 /* !! */  = var33_35;
                    var44_46 /* !! */  = var35_37;
                    var27_29 /* !! */  = var37_39;
                    var26_28 /* !! */  = var38_40;
                    var28_30 /* !! */  = var39_41;
                    var29_31 = var41_43;
                    var31_33 /* !! */  = var42_44;
                    var30_32 /* !! */  = var43_45;
                    var32_34 = var46_48;
                    var33_35 = var47_49;
                    var34_36 /* !! */  = var48_50;
                    var35_37 = var49_51;
                    var37_39 = var50_52;
                    var16_16 /* !! */  = new hg1_2(var15_15 /* !! */ , var3_3, (Class)var4_4 /* !! */ , var5_5, var6_6, var7_7, (Class)var8_8 /* !! */ , var9_9, (Class)var10_10 /* !! */ , var12_12, (Class)var13_13, (Class)var24_26, var40_42, var18_18, var19_19, (Method)var20_20, (Method)var23_23 /* !! */ , var53_55, (Method)var22_22 /* !! */ , (Method)var44_46 /* !! */ , (Method)var25_27 /* !! */ , (Method)var27_29 /* !! */ , var38_40, var39_41, var41_43, var42_44, var43_45, var46_48, var47_49, var48_50, var49_51, var50_52);
                    var24_26 = hg1_2.class;
                    var2_2 = (int)td0.b(var24_26);
                    if (var2_2 == 0) {
                        try {
                            hg1_2.I = var16_16 /* !! */ ;
                        }
                        catch (Throwable var23_24) {
                            var16_16 /* !! */  = var23_24;
                            td0.a(var24_26, var23_24);
                        }
                    }
                    var2_2 = (int)td0.b(var24_26);
                    if (var2_2 != 0) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var24_26 = null;
                            break block11;
                            break;
                        }
                    }
                    try {
                        var24_26 = hg1_2.I;
                    }
                    catch (Throwable var23_25) {
                        var16_16 /* !! */  = var23_25;
                        td0.a(var24_26, var23_25);
                        ** continue;
                    }
                }
                return var24_26;
            }
            hg1_2.b();
            ** GOTO lbl135
        }
        hg1_2.b();
        ** while (true)
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hg1_2 b(Context context) {
        synchronized (this) {
            Object object = "context";
            try {
                Intrinsics.checkNotNullParameter(context, (String)object);
                object = hg1_2.class;
                boolean bl2 = td0.b(object);
                hg1_2 hg1_22 = null;
                if (!bl2) {
                    try {
                        hg1_22 = hg1_2.I;
                    }
                    catch (Throwable throwable) {
                        td0.a(object, throwable);
                    }
                }
                if (hg1_22 != null) return hg1_22;
                return this.a(context);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Object invoke(Object object, Method method, Object[] objectArray) {
        Intrinsics.checkNotNullParameter(object, "proxy");
        Intrinsics.checkNotNullParameter(method, "m");
        return null;
    }
}

