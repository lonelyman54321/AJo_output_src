/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager$LaunchedFragmentInfo;

public final class FragmentManager$LaunchedFragmentInfo$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int n3;
        String string2;
        FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = new Object();
        fragmentManager$LaunchedFragmentInfo.a = string2 = parcel.readString();
        fragmentManager$LaunchedFragmentInfo.b = n3 = parcel.readInt();
        return fragmentManager$LaunchedFragmentInfo;
    }

    public final Object[] newArray(int n3) {
        return new FragmentManager$LaunchedFragmentInfo[n3];
    }
}

