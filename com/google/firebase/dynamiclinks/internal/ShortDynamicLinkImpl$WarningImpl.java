/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.firebase.dynamiclinks.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.dynamiclinks.ShortDynamicLink$Warning;
import com.google.firebase.dynamiclinks.internal.WarningImplCreator;

public class ShortDynamicLinkImpl$WarningImpl
extends AbstractSafeParcelable
implements ShortDynamicLink$Warning {
    public static final Parcelable.Creator CREATOR;
    private final String message;

    static {
        WarningImplCreator warningImplCreator = new WarningImplCreator();
        CREATOR = warningImplCreator;
    }

    public ShortDynamicLinkImpl$WarningImpl(String string2) {
        this.message = string2;
    }

    public String getCode() {
        return null;
    }

    public String getMessage() {
        return this.message;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        WarningImplCreator.writeToParcel(this, parcel, n3);
    }
}

