/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class UserInfo
implements Serializable {
    private String email;
    private String phoneNumber;
    private String profileName;
    private String userId;

    public UserInfo() {
        this(null, null, null, null, 15, null);
    }

    public UserInfo(String string2, String string3, String string4, String string5) {
        this.userId = string2;
        this.email = string3;
        this.phoneNumber = string4;
        this.profileName = string5;
    }

    public /* synthetic */ UserInfo(String string2, String string3, String string4, String string5, int n3, DefaultConstructorMarker defaultConstructorMarker) {
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
            string5 = null;
        }
        this(string2, string3, string4, string5);
    }

    public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, String string2, String string3, String string4, String string5, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = userInfo.userId;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = userInfo.email;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = userInfo.phoneNumber;
        }
        if ((n3 &= 8) != 0) {
            string5 = userInfo.profileName;
        }
        return userInfo.copy(string2, string3, string4, string5);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.email;
    }

    public final String component3() {
        return this.phoneNumber;
    }

    public final String component4() {
        return this.profileName;
    }

    public final UserInfo copy(String string2, String string3, String string4, String string5) {
        UserInfo userInfo = new UserInfo(string2, string3, string4, string5);
        return userInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof UserInfo;
        if (!bl3) {
            return false;
        }
        object = (UserInfo)object;
        String string2 = this.userId;
        String string3 = ((UserInfo)object).userId;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.email;
        string3 = ((UserInfo)object).email;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.phoneNumber;
        string3 = ((UserInfo)object).phoneNumber;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.profileName;
        object = ((UserInfo)object).profileName;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getProfileName() {
        return this.profileName;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.userId;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.email;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.phoneNumber;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.profileName;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setEmail(String string2) {
        this.email = string2;
    }

    public final void setPhoneNumber(String string2) {
        this.phoneNumber = string2;
    }

    public final void setProfileName(String string2) {
        this.profileName = string2;
    }

    public final void setUserId(String string2) {
        this.userId = string2;
    }

    public String toString() {
        String string2 = this.userId;
        String string3 = this.email;
        String string4 = this.phoneNumber;
        String string5 = this.profileName;
        return ko_0.a(og_1.a("UserInfo(userId=", string2, ", email=", string3, ", phoneNumber="), string4, ", profileName=", string5, ")");
    }
}

