/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class MetaData
implements Serializable {
    private final String brandPageHeaderDuration;
    private final String brandPageHeaderHeight;
    private final String brandPageHeaderMediaType;
    private final String brandPageHeaderWidth;

    public MetaData(String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "brandPageHeaderMediaType");
        Intrinsics.checkNotNullParameter(string3, "brandPageHeaderDuration");
        Intrinsics.checkNotNullParameter(string4, "brandPageHeaderHeight");
        Intrinsics.checkNotNullParameter(string5, "brandPageHeaderWidth");
        this.brandPageHeaderMediaType = string2;
        this.brandPageHeaderDuration = string3;
        this.brandPageHeaderHeight = string4;
        this.brandPageHeaderWidth = string5;
    }

    public static /* synthetic */ MetaData copy$default(MetaData metaData, String string2, String string3, String string4, String string5, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = metaData.brandPageHeaderMediaType;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = metaData.brandPageHeaderDuration;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = metaData.brandPageHeaderHeight;
        }
        if ((n3 &= 8) != 0) {
            string5 = metaData.brandPageHeaderWidth;
        }
        return metaData.copy(string2, string3, string4, string5);
    }

    public final String component1() {
        return this.brandPageHeaderMediaType;
    }

    public final String component2() {
        return this.brandPageHeaderDuration;
    }

    public final String component3() {
        return this.brandPageHeaderHeight;
    }

    public final String component4() {
        return this.brandPageHeaderWidth;
    }

    public final MetaData copy(String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "brandPageHeaderMediaType");
        Intrinsics.checkNotNullParameter(string3, "brandPageHeaderDuration");
        Intrinsics.checkNotNullParameter(string4, "brandPageHeaderHeight");
        Intrinsics.checkNotNullParameter(string5, "brandPageHeaderWidth");
        MetaData metaData = new MetaData(string2, string3, string4, string5);
        return metaData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof MetaData;
        if (!bl3) {
            return false;
        }
        object = (MetaData)object;
        String string2 = this.brandPageHeaderMediaType;
        String string3 = ((MetaData)object).brandPageHeaderMediaType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.brandPageHeaderDuration;
        string3 = ((MetaData)object).brandPageHeaderDuration;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.brandPageHeaderHeight;
        string3 = ((MetaData)object).brandPageHeaderHeight;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.brandPageHeaderWidth;
        object = ((MetaData)object).brandPageHeaderWidth;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBrandPageHeaderDuration() {
        return this.brandPageHeaderDuration;
    }

    public final String getBrandPageHeaderHeight() {
        return this.brandPageHeaderHeight;
    }

    public final String getBrandPageHeaderMediaType() {
        return this.brandPageHeaderMediaType;
    }

    public final String getBrandPageHeaderWidth() {
        return this.brandPageHeaderWidth;
    }

    public int hashCode() {
        int n3 = this.brandPageHeaderMediaType.hashCode();
        int n4 = 31;
        n3 *= 31;
        String string2 = this.brandPageHeaderDuration;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.brandPageHeaderHeight;
        n3 = zy_2.b(n3, n4, string2);
        return this.brandPageHeaderWidth.hashCode() + n3;
    }

    public String toString() {
        String string2 = this.brandPageHeaderMediaType;
        String string3 = this.brandPageHeaderDuration;
        String string4 = this.brandPageHeaderHeight;
        String string5 = this.brandPageHeaderWidth;
        return ko_0.a(og_1.a("MetaData(brandPageHeaderMediaType=", string2, ", brandPageHeaderDuration=", string3, ", brandPageHeaderHeight="), string4, ", brandPageHeaderWidth=", string5, ")");
    }
}

