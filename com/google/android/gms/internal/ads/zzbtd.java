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
import com.google.android.gms.internal.ads.zzbrk;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbsn;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbsq;
import com.google.android.gms.internal.ads.zzbss;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbsy;
import com.google.android.gms.internal.ads.zzbsz;
import com.google.android.gms.internal.ads.zzbtb;
import com.google.android.gms.internal.ads.zzbtc;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzbtt;

public abstract class zzbtd
extends zzbae
implements zzbte {
    public zzbtd() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbte zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        boolean bl2 = iInterface instanceof zzbte;
        if (bl2) {
            return (zzbte)iInterface;
        }
        iInterface = new zzbtc(iBinder);
        return iInterface;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        void var8_58;
        Parcelable parcelable;
        Parcelable parcelable2;
        int n7 = n3;
        Parcel parcel3 = parcel;
        int n8 = 1;
        Object var8_17 = null;
        if (n3 != n8) {
            Parcelable parcelable3;
            void var8_53;
            Parcelable parcelable4;
            int n10 = 2;
            if (n3 == n10) {
                zzbtt zzbtt2 = this.zzf();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, zzbtt2);
                return n8;
            }
            n10 = 3;
            if (n3 == n10) {
                zzbtt zzbtt3 = this.zzg();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, zzbtt3);
                return n8;
            }
            n10 = 5;
            if (n3 == n10) {
                zzdq zzdq2 = this.zze();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzdq2);
                return n8;
            }
            n10 = 10;
            if (n3 == n10) {
                IBinder iBinder = parcel.readStrongBinder();
                IObjectWrapper$Stub.asInterface(iBinder);
                zzbaf.zzc(parcel);
                parcel2.writeNoException();
                return n8;
            }
            n10 = 11;
            if (n3 == n10) {
                parcel.createStringArray();
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle[] bundleArray = (Bundle[])parcel.createTypedArray(creator);
                zzbaf.zzc(parcel);
                parcel2.writeNoException();
                return n8;
            }
            Object object = "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback";
            Object object2 = "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback";
            Object object3 = "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback";
            switch (n3) {
                default: {
                    return false;
                }
                case 24: {
                    IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                    zzbaf.zzc(parcel);
                    n7 = (int)(this.zzr(iObjectWrapper) ? 1 : 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(n7);
                    return n8;
                }
                case 23: {
                    void var8_18;
                    object = parcel.readString();
                    object2 = parcel.readString();
                    Parcelable.Creator creator = zzl.CREATOR;
                    Parcelable parcelable5 = zzbaf.zza(parcel, creator);
                    object3 = parcelable5;
                    object3 = (zzl)parcelable5;
                    IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                    IBinder iBinder = parcel.readStrongBinder();
                    if (iBinder != null) {
                        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        boolean bl2 = iInterface instanceof zzbsp;
                        if (bl2) {
                            zzbsp zzbsp2 = (zzbsp)iInterface;
                        } else {
                            zzbsn zzbsn2 = new zzbsn(iBinder);
                        }
                    }
                    void var15_149 = var8_18;
                    zzbrl zzbrl2 = zzbrk.zzb(parcel.readStrongBinder());
                    zzbaf.zzc(parcel);
                    zzbtd zzbtd2 = this;
                    String string2 = object;
                    String string3 = object2;
                    object = object3;
                    object2 = iObjectWrapper;
                    object3 = var15_149;
                    zzbrl zzbrl3 = zzbrl2;
                    this.zzi(string2, string3, (zzl)object, (IObjectWrapper)object2, (zzbsp)var15_149, zzbrl2);
                    parcel2.writeNoException();
                    return n8;
                }
                case 22: {
                    Parcelable parcelable6;
                    void var8_23;
                    Parcelable parcelable7;
                    object = parcel.readString();
                    object2 = parcel.readString();
                    Parcelable.Creator creator = zzl.CREATOR;
                    Parcelable parcelable8 = parcelable7 = zzbaf.zza(parcel, creator);
                    zzl zzl2 = (zzl)parcelable7;
                    IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                    IBinder iBinder = parcel.readStrongBinder();
                    if (iBinder != null) {
                        IInterface iInterface = iBinder.queryLocalInterface((String)object3);
                        boolean bl3 = iInterface instanceof zzbsy;
                        if (bl3) {
                            zzbsy zzbsy2 = (zzbsy)iInterface;
                        } else {
                            zzbsw zzbsw2 = new zzbsw(iBinder);
                        }
                    }
                    object3 = var8_23;
                    zzbrl zzbrl4 = zzbrk.zzb(parcel.readStrongBinder());
                    Parcelable.Creator creator2 = zzbhk.CREATOR;
                    Parcelable parcelable9 = parcelable6 = zzbaf.zza(parcel3, creator2);
                    zzbhk zzbhk2 = (zzbhk)parcelable6;
                    zzbaf.zzc(parcel);
                    zzbtd zzbtd3 = this;
                    Object object4 = object;
                    Object object5 = object2;
                    object = zzl2;
                    object2 = iObjectWrapper;
                    zzbrl zzbrl5 = zzbrl4;
                    zzbhk zzbhk3 = zzbhk2;
                    this.zzn((String)object4, (String)object5, (zzl)object, (IObjectWrapper)object2, (zzbsy)object3, zzbrl4, zzbhk2);
                    parcel2.writeNoException();
                    return n8;
                }
                case 21: {
                    Parcelable parcelable10;
                    void var8_28;
                    Parcelable parcelable11;
                    object = parcel.readString();
                    object3 = parcel.readString();
                    Parcelable.Creator creator = zzl.CREATOR;
                    Parcelable parcelable12 = parcelable11 = zzbaf.zza(parcel, creator);
                    zzl zzl3 = (zzl)parcelable11;
                    IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                    IBinder iBinder = parcel.readStrongBinder();
                    if (iBinder != null) {
                        IInterface iInterface = iBinder.queryLocalInterface((String)object2);
                        boolean bl4 = iInterface instanceof zzbss;
                        if (bl4) {
                            zzbss zzbss2 = (zzbss)iInterface;
                        } else {
                            zzbsq zzbsq2 = new zzbsq(iBinder);
                        }
                    }
                    void var17_166 = var8_28;
                    zzbrl zzbrl6 = zzbrk.zzb(parcel.readStrongBinder());
                    Parcelable.Creator creator3 = zzq.CREATOR;
                    Parcelable parcelable13 = parcelable10 = zzbaf.zza(parcel3, creator3);
                    zzq zzq2 = (zzq)parcelable10;
                    zzbaf.zzc(parcel);
                    zzbtd zzbtd4 = this;
                    Object object6 = object;
                    Object object7 = object3;
                    object = zzl3;
                    object2 = iObjectWrapper;
                    object3 = var17_166;
                    zzbrl zzbrl7 = zzbrl6;
                    zzq zzq3 = zzq2;
                    this.zzk((String)object6, (String)object7, (zzl)object, (IObjectWrapper)object2, (zzbss)var17_166, zzbrl6, zzq2);
                    parcel2.writeNoException();
                    return n8;
                }
                case 20: {
                    void var8_33;
                    Parcelable parcelable14;
                    object2 = parcel.readString();
                    object3 = parcel.readString();
                    Parcelable.Creator creator = zzl.CREATOR;
                    Parcelable parcelable15 = parcelable14 = zzbaf.zza(parcel, creator);
                    zzl zzl4 = (zzl)parcelable14;
                    IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                    IBinder iBinder = parcel.readStrongBinder();
                    if (iBinder != null) {
                        IInterface iInterface = iBinder.queryLocalInterface((String)object);
                        n10 = iInterface instanceof zzbtb;
                        if (n10 != 0) {
                            zzbtb zzbtb2 = (zzbtb)iInterface;
                        } else {
                            zzbsz zzbsz2 = new zzbsz(iBinder);
                        }
                    }
                    void var17_167 = var8_33;
                    zzbrl zzbrl8 = zzbrk.zzb(parcel.readStrongBinder());
                    zzbaf.zzc(parcel);
                    zzbtd zzbtd5 = this;
                    String string4 = object2;
                    Object object8 = object3;
                    object = zzl4;
                    object2 = iObjectWrapper;
                    object3 = var17_167;
                    zzbrl zzbrl9 = zzbrl8;
                    this.zzo(string4, (String)object8, (zzl)object, iObjectWrapper, (zzbtb)var17_167, zzbrl8);
                    parcel2.writeNoException();
                    return n8;
                }
                case 19: {
                    String string5 = parcel.readString();
                    zzbaf.zzc(parcel);
                    this.zzq(string5);
                    parcel2.writeNoException();
                    return n8;
                }
                case 18: {
                    void var8_38;
                    Parcelable parcelable16;
                    object = parcel.readString();
                    object2 = parcel.readString();
                    Parcelable.Creator creator = zzl.CREATOR;
                    Parcelable parcelable17 = parcelable16 = zzbaf.zza(parcel, creator);
                    zzl zzl5 = (zzl)parcelable16;
                    IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                    IBinder iBinder = parcel.readStrongBinder();
                    if (iBinder != null) {
                        IInterface iInterface = iBinder.queryLocalInterface((String)object3);
                        boolean bl5 = iInterface instanceof zzbsy;
                        if (bl5) {
                            zzbsy zzbsy3 = (zzbsy)iInterface;
                        } else {
                            zzbsw zzbsw3 = new zzbsw(iBinder);
                        }
                    }
                    object3 = var8_38;
                    zzbrl zzbrl10 = zzbrk.zzb(parcel.readStrongBinder());
                    zzbaf.zzc(parcel);
                    zzbtd zzbtd6 = this;
                    String string6 = object;
                    String string7 = object2;
                    object = zzl5;
                    object2 = iObjectWrapper;
                    zzbrl zzbrl11 = zzbrl10;
                    this.zzm(string6, string7, (zzl)object, iObjectWrapper, (zzbsy)object3, zzbrl10);
                    parcel2.writeNoException();
                    return n8;
                }
                case 17: {
                    IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                    zzbaf.zzc(parcel);
                    n7 = (int)(this.zzt(iObjectWrapper) ? 1 : 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(n7);
                    return n8;
                }
                case 16: {
                    void var8_43;
                    Parcelable parcelable18;
                    object2 = parcel.readString();
                    object3 = parcel.readString();
                    Parcelable.Creator creator = zzl.CREATOR;
                    Parcelable parcelable19 = parcelable18 = zzbaf.zza(parcel, creator);
                    zzl zzl6 = (zzl)parcelable18;
                    IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                    IBinder iBinder = parcel.readStrongBinder();
                    if (iBinder != null) {
                        IInterface iInterface = iBinder.queryLocalInterface((String)object);
                        n10 = iInterface instanceof zzbtb;
                        if (n10 != 0) {
                            zzbtb zzbtb3 = (zzbtb)iInterface;
                        } else {
                            zzbsz zzbsz3 = new zzbsz(iBinder);
                        }
                    }
                    void var17_169 = var8_43;
                    zzbrl zzbrl12 = zzbrk.zzb(parcel.readStrongBinder());
                    zzbaf.zzc(parcel);
                    zzbtd zzbtd7 = this;
                    String string8 = object2;
                    Object object9 = object3;
                    object = zzl6;
                    object2 = iObjectWrapper;
                    object3 = var17_169;
                    zzbrl zzbrl13 = zzbrl12;
                    this.zzp(string8, (String)object9, (zzl)object, iObjectWrapper, (zzbtb)var17_169, zzbrl12);
                    parcel2.writeNoException();
                    return n8;
                }
                case 15: {
                    IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                    zzbaf.zzc(parcel);
                    n7 = (int)(this.zzs(iObjectWrapper) ? 1 : 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(n7);
                    return n8;
                }
                case 14: {
                    void var8_48;
                    object = parcel.readString();
                    object2 = parcel.readString();
                    Parcelable.Creator creator = zzl.CREATOR;
                    Parcelable parcelable20 = zzbaf.zza(parcel, creator);
                    object3 = parcelable20;
                    object3 = (zzl)parcelable20;
                    IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                    IBinder iBinder = parcel.readStrongBinder();
                    if (iBinder != null) {
                        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        boolean bl6 = iInterface instanceof zzbsv;
                        if (bl6) {
                            zzbsv zzbsv2 = (zzbsv)iInterface;
                        } else {
                            zzbst zzbst2 = new zzbst(iBinder);
                        }
                    }
                    void var15_157 = var8_48;
                    zzbrl zzbrl14 = zzbrk.zzb(parcel.readStrongBinder());
                    zzbaf.zzc(parcel);
                    zzbtd zzbtd8 = this;
                    String string9 = object;
                    String string10 = object2;
                    object = object3;
                    object2 = iObjectWrapper;
                    object3 = var15_157;
                    zzbrl zzbrl15 = zzbrl14;
                    this.zzl(string9, string10, (zzl)object, (IObjectWrapper)object2, (zzbsv)var15_157, zzbrl14);
                    parcel2.writeNoException();
                    return n8;
                }
                case 13: 
            }
            object = parcel.readString();
            object3 = parcel.readString();
            Parcelable.Creator creator = zzl.CREATOR;
            Parcelable parcelable21 = parcelable4 = zzbaf.zza(parcel, creator);
            zzl zzl7 = (zzl)parcelable4;
            IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
            IBinder iBinder = parcel.readStrongBinder();
            if (iBinder != null) {
                IInterface iInterface = iBinder.queryLocalInterface((String)object2);
                boolean bl7 = iInterface instanceof zzbss;
                if (bl7) {
                    zzbss zzbss3 = (zzbss)iInterface;
                } else {
                    zzbsq zzbsq3 = new zzbsq(iBinder);
                }
            }
            void var17_171 = var8_53;
            zzbrl zzbrl16 = zzbrk.zzb(parcel.readStrongBinder());
            Parcelable.Creator creator4 = zzq.CREATOR;
            Parcelable parcelable22 = parcelable3 = zzbaf.zza(parcel3, creator4);
            zzq zzq4 = (zzq)parcelable3;
            zzbaf.zzc(parcel);
            zzbtd zzbtd9 = this;
            Object object10 = object;
            Object object11 = object3;
            object = zzl7;
            object2 = iObjectWrapper;
            object3 = var17_171;
            zzbrl zzbrl17 = zzbrl16;
            zzq zzq5 = zzq4;
            this.zzj((String)object10, (String)object11, (zzl)object, (IObjectWrapper)object2, (zzbss)var17_171, zzbrl16, zzq4);
            parcel2.writeNoException();
            return n8;
        }
        IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
        String string11 = parcel.readString();
        Parcelable.Creator creator = Bundle.CREATOR;
        Object object = (Bundle)zzbaf.zza(parcel, creator);
        Parcelable parcelable23 = parcelable2 = zzbaf.zza(parcel, creator);
        Bundle bundle = (Bundle)parcelable2;
        Parcelable.Creator creator5 = zzq.CREATOR;
        Parcelable parcelable24 = parcelable = zzbaf.zza(parcel, creator5);
        zzq zzq6 = (zzq)parcelable;
        IBinder iBinder = parcel.readStrongBinder();
        if (iBinder != null) {
            IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
            boolean bl8 = iInterface instanceof zzbth;
            if (bl8) {
                zzbth zzbth2 = (zzbth)iInterface;
            } else {
                zzbtf zzbtf2 = new zzbtf(iBinder);
            }
        }
        void var17_172 = var8_58;
        zzbaf.zzc(parcel);
        zzbtd zzbtd10 = this;
        IObjectWrapper iObjectWrapper2 = iObjectWrapper;
        String string12 = string11;
        iObjectWrapper = object;
        string11 = bundle;
        object = zzq6;
        void var14_148 = var17_172;
        this.zzh(iObjectWrapper2, string12, (Bundle)iObjectWrapper, (Bundle)string11, zzq6, (zzbth)var17_172);
        parcel2.writeNoException();
        return n8;
    }
}

