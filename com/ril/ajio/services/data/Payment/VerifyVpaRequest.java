/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Tenant;
import com.ril.ajio.services.data.Payment.VerifyVpaRequestUPI;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class VerifyVpaRequest {
    private String accessToken;
    private Tenant tenant;
    private VerifyVpaRequestUPI upi;

    public VerifyVpaRequest(String string2, Tenant tenant, VerifyVpaRequestUPI verifyVpaRequestUPI) {
        this.accessToken = string2;
        this.tenant = tenant;
        this.upi = verifyVpaRequestUPI;
    }

    public /* synthetic */ VerifyVpaRequest(String string2, Tenant tenant, VerifyVpaRequestUPI verifyVpaRequestUPI, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            tenant = null;
        }
        this(string2, tenant, verifyVpaRequestUPI);
    }

    public static /* synthetic */ VerifyVpaRequest copy$default(VerifyVpaRequest verifyVpaRequest, String string2, Tenant tenant, VerifyVpaRequestUPI verifyVpaRequestUPI, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = verifyVpaRequest.accessToken;
        }
        if ((n4 = n3 & 2) != 0) {
            tenant = verifyVpaRequest.tenant;
        }
        if ((n3 &= 4) != 0) {
            verifyVpaRequestUPI = verifyVpaRequest.upi;
        }
        return verifyVpaRequest.copy(string2, tenant, verifyVpaRequestUPI);
    }

    public final String component1() {
        return this.accessToken;
    }

    public final Tenant component2() {
        return this.tenant;
    }

    public final VerifyVpaRequestUPI component3() {
        return this.upi;
    }

    public final VerifyVpaRequest copy(String string2, Tenant tenant, VerifyVpaRequestUPI verifyVpaRequestUPI) {
        VerifyVpaRequest verifyVpaRequest = new VerifyVpaRequest(string2, tenant, verifyVpaRequestUPI);
        return verifyVpaRequest;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof VerifyVpaRequest;
        if (!bl3) {
            return false;
        }
        object = (VerifyVpaRequest)object;
        Object object2 = this.accessToken;
        Object object3 = ((VerifyVpaRequest)object).accessToken;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.tenant;
        object3 = ((VerifyVpaRequest)object).tenant;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.upi;
        object = ((VerifyVpaRequest)object).upi;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final Tenant getTenant() {
        return this.tenant;
    }

    public final VerifyVpaRequestUPI getUpi() {
        return this.upi;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.accessToken;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.tenant;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Tenant)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.upi;
        if (object != null) {
            n7 = ((VerifyVpaRequestUPI)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setAccessToken(String string2) {
        this.accessToken = string2;
    }

    public final void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public final void setUpi(VerifyVpaRequestUPI verifyVpaRequestUPI) {
        this.upi = verifyVpaRequestUPI;
    }

    public String toString() {
        String string2 = this.accessToken;
        Tenant tenant = this.tenant;
        VerifyVpaRequestUPI verifyVpaRequestUPI = this.upi;
        StringBuilder stringBuilder = new StringBuilder("VerifyVpaRequest(accessToken=");
        stringBuilder.append(string2);
        stringBuilder.append(", tenant=");
        stringBuilder.append(tenant);
        stringBuilder.append(", upi=");
        stringBuilder.append(verifyVpaRequestUPI);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

