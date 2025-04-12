/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$ClassLoaderCreator
 */
package com.ril.ajio.home.landingpage.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$SavedState;

public final class NewAjioStoryViewPager$SavedState$a
implements Parcelable.ClassLoaderCreator {
    public final Object createFromParcel(Parcel parcel) {
        NewAjioStoryViewPager$SavedState newAjioStoryViewPager$SavedState = new NewAjioStoryViewPager$SavedState(parcel, null);
        return newAjioStoryViewPager$SavedState;
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        NewAjioStoryViewPager$SavedState newAjioStoryViewPager$SavedState = new NewAjioStoryViewPager$SavedState(parcel, classLoader);
        return newAjioStoryViewPager$SavedState;
    }

    public final Object[] newArray(int n3) {
        return new NewAjioStoryViewPager$SavedState[n3];
    }
}

