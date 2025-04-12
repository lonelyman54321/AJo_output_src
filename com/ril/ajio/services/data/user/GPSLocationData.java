/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.user;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class GPSLocationData {
    private Double latitude;
    private Double longitude;
    private String pincode;

    public GPSLocationData() {
        this(null, null, null, 7, null);
    }

    public GPSLocationData(Double d2, Double d5, String string2) {
        this.latitude = d2;
        this.longitude = d5;
        this.pincode = string2;
    }

    public /* synthetic */ GPSLocationData(Double d2, Double d5, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            d2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            d5 = null;
        }
        if ((n3 &= 4) != 0) {
            string2 = null;
        }
        this(d2, d5, string2);
    }

    public static /* synthetic */ GPSLocationData copy$default(GPSLocationData gPSLocationData, Double d2, Double d5, String string2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            d2 = gPSLocationData.latitude;
        }
        if ((n4 = n3 & 2) != 0) {
            d5 = gPSLocationData.longitude;
        }
        if ((n3 &= 4) != 0) {
            string2 = gPSLocationData.pincode;
        }
        return gPSLocationData.copy(d2, d5, string2);
    }

    public final Double component1() {
        return this.latitude;
    }

    public final Double component2() {
        return this.longitude;
    }

    public final String component3() {
        return this.pincode;
    }

    public final GPSLocationData copy(Double d2, Double d5, String string2) {
        GPSLocationData gPSLocationData = new GPSLocationData(d2, d5, string2);
        return gPSLocationData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof GPSLocationData;
        if (!bl3) {
            return false;
        }
        object = (GPSLocationData)object;
        Object object2 = this.latitude;
        Double d2 = ((GPSLocationData)object).latitude;
        bl3 = Intrinsics.areEqual(object2, (Object)d2);
        if (!bl3) {
            return false;
        }
        object2 = this.longitude;
        d2 = ((GPSLocationData)object).longitude;
        bl3 = Intrinsics.areEqual(object2, (Object)d2);
        if (!bl3) {
            return false;
        }
        object2 = this.pincode;
        object = ((GPSLocationData)object).pincode;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final String getPincode() {
        return this.pincode;
    }

    public int hashCode() {
        int n3;
        int n4;
        Double d2 = this.latitude;
        int n7 = 0;
        if (d2 == null) {
            n4 = 0;
            d2 = null;
        } else {
            n4 = ((Object)d2).hashCode();
        }
        n4 *= 31;
        Object object = this.longitude;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pincode;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setLatitude(Double d2) {
        this.latitude = d2;
    }

    public final void setLongitude(Double d2) {
        this.longitude = d2;
    }

    public final void setPincode(String string2) {
        this.pincode = string2;
    }

    public String toString() {
        Double d2 = this.latitude;
        Double d5 = this.longitude;
        String string2 = this.pincode;
        StringBuilder stringBuilder = new StringBuilder("GPSLocationData(latitude=");
        stringBuilder.append(d2);
        stringBuilder.append(", longitude=");
        stringBuilder.append(d5);
        stringBuilder.append(", pincode=");
        return h30_0.a(stringBuilder, string2, ")");
    }
}

