/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ajiocash;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Customer {
    private final String email;
    private final String uuid;

    public Customer() {
        this(null, null, 3, null);
    }

    public Customer(String string2, String string3) {
        this.uuid = string2;
        this.email = string3;
    }

    public /* synthetic */ Customer(String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            string3 = null;
        }
        this(string2, string3);
    }

    public static /* synthetic */ Customer copy$default(Customer customer, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = customer.uuid;
        }
        if ((n3 &= 2) != 0) {
            string3 = customer.email;
        }
        return customer.copy(string2, string3);
    }

    public final String component1() {
        return this.uuid;
    }

    public final String component2() {
        return this.email;
    }

    public final Customer copy(String string2, String string3) {
        Customer customer = new Customer(string2, string3);
        return customer;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Customer;
        if (!bl3) {
            return false;
        }
        object = (Customer)object;
        String string2 = this.uuid;
        String string3 = ((Customer)object).uuid;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.email;
        object = ((Customer)object).email;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int n3;
        String string2 = this.uuid;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.email;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        String string2 = this.uuid;
        String string3 = this.email;
        return uc0_0.a("Customer(uuid=", string2, ", email=", string3, ")");
    }
}

