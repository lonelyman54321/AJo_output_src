/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$ClassLoaderCreator
 */
package androidx.viewpager.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.viewpager.widget.ViewPager$SavedState;

public final class ViewPager$SavedState$a
implements Parcelable.ClassLoaderCreator {
    public final Object createFromParcel(Parcel parcel) {
        ViewPager$SavedState viewPager$SavedState = new ViewPager$SavedState(parcel, null);
        return viewPager$SavedState;
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        ViewPager$SavedState viewPager$SavedState = new ViewPager$SavedState(parcel, classLoader);
        return viewPager$SavedState;
    }

    public final Object[] newArray(int n3) {
        return new ViewPager$SavedState[n3];
    }
}

