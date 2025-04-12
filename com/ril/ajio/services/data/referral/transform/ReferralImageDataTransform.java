/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.referral.transform;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.referral.transform.ReferralImageDataTransform$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ReferralImageDataTransform
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String headLine;
    private String imageURL;
    private Float refereeBonus;
    private Float referralBonus;
    private String referralCode;

    static {
        ReferralImageDataTransform$Creator referralImageDataTransform$Creator = new ReferralImageDataTransform$Creator();
        CREATOR = referralImageDataTransform$Creator;
    }

    public ReferralImageDataTransform(String string2, String string3, String string4, Float f5, Float f6) {
        this.imageURL = string2;
        this.headLine = string3;
        this.referralCode = string4;
        this.referralBonus = f5;
        this.refereeBonus = f6;
    }

    public /* synthetic */ ReferralImageDataTransform(String string2, String string3, String string4, Float f5, Float f6, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 8;
        Float f7 = Float.valueOf(0.0f);
        Float f8 = n4 != 0 ? f7 : f5;
        int n7 = n3 & 0x10;
        Float f11 = n7 != 0 ? f7 : f6;
        this(string2, string3, string4, f8, f11);
    }

    public static /* synthetic */ ReferralImageDataTransform copy$default(ReferralImageDataTransform referralImageDataTransform, String string2, String object, String string3, Float object2, Float object3, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = referralImageDataTransform.imageURL;
        }
        if ((n4 = n3 & 2) != 0) {
            object = referralImageDataTransform.headLine;
        }
        object4 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = referralImageDataTransform.referralCode;
        }
        String string4 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = referralImageDataTransform.referralBonus;
        }
        Float f5 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object3 = referralImageDataTransform.refereeBonus;
        }
        Float f6 = object3;
        object = referralImageDataTransform;
        string3 = string2;
        object2 = object4;
        object3 = string4;
        object4 = f6;
        return referralImageDataTransform.copy(string2, (String)object2, string4, f5, f6);
    }

    public final String component1() {
        return this.imageURL;
    }

    public final String component2() {
        return this.headLine;
    }

    public final String component3() {
        return this.referralCode;
    }

    public final Float component4() {
        return this.referralBonus;
    }

    public final Float component5() {
        return this.refereeBonus;
    }

    public final ReferralImageDataTransform copy(String string2, String string3, String string4, Float f5, Float f6) {
        ReferralImageDataTransform referralImageDataTransform = new ReferralImageDataTransform(string2, string3, string4, f5, f6);
        return referralImageDataTransform;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReferralImageDataTransform;
        if (!bl3) {
            return false;
        }
        object = (ReferralImageDataTransform)object;
        Object object2 = this.imageURL;
        Object object3 = ((ReferralImageDataTransform)object).imageURL;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.headLine;
        object3 = ((ReferralImageDataTransform)object).headLine;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.referralCode;
        object3 = ((ReferralImageDataTransform)object).referralCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.referralBonus;
        object3 = ((ReferralImageDataTransform)object).referralBonus;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.refereeBonus;
        object = ((ReferralImageDataTransform)object).refereeBonus;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getHeadLine() {
        return this.headLine;
    }

    public final String getImageURL() {
        return this.imageURL;
    }

    public final Float getRefereeBonus() {
        return this.refereeBonus;
    }

    public final Float getReferralBonus() {
        return this.referralBonus;
    }

    public final String getReferralCode() {
        return this.referralCode;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.imageURL;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.headLine;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.referralCode;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.referralBonus;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.refereeBonus;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setHeadLine(String string2) {
        this.headLine = string2;
    }

    public final void setImageURL(String string2) {
        this.imageURL = string2;
    }

    public final void setRefereeBonus(Float f5) {
        this.refereeBonus = f5;
    }

    public final void setReferralBonus(Float f5) {
        this.referralBonus = f5;
    }

    public final void setReferralCode(String string2) {
        this.referralCode = string2;
    }

    public String toString() {
        CharSequence charSequence = this.imageURL;
        String string2 = this.headLine;
        String string3 = this.referralCode;
        Float f5 = this.referralBonus;
        Float f6 = this.refereeBonus;
        charSequence = og_1.a("ReferralImageDataTransform(imageURL=", (String)charSequence, ", headLine=", string2, ", referralCode=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", referralBonus=");
        ((StringBuilder)charSequence).append(f5);
        ((StringBuilder)charSequence).append(", refereeBonus=");
        ((StringBuilder)charSequence).append(f6);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        float f5;
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.imageURL;
        parcel.writeString((String)object);
        object = this.headLine;
        parcel.writeString((String)object);
        object = this.referralCode;
        parcel.writeString((String)object);
        object = this.referralBonus;
        int n4 = 1;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            f5 = ((Float)object).floatValue();
            parcel.writeFloat(f5);
        }
        object = this.refereeBonus;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            f5 = ((Float)object).floatValue();
            parcel.writeFloat(f5);
        }
    }
}

