/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.icing.zzat;
import com.google.android.gms.internal.icing.zzb;
import com.google.android.gms.internal.icing.zzc;
import com.google.android.gms.search.GoogleNowAuthState;

public abstract class zzas
extends zzb
implements zzat {
    public zzas() {
        super("com.google.android.gms.search.internal.ISearchAuthCallbacks");
    }

    public final boolean zza(int n3, Parcel object, Parcel parcel, int n4) {
        int n7 = 1;
        if (n3 != n7) {
            n4 = 2;
            if (n3 != n4) {
                return false;
            }
            Object object2 = Status.CREATOR;
            object2 = (Status)zzc.zza(object, object2);
            this.zzc((Status)object2);
        } else {
            Object object3 = Status.CREATOR;
            object3 = (Status)zzc.zza(object, object3);
            Parcelable.Creator creator = GoogleNowAuthState.CREATOR;
            object = (GoogleNowAuthState)zzc.zza(object, creator);
            this.zzb((Status)object3, (GoogleNowAuthState)object);
        }
        return n7;
    }
}

