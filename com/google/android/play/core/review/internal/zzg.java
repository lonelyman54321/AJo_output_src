/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.BadParcelableException
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.google.android.play.core.review.internal;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.review.internal.zzb;
import com.google.android.play.core.review.internal.zzc;
import com.google.android.play.core.review.internal.zzh;

public abstract class zzg
extends zzb
implements zzh {
    public zzg() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    public final boolean zza(int n3, Parcel object, Parcel parcel, int n4) {
        int n7 = 2;
        if (n3 == n7) {
            Object object2 = Bundle.CREATOR;
            n7 = zzc.zza;
            n7 = object.readInt();
            if (n7 == 0) {
                n3 = 0;
                object2 = null;
            } else {
                object2 = (Parcelable)object2.createFromParcel(object);
            }
            object2 = (Bundle)object2;
            int n8 = object.dataAvail();
            if (n8 <= 0) {
                this.zzb((Bundle)object2);
                return true;
            }
            object = hj0_0.a(n8, "Parcel data not fully consumed, unread size: ");
            object2 = new BadParcelableException((String)object);
            throw object2;
        }
        return false;
    }
}

