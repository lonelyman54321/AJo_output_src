/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ratings;

import com.ril.ajio.services.data.ratings.DeviceInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class RatingsRequestBody {
    private DeviceInfo deviceInfo;
    private Float rating;

    public RatingsRequestBody() {
        this(null, null, 3, null);
    }

    public RatingsRequestBody(DeviceInfo deviceInfo, Float f5) {
        this.deviceInfo = deviceInfo;
        this.rating = f5;
    }

    public /* synthetic */ RatingsRequestBody(DeviceInfo deviceInfo, Float f5, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            deviceInfo = null;
        }
        if ((n3 &= 2) != 0) {
            f5 = null;
        }
        this(deviceInfo, f5);
    }

    public static /* synthetic */ RatingsRequestBody copy$default(RatingsRequestBody ratingsRequestBody, DeviceInfo deviceInfo, Float f5, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            deviceInfo = ratingsRequestBody.deviceInfo;
        }
        if ((n3 &= 2) != 0) {
            f5 = ratingsRequestBody.rating;
        }
        return ratingsRequestBody.copy(deviceInfo, f5);
    }

    public final DeviceInfo component1() {
        return this.deviceInfo;
    }

    public final Float component2() {
        return this.rating;
    }

    public final RatingsRequestBody copy(DeviceInfo deviceInfo, Float f5) {
        RatingsRequestBody ratingsRequestBody = new RatingsRequestBody(deviceInfo, f5);
        return ratingsRequestBody;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof RatingsRequestBody;
        if (!bl3) {
            return false;
        }
        object = (RatingsRequestBody)object;
        Object object2 = this.deviceInfo;
        DeviceInfo deviceInfo = ((RatingsRequestBody)object).deviceInfo;
        bl3 = Intrinsics.areEqual(object2, deviceInfo);
        if (!bl3) {
            return false;
        }
        object2 = this.rating;
        object = ((RatingsRequestBody)object).rating;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public final Float getRating() {
        return this.rating;
    }

    public int hashCode() {
        int n3;
        DeviceInfo deviceInfo = this.deviceInfo;
        int n4 = 0;
        if (deviceInfo == null) {
            n3 = 0;
            deviceInfo = null;
        } else {
            n3 = deviceInfo.hashCode();
        }
        n3 *= 31;
        Float f5 = this.rating;
        if (f5 != null) {
            n4 = ((Object)f5).hashCode();
        }
        return n3 + n4;
    }

    public final void setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public final void setRating(Float f5) {
        this.rating = f5;
    }

    public String toString() {
        DeviceInfo deviceInfo = this.deviceInfo;
        Float f5 = this.rating;
        StringBuilder stringBuilder = new StringBuilder("RatingsRequestBody(deviceInfo=");
        stringBuilder.append(deviceInfo);
        stringBuilder.append(", rating=");
        stringBuilder.append(f5);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

