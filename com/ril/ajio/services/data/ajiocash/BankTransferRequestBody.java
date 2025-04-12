/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ajiocash;

import com.ril.ajio.services.data.ajiocash.Customer;
import com.ril.ajio.services.data.ajiocash.Tenant;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class BankTransferRequestBody {
    private final String accessToken;
    private final Customer customer;
    private final String paymentEngineTransactionId;
    private final Tenant tenant;

    public BankTransferRequestBody() {
        this(null, null, null, null, 15, null);
    }

    public BankTransferRequestBody(String string2, Customer customer, String string3, Tenant tenant) {
        this.accessToken = string2;
        this.customer = customer;
        this.paymentEngineTransactionId = string3;
        this.tenant = tenant;
    }

    public /* synthetic */ BankTransferRequestBody(String string2, Customer customer, String string3, Tenant tenant, int n3, DefaultConstructorMarker defaultConstructorMarker) {
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

    public static /* synthetic */ BankTransferRequestBody copy$default(BankTransferRequestBody bankTransferRequestBody, String string2, Customer customer, String string3, Tenant tenant, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = bankTransferRequestBody.accessToken;
        }
        if ((n4 = n3 & 2) != 0) {
            customer = bankTransferRequestBody.customer;
        }
        if ((n4 = n3 & 4) != 0) {
            string3 = bankTransferRequestBody.paymentEngineTransactionId;
        }
        if ((n3 &= 8) != 0) {
            tenant = bankTransferRequestBody.tenant;
        }
        return bankTransferRequestBody.copy(string2, customer, string3, tenant);
    }

    public final String component1() {
        return this.accessToken;
    }

    public final Customer component2() {
        return this.customer;
    }

    public final String component3() {
        return this.paymentEngineTransactionId;
    }

    public final Tenant component4() {
        return this.tenant;
    }

    public final BankTransferRequestBody copy(String string2, Customer customer, String string3, Tenant tenant) {
        BankTransferRequestBody bankTransferRequestBody = new BankTransferRequestBody(string2, customer, string3, tenant);
        return bankTransferRequestBody;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BankTransferRequestBody;
        if (!bl3) {
            return false;
        }
        object = (BankTransferRequestBody)object;
        Object object2 = this.accessToken;
        Object object3 = ((BankTransferRequestBody)object).accessToken;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.customer;
        object3 = ((BankTransferRequestBody)object).customer;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentEngineTransactionId;
        object3 = ((BankTransferRequestBody)object).paymentEngineTransactionId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.tenant;
        object = ((BankTransferRequestBody)object).tenant;
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

    public final String getPaymentEngineTransactionId() {
        return this.paymentEngineTransactionId;
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
        object = this.paymentEngineTransactionId;
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

    public String toString() {
        String string2 = this.accessToken;
        Customer customer = this.customer;
        String string3 = this.paymentEngineTransactionId;
        Tenant tenant = this.tenant;
        StringBuilder stringBuilder = new StringBuilder("BankTransferRequestBody(accessToken=");
        stringBuilder.append(string2);
        stringBuilder.append(", customer=");
        stringBuilder.append(customer);
        stringBuilder.append(", paymentEngineTransactionId=");
        stringBuilder.append(string3);
        stringBuilder.append(", tenant=");
        stringBuilder.append(tenant);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

