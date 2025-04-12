/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Parcel
 *  android.os.Parcelable$ClassLoaderCreator
 *  android.view.View$BaseSavedState
 */
package androidx.viewpager2.widget;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2$SavedState;

public final class ViewPager2$SavedState$a
implements Parcelable.ClassLoaderCreator {
    public final Object createFromParcel(Parcel parcel) {
        ViewPager2$SavedState viewPager2$SavedState;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            viewPager2$SavedState = new ViewPager2$SavedState(parcel, null);
        } else {
            viewPager2$SavedState = new View.BaseSavedState(parcel);
            viewPager2$SavedState.a = n4 = parcel.readInt();
            viewPager2$SavedState.b = n4 = parcel.readInt();
            parcel = parcel.readParcelable(null);
            viewPager2$SavedState.c = parcel;
        }
        return viewPager2$SavedState;
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        ViewPager2$SavedState viewPager2$SavedState;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            viewPager2$SavedState = new ViewPager2$SavedState(parcel, classLoader);
        } else {
            int n7;
            viewPager2$SavedState = new View.BaseSavedState(parcel);
            viewPager2$SavedState.a = n7 = parcel.readInt();
            viewPager2$SavedState.b = n7 = parcel.readInt();
            n7 = 0;
            classLoader = null;
            parcel = parcel.readParcelable(null);
            viewPager2$SavedState.c = parcel;
        }
        return viewPager2$SavedState;
    }

    public final Object[] newArray(int n3) {
        return new ViewPager2$SavedState[n3];
    }
}

