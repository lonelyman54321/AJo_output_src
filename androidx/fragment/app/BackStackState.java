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
import androidx.fragment.app.BackStackRecordState;
import androidx.fragment.app.BackStackState$a;
import java.util.ArrayList;
import java.util.List;

class BackStackState
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final ArrayList a;
    public final ArrayList b;

    static {
        BackStackState$a backStackState$a = new Object();
        CREATOR = backStackState$a;
    }

    public BackStackState(Parcel object) {
        ArrayList arrayList;
        this.a = arrayList = object.createStringArrayList();
        arrayList = BackStackRecordState.CREATOR;
        object = object.createTypedArrayList((Parcelable.Creator)arrayList);
        this.b = object;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        ArrayList arrayList = this.a;
        parcel.writeStringList((List)arrayList);
        arrayList = this.b;
        parcel.writeTypedList((List)arrayList);
    }
}

