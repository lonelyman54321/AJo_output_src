/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Login;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class CustomerType {
    private String city;
    private String customerType;
    private String pincode;
    private String state;
    private final List userCohortValue;
    private final HashMap userCohortValueV3;
    private final List userSegmentIdSet;
    private String zone;

    public CustomerType(String string2, String string3, String string4, String string5, String string6, List list, HashMap hashMap, List list2) {
        Intrinsics.checkNotNullParameter(string2, "customerType");
        this.customerType = string2;
        this.pincode = string3;
        this.city = string4;
        this.state = string5;
        this.zone = string6;
        this.userCohortValue = list;
        this.userCohortValueV3 = hashMap;
        this.userSegmentIdSet = list2;
    }

    public static /* synthetic */ CustomerType copy$default(CustomerType customerType, String string2, String string3, String string4, String string5, String string6, List list, HashMap hashMap, List list2, int n3, Object object) {
        CustomerType customerType2 = customerType;
        int n4 = n3;
        int n7 = n3 & 1;
        String string7 = n7 != 0 ? customerType.customerType : string2;
        int n8 = n4 & 2;
        String string8 = n8 != 0 ? customerType2.pincode : string3;
        int n10 = n4 & 4;
        String string9 = n10 != 0 ? customerType2.city : string4;
        int n14 = n4 & 8;
        String string10 = n14 != 0 ? customerType2.state : string5;
        int n15 = n4 & 0x10;
        String string11 = n15 != 0 ? customerType2.zone : string6;
        int n16 = n4 & 0x20;
        List list3 = n16 != 0 ? customerType2.userCohortValue : list;
        int n17 = n4 & 0x40;
        HashMap hashMap2 = n17 != 0 ? customerType2.userCohortValueV3 : hashMap;
        List list4 = (n4 &= 0x80) != 0 ? customerType2.userSegmentIdSet : list2;
        string2 = string7;
        string3 = string8;
        string4 = string9;
        string5 = string10;
        string6 = string11;
        list = list3;
        hashMap = hashMap2;
        list2 = list4;
        return customerType.copy(string7, string8, string9, string10, string11, list3, hashMap2, list4);
    }

    public final String component1() {
        return this.customerType;
    }

    public final String component2() {
        return this.pincode;
    }

    public final String component3() {
        return this.city;
    }

    public final String component4() {
        return this.state;
    }

    public final String component5() {
        return this.zone;
    }

    public final List component6() {
        return this.userCohortValue;
    }

    public final HashMap component7() {
        return this.userCohortValueV3;
    }

    public final List component8() {
        return this.userSegmentIdSet;
    }

    public final CustomerType copy(String string2, String string3, String string4, String string5, String string6, List list, HashMap hashMap, List list2) {
        Intrinsics.checkNotNullParameter(string2, "customerType");
        CustomerType customerType = new CustomerType(string2, string3, string4, string5, string6, list, hashMap, list2);
        return customerType;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CustomerType;
        if (!bl3) {
            return false;
        }
        object = (CustomerType)object;
        Object object2 = this.customerType;
        Object object3 = ((CustomerType)object).customerType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pincode;
        object3 = ((CustomerType)object).pincode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.city;
        object3 = ((CustomerType)object).city;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.state;
        object3 = ((CustomerType)object).state;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.zone;
        object3 = ((CustomerType)object).zone;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.userCohortValue;
        object3 = ((CustomerType)object).userCohortValue;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.userCohortValueV3;
        object3 = ((CustomerType)object).userCohortValueV3;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.userSegmentIdSet;
        object = ((CustomerType)object).userSegmentIdSet;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCustomerType() {
        return this.customerType;
    }

    public final String getPincode() {
        return this.pincode;
    }

    public final String getState() {
        return this.state;
    }

    public final List getUserCohortValue() {
        return this.userCohortValue;
    }

    public final HashMap getUserCohortValueV3() {
        return this.userCohortValueV3;
    }

    public final List getUserSegmentIdSet() {
        return this.userSegmentIdSet;
    }

    public final String getZone() {
        return this.zone;
    }

    public int hashCode() {
        int n3;
        String string2 = this.customerType;
        int n4 = string2.hashCode() * 31;
        Object object = this.pincode;
        int n7 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.city;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.state;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.zone;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.userCohortValue;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.userCohortValueV3;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.userSegmentIdSet;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setCity(String string2) {
        this.city = string2;
    }

    public final void setCustomerType(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.customerType = string2;
    }

    public final void setPincode(String string2) {
        this.pincode = string2;
    }

    public final void setState(String string2) {
        this.state = string2;
    }

    public final void setZone(String string2) {
        this.zone = string2;
    }

    public String toString() {
        CharSequence charSequence = this.customerType;
        String string2 = this.pincode;
        String string3 = this.city;
        String string4 = this.state;
        String string5 = this.zone;
        List list = this.userCohortValue;
        HashMap hashMap = this.userCohortValueV3;
        List list2 = this.userSegmentIdSet;
        charSequence = og_1.a("CustomerType(customerType=", (String)charSequence, ", pincode=", string2, ", city=");
        X50.a((StringBuilder)charSequence, string3, ", state=", string4, ", zone=");
        ((StringBuilder)charSequence).append(string5);
        ((StringBuilder)charSequence).append(", userCohortValue=");
        ((StringBuilder)charSequence).append(list);
        ((StringBuilder)charSequence).append(", userCohortValueV3=");
        ((StringBuilder)charSequence).append(hashMap);
        ((StringBuilder)charSequence).append(", userSegmentIdSet=");
        ((StringBuilder)charSequence).append(list2);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

