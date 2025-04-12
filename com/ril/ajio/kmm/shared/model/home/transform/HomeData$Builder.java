/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home.transform;

import com.ril.ajio.kmm.shared.model.home.Banner;
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.kmm.shared.model.home.CMSData;
import com.ril.ajio.kmm.shared.model.home.CMSRequestType;
import com.ril.ajio.kmm.shared.model.home.Component;
import com.ril.ajio.kmm.shared.model.home.Data;
import com.ril.ajio.kmm.shared.model.home.HomeDataUtil;
import com.ril.ajio.kmm.shared.model.home.Page;
import com.ril.ajio.kmm.shared.model.home.SEO;
import com.ril.ajio.kmm.shared.model.home.Slot;
import com.ril.ajio.kmm.shared.model.home.transform.HomeData;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData$Builder;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class HomeData$Builder {
    private final Object[] supportedComponentTypes;

    public HomeData$Builder() {
        Object[] objectArray = new Object[4];
        objectArray[0] = "IMAGE";
        objectArray[1] = "STANDARD";
        objectArray[2] = "AD_COMPONENT";
        Boolean bl2 = Boolean.TRUE;
        objectArray[3] = bl2;
        this.supportedComponentTypes = objectArray;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final HomeData build(CMSData object, ScreenInfo object2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, CMSRequestType cMSRequestType, boolean bl8, boolean bl9, boolean bl10, boolean bl11, boolean bl12, boolean bl13) {
        void var18_143;
        Page page;
        Data data;
        Object object3;
        Object object4;
        Object object5;
        int n3;
        HomeRowData homeRowData;
        String string2;
        block76: {
            List list;
            CMSRequestType cMSRequestType2;
            boolean bl14;
            block75: {
                Page page2;
                Data data2;
                bl14 = bl7;
                cMSRequestType2 = cMSRequestType;
                Intrinsics.checkNotNullParameter(object2, "screenInfo");
                String string3 = "requestType";
                Intrinsics.checkNotNullParameter((Object)cMSRequestType, string3);
                string2 = null;
                if (object != null && (data2 = ((CMSData)object).getData()) != null && (page2 = data2.getPage()) != null && (list = page2.getSlots()) != null) break block75;
                boolean bl15 = false;
                Object var18_142 = null;
                homeRowData = null;
                break block76;
            }
            Iterator iterator = ((Iterable)list).iterator();
            boolean bl16 = false;
            Object var18_22 = null;
            homeRowData = null;
            while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                block77: {
                    void var30_197;
                    block79: {
                        Banner banner;
                        HomeDataUtil homeDataUtil;
                        CMSRequestType cMSRequestType3;
                        Component component;
                        CMSRequestType cMSRequestType4;
                        Object object6;
                        Object object7;
                        int n4;
                        CMSRequestType cMSRequestType5;
                        int n7;
                        int n8;
                        block82: {
                            block80: {
                                block88: {
                                    void var27_174;
                                    Component component2;
                                    block87: {
                                        void var27_170;
                                        Component component3;
                                        block86: {
                                            void var27_166;
                                            Component component4;
                                            block85: {
                                                void var27_162;
                                                Component component5;
                                                block84: {
                                                    Object object8;
                                                    Object object9;
                                                    Object object10;
                                                    Object object11;
                                                    Object object12;
                                                    Object object13;
                                                    Object object14;
                                                    block83: {
                                                        block81: {
                                                            block78: {
                                                                String string4;
                                                                void var18_25;
                                                                void var18_23;
                                                                object5 = (Slot)iterator.next();
                                                                object4 = object5 != null && (object4 = ((Slot)object5).getComponent()) != null ? ((Component)object4).getType() : null;
                                                                if (object5 == null || (object3 = ((Slot)object5).getComponent()) == null || (object3 = ((Component)object3).getBanners()) == null) break block77;
                                                                Object object15 = object3;
                                                                Collection collection = (Collection)object3;
                                                                n8 = collection.isEmpty();
                                                                n7 = 1;
                                                                if ((n8 ^= n7) == 0) break block77;
                                                                if (var18_23 == null) {
                                                                    ArrayList arrayList = new ArrayList();
                                                                }
                                                                var30_197 = var18_25;
                                                                cMSRequestType5 = CMSRequestType.REQUEST_TYPE_HOME;
                                                                if (cMSRequestType2 != cMSRequestType5 || object4 == null || (n8 = object4.length()) == 0 || (n8 = (int)(b.i((String)object4, string4 = "FLOATING_COMPONENT", n7 != 0) ? 1 : 0)) == 0) break block78;
                                                                object14 = new HomeRowData$Builder();
                                                                Component component6 = ((Slot)object5).getComponent();
                                                                if (component6 != null) {
                                                                    Integer n10 = component6.getCarouselTimer();
                                                                    object13 = n10;
                                                                } else {
                                                                    object13 = null;
                                                                }
                                                                Component component7 = ((Slot)object5).getComponent();
                                                                if (component7 != null) {
                                                                    String string5 = component7.getBottomPadding();
                                                                    object12 = string5;
                                                                } else {
                                                                    object12 = null;
                                                                }
                                                                Data data3 = ((CMSData)object).getData();
                                                                if (data3 != null) {
                                                                    BaseValue baseValue = data3.getBaseValue();
                                                                    object11 = baseValue;
                                                                } else {
                                                                    object11 = null;
                                                                }
                                                                Component component8 = ((Slot)object5).getComponent();
                                                                object10 = component8;
                                                                Intrinsics.checkNotNull(component8);
                                                                object9 = bl2;
                                                                object8 = object2;
                                                                homeRowData = ((HomeRowData$Builder)object14).build((List)object3, (Integer)object13, (String)object12, (ScreenInfo)object2, (BaseValue)object11, component8, (Boolean)object9, bl3, bl4, false, bl5, cMSRequestType, bl8, bl9, bl10, bl11, bl12, bl13);
                                                                break block79;
                                                            }
                                                            n8 = 0;
                                                            Object var27_159 = null;
                                                            if (object4 == null || (n4 = object4.length()) == 0 || (n4 = (int)(tp_2.w((Object[])(object7 = this.supportedComponentTypes), object4) ? 1 : 0)) != 0) break block80;
                                                            object7 = "WIDGET";
                                                            if ((n7 = b.i((String)object4, (String)object7, n7 != 0)) == 0) break block81;
                                                            object6 = new String[]{"ITEMS_IN_WISHLIST", "APP_UPDATE"};
                                                            object7 = (Banner)object3.get(0);
                                                            if (object7 != null) {
                                                                object7 = ((Banner)object7).getBannerType();
                                                            } else {
                                                                n4 = 0;
                                                                object7 = null;
                                                            }
                                                            n7 = tp_2.w((Object[])object6, object7);
                                                            if (n7 == 0) break block81;
                                                            cMSRequestType4 = cMSRequestType2;
                                                            break block82;
                                                        }
                                                        if (cMSRequestType2 != cMSRequestType5 || (n7 = ((HomeDataUtil)(object6 = HomeDataUtil.INSTANCE)).isProductWidgetType((String)object4, (Banner)(object7 = (Banner)object3.get(0)), bl2)) == 0) break block83;
                                                        Component component9 = ((Slot)object5).getComponent();
                                                        if (component9 != null) {
                                                            Integer n14 = component9.getCarouselTimer();
                                                            object12 = n14;
                                                        } else {
                                                            object12 = null;
                                                        }
                                                        Component component10 = ((Slot)object5).getComponent();
                                                        if (component10 != null) {
                                                            String string6 = component10.getBottomPadding();
                                                            object8 = string6;
                                                        } else {
                                                            object8 = null;
                                                        }
                                                        Data data4 = ((CMSData)object).getData();
                                                        if (data4 != null) {
                                                            BaseValue baseValue = data4.getBaseValue();
                                                            object10 = baseValue;
                                                        } else {
                                                            object10 = null;
                                                        }
                                                        Component component11 = ((Slot)object5).getComponent();
                                                        object9 = component11;
                                                        Intrinsics.checkNotNull(component11);
                                                        object14 = this;
                                                        object13 = object3;
                                                        object11 = object2;
                                                        this.buildHomeWorData((List)var30_197, (List)object3, (Integer)object12, (String)object8, (ScreenInfo)object2, (BaseValue)object10, component11, bl2, bl3, false, false, bl5, cMSRequestType, bl8, bl9, bl10, bl11, bl12, bl13);
                                                        break block79;
                                                    }
                                                    if (cMSRequestType2 != cMSRequestType5 || (n7 = ((HomeDataUtil)(object6 = HomeDataUtil.INSTANCE)).isSTLType((String)object4, bl3)) == 0) break block84;
                                                    Component component12 = ((Slot)object5).getComponent();
                                                    if (component12 != null) {
                                                        Integer n15 = component12.getCarouselTimer();
                                                        object12 = n15;
                                                    } else {
                                                        object12 = null;
                                                    }
                                                    Component component13 = ((Slot)object5).getComponent();
                                                    if (component13 != null) {
                                                        String string7 = component13.getBottomPadding();
                                                        object8 = string7;
                                                    } else {
                                                        object8 = null;
                                                    }
                                                    Data data5 = ((CMSData)object).getData();
                                                    if (data5 != null) {
                                                        BaseValue baseValue = data5.getBaseValue();
                                                        object10 = baseValue;
                                                    } else {
                                                        object10 = null;
                                                    }
                                                    Component component14 = ((Slot)object5).getComponent();
                                                    object9 = component14;
                                                    Intrinsics.checkNotNull(component14);
                                                    object14 = this;
                                                    object13 = object3;
                                                    object11 = object2;
                                                    this.buildHomeWorData((List)var30_197, (List)object3, (Integer)object12, (String)object8, (ScreenInfo)object2, (BaseValue)object10, component14, bl2, bl3, false, false, bl5, cMSRequestType, bl8, bl9, bl10, bl11, bl12, bl13);
                                                    break block79;
                                                }
                                                if (cMSRequestType2 != cMSRequestType5 || (n7 = ((HomeDataUtil)(object6 = HomeDataUtil.INSTANCE)).isRecentlyViewedType((String)object4, (Banner)(object7 = (Banner)object3.get(0)), bl4, bl14)) == 0) break block85;
                                                Component component15 = ((Slot)object5).getComponent();
                                                if (component15 != null) {
                                                    Integer n16;
                                                    Integer n17 = n16 = component15.getCarouselTimer();
                                                } else {
                                                    n8 = 0;
                                                    Object var27_161 = null;
                                                }
                                                Component component16 = ((Slot)object5).getComponent();
                                                if (component16 != null) {
                                                    String string8 = component16.getBottomPadding();
                                                    object6 = string8;
                                                } else {
                                                    n7 = 0;
                                                    object6 = null;
                                                }
                                                Data data6 = ((CMSData)object).getData();
                                                if (data6 != null) {
                                                    BaseValue baseValue = data6.getBaseValue();
                                                    object7 = baseValue;
                                                } else {
                                                    n4 = 0;
                                                    object7 = null;
                                                }
                                                component = component5 = ((Slot)object5).getComponent();
                                                Intrinsics.checkNotNull(component5);
                                                HomeData$Builder homeData$Builder = this;
                                                object5 = var30_197;
                                                object4 = object3;
                                                object3 = var27_162;
                                                Object object16 = object6;
                                                object6 = object2;
                                                bl14 = bl9;
                                                this.buildHomeWorData((List)var30_197, (List)object4, (Integer)object3, (String)object16, (ScreenInfo)object2, (BaseValue)object7, component, bl2, bl3, bl4, bl7, bl5, cMSRequestType, bl8, bl9, bl10, bl11, bl12, bl13);
                                                break block79;
                                            }
                                            cMSRequestType4 = cMSRequestType;
                                            if (cMSRequestType != cMSRequestType5 || (n7 = ((HomeDataUtil)(object6 = HomeDataUtil.INSTANCE)).isRatingsWidget((String)object4, (Banner)(object7 = (Banner)object3.get(0)), bl7)) == 0) break block86;
                                            Component component17 = ((Slot)object5).getComponent();
                                            if (component17 != null) {
                                                Integer n18;
                                                Integer n19 = n18 = component17.getCarouselTimer();
                                            } else {
                                                n8 = 0;
                                                Object var27_165 = null;
                                            }
                                            Component component18 = ((Slot)object5).getComponent();
                                            if (component18 != null) {
                                                String string9 = component18.getBottomPadding();
                                                object6 = string9;
                                            } else {
                                                n7 = 0;
                                                object6 = null;
                                            }
                                            Data data7 = ((CMSData)object).getData();
                                            if (data7 != null) {
                                                BaseValue baseValue = data7.getBaseValue();
                                                object7 = baseValue;
                                            } else {
                                                n4 = 0;
                                                object7 = null;
                                            }
                                            component = component4 = ((Slot)object5).getComponent();
                                            Intrinsics.checkNotNull(component4);
                                            HomeData$Builder homeData$Builder = this;
                                            object5 = var30_197;
                                            object4 = object3;
                                            object3 = var27_166;
                                            Object object17 = object6;
                                            object6 = object2;
                                            bl14 = bl9;
                                            this.buildHomeWorData((List)var30_197, (List)object4, (Integer)object3, (String)object17, (ScreenInfo)object2, (BaseValue)object7, component, bl2, bl3, bl4, bl7, bl5, cMSRequestType, bl8, bl9, bl10, bl11, bl12, bl13);
                                            break block79;
                                        }
                                        cMSRequestType4 = cMSRequestType;
                                        if (cMSRequestType != cMSRequestType5 || (n7 = ((HomeDataUtil)(object6 = HomeDataUtil.INSTANCE)).isSimilarProductWidgetType((String)object4, (Banner)(object7 = (Banner)object3.get(0)), bl13)) == 0) break block87;
                                        Component component19 = ((Slot)object5).getComponent();
                                        if (component19 != null) {
                                            Integer n20;
                                            Integer n21 = n20 = component19.getCarouselTimer();
                                        } else {
                                            n8 = 0;
                                            Object var27_169 = null;
                                        }
                                        Component component20 = ((Slot)object5).getComponent();
                                        if (component20 != null) {
                                            String string10 = component20.getBottomPadding();
                                            object6 = string10;
                                        } else {
                                            n7 = 0;
                                            object6 = null;
                                        }
                                        Data data8 = ((CMSData)object).getData();
                                        if (data8 != null) {
                                            BaseValue baseValue = data8.getBaseValue();
                                            object7 = baseValue;
                                        } else {
                                            n4 = 0;
                                            object7 = null;
                                        }
                                        component = component3 = ((Slot)object5).getComponent();
                                        Intrinsics.checkNotNull(component3);
                                        HomeData$Builder homeData$Builder = this;
                                        object5 = var30_197;
                                        object4 = object3;
                                        object3 = var27_170;
                                        Object object18 = object6;
                                        object6 = object2;
                                        bl14 = bl9;
                                        this.buildHomeWorData((List)var30_197, (List)object4, (Integer)object3, (String)object18, (ScreenInfo)object2, (BaseValue)object7, component, bl2, bl3, bl4, bl7, bl5, cMSRequestType, bl8, bl9, bl10, bl11, bl12, bl13);
                                        break block79;
                                    }
                                    cMSRequestType4 = cMSRequestType;
                                    if (cMSRequestType != cMSRequestType5 || (n4 = (int)(((HomeDataUtil)(object6 = HomeDataUtil.INSTANCE)).isDynamicWidgetType((String)object4, (Banner)(object7 = (Banner)object3.get(0))) ? 1 : 0)) == 0 && (n7 = ((HomeDataUtil)object6).isCuratedWidgetType((String)object4, (Banner)(object7 = (Banner)object3.get(0)))) == 0) break block88;
                                    Component component21 = ((Slot)object5).getComponent();
                                    if (component21 != null) {
                                        Integer n22;
                                        Integer n24 = n22 = component21.getCarouselTimer();
                                    } else {
                                        n8 = 0;
                                        Object var27_173 = null;
                                    }
                                    Component component22 = ((Slot)object5).getComponent();
                                    if (component22 != null) {
                                        String string11 = component22.getBottomPadding();
                                        object6 = string11;
                                    } else {
                                        n7 = 0;
                                        object6 = null;
                                    }
                                    Data data9 = ((CMSData)object).getData();
                                    if (data9 != null) {
                                        BaseValue baseValue = data9.getBaseValue();
                                        object7 = baseValue;
                                    } else {
                                        n4 = 0;
                                        object7 = null;
                                    }
                                    component = component2 = ((Slot)object5).getComponent();
                                    Intrinsics.checkNotNull(component2);
                                    HomeData$Builder homeData$Builder = this;
                                    object5 = var30_197;
                                    object4 = object3;
                                    object3 = var27_174;
                                    Object object19 = object6;
                                    object6 = object2;
                                    bl14 = bl9;
                                    this.buildHomeWorData((List)var30_197, (List)object4, (Integer)object3, (String)object19, (ScreenInfo)object2, (BaseValue)object7, component, bl2, bl3, bl4, bl7, bl5, cMSRequestType, bl8, bl9, bl10, bl11, bl12, bl13);
                                    break block79;
                                }
                                object6 = CMSRequestType.REQUEST_TYPE_SEARCH;
                                cMSRequestType4 = cMSRequestType;
                                if (cMSRequestType != object6 && cMSRequestType != cMSRequestType5) {
                                    Banner banner2;
                                    HomeDataUtil homeDataUtil2;
                                    if (cMSRequestType == cMSRequestType5 && (bl16 = (homeDataUtil2 = HomeDataUtil.INSTANCE).isOlpCardsWidget((String)object4, banner2 = (Banner)object3.get(0), bl7, bl11))) {
                                        void var27_179;
                                        Component component23;
                                        Component component24 = ((Slot)object5).getComponent();
                                        if (component24 != null) {
                                            Integer n25;
                                            Integer n26 = n25 = component24.getCarouselTimer();
                                        } else {
                                            n8 = 0;
                                            Object var27_178 = null;
                                        }
                                        Component component25 = ((Slot)object5).getComponent();
                                        if (component25 != null) {
                                            String string12 = component25.getBottomPadding();
                                            object6 = string12;
                                        } else {
                                            n7 = 0;
                                            object6 = null;
                                        }
                                        Data data10 = ((CMSData)object).getData();
                                        if (data10 != null) {
                                            BaseValue baseValue = data10.getBaseValue();
                                            object7 = baseValue;
                                        } else {
                                            n4 = 0;
                                            object7 = null;
                                        }
                                        component = component23 = ((Slot)object5).getComponent();
                                        Intrinsics.checkNotNull(component23);
                                        HomeData$Builder homeData$Builder = this;
                                        object5 = var30_197;
                                        object4 = object3;
                                        object3 = var27_179;
                                        Object object20 = object6;
                                        object6 = object2;
                                        bl14 = bl9;
                                        this.buildHomeWorData((List)var30_197, (List)object4, (Integer)object3, (String)object20, (ScreenInfo)object2, (BaseValue)object7, component, bl2, bl3, bl4, bl7, bl5, cMSRequestType, bl8, bl9, bl10, bl11, bl12, bl13);
                                    }
                                    break block79;
                                } else {
                                    Banner banner3;
                                    HomeDataUtil homeDataUtil3 = HomeDataUtil.INSTANCE;
                                    object6 = (Banner)object3.get(0);
                                    bl14 = bl5;
                                    n7 = homeDataUtil3.isImageSearchType(bl5, (String)object4, (Banner)object6);
                                    if (n7 != 0 || (n7 = homeDataUtil3.isRecentSearchType((String)object4, (Banner)(object6 = (Banner)object3.get(0)))) != 0 || bl10 && (bl16 = homeDataUtil3.isWishListType((String)object4, banner3 = (Banner)object3.get(0)))) {
                                        void var27_185;
                                        Component component26;
                                        Component component27 = ((Slot)object5).getComponent();
                                        if (component27 != null) {
                                            Integer n27;
                                            Integer n28 = n27 = component27.getCarouselTimer();
                                        } else {
                                            n8 = 0;
                                            Object var27_184 = null;
                                        }
                                        Component component28 = ((Slot)object5).getComponent();
                                        if (component28 != null) {
                                            String string13 = component28.getBottomPadding();
                                            object6 = string13;
                                        } else {
                                            n7 = 0;
                                            object6 = null;
                                        }
                                        Data data11 = ((CMSData)object).getData();
                                        if (data11 != null) {
                                            BaseValue baseValue = data11.getBaseValue();
                                            object7 = baseValue;
                                        } else {
                                            n4 = 0;
                                            object7 = null;
                                        }
                                        component = component26 = ((Slot)object5).getComponent();
                                        Intrinsics.checkNotNull(component26);
                                        HomeData$Builder homeData$Builder = this;
                                        object5 = var30_197;
                                        object4 = object3;
                                        object3 = var27_185;
                                        Object object21 = object6;
                                        object6 = object2;
                                        bl14 = bl9;
                                        this.buildHomeWorData((List)var30_197, (List)object4, (Integer)object3, (String)object21, (ScreenInfo)object2, (BaseValue)object7, component, false, bl3, false, bl7, bl5, cMSRequestType, bl8, bl9, bl10, bl11, bl12, bl13);
                                    }
                                }
                                break block79;
                            }
                            cMSRequestType4 = cMSRequestType;
                        }
                        if (cMSRequestType4 == cMSRequestType5 || cMSRequestType4 == (cMSRequestType3 = CMSRequestType.REQUEST_TYPE_SEARCH) && ((n7 = (homeDataUtil = HomeDataUtil.INSTANCE).isTrendingCategoryType(bl6, (List)object3)) != 0 || bl10 && (bl16 = homeDataUtil.isWishListType((String)object4, banner = (Banner)object3.get(0))))) {
                            void var27_191;
                            Component component29;
                            Component component30 = ((Slot)object5).getComponent();
                            if (component30 != null) {
                                Integer n29;
                                Integer n30 = n29 = component30.getCarouselTimer();
                            } else {
                                n8 = 0;
                                Object var27_190 = null;
                            }
                            Component component31 = ((Slot)object5).getComponent();
                            if (component31 != null) {
                                String string14 = component31.getBottomPadding();
                                object6 = string14;
                            } else {
                                n7 = 0;
                                object6 = null;
                            }
                            Data data12 = ((CMSData)object).getData();
                            if (data12 != null) {
                                BaseValue baseValue = data12.getBaseValue();
                                object7 = baseValue;
                            } else {
                                n4 = 0;
                                object7 = null;
                            }
                            component = component29 = ((Slot)object5).getComponent();
                            Intrinsics.checkNotNull(component29);
                            HomeData$Builder homeData$Builder = this;
                            object5 = var30_197;
                            object4 = object3;
                            object3 = var27_191;
                            Object[] objectArray = object6;
                            object6 = object2;
                            bl14 = bl9;
                            this.buildHomeWorData((List)var30_197, (List)object4, (Integer)object3, (String)objectArray, (ScreenInfo)object2, (BaseValue)object7, component, bl2, bl3, false, false, bl5, cMSRequestType, bl8, bl9, bl10, bl11, bl12, bl13);
                        }
                    }
                    void var18_38 = var30_197;
                }
                bl14 = bl7;
                cMSRequestType2 = cMSRequestType;
            }
        }
        if (object != null && (object5 = ((CMSData)object).getData()) != null && (object5 = ((Data)object5).getPage()) != null) {
            object5 = ((Page)object5).getPageTitle();
        } else {
            n3 = 0;
            object5 = null;
        }
        if ((object5 == null || (n3 = object5.length()) == 0) && object != null && (object5 = ((CMSData)object).getData()) != null && (object5 = ((Data)object5).getPage()) != null) {
            object4 = ((CMSData)object).getData();
            object4 = object4 != null && (object4 = ((Data)object4).getPage()) != null ? ((Page)object4).getPageName() : null;
            ((Page)object5).setPageTitle((String)object4);
        }
        if (object != null && (object5 = ((CMSData)object).getData()) != null && (object5 = ((Data)object5).getSeo()) != null) {
            object5 = ((SEO)object5).getPageUrl();
        } else {
            n3 = 0;
            object5 = null;
        }
        object3 = object != null && (object3 = ((CMSData)object).getData()) != null && (object3 = ((Data)object3).getPage()) != null ? ((Page)object3).getPageName() : null;
        if (object != null && (data = ((CMSData)object).getData()) != null && (page = data.getPage()) != null) {
            string2 = page.getPageTitle();
        }
        object = object4;
        object2 = var18_143;
        return new HomeData((List)var18_143, (String)object3, string2, homeRowData, (String)object5);
    }

    public final void buildHomeWorData(List list, List list2, Integer n3, String string2, ScreenInfo screenInfo, BaseValue baseValue, Component component, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, CMSRequestType cMSRequestType, boolean bl7, boolean bl8, boolean bl9, boolean bl10, boolean bl11, boolean bl12) {
        Intrinsics.checkNotNullParameter(list2, "banners");
        Intrinsics.checkNotNullParameter(screenInfo, "screenInfo");
        Object object = "requestType";
        Intrinsics.checkNotNullParameter((Object)cMSRequestType, (String)object);
        boolean bl13 = list2.isEmpty();
        if (!bl13 && list != null) {
            object = new HomeRowData$Builder();
            Intrinsics.checkNotNull(component);
            Boolean bl14 = bl2;
            object = ((HomeRowData$Builder)object).build(list2, n3, string2, screenInfo, baseValue, component, bl14, bl3, bl4, bl5, bl6, cMSRequestType, bl7, bl8, bl9, bl10, bl11, bl12);
            list.add(object);
        }
    }

    public final Object[] getSupportedComponentTypes() {
        return this.supportedComponentTypes;
    }
}

