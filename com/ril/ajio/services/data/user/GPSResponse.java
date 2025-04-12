/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.user;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class GPSResponse {
    private String city;
    private boolean invalidpostalcode;
    private String pincodeGroup;
    private String postalCode;
    private String state;
    private String zone;

    public GPSResponse(String string2, boolean bl2, String string3, String string4, String string5, String string6) {
        this.city = string2;
        this.invalidpostalcode = bl2;
        this.state = string3;
        this.zone = string4;
        this.postalCode = string5;
        this.pincodeGroup = string6;
    }

    public /* synthetic */ GPSResponse(String string2, boolean bl2, String string3, String string4, String string5, String string6, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        String string7 = n4 != 0 ? null : string2;
        n4 = n3 & 4;
        String string8 = n4 != 0 ? null : string3;
        n4 = n3 & 0x10;
        String string9 = n4 != 0 ? null : string5;
        this(string7, bl2, string8, string4, string9, string6);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ GPSResponse copy$default(GPSResponse gPSResponse, String string2, boolean bl2, String string3, String string4, String string5, String string6, int n3, Object object) {
        String string7;
        String string8;
        String string9;
        String string10;
        boolean bl3;
        void var7_12;
        int n4 = var7_12 & 1;
        if (n4) {
            string2 = gPSResponse.city;
        }
        if (n4 = var7_12 & 2) {
            bl3 = gPSResponse.invalidpostalcode;
        }
        n4 = bl3;
        int n7 = var7_12 & 4;
        if (n7 != 0) {
            string10 = gPSResponse.state;
        }
        void var10_15 = string10;
        int n8 = var7_12 & 8;
        if (n8 != 0) {
            string9 = gPSResponse.zone;
        }
        void var11_16 = string9;
        int n10 = var7_12 & 0x10;
        if (n10 != 0) {
            string8 = gPSResponse.postalCode;
        }
        void var12_17 = string8;
        int n14 = var7_12 & 0x20;
        if (n14 != 0) {
            string7 = gPSResponse.pincodeGroup;
        }
        void var13_18 = string7;
        string10 = string2;
        string8 = var10_15;
        string7 = var11_16;
        return gPSResponse.copy(string2, n4 != 0, (String)var10_15, (String)var11_16, (String)var12_17, (String)var13_18);
    }

    public final String component1() {
        return this.city;
    }

    public final boolean component2() {
        return this.invalidpostalcode;
    }

    public final String component3() {
        return this.state;
    }

    public final String component4() {
        return this.zone;
    }

    public final String component5() {
        return this.postalCode;
    }

    public final String component6() {
        return this.pincodeGroup;
    }

    public final GPSResponse copy(String string2, boolean bl2, String string3, String string4, String string5, String string6) {
        GPSResponse gPSResponse = new GPSResponse(string2, bl2, string3, string4, string5, string6);
        return gPSResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof GPSResponse;
        if (!bl3) {
            return false;
        }
        object = (GPSResponse)object;
        String string2 = this.city;
        String string3 = ((GPSResponse)object).city;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        bl3 = this.invalidpostalcode;
        boolean bl4 = ((GPSResponse)object).invalidpostalcode;
        if (bl3 != bl4) {
            return false;
        }
        string2 = this.state;
        string3 = ((GPSResponse)object).state;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.zone;
        string3 = ((GPSResponse)object).zone;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.postalCode;
        string3 = ((GPSResponse)object).postalCode;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.pincodeGroup;
        object = ((GPSResponse)object).pincodeGroup;
        boolean bl5 = Intrinsics.areEqual(string2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final String getCity() {
        return this.city;
    }

    public final boolean getInvalidpostalcode() {
        return this.invalidpostalcode;
    }

    public final String getPincodeGroup() {
        return this.pincodeGroup;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getState() {
        return this.state;
    }

    public final String getZone() {
        return this.zone;
    }

    public int hashCode() {
        int n3;
        String string2 = this.city;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        int n7 = this.invalidpostalcode;
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 + n7) * 31;
        String string3 = this.state;
        if (string3 == null) {
            n7 = 0;
            string3 = null;
        } else {
            n7 = string3.hashCode();
        }
        n3 = (n3 + n7) * 31;
        string3 = this.zone;
        if (string3 == null) {
            n7 = 0;
            string3 = null;
        } else {
            n7 = string3.hashCode();
        }
        n3 = (n3 + n7) * 31;
        string3 = this.postalCode;
        if (string3 == null) {
            n7 = 0;
            string3 = null;
        } else {
            n7 = string3.hashCode();
        }
        n3 = (n3 + n7) * 31;
        string3 = this.pincodeGroup;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public final void setCity(String string2) {
        this.city = string2;
    }

    public final void setInvalidpostalcode(boolean bl2) {
        this.invalidpostalcode = bl2;
    }

    public final void setPincodeGroup(String string2) {
        this.pincodeGroup = string2;
    }

    public final void setPostalCode(String string2) {
        this.postalCode = string2;
    }

    public final void setState(String string2) {
        this.state = string2;
    }

    public final void setZone(String string2) {
        this.zone = string2;
    }

    public String toString() {
        String string2 = this.city;
        boolean bl2 = this.invalidpostalcode;
        String string3 = this.state;
        String string4 = this.zone;
        String string5 = this.postalCode;
        String string6 = this.pincodeGroup;
        StringBuilder stringBuilder = new StringBuilder("GPSResponse(city=");
        stringBuilder.append(string2);
        stringBuilder.append(", invalidpostalcode=");
        stringBuilder.append(bl2);
        stringBuilder.append(", state=");
        X50.a(stringBuilder, string3, ", zone=", string4, ", postalCode=");
        return ko_0.a(stringBuilder, string5, ", pincodeGroup=", string6, ")");
    }
}

