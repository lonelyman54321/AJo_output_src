/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.entity;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class BannerAdData {
    private Integer bannerIndex;
    private String ccbValue;
    private String clickId;
    private final List clktrackers;
    private final String cmpid;
    private final String ctafb;
    private final List customimage;
    private String desc2;
    private final List imptrackers;
    private boolean isVisited;

    public BannerAdData() {
        this(null, null, null, null, null, null, null, null, false, null, 1023, null);
    }

    public BannerAdData(List list, List list2, List list3, String string2, String string3, String string4, Integer n3, String string5, boolean bl2, String string6) {
        this.imptrackers = list;
        this.clktrackers = list2;
        this.customimage = list3;
        this.cmpid = string2;
        this.ctafb = string3;
        this.clickId = string4;
        this.bannerIndex = n3;
        this.desc2 = string5;
        this.isVisited = bl2;
        this.ccbValue = string6;
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ BannerAdData(List object, List list, List list2, String object2, String string2, String string3, Integer object3, String object4, boolean bl2, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        void var31_34;
        Object string5;
        Object n4;
        String string6;
        String string7;
        Object string8;
        List list3;
        List list4;
        Object list5;
        int n7 = n3;
        int n8 = n3 & 1;
        String string9 = null;
        if (n8 != 0) {
            n8 = 0;
            list5 = null;
        } else {
            list5 = object;
        }
        int n10 = n7 & 2;
        if (n10 != 0) {
            n10 = 0;
            list4 = null;
        } else {
            list4 = list;
        }
        int n14 = n7 & 4;
        if (n14 != 0) {
            n14 = 0;
            list3 = null;
        } else {
            list3 = list2;
        }
        int n15 = n7 & 8;
        if (n15 != 0) {
            n15 = 0;
            string8 = null;
        } else {
            string8 = object2;
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
        if (n18 != 0) {
            n18 = 0;
            n4 = null;
        } else {
            n4 = object3;
        }
        int n19 = n7 & 0x80;
        if (n19 != 0) {
            n19 = 0;
            string5 = null;
        } else {
            string5 = object4;
        }
        int bl3 = n7 & 0x100;
        if (bl3 != 0) {
            boolean bl4 = false;
        } else {
            boolean bl5 = bl2;
        }
        if ((n7 &= 0x200) == 0) {
            string9 = string4;
        }
        object = this;
        list = list5;
        list2 = list4;
        object2 = list3;
        string2 = string8;
        string3 = string7;
        object3 = string6;
        object4 = n4;
        this((List)list5, list4, list3, (String)string8, string7, string6, (Integer)n4, (String)string5, (boolean)var31_34, string9);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ BannerAdData copy$default(BannerAdData bannerAdData, List list, List list2, List list3, String string2, String string3, String string4, Integer n3, String string5, boolean bl2, String string6, int n4, Object object) {
        void var31_34;
        BannerAdData bannerAdData2 = bannerAdData;
        int n7 = n4;
        int n8 = n4 & 1;
        List list4 = n8 != 0 ? bannerAdData.imptrackers : list;
        int n10 = n7 & 2;
        List list5 = n10 != 0 ? bannerAdData2.clktrackers : list2;
        int n14 = n7 & 4;
        List list6 = n14 != 0 ? bannerAdData2.customimage : list3;
        int n15 = n7 & 8;
        String string7 = n15 != 0 ? bannerAdData2.cmpid : string2;
        int n16 = n7 & 0x10;
        String string8 = n16 != 0 ? bannerAdData2.ctafb : string3;
        int n17 = n7 & 0x20;
        String string9 = n17 != 0 ? bannerAdData2.clickId : string4;
        int n18 = n7 & 0x40;
        Integer n19 = n18 != 0 ? bannerAdData2.bannerIndex : n3;
        int n20 = n7 & 0x80;
        String string10 = n20 != 0 ? bannerAdData2.desc2 : string5;
        int bl3 = n7 & 0x100;
        if (bl3 != 0) {
            boolean bl4 = bannerAdData2.isVisited;
        } else {
            boolean bl5 = bl2;
        }
        String string11 = (n7 &= 0x200) != 0 ? bannerAdData2.ccbValue : string6;
        list = list4;
        list2 = list5;
        list3 = list6;
        string2 = string7;
        string3 = string8;
        string4 = string9;
        n3 = n19;
        string5 = string10;
        bl2 = var31_34;
        string6 = string11;
        return bannerAdData.copy(list4, list5, list6, string7, string8, string9, n19, string10, (boolean)var31_34, string11);
    }

    public final List component1() {
        return this.imptrackers;
    }

    public final String component10() {
        return this.ccbValue;
    }

    public final List component2() {
        return this.clktrackers;
    }

    public final List component3() {
        return this.customimage;
    }

    public final String component4() {
        return this.cmpid;
    }

    public final String component5() {
        return this.ctafb;
    }

    public final String component6() {
        return this.clickId;
    }

    public final Integer component7() {
        return this.bannerIndex;
    }

    public final String component8() {
        return this.desc2;
    }

    public final boolean component9() {
        return this.isVisited;
    }

    public final BannerAdData copy(List list, List list2, List list3, String string2, String string3, String string4, Integer n3, String string5, boolean bl2, String string6) {
        BannerAdData bannerAdData = new BannerAdData(list, list2, list3, string2, string3, string4, n3, string5, bl2, string6);
        return bannerAdData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BannerAdData;
        if (!bl3) {
            return false;
        }
        object = (BannerAdData)object;
        Object object2 = this.imptrackers;
        Object object3 = ((BannerAdData)object).imptrackers;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.clktrackers;
        object3 = ((BannerAdData)object).clktrackers;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.customimage;
        object3 = ((BannerAdData)object).customimage;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cmpid;
        object3 = ((BannerAdData)object).cmpid;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.ctafb;
        object3 = ((BannerAdData)object).ctafb;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.clickId;
        object3 = ((BannerAdData)object).clickId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bannerIndex;
        object3 = ((BannerAdData)object).bannerIndex;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.desc2;
        object3 = ((BannerAdData)object).desc2;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.isVisited;
        boolean bl4 = ((BannerAdData)object).isVisited;
        if (bl3 != bl4) {
            return false;
        }
        object2 = this.ccbValue;
        object = ((BannerAdData)object).ccbValue;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final Integer getBannerIndex() {
        return this.bannerIndex;
    }

    public final String getCcbValue() {
        return this.ccbValue;
    }

    public final String getClickId() {
        return this.clickId;
    }

    public final List getClktrackers() {
        return this.clktrackers;
    }

    public final String getCmpid() {
        return this.cmpid;
    }

    public final String getCtafb() {
        return this.ctafb;
    }

    public final List getCustomimage() {
        return this.customimage;
    }

    public final String getDesc2() {
        return this.desc2;
    }

    public final List getImptrackers() {
        return this.imptrackers;
    }

    public int hashCode() {
        int n3;
        int n4;
        List list = this.imptrackers;
        int n7 = 0;
        if (list == null) {
            n4 = 0;
            list = null;
        } else {
            n4 = ((Object)list).hashCode();
        }
        n4 *= 31;
        Object object = this.clktrackers;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.customimage;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cmpid;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.ctafb;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.clickId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bannerIndex;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.desc2;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isVisited ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.ccbValue;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final boolean isVisited() {
        return this.isVisited;
    }

    public final void setBannerIndex(Integer n3) {
        this.bannerIndex = n3;
    }

    public final void setCcbValue(String string2) {
        this.ccbValue = string2;
    }

    public final void setClickId(String string2) {
        this.clickId = string2;
    }

    public final void setDesc2(String string2) {
        this.desc2 = string2;
    }

    public final void setVisited(boolean bl2) {
        this.isVisited = bl2;
    }

    public String toString() {
        List list = this.imptrackers;
        List list2 = this.clktrackers;
        List list3 = this.customimage;
        String string2 = this.cmpid;
        String string3 = this.ctafb;
        String string4 = this.clickId;
        Integer n3 = this.bannerIndex;
        String string5 = this.desc2;
        boolean bl2 = this.isVisited;
        String string6 = this.ccbValue;
        StringBuilder stringBuilder = new StringBuilder("BannerAdData(imptrackers=");
        stringBuilder.append(list);
        stringBuilder.append(", clktrackers=");
        stringBuilder.append(list2);
        stringBuilder.append(", customimage=");
        stringBuilder.append(list3);
        stringBuilder.append(", cmpid=");
        stringBuilder.append(string2);
        stringBuilder.append(", ctafb=");
        X50.a(stringBuilder, string3, ", clickId=", string4, ", bannerIndex=");
        stringBuilder.append(n3);
        stringBuilder.append(", desc2=");
        stringBuilder.append(string5);
        stringBuilder.append(", isVisited=");
        stringBuilder.append(bl2);
        stringBuilder.append(", ccbValue=");
        stringBuilder.append(string6);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

