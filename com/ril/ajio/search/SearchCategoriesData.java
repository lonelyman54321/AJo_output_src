/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.search;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class SearchCategoriesData
implements Serializable {
    public static final int $stable = 8;
    private final String categoryType;
    private final List subCategories;

    public SearchCategoriesData(List list, String string2) {
        this.subCategories = list;
        this.categoryType = string2;
    }

    public static /* synthetic */ SearchCategoriesData copy$default(SearchCategoriesData searchCategoriesData, List list, String string2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            list = searchCategoriesData.subCategories;
        }
        if ((n3 &= 2) != 0) {
            string2 = searchCategoriesData.categoryType;
        }
        return searchCategoriesData.copy(list, string2);
    }

    public final List component1() {
        return this.subCategories;
    }

    public final String component2() {
        return this.categoryType;
    }

    public final SearchCategoriesData copy(List list, String string2) {
        SearchCategoriesData searchCategoriesData = new SearchCategoriesData(list, string2);
        return searchCategoriesData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SearchCategoriesData;
        if (!bl3) {
            return false;
        }
        object = (SearchCategoriesData)object;
        Object object2 = this.subCategories;
        List list = ((SearchCategoriesData)object).subCategories;
        bl3 = Intrinsics.areEqual(object2, list);
        if (!bl3) {
            return false;
        }
        object2 = this.categoryType;
        object = ((SearchCategoriesData)object).categoryType;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCategoryType() {
        return this.categoryType;
    }

    public final List getSubCategories() {
        return this.subCategories;
    }

    public int hashCode() {
        int n3;
        List list = this.subCategories;
        int n4 = 0;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            n3 = ((Object)list).hashCode();
        }
        n3 *= 31;
        String string2 = this.categoryType;
        if (string2 != null) {
            n4 = string2.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        List list = this.subCategories;
        String string2 = this.categoryType;
        StringBuilder stringBuilder = new StringBuilder("SearchCategoriesData(subCategories=");
        stringBuilder.append(list);
        stringBuilder.append(", categoryType=");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

