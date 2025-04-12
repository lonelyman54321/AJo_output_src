/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.play.core.appupdate.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.appupdate.internal.zzb;
import com.google.android.play.core.appupdate.internal.zzc;
import com.google.android.play.core.appupdate.internal.zzh;

public abstract class zzg
extends zzb
implements zzh {
    public zzg() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 2;
        if (n3 != n7) {
            n7 = 3;
            if (n3 != n7) {
                return false;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            creator = (Bundle)zzc.zza(parcel, creator);
            zzc.zzb(parcel);
            this.zzb((Bundle)creator);
        } else {
            Parcelable.Creator creator = Bundle.CREATOR;
            creator = (Bundle)zzc.zza(parcel, creator);
            zzc.zzb(parcel);
            this.zzc((Bundle)creator);
        }
        return true;
    }
}

