/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home.transform;

import com.ril.ajio.kmm.shared.model.home.HomeViewTypes;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class HomeRowData {
    private List banners;
    private String bgColor;
    private int bottomPadding;
    private Integer carouselTimer;
    private String componentName;
    private Object customData;
    private String heading;
    private Boolean isDynamicPage;
    private String subHeading;
    private HomeViewTypes type;

    public HomeRowData(List list, Integer n3, int n4, HomeViewTypes homeViewTypes, Object object, String string2, String string3, String string4, Boolean bl2, String string5) {
        Intrinsics.checkNotNullParameter((Object)homeViewTypes, "type");
        this.banners = list;
        this.carouselTimer = n3;
        this.bottomPadding = n4;
        this.type = homeViewTypes;
        this.customData = object;
        this.componentName = string2;
        this.heading = string3;
        this.subHeading = string4;
        this.isDynamicPage = bl2;
        this.bgColor = string5;
    }

    public /* synthetic */ HomeRowData(List list, Integer n3, int n4, HomeViewTypes homeViewTypes, Object object, String string2, String string3, String string4, Boolean bl2, String string5, int n7, DefaultConstructorMarker defaultConstructorMarker) {
        Boolean bl3;
        int n8 = n7;
        int n10 = n7 & 1;
        List list2 = n10 != 0 ? null : list;
        n10 = n8 & 2;
        Integer n14 = n10 != 0 ? null : n3;
        n10 = n8 & 0x10;
        Object object2 = n10 != 0 ? null : object;
        n10 = n8 & 0x20;
        String string6 = n10 != 0 ? null : string2;
        n10 = n8 & 0x40;
        String string7 = n10 != 0 ? null : string3;
        n10 = n8 & 0x80;
        String string8 = n10 != 0 ? null : string4;
        n10 = n8 & 0x100;
        Boolean bl4 = n10 != 0 ? (bl3 = Boolean.FALSE) : bl2;
        String string9 = (n8 &= 0x200) != 0 ? null : string5;
        this(list2, n14, n4, homeViewTypes, object2, string6, string7, string8, bl4, string9);
    }

    public static /* synthetic */ HomeRowData copy$default(HomeRowData homeRowData, List list, Integer n3, int n4, HomeViewTypes homeViewTypes, Object object, String string2, String string3, String string4, Boolean bl2, String string5, int n7, Object object2) {
        HomeRowData homeRowData2 = homeRowData;
        int n8 = n7;
        int n10 = n7 & 1;
        List list2 = n10 != 0 ? homeRowData.banners : list;
        int n14 = n8 & 2;
        Integer n15 = n14 != 0 ? homeRowData2.carouselTimer : n3;
        int n16 = n8 & 4;
        n16 = n16 != 0 ? homeRowData2.bottomPadding : n4;
        int n17 = n8 & 8;
        HomeViewTypes homeViewTypes2 = n17 != 0 ? homeRowData2.type : homeViewTypes;
        int n18 = n8 & 0x10;
        Object object3 = n18 != 0 ? homeRowData2.customData : object;
        int n19 = n8 & 0x20;
        String string6 = n19 != 0 ? homeRowData2.componentName : string2;
        int n20 = n8 & 0x40;
        String string7 = n20 != 0 ? homeRowData2.heading : string3;
        int n21 = n8 & 0x80;
        String string8 = n21 != 0 ? homeRowData2.subHeading : string4;
        int n22 = n8 & 0x100;
        Boolean bl3 = n22 != 0 ? homeRowData2.isDynamicPage : bl2;
        String string9 = (n8 &= 0x200) != 0 ? homeRowData2.bgColor : string5;
        list = list2;
        n3 = n15;
        n4 = n16;
        homeViewTypes = homeViewTypes2;
        object = object3;
        string2 = string6;
        string3 = string7;
        string4 = string8;
        bl2 = bl3;
        string5 = string9;
        return homeRowData.copy(list2, n15, n16, homeViewTypes2, object3, string6, string7, string8, bl3, string9);
    }

    public final List component1() {
        return this.banners;
    }

    public final String component10() {
        return this.bgColor;
    }

    public final Integer component2() {
        return this.carouselTimer;
    }

    public final int component3() {
        return this.bottomPadding;
    }

    public final HomeViewTypes component4() {
        return this.type;
    }

    public final Object component5() {
        return this.customData;
    }

    public final String component6() {
        return this.componentName;
    }

    public final String component7() {
        return this.heading;
    }

    public final String component8() {
        return this.subHeading;
    }

    public final Boolean component9() {
        return this.isDynamicPage;
    }

    public final HomeRowData copy(List list, Integer n3, int n4, HomeViewTypes homeViewTypes, Object object, String string2, String string3, String string4, Boolean bl2, String string5) {
        Intrinsics.checkNotNullParameter((Object)homeViewTypes, "type");
        HomeRowData homeRowData = new HomeRowData(list, n3, n4, homeViewTypes, object, string2, string3, string4, bl2, string5);
        return homeRowData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof HomeRowData;
        if (n3 == 0) {
            return false;
        }
        object = (HomeRowData)object;
        Object object2 = this.banners;
        Object object3 = ((HomeRowData)object).banners;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.carouselTimer;
        object3 = ((HomeRowData)object).carouselTimer;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.bottomPadding;
        int n4 = ((HomeRowData)object).bottomPadding;
        if (n3 != n4) {
            return false;
        }
        object2 = this.type;
        object3 = ((HomeRowData)object).type;
        if (object2 != object3) {
            return false;
        }
        object2 = this.customData;
        object3 = ((HomeRowData)object).customData;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.componentName;
        object3 = ((HomeRowData)object).componentName;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.heading;
        object3 = ((HomeRowData)object).heading;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.subHeading;
        object3 = ((HomeRowData)object).subHeading;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.isDynamicPage;
        object3 = ((HomeRowData)object).isDynamicPage;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.bgColor;
        object = ((HomeRowData)object).bgColor;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final List getBanners() {
        return this.banners;
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    public final Integer getCarouselTimer() {
        return this.carouselTimer;
    }

    public final String getComponentName() {
        return this.componentName;
    }

    public final Object getCustomData() {
        return this.customData;
    }

    public final String getHeading() {
        return this.heading;
    }

    public final String getSubHeading() {
        return this.subHeading;
    }

    public final HomeViewTypes getType() {
        return this.type;
    }

    public int hashCode() {
        int n3;
        int n4;
        Object object = this.banners;
        int n7 = 0;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = object.hashCode();
        }
        n4 *= 31;
        Object object2 = this.carouselTimer;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = object2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = this.bottomPadding;
        n4 = (n4 + n3) * 31;
        object2 = this.type;
        n3 = (object2.hashCode() + n4) * 31;
        object = this.customData;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = object.hashCode();
        }
        n3 = (n3 + n4) * 31;
        object = this.componentName;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = ((String)object).hashCode();
        }
        n3 = (n3 + n4) * 31;
        object = this.heading;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = ((String)object).hashCode();
        }
        n3 = (n3 + n4) * 31;
        object = this.subHeading;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = ((String)object).hashCode();
        }
        n3 = (n3 + n4) * 31;
        object = this.isDynamicPage;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = object.hashCode();
        }
        n3 = (n3 + n4) * 31;
        object = this.bgColor;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n3 + n7;
    }

    public final Boolean isDynamicPage() {
        return this.isDynamicPage;
    }

    public final void setBanners(List list) {
        this.banners = list;
    }

    public final void setBgColor(String string2) {
        this.bgColor = string2;
    }

    public final void setBottomPadding(int n3) {
        this.bottomPadding = n3;
    }

    public final void setCarouselTimer(Integer n3) {
        this.carouselTimer = n3;
    }

    public final void setComponentName(String string2) {
        this.componentName = string2;
    }

    public final void setCustomData(Object object) {
        this.customData = object;
    }

    public final void setDynamicPage(Boolean bl2) {
        this.isDynamicPage = bl2;
    }

    public final void setHeading(String string2) {
        this.heading = string2;
    }

    public final void setSubHeading(String string2) {
        this.subHeading = string2;
    }

    public final void setType(HomeViewTypes homeViewTypes) {
        Intrinsics.checkNotNullParameter((Object)homeViewTypes, "<set-?>");
        this.type = homeViewTypes;
    }

    public String toString() {
        List list = this.banners;
        Integer n3 = this.carouselTimer;
        int n4 = this.bottomPadding;
        HomeViewTypes homeViewTypes = this.type;
        Object object = this.customData;
        String string2 = this.componentName;
        String string3 = this.heading;
        String string4 = this.subHeading;
        Boolean bl2 = this.isDynamicPage;
        String string5 = this.bgColor;
        StringBuilder stringBuilder = new StringBuilder("HomeRowData(banners=");
        stringBuilder.append(list);
        stringBuilder.append(", carouselTimer=");
        stringBuilder.append(n3);
        stringBuilder.append(", bottomPadding=");
        stringBuilder.append(n4);
        stringBuilder.append(", type=");
        stringBuilder.append((Object)homeViewTypes);
        stringBuilder.append(", customData=");
        stringBuilder.append(object);
        stringBuilder.append(", componentName=");
        stringBuilder.append(string2);
        stringBuilder.append(", heading=");
        X50.a(stringBuilder, string3, ", subHeading=", string4, ", isDynamicPage=");
        stringBuilder.append(bl2);
        stringBuilder.append(", bgColor=");
        stringBuilder.append(string5);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

