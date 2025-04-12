/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.user;

import com.ril.ajio.services.data.Product.Status;
import com.ril.ajio.services.data.user.GPSResponse;
import kotlin.jvm.internal.Intrinsics;

public final class LocationResponse {
    private final GPSResponse data;
    private Status status;

    public LocationResponse(Status status, GPSResponse gPSResponse) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(gPSResponse, "data");
        this.status = status;
        this.data = gPSResponse;
    }

    public static /* synthetic */ LocationResponse copy$default(LocationResponse locationResponse, Status status, GPSResponse gPSResponse, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            status = locationResponse.status;
        }
        if ((n3 &= 2) != 0) {
            gPSResponse = locationResponse.data;
        }
        return locationResponse.copy(status, gPSResponse);
    }

    public final Status component1() {
        return this.status;
    }

    public final GPSResponse component2() {
        return this.data;
    }

    public final LocationResponse copy(Status status, GPSResponse gPSResponse) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(gPSResponse, "data");
        LocationResponse locationResponse = new LocationResponse(status, gPSResponse);
        return locationResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof LocationResponse;
        if (!bl3) {
            return false;
        }
        object = (LocationResponse)object;
        Object object2 = this.status;
        Status status = ((LocationResponse)object).status;
        bl3 = Intrinsics.areEqual(object2, status);
        if (!bl3) {
            return false;
        }
        object2 = this.data;
        object = ((LocationResponse)object).data;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final GPSResponse getData() {
        return this.data;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int n3 = this.status.hashCode() * 31;
        return this.data.hashCode() + n3;
    }

    public final void setStatus(Status status) {
        Intrinsics.checkNotNullParameter(status, "<set-?>");
        this.status = status;
    }

    public String toString() {
        Status status = this.status;
        GPSResponse gPSResponse = this.data;
        StringBuilder stringBuilder = new StringBuilder("LocationResponse(status=");
        stringBuilder.append(status);
        stringBuilder.append(", data=");
        stringBuilder.append(gPSResponse);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

