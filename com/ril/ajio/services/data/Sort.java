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
import com.ril.ajio.services.data.Sort$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Sort
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String code;
    private String name;
    private boolean selected;

    static {
        Sort$Creator sort$Creator = new Sort$Creator();
        CREATOR = sort$Creator;
    }

    public Sort() {
        this(false, null, null, 7, null);
    }

    public Sort(boolean bl2, String string2, String string3) {
        this.selected = bl2;
        this.name = string2;
        this.code = string3;
    }

    public /* synthetic */ Sort(boolean bl2, String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = false;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = null;
        }
        if ((n3 &= 4) != 0) {
            string3 = null;
        }
        this(bl2, string2, string3);
    }

    public final int describeContents() {
        return 0;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final void setCode(String string2) {
        this.code = string2;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setSelected(boolean bl2) {
        this.selected = bl2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        n3 = (int)(this.selected ? 1 : 0);
        parcel.writeInt(n3);
        String string2 = this.name;
        parcel.writeString(string2);
        string2 = this.code;
        parcel.writeString(string2);
    }
}

