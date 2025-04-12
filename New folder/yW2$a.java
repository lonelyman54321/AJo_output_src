/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.content.Context;
import android.text.TextUtils;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.model.PLPRequest;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.query.ProductListQuery;
import com.ril.ajio.services.utils.NewQueryUtil;
import com.ril.ajio.services.utils.ServiceUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

public final class yW2$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ yw2_0 b;
    public final /* synthetic */ ProductListQuery c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Ref$ObjectRef e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ PLPRequest g;
    public final /* synthetic */ zr1_1 h;

    public yW2$a(yw2_0 yw2_02, ProductListQuery productListQuery, String string2, Ref$ObjectRef ref$ObjectRef, boolean bl2, PLPRequest pLPRequest, zr1_1 zr1_12, f80_0 f80_02) {
        this.b = yw2_02;
        this.c = productListQuery;
        this.d = string2;
        this.e = ref$ObjectRef;
        this.f = bl2;
        this.g = pLPRequest;
        this.h = zr1_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        PLPRequest pLPRequest = this.g;
        zr1_1 zr1_12 = this.h;
        yw2_0 yw2_02 = this.b;
        ProductListQuery productListQuery = this.c;
        String string2 = this.d;
        Ref$ObjectRef ref$ObjectRef = this.e;
        boolean bl2 = this.f;
        object = new yW2$a(yw2_02, productListQuery, string2, ref$ObjectRef, bl2, pLPRequest, zr1_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (yW2$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((yW2$a)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block51: {
            block52: {
                block49: {
                    block50: {
                        var2_2 = this;
                        var3_3 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                        var4_4 = this.a;
                        var5_5 = true;
                        if (!var4_4) break block49;
                        if (var4_4 != var5_5) break block50;
                        vl2_2.b(var1_1);
                        var6_6 = this;
                        break block51;
                    }
                    var3_3 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var3_3 /* !! */ ;
                }
                vl2_2.b(var1_1);
                var6_7 = this.b;
                var7_8 = var6_7.a;
                var8_9 = (String)this.e.element;
                var4_4 = var6_7.B;
                var7_8.getClass();
                var9_10 = this.c;
                Intrinsics.checkNotNullParameter(var9_10, "productListQuery");
                Intrinsics.checkNotNullParameter("search screen", "screenName");
                var10_11 = this.g;
                var11_12 = "plpRequest";
                Intrinsics.checkNotNullParameter(var10_11, (String)var11_12);
                var12_13 = ke0_0.b((ProductListQuery)var9_10, var5_5);
                if (var12_13 != 0) {
                    var11_12 = "search_product_v5";
                } else {
                    var11_12 = h40_0.a;
                    var12_13 = h40_0.m2();
                    var11_12 = var12_13 != 0 ? "search_product_v4" : "search_product_v3";
                }
                var13_14 = new Ref$ObjectRef();
                var14_15 = UrlHelper.Companion.getInstance();
                var15_16 = null;
                var16_17 = new Object[]{};
                var13_14.element = var11_12 = var14_15.getApiUrl("plp", (String)var11_12, (Object[])var16_17);
                var14_15 = new Ref$ObjectRef();
                var14_15.element = var11_12 = "";
                var16_17 = fh1_2.q(NewQueryUtil.INSTANCE.getSearchProductsParameter((ProductListQuery)var9_10));
                var17_18 = new HashMap<Object, Object>();
                var18_19 = var9_10.getStoreId();
                if (var18_19 != null && (var19_20 = var18_19.length())) {
                    cp_1.Companion.getClass();
                    var18_19 = cp$a.e();
                    var20_21 = var9_10.getStoreId();
                    Intrinsics.checkNotNullExpressionValue(var20_21, "getStoreId(...)");
                    var18_19.getClass();
                    var21_22 = cp_1.z(var20_21);
                    var18_19 = "store";
                    var16_17.put(var18_19, var21_22);
                }
                var21_22 = od3_2.a();
                var18_19 = ld3_2.STORE_AJIO;
                var20_21 = var18_19.getStoreId();
                var5_5 = Intrinsics.areEqual(var21_22, var20_21);
                var20_21 = "true";
                if (var5_5) {
                    var21_22 = h40_0.a;
                    var5_5 = h40_0.z1();
                    if (var5_5 && var4_4) {
                        var21_22 = "ospreySearch";
                        var16_17.put(var21_22, var20_21);
                    }
                }
                var5_5 = h40_0.Q1();
                var15_16 = var7_8.d;
                if (!var5_5 || (var21_22 = var15_16.m()) == null) {
                    var22_23 /* !! */  = var3_3 /* !! */ ;
                } else {
                    var21_22 = String.valueOf(var15_16.m());
                    var22_23 /* !! */  = var3_3 /* !! */ ;
                    var3_3 /* !! */  = "pincode";
                    var16_17.put(var3_3 /* !! */ , var21_22);
                }
                var3_3 /* !! */  = cp_1.Companion;
                var3_3 /* !! */ .getClass();
                var23_24 = cp$a.r();
                var21_22 = "userClusterId";
                if (var23_24 != 0) {
                    var3_3 /* !! */  = var9_10.getStoreId();
                    var24_25 = od3_2.a();
                    if (var3_3 /* !! */  == null || (var25_26 = var3_3 /* !! */ .length()) == 0) {
                        var3_3 /* !! */  = var24_25;
                    }
                    if (var19_20 = (int)Intrinsics.areEqual((Object)var3_3 /* !! */ , var18_19 = var18_19.getStoreId())) {
                        var3_3 /* !! */  = "rilfnl";
                    }
                    var18_19 = CustomerStoreType.a;
                    var18_19 = ScreenType.SCREEN_PLP;
                    var3_3 /* !! */  = CustomerStoreType.a((String)var3_3 /* !! */ , (ScreenType)var18_19);
                    var14_15.element = var3_3 /* !! */ ;
                    var23_24 = (int)TextUtils.isEmpty((CharSequence)var3_3 /* !! */ );
                    if (var23_24 == 0) {
                        var3_3 /* !! */  = var14_15.element;
                        var16_17.put(var21_22, var3_3 /* !! */ );
                    }
                }
                var18_19 = var14_15.element;
                var17_18.put("userCohortValues", var18_19);
                var3_3 /* !! */  = (String)var14_15.element;
                var23_24 = mz3_0.y((String)var3_3 /* !! */ );
                if (var23_24 != 0 && (var23_24 = ww0_2.c()) != 0 && (var3_3 /* !! */  = (CharSequence)var14_15.element) != null && (var23_24 = var3_3 /* !! */ .length()) != 0) {
                    var3_3 /* !! */  = var14_15.element;
                    var16_17.put(var21_22, var3_3 /* !! */ );
                }
                var3_3 /* !! */  = var2_2.d;
                var21_22 = "=";
                if (var3_3 /* !! */  != null && (var19_20 = var3_3 /* !! */ .length())) break block52;
                var24_25 = var11_12;
                ** GOTO lbl-1000
            }
            var3_3 /* !! */  = fT1.a((String)var21_22, (String)var3_3 /* !! */ );
            var24_25 = var11_12;
            var18_19 = null;
            var11_12 = new String[0];
            var12_13 = ((Object)(var3_3 /* !! */  = var3_3 /* !! */ .toArray((T[])var11_12))).length;
            if (var12_13 > (var19_20 = 1) && (var12_13 = (int)TextUtils.isEmpty((CharSequence)(var11_12 = var3_3 /* !! */ [var19_20]))) == 0) {
                var26_27 = var14_15;
                var12_13 = 0;
                var11_12 = null;
                var14_15 = var3_3 /* !! */ [0];
                var3_3 /* !! */  = var3_3 /* !! */ [var19_20];
                var16_17.put(var14_15, var3_3 /* !! */ );
            } else lbl-1000:
            // 2 sources

            {
                var26_27 = var14_15;
            }
            var3_3 /* !! */  = z40_0.Companion;
            var3_3 /* !! */  = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var3_3 /* !! */ ).a;
            var11_12 = "plp_additional_query_parameter";
            var3_3 /* !! */  = var3_3 /* !! */ .b((String)var11_12);
            var23_24 = var3_3 /* !! */ .length();
            var14_15 = "&";
            if (var23_24 > 0) {
                var3_3 /* !! */  = z40$a.a((Context)AJIOApplication$a.a()).a.b((String)var11_12);
                var11_12 = new Regex((String)var14_15);
                var3_3 /* !! */  = var11_12.e((CharSequence)var3_3 /* !! */ ).iterator();
                while ((var12_13 = (int)var3_3 /* !! */ .hasNext()) != 0) {
                    var11_12 = (String)var3_3 /* !! */ .next();
                    var19_20 = (int)(var11_12 = fT1.a((String)var21_22, (String)var11_12)).isEmpty();
                    if (!var19_20) {
                        var19_20 = var11_12.size();
                        var18_19 = var11_12.listIterator(var19_20);
                        while ((var27_28 = var18_19.hasPrevious()) != 0) {
                            var28_29 = (String)var18_19.previous();
                            var27_28 = var28_29.length();
                            if (var27_28 == 0) continue;
                            var11_12 = (Iterable)var11_12;
                            var19_20 = var18_19.nextIndex() + 1;
                            var11_12 = CollectionsKt.f0((Iterable)var11_12, var19_20);
                            break;
                        }
                    } else {
                        var11_12 = mz0_2.a;
                    }
                    var11_12 = (Collection)var11_12;
                    var28_29 = var3_3 /* !! */ ;
                    var18_19 = null;
                    var3_3 /* !! */  = new String[]{};
                    var3_3 /* !! */  = (String[])var11_12.toArray((T[])var3_3 /* !! */ );
                    var12_13 = ((Object)var3_3 /* !! */ ).length;
                    var19_20 = 1;
                    if (var12_13 > var19_20 && (var12_13 = (var11_12 = var3_3 /* !! */ [var19_20]).length()) > 0) {
                        var29_30 = var21_22;
                        var12_13 = 0;
                        var11_12 = null;
                        var21_22 = var3_3 /* !! */ [0];
                        var3_3 /* !! */  = var3_3 /* !! */ [var19_20];
                        var16_17.put(var21_22, var3_3 /* !! */ );
                        var3_3 /* !! */  = var28_29;
                        var21_22 = var29_30;
                        continue;
                    }
                    var3_3 /* !! */  = var28_29;
                }
            }
            var3_3 /* !! */  = z40_0.Companion;
            var3_3 /* !! */  = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var3_3 /* !! */ ).a;
            var21_22 = "android_slp_visual_gender_filter";
            var23_24 = (int)var3_3 /* !! */ .a((String)var21_22);
            if (var23_24 == 0 || (var23_24 = (int)var2_2.f) != 0 || (var3_3 /* !! */  = var15_16.e()) == null) {
                var3_3 /* !! */  = var24_25;
            }
            if ((var5_5 = var3_3 /* !! */ .equalsIgnoreCase((String)(var21_22 = "Men"))) || (var5_5 = var3_3 /* !! */ .equalsIgnoreCase((String)(var21_22 = "Women")))) {
                var21_22 = "genderFilter";
                var16_17.put(var21_22, var3_3 /* !! */ );
            }
            var3_3 /* !! */  = z40$a.a((Context)AJIOApplication$a.a()).a;
            var21_22 = "enable_UUID_search";
            var23_24 = (int)var3_3 /* !! */ .a((String)var21_22);
            var11_12 = var7_8.c;
            if (var11_12 != null) {
                var18_19 = var11_12.getCustomerUUID();
            } else {
                var19_20 = 0;
                var18_19 = null;
            }
            var21_22 = "userId";
            if (var23_24 != 0 && (var23_24 = (int)var11_12.isUserOnline()) != 0 && var18_19 != null) {
                var16_17.put(var21_22, var18_19);
            }
            var3_3 /* !! */  = cp_1.Companion;
            var3_3 /* !! */ .getClass();
            var23_24 = (int)cp$a.p();
            if (var23_24 != 0 && (var3_3 /* !! */  = var15_16.f()) != null && (var23_24 = var3_3 /* !! */ .length()) != 0) {
                var3_3 /* !! */  = String.valueOf(var15_16.f());
                var15_16 = "customertype";
                var16_17.put(var15_16, var3_3 /* !! */ );
            }
            if (var8_9 != null && (var23_24 = var8_9.length()) != 0) {
                var3_3 /* !! */  = (CharSequence)var13_14.element;
                var15_16 = null;
                var23_24 = (int)StringsKt.F((CharSequence)var3_3 /* !! */ , (CharSequence)var14_15, false);
                if (var23_24 != 0) {
                    var3_3 /* !! */  = var13_14.element;
                    var15_16 = new StringBuilder();
                    var15_16.append((Object)var3_3 /* !! */ );
                    var15_16.append((String)var14_15);
                    var15_16.append((String)var8_9);
                    var3_3 /* !! */  = var15_16.toString();
                } else {
                    var3_3 /* !! */  = var13_14.element;
                    var14_15 = new StringBuilder();
                    var14_15.append((Object)var3_3 /* !! */ );
                    var14_15.append("?");
                    var14_15.append((String)var8_9);
                    var3_3 /* !! */  = var14_15.toString();
                }
                var13_14.element = var3_3 /* !! */ ;
            }
            if ((var23_24 = (int)(var3_3 /* !! */  = z40$a.a((Context)AJIOApplication$a.a()).a).a((String)(var8_9 = "append_platform_info"))) != 0) {
                var3_3 /* !! */  = "platform";
                var8_9 = "android";
                var16_17.put(var3_3 /* !! */ , var8_9);
            }
            if ((var3_3 /* !! */  = var11_12.getUserSegementIds()) != null && (var23_24 = var3_3 /* !! */ .length()) != 0) {
                var3_3 /* !! */  = "segmentIds";
                var8_9 = var11_12.getUserSegementIds();
                var16_17.put(var3_3 /* !! */ , var8_9);
            }
            if ((var3_3 /* !! */  = var9_10.getSessionId()) != null && (var23_24 = var3_3 /* !! */ .length()) != 0) {
                var3_3 /* !! */  = var7_8.f;
                var8_9 = var9_10.getSessionId();
                var16_17.put(var3_3 /* !! */ , var8_9);
            }
            if ((var3_3 /* !! */  = var9_10.getDeviceid()) != null && (var23_24 = var3_3 /* !! */ .length()) != 0) {
                var3_3 /* !! */  = var7_8.e;
                var8_9 = var9_10.getDeviceid();
                var16_17.put(var3_3 /* !! */ , var8_9);
            }
            if ((var23_24 = (int)Intrinsics.areEqual((Object)(var3_3 /* !! */  = od3_2.a()), var8_9 = var9_10.getStoreId())) != 0 && (var3_3 /* !! */  = var9_10.getBrandCode()) != null) {
                var3_3 /* !! */  = "brandCode";
                var8_9 = var9_10.getBrandCode();
                var16_17.put(var3_3 /* !! */ , var8_9);
            }
            TU2.a((HashMap)var16_17);
            var3_3 /* !! */  = el1_2.a;
            var23_24 = (int)el1_2.k();
            var8_9 = cp$a.e();
            var14_15 = var9_10.getStoreId();
            var15_16 = (String)var13_14.element;
            var19_20 = (int)cp$a.r();
            var8_9.getClass();
            var8_9 = cp_1.a((String)var14_15, (String)var15_16, (boolean)var19_20);
            var14_15 = h40_0.a;
            var30_31 = h40_0.T1();
            if (var30_31) {
                var14_15 = "displayRatings";
                var16_17.put(var14_15, var20_21);
            }
            var30_31 = true;
            ke0_0.c((PLPRequest)var10_11, (LinkedHashMap)var16_17, (ProductListQuery)var9_10, var30_31);
            var15_16 = "userInformation";
            var18_19 = "Cookie";
            var20_21 = "RequestId";
            var2_2 = "ai";
            var1_1 = var13_14;
            var13_14 = "os";
            var29_30 = var7_8;
            var7_8 = "vr";
            var31_32 = "Authorization";
            var10_11 = "ua";
            var32_33 = "Bearer ";
            var14_15 = "PLPSearchProducts";
            if (var23_24 != 0) {
                var3_3 /* !! */  = el1_2.g();
                var33_34 = var3_3 /* !! */ .containsKey(var10_11);
                var34_35 = var33_34 != false ? (String)var3_3 /* !! */ .get(var10_11) : var24_25;
                var35_36 = var3_3 /* !! */ .containsKey(var7_8);
                var36_37 = var35_36 != false ? (String)var3_3 /* !! */ .get(var7_8) : var24_25;
                var37_38 = var3_3 /* !! */ .containsKey(var13_14);
                var38_39 = var37_38 != false ? (String)var3_3 /* !! */ .get(var13_14) : var24_25;
                var39_40 = var3_3 /* !! */ .containsKey(var2_2);
                var3_3 /* !! */  = var39_40 != false ? (String)var3_3 /* !! */ .get(var2_2) : var24_25;
                var39_40 = el1_2.m();
                var40_41 = var15_16;
                var15_16 = String.valueOf(var39_40);
                var41_42 = var21_22;
                var16_17.put("is_ads_enable_slp", var15_16);
                var21_22 = "false";
                var15_16 = "is_ads_enable_plp";
                if (var4_4) {
                    var16_17.put(var15_16, var21_22);
                } else {
                    var4_4 = el1_2.l();
                    var6_7 = String.valueOf(var4_4);
                    var16_17.put(var15_16, var6_7);
                }
                var6_7 = var9_10.getShowAdsOnNextPage();
                var9_10 = "showAdsOnNextPage";
                if (var6_7 != null) {
                    var4_4 = var6_7.booleanValue();
                    var6_7 = String.valueOf(var4_4);
                    var16_17.put(var9_10, var6_7);
                } else {
                    var16_17.put(var9_10, var21_22);
                }
                var17_18.put(var20_21, var14_15);
                var6_7 = var34_35 == null ? var24_25 : var34_35;
                var17_18.put(var10_11, var6_7);
                var6_7 = var36_37 == null ? var24_25 : var36_37;
                var17_18.put(var7_8, var6_7);
                var6_7 = var38_39 == null ? var24_25 : var38_39;
                var17_18.put(var13_14, var6_7);
                if (var3_3 /* !! */  == null) {
                    var3_3 /* !! */  = var24_25;
                }
                var17_18.put(var2_2, (Object)var3_3 /* !! */ );
                if (var8_9 != null && (var42_43 = var8_9.length()) != 0) {
                    var17_18.put(var18_19, var8_9);
                }
                if ((var42_43 = h40_0.M1()) != 0 && (var42_43 = (int)var11_12.isUserOnline()) != 0) {
                    var2_2 = var11_12.getCustomerUUID();
                    var3_3 /* !! */  = var41_42;
                    var16_17.put(var41_42, var2_2);
                }
                var6_7 = var40_41;
                Intrinsics.checkNotNullExpressionValue(var11_12, (String)var40_41);
                var2_2 = ServiceUtil.getToken((UserInformation)var11_12);
                var23_24 = (int)h40_0.M1();
                if (var23_24 != 0 && var2_2 != null && (var23_24 = var2_2.length()) != 0 && (var23_24 = (int)var11_12.isUserOnline()) != 0) {
                    var21_22 = var32_33;
                    var2_2 = var32_33.concat((String)var2_2);
                    var9_10 = var31_32;
                    var17_18.put(var31_32, var2_2);
                }
                var13_14 = null;
                var8_9 = var2_2;
                var7_8 = var29_30;
                var9_10 = var1_1;
                var10_11 = var16_17;
                var11_12 = var17_18;
                var2_2 = new xv2_2((dw2_0)var29_30, (Ref$ObjectRef)var1_1, (LinkedHashMap)var16_17, var17_18, null);
                var3_3 /* !! */  = new br2_2((Function2)var2_2);
                var2_2 = ir0_2.a;
                var2_2 = em0_2.b;
                var2_2 = ms0_1.m((es0_2)var3_3 /* !! */ , (CoroutineContext)var2_2);
                var15_16 = var26_27;
                var3_3 /* !! */  = new vv2_0((es0_2)var2_2, (Ref$ObjectRef)var26_27);
                var2_2 = bg1_1.a;
                var2_2 = ms0_1.m((es0_2)var3_3 /* !! */ , (CoroutineContext)var2_2);
            } else {
                var3_3 /* !! */  = var21_22;
                var6_7 = var15_16;
                var15_16 = var26_27;
                var9_10 = var31_32;
                var21_22 = var32_33;
                var17_18.put(var20_21, var14_15);
                var14_15 = var24_25;
                var17_18.put(var10_11, var24_25);
                var17_18.put(var7_8, var24_25);
                var17_18.put(var13_14, var24_25);
                var17_18.put(var2_2, var24_25);
                if (var8_9 != null && (var42_44 = var8_9.length()) != 0) {
                    var17_18.put(var18_19, var8_9);
                }
                if ((var42_44 = h40_0.M1()) != 0 && (var42_44 = (int)var11_12.isUserOnline()) != 0) {
                    var2_2 = var11_12.getCustomerUUID();
                    var16_17.put(var3_3 /* !! */ , var2_2);
                }
                Intrinsics.checkNotNullExpressionValue(var11_12, (String)var6_7);
                var2_2 = ServiceUtil.getToken((UserInformation)var11_12);
                var23_24 = (int)h40_0.M1();
                if (var23_24 != 0 && var2_2 != null && (var23_24 = var2_2.length()) != 0 && (var23_24 = (int)var11_12.isUserOnline()) != 0) {
                    var2_2 = var21_22.concat((String)var2_2);
                    var17_18.put(var9_10, var2_2);
                }
                var13_14 = null;
                var8_9 = var2_2;
                var7_8 = var29_30;
                var9_10 = var1_1;
                var10_11 = var16_17;
                var11_12 = var17_18;
                var2_2 = new yv2_2((dw2_0)var29_30, (Ref$ObjectRef)var1_1, (LinkedHashMap)var16_17, var17_18, null);
                var3_3 /* !! */  = new br2_2((Function2)var2_2);
                var2_2 = ir0_2.a;
                var2_2 = em0_2.b;
                var2_2 = ms0_1.m((es0_2)var3_3 /* !! */ , (CoroutineContext)var2_2);
                var3_3 /* !! */  = new wv2_1((es0_2)var2_2, (Ref$ObjectRef)var15_16);
                var2_2 = bg1_1.a;
                var2_2 = ms0_1.m((es0_2)var3_3 /* !! */ , (CoroutineContext)var2_2);
            }
            var6_7 = this;
            var21_22 = this.h;
            var3_3 /* !! */  = new yW2$a$a((zr1_1)var21_22, null);
            var8_9 = new at0_1((es0_2)var2_2, (gx0_2)var3_3 /* !! */ );
            var2_2 = new yW2$a$b((zr1_1)var21_22);
            this.a = var23_24 = 1;
            var2_2 = var8_9.collect((fs0_2)var2_2, this);
            var3_3 /* !! */  = var22_23 /* !! */ ;
            if (var2_2 == var22_23 /* !! */ ) {
                return var22_23 /* !! */ ;
            }
        }
        return Unit.a;
    }
}

