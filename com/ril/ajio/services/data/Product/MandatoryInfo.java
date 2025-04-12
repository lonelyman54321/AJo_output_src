/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Product.MandatoryInfo$Creator;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class MandatoryInfo
implements Serializable,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String key;
    private String subTitle;
    private String title;

    static {
        MandatoryInfo$Creator mandatoryInfo$Creator = new MandatoryInfo$Creator();
        CREATOR = mandatoryInfo$Creator;
    }

    public MandatoryInfo() {
        this(null, null, null, 7, null);
    }

    public MandatoryInfo(String string2, String string3, String string4) {
        this.title = string2;
        this.subTitle = string3;
        this.key = string4;
    }

    public /* synthetic */ MandatoryInfo(String string2, String string3, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n3 &= 4) != 0) {
            string4 = null;
        }
        this(string2, string3, string4);
    }

    public static /* synthetic */ MandatoryInfo copy$default(MandatoryInfo mandatoryInfo, String string2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = mandatoryInfo.title;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = mandatoryInfo.subTitle;
        }
        if ((n3 &= 4) != 0) {
            string4 = mandatoryInfo.key;
        }
        return mandatoryInfo.copy(string2, string3, string4);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subTitle;
    }

    public final String component3() {
        return this.key;
    }

    public final MandatoryInfo copy(String string2, String string3, String string4) {
        MandatoryInfo mandatoryInfo = new MandatoryInfo(string2, string3, string4);
        return mandatoryInfo;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof MandatoryInfo;
        if (!bl3) {
            return false;
        }
        object = (MandatoryInfo)object;
        String string2 = this.title;
        String string3 = ((MandatoryInfo)object).title;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.subTitle;
        string3 = ((MandatoryInfo)object).subTitle;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.key;
        object = ((MandatoryInfo)object).key;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.title;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.subTitle;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.key;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setKey(String string2) {
        this.key = string2;
    }

    public final void setSubTitle(String string2) {
        this.subTitle = string2;
    }

    public final void setTitle(String string2) {
        this.title = string2;
    }

    public String toString() {
        String string2 = this.title;
        String string3 = this.subTitle;
        String string4 = this.key;
        return h30_0.a(og_1.a("MandatoryInfo(title=", string2, ", subTitle=", string3, ", key="), string4, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.title;
        parcel.writeString(string2);
        string2 = this.subTitle;
        parcel.writeString(string2);
        string2 = this.key;
        parcel.writeString(string2);
    }
}

