/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Customer
implements Serializable {
    private String email;
    private String firstName;
    private String lastName;
    private String mobile;
    private String name;
    private String otp;
    private String uuid;

    public Customer() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public Customer(String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        this.name = string2;
        this.uuid = string3;
        this.firstName = string4;
        this.lastName = string5;
        this.otp = string6;
        this.email = string7;
        this.mobile = string8;
    }

    public /* synthetic */ Customer(String object, String object2, String string2, String string3, String string4, String string5, String string6, int n3, DefaultConstructorMarker object3) {
        String string7;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object3 = null;
        } else {
            object3 = object;
        }
        int n7 = n3 & 2;
        Object object4 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        String string8 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        String string9 = n7 != 0 ? null : string3;
        n7 = n3 & 0x10;
        String string10 = n7 != 0 ? null : string4;
        n7 = n3 & 0x20;
        String string11 = n7 != 0 ? null : string5;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            n3 = 0;
            string7 = null;
        } else {
            string7 = string6;
        }
        object = this;
        object2 = object3;
        string2 = object4;
        string3 = string8;
        string4 = string9;
        string5 = string10;
        string6 = string11;
        this((String)object3, (String)object4, string8, string9, string10, string11, string7);
    }

    public static /* synthetic */ Customer copy$default(Customer customer, String string2, String object, String string3, String object2, String string4, String string5, String string6, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = customer.name;
        }
        if ((n4 = n3 & 2) != 0) {
            object = customer.uuid;
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = customer.firstName;
        }
        String string7 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = customer.lastName;
        }
        String string8 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string4 = customer.otp;
        }
        String string9 = string4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            string5 = customer.email;
        }
        String string10 = string5;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            string6 = customer.mobile;
        }
        String string11 = string6;
        object = customer;
        string3 = string2;
        object2 = object3;
        string4 = string7;
        string5 = string8;
        string6 = string9;
        object3 = string11;
        return customer.copy(string2, (String)object2, string7, string8, string9, string10, string11);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.uuid;
    }

    public final String component3() {
        return this.firstName;
    }

    public final String component4() {
        return this.lastName;
    }

    public final String component5() {
        return this.otp;
    }

    public final String component6() {
        return this.email;
    }

    public final String component7() {
        return this.mobile;
    }

    public final Customer copy(String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        Customer customer = new Customer(string2, string3, string4, string5, string6, string7, string8);
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
        String string2 = this.name;
        String string3 = ((Customer)object).name;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.uuid;
        string3 = ((Customer)object).uuid;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.firstName;
        string3 = ((Customer)object).firstName;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.lastName;
        string3 = ((Customer)object).lastName;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.otp;
        string3 = ((Customer)object).otp;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.email;
        string3 = ((Customer)object).email;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.mobile;
        object = ((Customer)object).mobile;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOtp() {
        return this.otp;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.name;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.uuid;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.firstName;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.lastName;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.otp;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.email;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.mobile;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setEmail(String string2) {
        this.email = string2;
    }

    public final void setFirstName(String string2) {
        this.firstName = string2;
    }

    public final void setLastName(String string2) {
        this.lastName = string2;
    }

    public final void setMobile(String string2) {
        this.mobile = string2;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setOtp(String string2) {
        this.otp = string2;
    }

    public final void setUuid(String string2) {
        this.uuid = string2;
    }

    public String toString() {
        CharSequence charSequence = this.name;
        String string2 = this.uuid;
        String string3 = this.firstName;
        String string4 = this.lastName;
        String string5 = this.otp;
        String string6 = this.email;
        String string7 = this.mobile;
        charSequence = og_1.a("Customer(name=", charSequence, ", uuid=", string2, ", firstName=");
        X50.a((StringBuilder)charSequence, string3, ", lastName=", string4, ", otp=");
        X50.a((StringBuilder)charSequence, string5, ", email=", string6, ", mobile=");
        return h30_0.a((StringBuilder)charSequence, string7, ")");
    }
}

