/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.ActionMenuPresenter$SavedState;

public final class ActionMenuPresenter$SavedState$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int n3;
        ActionMenuPresenter$SavedState actionMenuPresenter$SavedState = new Object();
        actionMenuPresenter$SavedState.a = n3 = parcel.readInt();
        return actionMenuPresenter$SavedState;
    }

    public final Object[] newArray(int n3) {
        return new ActionMenuPresenter$SavedState[n3];
    }
}

