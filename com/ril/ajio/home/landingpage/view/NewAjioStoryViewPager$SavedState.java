/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.home.landingpage.view;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$SavedState$a;

public class NewAjioStoryViewPager$SavedState
extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public Parcelable b;
    public final ClassLoader c;

    static {
        NewAjioStoryViewPager$SavedState$a newAjioStoryViewPager$SavedState$a = new Object();
        CREATOR = newAjioStoryViewPager$SavedState$a;
    }

    public NewAjioStoryViewPager$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int n3;
        if (classLoader == null) {
            classLoader = this.getClass().getClassLoader();
        }
        this.a = n3 = parcel.readInt();
        parcel = parcel.readParcelable(classLoader);
        this.b = parcel;
        this.c = classLoader;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FragmentPager.SavedState{");
        String string2 = Integer.toHexString(System.identityHashCode(this));
        stringBuilder.append(string2);
        stringBuilder.append(" position=");
        return g30.a(this.a, "}", stringBuilder);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        int n4 = this.a;
        parcel.writeInt(n4);
        Parcelable parcelable = this.b;
        parcel.writeParcelable(parcelable, n3);
    }
}

