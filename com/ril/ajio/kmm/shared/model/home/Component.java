/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.Banner$$serializer;
import com.ril.ajio.kmm.shared.model.home.Component$Companion;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class Component {
    private static final KSerializer[] $childSerializers;
    public static final Component$Companion Companion;
    private List banners;
    private String bgColor;
    private String bottomPadding;
    private Integer carouselTimer;
    private String componentName;
    private String heading;
    private Boolean isDynamicPage;
    private String subHeading;
    private String type;

    static {
        Object object = new Component$Companion(null);
        Companion = object;
        KSerializer[] kSerializerArray = xe_1.p(Banner$$serializer.INSTANCE);
        object = new ip_2((KSerializer)kSerializerArray);
        kSerializerArray = new KSerializer[]{object, null, null, null, null, null, null, null, null};
        $childSerializers = kSerializerArray;
    }

    public Component() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public /* synthetic */ Component(int n3, List object, String string2, Integer n4, String string3, String string4, String string5, Boolean bl2, String string6, String string7, a03_0 a03_02) {
        int n7 = n3 & 1;
        this.banners = n7 == 0 ? null : object;
        int n8 = n3 & 2;
        this.bottomPadding = n8 == 0 ? null : string2;
        n8 = n3 & 4;
        this.carouselTimer = n8 == 0 ? null : n4;
        n8 = n3 & 8;
        this.type = n8 == 0 ? null : string3;
        n8 = n3 & 0x10;
        this.heading = n8 == 0 ? null : string4;
        n8 = n3 & 0x20;
        this.subHeading = n8 == 0 ? null : string5;
        n8 = n3 & 0x40;
        this.isDynamicPage = n8 == 0 ? (object = Boolean.FALSE) : bl2;
        n8 = n3 & 0x80;
        this.bgColor = n8 == 0 ? null : string6;
        this.componentName = (n3 &= 0x100) == 0 ? null : string7;
    }

    public Component(List list, String string2, Integer n3, String string3, String string4, String string5, Boolean bl2, String string6, String string7) {
        this.banners = list;
        this.bottomPadding = string2;
        this.carouselTimer = n3;
        this.type = string3;
        this.heading = string4;
        this.subHeading = string5;
        this.isDynamicPage = bl2;
        this.bgColor = string6;
        this.componentName = string7;
    }

    public /* synthetic */ Component(List object, String object2, Integer object3, String object4, String string2, String string3, Boolean object5, String object6, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string5;
        String string6;
        String string7;
        String string8;
        Integer n4;
        String string9;
        List list;
        int n7 = n3;
        int n8 = n3 & 1;
        String string10 = null;
        if (n8 != 0) {
            n8 = 0;
            list = null;
        } else {
            list = object;
        }
        int n10 = n7 & 2;
        if (n10 != 0) {
            n10 = 0;
            string9 = null;
        } else {
            string9 = object2;
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
            string8 = null;
        } else {
            string8 = object4;
        }
        int n16 = n7 & 0x10;
        if (n16 != 0) {
            n16 = 0;
            string7 = null;
        } else {
            string7 = string2;
        }
        int n17 = n7 & 0x20;
        if (n17 != 0) {
            n17 = 0;
            string6 = null;
        } else {
            string6 = string3;
        }
        int n18 = n7 & 0x40;
        Object object7 = n18 != 0 ? Boolean.FALSE : object5;
        int n19 = n7 & 0x80;
        if (n19 != 0) {
            n19 = 0;
            string5 = null;
        } else {
            string5 = object6;
        }
        if ((n7 &= 0x100) == 0) {
            string10 = string4;
        }
        object = this;
        object2 = list;
        object3 = string9;
        object4 = n4;
        string2 = string8;
        string3 = string7;
        object5 = string6;
        object6 = object7;
        string4 = string5;
        this(list, string9, n4, string8, string7, string6, (Boolean)object7, string5, string10);
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ Component copy$default(Component component, List list, String string2, Integer n3, String string3, String string4, String string5, Boolean bl2, String string6, String string7, int n4, Object object) {
        Component component2 = component;
        int n7 = n4;
        int n8 = n4 & 1;
        List list2 = n8 != 0 ? component.banners : list;
        int n10 = n7 & 2;
        String string8 = n10 != 0 ? component2.bottomPadding : string2;
        int n14 = n7 & 4;
        Integer n15 = n14 != 0 ? component2.carouselTimer : n3;
        int n16 = n7 & 8;
        String string9 = n16 != 0 ? component2.type : string3;
        int n17 = n7 & 0x10;
        String string10 = n17 != 0 ? component2.heading : string4;
        int n18 = n7 & 0x20;
        String string11 = n18 != 0 ? component2.subHeading : string5;
        int n19 = n7 & 0x40;
        Boolean bl3 = n19 != 0 ? component2.isDynamicPage : bl2;
        int n20 = n7 & 0x80;
        String string12 = n20 != 0 ? component2.bgColor : string6;
        String string13 = (n7 &= 0x100) != 0 ? component2.componentName : string7;
        list = list2;
        string2 = string8;
        n3 = n15;
        string3 = string9;
        string4 = string10;
        string5 = string11;
        bl2 = bl3;
        string6 = string12;
        string7 = string13;
        return component.copy(list2, string8, n15, string9, string10, string11, bl3, string12, string13);
    }

    public static final /* synthetic */ void write$Self$shared_release(Component object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        int n3;
        Object object2;
        Object object3 = $childSerializers;
        boolean bl2 = false;
        Object object4 = null;
        boolean bl3 = u30_02.I(serialDescriptor, 0);
        if (bl3 || (object2 = ((Component)object).banners) != null) {
            object3 = object3[0];
            object2 = ((Component)object).banners;
            u30_02.r(serialDescriptor, 0, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 1)) || (object4 = ((Component)object).bottomPadding) != null) {
            object4 = pe3_2.a;
            object2 = ((Component)object).bottomPadding;
            u30_02.r(serialDescriptor, n3, (b03_0)object4, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 2)) || (object4 = ((Component)object).carouselTimer) != null) {
            object4 = yi1_2.a;
            object2 = ((Component)object).carouselTimer;
            u30_02.r(serialDescriptor, n3, (b03_0)object4, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 3)) || (object4 = ((Component)object).type) != null) {
            object4 = pe3_2.a;
            object2 = ((Component)object).type;
            u30_02.r(serialDescriptor, n3, (b03_0)object4, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 4)) || (object4 = ((Component)object).heading) != null) {
            object4 = pe3_2.a;
            object2 = ((Component)object).heading;
            u30_02.r(serialDescriptor, n3, (b03_0)object4, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 5)) || (object4 = ((Component)object).subHeading) != null) {
            object4 = pe3_2.a;
            object2 = ((Component)object).subHeading;
            u30_02.r(serialDescriptor, n3, (b03_0)object4, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 6)) || !(bl2 = Intrinsics.areEqual(object4 = ((Component)object).isDynamicPage, object2 = Boolean.FALSE))) {
            object4 = cz_2.a;
            object2 = ((Component)object).isDynamicPage;
            u30_02.r(serialDescriptor, n3, (b03_0)object4, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 7)) || (object4 = ((Component)object).bgColor) != null) {
            object4 = pe3_2.a;
            object2 = ((Component)object).bgColor;
            u30_02.r(serialDescriptor, n3, (b03_0)object4, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 8)) || (object4 = ((Component)object).componentName) != null) {
            object4 = pe3_2.a;
            object = ((Component)object).componentName;
            u30_02.r(serialDescriptor, n3, (b03_0)object4, object);
        }
    }

    public final List component1() {
        return this.banners;
    }

    public final String component2() {
        return this.bottomPadding;
    }

    public final Integer component3() {
        return this.carouselTimer;
    }

    public final String component4() {
        return this.type;
    }

    public final String component5() {
        return this.heading;
    }

    public final String component6() {
        return this.subHeading;
    }

    public final Boolean component7() {
        return this.isDynamicPage;
    }

    public final String component8() {
        return this.bgColor;
    }

    public final String component9() {
        return this.componentName;
    }

    public final Component copy(List list, String string2, Integer n3, String string3, String string4, String string5, Boolean bl2, String string6, String string7) {
        Component component = new Component(list, string2, n3, string3, string4, string5, bl2, string6, string7);
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
        object2 = this.type;
        object3 = ((Component)object).type;
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
        object2 = this.subHeading;
        object3 = ((Component)object).subHeading;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isDynamicPage;
        object3 = ((Component)object).isDynamicPage;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bgColor;
        object3 = ((Component)object).bgColor;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.componentName;
        object = ((Component)object).componentName;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
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

    public final String getBottomPadding() {
        return this.bottomPadding;
    }

    public final Integer getCarouselTimer() {
        return this.carouselTimer;
    }

    public final String getComponentName() {
        return this.componentName;
    }

    public final String getHeading() {
        return this.heading;
    }

    public final String getSubHeading() {
        return this.subHeading;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int n3;
        int n4;
        List list = this.banners;
        int n7 = 0;
        if (list == null) {
            n4 = 0;
            list = null;
        } else {
            n4 = ((Object)list).hashCode();
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
        object = this.type;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
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
        object = this.subHeading;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isDynamicPage;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bgColor;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.componentName;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
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

    public final void setBottomPadding(String string2) {
        this.bottomPadding = string2;
    }

    public final void setCarouselTimer(Integer n3) {
        this.carouselTimer = n3;
    }

    public final void setComponentName(String string2) {
        this.componentName = string2;
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

    public final void setType(String string2) {
        this.type = string2;
    }

    public String toString() {
        List list = this.banners;
        String string2 = this.bottomPadding;
        Integer n3 = this.carouselTimer;
        String string3 = this.type;
        String string4 = this.heading;
        String string5 = this.subHeading;
        Boolean bl2 = this.isDynamicPage;
        String string6 = this.bgColor;
        String string7 = this.componentName;
        StringBuilder stringBuilder = new StringBuilder("Component(banners=");
        stringBuilder.append(list);
        stringBuilder.append(", bottomPadding=");
        stringBuilder.append(string2);
        stringBuilder.append(", carouselTimer=");
        stringBuilder.append(n3);
        stringBuilder.append(", type=");
        stringBuilder.append(string3);
        stringBuilder.append(", heading=");
        X50.a(stringBuilder, string4, ", subHeading=", string5, ", isDynamicPage=");
        xi0_2.a(bl2, ", bgColor=", string6, ", componentName=", stringBuilder);
        return h30_0.a(stringBuilder, string7, ")");
    }
}

