/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.user;

import com.ril.ajio.services.data.user.LocationData$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class LocationData {
    public static final LocationData$Companion Companion;
    public static final int SOURCE_TYPE_ADDRESS = 101;
    public static final int SOURCE_TYPE_GPS = 103;
    public static final int SOURCE_TYPE_PINCODE = 102;
    private String city;
    private String pincode;
    private int source;
    private String state;
    private String zone;

    static {
        LocationData$Companion locationData$Companion;
        Companion = locationData$Companion = new LocationData$Companion(null);
    }

    public LocationData(int n3, String string2, String string3, String string4, String string5) {
        this.source = n3;
        this.city = string2;
        this.state = string3;
        this.zone = string4;
        this.pincode = string5;
    }

    public /* synthetic */ LocationData(int n3, String string2, String string3, String string4, String string5, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7;
        if ((n4 &= 1) != 0) {
            n3 = -1;
            n7 = -1;
        } else {
            n7 = n3;
        }
        this(n7, string2, string3, string4, string5);
    }

    public static /* synthetic */ LocationData copy$default(LocationData locationData, int n3, String object, String string2, String object2, String string3, int n4, Object object3) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = locationData.source;
        }
        if ((n7 = n4 & 2) != 0) {
            object = locationData.city;
        }
        object3 = object;
        int n8 = n4 & 4;
        if (n8 != 0) {
            string2 = locationData.state;
        }
        String string4 = string2;
        n8 = n4 & 8;
        if (n8 != 0) {
            object2 = locationData.zone;
        }
        String string5 = object2;
        n8 = n4 & 0x10;
        if (n8 != 0) {
            string3 = locationData.pincode;
        }
        String string6 = string3;
        object = locationData;
        object2 = object3;
        string3 = string4;
        object3 = string6;
        return locationData.copy(n3, (String)object2, string4, string5, string6);
    }

    public static final boolean isDiffLocaleData(LocationData locationData, LocationData locationData2) {
        return Companion.isDiffLocaleData(locationData, locationData2);
    }

    public final int component1() {
        return this.source;
    }

    public final String component2() {
        return this.city;
    }

    public final String component3() {
        return this.state;
    }

    public final String component4() {
        return this.zone;
    }

    public final String component5() {
        return this.pincode;
    }

    public final LocationData copy(int n3, String string2, String string3, String string4, String string5) {
        LocationData locationData = new LocationData(n3, string2, string3, string4, string5);
        return locationData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof LocationData;
        if (n3 == 0) {
            return false;
        }
        object = (LocationData)object;
        n3 = this.source;
        int n4 = ((LocationData)object).source;
        if (n3 != n4) {
            return false;
        }
        String string2 = this.city;
        String string3 = ((LocationData)object).city;
        n3 = (int)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        string2 = this.state;
        string3 = ((LocationData)object).state;
        n3 = (int)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        string2 = this.zone;
        string3 = ((LocationData)object).zone;
        n3 = (int)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        string2 = this.pincode;
        object = ((LocationData)object).pincode;
        boolean bl3 = Intrinsics.areEqual(string2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getPincode() {
        return this.pincode;
    }

    public final int getSource() {
        return this.source;
    }

    public final String getState() {
        return this.state;
    }

    public final String getZone() {
        return this.zone;
    }

    public int hashCode() {
        int n3;
        int n4 = this.source * 31;
        String string2 = this.city;
        int n7 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.state;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.zone;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.pincode;
        if (string2 != null) {
            n7 = string2.hashCode();
        }
        return n4 + n7;
    }

    public final void setCity(String string2) {
        this.city = string2;
    }

    public final void setPincode(String string2) {
        this.pincode = string2;
    }

    public final void setSource(int n3) {
        this.source = n3;
    }

    public final void setState(String string2) {
        this.state = string2;
    }

    public final void setZone(String string2) {
        this.zone = string2;
    }

    public String toString() {
        int n3 = this.source;
        String string2 = this.city;
        String string3 = this.state;
        String string4 = this.zone;
        String string5 = this.pincode;
        StringBuilder stringBuilder = Fh3.a(n3, "LocationData(source=", ", city=", string2, ", state=");
        X50.a(stringBuilder, string3, ", zone=", string4, ", pincode=");
        return h30_0.a(stringBuilder, string5, ")");
    }
}

