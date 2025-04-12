/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.ParcelFileDescriptor
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.internal.plus.zzr;
import com.google.android.gms.plus.internal.zzb;

public abstract class zzc
extends com.google.android.gms.internal.plus.zzb
implements zzb {
    public zzc() {
        super("com.google.android.gms.plus.internal.IPlusCallbacks");
    }

    public final boolean dispatchTransaction(int n3, Parcel object, Parcel parcel, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 10: {
                Object object2 = Status.CREATOR;
                object2 = (Status)com.google.android.gms.internal.plus.zzc.zza(object, object2);
                this.zza((Status)object2);
                break;
            }
            case 9: {
                n3 = object.readInt();
                Parcelable.Creator creator = zzr.CREATOR;
                object = (zzr)com.google.android.gms.internal.plus.zzc.zza(object, creator);
                this.zza(n3, (zzr)object);
                break;
            }
            case 8: {
                String string2 = object.readString();
                this.zzc(string2);
                break;
            }
            case 7: {
                n3 = object.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                object = (Bundle)com.google.android.gms.internal.plus.zzc.zza(object, creator);
                this.zza(n3, (Bundle)object);
                break;
            }
            case 6: {
                Object object3 = DataHolder.CREATOR;
                object3 = (DataHolder)com.google.android.gms.internal.plus.zzc.zza(object, object3);
                String string3 = object.readString();
                object = object.readString();
                this.zza((DataHolder)object3, string3, (String)object);
                break;
            }
            case 5: {
                n3 = object.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)com.google.android.gms.internal.plus.zzc.zza(object, creator);
                Parcelable.Creator creator2 = SafeParcelResponse.CREATOR;
                object = (SafeParcelResponse)com.google.android.gms.internal.plus.zzc.zza(object, creator2);
                this.zza(n3, (Bundle)creator, (SafeParcelResponse)object);
                break;
            }
            case 4: {
                Object object4 = DataHolder.CREATOR;
                object4 = (DataHolder)com.google.android.gms.internal.plus.zzc.zza(object, object4);
                object = object.readString();
                this.zza((DataHolder)object4, (String)object);
                break;
            }
            case 3: {
                String string4 = object.readString();
                this.zzb(string4);
                break;
            }
            case 2: {
                n3 = object.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)com.google.android.gms.internal.plus.zzc.zza(object, creator);
                Parcelable.Creator creator3 = ParcelFileDescriptor.CREATOR;
                object = (ParcelFileDescriptor)com.google.android.gms.internal.plus.zzc.zza(object, creator3);
                this.zza(n3, (Bundle)creator, (ParcelFileDescriptor)object);
                break;
            }
            case 1: {
                n3 = object.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle)com.google.android.gms.internal.plus.zzc.zza(object, creator);
                object = (Bundle)com.google.android.gms.internal.plus.zzc.zza(object, creator);
                this.zza(n3, bundle, (Bundle)object);
            }
        }
        parcel.writeNoException();
        return true;
    }
}

