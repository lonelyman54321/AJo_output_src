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
import androidx.fragment.app.FragmentManagerState$a;
import java.util.ArrayList;
import java.util.List;

final class FragmentManagerState
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public ArrayList a;
    public ArrayList b;
    public BackStackRecordState[] c;
    public int d;
    public String e = null;
    public ArrayList f;
    public ArrayList g;
    public ArrayList h;

    static {
        FragmentManagerState$a fragmentManagerState$a = new Object();
        CREATOR = fragmentManagerState$a;
    }

    public FragmentManagerState() {
        ArrayList arrayList;
        this.f = arrayList = new ArrayList();
        this.g = arrayList = new ArrayList();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Parcelable[] parcelableArray = this.a;
        parcel.writeStringList((List)parcelableArray);
        parcelableArray = this.b;
        parcel.writeStringList((List)parcelableArray);
        parcelableArray = this.c;
        parcel.writeTypedArray(parcelableArray, n3);
        n3 = this.d;
        parcel.writeInt(n3);
        Object object = this.e;
        parcel.writeString((String)object);
        object = this.f;
        parcel.writeStringList((List)object);
        object = this.g;
        parcel.writeTypedList((List)object);
        object = this.h;
        parcel.writeTypedList((List)object);
    }
}

