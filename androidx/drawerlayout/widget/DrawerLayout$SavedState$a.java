/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$ClassLoaderCreator
 */
package androidx.drawerlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.drawerlayout.widget.DrawerLayout$SavedState;

public final class DrawerLayout$SavedState$a
implements Parcelable.ClassLoaderCreator {
    public final Object createFromParcel(Parcel parcel) {
        DrawerLayout$SavedState drawerLayout$SavedState = new DrawerLayout$SavedState(parcel, null);
        return drawerLayout$SavedState;
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        DrawerLayout$SavedState drawerLayout$SavedState = new DrawerLayout$SavedState(parcel, classLoader);
        return drawerLayout$SavedState;
    }

    public final Object[] newArray(int n3) {
        return new DrawerLayout$SavedState[n3];
    }
}

