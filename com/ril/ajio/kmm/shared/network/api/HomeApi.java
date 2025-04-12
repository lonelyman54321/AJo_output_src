/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.network.api;

import com.ril.ajio.kmm.shared.Platform;
import com.ril.ajio.kmm.shared.model.home.CMSData;
import com.ril.ajio.kmm.shared.model.request.HomeReq;
import com.ril.ajio.kmm.shared.network.AJioServiceLocator;
import com.ril.ajio.kmm.shared.network.api.HomeApi$getHomeData$1;
import com.ril.ajio.kmm.shared.util.NetworkUtil;
import com.ril.ajio.kmm.shared.util.Utils;
import io.ktor.client.plugins.ClientRequestException;
import io.ktor.client.plugins.ResponseException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

public final class HomeApi {
    public static final HomeApi INSTANCE;

    static {
        HomeApi homeApi;
        INSTANCE = homeApi = new HomeApi();
    }

    private HomeApi() {
    }

    public static /* synthetic */ Unit a(Map map2, p41_0 p41_02) {
        return HomeApi.getHomeData$lambda$18$lambda$1(map2, p41_02);
    }

    public static /* synthetic */ Object getHomeData$default(HomeApi homeApi, String string2, HomeReq homeReq, Map map2, Map map3, f80_0 f80_02, int n3, Object object) {
        int n4 = n3 & 4;
        Map map4 = n4 != 0 ? null : map2;
        int n7 = n3 & 8;
        Map map5 = n7 != 0 ? null : map3;
        return homeApi.getHomeData(string2, homeReq, map4, map5, f80_02);
    }

    private static final Unit getHomeData$lambda$18$lambda$1(Map object, p41_0 p41_02) {
        Intrinsics.checkNotNullParameter(p41_02, "$this$headers");
        Object object2 = NetworkUtil.INSTANCE;
        ((NetworkUtil)object2).addCommonHeaders(p41_02);
        if (object != null) {
            boolean bl2;
            object = object.entrySet().iterator();
            while (bl2 = object.hasNext()) {
                object2 = (Map.Entry)object.next();
                String string2 = (String)object2.getKey();
                object2 = (String)object2.getValue();
                p41_02.b(string2, (String)object2);
            }
        }
        return Unit.a;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object getHomeData(String var1_1, HomeReq var2_2, Map var3_3, Map var4_4, f80_0 var5_5) {
        block50: {
            block53: {
                block47: {
                    block52: {
                        block48: {
                            block49: {
                                block51: {
                                    var6_6 = var1_1;
                                    var7_9 = var5_5;
                                    var8_10 = 0;
                                    var9_11 = null;
                                    var10_12 = "<this>";
                                    var11_13 = CMSData.class;
                                    var12_14 = JsonObject.class;
                                    var13_15 = "userSubGroup";
                                    var14_16 = "experiments";
                                    var15_17 = var5_5 instanceof HomeApi$getHomeData$1;
                                    if (!var15_17) ** GOTO lbl-1000
                                    var16_18 = var5_5;
                                    var16_18 = (HomeApi$getHomeData$1)var5_5;
                                    var17_19 = var16_18.label;
                                    var18_20 = -1 << -1;
                                    var19_21 = var17_19 & var18_20;
                                    if (var19_21 != 0) {
                                        var16_18.label = var17_19 -= var18_20;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var16_18 = new HomeApi$getHomeData$1(this, (f80_0)var7_9);
                                    }
                                    var7_9 = var16_18.result;
                                    var20_22 = j90_0.COROUTINE_SUSPENDED;
                                    var19_21 = var16_18.label;
                                    var21_23 = 2;
                                    var22_24 = 1;
                                    if (var19_21 == 0) break block51;
                                    if (var19_21 != var22_24) {
                                        if (var19_21 != var21_23) {
                                            var6_6 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            throw var6_6;
                                        }
                                        var6_6 = (jb1_2)var16_18.L$0;
                                        vl2_2.b(var7_9);
                                        break block47;
                                    }
                                    vl2_2.b(var7_9);
                                    ** GOTO lbl-1000
                                }
                                vl2_2.b(var7_9);
                                try {
                                    var7_9 = AJioServiceLocator.INSTANCE;
                                    var7_9 = var7_9.getHttpApiClient();
                                    var23_26 = new db1_2();
                                    var24_27 = fb1_2.a;
                                    Intrinsics.checkNotNullParameter(var23_26, (String)var10_12);
                                    var25_28 = "urlString";
                                    Intrinsics.checkNotNullParameter(var6_6, (String)var25_28);
                                    var25_28 = var23_26.a;
                                    hu3_0.b((eu3_0)var25_28, (String)var6_6);
                                    var25_28 = var4_4;
                                    var6_6 = new F61(var4_4, 0);
                                    Intrinsics.checkNotNullParameter(var23_26, (String)var10_12);
                                    var10_12 = "block";
                                    Intrinsics.checkNotNullParameter(var6_6, (String)var10_12);
                                    var10_12 = var23_26.c;
                                    var6_6.invoke(var10_12);
                                    var6_6 = new HashMap();
                                    var10_12 = "channel";
                                    var25_28 = ml1_2.d;
                                    var26_29 = Platform.INSTANCE;
                                    var27_30 /* !! */  = var26_29.getChannel();
                                    var25_28.getClass();
                                    var28_31 = pe3_2.a;
                                    var27_30 /* !! */  = var25_28.f((b03_0)var28_31, (Serializable)var27_30 /* !! */ );
                                    var6_6.put(var10_12, var27_30 /* !! */ );
                                    var10_12 = "platform";
                                    var27_30 /* !! */  = "MOBILE";
                                    var27_30 /* !! */  = var25_28.f((b03_0)var28_31, (Serializable)var27_30 /* !! */ );
                                    var6_6.put(var10_12, var27_30 /* !! */ );
                                    var10_12 = "tenantId";
                                    var27_30 /* !! */  = "AJIO";
                                    var27_30 /* !! */  = var25_28.f((b03_0)var28_31, (Serializable)var27_30 /* !! */ );
                                    var6_6.put(var10_12, var27_30 /* !! */ );
                                    var10_12 = var2_2.getPcGroup();
                                    if (var10_12 != null) {
                                        var27_30 /* !! */  = "pcGroup";
                                        var10_12 = var25_28.f((b03_0)var28_31, (Serializable)var10_12);
                                        var6_6.put(var27_30 /* !! */ , var10_12);
                                        var10_12 = Unit.a;
                                    }
                                    if ((var10_12 = var2_2.getStore()) != null) {
                                        var27_30 /* !! */  = "store";
                                        var10_12 = var25_28.f((b03_0)var28_31, (Serializable)var10_12);
                                        var6_6.put(var27_30 /* !! */ , var10_12);
                                        var10_12 = Unit.a;
                                    }
                                    if ((var10_12 = var2_2.getPageUrl()) != null) {
                                        var27_30 /* !! */  = "pageUrl";
                                        var10_12 = var25_28.f((b03_0)var28_31, (Serializable)var10_12);
                                        var6_6.put(var27_30 /* !! */ , var10_12);
                                        var10_12 = Unit.a;
                                    }
                                    if ((var10_12 = var2_2.getPageID()) != null) {
                                        var29_25 = var10_12.intValue();
                                        var27_30 /* !! */  = "pageId";
                                        var10_12 = String.valueOf(var29_25);
                                        var10_12 = var25_28.f((b03_0)var28_31, (Serializable)var10_12);
                                        var6_6.put(var27_30 /* !! */ , var10_12);
                                        var10_12 = Unit.a;
                                    }
                                    if ((var10_12 = var2_2.getLoggedIn()) != null) {
                                        var27_30 /* !! */  = "userStatus";
                                        var10_12 = var25_28.f((b03_0)var28_31, (Serializable)var10_12);
                                        var6_6.put(var27_30 /* !! */ , var10_12);
                                        var10_12 = Unit.a;
                                    }
                                    if ((var10_12 = var2_2.getUserType()) != null) {
                                        var30_32 = var10_12.length();
                                        if (var30_32 > 0) {
                                            var27_30 /* !! */  = "userType";
                                            var10_12 = var25_28.f((b03_0)var28_31, (Serializable)var10_12);
                                            var6_6.put(var27_30 /* !! */ , var10_12);
                                        }
                                        var10_12 = Unit.a;
                                    }
                                    if ((var10_12 = var2_2.getCity()) != null) {
                                        var30_32 = var10_12.length();
                                        if (var30_32 > 0) {
                                            var27_30 /* !! */  = "city";
                                            var10_12 = var25_28.f((b03_0)var28_31, (Serializable)var10_12);
                                            var6_6.put(var27_30 /* !! */ , var10_12);
                                        }
                                        var10_12 = Unit.a;
                                    }
                                    if ((var10_12 = var2_2.getState()) != null) {
                                        var30_32 = var10_12.length();
                                        if (var30_32 > 0) {
                                            var27_30 /* !! */  = "state";
                                            var10_12 = var25_28.f((b03_0)var28_31, (Serializable)var10_12);
                                            var6_6.put(var27_30 /* !! */ , var10_12);
                                        }
                                        var10_12 = Unit.a;
                                    }
                                    if ((var10_12 = var2_2.getZone()) != null) {
                                        var30_32 = var10_12.length();
                                        if (var30_32 > 0) {
                                            var27_30 /* !! */  = "zone";
                                            var10_12 = var25_28.f((b03_0)var28_31, (Serializable)var10_12);
                                            var6_6.put(var27_30 /* !! */ , var10_12);
                                        }
                                        var10_12 = Unit.a;
                                    }
                                    if ((var10_12 = var2_2.getPincode()) != null) {
                                        var30_32 = var10_12.length();
                                        if (var30_32 > 0) {
                                            var27_30 /* !! */  = "pincode";
                                            var10_12 = var25_28.f((b03_0)var28_31, (Serializable)var10_12);
                                            var6_6.put(var27_30 /* !! */ , var10_12);
                                        }
                                        var10_12 = Unit.a;
                                    }
                                    if ((var10_12 = var2_2.getTimeStamp()) != null) {
                                        var30_32 = var10_12.length();
                                        if (var30_32 > 0) {
                                            var27_30 /* !! */  = "timeStamp";
                                            var10_12 = var25_28.f((b03_0)var28_31, (Serializable)var10_12);
                                            var6_6.put(var27_30 /* !! */ , var10_12);
                                        }
                                        var10_12 = Unit.a;
                                    }
                                    if ((var10_12 = var2_2.getApiVersion()) != null) {
                                        var30_32 = var10_12.length();
                                        if (var30_32 > 0) {
                                            var27_30 /* !! */  = "apiVersion";
                                            var10_12 = var25_28.f((b03_0)var28_31, (Serializable)var10_12);
                                            var6_6.put(var27_30 /* !! */ , var10_12);
                                        }
                                        var10_12 = Unit.a;
                                    }
                                    if ((var10_12 = var26_29.getClientVersion()) != null) {
                                        var30_32 = var10_12.length();
                                        if (var30_32 > 0) {
                                            var27_30 /* !! */  = "appVersion";
                                            var10_12 = var25_28.f((b03_0)var28_31, (Serializable)var10_12);
                                            var6_6.put(var27_30 /* !! */ , var10_12);
                                        }
                                        var10_12 = Unit.a;
                                    }
                                    if (var3_3 == null) break block48;
                                    var10_12 = var3_3.entrySet();
                                    var10_12 = var10_12.iterator();
                                    break block49;
                                }
                                catch (ResponseException var6_7) {}
                                var7_9 = System.out;
                                var7_9.println(var6_7);
                                var6_6 = var6_7.a;
                                break block52;
                                catch (ClientRequestException var6_8) {}
                                var7_9 = System.out;
                                var7_9.println(var6_8);
                                var6_6 = var6_8.a;
                                break block52;
                            }
                            while ((var21_23 = (int)var10_12.hasNext()) != 0) {
                                var28_31 = var10_12.next();
                                var28_31 = (Map.Entry)var28_31;
                                var27_30 /* !! */  = var28_31.getKey();
                                var27_30 /* !! */  = (String)var27_30 /* !! */ ;
                                var28_31 = var28_31.getValue();
                                var28_31 = (String)var28_31;
                                var24_27 = (int)Intrinsics.areEqual(var27_30 /* !! */ , var14_16);
                                var22_24 = 6;
                                var31_33 = ",";
                                if (var24_27 != 0) {
                                    var27_30 /* !! */  = new String[]{var31_33};
                                    var28_31 = StringsKt.a0((CharSequence)var28_31, var27_30 /* !! */ , false, 0, var22_24);
                                    var32_34 = new ArrayList<String[]>();
                                    var28_31 = (Iterable)var28_31;
                                    var28_31 = var28_31.iterator();
                                    while ((var30_32 = (int)var28_31.hasNext()) != 0) {
                                        var27_30 /* !! */  = var28_31.next();
                                        var27_30 /* !! */  = (String)var27_30 /* !! */ ;
                                        var25_28 = ml1_2.d;
                                        var27_30 /* !! */  = var25_28.g((String)var27_30 /* !! */ );
                                        var32_34.add(var27_30 /* !! */ );
                                    }
                                    var28_31 = ml1_2.d;
                                    var28_31.getClass();
                                    var25_28 = JsonElement.Companion;
                                    var25_28 = var25_28.serializer();
                                    var27_30 /* !! */  = new ip_2((KSerializer)var25_28);
                                    var28_31 = var28_31.f((b03_0)var27_30 /* !! */ , var32_34);
                                    var6_6.put(var14_16, var28_31);
                                } else {
                                    var24_27 = (int)Intrinsics.areEqual(var27_30 /* !! */ , var13_15);
                                    if (var24_27 != 0) {
                                        var27_30 /* !! */  = new String[]{var31_33};
                                        var28_31 = StringsKt.a0((CharSequence)var28_31, var27_30 /* !! */ , false, 0, var22_24);
                                        var32_34 = new ArrayList<String[]>();
                                        var28_31 = (Iterable)var28_31;
                                        var28_31 = var28_31.iterator();
                                        while ((var30_32 = (int)var28_31.hasNext()) != 0) {
                                            var27_30 /* !! */  = var28_31.next();
                                            var27_30 /* !! */  = (String)var27_30 /* !! */ ;
                                            var32_34.add(var27_30 /* !! */ );
                                        }
                                        var28_31 = ml1_2.d;
                                        var28_31.getClass();
                                        var25_28 = pe3_2.a;
                                        var27_30 /* !! */  = new ip_2((KSerializer)var25_28);
                                        var28_31 = var28_31.f((b03_0)var27_30 /* !! */ , var32_34);
                                        var6_6.put(var13_15, var28_31);
                                    } else {
                                        var32_34 = ml1_2.d;
                                        var32_34.getClass();
                                        var25_28 = pe3_2.a;
                                        var28_31 = var32_34.f((b03_0)var25_28, (Serializable)var28_31);
                                        var6_6.put(var27_30 /* !! */ , var28_31);
                                    }
                                }
                                var22_24 = 1;
                            }
                            var9_11 = Unit.a;
                        }
                        var9_11 = ml1_2.d;
                        var9_11.getClass();
                        var13_15 = pe3_2.a;
                        var14_16 = JsonElement.Companion;
                        var14_16 = var14_16.serializer();
                        var10_12 = new p31_0((KSerializer)var13_15, (KSerializer)var14_16);
                        var6_6 = var9_11.f((b03_0)var10_12, (Serializable)var6_6);
                        var6_6 = bm1_1.d((JsonElement)var6_6);
                        var9_11 = "<set-?>";
                        Intrinsics.checkNotNullParameter(var6_6, (String)var9_11);
                        var23_26.d = var6_6;
                        var6_6 = Reflection.getOrCreateKotlinClass(var12_14);
                        try {
                            var10_12 = Reflection.typeOf(var12_14);
                        }
                        catch (Throwable v0) {
                            var29_25 = 0;
                            var10_12 = null;
                        }
                        {
                            var12_14 = new at3_0((yn1_2)var6_6, (kn1_1)var10_12);
                            var23_26.a((at3_0)var12_14);
                            var6_6 = pa1_0.c;
                            Intrinsics.checkNotNullParameter(var6_6, (String)var9_11);
                            var23_26.b = var6_6;
                            var6_6 = new tb1_1(var23_26, (da1_2)var7_9);
                            var16_18.label = var33_35 = 1;
                            var7_9 = var6_6.b(var16_18);
                            if (var7_9 != var20_22) ** GOTO lbl-1000
                            return var20_22;
                        }
lbl-1000:
                        // 2 sources

                        {
                            var6_6 = var7_9 = (jb1_2)var7_9;
                        }
                    }
                    try {
                        var7_9 = var6_6.a();
                        var9_11 = Reflection.getOrCreateKotlinClass(var11_13);
                    }
                    catch (Exception v1) {}
                    try {
                        var10_12 = Reflection.typeOf(var11_13);
                    }
                    catch (Throwable v2) {
                        var29_25 = 0;
                        var10_12 = null;
                    }
                    var11_13 = new at3_0((yn1_2)var9_11, (kn1_1)var10_12);
                    var16_18.L$0 = var6_6;
                    var16_18.label = var8_10 = 2;
                    var7_9 = var7_9.a((at3_0)var11_13, var16_18);
                    if (var7_9 != var20_22) break block47;
                    return var20_22;
                }
                if (var7_9 == null) ** GOTO lbl311
                break block53;
lbl311:
                // 1 sources

                var9_11 = "null cannot be cast to non-null type com.ril.ajio.kmm.shared.model.home.CMSData";
                var7_9 = new NullPointerException((String)var9_11);
                throw var7_9;
            }
            var7_9 = (CMSData)var7_9;
            break block50;
            var8_10 = 3;
            var29_25 = 0;
            var10_12 = null;
            var7_9 = new CMSData(null, null, var8_10, null);
        }
        var9_11 = var6_6.getHeaders().get("usergroup");
        var7_9.setUsergroup((String)var9_11);
        var9_11 = Utils.Companion;
        var34_36 = var6_6.e().a;
        var34_36 = var9_11.checkAndGet3DigitRespCode(var34_36);
        var7_9.setHttpStatusCode(var34_36);
        return var7_9;
    }
}

