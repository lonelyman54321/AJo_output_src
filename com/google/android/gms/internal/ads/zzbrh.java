/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbnq;
import com.google.android.gms.internal.ads.zzbnr;
import com.google.android.gms.internal.ads.zzbnx;
import com.google.android.gms.internal.ads.zzbri;
import com.google.android.gms.internal.ads.zzbrj;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbru;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzbys;
import java.util.ArrayList;
import java.util.List;

public abstract class zzbrh
extends zzbae
implements zzbri {
    public zzbrh() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        Parcelable parcelable;
        Parcelable parcelable2;
        Object var5_5 = null;
        Object object = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener";
        boolean bl2 = false;
        Object object2 = null;
        switch (n3) {
            default: {
                return false;
            }
            case 39: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzH(iObjectWrapper);
                parcel2.writeNoException();
                return true;
            }
            case 38: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                Parcelable.Creator creator = zzl.CREATOR;
                zzl zzl2 = (zzl)zzbaf.zza(parcel, creator);
                String string2 = parcel.readString();
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    bl2 = (object = iBinder.queryLocalInterface((String)object)) instanceof zzbrl;
                    if (bl2) {
                        object2 = object;
                        object2 = (zzbrl)object;
                    } else {
                        object2 = new zzbrj(iBinder);
                    }
                }
                zzbaf.zzc(parcel);
                this.zzt(iObjectWrapper, zzl2, string2, (zzbrl)object2);
                parcel2.writeNoException();
                return true;
            }
            case 37: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzJ(iObjectWrapper);
                parcel2.writeNoException();
                return true;
            }
            case 36: {
                zzbro zzbro2 = this.zzj();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbro2);
                return true;
            }
            case 35: {
                Parcelable parcelable3;
                Parcelable parcelable4;
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                Parcelable.Creator creator = zzq.CREATOR;
                Parcelable parcelable5 = parcelable4 = zzbaf.zza(parcel, creator);
                zzq zzq2 = (zzq)parcelable4;
                Parcelable.Creator creator2 = zzl.CREATOR;
                Parcelable parcelable6 = parcelable3 = zzbaf.zza(parcel, creator2);
                zzl zzl3 = (zzl)parcelable3;
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    IInterface iInterface = iBinder.queryLocalInterface((String)object);
                    boolean bl3 = iInterface instanceof zzbrl;
                    if (bl3) {
                        object2 = iInterface;
                        object2 = (zzbrl)iInterface;
                    } else {
                        object2 = new zzbrj(iBinder);
                    }
                }
                Object object3 = object2;
                zzbaf.zzc(parcel);
                zzbrh zzbrh2 = this;
                this.zzw(iObjectWrapper, zzq2, zzl3, string3, string4, (zzbrl)object2);
                parcel2.writeNoException();
                return true;
            }
            case 34: {
                zzbtt zzbtt2 = this.zzm();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, zzbtt2);
                return true;
            }
            case 33: {
                zzbtt zzbtt3 = this.zzl();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, zzbtt3);
                return true;
            }
            case 32: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                Parcelable.Creator creator = zzl.CREATOR;
                zzl zzl4 = (zzl)zzbaf.zza(parcel, creator);
                String string5 = parcel.readString();
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    bl2 = (object = iBinder.queryLocalInterface((String)object)) instanceof zzbrl;
                    if (bl2) {
                        object2 = object;
                        object2 = (zzbrl)object;
                    } else {
                        object2 = new zzbrj(iBinder);
                    }
                }
                zzbaf.zzc(parcel);
                this.zzC(iObjectWrapper, zzl4, string5, (zzbrl)object2);
                parcel2.writeNoException();
                return true;
            }
            case 31: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbnr zzbnr2 = zzbnq.zzb(parcel.readStrongBinder());
                object = zzbnx.CREATOR;
                object = parcel.createTypedArrayList((Parcelable.Creator)object);
                zzbaf.zzc(parcel);
                this.zzq(iObjectWrapper, zzbnr2, (List)object);
                parcel2.writeNoException();
                return true;
            }
            case 30: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzK(iObjectWrapper);
                parcel2.writeNoException();
                return true;
            }
            case 28: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                Parcelable.Creator creator = zzl.CREATOR;
                zzl zzl5 = (zzl)zzbaf.zza(parcel, creator);
                String string6 = parcel.readString();
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    bl2 = (object = iBinder.queryLocalInterface((String)object)) instanceof zzbrl;
                    if (bl2) {
                        object2 = object;
                        object2 = (zzbrl)object;
                    } else {
                        object2 = new zzbrj(iBinder);
                    }
                }
                zzbaf.zzc(parcel);
                this.zzA(iObjectWrapper, zzl5, string6, (zzbrl)object2);
                parcel2.writeNoException();
                return true;
            }
            case 27: {
                zzbru zzbru2 = this.zzk();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbru2);
                return true;
            }
            case 26: {
                zzdq zzdq2 = this.zzh();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzdq2);
                return true;
            }
            case 25: {
                n3 = (int)(zzbaf.zzg(parcel) ? 1 : 0);
                zzbaf.zzc(parcel);
                this.zzG(n3 != 0);
                parcel2.writeNoException();
                return true;
            }
            case 24: {
                zzbip zzbip2 = this.zzi();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbip2);
                return true;
            }
            case 23: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbys zzbys2 = zzbyr.zzb(parcel.readStrongBinder());
                object = parcel.createStringArrayList();
                zzbaf.zzc(parcel);
                this.zzr(iObjectWrapper, zzbys2, (List)object);
                parcel2.writeNoException();
                return true;
            }
            case 22: {
                parcel2.writeNoException();
                n3 = zzbaf.zza;
                parcel2.writeInt(0);
                return true;
            }
            case 21: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzD(iObjectWrapper);
                parcel2.writeNoException();
                return true;
            }
            case 20: {
                Parcelable.Creator creator = zzl.CREATOR;
                zzl zzl6 = (zzl)zzbaf.zza(parcel, creator);
                String string7 = parcel.readString();
                object = parcel.readString();
                zzbaf.zzc(parcel);
                this.zzB(zzl6, string7, (String)object);
                parcel2.writeNoException();
                return true;
            }
            case 19: {
                Bundle bundle = this.zzg();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, (Parcelable)bundle);
                return true;
            }
            case 18: {
                Bundle bundle = this.zzf();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, (Parcelable)bundle);
                return true;
            }
            case 17: {
                Bundle bundle = this.zze();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, (Parcelable)bundle);
                return true;
            }
            case 16: {
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, null);
                return true;
            }
            case 15: {
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, null);
                return true;
            }
            case 14: {
                Parcelable parcelable7;
                Parcelable parcelable8;
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                Parcelable.Creator creator = zzl.CREATOR;
                Parcelable parcelable9 = parcelable8 = zzbaf.zza(parcel, creator);
                zzl zzl7 = (zzl)parcelable8;
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    IInterface iInterface = iBinder.queryLocalInterface((String)object);
                    boolean bl4 = iInterface instanceof zzbrl;
                    if (bl4) {
                        object2 = iInterface;
                        object2 = (zzbrl)iInterface;
                    } else {
                        object2 = new zzbrj(iBinder);
                    }
                }
                IObjectWrapper iObjectWrapper2 = object2;
                Parcelable.Creator creator3 = zzbhk.CREATOR;
                Parcelable parcelable10 = parcelable7 = zzbaf.zza(parcel, creator3);
                zzbhk zzbhk2 = (zzbhk)parcelable7;
                ArrayList arrayList = parcel.createStringArrayList();
                zzbaf.zzc(parcel);
                zzbrh zzbrh3 = this;
                this.zzz(iObjectWrapper, zzl7, string8, string9, (zzbrl)object2, zzbhk2, arrayList);
                parcel2.writeNoException();
                return true;
            }
            case 13: {
                n3 = (int)(this.zzN() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                return true;
            }
            case 12: {
                this.zzL();
                parcel2.writeNoException();
                return true;
            }
            case 11: {
                Parcelable.Creator creator = zzl.CREATOR;
                zzl zzl8 = (zzl)zzbaf.zza(parcel, creator);
                String string10 = parcel.readString();
                zzbaf.zzc(parcel);
                this.zzs(zzl8, string10);
                parcel2.writeNoException();
                return true;
            }
            case 10: {
                Parcelable parcelable11;
                object2 = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                Parcelable.Creator creator = zzl.CREATOR;
                Parcelable parcelable12 = parcelable11 = zzbaf.zza(parcel, creator);
                zzl zzl9 = (zzl)parcelable11;
                String string11 = parcel.readString();
                IBinder iBinder = parcel.readStrongBinder();
                zzbys zzbys3 = zzbyr.zzb(iBinder);
                String string12 = parcel.readString();
                zzbaf.zzc(parcel);
                object = this;
                this.zzp((IObjectWrapper)object2, zzl9, string11, zzbys3, string12);
                parcel2.writeNoException();
                return true;
            }
            case 9: {
                this.zzF();
                parcel2.writeNoException();
                return true;
            }
            case 8: {
                this.zzE();
                parcel2.writeNoException();
                return true;
            }
            case 7: {
                Parcelable parcelable13;
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                Parcelable.Creator creator = zzl.CREATOR;
                Parcelable parcelable14 = parcelable13 = zzbaf.zza(parcel, creator);
                zzl zzl10 = (zzl)parcelable13;
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    IInterface iInterface = iBinder.queryLocalInterface((String)object);
                    boolean bl5 = iInterface instanceof zzbrl;
                    if (bl5) {
                        object2 = iInterface;
                        object2 = (zzbrl)iInterface;
                    } else {
                        object2 = new zzbrj(iBinder);
                    }
                }
                IObjectWrapper iObjectWrapper3 = object2;
                zzbaf.zzc(parcel);
                zzbrh zzbrh4 = this;
                this.zzy(iObjectWrapper, zzl10, string13, string14, (zzbrl)object2);
                parcel2.writeNoException();
                return true;
            }
            case 6: {
                Parcelable parcelable15;
                Parcelable parcelable16;
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                Parcelable.Creator creator = zzq.CREATOR;
                Parcelable parcelable17 = parcelable16 = zzbaf.zza(parcel, creator);
                zzq zzq3 = (zzq)parcelable16;
                Parcelable.Creator creator4 = zzl.CREATOR;
                Parcelable parcelable18 = parcelable15 = zzbaf.zza(parcel, creator4);
                zzl zzl11 = (zzl)parcelable15;
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    IInterface iInterface = iBinder.queryLocalInterface((String)object);
                    boolean bl6 = iInterface instanceof zzbrl;
                    if (bl6) {
                        object2 = iInterface;
                        object2 = (zzbrl)iInterface;
                    } else {
                        object2 = new zzbrj(iBinder);
                    }
                }
                Object object4 = object2;
                zzbaf.zzc(parcel);
                zzbrh zzbrh5 = this;
                this.zzv(iObjectWrapper, zzq3, zzl11, string15, string16, (zzbrl)object2);
                parcel2.writeNoException();
                return true;
            }
            case 5: {
                this.zzo();
                parcel2.writeNoException();
                return true;
            }
            case 4: {
                this.zzI();
                parcel2.writeNoException();
                return true;
            }
            case 3: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                Parcelable.Creator creator = zzl.CREATOR;
                zzl zzl12 = (zzl)zzbaf.zza(parcel, creator);
                String string17 = parcel.readString();
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    bl2 = (object = iBinder.queryLocalInterface((String)object)) instanceof zzbrl;
                    if (bl2) {
                        object2 = object;
                        object2 = (zzbrl)object;
                    } else {
                        object2 = new zzbrj(iBinder);
                    }
                }
                zzbaf.zzc(parcel);
                this.zzx(iObjectWrapper, zzl12, string17, (zzbrl)object2);
                parcel2.writeNoException();
                return true;
            }
            case 2: {
                IObjectWrapper iObjectWrapper = this.zzn();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, iObjectWrapper);
                return true;
            }
            case 1: 
        }
        IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
        Parcelable.Creator creator = zzq.CREATOR;
        Parcelable parcelable19 = parcelable2 = zzbaf.zza(parcel, creator);
        zzq zzq4 = (zzq)parcelable2;
        Parcelable.Creator creator5 = zzl.CREATOR;
        Parcelable parcelable20 = parcelable = zzbaf.zza(parcel, creator5);
        zzl zzl13 = (zzl)parcelable;
        String string18 = parcel.readString();
        IBinder iBinder = parcel.readStrongBinder();
        if (iBinder != null) {
            IInterface iInterface = iBinder.queryLocalInterface((String)object);
            boolean bl7 = iInterface instanceof zzbrl;
            if (bl7) {
                object2 = iInterface;
                object2 = (zzbrl)iInterface;
            } else {
                object2 = new zzbrj(iBinder);
            }
        }
        Object object5 = object2;
        zzbaf.zzc(parcel);
        zzbrh zzbrh6 = this;
        this.zzu(iObjectWrapper, zzq4, zzl13, string18, (zzbrl)object2);
        parcel2.writeNoException();
        return true;
    }
}

