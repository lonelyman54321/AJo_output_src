/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$ClassLoaderCreator
 */
package com.ril.ajio.plp;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.plp.PlpBottomSheetBehavior$SavedState;

public final class PlpBottomSheetBehavior$SavedState$a
implements Parcelable.ClassLoaderCreator {
    public final Object createFromParcel(Parcel parcel) {
        PlpBottomSheetBehavior$SavedState plpBottomSheetBehavior$SavedState = new PlpBottomSheetBehavior$SavedState(parcel, null);
        return plpBottomSheetBehavior$SavedState;
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        PlpBottomSheetBehavior$SavedState plpBottomSheetBehavior$SavedState = new PlpBottomSheetBehavior$SavedState(parcel, classLoader);
        return plpBottomSheetBehavior$SavedState;
    }

    public final Object[] newArray(int n3) {
        return new PlpBottomSheetBehavior$SavedState[n3];
    }
}

