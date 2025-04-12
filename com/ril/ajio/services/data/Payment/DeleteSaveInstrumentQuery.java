/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Customer;
import com.ril.ajio.services.data.Payment.Tenant;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class DeleteSaveInstrumentQuery {
    private String accessToken;
    private Customer customer;
    private String paymentInstrumentId;
    private String requestChecksum;
    private Tenant tenant;

    public DeleteSaveInstrumentQuery() {
        this(null, null, null, null, null, 31, null);
    }

    public DeleteSaveInstrumentQuery(String string2, String string3, String string4, Tenant tenant, Customer customer) {
        this.paymentInstrumentId = string2;
        this.accessToken = string3;
        this.requestChecksum = string4;
        this.tenant = tenant;
        this.customer = customer;
    }

    public /* synthetic */ DeleteSaveInstrumentQuery(String object, String object2, String string2, Tenant object3, Customer serializable, int n3, DefaultConstructorMarker object4) {
        Customer customer;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object4 = null;
        } else {
            object4 = object;
        }
        int n7 = n3 & 2;
        Object object5 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        String string3 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        Object object6 = n7 != 0 ? null : object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            n3 = 0;
            customer = null;
        } else {
            customer = serializable;
        }
        object = this;
        object2 = object4;
        string2 = object5;
        object3 = string3;
        serializable = object6;
        this((String)object4, (String)object5, string3, (Tenant)object6, customer);
    }

    public static /* synthetic */ DeleteSaveInstrumentQuery copy$default(DeleteSaveInstrumentQuery deleteSaveInstrumentQuery, String string2, String object, String string3, Tenant object2, Customer object3, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = deleteSaveInstrumentQuery.paymentInstrumentId;
        }
        if ((n4 = n3 & 2) != 0) {
            object = deleteSaveInstrumentQuery.accessToken;
        }
        object4 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = deleteSaveInstrumentQuery.requestChecksum;
        }
        String string4 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = deleteSaveInstrumentQuery.tenant;
        }
        Tenant tenant = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object3 = deleteSaveInstrumentQuery.customer;
        }
        Customer customer = object3;
        object = deleteSaveInstrumentQuery;
        string3 = string2;
        object2 = object4;
        object3 = string4;
        object4 = customer;
        return deleteSaveInstrumentQuery.copy(string2, (String)object2, string4, tenant, customer);
    }

    public final String component1() {
        return this.paymentInstrumentId;
    }

    public final String component2() {
        return this.accessToken;
    }

    public final String component3() {
        return this.requestChecksum;
    }

    public final Tenant component4() {
        return this.tenant;
    }

    public final Customer component5() {
        return this.customer;
    }

    public final DeleteSaveInstrumentQuery copy(String string2, String string3, String string4, Tenant tenant, Customer customer) {
        DeleteSaveInstrumentQuery deleteSaveInstrumentQuery = new DeleteSaveInstrumentQuery(string2, string3, string4, tenant, customer);
        return deleteSaveInstrumentQuery;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof DeleteSaveInstrumentQuery;
        if (!bl3) {
            return false;
        }
        object = (DeleteSaveInstrumentQuery)object;
        Object object2 = this.paymentInstrumentId;
        Object object3 = ((DeleteSaveInstrumentQuery)object).paymentInstrumentId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.accessToken;
        object3 = ((DeleteSaveInstrumentQuery)object).accessToken;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.requestChecksum;
        object3 = ((DeleteSaveInstrumentQuery)object).requestChecksum;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.tenant;
        object3 = ((DeleteSaveInstrumentQuery)object).tenant;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.customer;
        object = ((DeleteSaveInstrumentQuery)object).customer;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final Customer getCustomer() {
        return this.customer;
    }

    public final String getPaymentInstrumentId() {
        return this.paymentInstrumentId;
    }

    public final String getRequestChecksum() {
        return this.requestChecksum;
    }

    public final Tenant getTenant() {
        return this.tenant;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.paymentInstrumentId;
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
        object = this.requestChecksum;
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
        object = this.customer;
        if (object != null) {
            n7 = ((Customer)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setAccessToken(String string2) {
        this.accessToken = string2;
    }

    public final void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public final void setPaymentInstrumentId(String string2) {
        this.paymentInstrumentId = string2;
    }

    public final void setRequestChecksum(String string2) {
        this.requestChecksum = string2;
    }

    public final void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public String toString() {
        CharSequence charSequence = this.paymentInstrumentId;
        String string2 = this.accessToken;
        String string3 = this.requestChecksum;
        Tenant tenant = this.tenant;
        Customer customer = this.customer;
        charSequence = og_1.a("DeleteSaveInstrumentQuery(paymentInstrumentId=", (String)charSequence, ", accessToken=", string2, ", requestChecksum=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", tenant=");
        ((StringBuilder)charSequence).append(tenant);
        ((StringBuilder)charSequence).append(", customer=");
        ((StringBuilder)charSequence).append(customer);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

