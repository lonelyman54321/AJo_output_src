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
import androidx.appcompat.widget.Toolbar$SavedState$a;
import androidx.customview.view.AbsSavedState;

public class Toolbar$SavedState
extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public boolean b;

    static {
        Toolbar$SavedState$a toolbar$SavedState$a = new Object();
        CREATOR = toolbar$SavedState$a;
    }

    public Toolbar$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int n3;
        this.a = n3 = parcel.readInt();
        int n4 = parcel.readInt();
        if (n4 != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            parcel = null;
        }
        this.b = n4;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        n3 = this.a;
        parcel.writeInt(n3);
        n3 = (int)(this.b ? 1 : 0);
        parcel.writeInt(n3);
    }
}

