/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.explore_brands;

import com.ril.ajio.services.data.fleek.explore_brands.Pagination;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AllBrandsPageModel {
    private p83_0 brands;
    private Pagination pagination;

    public AllBrandsPageModel() {
        this(null, null, 3, null);
    }

    public AllBrandsPageModel(p83_0 p83_02, Pagination pagination) {
        this.brands = p83_02;
        this.pagination = pagination;
    }

    public /* synthetic */ AllBrandsPageModel(p83_0 p83_02, Pagination pagination, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            p83_02 = null;
        }
        if ((n3 &= 2) != 0) {
            pagination = null;
        }
        this(p83_02, pagination);
    }

    public static /* synthetic */ AllBrandsPageModel copy$default(AllBrandsPageModel allBrandsPageModel, p83_0 p83_02, Pagination pagination, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            p83_02 = allBrandsPageModel.brands;
        }
        if ((n3 &= 2) != 0) {
            pagination = allBrandsPageModel.pagination;
        }
        return allBrandsPageModel.copy(p83_02, pagination);
    }

    public final p83_0 component1() {
        return this.brands;
    }

    public final Pagination component2() {
        return this.pagination;
    }

    public final AllBrandsPageModel copy(p83_0 p83_02, Pagination pagination) {
        AllBrandsPageModel allBrandsPageModel = new AllBrandsPageModel(p83_02, pagination);
        return allBrandsPageModel;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AllBrandsPageModel;
        if (!bl3) {
            return false;
        }
        object = (AllBrandsPageModel)object;
        Object object2 = this.brands;
        p83_0 p83_02 = ((AllBrandsPageModel)object).brands;
        bl3 = Intrinsics.areEqual(object2, p83_02);
        if (!bl3) {
            return false;
        }
        object2 = this.pagination;
        object = ((AllBrandsPageModel)object).pagination;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final p83_0 getBrands() {
        return this.brands;
    }

    public final Pagination getPagination() {
        return this.pagination;
    }

    public int hashCode() {
        int n3;
        p83_0 p83_02 = this.brands;
        int n4 = 0;
        if (p83_02 == null) {
            n3 = 0;
            p83_02 = null;
        } else {
            n3 = p83_02.hashCode();
        }
        n3 *= 31;
        Pagination pagination = this.pagination;
        if (pagination != null) {
            n4 = pagination.hashCode();
        }
        return n3 + n4;
    }

    public final void setBrands(p83_0 p83_02) {
        this.brands = p83_02;
    }

    public final void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public String toString() {
        p83_0 p83_02 = this.brands;
        Pagination pagination = this.pagination;
        StringBuilder stringBuilder = new StringBuilder("AllBrandsPageModel(brands=");
        stringBuilder.append(p83_02);
        stringBuilder.append(", pagination=");
        stringBuilder.append(pagination);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

