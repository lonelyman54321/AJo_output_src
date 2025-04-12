/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaCrypto
 *  android.media.MediaFormat
 *  android.os.Handler
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzcd;
import com.google.android.gms.internal.ads.zzcg;
import com.google.android.gms.internal.ads.zzcl;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfn;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzin;
import com.google.android.gms.internal.ads.zzix;
import com.google.android.gms.internal.ads.zziy;
import com.google.android.gms.internal.ads.zzk;
import com.google.android.gms.internal.ads.zzl;
import com.google.android.gms.internal.ads.zzlj;
import com.google.android.gms.internal.ads.zzlp;
import com.google.android.gms.internal.ads.zzmm;
import com.google.android.gms.internal.ads.zzpj;
import com.google.android.gms.internal.ads.zzqa;
import com.google.android.gms.internal.ads.zzqn;
import com.google.android.gms.internal.ads.zzqo;
import com.google.android.gms.internal.ads.zzqq;
import com.google.android.gms.internal.ads.zzqr;
import com.google.android.gms.internal.ads.zzqs;
import com.google.android.gms.internal.ads.zzqu;
import com.google.android.gms.internal.ads.zzqv;
import com.google.android.gms.internal.ads.zzsc;
import com.google.android.gms.internal.ads.zztk;
import com.google.android.gms.internal.ads.zztl;
import com.google.android.gms.internal.ads.zztm;
import com.google.android.gms.internal.ads.zztp;
import com.google.android.gms.internal.ads.zztv;
import com.google.android.gms.internal.ads.zztx;
import com.google.android.gms.internal.ads.zzuj;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

public final class zzsf
extends zztv
implements zzlp {
    private final Context zzb;
    private final zzqn zzc;
    private final zzqv zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private zzan zzh;
    private zzan zzi;
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private zzmm zzm;
    private boolean zzn;

    public zzsf(Context object, zztl zztl2, zztx zztx2, boolean bl2, Handler handler, zzqo zzqo2, zzqv zzqv2) {
        super(1, zztl2, zztx2, false, 44100.0f);
        this.zzb = object = object.getApplicationContext();
        this.zzd = zzqv2;
        super(handler, zzqo2);
        this.zzc = object;
        super(this, null);
        zzqv2.zzq((zzqs)object);
    }

    private final int zzaM(zztp object, zzan zzan2) {
        int n3;
        String string2 = "OMX.google.raw.decoder";
        object = ((zztp)object).zza;
        int n4 = string2.equals(object);
        if (n4 != 0 && (n4 = zzgd.zza) < (n3 = 24) && (n4 != (n3 = 23) || (n4 = (int)(zzgd.zzN((Context)(object = this.zzb)) ? 1 : 0)) == 0)) {
            return -1;
        }
        return zzan2.zzo;
    }

    private static List zzaN(zztx zztx2, zzan zzan2, boolean bl2, zzqv zzqv2) {
        Object object = zzan2.zzn;
        if (object == null) {
            return zzgbc.zzm();
        }
        bl2 = zzqv2.zzA(zzan2);
        if (bl2 && (object = zzuj.zzb()) != null) {
            return zzgbc.zzn(object);
        }
        return zzuj.zzf(zztx2, zzan2, false, false);
    }

    private final void zzaO() {
        long l2;
        zzqv zzqv2 = this.zzd;
        boolean bl2 = this.zzW();
        long l3 = zzqv2.zzb(bl2);
        long l4 = l3 - (l2 = Long.MIN_VALUE);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            boolean bl3 = this.zzk;
            if (!bl3) {
                l2 = this.zzj;
                l3 = Math.max(l2, l3);
            }
            this.zzj = l3;
            zzqv2 = null;
            this.zzk = false;
        }
    }

    public static /* bridge */ /* synthetic */ zzmm zzad(zzsf zzsf2) {
        return zzsf2.zzm;
    }

    public static /* bridge */ /* synthetic */ zzqn zzae(zzsf zzsf2) {
        return zzsf2.zzc;
    }

    public static /* bridge */ /* synthetic */ void zzah(zzsf zzsf2, boolean bl2) {
        zzsf2.zzn = true;
    }

    public static /* synthetic */ void zzai(zzsf zzsf2) {
        zzsf2.zzB();
    }

    public final void zzA() {
        this.zzd.zzk();
    }

    public final void zzC() {
        zzqv zzqv2 = null;
        this.zzn = false;
        try {
            super.zzC();
            boolean bl2 = this.zzl;
            if (bl2) {
                this.zzl = false;
                zzqv2 = this.zzd;
                zzqv2.zzl();
            }
            return;
        }
        catch (Throwable throwable) {
            boolean bl3 = this.zzl;
            if (bl3) {
                this.zzl = false;
                zzqv2 = this.zzd;
                zzqv2.zzl();
            }
            throw throwable;
        }
    }

    public final void zzD() {
        this.zzd.zzi();
    }

    public final void zzE() {
        this.zzaO();
        this.zzd.zzh();
    }

    public final String zzU() {
        return "MediaCodecAudioRenderer";
    }

    public final boolean zzW() {
        zzqv zzqv2;
        boolean bl2 = super.zzW();
        return bl2 && (bl2 = (zzqv2 = this.zzd).zzz());
    }

    public final boolean zzX() {
        zzqv zzqv2 = this.zzd;
        boolean bl2 = zzqv2.zzy();
        return bl2 || (bl2 = super.zzX());
        {
        }
    }

    public final float zzZ(float f5, zzan zzan2, zzan[] zzanArray) {
        int n3;
        int n4 = -1;
        int n7 = -1;
        for (int i3 = 0; i3 < (n3 = zzanArray.length); ++i3) {
            zzan zzan3 = zzanArray[i3];
            n3 = zzan3.zzB;
            if (n3 == n4) continue;
            n7 = Math.max(n7, n3);
        }
        if (n7 == n4) {
            return -1.0f;
        }
        return (float)n7 * f5;
    }

    public final long zza() {
        int n3;
        int n4 = this.zzcU();
        if (n4 == (n3 = 2)) {
            this.zzaO();
        }
        return this.zzj;
    }

    public final int zzaa(zztx object, zzan zzan2) {
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        int n15;
        int n16;
        Object object2;
        int n17;
        block18: {
            block17: {
                n17 = 1;
                object2 = zzan2.zzn;
                int n18 = zzcg.zzg((String)object2);
                n16 = 128;
                if (n18 == 0) {
                    return n16;
                }
                n18 = zzgd.zza;
                n18 = zzan2.zzH;
                boolean n152 = zztv.zzaL(zzan2);
                if (!n152 || n18 != 0 && (object2 = zzuj.zzb()) == null) {
                    n15 = 0;
                } else {
                    object2 = this.zzd.zzd(zzan2);
                    n15 = ((zzqa)object2).zzb;
                    if (n15 == 0) {
                        n15 = 0;
                    } else {
                        n15 = ((zzqa)object2).zzc;
                        n15 = n17 != n15 ? 512 : 1536;
                        n18 = (int)(((zzqa)object2).zzd ? 1 : 0);
                        if (n18 != 0) {
                            n15 |= 0x800;
                        }
                    }
                    object2 = this.zzd;
                    n18 = (int)(object2.zzA(zzan2) ? 1 : 0);
                    if (n18 != 0) {
                        return n15 | 0xAC;
                    }
                }
                object2 = zzan2.zzn;
                Object object3 = "audio/raw";
                n18 = (int)(((String)object3).equals(object2) ? 1 : 0);
                if (n18 != 0 && (n18 = (int)((object2 = this.zzd).zzA(zzan2) ? 1 : 0)) == 0 || (n18 = (int)((object2 = this.zzd).zzA((zzan)(object3 = zzgd.zzz(n14 = 2, n10 = zzan2.zzA, n8 = zzan2.zzB))) ? 1 : 0)) == 0 || (n18 = (int)((object = zzsf.zzaN((zztx)object, zzan2, false, (zzqv)(object2 = this.zzd))).isEmpty() ? 1 : 0)) != 0) break block17;
                if (n152) break block18;
                n17 = 2;
            }
            return n17 | 0x80;
        }
        object2 = (zztp)object.get(0);
        boolean bl2 = ((zztp)object2).zze(zzan2);
        if (!bl2) {
            for (n10 = 1; n10 < (n8 = object.size()); n10 += n17) {
                zztp zztp2 = (zztp)object.get(n10);
                n14 = (int)(zztp2.zze(zzan2) ? 1 : 0);
                if (n14 == 0) continue;
                object2 = zztp2;
                n7 = 0;
                object = null;
                n4 = 1;
                break;
            }
        } else {
            n7 = 1;
        }
        n10 = n17 != n4 ? 3 : 4;
        n8 = 8;
        if (n4 != 0 && (n3 = ((zztp)object2).zzf(zzan2)) != 0) {
            n8 = 16;
        }
        if (n17 != (n3 = ((zztp)object2).zzg)) {
            n3 = 0;
            zzan2 = null;
        } else {
            n3 = 64;
        }
        if (n17 != n7) {
            n16 = 0;
        }
        return n10 | n8 | 0x20 | n3 | n16 | n15;
    }

    public final zziy zzab(zztp object, zzan zzan2, zzan zzan3) {
        int n3;
        int n4;
        int n7;
        zziy zziy2 = ((zztp)object).zzb(zzan2, zzan3);
        int n8 = zziy2.zze;
        int n10 = this.zzaJ(zzan3);
        if (n10 != 0) {
            n10 = 32768;
            n8 |= n10;
        }
        if ((n10 = this.zzaM((zztp)object, zzan3)) > (n7 = this.zze)) {
            n8 |= 0x40;
        }
        String string2 = ((zztp)object).zza;
        n10 = 0;
        if (n8 != 0) {
            n4 = n8;
            n3 = 0;
        } else {
            int n14;
            n3 = n14 = zziy2.zzd;
            n4 = 0;
        }
        object = new zziy(string2, zzan2, zzan3, n3, n4);
        return object;
    }

    public final zziy zzac(zzlj object) {
        zzan zzan2 = ((zzlj)object).zza;
        zzan2.getClass();
        this.zzh = zzan2;
        object = super.zzac((zzlj)object);
        this.zzc.zzi(zzan2, (zziy)object);
        return object;
    }

    public final zztk zzaf(zztp zztp2, zzan zzan2, MediaCrypto object, float f5) {
        int n3;
        Object object2;
        int n4;
        Object object3;
        zzan zzan3;
        int n7;
        String string2;
        object = this.zzT();
        int n8 = ((zzan[])object).length;
        int n10 = this.zzaM(zztp2, zzan2);
        int n14 = 0;
        float f6 = 0.0f;
        String string3 = null;
        int n15 = 1;
        if (n8 != n15) {
            string2 = null;
            for (n7 = 0; n7 < n8; ++n7) {
                zzan3 = object[n7];
                object3 = zztp2.zzb(zzan2, zzan3);
                int n16 = ((zziy)object3).zzd;
                if (n16 == 0) continue;
                int n17 = this.zzaM(zztp2, zzan3);
                n10 = Math.max(n10, n17);
            }
        }
        this.zze = n10;
        object = zztp2.zza;
        n8 = zzgd.zza;
        n10 = 24;
        if (n8 < n10 && (n4 = (string2 = "OMX.SEC.aac.dec").equals(object)) != 0 && (n4 = ((String)(object = "samsung")).equals(string2 = zzgd.zzc)) != 0 && ((n7 = (int)(((String)(object = zzgd.zzb)).startsWith(string2 = "zeroflte") ? 1 : 0)) != 0 || (n7 = (int)(((String)object).startsWith(string2 = "herolte") ? 1 : 0)) != 0 || (n4 = (int)(((String)object).startsWith(string2 = "heroqlte") ? 1 : 0)) != 0)) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        this.zzf = n4;
        object = zztp2.zza;
        string2 = "OMX.google.opus.decoder";
        n7 = (int)(((String)object).equals(string2) ? 1 : 0);
        if (n7 != 0 || (n7 = (int)(((String)object).equals(string2 = "c2.android.opus.decoder") ? 1 : 0)) != 0 || (n7 = (int)(((String)object).equals(string2 = "OMX.google.vorbis.decoder") ? 1 : 0)) != 0 || (n4 = ((String)object).equals(string2 = "c2.android.vorbis.decoder")) != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        this.zzg = n4;
        object = zztp2.zzc;
        n7 = this.zze;
        zzan3 = new MediaFormat();
        zzan3.setString("mime", (String)object);
        n4 = zzan2.zzA;
        zzan3.setInteger("channel-count", n4);
        n4 = zzan2.zzB;
        object3 = "sample-rate";
        zzan3.setInteger((String)object3, n4);
        object = zzan2.zzp;
        zzfn.zzb((MediaFormat)zzan3, (List)object);
        object = "max-input-size";
        zzfn.zza((MediaFormat)zzan3, (String)object, n7);
        n4 = 23;
        if (n8 >= n4) {
            string2 = "priority";
            zzan3.setInteger(string2, 0);
            f6 = -1.0f;
            n14 = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
            if (n14 != 0 && (n8 != n4 || (n14 = (int)((string3 = "ZTE B2017G").equals(object = zzgd.zzd) ? 1 : 0)) == 0 && (n4 = (int)((string3 = "AXON 7 mini").equals(object) ? 1 : 0)) == 0)) {
                object = "operating-rate";
                zzan3.setFloat((String)object, f5);
            }
        }
        if (n8 <= (n4 = 28) && (n4 = (int)(((String)(object2 = "audio/ac4")).equals(object = zzan2.zzn) ? 1 : 0)) != 0) {
            object = "ac4-is-sync";
            zzan3.setInteger((String)object, n15);
        }
        if (n8 >= n10) {
            object = this.zzd;
            n3 = zzan2.zzA;
            n10 = zzan2.zzB;
            n14 = 4;
            f6 = 5.6E-45f;
            object2 = zzgd.zzz(n14, n3, n10);
            n4 = object.zza((zzan)object2);
            n3 = 2;
            f5 = 2.8E-45f;
            if (n4 == n3) {
                object = "pcm-encoding";
                zzan3.setInteger((String)object, n14);
            }
        }
        if (n8 >= (n4 = 32)) {
            object = "max-output-channel-count";
            n3 = 99;
            f5 = 1.39E-43f;
            zzan3.setInteger((String)object, n3);
        }
        object = zztp2.zzb;
        object2 = "audio/raw";
        n4 = (int)(((String)object2).equals(object) ? 1 : 0);
        n8 = 0;
        if (n4 != 0 && (n4 = (int)(((String)object2).equals(object = zzan2.zzn) ? 1 : 0)) == 0) {
            object = zzan2;
        } else {
            n4 = 0;
            object = null;
        }
        this.zzi = object;
        return zztk.zza(zztp2, (MediaFormat)zzan3, zzan2, null);
    }

    public final List zzag(zztx zztx2, zzan zzan2, boolean bl2) {
        zzqv zzqv2 = this.zzd;
        return zzuj.zzg(zzsf.zzaN(zztx2, zzan2, false, zzqv2), zzan2);
    }

    public final void zzaj(zzin object) {
        Object object2;
        Object object3;
        int n3 = zzgd.zza;
        int n4 = 29;
        if (n3 >= n4 && (object3 = ((zzin)object).zza) != null && (n3 = (int)(Objects.equals(object3 = ((zzan)object3).zzn, object2 = "audio/opus") ? 1 : 0)) != 0 && (n3 = (int)(this.zzaI() ? 1 : 0)) != 0) {
            object3 = ((zzin)object).zzf;
            object3.getClass();
            object = ((zzin)object).zza;
            object.getClass();
            n4 = ((Buffer)object3).remaining();
            int n7 = 8;
            if (n4 == n7) {
                int n8 = ((zzan)object).zzD;
                object2 = ByteOrder.LITTLE_ENDIAN;
                object3 = ((ByteBuffer)object3).order((ByteOrder)object2);
                long l2 = ((ByteBuffer)object3).getLong();
                long l3 = 48000L;
                l2 *= l3;
                zzqv zzqv2 = this.zzd;
                long l4 = 1000000000L;
                n4 = (int)(l2 /= l4);
                zzqv2.zzr(n8, n4);
            }
        }
    }

    public final void zzak(Exception exception) {
        zzfk.zzd("MediaCodecAudioRenderer", "Audio codec error", exception);
        this.zzc.zza(exception);
    }

    public final void zzal(String string2, zztk zztk2, long l2, long l3) {
        this.zzc.zze(string2, l2, l3);
    }

    public final void zzam(String string2) {
        this.zzc.zzf(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzan(zzan object, MediaFormat object2) {
        zzqq zzqq22;
        block9: {
            int[] nArray;
            block7: {
                int n3;
                int n4;
                int n7;
                block8: {
                    int n8;
                    block11: {
                        block13: {
                            int n10;
                            block14: {
                                int n14;
                                int n15;
                                block15: {
                                    block16: {
                                        block12: {
                                            Object object3;
                                            block10: {
                                                object3 = this.zzi;
                                                nArray = null;
                                                n7 = 1;
                                                if (object3 == null) break block10;
                                                object = object3;
                                                break block11;
                                            }
                                            object3 = this.zzaw();
                                            if (object3 == null) break block11;
                                            object2.getClass();
                                            object3 = ((zzan)object).zzn;
                                            String string2 = "audio/raw";
                                            n4 = (int)(string2.equals(object3) ? 1 : 0);
                                            n10 = 2;
                                            n4 = n4 != 0 ? ((zzan)object).zzC : ((n4 = zzgd.zza) >= (n15 = 24) && (n15 = (int)(object2.containsKey((String)(object3 = "pcm-encoding")) ? 1 : 0)) != 0 ? object2.getInteger((String)object3) : ((n15 = (int)(object2.containsKey((String)(object3 = "v-bits-per-sample")) ? 1 : 0)) != 0 ? zzgd.zzl(object2.getInteger((String)object3)) : 2));
                                            zzal zzal2 = new zzal();
                                            zzal2.zzX(string2);
                                            zzal2.zzR(n4);
                                            n4 = ((zzan)object).zzD;
                                            zzal2.zzF(n4);
                                            n4 = ((zzan)object).zzE;
                                            zzal2.zzG(n4);
                                            object3 = ((zzan)object).zzl;
                                            zzal2.zzQ((zzcd)object3);
                                            object3 = ((zzan)object).zzb;
                                            zzal2.zzK((String)object3);
                                            object3 = ((zzan)object).zzc;
                                            zzal2.zzM((String)object3);
                                            object3 = ((zzan)object).zzd;
                                            zzal2.zzN((List)object3);
                                            object3 = ((zzan)object).zze;
                                            zzal2.zzO((String)object3);
                                            n4 = ((zzan)object).zzf;
                                            zzal2.zzZ(n4);
                                            n4 = ((zzan)object).zzg;
                                            zzal2.zzV(n4);
                                            n4 = object2.getInteger("channel-count");
                                            zzal2.zzy(n4);
                                            object3 = "sample-rate";
                                            n3 = object2.getInteger((String)object3);
                                            zzal2.zzY(n3);
                                            object2 = zzal2.zzad();
                                            n4 = (int)(this.zzf ? 1 : 0);
                                            n8 = 6;
                                            if (n4 == 0 || (n4 = ((zzan)object2).zzA) != n8 || (n4 = ((zzan)object).zzA) >= n8) break block12;
                                            nArray = new int[n4];
                                            object3 = null;
                                            for (n4 = 0; n4 < (n8 = ((zzan)object).zzA); ++n4) {
                                                nArray[n4] = n4;
                                            }
                                            break block13;
                                        }
                                        int n16 = this.zzg;
                                        if (n16 == 0) break block13;
                                        n16 = ((zzan)object2).zzA;
                                        n4 = 3;
                                        if (n16 == n4) break block14;
                                        n15 = 4;
                                        n14 = 5;
                                        if (n16 == n14) break block15;
                                        if (n16 == n8) break block16;
                                        int n17 = 7;
                                        if (n16 != n17) {
                                            int n18 = 8;
                                            if (n16 == n18) {
                                                nArray = new int[n18];
                                                nArray[0] = 0;
                                                nArray[n7] = n10;
                                                nArray[n10] = n7;
                                                nArray[n4] = n17;
                                                nArray[n15] = n14;
                                                nArray[n14] = n8;
                                                nArray[n8] = n4;
                                                nArray[n17] = n15;
                                            }
                                            break block13;
                                        } else {
                                            nArray = new int[n17];
                                            nArray[0] = 0;
                                            nArray[n7] = n10;
                                            nArray[n10] = n7;
                                            nArray[n4] = n8;
                                            nArray[n15] = n14;
                                            nArray[n14] = n4;
                                            nArray[n8] = n15;
                                        }
                                        break block13;
                                    }
                                    nArray = new int[n8];
                                    nArray[0] = 0;
                                    nArray[n7] = n10;
                                    nArray[n10] = n7;
                                    nArray[n4] = n14;
                                    nArray[n15] = n4;
                                    nArray[n14] = n15;
                                    break block13;
                                }
                                nArray = new int[n14];
                                nArray[0] = 0;
                                nArray[n7] = n10;
                                nArray[n10] = n7;
                                nArray[n4] = n4;
                                nArray[n15] = n15;
                                break block13;
                            }
                            nArray = new int[n4];
                            nArray[0] = 0;
                            nArray[n7] = n10;
                            nArray[n10] = n7;
                        }
                        object = object2;
                    }
                    try {
                        n3 = zzgd.zza;
                        n4 = 29;
                        if (n3 < n4) break block7;
                        n8 = this.zzaI();
                        if (n8 == 0) break block8;
                        this.zzm();
                    }
                    catch (zzqq zzqq22) {
                        break block9;
                    }
                }
                if (n3 < n4) {
                    n7 = 0;
                }
                zzeq.zzf(n7 != 0);
            }
            object2 = this.zzd;
            object2.zze((zzan)object, 0, nArray);
            return;
        }
        object2 = zzqq22.zza;
        throw this.zzi(zzqq22, (zzan)object2, false, 5001);
    }

    public final void zzao() {
        this.zzk = true;
    }

    public final void zzap() {
        this.zzd.zzg();
    }

    public final void zzaq() {
        zzqv zzqv2;
        try {
            zzqv2 = this.zzd;
        }
        catch (zzqu zzqu2) {
            int n3 = 1;
            int n4 = this.zzaI();
            n3 = n3 != n4 ? 5002 : 5003;
            zzan zzan2 = zzqu2.zzc;
            boolean bl2 = zzqu2.zzb;
            throw this.zzi(zzqu2, zzan2, bl2, n3);
        }
        zzqv2.zzj();
    }

    public final boolean zzar(long l2, long l3, zztm zztm2, ByteBuffer byteBuffer, int n3, int n4, int n7, long l4, boolean bl2, boolean bl3, zzan zzan2) {
        zzqr zzqr22;
        int n8;
        block12: {
            int n10;
            byteBuffer.getClass();
            Object object = this.zzi;
            boolean bl4 = true;
            n8 = 0;
            if (object != null && (n10 = n4 & 2) != 0) {
                zztm2.getClass();
                zztm2.zzn(n3, false);
                return bl4;
            }
            if (bl2) {
                if (zztm2 != null) {
                    zztm2.zzn(n3, false);
                }
                object = this.zza;
                ((zzix)object).zzf = n8 = ((zzix)object).zzf + n7;
                this.zzd.zzg();
                return bl4;
            }
            object = this.zzd;
            try {
                n10 = (int)(object.zzx(byteBuffer, l4, n7) ? 1 : 0);
                if (n10 != 0) {
                    if (zztm2 != null) {
                        zztm2.zzn(n3, false);
                    }
                    object = this.zza;
                    ((zzix)object).zze = n8 = ((zzix)object).zze + n7;
                    return bl4;
                }
                return false;
            }
            catch (zzqu zzqu2) {
            }
            catch (zzqr zzqr22) {
                break block12;
            }
            bl4 = this.zzaI();
            if (bl4) {
                this.zzm();
            }
            bl4 = zzqu2.zzb;
            throw this.zzi(zzqu2, zzan2, bl4, 5002);
        }
        zzan zzan3 = this.zzh;
        n8 = (int)(this.zzaI() ? 1 : 0);
        if (n8 != 0) {
            this.zzm();
        }
        n8 = (int)(zzqr22.zzb ? 1 : 0);
        throw this.zzi(zzqr22, zzan3, n8 != 0, 5001);
    }

    public final boolean zzas(zzan zzan2) {
        this.zzm();
        return this.zzd.zzA(zzan2);
    }

    public final zzcl zzc() {
        return this.zzd.zzc();
    }

    public final void zzg(zzcl zzcl2) {
        this.zzd.zzs(zzcl2);
    }

    public final boolean zzj() {
        boolean bl2 = this.zzn;
        this.zzn = false;
        return bl2;
    }

    public final zzlp zzk() {
        return this;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zzt(int n3, Object object) {
        int n4 = 2;
        if (n3 != n4) {
            n4 = 3;
            if (n3 != n4) {
                n4 = 6;
                if (n3 != n4) {
                    switch (n3) {
                        default: {
                            return;
                        }
                        case 12: {
                            n3 = zzgd.zza;
                            n4 = 23;
                            if (n3 < n4) return;
                            zzqv zzqv2 = this.zzd;
                            zzsc.zza(zzqv2, object);
                            return;
                        }
                        case 11: {
                            this.zzm = object = (zzmm)object;
                            return;
                        }
                        case 10: {
                            zzqv zzqv3 = this.zzd;
                            object.getClass();
                            int n7 = (Integer)object;
                            zzqv3.zzn(n7);
                            return;
                        }
                        case 9: 
                    }
                    zzqv zzqv4 = this.zzd;
                    object.getClass();
                    boolean bl2 = (Boolean)object;
                    zzqv4.zzv(bl2);
                    return;
                }
                object = (zzl)object;
                zzqv zzqv5 = this.zzd;
                object.getClass();
                zzqv5.zzo((zzl)object);
                return;
            }
            object = (zzk)object;
            zzqv zzqv6 = this.zzd;
            object.getClass();
            zzqv6.zzm((zzk)object);
            return;
        }
        zzqv zzqv7 = this.zzd;
        object.getClass();
        float f5 = ((Float)object).floatValue();
        zzqv7.zzw(f5);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzw() {
        Throwable throwable222222;
        this.zzl = true;
        Object object = null;
        this.zzh = null;
        object = this.zzd;
        object.zzf();
        super.zzw();
        object = this.zzc;
        zzix zzix2 = this.zza;
        ((zzqn)object).zzg(zzix2);
        return;
        {
            catch (Throwable throwable222222) {}
        }
        catch (Throwable throwable3) {
            super.zzw();
            zzqn zzqn2 = this.zzc;
            zzix zzix3 = this.zza;
            zzqn2.zzg(zzix3);
            throw throwable3;
        }
        zzqn zzqn3 = this.zzc;
        zzix zzix4 = this.zza;
        zzqn3.zzg(zzix4);
        throw throwable222222;
    }

    public final void zzx(boolean bl2, boolean bl3) {
        super.zzx(bl2, bl3);
        Object object = this.zzc;
        Object object2 = this.zza;
        ((zzqn)object).zzh((zzix)object2);
        this.zzm();
        object = this.zzd;
        object2 = this.zzn();
        object.zzt((zzpj)object2);
        object = this.zzd;
        object2 = this.zzh();
        object.zzp((zzer)object2);
    }

    public final void zzz(long l2, boolean bl2) {
        super.zzz(l2, bl2);
        this.zzd.zzf();
        this.zzj = l2;
        this.zzn = false;
        this.zzk = true;
    }
}

