/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Address;

import com.ril.ajio.services.data.Address.AddressType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class UserDeliveryData {
    private final String address;
    private final AddressType addressType;
    private final String name;
    private final String pinCode;

    public UserDeliveryData() {
        this(null, null, null, null, 15, null);
    }

    public UserDeliveryData(String string2, String string3, String string4, AddressType addressType) {
        Intrinsics.checkNotNullParameter((Object)addressType, "addressType");
        this.address = string2;
        this.name = string3;
        this.pinCode = string4;
        this.addressType = addressType;
    }

    public /* synthetic */ UserDeliveryData(String string2, String string3, String string4, AddressType addressType, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = null;
        }
        if ((n3 &= 8) != 0) {
            addressType = AddressType.None;
        }
        this(string2, string3, string4, addressType);
    }

    public static /* synthetic */ UserDeliveryData copy$default(UserDeliveryData userDeliveryData, String string2, String string3, String string4, AddressType addressType, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = userDeliveryData.address;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = userDeliveryData.name;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = userDeliveryData.pinCode;
        }
        if ((n3 &= 8) != 0) {
            addressType = userDeliveryData.addressType;
        }
        return userDeliveryData.copy(string2, string3, string4, addressType);
    }

    public final String component1() {
        return this.address;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.pinCode;
    }

    public final AddressType component4() {
        return this.addressType;
    }

    public final UserDeliveryData copy(String string2, String string3, String string4, AddressType addressType) {
        Intrinsics.checkNotNullParameter((Object)addressType, "addressType");
        UserDeliveryData userDeliveryData = new UserDeliveryData(string2, string3, string4, addressType);
        return userDeliveryData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof UserDeliveryData;
        if (!bl3) {
            return false;
        }
        object = (UserDeliveryData)object;
        Object object2 = this.address;
        String string2 = ((UserDeliveryData)object).address;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.name;
        string2 = ((UserDeliveryData)object).name;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.pinCode;
        string2 = ((UserDeliveryData)object).pinCode;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.addressType;
        object = ((UserDeliveryData)object).addressType;
        if (object2 != object) {
            return false;
        }
        return bl2;
    }

    public final String getAddress() {
        return this.address;
    }

    public final AddressType getAddressType() {
        return this.addressType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPinCode() {
        return this.pinCode;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.address;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.name;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.pinCode;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        n4 = (n4 + n7) * 31;
        return ((Object)((Object)this.addressType)).hashCode() + n4;
    }

    public String toString() {
        CharSequence charSequence = this.address;
        String string2 = this.name;
        String string3 = this.pinCode;
        AddressType addressType = this.addressType;
        charSequence = og_1.a("UserDeliveryData(address=", (String)charSequence, ", name=", string2, ", pinCode=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", addressType=");
        ((StringBuilder)charSequence).append((Object)addressType);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

