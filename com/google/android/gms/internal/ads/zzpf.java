/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.DeniedByServerException
 *  android.media.MediaCodec$CryptoException
 *  android.media.MediaDrm$MediaDrmStateException
 *  android.media.NotProvisionedException
 *  android.media.metrics.LogSessionId
 *  android.media.metrics.MediaMetricsManager
 *  android.media.metrics.NetworkEvent
 *  android.media.metrics.NetworkEvent$Builder
 *  android.media.metrics.PlaybackErrorEvent
 *  android.media.metrics.PlaybackErrorEvent$Builder
 *  android.media.metrics.PlaybackMetrics
 *  android.media.metrics.PlaybackMetrics$Builder
 *  android.media.metrics.PlaybackSession
 *  android.media.metrics.PlaybackStateEvent
 *  android.media.metrics.PlaybackStateEvent$Builder
 *  android.media.metrics.TrackChangeEvent
 *  android.media.metrics.TrackChangeEvent$Builder
 *  android.net.Uri
 *  android.os.SystemClock
 *  android.system.ErrnoException
 *  android.system.OsConstants
 *  android.util.Pair
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzbn;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzcj;
import com.google.android.gms.internal.ads.zzcs;
import com.google.android.gms.internal.ads.zzct;
import com.google.android.gms.internal.ads.zzcz;
import com.google.android.gms.internal.ads.zzdb;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzdo;
import com.google.android.gms.internal.ads.zzdv;
import com.google.android.gms.internal.ads.zzfs;
import com.google.android.gms.internal.ads.zzfyw;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzhr;
import com.google.android.gms.internal.ads.zzhv;
import com.google.android.gms.internal.ads.zzhw;
import com.google.android.gms.internal.ads.zzhx;
import com.google.android.gms.internal.ads.zzif;
import com.google.android.gms.internal.ads.zzix;
import com.google.android.gms.internal.ads.zziy;
import com.google.android.gms.internal.ads.zzjh;
import com.google.android.gms.internal.ads.zzmt;
import com.google.android.gms.internal.ads.zzmy;
import com.google.android.gms.internal.ads.zzmz;
import com.google.android.gms.internal.ads.zzna;
import com.google.android.gms.internal.ads.zzo;
import com.google.android.gms.internal.ads.zzpd;
import com.google.android.gms.internal.ads.zzpe;
import com.google.android.gms.internal.ads.zzpg;
import com.google.android.gms.internal.ads.zzph;
import com.google.android.gms.internal.ads.zzqr;
import com.google.android.gms.internal.ads.zzqu;
import com.google.android.gms.internal.ads.zzsk;
import com.google.android.gms.internal.ads.zzsm;
import com.google.android.gms.internal.ads.zzsw;
import com.google.android.gms.internal.ads.zzto;
import com.google.android.gms.internal.ads.zztt;
import com.google.android.gms.internal.ads.zzvf;
import com.google.android.gms.internal.ads.zzvk;
import com.google.android.gms.internal.ads.zzvo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;

public final class zzpf
implements zzna,
zzpg {
    private final Context zza;
    private final zzph zzb;
    private final PlaybackSession zzc;
    private final long zzd;
    private final zzdb zze;
    private final zzcz zzf;
    private final HashMap zzg;
    private final HashMap zzh;
    private String zzi;
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private zzcj zzn;
    private zzpe zzo;
    private zzpe zzp;
    private zzpe zzq;
    private zzan zzr;
    private zzan zzs;
    private zzan zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;

    private zzpf(Context object, PlaybackSession object2) {
        long l2;
        object = object.getApplicationContext();
        this.zza = object;
        this.zzc = object2;
        this.zze = object;
        super();
        this.zzf = object;
        super();
        this.zzh = object;
        super();
        this.zzg = object;
        this.zzd = l2 = SystemClock.elapsedRealtime();
        this.zzl = 0;
        this.zzm = 0;
        object2 = zzpd.zza;
        super((zzfyw)object2);
        this.zzb = object;
        object.zzh(this);
    }

    public static zzpf zzb(Context context) {
        MediaMetricsManager mediaMetricsManager = sm1_0.a(context.getSystemService("media_metrics"));
        if (mediaMetricsManager == null) {
            return null;
        }
        mediaMetricsManager = CM1.a(mediaMetricsManager);
        zzpf zzpf2 = new zzpf(context, (PlaybackSession)mediaMetricsManager);
        return zzpf2;
    }

    private static int zzr(int n3) {
        n3 = zzgd.zzj(n3);
        switch (n3) {
            default: {
                return 27;
            }
            case 6005: {
                return 26;
            }
            case 6004: {
                return 25;
            }
            case 6003: {
                return 28;
            }
            case 6002: 
        }
        return 24;
    }

    private final void zzs() {
        int n3;
        Object object = this.zzj;
        if (object != null && (n3 = this.zzz) != 0) {
            long l2;
            int n4;
            n3 = this.zzy;
            J60.a((PlaybackMetrics.Builder)object, n3);
            object = this.zzj;
            n3 = this.zzw;
            K60.a((PlaybackMetrics.Builder)object, n3);
            object = this.zzj;
            n3 = this.zzx;
            L60.b((PlaybackMetrics.Builder)object, n3);
            object = this.zzg;
            String string2 = this.zzi;
            object = (Long)((HashMap)object).get(string2);
            string2 = this.zzj;
            long l3 = 0L;
            long l4 = object == null ? l3 : (Long)object;
            N60.b((PlaybackMetrics.Builder)string2, l4);
            object = this.zzh;
            string2 = this.zzi;
            object = (Long)((HashMap)object).get(string2);
            string2 = this.zzj;
            l4 = object == null ? l3 : (Long)object;
            O60.b((PlaybackMetrics.Builder)string2, l4);
            string2 = this.zzj;
            if (object != null && (n4 = (l2 = (l4 = ((Long)object).longValue()) - l3) == 0L ? 0 : (l2 < 0L ? -1 : 1)) > 0) {
                n4 = 1;
            } else {
                n4 = 0;
                object = null;
            }
            P60.b((PlaybackMetrics.Builder)string2, n4);
            object = this.zzc;
            string2 = FM1.a(this.zzj);
            GM1.a((PlaybackSession)object, (PlaybackMetrics)string2);
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long l2, zzan zzan2, int n3) {
        int n4;
        zzan zzan3 = this.zzs;
        n3 = (int)(zzgd.zzG(zzan3, zzan2) ? 1 : 0);
        if (n3 != 0) {
            return;
        }
        zzan3 = this.zzs;
        if (zzan3 == null) {
            n3 = 1;
            n4 = 1;
        } else {
            n3 = 0;
            zzan3 = null;
            n4 = 0;
        }
        this.zzs = zzan2;
        this.zzx(0, l2, zzan2, n4);
    }

    private final void zzu(long l2, zzan zzan2, int n3) {
        int n4;
        zzan zzan3 = this.zzt;
        n3 = (int)(zzgd.zzG(zzan3, zzan2) ? 1 : 0);
        if (n3 != 0) {
            return;
        }
        zzan3 = this.zzt;
        if (zzan3 == null) {
            n3 = 1;
            n4 = 1;
        } else {
            n3 = 0;
            zzan3 = null;
            n4 = 0;
        }
        this.zzt = zzan2;
        this.zzx(2, l2, zzan2, n4);
    }

    private final void zzv(zzdc object, zzvo object2) {
        int n3;
        int n4;
        PlaybackMetrics.Builder builder = this.zzj;
        if (object2 != null && (n4 = ((zzdc)object).zza(object2 = ((zzvo)object2).zza)) != (n3 = -1)) {
            int n7;
            Object object3 = this.zzf;
            int n8 = 0;
            ((zzdc)object).zzd(n4, (zzcz)object3, false);
            object2 = this.zzf;
            object3 = this.zze;
            n4 = ((zzcz)object2).zzd;
            long l2 = 0L;
            ((zzdc)object).zze(n4, (zzdb)object3, l2);
            object = this.zze.zze.zzd;
            n4 = 2;
            n3 = 1;
            if (object != null) {
                object = ((zzbn)object).zzb;
                n7 = zzgd.zzn((Uri)object);
                n8 = n7 != 0 ? (n7 != n3 ? (n7 != n4 ? 1 : 4) : 5) : 3;
            }
            OM1.a(builder, n8);
            object = this.zze;
            long l3 = ((zzdb)object).zzo;
            long l4 = -9223372036854775807L;
            long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
            if (l7 != false && (n8 = (int)(((zzdb)object).zzm ? 1 : 0)) == 0 && (n8 = (int)(((zzdb)object).zzj ? 1 : 0)) == 0 && (n7 = (int)(((zzdb)object).zzb() ? 1 : 0)) == 0) {
                object = this.zze;
                l3 = zzgd.zzu(((zzdb)object).zzo);
                PM1.a(builder, l3);
            }
            if (n3 != (n7 = (int)(((zzdb)(object = this.zze)).zzb() ? 1 : 0))) {
                n4 = 1;
            }
            QM1.a(builder, n4);
            this.zzz = n3;
        }
    }

    private final void zzw(long l2, zzan zzan2, int n3) {
        int n4;
        zzan zzan3 = this.zzr;
        n3 = (int)(zzgd.zzG(zzan3, zzan2) ? 1 : 0);
        if (n3 != 0) {
            return;
        }
        zzan3 = this.zzr;
        if (zzan3 == null) {
            n3 = 1;
            n4 = 1;
        } else {
            n3 = 0;
            zzan3 = null;
            n4 = 0;
        }
        this.zzr = zzan2;
        this.zzx(1, l2, zzan2, n4);
    }

    private final void zzx(int n3, long l2, zzan zzan2, int n4) {
        TrackChangeEvent.Builder builder = KM1.a(n3);
        long l3 = this.zzd;
        builder = Q60.b(builder, l2 -= l3);
        int n7 = 1;
        if (zzan2 != null) {
            float f5;
            float f6;
            float f7;
            int n8;
            Yz.b(builder);
            int n10 = 2;
            float f8 = 2.8E-45f;
            n4 = n4 != n7 ? 1 : 2;
            km1_0.a(builder, n4);
            Object object = zzan2.zzm;
            if (object != null) {
                lm1_0.a(builder, (String)object);
            }
            if ((object = zzan2.zzn) != null) {
                mm1_0.a(builder, (String)object);
            }
            if ((object = zzan2.zzk) != null) {
                nm1_0.a(builder, (String)object);
            }
            if ((n4 = zzan2.zzj) != (n8 = -1)) {
                om1_0.a(builder, n4);
            }
            if ((n4 = zzan2.zzs) != n8) {
                pm1_0.a(builder, n4);
            }
            if ((n4 = zzan2.zzt) != n8) {
                qm1_0.a(builder, n4);
            }
            if ((n4 = zzan2.zzA) != n8) {
                rm1_0.a(builder, n4);
            }
            if ((n4 = zzan2.zzB) != n8) {
                NM1.a(builder, n4);
            }
            if ((object = zzan2.zze) != null) {
                Object object2;
                int n14 = zzgd.zza;
                String string2 = "-";
                object = object.split(string2, n8);
                n8 = 0;
                String string3 = object[0];
                n14 = ((String[])object).length;
                if (n14 >= n10) {
                    object2 = object[n7];
                } else {
                    n10 = 0;
                    f8 = 0.0f;
                    object2 = null;
                }
                object2 = Pair.create((Object)string3, (Object)object2);
                object = (String)((Pair)object2).first;
                SM1.a(builder, (String)object);
                object2 = ((Pair)object2).second;
                if (object2 != null) {
                    object2 = (String)object2;
                    TM1.a(builder, (String)object2);
                }
            }
            if ((f7 = (f6 = (f8 = zzan2.zzu) - (f5 = -1.0f)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) != false) {
                UM1.a(builder, f8);
            }
        } else {
            VM1.a(builder);
        }
        this.zzz = n7;
        PlaybackSession playbackSession = this.zzc;
        builder = WM1.a(builder);
        xz_0.b(playbackSession, (TrackChangeEvent)builder);
    }

    private final boolean zzy(zzpe object) {
        if (object != null) {
            Object object2 = this.zzb;
            object = ((zzpe)object).zzc;
            boolean bl2 = ((String)object).equals(object2 = object2.zze());
            if (bl2) {
                return true;
            }
        }
        return false;
    }

    public final LogSessionId zza() {
        return JM1.a(this.zzc);
    }

    public final void zzc(zzmy object, String object2) {
        boolean bl2;
        zzvo zzvo2 = ((zzmy)object).zzd;
        if (zzvo2 != null && (bl2 = zzvo2.zzb())) {
            return;
        }
        this.zzs();
        this.zzi = object2;
        object2 = al3_1.a(Fk0.b(RM1.a()));
        this.zzj = object2;
        object2 = ((zzmy)object).zzb;
        object = ((zzmy)object).zzd;
        this.zzv((zzdc)object2, (zzvo)object);
    }

    public final void zzd(zzmy object, String string2, boolean bl2) {
        boolean bl3;
        object = ((zzmy)object).zzd;
        if ((object == null || !(bl3 = ((zzvo)object).zzb())) && (bl3 = string2.equals(object = this.zzi))) {
            this.zzs();
        }
        this.zzg.remove(string2);
        this.zzh.remove(string2);
    }

    public final /* synthetic */ void zze(zzmy zzmy2, zzan zzan2, zziy zziy2) {
    }

    public final void zzf(zzmy object, int n3, long l2, long l3) {
        Object object2 = ((zzmy)object).zzd;
        if (object2 != null) {
            Object object3 = this.zzb;
            object = ((zzmy)object).zzb;
            HashMap hashMap = this.zzh;
            object = object3.zzf((zzdc)object, (zzvo)object2);
            object2 = (Long)hashMap.get(object);
            object3 = (Long)this.zzg.get(object);
            hashMap = this.zzh;
            long l4 = 0L;
            long l7 = object2 == null ? l4 : (Long)object2;
            Serializable serializable = Long.valueOf(l7 += l2);
            hashMap.put(object, serializable);
            serializable = this.zzg;
            if (object3 != null) {
                l4 = (Long)object3;
            }
            long l8 = n3;
            Long l12 = l4 += l8;
            ((HashMap)serializable).put(object, l12);
        }
    }

    public final void zzg(zzmy object, zzvk zzvk2) {
        zzpe zzpe2;
        block3: {
            block4: {
                block5: {
                    block2: {
                        zzvo zzvo2 = ((zzmy)object).zzd;
                        if (zzvo2 == null) break block2;
                        zzan zzan2 = zzvk2.zzb;
                        zzan2.getClass();
                        zzph zzph2 = this.zzb;
                        object = ((zzmy)object).zzb;
                        object = zzph2.zzf((zzdc)object, zzvo2);
                        zzvo2 = null;
                        zzpe2 = new zzpe(zzan2, 0, (String)object);
                        int n3 = zzvk2.zza;
                        if (n3 == 0) break block3;
                        int n4 = 1;
                        if (n3 == n4) break block4;
                        n4 = 2;
                        if (n3 == n4) break block3;
                        n4 = 3;
                        if (n3 == n4) break block5;
                    }
                    return;
                }
                this.zzq = zzpe2;
                return;
            }
            this.zzp = zzpe2;
            return;
        }
        this.zzo = zzpe2;
    }

    public final /* synthetic */ void zzh(zzmy zzmy2, int n3, long l2) {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void zzi(zzct var1_1, zzmz var2_2) {
        block74: {
            block98: {
                block99: {
                    block75: {
                        block73: {
                            block97: {
                                block96: {
                                    block95: {
                                        block94: {
                                            block93: {
                                                block76: {
                                                    block92: {
                                                        block91: {
                                                            block90: {
                                                                block89: {
                                                                    block79: {
                                                                        block87: {
                                                                            block88: {
                                                                                block81: {
                                                                                    block86: {
                                                                                        block85: {
                                                                                            block84: {
                                                                                                block83: {
                                                                                                    block82: {
                                                                                                        block80: {
                                                                                                            block78: {
                                                                                                                block77: {
                                                                                                                    var3_3 = this;
                                                                                                                    var4_4 = var2_2;
                                                                                                                    var5_5 = 1;
                                                                                                                    var6_6 = var2_2.zzb();
                                                                                                                    if (var6_6 == 0) break block74;
                                                                                                                    var6_6 = 0;
                                                                                                                    var7_7 = null;
                                                                                                                    var8_8 = 0;
                                                                                                                    while (true) {
                                                                                                                        var9_9 = var2_2.zzb();
                                                                                                                        var10_10 = 11;
                                                                                                                        if (var8_8 >= var9_9) break;
                                                                                                                        var9_9 = var4_4.zza(var8_8);
                                                                                                                        var11_11 = var4_4.zzc(var9_9);
                                                                                                                        if (var9_9 == 0) {
                                                                                                                            var12_12 = var3_3.zzb;
                                                                                                                            var12_12.zzk((zzmy)var11_11);
                                                                                                                        } else if (var9_9 == var10_10) {
                                                                                                                            var12_12 = var3_3.zzb;
                                                                                                                            var10_10 = var3_3.zzk;
                                                                                                                            var12_12.zzj((zzmy)var11_11, var10_10);
                                                                                                                        } else {
                                                                                                                            var12_12 = var3_3.zzb;
                                                                                                                            var12_12.zzi((zzmy)var11_11);
                                                                                                                        }
                                                                                                                        var8_8 += var5_5;
                                                                                                                    }
                                                                                                                    var13_13 = SystemClock.elapsedRealtime();
                                                                                                                    var15_14 = var4_4.zzd(0);
                                                                                                                    if (var15_14 != 0) {
                                                                                                                        var11_11 = var4_4.zzc(0);
                                                                                                                        var16_15 /* !! */  = var3_3.zzj;
                                                                                                                        if (var16_15 /* !! */  != null) {
                                                                                                                            var16_15 /* !! */  = var11_11.zzb;
                                                                                                                            var11_11 = var11_11.zzd;
                                                                                                                            var3_3.zzv((zzdc)var16_15 /* !! */ , (zzvo)var11_11);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    var15_14 = 2;
                                                                                                                    var17_16 = var4_4.zzd(var15_14);
                                                                                                                    var18_17 = 3;
                                                                                                                    if (var17_16 != 0 && (var16_15 /* !! */  = var3_3.zzj) != null) {
                                                                                                                        block71: {
                                                                                                                            var16_15 /* !! */  = var1_1.zzo().zza();
                                                                                                                            var19_18 = var16_15 /* !! */ .size();
                                                                                                                            var20_19 = 0;
                                                                                                                            var21_20 /* !! */  = null;
                                                                                                                            while (var20_19 < var19_18) {
                                                                                                                                var22_21 = (zzdo)var16_15 /* !! */ .get(var20_19);
                                                                                                                                var23_22 = 0;
                                                                                                                                while (true) {
                                                                                                                                    var10_10 = var22_21.zzb;
                                                                                                                                    var24_23 = var20_19 + 1;
                                                                                                                                    if (var23_22 >= var10_10) break;
                                                                                                                                    var10_10 = (int)var22_21.zzd(var23_22);
                                                                                                                                    if (var10_10 == 0 || (var25_24 = var22_21.zzb((int)var23_22).zzq) == null) {
                                                                                                                                        var23_22 += var5_5;
                                                                                                                                        continue;
                                                                                                                                    }
                                                                                                                                    break block71;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                var20_19 = var24_23;
                                                                                                                                var10_10 = 11;
                                                                                                                            }
                                                                                                                            var10_10 = 0;
                                                                                                                            var25_24 = null;
                                                                                                                        }
                                                                                                                        if (var25_24 != null) {
                                                                                                                            block72: {
                                                                                                                                var16_15 /* !! */  = var3_3.zzj;
                                                                                                                                var19_18 = zzgd.zza;
                                                                                                                                var26_25 = null;
                                                                                                                                for (var19_18 = 0; var19_18 < (var20_19 = var25_24.zzb); var19_18 += var5_5) {
                                                                                                                                    var21_20 /* !! */  = var25_24.zza((int)var19_18).zza;
                                                                                                                                    var22_21 = com.google.android.gms.internal.ads.zzo.zzd;
                                                                                                                                    var27_26 = var21_20 /* !! */ .equals(var22_21);
                                                                                                                                    if (var27_26) {
                                                                                                                                        var10_10 = 3;
                                                                                                                                    } else {
                                                                                                                                        var22_21 = com.google.android.gms.internal.ads.zzo.zze;
                                                                                                                                        var27_26 = var21_20 /* !! */ .equals(var22_21);
                                                                                                                                        if (var27_26) {
                                                                                                                                            var10_10 = 2;
                                                                                                                                        } else {
                                                                                                                                            var22_21 = com.google.android.gms.internal.ads.zzo.zzc;
                                                                                                                                            var20_19 = (int)var21_20 /* !! */ .equals(var22_21);
                                                                                                                                            if (var20_19 == 0) continue;
                                                                                                                                            var10_10 = 6;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    break block72;
                                                                                                                                }
                                                                                                                                var10_10 = 1;
                                                                                                                            }
                                                                                                                            ym1_0.a(var16_15 /* !! */ , var10_10);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    if ((var10_10 = (int)var4_4.zzd(1011)) != 0) {
                                                                                                                        var3_3.zzy = var10_10 = var3_3.zzy + var5_5;
                                                                                                                    }
                                                                                                                    var25_24 = var3_3.zzn;
                                                                                                                    var24_23 = 9;
                                                                                                                    if (var25_24 == null) break block75;
                                                                                                                    var16_15 /* !! */  = var3_3.zza;
                                                                                                                    var28_27 = var25_24.zzb;
                                                                                                                    var19_18 = 1001;
                                                                                                                    if (var28_27 == var19_18) {
                                                                                                                        var17_16 = 20;
lbl97:
                                                                                                                        // 21 sources

                                                                                                                        while (true) {
                                                                                                                            var28_27 = 0;
                                                                                                                            var29_28 = null;
                                                                                                                            break block73;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    var29_28 = var25_24;
                                                                                                                    var29_28 = (zzjh)var25_24;
                                                                                                                    var19_18 = var29_28.zze;
                                                                                                                    if (var19_18 == var5_5) {
                                                                                                                        var19_18 = 1;
                                                                                                                    } else {
                                                                                                                        var19_18 = 0;
                                                                                                                        var26_25 = null;
                                                                                                                    }
                                                                                                                    var28_27 = var29_28.zzi;
                                                                                                                    var21_20 /* !! */  = var25_24.getCause();
                                                                                                                    var21_20 /* !! */ .getClass();
                                                                                                                    var27_26 = var21_20 /* !! */  instanceof IOException;
                                                                                                                    var23_22 = 23;
                                                                                                                    if (!var27_26) break block76;
                                                                                                                    var28_27 = var21_20 /* !! */  instanceof zzhx;
                                                                                                                    if (var28_27 == 0) break block77;
                                                                                                                    var21_20 /* !! */  = (zzhx)var21_20 /* !! */ ;
                                                                                                                    var28_27 = var21_20 /* !! */ .zzd;
                                                                                                                    var17_16 = 5;
                                                                                                                    break block73;
                                                                                                                }
                                                                                                                var28_27 = var21_20 /* !! */  instanceof zzhw;
                                                                                                                if (var28_27 == 0 && (var28_27 = var21_20 /* !! */  instanceof zzch) == 0) break block78;
                                                                                                                var17_16 = 11;
                                                                                                                ** GOTO lbl97
                                                                                                            }
                                                                                                            var28_27 = var21_20 /* !! */  instanceof zzhv;
                                                                                                            if (var28_27 != 0 || (var19_18 = var21_20 /* !! */  instanceof zzif) != 0) break block79;
                                                                                                            var17_16 = var25_24.zzb;
                                                                                                            var28_27 = 1002;
                                                                                                            if (var17_16 != var28_27) break block80;
                                                                                                            var17_16 = 21;
                                                                                                            ** GOTO lbl97
                                                                                                        }
                                                                                                        var17_16 = var21_20 /* !! */  instanceof zzsm;
                                                                                                        if (var17_16 == 0) break block81;
                                                                                                        var16_15 /* !! */  = ((Throwable)var21_20 /* !! */ ).getCause();
                                                                                                        var16_15 /* !! */ .getClass();
                                                                                                        var28_27 = zzgd.zza;
                                                                                                        var28_27 = var16_15 /* !! */  instanceof MediaDrm.MediaDrmStateException;
                                                                                                        if (var28_27 != 0) {
                                                                                                            var16_15 /* !! */  = ((MediaDrm.MediaDrmStateException)var16_15 /* !! */ ).getDiagnosticInfo();
                                                                                                            var17_16 = zzgd.zzk((String)var16_15 /* !! */ );
                                                                                                            var28_27 = zzpf.zzr(var17_16);
lbl147:
                                                                                                            // 2 sources

                                                                                                            while (true) {
                                                                                                                var30_29 = var28_27;
                                                                                                                var28_27 = var17_16;
                                                                                                                var17_16 = var30_29;
                                                                                                                break block73;
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        var28_27 = zzgd.zza;
                                                                                                        if (var28_27 < var23_22 || (var28_27 = (int)gl0.b((Throwable)var16_15 /* !! */ )) == 0) break block82;
                                                                                                        var17_16 = 27;
                                                                                                        ** GOTO lbl97
                                                                                                    }
                                                                                                    var28_27 = var16_15 /* !! */  instanceof NotProvisionedException;
                                                                                                    if (var28_27 == 0) break block83;
                                                                                                    var17_16 = 24;
                                                                                                    ** GOTO lbl97
                                                                                                }
                                                                                                var28_27 = var16_15 /* !! */  instanceof DeniedByServerException;
                                                                                                if (var28_27 == 0) break block84;
                                                                                                var17_16 = 29;
                                                                                                ** GOTO lbl97
                                                                                            }
                                                                                            var28_27 = var16_15 /* !! */  instanceof zzsw;
                                                                                            if (var28_27 == 0) break block85;
lbl169:
                                                                                            // 2 sources

                                                                                            while (true) {
                                                                                                var17_16 = 23;
                                                                                                ** GOTO lbl97
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        var17_16 = var16_15 /* !! */  instanceof zzsk;
                                                                                        if (var17_16 == 0) break block86;
                                                                                        var17_16 = 28;
                                                                                        ** GOTO lbl97
                                                                                    }
                                                                                    var17_16 = 30;
                                                                                    ** GOTO lbl97
                                                                                }
                                                                                var17_16 = var21_20 /* !! */  instanceof zzhr;
                                                                                if (var17_16 == 0 || (var17_16 = (var16_15 /* !! */  = ((Throwable)var21_20 /* !! */ ).getCause()) instanceof FileNotFoundException) == 0) break block87;
                                                                                var16_15 /* !! */  = ((Throwable)var21_20 /* !! */ ).getCause();
                                                                                var16_15 /* !! */ .getClass();
                                                                                var16_15 /* !! */  = var16_15 /* !! */ .getCause();
                                                                                var28_27 = zzgd.zza;
                                                                                var28_27 = var16_15 /* !! */  instanceof ErrnoException;
                                                                                var19_18 = 31;
                                                                                if (var28_27 == 0) break block88;
                                                                                var16_15 /* !! */  = (ErrnoException)var16_15 /* !! */ ;
                                                                                var17_16 = var16_15 /* !! */ .errno;
                                                                                var28_27 = OsConstants.EACCES;
                                                                                if (var17_16 != var28_27) break block88;
                                                                                var17_16 = 32;
                                                                                ** GOTO lbl97
                                                                            }
                                                                            var17_16 = 31;
                                                                            ** GOTO lbl97
                                                                        }
                                                                        var17_16 = 9;
                                                                        ** GOTO lbl97
                                                                    }
                                                                    var17_16 = (var16_15 /* !! */  = zzfs.zzb((Context)var16_15 /* !! */ )).zza();
                                                                    if (var17_16 != var5_5) break block89;
                                                                    var17_16 = 3;
                                                                    ** GOTO lbl97
                                                                }
                                                                var16_15 /* !! */  = ((Throwable)var21_20 /* !! */ ).getCause();
                                                                var19_18 = var16_15 /* !! */  instanceof UnknownHostException;
                                                                if (var19_18 == 0) break block90;
                                                                var17_16 = 6;
                                                                ** GOTO lbl97
                                                            }
                                                            var17_16 = var16_15 /* !! */  instanceof SocketTimeoutException;
                                                            if (var17_16 == 0) break block91;
                                                            var17_16 = 7;
                                                            ** GOTO lbl97
                                                        }
                                                        if (var28_27 == 0) break block92;
                                                        var21_20 /* !! */  = (zzhv)var21_20 /* !! */ ;
                                                        var17_16 = var21_20 /* !! */ .zzc;
                                                        if (var17_16 != var5_5) break block92;
                                                        var17_16 = 4;
                                                        ** GOTO lbl97
                                                    }
                                                    var17_16 = 8;
                                                    ** GOTO lbl97
                                                }
                                                if (var19_18 == 0) break block93;
                                                var17_16 = 35;
                                                if (var28_27 == 0 || var28_27 == var5_5) ** GOTO lbl97
                                            }
                                            if (var19_18 == 0 || var28_27 != var18_17) break block94;
                                            var17_16 = 15;
                                            ** GOTO lbl97
                                        }
                                        ** while (var19_18 != 0 && var28_27 == var15_14)
lbl239:
                                        // 1 sources

                                        var17_16 = var21_20 /* !! */  instanceof zztt;
                                        if (var17_16 == 0) break block95;
                                        var21_20 /* !! */  = (zztt)var21_20 /* !! */ ;
                                        var16_15 /* !! */  = var21_20 /* !! */ .zzd;
                                        var28_27 = zzgd.zzk((String)var16_15 /* !! */ );
                                        var17_16 = 13;
                                        break block73;
                                    }
                                    var17_16 = var21_20 /* !! */  instanceof zzto;
                                    var28_27 = 14;
                                    if (var17_16 == 0) break block96;
                                    var21_20 /* !! */  = (zzto)var21_20 /* !! */ ;
                                    var16_15 /* !! */  = var21_20 /* !! */ .zzb;
                                    var28_27 = zzgd.zzk((String)var16_15 /* !! */ );
                                    var17_16 = 14;
                                    break block73;
                                }
                                var17_16 = var21_20 /* !! */  instanceof OutOfMemoryError;
                                if (var17_16 == 0) break block97;
                                var17_16 = 14;
                                ** GOTO lbl97
                            }
                            var17_16 = var21_20 /* !! */  instanceof zzqr;
                            if (var17_16 != 0) {
                                var21_20 /* !! */  = (zzqr)var21_20 /* !! */ ;
                                var28_27 = var21_20 /* !! */ .zza;
                                var17_16 = 17;
                            } else {
                                var17_16 = var21_20 /* !! */  instanceof zzqu;
                                if (var17_16 != 0) {
                                    var21_20 /* !! */  = (zzqu)var21_20 /* !! */ ;
                                    var28_27 = var21_20 /* !! */ .zza;
                                    var17_16 = 18;
                                } else {
                                    var17_16 = var21_20 /* !! */  instanceof MediaCodec.CryptoException;
                                    if (var17_16 != 0) {
                                        var21_20 /* !! */  = (MediaCodec.CryptoException)var21_20 /* !! */ ;
                                        var17_16 = var21_20 /* !! */ .getErrorCode();
                                        var28_27 = zzpf.zzr(var17_16);
                                        ** continue;
                                    }
                                    var17_16 = 22;
                                    ** continue;
                                }
                            }
                        }
                        var26_25 = var3_3.zzc;
                        var21_20 /* !! */  = MM1.a();
                        var31_30 = var3_3.zzd;
                        var31_30 = var13_13 - var31_30;
                        var21_20 /* !! */  = AM1.a(var21_20 /* !! */ , var31_30);
                        var16_15 /* !! */  = DM1.a(BM1.a(var21_20 /* !! */ , var17_16), var28_27);
                        var25_24 = H60.a(EM1.a((PlaybackErrorEvent.Builder)var16_15 /* !! */ , (Exception)var25_24));
                        I60.a(var26_25, (PlaybackErrorEvent)var25_24);
                        var3_3.zzz = var5_5;
                        var3_3.zzn = null;
                    }
                    var10_10 = (int)var4_4.zzd(var15_14);
                    if (var10_10 == 0) break block98;
                    var25_24 = var1_1.zzo();
                    var17_16 = (int)var25_24.zzb(var15_14);
                    var28_27 = (int)var25_24.zzb(var5_5);
                    var10_10 = (int)var25_24.zzb(var18_17);
                    if (var17_16 != 0 || var28_27 != 0) break block99;
                    if (var10_10 == 0) break block98;
                    var10_10 = 1;
                }
                if (var17_16 == 0) {
                    var3_3.zzw(var13_13, null, 0);
                }
                if (var28_27 == 0) {
                    var3_3.zzt(var13_13, null, 0);
                }
                if (var10_10 == 0) {
                    var3_3.zzu(var13_13, null, 0);
                }
            }
            if ((var10_10 = (int)var3_3.zzy((zzpe)(var25_24 = var3_3.zzo))) != 0) {
                var25_24 = var3_3.zzo.zza;
                var17_16 = var25_24.zzt;
                var28_27 = -1;
                if (var17_16 != var28_27) {
                    var3_3.zzw(var13_13, (zzan)var25_24, 0);
                    var3_3.zzo = null;
                }
            }
            if ((var10_10 = (int)var3_3.zzy((zzpe)(var25_24 = var3_3.zzp))) != 0) {
                var25_24 = var3_3.zzp.zza;
                var3_3.zzt(var13_13, (zzan)var25_24, 0);
                var3_3.zzp = null;
            }
            if ((var10_10 = (int)var3_3.zzy((zzpe)(var25_24 = var3_3.zzq))) != 0) {
                var25_24 = var3_3.zzq.zza;
                var3_3.zzu(var13_13, (zzan)var25_24, 0);
                var3_3.zzq = null;
            }
            var25_24 = zzfs.zzb(var3_3.zza);
            var10_10 = var25_24.zza();
            switch (var10_10) {
                default: {
                    var19_18 = 1;
                    break;
                }
                case 10: {
                    var19_18 = 7;
                    break;
                }
                case 9: {
                    var19_18 = 8;
                    break;
                }
                case 7: {
                    var19_18 = 3;
                    break;
                }
                case 5: {
                    var19_18 = 6;
                    break;
                }
                case 4: {
                    var19_18 = 5;
                    break;
                }
                case 3: {
                    var19_18 = 4;
                    break;
                }
                case 2: {
                    var19_18 = 2;
                    break;
                }
                case 1: {
                    var19_18 = 9;
                    break;
                }
                case 0: {
                    var19_18 = 0;
                    var26_25 = null;
                }
            }
            var10_10 = var3_3.zzm;
            if (var19_18 != var10_10) {
                var3_3.zzm = var19_18;
                var25_24 = var3_3.zzc;
                var16_15 /* !! */  = tm1_0.a(LM1.a(), var19_18);
                var33_31 = var3_3.zzd;
                var33_31 = var13_13 - var33_31;
                var16_15 /* !! */  = vm1_0.a(um1_0.a((NetworkEvent.Builder)var16_15 /* !! */ , var33_31));
                wm1_0.a((PlaybackSession)var25_24, (NetworkEvent)var16_15 /* !! */ );
            }
            if ((var10_10 = var1_1.zzf()) != var15_14) {
                var3_3.zzu = false;
            }
            var25_24 = var1_1;
            var25_24 = ((zzmt)var1_1).zzC();
            var17_16 = 10;
            if (var25_24 == null) {
                var3_3.zzv = false;
            } else {
                var6_6 = (int)var4_4.zzd(var17_16);
                if (var6_6 != 0) {
                    var3_3.zzv = var5_5;
                }
            }
            var6_6 = var1_1.zzf();
            var10_10 = (int)var3_3.zzu;
            if (var10_10 != 0) {
                var10_10 = 5;
            } else {
                var10_10 = (int)var3_3.zzv;
                if (var10_10 != 0) {
                    var10_10 = 13;
                } else {
                    var10_10 = 4;
                    if (var6_6 == var10_10) {
                        var10_10 = 11;
                    } else {
                        var28_27 = 12;
                        if (var6_6 == var15_14) {
                            var6_6 = var3_3.zzl;
                            var10_10 = var6_6 == 0 || var6_6 == var15_14 || var6_6 == var28_27 ? 2 : ((var6_6 = (int)var1_1.zzv()) == 0 ? 7 : ((var6_6 = var1_1.zzg()) != 0 ? 10 : 6));
                        } else if (var6_6 == var18_17) {
                            var6_6 = (int)var1_1.zzv();
                            if (var6_6 != 0) {
                                var6_6 = var1_1.zzg();
                                var10_10 = var6_6 != 0 ? 9 : 3;
                            }
                        } else {
                            var10_10 = var6_6 == var5_5 && (var6_6 = var3_3.zzl) != 0 ? 12 : var3_3.zzl;
                        }
                    }
                }
            }
            var6_6 = var3_3.zzl;
            if (var6_6 != var10_10) {
                var3_3.zzl = var10_10;
                var3_3.zzz = var5_5;
                var35_32 = var3_3.zzc;
                var7_7 = wz_0.a();
                var10_10 = var3_3.zzl;
                var7_7 = HM1.a((PlaybackStateEvent.Builder)var7_7, var10_10);
                var36_33 = var3_3.zzd;
                var7_7 = Xk0.a(Wk0.a((PlaybackStateEvent.Builder)var7_7, var13_13 -= var36_33));
                IM1.a(var35_32, (PlaybackStateEvent)var7_7);
            }
            if ((var6_6 = (int)var4_4.zzd(var5_5 = 1028)) != 0) {
                var7_7 = var3_3.zzb;
                var4_4 = var4_4.zzc(var5_5);
                var7_7.zzg((zzmy)var4_4);
            }
        }
    }

    public final void zzj(zzmy zzmy2, zzvf zzvf2, zzvk zzvk2, IOException iOException, boolean bl2) {
    }

    public final /* synthetic */ void zzk(zzmy zzmy2, int n3) {
    }

    public final void zzl(zzmy zzmy2, zzcj zzcj2) {
        this.zzn = zzcj2;
    }

    public final void zzm(zzmy zzmy2, zzcs zzcs2, zzcs zzcs3, int n3) {
        int n4 = 1;
        if (n3 == n4) {
            this.zzu = n4;
            n3 = 1;
        }
        this.zzk = n3;
    }

    public final /* synthetic */ void zzn(zzmy zzmy2, Object object, long l2) {
    }

    public final void zzo(zzmy zzmy2, zzix zzix2) {
        int n3 = this.zzw;
        int n4 = zzix2.zzg;
        this.zzw = n3 += n4;
        n3 = this.zzx;
        int n7 = zzix2.zze;
        this.zzx = n3 += n7;
    }

    public final /* synthetic */ void zzp(zzmy zzmy2, zzan zzan2, zziy zziy2) {
    }

    public final void zzq(zzmy object, zzdv object2) {
        object = this.zzo;
        if (object != null) {
            Object object3 = ((zzpe)object).zza;
            int n3 = ((zzan)object3).zzt;
            int n4 = -1;
            if (n3 == n4) {
                object3 = ((zzan)object3).zzb();
                n3 = ((zzdv)object2).zzc;
                ((zzal)object3).zzac(n3);
                int n7 = ((zzdv)object2).zzd;
                ((zzal)object3).zzI(n7);
                object2 = ((zzal)object3).zzad();
                object = ((zzpe)object).zzc;
                n3 = 0;
                this.zzo = object3 = new zzpe((zzan)object2, 0, (String)object);
            }
        }
    }
}

