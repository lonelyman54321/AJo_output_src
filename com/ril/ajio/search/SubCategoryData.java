/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.search;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SubCategoryData
implements Serializable {
    public static final int $stable;
    private final String name;
    private final String url;

    public SubCategoryData() {
        this(null, null, 3, null);
    }

    public SubCategoryData(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(string3, "url");
        this.name = string2;
        this.url = string3;
    }

    public /* synthetic */ SubCategoryData(String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        String string4 = "";
        if (n4 != 0) {
            string2 = string4;
        }
        if ((n3 &= 2) != 0) {
            string3 = string4;
        }
        this(string2, string3);
    }

    public static /* synthetic */ SubCategoryData copy$default(SubCategoryData subCategoryData, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = subCategoryData.name;
        }
        if ((n3 &= 2) != 0) {
            string3 = subCategoryData.url;
        }
        return subCategoryData.copy(string2, string3);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.url;
    }

    public final SubCategoryData copy(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(string3, "url");
        SubCategoryData subCategoryData = new SubCategoryData(string2, string3);
        return subCategoryData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SubCategoryData;
        if (!bl3) {
            return false;
        }
        object = (SubCategoryData)object;
        String string2 = this.name;
        String string3 = ((SubCategoryData)object).name;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.url;
        object = ((SubCategoryData)object).url;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int n3 = this.name.hashCode() * 31;
        return this.url.hashCode() + n3;
    }

    public String toString() {
        String string2 = this.name;
        String string3 = this.url;
        return uc0_0.a("SubCategoryData(name=", string2, ", url=", string3, ")");
    }
}

