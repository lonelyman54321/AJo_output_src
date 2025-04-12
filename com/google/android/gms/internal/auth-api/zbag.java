/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.auth-api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth-api.zbah;
import com.google.android.gms.internal.auth-api.zbb;
import com.google.android.gms.internal.auth-api.zbc;

public abstract class zbag
extends zbb
implements zbah {
    public zbag() {
        super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback");
    }

    public final boolean zba(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 == n7) {
            Object object = Status.CREATOR;
            object = (Status)zbc.zba(parcel, object);
            Parcelable.Creator creator = PendingIntent.CREATOR;
            creator = (PendingIntent)zbc.zba(parcel, creator);
            zbc.zbb(parcel);
            this.zbb((Status)object, (PendingIntent)creator);
            return n7;
        }
        return false;
    }
}

