/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home.transform;

import com.ril.ajio.kmm.shared.model.home.Banner;
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.kmm.shared.model.home.CMSProduct;
import com.ril.ajio.kmm.shared.model.home.HomeDataUtil;
import com.ril.ajio.kmm.shared.model.home.Hotspot;
import com.ril.ajio.kmm.shared.model.home.SubComponent;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.BannerTypeEnum;
import com.ril.ajio.kmm.shared.model.home.transform.HotSpotT$Builder;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.kmm.shared.model.home.transform.SubComponentT$Builder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class BannerData$Builder {
    private ScreenInfo actualBannerDimen;
    private ScreenInfo bannerDimen;
    private List hotspots;
    private int productCount;
    private String productIds = "";
    private List subComponents;

    /*
     * Unable to fully structure code
     */
    public final BannerData build(Banner var1_1, ScreenInfo var2_2, BaseValue var3_3, int var4_4) {
        block26: {
            block22: {
                block25: {
                    block24: {
                        block23: {
                            var5_5 = this;
                            var6_6 = var1_1;
                            var7_7 = var2_2;
                            var8_8 = var3_3;
                            Intrinsics.checkNotNullParameter(var1_1, "banner");
                            Intrinsics.checkNotNullParameter(var2_2, "screenInfo");
                            var9_9 = var1_1.getWidth();
                            var10_10 = 0.0;
                            var12_11 = var9_9 != null ? var9_9.doubleValue() : var10_10;
                            var14_12 = var12_11 == var10_10 ? 0 : (var12_11 > var10_10 ? 1 : -1);
                            if (var14_12 > 0 && (var14_12 = (cfr_temp_0 = (var12_11 = (var9_9 = var1_1.getHeight()) != null ? var9_9.doubleValue() : var10_10) - var10_10) == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1)) > 0) {
                                var9_9 = HomeDataUtil.INSTANCE;
                                var15_13 = var1_1.getWidth();
                                var16_14 = var1_1.getHeight();
                                var5_5.bannerDimen = var7_7 = var9_9.getViewDimen((Double)var15_13, (Double)var16_14, (ScreenInfo)var7_7, (BaseValue)var8_8);
                                var7_7 = var1_1.getWidth();
                                var15_13 = var1_1.getHeight();
                                var5_5.actualBannerDimen = var7_7 = var9_9.getAcutalViewDimen((Double)var7_7, (Double)var15_13, (BaseValue)var8_8);
                                var7_7 = var1_1.getHotspots();
                                if (var7_7 != null) {
                                    var7_7 = ((Iterable)var7_7).iterator();
                                    while ((var17_15 = var7_7.hasNext()) != 0) {
                                        var8_8 = (Hotspot)var7_7.next();
                                        if (var8_8 == null || (var9_9 = var5_5.bannerDimen) == null) continue;
                                        var15_13 = var5_5.hotspots;
                                        if (var15_13 == null) {
                                            var15_13 = new ArrayList();
                                            var5_5.hotspots = var15_13;
                                        }
                                        if ((var15_13 = var5_5.hotspots) == null) continue;
                                        var16_14 = new HotSpotT$Builder();
                                        var8_8 = var16_14.build((Hotspot)var8_8, (ScreenInfo)var9_9);
                                        var15_13.add(var8_8);
                                    }
                                }
                                if ((var7_7 = var1_1.getSubComponents()) != null) {
                                    var7_7 = ((Iterable)var7_7).iterator();
                                    while ((var17_15 = (int)var7_7.hasNext()) != 0) {
                                        var8_8 = (SubComponent)var7_7.next();
                                        if (var8_8 == null || (var9_9 = var5_5.bannerDimen) == null) continue;
                                        var15_13 = var5_5.subComponents;
                                        if (var15_13 == null) {
                                            var15_13 = new ArrayList();
                                            var5_5.subComponents = var15_13;
                                        }
                                        if ((var15_13 = var5_5.subComponents) == null) continue;
                                        var16_14 = new SubComponentT$Builder();
                                        var8_8 = var16_14.build((SubComponent)var8_8, (ScreenInfo)var9_9);
                                        var15_13.add(var8_8);
                                    }
                                }
                            }
                            var7_7 = var1_1.getProducts();
                            var8_8 = ",";
                            if (var7_7 != null) {
                                var7_7 = ((Iterable)var7_7).iterator();
                                while ((var14_12 = (double)var7_7.hasNext()) != false) {
                                    var9_9 = (CMSProduct)var7_7.next();
                                    var15_13 = var5_5.productIds;
                                    var9_9 = var9_9.getProductId();
                                    var5_5.productIds = var9_9 = n1.a((String)var15_13, (String)var9_9, (String)var8_8);
                                }
                            }
                            var7_7 = var5_5.productIds;
                            var18_16 = var7_7.length();
                            var14_12 = (double)false;
                            var9_9 = null;
                            if (var18_16 > 0) {
                                StringsKt.V(var5_5.productIds, (String)var8_8);
                                var7_7 = var1_1.getProducts();
                                if (var7_7 != null) {
                                    var18_16 = var7_7.size();
                                } else {
                                    var18_16 = 0;
                                    var7_7 = null;
                                }
                                var5_5.productCount = var18_16;
                            }
                            var7_7 = var1_1.getShowTimer();
                            var8_8 = Boolean.TRUE;
                            var18_16 = (int)Intrinsics.areEqual(var7_7, var8_8);
                            var17_15 = 1;
                            if (var18_16 == 0 || (var7_7 = var1_1.getTimerLabel()) != null && (var18_16 = var7_7.length()) != 0) break block23;
                            var7_7 = var1_1.getTimerType();
                            if (var7_7 == null || (var18_16 = var7_7.length()) == 0) ** GOTO lbl-1000
                            var7_7 = var1_1.getTimerType();
                            Intrinsics.checkNotNull(var7_7);
                            var15_13 = "ENDS_IN";
                            var18_16 = (int)b.i(var7_7, (String)var15_13, (boolean)var17_15);
                            if (var18_16 == 0) {
                                var7_7 = "Starts in";
                                var6_6.setTimerLabel((String)var7_7);
                            } else lbl-1000:
                            // 2 sources

                            {
                                var7_7 = "Ends in";
                                var6_6.setTimerLabel((String)var7_7);
                            }
                        }
                        var7_7 = var1_1.getBannerType();
                        var19_17 = false;
                        var15_13 = null;
                        var16_14 = "VIDEO";
                        var20_18 = "GIF";
                        var21_19 = "IMAGE";
                        if (var7_7 != null && (var7_7 = var1_1.getBannerType()) != null && (var18_16 = (int)var7_7.equalsIgnoreCase(var21_19)) == var17_15) {
                            var7_7 = BannerTypeEnum.BANNER_IMAGE;
lbl100:
                            // 4 sources

                            while (true) {
                                var22_21 = var7_7;
                                break block22;
                                break;
                            }
                        }
                        var7_7 = var1_1.getBannerType();
                        if (var7_7 == null || (var7_7 = var1_1.getBannerType()) == null || (var18_16 = (int)var7_7.equalsIgnoreCase((String)var20_18)) != var17_15) break block24;
                        var7_7 = BannerTypeEnum.BANNER_GIF;
                        ** GOTO lbl100
                    }
                    var7_7 = var1_1.getBannerType();
                    if (var7_7 == null || (var7_7 = var1_1.getBannerType()) == null || (var18_16 = (int)var7_7.equalsIgnoreCase((String)var16_14)) != var17_15) break block25;
                    var7_7 = BannerTypeEnum.BANNER_VIDEO;
                    ** GOTO lbl100
                }
                var7_7 = var1_1.getBannerType();
                if (var7_7 != null && (var7_7 = var1_1.getBannerType()) != null && (var18_16 = (int)var7_7.equalsIgnoreCase((String)(var23_20 = "AD"))) == var17_15) {
                    var7_7 = BannerTypeEnum.BANNER_IMAGE;
                    ** continue;
                }
                var22_21 = null;
            }
            var7_7 = var1_1.getMediaType();
            if (var7_7 != null && (var7_7 = var1_1.getMediaType()) != null && (var18_16 = (int)var7_7.equalsIgnoreCase(var21_19)) == var17_15) {
                var15_13 = BannerTypeEnum.BANNER_IMAGE;
lbl122:
                // 4 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var7_7 = var1_1.getMediaType();
            if (var7_7 == null || (var7_7 = var1_1.getMediaType()) == null || (var18_16 = (int)var7_7.equalsIgnoreCase((String)var20_18)) != var17_15) break block26;
            var15_13 = BannerTypeEnum.BANNER_GIF;
            ** GOTO lbl122
        }
        var7_7 = var1_1.getMediaType();
        if (var7_7 == null || (var7_7 = var1_1.getMediaType()) == null || (var18_16 = (int)var7_7.equalsIgnoreCase((String)var16_14)) != var17_15) ** GOTO lbl122
        var15_13 = BannerTypeEnum.BANNER_VIDEO;
        ** while (true)
        var24_22 = var15_13;
        var25_23 = var1_1.getBannerUrl();
        var15_13 = var5_5.bannerDimen;
        var26_24 = var15_13 != null ? (var19_17 = var15_13.getWidth()) : false;
        var15_13 = var5_5.bannerDimen;
        var27_25 = var15_13 != null ? (var19_17 = var15_13.getHeight()) : false;
        var15_13 = var1_1.getShowTimer();
        var28_26 = var15_13 != null ? (var19_17 = (boolean)var15_13.booleanValue()) : false;
        var29_27 = var1_1.getTimerEndTime();
        var30_28 = var5_5.hotspots;
        var15_13 = var5_5.subComponents;
        var16_14 = var5_5.productIds;
        var31_29 = var5_5.productCount;
        var32_30 = var31_29;
        var33_31 = var1_1.getDynamicPageMetadata();
        var34_32 = var1_1.getUuid();
        var35_33 = var1_1.getTimerLabel();
        var36_34 = var1_1.getBannerType();
        var37_35 = var1_1.getThumbnailImage();
        var38_36 = var1_1.getVideoSettings();
        var39_37 = var1_1.getAudioSettings();
        var40_38 = var1_1.getCtaSettings();
        var41_39 = var1_1.getDuration();
        var42_40 = var1_1.getExtendedUrl();
        var20_18 = var1_1.getEnableAdsOnPlp();
        if (var20_18 != null) {
            var17_15 = var20_18.booleanValue();
        }
        var43_41 = (boolean)var17_15;
        var44_42 = var1_1.getWidgetLevel();
        var45_43 = var1_1.getFeedLogic();
        var46_44 = var1_1.getNoOfProducts();
        var47_45 = var1_1.isAdBanner();
        var48_46 = var1_1.getAdSpotId();
        var8_8 = var5_5.actualBannerDimen;
        var49_47 = var8_8 != null ? (var17_15 = var8_8.getWidth()) : 0;
        var8_8 = var5_5.actualBannerDimen;
        if (var8_8 != null) {
            var14_12 = var8_8.getHeight();
            var50_48 = var14_12;
        } else {
            var50_48 = 0;
        }
        var51_49 = var1_1.getAltText();
        var52_50 = var1_1.getShowDefault();
        var23_20 = var7_7;
        var7_7 = new BannerData(var25_23, (int)var26_24, (int)var27_25, var28_26, var29_27, var30_28, (List)var15_13, false, (String)var16_14, var32_30, var33_31, var34_32, var35_33, var36_34, var37_35, var38_36, var39_37, var40_38, (BannerTypeEnum)var22_21, var41_39, (BannerTypeEnum)var24_22, var42_40, var43_41, var44_42, var45_43, var46_44, var47_45, var48_46, var49_47, var50_48, var4_4, var51_49, var52_50, null, 128, 2, null);
        return var7_7;
    }

    public final ScreenInfo getActualBannerDimen() {
        return this.actualBannerDimen;
    }

    public final ScreenInfo getBannerDimen() {
        return this.bannerDimen;
    }

    public final List getHotspots() {
        return this.hotspots;
    }

    public final int getProductCount() {
        return this.productCount;
    }

    public final String getProductIds() {
        return this.productIds;
    }

    public final List getSubComponents() {
        return this.subComponents;
    }

    public final void setActualBannerDimen(ScreenInfo screenInfo) {
        this.actualBannerDimen = screenInfo;
    }

    public final void setBannerDimen(ScreenInfo screenInfo) {
        this.bannerDimen = screenInfo;
    }

    public final void setHotspots(List list) {
        this.hotspots = list;
    }

    public final void setProductCount(int n3) {
        this.productCount = n3;
    }

    public final void setProductIds(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.productIds = string2;
    }

    public final void setSubComponents(List list) {
        this.subComponents = list;
    }
}

