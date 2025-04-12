/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Tenant;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class BinRequest {
    private String accessToken;
    private String binNumber;
    private Tenant tenant;

    public BinRequest() {
        this(null, null, null, 7, null);
    }

    public BinRequest(Tenant tenant, String string2, String string3) {
        this.tenant = tenant;
        this.accessToken = string2;
        this.binNumber = string3;
    }

    public /* synthetic */ BinRequest(Tenant tenant, String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            tenant = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = null;
        }
        if ((n3 &= 4) != 0) {
            string3 = null;
        }
        this(tenant, string2, string3);
    }

    public static /* synthetic */ BinRequest copy$default(BinRequest binRequest, Tenant tenant, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            tenant = binRequest.tenant;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = binRequest.accessToken;
        }
        if ((n3 &= 4) != 0) {
            string3 = binRequest.binNumber;
        }
        return binRequest.copy(tenant, string2, string3);
    }

    public final Tenant component1() {
        return this.tenant;
    }

    public final String component2() {
        return this.accessToken;
    }

    public final String component3() {
        return this.binNumber;
    }

    public final BinRequest copy(Tenant tenant, String string2, String string3) {
        BinRequest binRequest = new BinRequest(tenant, string2, string3);
        return binRequest;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BinRequest;
        if (!bl3) {
            return false;
        }
        object = (BinRequest)object;
        Object object2 = this.tenant;
        Object object3 = ((BinRequest)object).tenant;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.accessToken;
        object3 = ((BinRequest)object).accessToken;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.binNumber;
        object = ((BinRequest)object).binNumber;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getBinNumber() {
        return this.binNumber;
    }

    public final Tenant getTenant() {
        return this.tenant;
    }

    public int hashCode() {
        int n3;
        int n4;
        Tenant tenant = this.tenant;
        int n7 = 0;
        if (tenant == null) {
            n4 = 0;
            tenant = null;
        } else {
            n4 = tenant.hashCode();
        }
        n4 *= 31;
        String string2 = this.accessToken;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.binNumber;
        if (string2 != null) {
            n7 = string2.hashCode();
        }
        return n4 + n7;
    }

    public final void setAccessToken(String string2) {
        this.accessToken = string2;
    }

    public final void setBinNumber(String string2) {
        this.binNumber = string2;
    }

    public final void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public String toString() {
        Tenant tenant = this.tenant;
        String string2 = this.accessToken;
        String string3 = this.binNumber;
        StringBuilder stringBuilder = new StringBuilder("BinRequest(tenant=");
        stringBuilder.append(tenant);
        stringBuilder.append(", accessToken=");
        stringBuilder.append(string2);
        stringBuilder.append(", binNumber=");
        return h30_0.a(stringBuilder, string3, ")");
    }
}

