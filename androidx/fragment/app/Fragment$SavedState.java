/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment$SavedState$a;

public class Fragment$SavedState
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final Bundle a;

    static {
        Fragment$SavedState$a fragment$SavedState$a = new Object();
        CREATOR = fragment$SavedState$a;
    }

    public Fragment$SavedState(Bundle bundle) {
        this.a = bundle;
    }

    public Fragment$SavedState(Parcel parcel, ClassLoader classLoader) {
        parcel = parcel.readBundle();
        this.a = parcel;
        if (classLoader != null && parcel != null) {
            parcel.setClassLoader(classLoader);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Bundle bundle = this.a;
        parcel.writeBundle(bundle);
    }
}

