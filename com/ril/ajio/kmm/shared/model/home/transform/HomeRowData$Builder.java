/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home.transform;

import com.ril.ajio.kmm.shared.model.home.Banner;
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.kmm.shared.model.home.CMSRequestType;
import com.ril.ajio.kmm.shared.model.home.Component;
import com.ril.ajio.kmm.shared.model.home.HomeDataUtil;
import com.ril.ajio.kmm.shared.model.home.HomeViewTypes;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData$Builder;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class HomeRowData$Builder {
    private final HomeViewTypes getBannerTypeForBannerList(List object, Integer n3, boolean n4) {
        int n7;
        n4 = object.size();
        int n8 = 0;
        int n10 = 1;
        if (n4 > n10) {
            if (n3 != null) {
                n7 = n3;
            } else {
                n7 = 0;
                n3 = null;
            }
            if (n7 > 0) {
                return HomeViewTypes.ROW_TYPE_CAROUSEL;
            }
        }
        if ((n7 = object.size()) == n10) {
            int n14;
            if ((object = (Banner)object.get(0)) != null && (object = ((Banner)object).getWidth()) != null) {
                double d2 = (Double)object;
                n8 = (int)d2;
            }
            if (n8 == (n14 = 100)) {
                return HomeViewTypes.ROW_TYPE_FULL_IMAGE;
            }
        }
        return HomeViewTypes.ROW_TYPE_HLIST;
    }

    public static /* synthetic */ HomeViewTypes getBannerTypeForBannerList$default(HomeRowData$Builder homeRowData$Builder, List list, Integer n3, boolean bl2, int n4, Object object) {
        if ((n4 &= 4) != 0) {
            bl2 = false;
        }
        return homeRowData$Builder.getBannerTypeForBannerList(list, n3, bl2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final HomeRowData build(List var1_1, Integer var2_2, String var3_3, ScreenInfo var4_4, BaseValue var5_5, Component var6_6, Boolean var7_7, boolean var8_8, boolean var9_9, boolean var10_10, boolean var11_11, CMSRequestType var12_12, boolean var13_13, boolean var14_14, boolean var15_15, boolean var16_16, boolean var17_17, boolean var18_18) {
        block30: {
            block44: {
                block43: {
                    block42: {
                        block41: {
                            block40: {
                                block39: {
                                    block38: {
                                        block37: {
                                            block36: {
                                                block35: {
                                                    block34: {
                                                        block33: {
                                                            var19_19 = var1_1;
                                                            var20_21 = var3_3;
                                                            var21_22 = var4_4 /* !! */ ;
                                                            var22_23 = var5_5;
                                                            var23_24 = var10_10;
                                                            var24_25 /* !! */  = var12_12 /* !! */ ;
                                                            Intrinsics.checkNotNullParameter(var1_1, "bannerList");
                                                            Intrinsics.checkNotNullParameter(var4_4 /* !! */ , "screenInfo");
                                                            var25_26 = var6_6;
                                                            Intrinsics.checkNotNullParameter(var6_6, "component");
                                                            Intrinsics.checkNotNullParameter((Object)var12_12 /* !! */ , "requestType");
                                                            var26_27 = CMSRequestType.REQUEST_TYPE_HOME;
                                                            var27_28 = 1;
                                                            var28_29 = 0;
                                                            var29_30 = null;
                                                            if (var12_12 /* !! */  == var26_27) {
                                                                var30_31 = (Banner)var1_1.get(0);
                                                                if (var30_31 != null) {
                                                                    var30_31 = var30_31.getBannerType();
                                                                } else {
                                                                    var31_32 = false;
                                                                    var30_31 = null;
                                                                }
                                                                var32_33 = "ITEMS_IN_WISHLIST";
                                                                var31_32 = b.i((String)var30_31, (String)var32_33, (boolean)var27_28);
                                                                if (var31_32) {
                                                                    var33_34 /* !! */  = HomeViewTypes.ROW_TYPE_CLOSET;
lbl27:
                                                                    // 11 sources

                                                                    while (true) {
                                                                        var34_35 = false;
                                                                        var24_25 /* !! */  = null;
                                                                        var35_36 = 0;
                                                                        var26_27 = null;
                                                                        break block30;
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            if (var24_25 /* !! */  != var26_27) break block33;
                                                            var30_31 = (Banner)var19_19.get(0);
                                                            if (var30_31 != null) {
                                                                var30_31 = var30_31.getBannerType();
                                                            } else {
                                                                var31_32 = false;
                                                                var30_31 = null;
                                                            }
                                                            var32_33 = "APP_UPDATE";
                                                            var27_28 = b.i((String)var30_31, (String)var32_33, (boolean)var27_28);
                                                            if (var27_28 == 0) break block33;
                                                            var33_34 /* !! */  = HomeViewTypes.ROW_TYPE_APP_UPDATE;
                                                            ** GOTO lbl27
                                                        }
                                                        if (var24_25 /* !! */  == var26_27) {
                                                            var36_37 = HomeDataUtil.INSTANCE;
                                                            var30_31 = var6_6.getType();
                                                            var32_33 = (Banner)var19_19.get(0);
                                                            var37_38 = Boolean.TRUE;
                                                            var38_39 = var7_7;
                                                            var39_40 = Intrinsics.areEqual(var7_7, var37_38);
                                                            var27_28 = var36_37.isProductWidgetType((String)var30_31, (Banner)var32_33, var39_40);
                                                            if (var27_28 != 0) {
                                                                var33_34 /* !! */  = var6_6.getHeading();
                                                                var24_25 /* !! */  = var6_6.getSubHeading();
                                                                var26_27 = HomeViewTypes.ROW_TYPE_PRODUCT_WIDGET;
lbl58:
                                                                // 5 sources

                                                                while (true) {
                                                                    var40_42 /* !! */  = var24_25 /* !! */ ;
                                                                    var24_25 /* !! */  = var33_34 /* !! */ ;
                                                                    var33_34 /* !! */  = var26_27;
                                                                    var26_27 = var40_42 /* !! */ ;
                                                                    break block30;
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        if (var24_25 /* !! */  != var26_27 || (var27_28 = (var36_37 = HomeDataUtil.INSTANCE).isDynamicWidgetType((String)(var30_31 = var6_6.getType()), (Banner)(var32_33 = (Banner)var19_19.get(0)))) == 0) break block34;
                                                        var33_34 /* !! */  = var6_6.getHeading();
                                                        var24_25 /* !! */  = var6_6.getSubHeading();
                                                        var26_27 = HomeViewTypes.ROW_TYPE_DYNAMIC_WIDGET;
                                                        ** GOTO lbl58
                                                    }
                                                    if (var24_25 /* !! */  != var26_27 || (var27_28 = (var36_37 = HomeDataUtil.INSTANCE).isCuratedWidgetType((String)(var30_31 = var6_6.getType()), (Banner)(var32_33 = (Banner)var19_19.get(0)))) == 0) break block35;
                                                    var33_34 /* !! */  = var6_6.getHeading();
                                                    var24_25 /* !! */  = var6_6.getSubHeading();
                                                    var26_27 = HomeViewTypes.ROW_TYPE_CURATED_WIDGET;
                                                    ** GOTO lbl58
                                                }
                                                if (var24_25 /* !! */  != var26_27) break block36;
                                                var36_37 = HomeDataUtil.INSTANCE;
                                                var30_31 = var6_6.getType();
                                                var32_33 = (Banner)var19_19.get(0);
                                                var39_40 = var16_16;
                                                var27_28 = var36_37.isOlpCardsWidget((String)var30_31, (Banner)var32_33, var23_24, var16_16);
                                                if (var27_28 == 0) break block36;
                                                var33_34 /* !! */  = var6_6.getHeading();
                                                var24_25 /* !! */  = var6_6.getSubHeading();
                                                var26_27 = HomeViewTypes.ROW_TYPE_OLP_CARDS_WIDGET;
                                                ** GOTO lbl58
                                            }
                                            if (var24_25 /* !! */  == var26_27) {
                                                var36_37 = HomeDataUtil.INSTANCE;
                                                var30_31 = var6_6.getType();
                                                var41_41 = var8_8;
                                                var27_28 = var36_37.isSTLType((String)var30_31, (boolean)var8_8);
                                                if (var27_28 != 0) {
                                                    var33_34 /* !! */  = var6_6.getHeading();
                                                    var24_25 /* !! */  = var6_6.getSubHeading();
                                                    var26_27 = HomeViewTypes.ROW_TYPE_STL;
                                                    ** continue;
                                                }
                                            }
                                            if (var24_25 /* !! */  != var26_27) break block37;
                                            var36_37 = HomeDataUtil.INSTANCE;
                                            var30_31 = var6_6.getType();
                                            var32_33 = (Banner)var19_19.get(0);
                                            var39_40 = var9_9;
                                            var27_28 = var36_37.isRecentlyViewedType((String)var30_31, (Banner)var32_33, var9_9, var23_24);
                                            if (var27_28 == 0) break block37;
                                            var33_34 /* !! */  = HomeViewTypes.ROW_TYPE_RECENTLYVIEWED_WIDGET;
                                            ** GOTO lbl27
                                        }
                                        if (var24_25 /* !! */  != var26_27 || !(var23_24 = (var36_37 = HomeDataUtil.INSTANCE).isRatingsWidget((String)(var30_31 = var6_6.getType()), (Banner)(var32_33 = (Banner)var19_19.get(0)), var23_24))) break block38;
                                        var33_34 /* !! */  = HomeViewTypes.ROW_TYPE_RATINGS_WIDGET;
                                        ** GOTO lbl27
                                    }
                                    if (var24_25 /* !! */  != var26_27 || !(var23_24 = (var33_34 /* !! */  = HomeDataUtil.INSTANCE).isFloatingComponent((String)(var36_37 = var6_6.getType())))) break block39;
                                    var33_34 /* !! */  = HomeViewTypes.ROW_TYPE_FLOATING_COMPONENT;
                                    ** GOTO lbl27
                                }
                                if (var24_25 /* !! */  != var26_27) break block40;
                                var33_34 /* !! */  = HomeDataUtil.INSTANCE;
                                var36_37 = var6_6.getType();
                                var30_31 = (Banner)var19_19.get(0);
                                var41_41 = var18_18;
                                var23_24 = var33_34 /* !! */ .isSimilarProductWidgetType((String)var36_37, (Banner)var30_31, (boolean)var18_18);
                                if (!var23_24) break block40;
                                var33_34 /* !! */  = HomeViewTypes.ROW_TYPE_SIMILAR_ITEMS;
                                ** GOTO lbl27
                            }
                            if (var24_25 /* !! */  == (var33_34 /* !! */  = CMSRequestType.REQUEST_TYPE_SEARCH) || var24_25 /* !! */  == var26_27) break block41;
                            var23_24 = false;
                            var34_35 = false;
                            var24_25 /* !! */  = null;
                            var35_36 = 4;
                            var7_7 = this;
                            var10_10 = false;
                            var11_11 = var35_36;
                            var12_12 /* !! */  = null;
                            var33_34 /* !! */  = HomeRowData$Builder.getBannerTypeForBannerList$default(this, var1_1, var2_2, false, var35_36, null);
                            ** GOTO lbl27
                        }
                        var33_34 /* !! */  = HomeDataUtil.INSTANCE;
                        var24_25 /* !! */  = var6_6.getType();
                        var26_27 = (Banner)var19_19.get(0);
                        var27_28 = var11_11;
                        var34_35 = var33_34 /* !! */ .isImageSearchType((boolean)var11_11, (String)var24_25 /* !! */ , (Banner)var26_27);
                        if (!var34_35) break block42;
                        var33_34 /* !! */  = HomeViewTypes.ROW_TYPE_IMAGE_SEARCH_WIDGET;
                        ** GOTO lbl27
                    }
                    var24_25 /* !! */  = var6_6.getType();
                    var34_35 = var33_34 /* !! */ .isRecentSearchType((String)var24_25 /* !! */ , (Banner)(var26_27 = (Banner)var19_19.get(0)));
                    if (!var34_35) break block43;
                    var33_34 /* !! */  = HomeViewTypes.ROW_TYPE_RECENT_SEARCH_WIDGET;
                    ** GOTO lbl27
                }
                if (!var15_15 || !(var23_24 = var33_34 /* !! */ .isWishListType((String)(var24_25 /* !! */  = var6_6.getType()), (Banner)(var26_27 = (Banner)var19_19.get(0))))) break block44;
                var33_34 /* !! */  = HomeViewTypes.ROW_TYPE_CLOSET;
                ** GOTO lbl27
            }
            var23_24 = false;
            var34_35 = false;
            var24_25 /* !! */  = null;
            var35_36 = 4;
            var7_7 = this;
            var10_10 = false;
            var11_11 = var35_36;
            var12_12 /* !! */  = null;
            var33_34 /* !! */  = HomeRowData$Builder.getBannerTypeForBannerList$default(this, var1_1, var2_2, false, var35_36, null);
            ** while (true)
        }
        var19_19 = ((Iterable)var19_19).iterator();
        var27_28 = 0;
        var36_37 = null;
        while (var31_32 = var19_19.hasNext()) {
            var30_31 = (Banner)var19_19.next();
            if (var30_31 != null) {
                if (var29_30 == null) {
                    var29_30 = new ArrayList<Object>();
                }
                if (var33_34 /* !! */  == (var32_33 = HomeViewTypes.ROW_TYPE_STL)) {
                    var32_33 = HomeDataUtil.INSTANCE;
                    var39_40 = var13_13;
                    var41_41 = var32_33.isSTLVideoEnabled((Banner)var30_31, var13_13);
                    if (var41_41 != 0) {
                        var32_33 = new BannerData$Builder();
                        var32_33 = var32_33.build((Banner)var30_31, (ScreenInfo)var21_22, var22_23, var27_28);
                        var29_30.add(var32_33);
                    }
                    var28_29 = var17_17;
                } else {
                    var39_40 = var13_13;
                    var32_33 = HomeDataUtil.INSTANCE;
                    var38_39 = var6_6.getType();
                    var28_29 = var17_17;
                    var42_43 = var32_33.isCMSVideoBannerEnabled((Banner)var30_31, var14_14, (String)var38_39, (boolean)var17_17);
                    if (var42_43) {
                        var32_33 = new BannerData$Builder();
                        var32_33 = var32_33.build((Banner)var30_31, (ScreenInfo)var21_22, var22_23, var27_28);
                        var29_30.add(var32_33);
                    } else {
                        var38_39 = var6_6.getType();
                        var41_41 = (int)var32_33.isFloatingWidget((Banner)var30_31, (String)var38_39);
                        if (var41_41 != 0) {
                            var32_33 = new BannerData$Builder();
                            var32_33 = var32_33.build((Banner)var30_31, (ScreenInfo)var21_22, var22_23, var27_28);
                            var29_30.add(var32_33);
                        }
                    }
                }
                var32_33 = var30_31.getAdSpotId();
                if (var32_33 != null && (var41_41 = var32_33.length()) != 0 && (var31_32 = Intrinsics.areEqual(var30_31 = var30_31.isAdBanner(), var32_33 = Boolean.TRUE))) {
                    ++var27_28;
                }
            } else {
                var39_40 = var13_13;
                var28_29 = var17_17;
            }
            var28_29 = 0;
        }
        if (var20_21 != null) {
            var19_19 = "px";
            var43_44 = 6;
            var44_45 = 0;
            var22_23 = null;
            var45_46 = StringsKt.O((CharSequence)var20_21, (String)var19_19, 0, false, var43_44);
            var19_19 = var20_21.substring(0, var45_46);
            var20_21 = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(var19_19, (String)var20_21);
            if (var19_19 == null) break block31;
            try {
                var28_29 = Integer.parseInt((String)var19_19);
                break block32;
            }
            catch (Exception var19_20) {
                var20_21 = System.out;
                var20_21.println(var19_20);
            }
        } else {
            block32: {
                block31: {
                    var44_45 = 0;
                    var22_23 = null;
                }
                var28_29 = 0;
            }
            var44_45 = var28_29;
        }
        var19_19 = var6_6.isDynamicPage();
        var20_21 = var6_6.getBgColor();
        var21_22 = var6_6.getComponentName();
        var3_3 = var25_26;
        var4_4 /* !! */  = var29_30;
        var5_5 = var2_2;
        var7_7 = var33_34 /* !! */ ;
        var12_12 /* !! */  = var19_19;
        var14_14 = 16;
        var25_26 = new HomeRowData(var29_30, var2_2, var44_45, var33_34 /* !! */ , null, (String)var21_22, (String)var24_25 /* !! */ , (String)var26_27, (Boolean)var19_19, (String)var20_21, (int)var14_14, null);
        return var25_26;
    }
}

