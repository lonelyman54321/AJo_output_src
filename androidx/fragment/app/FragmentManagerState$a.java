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
import androidx.fragment.app.BackStackRecordState;
import androidx.fragment.app.BackStackState;
import androidx.fragment.app.FragmentManager$LaunchedFragmentInfo;
import androidx.fragment.app.FragmentManagerState;
import java.util.ArrayList;

public final class FragmentManagerState$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel object) {
        int n3;
        FragmentManagerState fragmentManagerState = new Object();
        fragmentManagerState.e = null;
        Object object2 = new ArrayList();
        fragmentManagerState.f = object2;
        object2 = new ArrayList();
        fragmentManagerState.g = object2;
        object2 = object.createStringArrayList();
        fragmentManagerState.a = object2;
        object2 = object.createStringArrayList();
        fragmentManagerState.b = object2;
        object2 = BackStackRecordState.CREATOR;
        object2 = (BackStackRecordState[])object.createTypedArray(object2);
        fragmentManagerState.c = object2;
        fragmentManagerState.d = n3 = object.readInt();
        object2 = object.readString();
        fragmentManagerState.e = object2;
        object2 = object.createStringArrayList();
        fragmentManagerState.f = object2;
        object2 = BackStackState.CREATOR;
        object2 = object.createTypedArrayList(object2);
        fragmentManagerState.g = object2;
        object2 = FragmentManager$LaunchedFragmentInfo.CREATOR;
        object = object.createTypedArrayList(object2);
        fragmentManagerState.h = object;
        return fragmentManagerState;
    }

    public final Object[] newArray(int n3) {
        return new FragmentManagerState[n3];
    }
}

