/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Closet;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Sizechart {
    private String brandLogo;
    private String brandName;
    private List brickBrandSizes;
    private String brickName;
    private String gender;
    private String howToMeasureImage1Url;
    private String howToMeasureImage2Url;
    private String measurementType;
    private String measurementUnit;
    private String sizeGuideMeasurementUnit;
    private String specialDescription;
    private String tips;

    public Sizechart() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public Sizechart(String string2, String string3, List list, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) {
        this.brandLogo = string2;
        this.brandName = string3;
        this.brickBrandSizes = list;
        this.brickName = string4;
        this.gender = string5;
        this.howToMeasureImage1Url = string6;
        this.howToMeasureImage2Url = string7;
        this.measurementType = string8;
        this.measurementUnit = string9;
        this.sizeGuideMeasurementUnit = string10;
        this.specialDescription = string11;
        this.tips = string12;
    }

    public /* synthetic */ Sizechart(String object, String string2, List object2, String object3, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        List list;
        String string19;
        String string20;
        int n4 = n3;
        int n7 = n3 & 1;
        String string21 = null;
        if (n7 != 0) {
            n7 = 0;
            string20 = null;
        } else {
            string20 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string19 = null;
        } else {
            string19 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            list = null;
        } else {
            list = object2;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string18 = null;
        } else {
            string18 = object3;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string17 = null;
        } else {
            string17 = string3;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string16 = null;
        } else {
            string16 = string4;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string15 = null;
        } else {
            string15 = string5;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string14 = null;
        } else {
            string14 = string6;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            string13 = null;
        } else {
            string13 = string7;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            string12 = null;
        } else {
            string12 = string8;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            string11 = null;
        } else {
            string11 = string9;
        }
        if ((n4 &= 0x800) == 0) {
            string21 = string10;
        }
        object = this;
        string2 = string20;
        object2 = string19;
        object3 = list;
        string3 = string18;
        string4 = string17;
        string5 = string16;
        string6 = string15;
        string7 = string14;
        string8 = string13;
        string9 = string12;
        string10 = string11;
        this(string20, string19, list, string18, string17, string16, string15, string14, string13, string12, string11, string21);
    }

    public static /* synthetic */ Sizechart copy$default(Sizechart sizechart, String string2, String string3, List list, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, int n3, Object object) {
        Sizechart sizechart2 = sizechart;
        int n4 = n3;
        int n7 = n3 & 1;
        String string13 = n7 != 0 ? sizechart.brandLogo : string2;
        int n8 = n4 & 2;
        String string14 = n8 != 0 ? sizechart2.brandName : string3;
        int n10 = n4 & 4;
        List list2 = n10 != 0 ? sizechart2.brickBrandSizes : list;
        int n14 = n4 & 8;
        String string15 = n14 != 0 ? sizechart2.brickName : string4;
        int n15 = n4 & 0x10;
        String string16 = n15 != 0 ? sizechart2.gender : string5;
        int n16 = n4 & 0x20;
        String string17 = n16 != 0 ? sizechart2.howToMeasureImage1Url : string6;
        int n17 = n4 & 0x40;
        String string18 = n17 != 0 ? sizechart2.howToMeasureImage2Url : string7;
        int n18 = n4 & 0x80;
        String string19 = n18 != 0 ? sizechart2.measurementType : string8;
        int n19 = n4 & 0x100;
        String string20 = n19 != 0 ? sizechart2.measurementUnit : string9;
        int n20 = n4 & 0x200;
        String string21 = n20 != 0 ? sizechart2.sizeGuideMeasurementUnit : string10;
        int n21 = n4 & 0x400;
        String string22 = n21 != 0 ? sizechart2.specialDescription : string11;
        String string23 = (n4 &= 0x800) != 0 ? sizechart2.tips : string12;
        string2 = string13;
        string3 = string14;
        list = list2;
        string4 = string15;
        string5 = string16;
        string6 = string17;
        string7 = string18;
        string8 = string19;
        string9 = string20;
        string10 = string21;
        string11 = string22;
        string12 = string23;
        return sizechart.copy(string13, string14, list2, string15, string16, string17, string18, string19, string20, string21, string22, string23);
    }

    public final String component1() {
        return this.brandLogo;
    }

    public final String component10() {
        return this.sizeGuideMeasurementUnit;
    }

    public final String component11() {
        return this.specialDescription;
    }

    public final String component12() {
        return this.tips;
    }

    public final String component2() {
        return this.brandName;
    }

    public final List component3() {
        return this.brickBrandSizes;
    }

    public final String component4() {
        return this.brickName;
    }

    public final String component5() {
        return this.gender;
    }

    public final String component6() {
        return this.howToMeasureImage1Url;
    }

    public final String component7() {
        return this.howToMeasureImage2Url;
    }

    public final String component8() {
        return this.measurementType;
    }

    public final String component9() {
        return this.measurementUnit;
    }

    public final Sizechart copy(String string2, String string3, List list, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) {
        Sizechart sizechart = new Sizechart(string2, string3, list, string4, string5, string6, string7, string8, string9, string10, string11, string12);
        return sizechart;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Sizechart;
        if (!bl3) {
            return false;
        }
        object = (Sizechart)object;
        Object object2 = this.brandLogo;
        Object object3 = ((Sizechart)object).brandLogo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brandName;
        object3 = ((Sizechart)object).brandName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brickBrandSizes;
        object3 = ((Sizechart)object).brickBrandSizes;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brickName;
        object3 = ((Sizechart)object).brickName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.gender;
        object3 = ((Sizechart)object).gender;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.howToMeasureImage1Url;
        object3 = ((Sizechart)object).howToMeasureImage1Url;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.howToMeasureImage2Url;
        object3 = ((Sizechart)object).howToMeasureImage2Url;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.measurementType;
        object3 = ((Sizechart)object).measurementType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.measurementUnit;
        object3 = ((Sizechart)object).measurementUnit;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.sizeGuideMeasurementUnit;
        object3 = ((Sizechart)object).sizeGuideMeasurementUnit;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.specialDescription;
        object3 = ((Sizechart)object).specialDescription;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.tips;
        object = ((Sizechart)object).tips;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBrandLogo() {
        return this.brandLogo;
    }

    public final String getBrandName() {
        return this.brandName;
    }

    public final List getBrickBrandSizes() {
        return this.brickBrandSizes;
    }

    public final String getBrickName() {
        return this.brickName;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getHowToMeasureImage1Url() {
        return this.howToMeasureImage1Url;
    }

    public final String getHowToMeasureImage2Url() {
        return this.howToMeasureImage2Url;
    }

    public final String getMeasurementType() {
        return this.measurementType;
    }

    public final String getMeasurementUnit() {
        return this.measurementUnit;
    }

    public final String getSizeGuideMeasurementUnit() {
        return this.sizeGuideMeasurementUnit;
    }

    public final String getSpecialDescription() {
        return this.specialDescription;
    }

    public final String getTips() {
        return this.tips;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.brandLogo;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.brandName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.brickBrandSizes;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.brickName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.gender;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.howToMeasureImage1Url;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.howToMeasureImage2Url;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.measurementType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.measurementUnit;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.sizeGuideMeasurementUnit;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.specialDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.tips;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setBrandLogo(String string2) {
        this.brandLogo = string2;
    }

    public final void setBrandName(String string2) {
        this.brandName = string2;
    }

    public final void setBrickBrandSizes(List list) {
        this.brickBrandSizes = list;
    }

    public final void setBrickName(String string2) {
        this.brickName = string2;
    }

    public final void setGender(String string2) {
        this.gender = string2;
    }

    public final void setHowToMeasureImage1Url(String string2) {
        this.howToMeasureImage1Url = string2;
    }

    public final void setHowToMeasureImage2Url(String string2) {
        this.howToMeasureImage2Url = string2;
    }

    public final void setMeasurementType(String string2) {
        this.measurementType = string2;
    }

    public final void setMeasurementUnit(String string2) {
        this.measurementUnit = string2;
    }

    public final void setSizeGuideMeasurementUnit(String string2) {
        this.sizeGuideMeasurementUnit = string2;
    }

    public final void setSpecialDescription(String string2) {
        this.specialDescription = string2;
    }

    public final void setTips(String string2) {
        this.tips = string2;
    }

    public String toString() {
        CharSequence charSequence = this.brandLogo;
        String string2 = this.brandName;
        List list = this.brickBrandSizes;
        String string3 = this.brickName;
        String string4 = this.gender;
        String string5 = this.howToMeasureImage1Url;
        String string6 = this.howToMeasureImage2Url;
        String string7 = this.measurementType;
        String string8 = this.measurementUnit;
        String string9 = this.sizeGuideMeasurementUnit;
        String string10 = this.specialDescription;
        String string11 = this.tips;
        charSequence = og_1.a("Sizechart(brandLogo=", (String)charSequence, ", brandName=", string2, ", brickBrandSizes=");
        ((StringBuilder)charSequence).append(list);
        ((StringBuilder)charSequence).append(", brickName=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", gender=");
        X50.a((StringBuilder)charSequence, string4, ", howToMeasureImage1Url=", string5, ", howToMeasureImage2Url=");
        X50.a((StringBuilder)charSequence, string6, ", measurementType=", string7, ", measurementUnit=");
        X50.a((StringBuilder)charSequence, string8, ", sizeGuideMeasurementUnit=", string9, ", specialDescription=");
        return ko_0.a((StringBuilder)charSequence, string10, ", tips=", string11, ")");
    }
}

