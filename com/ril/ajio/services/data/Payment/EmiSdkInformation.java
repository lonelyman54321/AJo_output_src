/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Payload;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class EmiSdkInformation
implements Serializable {
    private final String expiry;
    private final Payload payload;
    private final String requestId;
    private final String service;

    public EmiSdkInformation() {
        this(null, null, null, null, 15, null);
    }

    public EmiSdkInformation(String string2, Payload payload, String string3, String string4) {
        this.expiry = string2;
        this.payload = payload;
        this.requestId = string3;
        this.service = string4;
    }

    public /* synthetic */ EmiSdkInformation(String string2, Payload payload, String string3, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            payload = null;
        }
        if ((n4 = n3 & 4) != 0) {
            string3 = null;
        }
        if ((n3 &= 8) != 0) {
            string4 = null;
        }
        this(string2, payload, string3, string4);
    }

    public static /* synthetic */ EmiSdkInformation copy$default(EmiSdkInformation emiSdkInformation, String string2, Payload payload, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = emiSdkInformation.expiry;
        }
        if ((n4 = n3 & 2) != 0) {
            payload = emiSdkInformation.payload;
        }
        if ((n4 = n3 & 4) != 0) {
            string3 = emiSdkInformation.requestId;
        }
        if ((n3 &= 8) != 0) {
            string4 = emiSdkInformation.service;
        }
        return emiSdkInformation.copy(string2, payload, string3, string4);
    }

    public final String component1() {
        return this.expiry;
    }

    public final Payload component2() {
        return this.payload;
    }

    public final String component3() {
        return this.requestId;
    }

    public final String component4() {
        return this.service;
    }

    public final EmiSdkInformation copy(String string2, Payload payload, String string3, String string4) {
        EmiSdkInformation emiSdkInformation = new EmiSdkInformation(string2, payload, string3, string4);
        return emiSdkInformation;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof EmiSdkInformation;
        if (!bl3) {
            return false;
        }
        object = (EmiSdkInformation)object;
        Object object2 = this.expiry;
        Object object3 = ((EmiSdkInformation)object).expiry;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.payload;
        object3 = ((EmiSdkInformation)object).payload;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.requestId;
        object3 = ((EmiSdkInformation)object).requestId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.service;
        object = ((EmiSdkInformation)object).service;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getExpiry() {
        return this.expiry;
    }

    public final Payload getPayload() {
        return this.payload;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getService() {
        return this.service;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.expiry;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.payload;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Payload)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.requestId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.service;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        String string2 = this.expiry;
        Payload payload = this.payload;
        String string3 = this.requestId;
        String string4 = this.service;
        StringBuilder stringBuilder = new StringBuilder("EmiSdkInformation(expiry=");
        stringBuilder.append(string2);
        stringBuilder.append(", payload=");
        stringBuilder.append(payload);
        stringBuilder.append(", requestId=");
        return ko_0.a(stringBuilder, string3, ", service=", string4, ")");
    }
}

