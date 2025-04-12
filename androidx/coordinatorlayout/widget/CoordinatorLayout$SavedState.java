/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.SparseArray
 */
package androidx.coordinatorlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a;
import androidx.customview.view.AbsSavedState;

public class CoordinatorLayout$SavedState
extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    public SparseArray a;

    static {
        CoordinatorLayout$SavedState$a coordinatorLayout$SavedState$a = new Object();
        CREATOR = coordinatorLayout$SavedState$a;
    }

    public CoordinatorLayout$SavedState(Parcel parcelableArray, ClassLoader classLoader) {
        super((Parcel)parcelableArray, classLoader);
        int n3 = parcelableArray.readInt();
        int[] nArray = new int[n3];
        parcelableArray.readIntArray(nArray);
        parcelableArray = parcelableArray.readParcelableArray(classLoader);
        super(n3);
        this.a = classLoader;
        classLoader = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            SparseArray sparseArray = this.a;
            int n4 = nArray[i3];
            Parcelable parcelable = parcelableArray[i3];
            sparseArray.append(n4, (Object)parcelable);
        }
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4;
        super.writeToParcel(parcel, n3);
        SparseArray sparseArray = this.a;
        int n7 = 0;
        if (sparseArray != null) {
            n4 = sparseArray.size();
        } else {
            n4 = 0;
            sparseArray = null;
        }
        parcel.writeInt(n4);
        int[] nArray = new int[n4];
        Parcelable[] parcelableArray = new Parcelable[n4];
        while (n7 < n4) {
            Parcelable parcelable;
            int n8;
            nArray[n7] = n8 = this.a.keyAt(n7);
            parcelableArray[n7] = parcelable = (Parcelable)this.a.valueAt(n7);
            ++n7;
        }
        parcel.writeIntArray(nArray);
        parcel.writeParcelableArray(parcelableArray, n3);
    }
}

