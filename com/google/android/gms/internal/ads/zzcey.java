/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbcy;
import com.google.android.gms.internal.ads.zzbdj;
import com.google.android.gms.internal.ads.zzbdk;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzfyv;
import com.google.android.gms.internal.ads.zzhb;
import com.google.android.gms.internal.ads.zzhh;
import com.google.android.gms.internal.ads.zzie;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

public final class zzcey
implements zzhb {
    private final Context zza;
    private final zzhb zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbcy zzi;
    private boolean zzj;
    private boolean zzk;
    private final AtomicLong zzl;
    private zzhh zzm;

    public zzcey(Context object, zzhb zzhb2, String string2, int n3, zzie zzie2, zzcex zzcex2) {
        boolean bl2;
        this.zza = object;
        this.zzb = zzhb2;
        this.zzc = string2;
        this.zzd = n3;
        this.zzj = false;
        this.zzk = false;
        super(-1);
        this.zzl = object;
        object = zzbep.zzbR;
        this.zze = bl2 = ((Boolean)zzba.zzc().zza((zzbeg)object)).booleanValue();
    }

    private final boolean zzg() {
        boolean bl2 = this.zze;
        if (!bl2) {
            return false;
        }
        Object object = zzbep.zzer;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        bl2 = (Boolean)object;
        boolean bl3 = true;
        if (bl2 && !(bl2 = this.zzj)) {
            return bl3;
        }
        object = zzbep.zzes;
        zzben zzben3 = zzba.zzc();
        object = (Boolean)zzben3.zza((zzbeg)object);
        bl2 = (Boolean)object;
        if (bl2 && !(bl2 = this.zzk)) {
            return bl3;
        }
        return false;
    }

    public final int zza(byte[] object, int n3, int n4) {
        boolean bl2 = this.zzg;
        if (bl2) {
            int n7;
            Object object2 = this.zzf;
            if (object2 != null) {
                n7 = ((InputStream)object2).read((byte[])object, n3, n4);
            } else {
                object2 = this.zzb;
                n7 = object2.zza((byte[])object, n3, n4);
            }
            return n7;
        }
        object = new IOException;
        object("Attempt to read closed CacheDataSource.");
        throw object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zzb(zzhh var1_1) {
        block17: {
            block16: {
                var2_2 = this.zzg;
                if (var2_2 != 0) {
                    var1_1 = new IOException("Attempt to open an already open CacheDataSource.");
                    throw var1_1;
                }
                this.zzg = true;
                var3_3 = var1_1.zza;
                this.zzh = var3_3;
                this.zzm = var1_1;
                var3_3 = zzbcy.zza((Uri)var3_3);
                this.zzi = var3_3;
                var3_3 = zzbep.zzeo;
                var3_3 = (Boolean)zzba.zzc().zza((zzbeg)var3_3);
                var2_2 = var3_3.booleanValue();
                var4_4 = 0;
                var5_5 = null;
                if (var2_2 == 0) break block16;
                var3_3 = this.zzi;
                if (var3_3 == null) break block17;
                var3_3 = this.zzi;
                var3_3.zzh = var6_6 = var1_1.zze;
                var1_1 = this.zzi;
                var1_1.zzi = var3_3 = zzfyv.zzc(this.zzc);
                var1_1 = this.zzi;
                var1_1.zzj = var2_2 = this.zzd;
                var1_1 = this.zzi;
                var8_7 = var1_1.zzg;
                if (var8_7) {
                    var1_1 = zzbep.zzeq;
                    var3_3 = zzba.zzc();
                    var1_1 = (Long)var3_3.zza((zzbeg)var1_1);
                } else {
                    var1_1 = zzbep.zzep;
                    var3_3 = zzba.zzc();
                    var1_1 = (Long)var3_3.zza((zzbeg)var1_1);
                }
                var6_6 = var1_1.longValue();
                zzu.zzB().elapsedRealtime();
                zzu.zzd();
                var1_1 = this.zza;
                var3_3 = this.zzi;
                var1_1 = zzbdj.zza((Context)var1_1, (zzbcy)var3_3);
                var2_2 = 0;
                var3_3 = null;
                try {
                    var9_8 = TimeUnit.MILLISECONDS;
                    var10_9 = var1_1.get(var6_6, var9_8);
                    var10_9 = (zzbdk)var10_9;
                    var10_9.zzd();
                    this.zzj = var11_10 = var10_9.zzf();
                    this.zzk = var11_10 = var10_9.zze();
                    var10_9.zza();
                    var11_10 = this.zzg();
                    if (!var11_10) {
                        this.zzf = var10_9 = var10_9.zzc();
                    }
                    ** GOTO lbl66
                }
                catch (InterruptedException v0) {
                    var1_1.cancel(false);
                    var1_1 = Thread.currentThread();
                    var1_1.interrupt();
lbl66:
                    // 3 sources

                    while (true) {
                        zzu.zzB().elapsedRealtime();
                        throw null;
                    }
                    {
                        catch (Throwable v1) {}
                    }
                }
lbl71:
                // 3 sources

                while (true) {
                    ** continue;
                    break;
                }
                {
                    catch (ExecutionException | TimeoutException v2) {}
                    {
                        var1_1.cancel(false);
                        ** continue;
                    }
                }
            }
            var3_3 = this.zzi;
            if (var3_3 != null) {
                var3_3 = this.zzi;
                var3_3.zzh = var12_11 = var1_1.zze;
                var3_3 = this.zzi;
                var3_3.zzi = var5_5 = zzfyv.zzc(this.zzc);
                var3_3 = this.zzi;
                var3_3.zzj = var4_4 = this.zzd;
                var3_3 = zzu.zzc();
                var5_5 = this.zzi;
                var5_5 = var3_3.zzb((zzbcy)var5_5);
            }
            if (var5_5 != null && (var2_2 = var5_5.zze()) != 0) {
                this.zzj = var2_2 = var5_5.zzg();
                this.zzk = var2_2 = var5_5.zzf();
                var2_2 = this.zzg();
                if (var2_2 == 0) {
                    this.zzf = var1_1 = var5_5.zzc();
                    return -1;
                }
            }
        }
        if ((var3_3 = this.zzi) != null) {
            var1_1 = var1_1.zza();
            var3_3 = Uri.parse((String)this.zzi.zza);
            var1_1.zzd((Uri)var3_3);
            this.zzm = var1_1 = var1_1.zze();
        }
        var1_1 = this.zzb;
        var3_3 = this.zzm;
        return var1_1.zzb((zzhh)var3_3);
    }

    public final Uri zzc() {
        return this.zzh;
    }

    public final void zzd() {
        boolean bl2 = this.zzg;
        if (bl2) {
            this.zzg = false;
            bl2 = false;
            Object var2_2 = null;
            this.zzh = null;
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                IOUtils.closeQuietly(inputStream);
                this.zzf = null;
                return;
            }
            this.zzb.zzd();
            return;
        }
        IOException iOException = new IOException("Attempt to close an already closed CacheDataSource.");
        throw iOException;
    }

    public final /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    public final void zzf(zzie zzie2) {
    }
}

