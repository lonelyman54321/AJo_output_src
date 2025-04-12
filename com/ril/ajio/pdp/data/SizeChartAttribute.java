/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.pdp.data;

import kotlin.jvm.internal.Intrinsics;

public final class SizeChartAttribute {
    public static final int $stable;
    private final String attributeName;
    private final String attributeValue;
    private final String convertedAttributeValue;

    public SizeChartAttribute(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "attributeName");
        Intrinsics.checkNotNullParameter(string3, "attributeValue");
        Intrinsics.checkNotNullParameter(string4, "convertedAttributeValue");
        this.attributeName = string2;
        this.attributeValue = string3;
        this.convertedAttributeValue = string4;
    }

    public static /* synthetic */ SizeChartAttribute copy$default(SizeChartAttribute sizeChartAttribute, String string2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = sizeChartAttribute.attributeName;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = sizeChartAttribute.attributeValue;
        }
        if ((n3 &= 4) != 0) {
            string4 = sizeChartAttribute.convertedAttributeValue;
        }
        return sizeChartAttribute.copy(string2, string3, string4);
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

    public final SizeChartAttribute copy(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "attributeName");
        Intrinsics.checkNotNullParameter(string3, "attributeValue");
        Intrinsics.checkNotNullParameter(string4, "convertedAttributeValue");
        SizeChartAttribute sizeChartAttribute = new SizeChartAttribute(string2, string3, string4);
        return sizeChartAttribute;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SizeChartAttribute;
        if (!bl3) {
            return false;
        }
        object = (SizeChartAttribute)object;
        String string2 = this.attributeName;
        String string3 = ((SizeChartAttribute)object).attributeName;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.attributeValue;
        string3 = ((SizeChartAttribute)object).attributeValue;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.convertedAttributeValue;
        object = ((SizeChartAttribute)object).convertedAttributeValue;
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
        int n3 = this.attributeName.hashCode() * 31;
        String string2 = this.attributeValue;
        n3 = zy_2.b(n3, 31, string2);
        return this.convertedAttributeValue.hashCode() + n3;
    }

    public String toString() {
        String string2 = this.attributeName;
        String string3 = this.attributeValue;
        String string4 = this.convertedAttributeValue;
        return h30_0.a(og_1.a("SizeChartAttribute(attributeName=", string2, ", attributeValue=", string3, ", convertedAttributeValue="), string4, ")");
    }
}

