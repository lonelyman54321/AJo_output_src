/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.ril.ajio.services.network.interceptors;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.google.gson.Gson;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Login.CustomerType;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;
import org.json.JSONObject;

public final class JsonParserErrorLogInterceptor
implements nj1_2 {
    private final Context context;

    public JsonParserErrorLogInterceptor(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final boolean isRedirectionResponse(int n3) {
        int n4 = 301;
        n3 = n3 != n4 && n3 != (n4 = 302) ? 0 : 1;
        return n3 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean shouldShowRedirection(String string2) {
        Object object;
        boolean bl2 = false;
        try {
            object = z40_0.Companion;
        }
        catch (Exception exception) {
            return bl2;
        }
        String[] stringArray = this.context;
        object.getClass();
        object = z40$a.a((Context)stringArray);
        object = ((z40_0)object).a;
        stringArray = "redirection_whitelisting_request_ids";
        object = ((ao0_0)object).b((String)stringArray);
        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
        if (bl3) {
            return false;
        }
        stringArray = ",";
        stringArray = new String[]{stringArray};
        int n3 = 6;
        object = StringsKt.a0((CharSequence)object, stringArray, false, 0, n3);
        return object.contains(string2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public cl2_2 intercept(nj1$a var1_1) {
        block26: {
            block24: {
                block28: {
                    block22: {
                        block23: {
                            block30: {
                                block29: {
                                    block21: {
                                        block27: {
                                            block25: {
                                                var2_2 = this;
                                                var3_3 = var1_1;
                                                var4_5 = "keys(...)";
                                                Intrinsics.checkNotNullParameter(var1_1, "chain");
                                                var5_6 = var1_1.request();
                                                var6_7 = var5_6.c;
                                                var7_8 = var1_1.a((kj2_2)var5_6);
                                                var3_3 = var5_6.c;
                                                var8_9 = "RequestId";
                                                var3_3 = var3_3.a(var8_9);
                                                var9_10 = var7_8.d;
                                                var10_11 = 500;
                                                var11_12 = var7_8.g;
                                                if (var10_11 <= var9_10 && var9_10 < (var10_11 = 600)) {
                                                    var12_13 = z40_0.Companion;
                                                    var13_14 = this.context;
                                                    var12_13.getClass();
                                                    var12_13 = z40$a.a((Context)var13_14).a;
                                                    var13_14 = "android_5xx_response_convert_to_json";
                                                    var10_11 = (int)var12_13.a((String)var13_14);
                                                    if (var10_11 != 0) {
                                                        if (var11_12 != null) {
                                                            var3_3 = var11_12.d();
                                                        } else {
                                                            var14_15 = false;
                                                            var3_3 = null;
                                                        }
                                                        if (var11_12 != null) {
                                                            var15_17 = var11_12.k();
                                                        } else {
                                                            var16_19 = false;
                                                            var15_17 = null;
                                                        }
                                                        if (var15_17 != null) {
                                                            var4_5 = new DataError();
                                                            var5_6 = new DataError$ErrorMessage();
                                                            var5_6.setMessage("Please try after some time.");
                                                            var5_6.setLogMessage(var15_17);
                                                            var6_7 = new ArrayList();
                                                            var4_5.errors = var6_7;
                                                            var6_7.add(var5_6);
                                                            var5_6 = new Gson();
                                                            var4_5 = var5_6.toJson(var4_5);
                                                            Intrinsics.checkNotNull(var4_5);
                                                            var3_3 = iL2$b.a((String)var4_5, (jn1_0)var3_3);
                                                            var4_5 = var7_8.h();
                                                            var4_5.g = var3_3;
                                                            return var4_5.a();
                                                        }
                                                        var5_6 = var7_8;
                                                        return var5_6;
                                                    }
                                                }
                                                if ((var10_11 = var6_7.size()) <= 0 || (var12_13 = var6_7.a(var8_9)) == null) break block24;
                                                var12_13 = var6_7.a(var8_9);
                                                var13_14 = "GetCartList";
                                                var17_21 = false;
                                                var10_11 = (int)b.i((String)var12_13, (String)var13_14, false);
                                                var18_22 = "User_Unique_Id_v3";
                                                var19_23 = "User_Type_v3";
                                                var20_24 = "ProductDetails";
                                                var15_18 = "PLPSearchProducts";
                                                var21_25 /* !! */  = "PLPCategoryProducts";
                                                var22_26 = var9_10;
                                                var23_27 = "User_Type";
                                                if (var10_11 != 0) break block25;
                                                var12_13 = var6_7.a(var8_9);
                                                var24_28 = var7_8;
                                                var25_29 = false;
                                                var7_8 = null;
                                                var10_11 = (int)b.i((String)var12_13, var23_27, false);
                                                if (var10_11 == 0 && (var10_11 = (int)b.i((String)(var12_13 = var6_7.a(var8_9)), var21_25 /* !! */ , false)) == 0 && (var10_11 = (int)b.i((String)(var12_13 = var6_7.a(var8_9)), (String)var15_18, false)) == 0 && (var10_11 = (int)b.i((String)(var12_13 = var6_7.a(var8_9)), (String)var20_24, false)) == 0 && (var10_11 = (int)b.i((String)(var12_13 = var6_7.a(var8_9)), var19_23, false)) == 0 && (var10_11 = (int)b.i((String)(var12_13 = var6_7.a(var8_9)), (String)var18_22, false)) == 0) break block26;
                                                break block27;
                                            }
                                            var24_28 = var7_8;
                                        }
                                        var7_8 = z40_0.Companion;
                                        var12_13 = var2_2.context;
                                        var7_8.getClass();
                                        var7_8 = z40$a.a((Context)var12_13).a;
                                        var12_13 = "android_response_json_parsing_enable";
                                        var25_29 = var7_8.a((String)var12_13);
                                        if (!var25_29) break block26;
                                        var6_7 = var6_7.a(var8_9);
                                        var5_6 = var5_6.a.k().toString();
                                        var3_3 = "toString(...)";
                                        Intrinsics.checkNotNullExpressionValue(var5_6, (String)var3_3);
                                        if (var11_12 != null) {
                                            var7_8 = var11_12.d();
                                        } else {
                                            var25_29 = false;
                                            var7_8 = null;
                                        }
                                        var8_9 = var11_12 != null ? var11_12.k() : null;
                                        var12_13 = " and url ";
                                        if (var8_9 == null) break block28;
                                        var26_30 = false;
                                        var11_12 = null;
                                        try {
                                            var27_31 = b.i((String)var6_7, (String)var13_14, false);
                                            if (!var27_31) break block21;
                                            var3_3 = new Gson();
                                            var4_5 = Cart.class;
                                            var3_3.fromJson(var8_9, (Class)var4_5);
                                            break block22;
                                        }
                                        catch (Exception var3_4) {
                                            break block23;
                                        }
                                    }
                                    var26_30 = false;
                                    var11_12 = null;
                                    var9_10 = (int)b.i((String)var6_7, var23_27, false);
                                    if (var9_10 == 0) break block29;
                                    var3_3 = new Gson();
                                    var4_5 = CustomerType.class;
                                    var3_3.fromJson(var8_9, (Class)var4_5);
                                    break block22;
                                }
                                var9_10 = 0;
                                var23_27 = null;
                                var26_30 = b.i((String)var6_7, var21_25 /* !! */ , false);
                                if (var26_30 || (var16_20 = b.i((String)var6_7, (String)var15_18, false))) ** GOTO lbl194
                                var16_20 = b.i((String)var6_7, (String)var20_24, false);
                                if (!var16_20) break block30;
                                var3_3 = new Gson();
                                var4_5 = Product.class;
                                var3_3.fromJson(var8_9, (Class)var4_5);
                                break block22;
                            }
                            var9_10 = 0;
                            var23_27 = null;
                            var16_20 = b.i((String)var6_7, var19_23, false);
                            if (!var16_20 && !(var16_20 = b.i((String)var6_7, (String)var18_22, false))) break block22;
                            var23_27 = new JSONObject(var8_9);
                            var15_18 = "userCohortValue";
                            var26_30 = (var15_18 = var23_27.remove((String)var15_18)) instanceof JSONObject;
                            if (!var26_30) ** GOTO lbl188
                            {
                                var11_12 = new JSONObject();
                                var13_14 = var15_18;
                                var13_14 = (JSONObject)var15_18;
                                var13_14 = var13_14.keys();
                                Intrinsics.checkNotNullExpressionValue(var13_14, (String)var4_5);
                                while (var17_21 = var13_14.hasNext()) {
                                    var21_25 /* !! */  = var13_14.next();
                                    var18_22 = var15_18;
                                    var18_22 = (JSONObject)var15_18;
                                    if ((var18_22 = var18_22.optJSONObject(var21_25 /* !! */ )) != null) {
                                        var19_23 = new JSONObject();
                                        var20_24 = var18_22.keys();
                                        Intrinsics.checkNotNullExpressionValue(var20_24, (String)var4_5);
                                        while ((var22_26 = (int)var20_24.hasNext()) != 0) {
                                            var28_32 = var20_24.next();
                                            var29_33 = var4_5;
                                            var4_5 = var28_32;
                                            var4_5 = (String)var28_32;
                                            var28_32 = var15_18;
                                            var15_18 = var18_22.optJSONObject((String)var4_5);
                                            if (var15_18 != null) {
                                                var30_34 = var13_14;
                                                var13_14 = "cohorts";
                                                var15_18 = var15_18.optString((String)var13_14);
                                            } else {
                                                var30_34 = var13_14;
                                                var16_20 = false;
                                                var15_18 = null;
                                            }
                                            if (var15_18 != null) {
                                                var19_23.put((String)var4_5, var15_18);
                                            }
                                            var15_18 = var28_32;
                                            var4_5 = var29_33;
                                            var13_14 = var30_34;
                                        }
                                        var29_33 = var4_5;
                                        var28_32 = var15_18;
                                        var30_34 = var13_14;
                                        var11_12.put(var21_25 /* !! */ , var19_23);
                                    } else {
                                        var29_33 = var4_5;
                                        var28_32 = var15_18;
                                        var30_34 = var13_14;
                                    }
                                    var15_18 = var28_32;
                                    var4_5 = var29_33;
                                    var13_14 = var30_34;
                                }
                                var4_5 = "userCohortValueV3";
                                var23_27.put((String)var4_5, (Object)var11_12);
lbl188:
                                // 2 sources

                                var4_5 = var23_27.toString();
                                Intrinsics.checkNotNullExpressionValue(var4_5, (String)var3_3);
                                var3_3 = iL2$b.a((String)var4_5, (jn1_0)var7_8);
                                var4_5 = var24_28.h();
                                var4_5.g = var3_3;
                                return var4_5.a();
lbl194:
                                // 1 sources

                                var3_3 = new Gson();
                                var4_5 = ProductsList.class;
                                var3_3.fromJson(var8_9, (Class)var4_5);
                                break block22;
                            }
                        }
                        var4_5 = yn3_0.a;
                        var23_27 = "error in parsing RequestId ";
                        var15_18 = " and exact response is ";
                        var5_6 = og_1.a(var23_27, (String)var6_7, (String)var12_13, (String)var5_6, (String)var15_18);
                        var5_6.append(var8_9);
                        var5_6 = var5_6.toString();
                        var31_35 = false;
                        var6_7 = new Object[]{};
                        var4_5.d((String)var5_6, var6_7);
                        var4_5.e(var3_4);
                    }
                    var3_3 = iL2$b.a(var8_9, (jn1_0)var7_8);
                    var4_5 = var24_28.h();
                    var4_5.g = var3_3;
                    return var4_5.a();
                }
                var3_3 = yn3_0.a;
                var4_5 = UX.c("response body is null for RequestId ", (String)var6_7, (String)var12_13, (String)var5_6);
                var5_6 = new Object[]{};
                var3_3.d((String)var4_5, (Object[])var5_6);
                var5_6 = "JsonParserErrorLogInterceptor";
                var4_5 = new Exception((String)var5_6);
                var3_3.e((Throwable)var4_5);
lbl224:
                // 4 sources

                while (true) {
                    var5_6 = var24_28;
                    return var5_6;
                }
            }
            var24_28 = var7_8;
            var22_26 = var9_10;
        }
        if ((var32_37 = var6_7.size()) <= 0 || var3_3 == null) ** GOTO lbl224
        var32_37 = var22_26;
        var32_37 = (int)var2_2.isRedirectionResponse(var22_26);
        if (var32_37 == 0 || !(var14_16 = var2_2.shouldShowRedirection((String)var3_3))) ** GOTO lbl224
        var3_3 = z40_0.Companion;
        var4_5 = var2_2.context;
        var3_3.getClass();
        var3_3 = z40$a.a((Context)var4_5).a;
        var4_5 = "enableAppRedirection";
        var14_16 = var3_3.a((String)var4_5);
        if (var14_16) ** break;
        ** while (true)
        var3_3 = new Intent("network_redirection");
        var5_6 = var24_28;
        var4_5 = cl2_2.c((cl2_2)var24_28, "location");
        if (var4_5 == null) return var5_6;
        var31_36 = var4_5.length();
        if (var31_36 == 0) return var5_6;
        var6_7 = "redirection_path";
        var3_3.putExtra((String)var6_7, (String)var4_5);
        var4_5 = Xv1.a(var2_2.context);
        var4_5.c((Intent)var3_3);
        return var5_6;
    }
}

