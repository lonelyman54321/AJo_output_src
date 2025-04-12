/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product.fleek;

import com.ril.ajio.services.data.Product.fleek.Brand;
import com.ril.ajio.services.data.Product.fleek.Status;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class BrandResponse
implements Serializable {
    private Brand brand;
    private Status status;

    public BrandResponse() {
        this(null, null, 3, null);
    }

    public BrandResponse(Status status, Brand brand) {
        this.status = status;
        this.brand = brand;
    }

    public /* synthetic */ BrandResponse(Status status, Brand brand, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            status = null;
        }
        if ((n3 &= 2) != 0) {
            brand = null;
        }
        this(status, brand);
    }

    public static /* synthetic */ BrandResponse copy$default(BrandResponse brandResponse, Status status, Brand brand, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            status = brandResponse.status;
        }
        if ((n3 &= 2) != 0) {
            brand = brandResponse.brand;
        }
        return brandResponse.copy(status, brand);
    }

    public final Status component1() {
        return this.status;
    }

    public final Brand component2() {
        return this.brand;
    }

    public final BrandResponse copy(Status status, Brand brand) {
        BrandResponse brandResponse = new BrandResponse(status, brand);
        return brandResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BrandResponse;
        if (!bl3) {
            return false;
        }
        object = (BrandResponse)object;
        Serializable serializable = this.status;
        Status status = ((BrandResponse)object).status;
        bl3 = Intrinsics.areEqual(serializable, status);
        if (!bl3) {
            return false;
        }
        serializable = this.brand;
        object = ((BrandResponse)object).brand;
        boolean bl4 = Intrinsics.areEqual(serializable, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Brand getBrand() {
        return this.brand;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int n3;
        Status status = this.status;
        int n4 = 0;
        if (status == null) {
            n3 = 0;
            status = null;
        } else {
            n3 = status.hashCode();
        }
        n3 *= 31;
        Brand brand = this.brand;
        if (brand != null) {
            n4 = brand.hashCode();
        }
        return n3 + n4;
    }

    public final void setBrand(Brand brand) {
        this.brand = brand;
    }

    public final void setStatus(Status status) {
        this.status = status;
    }

    public String toString() {
        Status status = this.status;
        Brand brand = this.brand;
        StringBuilder stringBuilder = new StringBuilder("BrandResponse(status=");
        stringBuilder.append(status);
        stringBuilder.append(", brand=");
        stringBuilder.append(brand);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

