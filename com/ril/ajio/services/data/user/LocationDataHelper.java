/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.user;

import com.ril.ajio.services.data.user.LocationItemDataHelper;
import kotlin.jvm.internal.Intrinsics;

public final class LocationDataHelper {
    private LocationItemDataHelper city;
    private LocationItemDataHelper state;
    private LocationItemDataHelper zone;

    public LocationDataHelper(LocationItemDataHelper locationItemDataHelper, LocationItemDataHelper locationItemDataHelper2, LocationItemDataHelper locationItemDataHelper3) {
        this.city = locationItemDataHelper;
        this.state = locationItemDataHelper2;
        this.zone = locationItemDataHelper3;
    }

    public static /* synthetic */ LocationDataHelper copy$default(LocationDataHelper locationDataHelper, LocationItemDataHelper locationItemDataHelper, LocationItemDataHelper locationItemDataHelper2, LocationItemDataHelper locationItemDataHelper3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            locationItemDataHelper = locationDataHelper.city;
        }
        if ((n4 = n3 & 2) != 0) {
            locationItemDataHelper2 = locationDataHelper.state;
        }
        if ((n3 &= 4) != 0) {
            locationItemDataHelper3 = locationDataHelper.zone;
        }
        return locationDataHelper.copy(locationItemDataHelper, locationItemDataHelper2, locationItemDataHelper3);
    }

    public final LocationItemDataHelper component1() {
        return this.city;
    }

    public final LocationItemDataHelper component2() {
        return this.state;
    }

    public final LocationItemDataHelper component3() {
        return this.zone;
    }

    public final LocationDataHelper copy(LocationItemDataHelper locationItemDataHelper, LocationItemDataHelper locationItemDataHelper2, LocationItemDataHelper locationItemDataHelper3) {
        LocationDataHelper locationDataHelper = new LocationDataHelper(locationItemDataHelper, locationItemDataHelper2, locationItemDataHelper3);
        return locationDataHelper;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof LocationDataHelper;
        if (!bl3) {
            return false;
        }
        object = (LocationDataHelper)object;
        LocationItemDataHelper locationItemDataHelper = this.city;
        LocationItemDataHelper locationItemDataHelper2 = ((LocationDataHelper)object).city;
        bl3 = Intrinsics.areEqual(locationItemDataHelper, locationItemDataHelper2);
        if (!bl3) {
            return false;
        }
        locationItemDataHelper = this.state;
        locationItemDataHelper2 = ((LocationDataHelper)object).state;
        bl3 = Intrinsics.areEqual(locationItemDataHelper, locationItemDataHelper2);
        if (!bl3) {
            return false;
        }
        locationItemDataHelper = this.zone;
        object = ((LocationDataHelper)object).zone;
        boolean bl4 = Intrinsics.areEqual(locationItemDataHelper, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final LocationItemDataHelper getCity() {
        return this.city;
    }

    public final LocationItemDataHelper getState() {
        return this.state;
    }

    public final LocationItemDataHelper getZone() {
        return this.zone;
    }

    public int hashCode() {
        int n3;
        int n4;
        LocationItemDataHelper locationItemDataHelper = this.city;
        int n7 = 0;
        if (locationItemDataHelper == null) {
            n4 = 0;
            locationItemDataHelper = null;
        } else {
            n4 = locationItemDataHelper.hashCode();
        }
        n4 *= 31;
        LocationItemDataHelper locationItemDataHelper2 = this.state;
        if (locationItemDataHelper2 == null) {
            n3 = 0;
            locationItemDataHelper2 = null;
        } else {
            n3 = locationItemDataHelper2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        locationItemDataHelper2 = this.zone;
        if (locationItemDataHelper2 != null) {
            n7 = locationItemDataHelper2.hashCode();
        }
        return n4 + n7;
    }

    public final void setCity(LocationItemDataHelper locationItemDataHelper) {
        this.city = locationItemDataHelper;
    }

    public final void setState(LocationItemDataHelper locationItemDataHelper) {
        this.state = locationItemDataHelper;
    }

    public final void setZone(LocationItemDataHelper locationItemDataHelper) {
        this.zone = locationItemDataHelper;
    }

    public String toString() {
        LocationItemDataHelper locationItemDataHelper = this.city;
        LocationItemDataHelper locationItemDataHelper2 = this.state;
        LocationItemDataHelper locationItemDataHelper3 = this.zone;
        StringBuilder stringBuilder = new StringBuilder("LocationDataHelper(city=");
        stringBuilder.append(locationItemDataHelper);
        stringBuilder.append(", state=");
        stringBuilder.append(locationItemDataHelper2);
        stringBuilder.append(", zone=");
        stringBuilder.append(locationItemDataHelper3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

