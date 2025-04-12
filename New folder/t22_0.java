/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Message
 *  org.json.JSONObject
 */
import android.os.Message;
import com.google.gson.Gson;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.entity.BannerAdData;
import com.ril.ajio.services.entity.GABannerAdData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.json.JSONObject;

/*
 * Renamed from T22
 */
public final class t22_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ q22_0 a;
    public final /* synthetic */ int b;

    public t22_0(q22_0 q22_02, int n3, f80_0 f80_02) {
        this.a = q22_02;
        this.b = n3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        q22_0 q22_02 = this.a;
        int n3 = this.b;
        object = new t22_0(q22_02, n3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (t22_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((t22_0)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block44: {
            block47: {
                block43: {
                    block45: {
                        var2_2 = this;
                        var3_3 = j90_0.COROUTINE_SUSPENDED;
                        vl2_2.b(var1_1);
                        var3_3 = this.a;
                        var4_4 = var3_3.cb().d;
                        var5_5 = h40_0.a;
                        var6_6 = h40_0.T1();
                        var7_7 = h40_0.G1();
                        var8_8 = var4_4.K;
                        var9_9 /* !! */  = var3_3.cb().d.M0;
                        var10_10 = Boolean.TRUE;
                        var11_11 = Intrinsics.areEqual(var9_9 /* !! */ , var10_10);
                        var9_9 /* !! */  = var11_11 != 0 ? "fleek_visit_ajiogram_store" : var3_3.ab();
                        var10_10 = var3_3.B;
                        if (var10_10 == null || !(var12_12 = (var10_10 = var10_10.getAdapter()) instanceof q22)) break block44;
                        var10_10 = var3_3.B;
                        if (var10_10 != null) {
                            var10_10 = var10_10.getAdapter();
                        } else {
                            var12_12 = false;
                            var10_10 = null;
                        }
                        var13_13 = var10_10 instanceof q22;
                        if (var13_13 != 0) {
                            var10_10 = (q22)var10_10;
                        } else {
                            var12_12 = false;
                            var10_10 = null;
                        }
                        if (var10_10 == null || (var14_14 = var2_2.b) <= (var13_13 = var3_3.r0)) break block44;
                        var15_15 = new ArrayList<Object>();
                        var16_16 = new ArrayList();
                        var17_17 = var3_3.r0;
                        var18_18 = null;
                        var19_19 = "";
                        if (var17_17 > var14_14) break block45;
                        while (true) {
                            block42: {
                                block46: {
                                    if ((var20_20 = var10_10.getItemViewType(var17_17)) == (var21_21 = 7) || var20_20 == (var21_21 = 6) || var20_20 == (var21_21 = 19)) break block46;
                                    var23_23 = var3_3.Wa();
                                    var21_21 = (int)var23_23.isViewTypeBanner(var20_20);
                                    if (var21_21 != 0) {
                                        var23_23 = ((cB2)var3_3.P0.get((int)var17_17)).f;
                                        if (var23_23 != null) {
                                            var24_24 = new Integer(var17_17);
                                            var23_23.setBannerIndex((Integer)var24_24);
                                        }
                                        var16_16.add(var23_23);
                                        if (var23_23 != null && (var24_24 = var23_23.getImptrackers()) != null && (var24_24 = (String)var24_24.get(0)) != null) {
                                            var23_23 = var23_23.getCcbValue();
                                            Intrinsics.checkNotNullParameter(var24_24, "url");
                                            var25_25 = k7.p();
                                            var18_18 = String.valueOf(var25_25);
                                            var22_22 = var16_16;
                                            var27_26 = false;
                                            var16_16 = null;
                                            var2_2 = kotlin.text.b.n((String)var24_24, "[trq]", (String)var18_18, false);
                                            if (var23_23 == null) {
                                                var23_23 = var19_19;
                                            }
                                            var24_24 = "[ccb]";
                                            var2_2 = kotlin.text.b.n((String)var2_2, (String)var24_24, (String)var23_23, false);
                                            var23_23 = var3_3.Wa();
                                            var23_23.callBannerViewImpression((String)var2_2);
lbl61:
                                            // 3 sources

                                            while (true) {
                                                var16_16 = var10_10;
                                                break block42;
                                                break;
                                            }
                                        }
                                    }
                                    var22_22 = var16_16;
                                    ** GOTO lbl61
                                }
                                var22_22 = var16_16;
                                var28_27 = var10_10.a;
                                if ((var28_27 = var28_27 != 0 ? var10_10.g(var17_17) : var17_17) < (var21_21 = var8_8.size())) ** break;
                                ** continue;
                                var2_2 = var8_8.get(var28_27);
                                var23_23 = "get(...)";
                                Intrinsics.checkNotNullExpressionValue(var2_2, (String)var23_23);
                                var2_2 = (Product)var2_2;
                                var2_2.setPosition(var17_17);
                                if (var6_6 && (var23_23 = var2_2.getAverageRating()) != null) {
                                    var16_16 = var10_10;
                                    var29_28 = var23_23.doubleValue();
                                    var23_23 = var2_2.getRatingCount();
                                    if (var23_23 != null) {
                                        var18_18 = new StringBuilder();
                                        var18_18.append(var29_28);
                                        var10_10 = "|";
                                        var18_18.append((String)var10_10);
                                        var18_18.append((String)var23_23);
                                        var23_23 = var18_18.toString();
                                        var2_2.setAggregateRating((String)var23_23);
                                    }
                                } else {
                                    var16_16 = var10_10;
                                }
                                var15_15.add(var2_2);
                            }
                            var28_27 = 1;
                            if (var17_17 != var14_14) {
                                var17_17 += var28_27;
                                var2_2 = this;
                                var10_10 = var16_16;
                                var16_16 = var22_22;
                                var18_18 = null;
                                continue;
                            }
                            break block43;
                            break;
                        }
                    }
                    var22_22 = var16_16;
                    var28_27 = 1;
                }
                var21_21 = var15_15.isEmpty() ^ var28_27;
                var2_2 = var3_3.h1;
                var5_5 = "plp_page_title";
                var8_8 = "screenType";
                var10_10 = "screenName";
                if (var21_21 == 0) break block47;
                var23_23 = new Object();
                var23_23.what = var20_20 = 1001;
                var24_24 = new JSONObject();
                var24_24.put("productImpression", var15_15);
                var24_24.put("listName", var9_9 /* !! */ );
                var24_24.put("sizeText", (Object)"NA");
                var27_26 = true;
                var24_24.put("isPLP", var27_26);
                var9_9 /* !! */  = o72_0.a;
                var24_24.put((String)var10_10, var9_9 /* !! */ );
                var24_24.put((String)var8_8, (Object)"plp screen");
                var9_9 /* !! */  = var4_4.i1;
                var24_24.put("plpSourceDetail", var9_9 /* !! */ );
                var9_9 /* !! */  = var4_4.h1;
                var16_16 = "plpSource";
                var24_24.put((String)var16_16, var9_9 /* !! */ );
                var9_9 /* !! */  = var4_4.M;
                if (var9_9 /* !! */  != null) {
                    var9_9 /* !! */  = var9_9 /* !! */ .getFreeTextSearch();
                } else {
                    var11_11 = 0;
                    var9_9 /* !! */  = null;
                }
                var24_24.put((String)var5_5, var9_9 /* !! */ );
                var9_9 /* !! */  = var4_4.M;
                if (var9_9 /* !! */  != null) {
                    var9_9 /* !! */  = var9_9 /* !! */ .getPlpExtendedBanner();
                } else {
                    var11_11 = 0;
                    var9_9 /* !! */  = null;
                }
                if (var9_9 /* !! */  == null) ** GOTO lbl-1000
                var11_11 = 0;
                var9_9 /* !! */  = null;
                var31_29 = (int)var4_4.v(false);
                if (var31_29 == 0 && var7_7) {
                    var4_4 = "yes";
                } else lbl-1000:
                // 2 sources

                {
                    var4_4 = "no";
                }
                var32_30 /* !! */  = "banner_theme_extended";
                var24_24.put((String)var32_30 /* !! */ , var4_4);
                var23_23.obj = var24_24;
                var4_4 = AnalyticsGAEventHandler.Companion.getInstance();
                var4_4.sendMessage((Message)var23_23);
                var4_4.setOnGAEventHandlerListener((OnGAEventHandlerListener)var2_2);
                var21_21 = (int)var15_15.isEmpty();
                var31_29 = 1;
                if ((var21_21 ^= var31_29) == 0) break block47;
                var23_23 = var15_15.iterator();
                while ((var31_29 = (int)var23_23.hasNext()) != 0) {
                    block49: {
                        block48: {
                            var4_4 = (Product)var23_23.next();
                            var32_30 /* !! */  = el1_2.a;
                            var7_7 = el1_2.l();
                            if (!var7_7 || (var32_30 /* !! */  = var4_4.getAdsData()) == null) break block48;
                            var32_30 /* !! */  = el1_2.e(yt2_2.PLP, (Product)var4_4);
                            Intrinsics.checkNotNull(var32_30 /* !! */ );
                            var9_9 /* !! */  = new Gson();
                            var4_4 = var4_4.getAdsData();
                            var4_4 = var9_9 /* !! */ .toJson(var4_4);
                            Intrinsics.checkNotNullExpressionValue(var4_4, "toJson(...)");
                            Intrinsics.checkNotNullParameter(var32_30 /* !! */ , "productId");
                            Intrinsics.checkNotNullParameter(var4_4, "jioAdsTrackerJson");
                            var9_9 /* !! */  = "adSize";
                            Intrinsics.checkNotNullParameter(var19_19, (String)var9_9 /* !! */ );
                            var11_11 = (int)el1_2.j();
                            if (var11_11 != 0) break block49;
                        }
                        var13_13 = 0;
                        var15_15 = null;
                        continue;
                    }
                    var9_9 /* !! */  = el1_2.b;
                    var13_13 = 0;
                    var15_15 = null;
                    var24_24 = new ll1_1((String)var4_4, (String)var32_30 /* !! */ , null);
                    var31_29 = 3;
                    Ae3.d((i90_0)var9_9 /* !! */ , null, null, (Function2)var24_24, var31_29);
                }
            }
            var13_13 = 0;
            var15_15 = null;
            var21_21 = (int)var22_22.isEmpty();
            var31_29 = 1;
            if ((var21_21 ^= var31_29) != 0) {
                var23_23 = var22_22.iterator();
                while ((var31_29 = (int)var23_23.hasNext()) != 0) {
                    var4_4 = (BannerAdData)var23_23.next();
                    var32_30 /* !! */  = new Message();
                    var32_30 /* !! */ .what = var11_11 = 1005;
                    var9_9 /* !! */  = new JSONObject();
                    var24_24 = var3_3.Wa();
                    if (var4_4 != null) {
                        var16_16 = var4_4.getCustomimage();
                    } else {
                        var27_26 = false;
                        var16_16 = null;
                    }
                    var33_31 /* !! */  = var3_3.cb().d.V1;
                    var24_24 = var24_24.getBannerUrl((List)var16_16, var33_31 /* !! */ );
                    var16_16 = "bannerImpression";
                    var9_9 /* !! */ .put((String)var16_16, var24_24);
                    if (var4_4 != null) {
                        var24_24 = var4_4.getBannerIndex();
                    } else {
                        var20_20 = 0;
                        var24_24 = null;
                    }
                    var16_16 = "bannerPosition";
                    var9_9 /* !! */ .put((String)var16_16, var24_24);
                    var24_24 = o72_0.a;
                    var9_9 /* !! */ .put((String)var10_10, var24_24);
                    var24_24 = o72_0.a;
                    var9_9 /* !! */ .put((String)var8_8, var24_24);
                    var24_24 = var3_3.cb().d.M;
                    if (var24_24 != null) {
                        var24_24 = var24_24.getFreeTextSearch();
                    } else {
                        var20_20 = 0;
                        var24_24 = null;
                    }
                    var9_9 /* !! */ .put((String)var5_5, var24_24);
                    var22_22 = null;
                    var34_32 = 255;
                    var24_24 = new GABannerAdData(null, null, null, null, null, null, null, null, var34_32, null);
                    var16_16 = var3_3.Wa();
                    var33_31 /* !! */  = var3_3.G0;
                    var18_18 = var3_3.cb().d.V1;
                    var16_16 = var16_16.getCreativeName((Yj2)var33_31 /* !! */ , (String)var18_18);
                    var24_24.setCreativeName((String)var16_16);
                    if (var4_4 != null) {
                        var16_16 = var4_4.getCmpid();
                    } else {
                        var27_26 = false;
                        var16_16 = null;
                    }
                    var24_24.setCampaignId((String)var16_16);
                    if (var4_4 != null) {
                        var16_16 = var4_4.getBannerIndex();
                    } else {
                        var27_26 = false;
                        var16_16 = null;
                    }
                    var24_24.setBannerIndex((Integer)var16_16);
                    var16_16 = var3_3.Wa();
                    if (var4_4 != null) {
                        var33_31 /* !! */  = var4_4.getCustomimage();
                    } else {
                        var17_17 = 0;
                        var33_31 /* !! */  = null;
                    }
                    var18_18 = var3_3.cb().d.V1;
                    var16_16 = var16_16.getBannerUrl((List)var33_31 /* !! */ , (String)var18_18);
                    var24_24.setUrl((String)var16_16);
                    if (var4_4 != null) {
                        var4_4 = var4_4.getDesc2();
                    } else {
                        var31_29 = 0;
                        var4_4 = null;
                    }
                    var24_24.setImageName((String)var4_4);
                    var24_24.setPageName("plp");
                    var9_9 /* !! */ .put("banner_ad_data", var24_24);
                    var32_30 /* !! */ .obj = var9_9 /* !! */ ;
                    var4_4 = AnalyticsGAEventHandler.Companion;
                    var9_9 /* !! */  = var4_4.getInstance();
                    var9_9 /* !! */ .sendMessage(var32_30 /* !! */ );
                    var4_4 = var4_4.getInstance();
                    var4_4.setOnGAEventHandlerListener((OnGAEventHandlerListener)var2_2);
                }
            }
            var28_27 = 1;
            var3_3.r0 = var14_14 += var28_27;
        }
        return Unit.a;
    }
}

