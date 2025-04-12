/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IFragmentWrapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.dynamic.zza;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public abstract class IFragmentWrapper$Stub
extends zzb
implements IFragmentWrapper {
    public IFragmentWrapper$Stub() {
        super("com.google.android.gms.dynamic.IFragmentWrapper");
    }

    public static IFragmentWrapper asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
        boolean bl2 = iInterface instanceof IFragmentWrapper;
        if (bl2) {
            return (IFragmentWrapper)iInterface;
        }
        iInterface = new zza(iBinder);
        return iInterface;
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 27: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzc.zzb(parcel);
                this.zzr(iObjectWrapper);
                parcel2.writeNoException();
                break;
            }
            case 26: {
                Parcelable.Creator creator = Intent.CREATOR;
                creator = (Intent)zzc.zza(parcel, creator);
                n4 = parcel.readInt();
                zzc.zzb(parcel);
                this.zzq((Intent)creator, n4);
                parcel2.writeNoException();
                break;
            }
            case 25: {
                Parcelable.Creator creator = Intent.CREATOR;
                creator = (Intent)zzc.zza(parcel, creator);
                zzc.zzb(parcel);
                this.zzp((Intent)creator);
                parcel2.writeNoException();
                break;
            }
            case 24: {
                n3 = (int)(zzc.zzf(parcel) ? 1 : 0);
                zzc.zzb(parcel);
                this.zzo(n3 != 0);
                parcel2.writeNoException();
                break;
            }
            case 23: {
                n3 = (int)(zzc.zzf(parcel) ? 1 : 0);
                zzc.zzb(parcel);
                this.zzn(n3 != 0);
                parcel2.writeNoException();
                break;
            }
            case 22: {
                n3 = (int)(zzc.zzf(parcel) ? 1 : 0);
                zzc.zzb(parcel);
                this.zzm(n3 != 0);
                parcel2.writeNoException();
                break;
            }
            case 21: {
                n3 = (int)(zzc.zzf(parcel) ? 1 : 0);
                zzc.zzb(parcel);
                this.zzl(n3 != 0);
                parcel2.writeNoException();
                break;
            }
            case 20: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzc.zzb(parcel);
                this.zzk(iObjectWrapper);
                parcel2.writeNoException();
                break;
            }
            case 19: {
                n3 = (int)(this.zzA() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 18: {
                n3 = (int)(this.zzz() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 17: {
                n3 = (int)(this.zzy() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 16: {
                n3 = (int)(this.zzx() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 15: {
                n3 = (int)(this.zzw() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 14: {
                n3 = (int)(this.zzv() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 13: {
                n3 = (int)(this.zzu() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 12: {
                IObjectWrapper iObjectWrapper = this.zzi();
                parcel2.writeNoException();
                zzc.zze(parcel2, iObjectWrapper);
                break;
            }
            case 11: {
                n3 = (int)(this.zzt() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 10: {
                n3 = this.zzc();
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 9: {
                IFragmentWrapper iFragmentWrapper = this.zzf();
                parcel2.writeNoException();
                zzc.zze(parcel2, iFragmentWrapper);
                break;
            }
            case 8: {
                String string2 = this.zzj();
                parcel2.writeNoException();
                parcel2.writeString(string2);
                break;
            }
            case 7: {
                n3 = (int)(this.zzs() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 6: {
                IObjectWrapper iObjectWrapper = this.zzh();
                parcel2.writeNoException();
                zzc.zze(parcel2, iObjectWrapper);
                break;
            }
            case 5: {
                IFragmentWrapper iFragmentWrapper = this.zze();
                parcel2.writeNoException();
                zzc.zze(parcel2, iFragmentWrapper);
                break;
            }
            case 4: {
                n3 = this.zzb();
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 3: {
                Bundle bundle = this.zzd();
                parcel2.writeNoException();
                zzc.zzd(parcel2, (Parcelable)bundle);
                break;
            }
            case 2: {
                IObjectWrapper iObjectWrapper = this.zzg();
                parcel2.writeNoException();
                zzc.zze(parcel2, iObjectWrapper);
            }
        }
        return true;
    }
}

