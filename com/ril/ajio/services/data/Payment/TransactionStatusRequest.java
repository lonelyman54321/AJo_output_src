/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Tenant;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class TransactionStatusRequest {
    private String accessToken;
    private String requestChecksum;
    private Tenant tenant;
    private String tenantTransactionId;

    public TransactionStatusRequest() {
        this(null, null, null, null, 15, null);
    }

    public TransactionStatusRequest(String string2, String string3, Tenant tenant, String string4) {
        this.tenantTransactionId = string2;
        this.accessToken = string3;
        this.tenant = tenant;
        this.requestChecksum = string4;
    }

    public /* synthetic */ TransactionStatusRequest(String string2, String string3, Tenant tenant, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n4 = n3 & 4) != 0) {
            tenant = null;
        }
        if ((n3 &= 8) != 0) {
            string4 = null;
        }
        this(string2, string3, tenant, string4);
    }

    public static /* synthetic */ TransactionStatusRequest copy$default(TransactionStatusRequest transactionStatusRequest, String string2, String string3, Tenant tenant, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = transactionStatusRequest.tenantTransactionId;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = transactionStatusRequest.accessToken;
        }
        if ((n4 = n3 & 4) != 0) {
            tenant = transactionStatusRequest.tenant;
        }
        if ((n3 &= 8) != 0) {
            string4 = transactionStatusRequest.requestChecksum;
        }
        return transactionStatusRequest.copy(string2, string3, tenant, string4);
    }

    public final String component1() {
        return this.tenantTransactionId;
    }

    public final String component2() {
        return this.accessToken;
    }

    public final Tenant component3() {
        return this.tenant;
    }

    public final String component4() {
        return this.requestChecksum;
    }

    public final TransactionStatusRequest copy(String string2, String string3, Tenant tenant, String string4) {
        TransactionStatusRequest transactionStatusRequest = new TransactionStatusRequest(string2, string3, tenant, string4);
        return transactionStatusRequest;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof TransactionStatusRequest;
        if (!bl3) {
            return false;
        }
        object = (TransactionStatusRequest)object;
        Object object2 = this.tenantTransactionId;
        Object object3 = ((TransactionStatusRequest)object).tenantTransactionId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.accessToken;
        object3 = ((TransactionStatusRequest)object).accessToken;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.tenant;
        object3 = ((TransactionStatusRequest)object).tenant;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.requestChecksum;
        object = ((TransactionStatusRequest)object).requestChecksum;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getRequestChecksum() {
        return this.requestChecksum;
    }

    public final Tenant getTenant() {
        return this.tenant;
    }

    public final String getTenantTransactionId() {
        return this.tenantTransactionId;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.tenantTransactionId;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.accessToken;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.tenant;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Tenant)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.requestChecksum;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setAccessToken(String string2) {
        this.accessToken = string2;
    }

    public final void setRequestChecksum(String string2) {
        this.requestChecksum = string2;
    }

    public final void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public final void setTenantTransactionId(String string2) {
        this.tenantTransactionId = string2;
    }

    public String toString() {
        CharSequence charSequence = this.tenantTransactionId;
        String string2 = this.accessToken;
        Tenant tenant = this.tenant;
        String string3 = this.requestChecksum;
        charSequence = og_1.a("TransactionStatusRequest(tenantTransactionId=", (String)charSequence, ", accessToken=", string2, ", tenant=");
        ((StringBuilder)charSequence).append(tenant);
        ((StringBuilder)charSequence).append(", requestChecksum=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

