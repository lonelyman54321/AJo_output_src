/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.EditProfileData$Creator;
import kotlin.jvm.internal.Intrinsics;

public final class EditProfileData
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String dateOfBirth;
    private final Boolean displayEmail;
    private final String displayUid;
    private final String firstName;
    private final String genderType;
    private final Boolean isKioskCustomer;
    private final String lastName;
    private String mobileNumber;
    private final String screenName;

    static {
        EditProfileData$Creator editProfileData$Creator = new EditProfileData$Creator();
        CREATOR = editProfileData$Creator;
    }

    public EditProfileData(String string2, String string3, String string4, String string5, String string6, String string7, String string8, Boolean bl2, Boolean bl3) {
        this.dateOfBirth = string2;
        this.firstName = string3;
        this.lastName = string4;
        this.screenName = string5;
        this.displayUid = string6;
        this.genderType = string7;
        this.mobileNumber = string8;
        this.isKioskCustomer = bl2;
        this.displayEmail = bl3;
    }

    public static /* synthetic */ EditProfileData copy$default(EditProfileData editProfileData, String string2, String string3, String string4, String string5, String string6, String string7, String string8, Boolean bl2, Boolean bl3, int n3, Object object) {
        EditProfileData editProfileData2 = editProfileData;
        int n4 = n3;
        int n7 = n3 & 1;
        String string9 = n7 != 0 ? editProfileData.dateOfBirth : string2;
        int n8 = n4 & 2;
        String string10 = n8 != 0 ? editProfileData2.firstName : string3;
        int n10 = n4 & 4;
        String string11 = n10 != 0 ? editProfileData2.lastName : string4;
        int n14 = n4 & 8;
        String string12 = n14 != 0 ? editProfileData2.screenName : string5;
        int n15 = n4 & 0x10;
        String string13 = n15 != 0 ? editProfileData2.displayUid : string6;
        int n16 = n4 & 0x20;
        String string14 = n16 != 0 ? editProfileData2.genderType : string7;
        int n17 = n4 & 0x40;
        String string15 = n17 != 0 ? editProfileData2.mobileNumber : string8;
        int n18 = n4 & 0x80;
        Boolean bl4 = n18 != 0 ? editProfileData2.isKioskCustomer : bl2;
        Boolean bl5 = (n4 &= 0x100) != 0 ? editProfileData2.displayEmail : bl3;
        string2 = string9;
        string3 = string10;
        string4 = string11;
        string5 = string12;
        string6 = string13;
        string7 = string14;
        string8 = string15;
        bl2 = bl4;
        bl3 = bl5;
        return editProfileData.copy(string9, string10, string11, string12, string13, string14, string15, bl4, bl5);
    }

    public final String component1() {
        return this.dateOfBirth;
    }

    public final String component2() {
        return this.firstName;
    }

    public final String component3() {
        return this.lastName;
    }

    public final String component4() {
        return this.screenName;
    }

    public final String component5() {
        return this.displayUid;
    }

    public final String component6() {
        return this.genderType;
    }

    public final String component7() {
        return this.mobileNumber;
    }

    public final Boolean component8() {
        return this.isKioskCustomer;
    }

    public final Boolean component9() {
        return this.displayEmail;
    }

    public final EditProfileData copy(String string2, String string3, String string4, String string5, String string6, String string7, String string8, Boolean bl2, Boolean bl3) {
        EditProfileData editProfileData = new EditProfileData(string2, string3, string4, string5, string6, string7, string8, bl2, bl3);
        return editProfileData;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof EditProfileData;
        if (!bl3) {
            return false;
        }
        object = (EditProfileData)object;
        Object object2 = this.dateOfBirth;
        Object object3 = ((EditProfileData)object).dateOfBirth;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.firstName;
        object3 = ((EditProfileData)object).firstName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.lastName;
        object3 = ((EditProfileData)object).lastName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.screenName;
        object3 = ((EditProfileData)object).screenName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.displayUid;
        object3 = ((EditProfileData)object).displayUid;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.genderType;
        object3 = ((EditProfileData)object).genderType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.mobileNumber;
        object3 = ((EditProfileData)object).mobileNumber;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isKioskCustomer;
        object3 = ((EditProfileData)object).isKioskCustomer;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.displayEmail;
        object = ((EditProfileData)object).displayEmail;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final Boolean getDisplayEmail() {
        return this.displayEmail;
    }

    public final String getDisplayUid() {
        return this.displayUid;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getGenderType() {
        return this.genderType;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final String getScreenName() {
        return this.screenName;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.dateOfBirth;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.firstName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.lastName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.screenName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.displayUid;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.genderType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.mobileNumber;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isKioskCustomer;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.displayEmail;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isKioskCustomer() {
        return this.isKioskCustomer;
    }

    public final void setMobileNumber(String string2) {
        this.mobileNumber = string2;
    }

    public String toString() {
        CharSequence charSequence = this.dateOfBirth;
        String string2 = this.firstName;
        String string3 = this.lastName;
        String string4 = this.screenName;
        String string5 = this.displayUid;
        String string6 = this.genderType;
        String string7 = this.mobileNumber;
        Boolean bl2 = this.isKioskCustomer;
        Boolean bl3 = this.displayEmail;
        charSequence = og_1.a("EditProfileData(dateOfBirth=", charSequence, ", firstName=", string2, ", lastName=");
        X50.a((StringBuilder)charSequence, string3, ", screenName=", string4, ", displayUid=");
        X50.a((StringBuilder)charSequence, string5, ", genderType=", string6, ", mobileNumber=");
        vw0_1.a(bl2, string7, ", isKioskCustomer=", ", displayEmail=", (StringBuilder)charSequence);
        return nx3_0.a((StringBuilder)charSequence, bl3, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.dateOfBirth;
        parcel.writeString((String)object);
        object = this.firstName;
        parcel.writeString((String)object);
        object = this.lastName;
        parcel.writeString((String)object);
        object = this.screenName;
        parcel.writeString((String)object);
        object = this.displayUid;
        parcel.writeString((String)object);
        object = this.genderType;
        parcel.writeString((String)object);
        object = this.mobileNumber;
        parcel.writeString((String)object);
        object = this.isKioskCustomer;
        int n4 = 1;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            yi0_2.a(parcel, n4, (Boolean)object);
        }
        object = this.displayEmail;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            yi0_2.a(parcel, n4, (Boolean)object);
        }
    }
}

