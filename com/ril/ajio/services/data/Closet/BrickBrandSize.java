/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Closet;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class BrickBrandSize {
    private String description;
    private String showToolTip;
    private ArrayList sizeChartAttributes;
    private ArrayList sizeChartBrandComparisions;
    private ArrayList sizeChartInternationalConversions;
    private String sizeName;
    private String sizePriority;
    private String toolTipTitle;

    public BrickBrandSize() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public BrickBrandSize(String string2, String string3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String string4, String string5, String string6) {
        this.description = string2;
        this.showToolTip = string3;
        this.sizeChartAttributes = arrayList;
        this.sizeChartBrandComparisions = arrayList2;
        this.sizeChartInternationalConversions = arrayList3;
        this.sizeName = string4;
        this.sizePriority = string5;
        this.toolTipTitle = string6;
    }

    public /* synthetic */ BrickBrandSize(String object, String string2, ArrayList object2, ArrayList arrayList, ArrayList arrayList2, String object3, String string3, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string5;
        String string6;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        String string7;
        String string8;
        int n4 = n3;
        int n7 = n3 & 1;
        String string9 = null;
        if (n7 != 0) {
            n7 = 0;
            string8 = null;
        } else {
            string8 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string7 = null;
        } else {
            string7 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            arrayList5 = null;
        } else {
            arrayList5 = object2;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            arrayList4 = null;
        } else {
            arrayList4 = arrayList;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            arrayList3 = null;
        } else {
            arrayList3 = arrayList2;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string6 = null;
        } else {
            string6 = object3;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string5 = null;
        } else {
            string5 = string3;
        }
        if ((n4 &= 0x80) == 0) {
            string9 = string4;
        }
        object = this;
        string2 = string8;
        object2 = string7;
        arrayList = arrayList5;
        arrayList2 = arrayList4;
        object3 = arrayList3;
        string3 = string6;
        string4 = string5;
        this(string8, string7, arrayList5, arrayList4, arrayList3, string6, string5, string9);
    }

    public static /* synthetic */ BrickBrandSize copy$default(BrickBrandSize brickBrandSize, String string2, String string3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String string4, String string5, String string6, int n3, Object object) {
        BrickBrandSize brickBrandSize2 = brickBrandSize;
        int n4 = n3;
        int n7 = n3 & 1;
        String string7 = n7 != 0 ? brickBrandSize.description : string2;
        int n8 = n4 & 2;
        String string8 = n8 != 0 ? brickBrandSize2.showToolTip : string3;
        int n10 = n4 & 4;
        ArrayList arrayList4 = n10 != 0 ? brickBrandSize2.sizeChartAttributes : arrayList;
        int n14 = n4 & 8;
        ArrayList arrayList5 = n14 != 0 ? brickBrandSize2.sizeChartBrandComparisions : arrayList2;
        int n15 = n4 & 0x10;
        ArrayList arrayList6 = n15 != 0 ? brickBrandSize2.sizeChartInternationalConversions : arrayList3;
        int n16 = n4 & 0x20;
        String string9 = n16 != 0 ? brickBrandSize2.sizeName : string4;
        int n17 = n4 & 0x40;
        String string10 = n17 != 0 ? brickBrandSize2.sizePriority : string5;
        String string11 = (n4 &= 0x80) != 0 ? brickBrandSize2.toolTipTitle : string6;
        string2 = string7;
        string3 = string8;
        arrayList = arrayList4;
        arrayList2 = arrayList5;
        arrayList3 = arrayList6;
        string4 = string9;
        string5 = string10;
        string6 = string11;
        return brickBrandSize.copy(string7, string8, arrayList4, arrayList5, arrayList6, string9, string10, string11);
    }

    public final String component1() {
        return this.description;
    }

    public final String component2() {
        return this.showToolTip;
    }

    public final ArrayList component3() {
        return this.sizeChartAttributes;
    }

    public final ArrayList component4() {
        return this.sizeChartBrandComparisions;
    }

    public final ArrayList component5() {
        return this.sizeChartInternationalConversions;
    }

    public final String component6() {
        return this.sizeName;
    }

    public final String component7() {
        return this.sizePriority;
    }

    public final String component8() {
        return this.toolTipTitle;
    }

    public final BrickBrandSize copy(String string2, String string3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String string4, String string5, String string6) {
        BrickBrandSize brickBrandSize = new BrickBrandSize(string2, string3, arrayList, arrayList2, arrayList3, string4, string5, string6);
        return brickBrandSize;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BrickBrandSize;
        if (!bl3) {
            return false;
        }
        object = (BrickBrandSize)object;
        Object object2 = this.description;
        Object object3 = ((BrickBrandSize)object).description;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.showToolTip;
        object3 = ((BrickBrandSize)object).showToolTip;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.sizeChartAttributes;
        object3 = ((BrickBrandSize)object).sizeChartAttributes;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.sizeChartBrandComparisions;
        object3 = ((BrickBrandSize)object).sizeChartBrandComparisions;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.sizeChartInternationalConversions;
        object3 = ((BrickBrandSize)object).sizeChartInternationalConversions;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.sizeName;
        object3 = ((BrickBrandSize)object).sizeName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.sizePriority;
        object3 = ((BrickBrandSize)object).sizePriority;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.toolTipTitle;
        object = ((BrickBrandSize)object).toolTipTitle;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getShowToolTip() {
        return this.showToolTip;
    }

    public final ArrayList getSizeChartAttributes() {
        return this.sizeChartAttributes;
    }

    public final ArrayList getSizeChartBrandComparisions() {
        return this.sizeChartBrandComparisions;
    }

    public final ArrayList getSizeChartInternationalConversions() {
        return this.sizeChartInternationalConversions;
    }

    public final String getSizeName() {
        return this.sizeName;
    }

    public final String getSizePriority() {
        return this.sizePriority;
    }

    public final String getToolTipTitle() {
        return this.toolTipTitle;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.description;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.showToolTip;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.sizeChartAttributes;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.sizeChartBrandComparisions;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.sizeChartInternationalConversions;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.sizeName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.sizePriority;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.toolTipTitle;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setDescription(String string2) {
        this.description = string2;
    }

    public final void setShowToolTip(String string2) {
        this.showToolTip = string2;
    }

    public final void setSizeChartAttributes(ArrayList arrayList) {
        this.sizeChartAttributes = arrayList;
    }

    public final void setSizeChartBrandComparisions(ArrayList arrayList) {
        this.sizeChartBrandComparisions = arrayList;
    }

    public final void setSizeChartInternationalConversions(ArrayList arrayList) {
        this.sizeChartInternationalConversions = arrayList;
    }

    public final void setSizeName(String string2) {
        this.sizeName = string2;
    }

    public final void setSizePriority(String string2) {
        this.sizePriority = string2;
    }

    public final void setToolTipTitle(String string2) {
        this.toolTipTitle = string2;
    }

    public String toString() {
        CharSequence charSequence = this.description;
        String string2 = this.showToolTip;
        ArrayList arrayList = this.sizeChartAttributes;
        ArrayList arrayList2 = this.sizeChartBrandComparisions;
        ArrayList arrayList3 = this.sizeChartInternationalConversions;
        String string3 = this.sizeName;
        String string4 = this.sizePriority;
        String string5 = this.toolTipTitle;
        charSequence = og_1.a("BrickBrandSize(description=", (String)charSequence, ", showToolTip=", string2, ", sizeChartAttributes=");
        ((StringBuilder)charSequence).append(arrayList);
        ((StringBuilder)charSequence).append(", sizeChartBrandComparisions=");
        ((StringBuilder)charSequence).append(arrayList2);
        ((StringBuilder)charSequence).append(", sizeChartInternationalConversions=");
        ((StringBuilder)charSequence).append(arrayList3);
        ((StringBuilder)charSequence).append(", sizeName=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", sizePriority=");
        return ko_0.a((StringBuilder)charSequence, string4, ", toolTipTitle=", string5, ")");
    }
}

