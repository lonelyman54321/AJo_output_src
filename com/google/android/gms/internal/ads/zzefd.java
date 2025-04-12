/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.net.NetworkInfo$DetailedState
 *  android.os.Bundle
 *  android.provider.Settings$Global
 *  android.telephony.TelephonyManager
 *  android.util.SparseArray
 */
package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbdv$zzab;
import com.google.android.gms.internal.ads.zzbdv$zzab$zza;
import com.google.android.gms.internal.ads.zzbdv$zzab$zzb;
import com.google.android.gms.internal.ads.zzbdv$zzab$zzc;
import com.google.android.gms.internal.ads.zzbdv$zzaf$zza;
import com.google.android.gms.internal.ads.zzbdv$zzaf$zza$zza;
import com.google.android.gms.internal.ads.zzbdv$zzaf$zzd;
import com.google.android.gms.internal.ads.zzbdv$zzq;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcyp;
import com.google.android.gms.internal.ads.zzeer;
import com.google.android.gms.internal.ads.zzeev;
import com.google.android.gms.internal.ads.zzefc;
import com.google.android.gms.internal.ads.zzefe;
import com.google.android.gms.internal.ads.zzfic;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

public final class zzefd
extends zzefe {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzcyp zzd;
    private final TelephonyManager zze;
    private final zzeev zzf;
    private zzbdv$zzq zzg;

    static {
        SparseArray sparseArray;
        zzb = sparseArray = new SparseArray();
        int n3 = NetworkInfo.DetailedState.CONNECTED.ordinal();
        zzbdv$zzaf$zzd zzbdv$zzaf$zzd = zzbdv$zzaf$zzd.zzc;
        sparseArray.put(n3, (Object)zzbdv$zzaf$zzd);
        n3 = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbdv$zzaf$zzd = zzbdv$zzaf$zzd.zzb;
        sparseArray.put(n3, (Object)zzbdv$zzaf$zzd);
        n3 = NetworkInfo.DetailedState.CONNECTING.ordinal();
        sparseArray.put(n3, (Object)zzbdv$zzaf$zzd);
        n3 = NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal();
        sparseArray.put(n3, (Object)zzbdv$zzaf$zzd);
        n3 = NetworkInfo.DetailedState.DISCONNECTING.ordinal();
        zzbdv$zzaf$zzd zzbdv$zzaf$zzd2 = zzbdv$zzaf$zzd.zzd;
        sparseArray.put(n3, (Object)zzbdv$zzaf$zzd2);
        n3 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbdv$zzaf$zzd2 = zzbdv$zzaf$zzd.zze;
        sparseArray.put(n3, (Object)zzbdv$zzaf$zzd2);
        n3 = NetworkInfo.DetailedState.DISCONNECTED.ordinal();
        sparseArray.put(n3, (Object)zzbdv$zzaf$zzd2);
        n3 = NetworkInfo.DetailedState.FAILED.ordinal();
        sparseArray.put(n3, (Object)zzbdv$zzaf$zzd2);
        n3 = NetworkInfo.DetailedState.IDLE.ordinal();
        sparseArray.put(n3, (Object)zzbdv$zzaf$zzd2);
        n3 = NetworkInfo.DetailedState.SCANNING.ordinal();
        sparseArray.put(n3, (Object)zzbdv$zzaf$zzd2);
        n3 = NetworkInfo.DetailedState.SUSPENDED.ordinal();
        zzbdv$zzaf$zzd2 = zzbdv$zzaf$zzd.zzf;
        sparseArray.put(n3, (Object)zzbdv$zzaf$zzd2);
        n3 = NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal();
        sparseArray.put(n3, (Object)zzbdv$zzaf$zzd);
        n3 = NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal();
        sparseArray.put(n3, (Object)zzbdv$zzaf$zzd);
    }

    public zzefd(Context context, zzcyp zzcyp2, zzeev zzeev2, zzeer zzeer2, zzg zzg2) {
        super(zzeer2, zzg2);
        this.zzc = context;
        this.zzd = zzcyp2;
        this.zzf = zzeev2;
        context = (TelephonyManager)context.getSystemService("phone");
        this.zze = context;
    }

    public static /* bridge */ /* synthetic */ zzbdv$zzab zza(zzefd object, Bundle object2) {
        zzbdv$zzab$zza zzbdv$zzab$zza = zzbdv$zzab.zza();
        int n3 = object2.getInt("cnt", -2);
        zzbdv$zzq zzbdv$zzq = null;
        String string2 = "gnt";
        int n4 = object2.getInt(string2, 0);
        int n7 = -1;
        if (n3 == n7) {
            object2 = zzbdv$zzq.zzb;
            ((zzefd)object).zzg = object2;
        } else {
            ((zzefd)object).zzg = zzbdv$zzq = zzbdv$zzq.zza;
            if (n3 != 0) {
                int n8 = 1;
                if (n3 != n8) {
                    object = zzbdv$zzab$zzc.zza;
                    zzbdv$zzab$zza.zzd((zzbdv$zzab$zzc)object);
                } else {
                    object = zzbdv$zzab$zzc.zzc;
                    zzbdv$zzab$zza.zzd((zzbdv$zzab$zzc)object);
                }
            } else {
                object = zzbdv$zzab$zzc.zzb;
                zzbdv$zzab$zza.zzd((zzbdv$zzab$zzc)object);
            }
            switch (n4) {
                default: {
                    object = zzbdv$zzab$zzb.zza;
                    break;
                }
                case 13: {
                    object = zzbdv$zzab$zzb.zzd;
                    break;
                }
                case 3: 
                case 5: 
                case 6: 
                case 8: 
                case 9: 
                case 10: 
                case 12: 
                case 14: 
                case 15: 
                case 17: {
                    object = zzbdv$zzab$zzb.zzc;
                    break;
                }
                case 1: 
                case 2: 
                case 4: 
                case 7: 
                case 11: 
                case 16: {
                    object = zzbdv$zzab$zzb.zzb;
                }
            }
            zzbdv$zzab$zza.zzc((zzbdv$zzab$zzb)object);
        }
        return (zzbdv$zzab)zzbdv$zzab$zza.zzbn();
    }

    public static /* bridge */ /* synthetic */ zzbdv$zzaf$zzd zzb(zzefd zzefd2, Bundle bundle) {
        int n3 = zzfic.zza(zzfic.zza(bundle, "device"), "network").getInt("active_network_state", -1);
        bundle = zzb;
        zzbdv$zzaf$zzd zzbdv$zzaf$zzd = zzbdv$zzaf$zzd.zza;
        return (zzbdv$zzaf$zzd)bundle.get(n3, (Object)zzbdv$zzaf$zzd);
    }

    public static /* bridge */ /* synthetic */ zzeev zzc(zzefd zzefd2) {
        return zzefd2.zzf;
    }

    public static /* bridge */ /* synthetic */ byte[] zze(zzefd object, boolean bl2, ArrayList object2, zzbdv$zzab zzbdv$zzab, zzbdv$zzaf$zzd zzbdv$zzaf$zzd) {
        zzbdv$zzaf$zza$zza zzbdv$zzaf$zza$zza = zzbdv$zzaf$zza.zzn();
        zzbdv$zzaf$zza$zza.zzn((Iterable)object2);
        object2 = ((zzefd)object).zzc.getContentResolver();
        String string2 = "airplane_mode_on";
        boolean bl3 = false;
        int n3 = Settings.Global.getInt((ContentResolver)object2, (String)string2, (int)0);
        if (n3 != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object2 = null;
        }
        object2 = zzefd.zzg(n3 != 0);
        zzbdv$zzaf$zza$zza.zzD((zzbdv$zzq)object2);
        object2 = zzu.zzq();
        Context context = ((zzefd)object).zzc;
        TelephonyManager telephonyManager = ((zzefd)object).zze;
        object2 = ((zzab)object2).zzg(context, telephonyManager);
        zzbdv$zzaf$zza$zza.zzE((zzbdv$zzq)object2);
        long l2 = ((zzefd)object).zzf.zze();
        zzbdv$zzaf$zza$zza.zzM(l2);
        l2 = ((zzefd)object).zzf.zzb();
        zzbdv$zzaf$zza$zza.zzL(l2);
        n3 = ((zzefd)object).zzf.zza();
        zzbdv$zzaf$zza$zza.zzG(n3);
        zzbdv$zzaf$zza$zza.zzH(zzbdv$zzaf$zzd);
        zzbdv$zzaf$zza$zza.zzJ(zzbdv$zzab);
        object2 = ((zzefd)object).zzg;
        zzbdv$zzaf$zza$zza.zzK((zzbdv$zzq)object2);
        Object object3 = zzefd.zzg(bl2);
        zzbdv$zzaf$zza$zza.zzN((zzbdv$zzq)object3);
        long l3 = ((zzefd)object).zzf.zzd();
        zzbdv$zzaf$zza$zza.zzP(l3);
        l3 = zzu.zzB().currentTimeMillis();
        zzbdv$zzaf$zza$zza.zzO(l3);
        object = ((zzefd)object).zzc.getContentResolver();
        object3 = "wifi_on";
        int n4 = Settings.Global.getInt((ContentResolver)object, (String)object3, (int)0);
        if (n4 != 0) {
            bl3 = true;
        }
        object = zzefd.zzg(bl3);
        zzbdv$zzaf$zza$zza.zzQ((zzbdv$zzq)object);
        return ((zzbdv$zzaf$zza)zzbdv$zzaf$zza$zza.zzbn()).zzaV();
    }

    private static final zzbdv$zzq zzg(boolean bl2) {
        zzbdv$zzq zzbdv$zzq = bl2 ? zzbdv$zzq.zzb : zzbdv$zzq.zza;
        return zzbdv$zzq;
    }

    public final void zzd(boolean bl2) {
        Object object = new Bundle();
        object = this.zzd.zzb((Bundle)object);
        zzefc zzefc2 = new zzefc(this, bl2);
        zzgge zzgge2 = zzcci.zzf;
        zzgft.zzr((ListenableFuture)object, zzefc2, zzgge2);
    }
}

