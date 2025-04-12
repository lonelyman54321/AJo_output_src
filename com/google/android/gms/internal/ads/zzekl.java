/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbru;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzdkd;
import com.google.android.gms.internal.ads.zzeho;
import com.google.android.gms.internal.ads.zzehr;
import com.google.android.gms.internal.ads.zzekk;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhc;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfhv;

public final class zzekl
implements zzehr {
    private final Context zza;
    private final zzdkd zzb;
    private zzbru zzc;
    private final VersionInfoParcel zzd;

    public zzekl(Context context, zzdkd zzdkd2, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzdkd2;
        this.zzd = versionInfoParcel;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzekl zzekl2, zzbru zzbru2) {
        zzekl2.zzc = zzbru2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(zzfhf object, zzfgt object2, zzeho zzeho2) {
        RemoteException remoteException2;
        block3: {
            Object object3;
            try {
                object3 = zzeho2.zzb;
                object3 = (zzbte)object3;
                Object object4 = ((zzfgt)object2).zzaa;
                object3.zzq((String)object4);
                object3 = this.zzd;
                int n3 = ((VersionInfoParcel)object3).clientJarVersion;
                object4 = zzbep.zzbI;
                zzben zzben2 = zzba.zzc();
                object4 = zzben2.zza((zzbeg)object4);
                object4 = (Integer)object4;
                int n4 = (Integer)object4;
                zzben2 = null;
                if (n3 < n4) {
                    Object object5 = object3 = zzeho2.zzb;
                    object5 = (zzbte)object3;
                    String string2 = ((zzfgt)object2).zzV;
                    object2 = ((zzfgt)object2).zzw;
                    String string3 = object2.toString();
                    object = ((zzfhf)object).zza;
                    object = ((zzfhc)object).zza;
                    zzl zzl2 = ((zzfho)object).zzd;
                    object = this.zza;
                    IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(object);
                    zzekk zzekk2 = new zzekk(this, zzeho2, null);
                    Object object6 = object = zzeho2.zzc;
                    object6 = (zzbrl)object;
                    object5.zzm(string2, string3, zzl2, iObjectWrapper, zzekk2, (zzbrl)object6);
                    return;
                }
            }
            catch (RemoteException remoteException2) {
                break block3;
            }
            Object object7 = object3 = zzeho2.zzb;
            object7 = (zzbte)object3;
            String string4 = ((zzfgt)object2).zzV;
            object2 = ((zzfgt)object2).zzw;
            String string5 = object2.toString();
            object2 = ((zzfhf)object).zza;
            object2 = ((zzfhc)object2).zza;
            zzl zzl3 = ((zzfho)object2).zzd;
            object2 = this.zza;
            IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(object2);
            zzekk zzekk3 = new zzekk(this, zzeho2, null);
            Object object8 = object2 = zzeho2.zzc;
            object8 = (zzbrl)object2;
            object = ((zzfhf)object).zza;
            object = ((zzfhc)object).zza;
            zzbhk zzbhk2 = ((zzfho)object).zzi;
            object7.zzn(string4, string5, zzl3, iObjectWrapper, zzekk3, (zzbrl)object8, zzbhk2);
            return;
        }
        object2 = new zzfhv(remoteException2);
        throw object2;
    }
}

