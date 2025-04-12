/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$a;

class FragmentManager$LaunchedFragmentInfo
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public int b;

    static {
        FragmentManager$LaunchedFragmentInfo$a fragmentManager$LaunchedFragmentInfo$a = new Object();
        CREATOR = fragmentManager$LaunchedFragmentInfo$a;
    }

    public FragmentManager$LaunchedFragmentInfo(String string2, int n3) {
        this.a = string2;
        this.b = n3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.a;
        parcel.writeString(string2);
        n3 = this.b;
        parcel.writeInt(n3);
    }
}

