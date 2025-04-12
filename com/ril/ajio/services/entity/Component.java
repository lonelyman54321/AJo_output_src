/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.entity;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Component {
    private final ArrayList banners;
    private final String bottomPadding;
    private final Integer carouselTimer;
    private final String componentName;
    private String dynamicAdAsi;
    private List dynamicAdsStdDimensions;
    private final Boolean fitToWidth;
    private final String heading;
    private boolean isDynamicAdsFlowEnabled;
    private final String type;

    public Component() {
        this(null, null, null, null, null, null, null, false, null, null, 1023, null);
    }

    public Component(ArrayList arrayList, String string2, Integer n3, String string3, Boolean bl2, String string4, String string5, boolean bl3, String string6, List list) {
        this.banners = arrayList;
        this.bottomPadding = string2;
        this.carouselTimer = n3;
        this.componentName = string3;
        this.fitToWidth = bl2;
        this.heading = string4;
        this.type = string5;
        this.isDynamicAdsFlowEnabled = bl3;
        this.dynamicAdAsi = string6;
        this.dynamicAdsStdDimensions = list;
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ Component(ArrayList object, String object2, Integer object3, String object4, Boolean object5, String object6, String string2, boolean bl2, String string3, List object7, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        void var29_32;
        String string4;
        String string5;
        Object string6;
        Object bl3;
        Object string7;
        Object n4;
        Object string8;
        Object arrayList;
        int n7 = n3;
        int n8 = n3 & 1;
        Object list = null;
        if (n8 != 0) {
            n8 = 0;
            arrayList = null;
        } else {
            arrayList = object;
        }
        int n10 = n7 & 2;
        if (n10 != 0) {
            n10 = 0;
            string8 = null;
        } else {
            string8 = object2;
        }
        int n14 = n7 & 4;
        if (n14 != 0) {
            n14 = 0;
            n4 = null;
        } else {
            n4 = object3;
        }
        int n15 = n7 & 8;
        if (n15 != 0) {
            n15 = 0;
            string7 = null;
        } else {
            string7 = object4;
        }
        int n16 = n7 & 0x10;
        if (n16 != 0) {
            n16 = 0;
            bl3 = null;
        } else {
            bl3 = object5;
        }
        int n17 = n7 & 0x20;
        if (n17 != 0) {
            n17 = 0;
            string6 = null;
        } else {
            string6 = object6;
        }
        int n18 = n7 & 0x40;
        if (n18 != 0) {
            n18 = 0;
            string5 = null;
        } else {
            string5 = string2;
        }
        int bl4 = n7 & 0x80;
        if (bl4 != 0) {
            boolean bl5 = false;
        } else {
            boolean bl6 = bl2;
        }
        int n19 = n7 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            string4 = null;
        } else {
            string4 = string3;
        }
        if ((n7 &= 0x200) == 0) {
            list = object7;
        }
        object = this;
        object2 = arrayList;
        object3 = string8;
        object4 = n4;
        object5 = string7;
        object6 = bl3;
        string2 = string6;
        object7 = string4;
        this((ArrayList)arrayList, (String)string8, (Integer)n4, (String)string7, (Boolean)bl3, (String)string6, string5, (boolean)var29_32, string4, (List)list);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ Component copy$default(Component component, ArrayList arrayList, String string2, Integer n3, String string3, Boolean bl2, String string4, String string5, boolean bl3, String string6, List list, int n4, Object object) {
        void var29_32;
        Component component2 = component;
        int n7 = n4;
        int n8 = n4 & 1;
        ArrayList arrayList2 = n8 != 0 ? component.banners : arrayList;
        int n10 = n7 & 2;
        String string7 = n10 != 0 ? component2.bottomPadding : string2;
        int n14 = n7 & 4;
        Integer n15 = n14 != 0 ? component2.carouselTimer : n3;
        int n16 = n7 & 8;
        String string8 = n16 != 0 ? component2.componentName : string3;
        int n17 = n7 & 0x10;
        Boolean bl4 = n17 != 0 ? component2.fitToWidth : bl2;
        int n18 = n7 & 0x20;
        String string9 = n18 != 0 ? component2.heading : string4;
        int n19 = n7 & 0x40;
        String string10 = n19 != 0 ? component2.type : string5;
        int bl5 = n7 & 0x80;
        if (bl5 != 0) {
            boolean bl6 = component2.isDynamicAdsFlowEnabled;
        } else {
            boolean bl7 = bl3;
        }
        int n20 = n7 & 0x100;
        String string11 = n20 != 0 ? component2.dynamicAdAsi : string6;
        List list2 = (n7 &= 0x200) != 0 ? component2.dynamicAdsStdDimensions : list;
        arrayList = arrayList2;
        string2 = string7;
        n3 = n15;
        string3 = string8;
        bl2 = bl4;
        string4 = string9;
        string5 = string10;
        bl3 = var29_32;
        string6 = string11;
        list = list2;
        return component.copy(arrayList2, string7, n15, string8, bl4, string9, string10, (boolean)var29_32, string11, list2);
    }

    public final ArrayList component1() {
        return this.banners;
    }

    public final List component10() {
        return this.dynamicAdsStdDimensions;
    }

    public final String component2() {
        return this.bottomPadding;
    }

    public final Integer component3() {
        return this.carouselTimer;
    }

    public final String component4() {
        return this.componentName;
    }

    public final Boolean component5() {
        return this.fitToWidth;
    }

    public final String component6() {
        return this.heading;
    }

    public final String component7() {
        return this.type;
    }

    public final boolean component8() {
        return this.isDynamicAdsFlowEnabled;
    }

    public final String component9() {
        return this.dynamicAdAsi;
    }

    public final Component copy(ArrayList arrayList, String string2, Integer n3, String string3, Boolean bl2, String string4, String string5, boolean bl3, String string6, List list) {
        Component component = new Component(arrayList, string2, n3, string3, bl2, string4, string5, bl3, string6, list);
        return component;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Component;
        if (!bl3) {
            return false;
        }
        object = (Component)object;
        Object object2 = this.banners;
        Object object3 = ((Component)object).banners;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bottomPadding;
        object3 = ((Component)object).bottomPadding;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.carouselTimer;
        object3 = ((Component)object).carouselTimer;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.componentName;
        object3 = ((Component)object).componentName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.fitToWidth;
        object3 = ((Component)object).fitToWidth;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.heading;
        object3 = ((Component)object).heading;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.type;
        object3 = ((Component)object).type;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.isDynamicAdsFlowEnabled;
        boolean bl4 = ((Component)object).isDynamicAdsFlowEnabled;
        if (bl3 != bl4) {
            return false;
        }
        object2 = this.dynamicAdAsi;
        object3 = ((Component)object).dynamicAdAsi;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.dynamicAdsStdDimensions;
        object = ((Component)object).dynamicAdsStdDimensions;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getBanners() {
        return this.banners;
    }

    public final String getBottomPadding() {
        return this.bottomPadding;
    }

    public final Integer getCarouselTimer() {
        return this.carouselTimer;
    }

    public final String getComponentName() {
        return this.componentName;
    }

    public final String getDynamicAdAsi() {
        return this.dynamicAdAsi;
    }

    public final List getDynamicAdsStdDimensions() {
        return this.dynamicAdsStdDimensions;
    }

    public final Boolean getFitToWidth() {
        return this.fitToWidth;
    }

    public final String getHeading() {
        return this.heading;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int n3;
        int n4;
        ArrayList arrayList = this.banners;
        int n7 = 0;
        if (arrayList == null) {
            n4 = 0;
            arrayList = null;
        } else {
            n4 = arrayList.hashCode();
        }
        n4 *= 31;
        Object object = this.bottomPadding;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.carouselTimer;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.componentName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.fitToWidth;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.heading;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.type;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isDynamicAdsFlowEnabled ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.dynamicAdAsi;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.dynamicAdsStdDimensions;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final boolean isDynamicAdsFlowEnabled() {
        return this.isDynamicAdsFlowEnabled;
    }

    public final void setDynamicAdAsi(String string2) {
        this.dynamicAdAsi = string2;
    }

    public final void setDynamicAdsFlowEnabled(boolean bl2) {
        this.isDynamicAdsFlowEnabled = bl2;
    }

    public final void setDynamicAdsStdDimensions(List list) {
        this.dynamicAdsStdDimensions = list;
    }

    public String toString() {
        ArrayList arrayList = this.banners;
        String string2 = this.bottomPadding;
        Integer n3 = this.carouselTimer;
        String string3 = this.componentName;
        Boolean bl2 = this.fitToWidth;
        String string4 = this.heading;
        String string5 = this.type;
        boolean bl3 = this.isDynamicAdsFlowEnabled;
        String string6 = this.dynamicAdAsi;
        List list = this.dynamicAdsStdDimensions;
        StringBuilder stringBuilder = new StringBuilder("Component(banners=");
        stringBuilder.append(arrayList);
        stringBuilder.append(", bottomPadding=");
        stringBuilder.append(string2);
        stringBuilder.append(", carouselTimer=");
        stringBuilder.append(n3);
        stringBuilder.append(", componentName=");
        stringBuilder.append(string3);
        stringBuilder.append(", fitToWidth=");
        xi0_2.a(bl2, ", heading=", string4, ", type=", stringBuilder);
        stringBuilder.append(string5);
        stringBuilder.append(", isDynamicAdsFlowEnabled=");
        stringBuilder.append(bl3);
        stringBuilder.append(", dynamicAdAsi=");
        stringBuilder.append(string6);
        stringBuilder.append(", dynamicAdsStdDimensions=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

