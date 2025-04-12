/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Closet;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SizeChartInternationalConversion {
    private String attributeName;
    private String attributeValue;
    private String convertedAttributeValue;

    public SizeChartInternationalConversion() {
        this(null, null, null, 7, null);
    }

    public SizeChartInternationalConversion(String string2, String string3, String string4) {
        this.attributeName = string2;
        this.attributeValue = string3;
        this.convertedAttributeValue = string4;
    }

    public /* synthetic */ SizeChartInternationalConversion(String string2, String string3, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n3 &= 4) != 0) {
            string4 = null;
        }
        this(string2, string3, string4);
    }

    public static /* synthetic */ SizeChartInternationalConversion copy$default(SizeChartInternationalConversion sizeChartInternationalConversion, String string2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = sizeChartInternationalConversion.attributeName;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = sizeChartInternationalConversion.attributeValue;
        }
        if ((n3 &= 4) != 0) {
            string4 = sizeChartInternationalConversion.convertedAttributeValue;
        }
        return sizeChartInternationalConversion.copy(string2, string3, string4);
    }

    public final String component1() {
        return this.attributeName;
    }

    public final String component2() {
        return this.attributeValue;
    }

    public final String component3() {
        return this.convertedAttributeValue;
    }

    public final SizeChartInternationalConversion copy(String string2, String string3, String string4) {
        SizeChartInternationalConversion sizeChartInternationalConversion = new SizeChartInternationalConversion(string2, string3, string4);
        return sizeChartInternationalConversion;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SizeChartInternationalConversion;
        if (!bl3) {
            return false;
        }
        object = (SizeChartInternationalConversion)object;
        String string2 = this.attributeName;
        String string3 = ((SizeChartInternationalConversion)object).attributeName;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.attributeValue;
        string3 = ((SizeChartInternationalConversion)object).attributeValue;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.convertedAttributeValue;
        object = ((SizeChartInternationalConversion)object).convertedAttributeValue;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAttributeName() {
        return this.attributeName;
    }

    public final String getAttributeValue() {
        return this.attributeValue;
    }

    public final String getConvertedAttributeValue() {
        return this.convertedAttributeValue;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.attributeName;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.attributeValue;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.convertedAttributeValue;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setAttributeName(String string2) {
        this.attributeName = string2;
    }

    public final void setAttributeValue(String string2) {
        this.attributeValue = string2;
    }

    public final void setConvertedAttributeValue(String string2) {
        this.convertedAttributeValue = string2;
    }

    public String toString() {
        String string2 = this.attributeName;
        String string3 = this.attributeValue;
        String string4 = this.convertedAttributeValue;
        return h30_0.a(og_1.a("SizeChartInternationalConversion(attributeName=", string2, ", attributeValue=", string3, ", convertedAttributeValue="), string4, ")");
    }
}

