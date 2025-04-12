/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Customer;
import com.ril.ajio.services.data.Payment.Tenant;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PEToken {
    private String accessToken;
    private Customer customer;
    private String requestChecksum;
    private Tenant tenant;

    public PEToken() {
        this(null, null, null, null, 15, null);
    }

    public PEToken(String string2, Customer customer, String string3, Tenant tenant) {
        this.accessToken = string2;
        this.customer = customer;
        this.requestChecksum = string3;
        this.tenant = tenant;
    }

    public /* synthetic */ PEToken(String string2, Customer customer, String string3, Tenant tenant, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            customer = null;
        }
        if ((n4 = n3 & 4) != 0) {
            string3 = null;
        }
        if ((n3 &= 8) != 0) {
            tenant = null;
        }
        this(string2, customer, string3, tenant);
    }

    public static /* synthetic */ PEToken copy$default(PEToken pEToken, String string2, Customer customer, String string3, Tenant tenant, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = pEToken.accessToken;
        }
        if ((n4 = n3 & 2) != 0) {
            customer = pEToken.customer;
        }
        if ((n4 = n3 & 4) != 0) {
            string3 = pEToken.requestChecksum;
        }
        if ((n3 &= 8) != 0) {
            tenant = pEToken.tenant;
        }
        return pEToken.copy(string2, customer, string3, tenant);
    }

    public final String component1() {
        return this.accessToken;
    }

    public final Customer component2() {
        return this.customer;
    }

    public final String component3() {
        return this.requestChecksum;
    }

    public final Tenant component4() {
        return this.tenant;
    }

    public final PEToken copy(String string2, Customer customer, String string3, Tenant tenant) {
        PEToken pEToken = new PEToken(string2, customer, string3, tenant);
        return pEToken;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PEToken;
        if (!bl3) {
            return false;
        }
        object = (PEToken)object;
        Object object2 = this.accessToken;
        Object object3 = ((PEToken)object).accessToken;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.customer;
        object3 = ((PEToken)object).customer;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.requestChecksum;
        object3 = ((PEToken)object).requestChecksum;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.tenant;
        object = ((PEToken)object).tenant;
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

    public final String getRequestChecksum() {
        return this.requestChecksum;
    }

    public final Tenant getTenant() {
        return this.tenant;
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
        Object object = this.customer;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Customer)object).hashCode();
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
        if (object != null) {
            n7 = ((Tenant)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setAccessToken(String string2) {
        this.accessToken = string2;
    }

    public final void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public final void setRequestChecksum(String string2) {
        this.requestChecksum = string2;
    }

    public final void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public String toString() {
        String string2 = this.accessToken;
        Customer customer = this.customer;
        String string3 = this.requestChecksum;
        Tenant tenant = this.tenant;
        StringBuilder stringBuilder = new StringBuilder("PEToken(accessToken=");
        stringBuilder.append(string2);
        stringBuilder.append(", customer=");
        stringBuilder.append(customer);
        stringBuilder.append(", requestChecksum=");
        stringBuilder.append(string3);
        stringBuilder.append(", tenant=");
        stringBuilder.append(tenant);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

