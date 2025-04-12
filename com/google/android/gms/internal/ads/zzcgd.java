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
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbcy;
import com.google.android.gms.internal.ads.zzbdj;
import com.google.android.gms.internal.ads.zzbdk;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcgc;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzcgq;
import com.google.android.gms.internal.ads.zzfyv;
import com.google.android.gms.internal.ads.zzgv;
import com.google.android.gms.internal.ads.zzhb;
import com.google.android.gms.internal.ads.zzhf;
import com.google.android.gms.internal.ads.zzhh;
import com.google.android.gms.internal.ads.zzie;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

public final class zzcgd
extends zzgv {
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
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private ListenableFuture zzo;
    private final AtomicLong zzp;
    private final zzcgo zzq;

    public zzcgd(Context object, zzhb zzhb2, String string2, int n3, zzie zzie2, zzcgo zzcgo2) {
        super(false);
        boolean bl2;
        this.zza = object;
        this.zzb = zzhb2;
        this.zzq = zzcgo2;
        this.zzc = string2;
        this.zzd = n3;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = 0L;
        super(-1);
        this.zzp = object;
        this.zzo = null;
        object = zzbep.zzbR;
        this.zze = bl2 = ((Boolean)zzba.zzc().zza((zzbeg)object)).booleanValue();
        this.zzf(zzie2);
    }

    private final boolean zzr() {
        boolean bl2 = this.zze;
        if (!bl2) {
            return false;
        }
        Object object = zzbep.zzer;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        bl2 = (Boolean)object;
        boolean bl3 = true;
        if (bl2 && !(bl2 = this.zzl)) {
            return bl3;
        }
        object = zzbep.zzes;
        zzben zzben3 = zzba.zzc();
        object = (Boolean)zzben3.zza((zzbeg)object);
        bl2 = (Boolean)object;
        if (bl2 && !(bl2 = this.zzm)) {
            return bl3;
        }
        return false;
    }

    public final int zza(byte[] object, int n3, int n4) {
        boolean bl2 = this.zzg;
        if (bl2) {
            InputStream inputStream;
            int n7;
            Object object2 = this.zzf;
            if (object2 != null) {
                n7 = ((InputStream)object2).read((byte[])object, n3, n4);
            } else {
                object2 = this.zzb;
                n7 = object2.zza((byte[])object, n3, n4);
            }
            n3 = (int)(this.zze ? 1 : 0);
            if (n3 == 0 || (inputStream = this.zzf) != null) {
                this.zzg(n7);
            }
            return n7;
        }
        object = new IOException;
        object("Attempt to read closed GcacheDataSource.");
        throw object;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zzb(zzhh object) {
        Object object2;
        block28: {
            boolean bl2;
            int n3;
            long l2;
            long l3;
            boolean bl3;
            Object object3;
            block27: {
                void var1_5;
                StringBuilder stringBuilder;
                long l4;
                block23: {
                    block29: {
                        long l7;
                        Object object4;
                        block30: {
                            boolean bl4;
                            block26: {
                                Object object5;
                                block25: {
                                    block24: {
                                        block21: {
                                            block22: {
                                                int n4;
                                                long l8;
                                                object2 = "ms";
                                                object3 = "Cache connection took ";
                                                bl3 = this.zzg;
                                                if (bl3) {
                                                    object = new IOException("Attempt to open an already open GcacheDataSource.");
                                                    throw object;
                                                }
                                                this.zzg = bl3 = true;
                                                object5 = ((zzhh)object).zza;
                                                this.zzh = object5;
                                                boolean bl5 = this.zze;
                                                if (!bl5) {
                                                    this.zzj((zzhh)object);
                                                }
                                                object5 = zzbcy.zza(((zzhh)object).zza);
                                                this.zzi = object5;
                                                object5 = zzbep.zzeo;
                                                object4 = zzba.zzc();
                                                object5 = (Boolean)((zzben)object4).zza((zzbeg)object5);
                                                bl5 = (Boolean)object5;
                                                l3 = -1;
                                                if (!bl5) break block27;
                                                object5 = this.zzi;
                                                if (object5 == null) break block28;
                                                object5 = this.zzi;
                                                ((zzbcy)object5).zzh = l8 = ((zzhh)object).zze;
                                                object5 = this.zzi;
                                                Object object6 = zzfyv.zzc(this.zzc);
                                                ((zzbcy)object5).zzi = object6;
                                                object5 = this.zzi;
                                                ((zzbcy)object5).zzj = n4 = this.zzd;
                                                object5 = this.zzi;
                                                bl5 = ((zzbcy)object5).zzg;
                                                if (bl5) {
                                                    object5 = zzbep.zzeq;
                                                    object6 = zzba.zzc();
                                                    object5 = (Long)((zzben)object6).zza((zzbeg)object5);
                                                } else {
                                                    object5 = zzbep.zzep;
                                                    object6 = zzba.zzc();
                                                    object5 = (Long)((zzben)object6).zza((zzbeg)object5);
                                                }
                                                l8 = (Long)object5;
                                                l4 = zzu.zzB().elapsedRealtime();
                                                zzu.zzd();
                                                object5 = this.zza;
                                                Object object7 = this.zzi;
                                                object5 = zzbdj.zza((Context)object5, object7);
                                                object7 = TimeUnit.MILLISECONDS;
                                                object6 = object5.get(l8, (TimeUnit)((Object)object7));
                                                object6 = (zzbdk)object6;
                                                try {
                                                    long l12;
                                                    boolean bl6;
                                                    this.zzj = bl6 = ((zzbdk)object6).zzd();
                                                    this.zzl = bl6 = ((zzbdk)object6).zzf();
                                                    this.zzm = bl6 = ((zzbdk)object6).zze();
                                                    this.zzn = l12 = ((zzbdk)object6).zza();
                                                    bl6 = this.zzr();
                                                    if (bl6) break block21;
                                                    this.zzf = object6 = ((zzbdk)object6).zzc();
                                                    n4 = (int)(this.zze ? 1 : 0);
                                                    if (n4 == 0) break block22;
                                                    this.zzj((zzhh)object);
                                                }
                                                catch (Throwable throwable) {
                                                    break block23;
                                                }
                                            }
                                            long l14 = zzu.zzB().elapsedRealtime() - l4;
                                            this.zzq.zza.zzab(bl3, l14);
                                            this.zzk = bl3;
                                            object = new StringBuilder((String)object3);
                                            ((StringBuilder)object).append(l14);
                                            ((StringBuilder)object).append((String)object2);
                                            com.google.android.gms.ads.internal.util.zze.zza(((StringBuilder)object).toString());
                                            return l3;
                                        }
                                        object5 = zzu.zzB();
                                        long l15 = object5.elapsedRealtime() - l4;
                                        zzcgq zzcgq2 = this.zzq.zza;
                                        zzcgq2.zzab(bl3, l15);
                                        this.zzk = bl3;
                                        StringBuilder stringBuilder2 = new StringBuilder((String)object3);
                                        stringBuilder2.append(l15);
                                        stringBuilder2.append((String)object2);
                                        object2 = stringBuilder2.toString();
                                        break block29;
                                        catch (InterruptedException interruptedException) {
                                            bl4 = true;
                                            break block24;
                                        }
                                        catch (ExecutionException | TimeoutException exception) {
                                            bl4 = true;
                                            break block25;
                                        }
                                        catch (Throwable throwable) {
                                            bl3 = false;
                                            stringBuilder = null;
                                            break block23;
                                        }
                                        catch (InterruptedException interruptedException) {
                                            bl4 = false;
                                            object4 = null;
                                        }
                                    }
                                    object5.cancel(bl3);
                                    Object object8 = Thread.currentThread();
                                    ((Thread)object8).interrupt();
                                    object8 = zzu.zzB();
                                    l7 = object8.elapsedRealtime() - l4;
                                    zzcgq zzcgq3 = this.zzq.zza;
                                    zzcgq3.zzab(bl4, l7);
                                    this.zzk = bl4;
                                    object4 = new StringBuilder((String)object3);
                                    break block30;
                                    catch (ExecutionException | TimeoutException exception) {
                                        bl4 = false;
                                        object4 = null;
                                    }
                                }
                                try {
                                    object5.cancel(bl3);
                                    break block26;
                                }
                                catch (Throwable throwable) {
                                    bl3 = bl4;
                                }
                                break block23;
                            }
                            Clock clock = zzu.zzB();
                            l7 = clock.elapsedRealtime() - l4;
                            zzcgq zzcgq4 = this.zzq.zza;
                            zzcgq4.zzab(bl4, l7);
                            this.zzk = bl4;
                            object4 = new StringBuilder((String)object3);
                        }
                        ((StringBuilder)object4).append(l7);
                        ((StringBuilder)object4).append((String)object2);
                        object2 = ((StringBuilder)object4).toString();
                    }
                    com.google.android.gms.ads.internal.util.zze.zza((String)object2);
                    break block28;
                }
                long l16 = zzu.zzB().elapsedRealtime() - l4;
                this.zzq.zza.zzab(bl3, l16);
                this.zzk = bl3;
                stringBuilder = new StringBuilder((String)object3);
                stringBuilder.append(l16);
                stringBuilder.append((String)object2);
                com.google.android.gms.ads.internal.util.zze.zza(stringBuilder.toString());
                throw var1_5;
            }
            object2 = this.zzi;
            if (object2 != null) {
                object2 = this.zzi;
                ((zzbcy)object2).zzh = l2 = ((zzhh)object).zze;
                object2 = this.zzi;
                object3 = zzfyv.zzc(this.zzc);
                ((zzbcy)object2).zzi = object3;
                object2 = this.zzi;
                ((zzbcy)object2).zzj = n3 = this.zzd;
                object2 = zzu.zzc();
                object3 = this.zzi;
                object2 = ((zzbcu)object2).zzb((zzbcy)object3);
            } else {
                bl2 = false;
                object2 = null;
            }
            if (object2 != null && (n3 = ((zzbcv)object2).zze()) != 0) {
                this.zzj = n3 = ((zzbcv)object2).zzd();
                this.zzl = n3 = ((zzbcv)object2).zzg();
                n3 = (int)(((zzbcv)object2).zzf() ? 1 : 0);
                this.zzm = n3;
                this.zzn = l2 = ((zzbcv)object2).zza();
                this.zzk = bl3;
                n3 = (int)(this.zzr() ? 1 : 0);
                if (n3 == 0) {
                    this.zzf = object2 = ((zzbcv)object2).zzc();
                    bl2 = this.zze;
                    if (bl2) {
                        this.zzj((zzhh)object);
                    }
                    return l3;
                }
            }
        }
        this.zzk = false;
        object2 = this.zzi;
        if (object2 != null) {
            object = ((zzhh)object).zza();
            object2 = Uri.parse((String)this.zzi.zza);
            ((zzhf)object).zzd((Uri)object2);
            object = ((zzhf)object).zze();
        }
        return this.zzb.zzb((zzhh)object);
    }

    public final Uri zzc() {
        return this.zzh;
    }

    public final void zzd() {
        boolean bl2 = this.zzg;
        if (bl2) {
            InputStream inputStream;
            bl2 = false;
            Object var2_2 = null;
            this.zzg = false;
            zzhb zzhb2 = null;
            this.zzh = null;
            boolean bl3 = this.zze;
            if (!bl3 || (inputStream = this.zzf) != null) {
                bl2 = true;
            }
            if ((inputStream = this.zzf) != null) {
                IOUtils.closeQuietly(inputStream);
                this.zzf = null;
            } else {
                zzhb2 = this.zzb;
                zzhb2.zzd();
            }
            if (bl2) {
                this.zzh();
            }
            return;
        }
        IOException iOException = new IOException("Attempt to close an already closed GcacheDataSource.");
        throw iOException;
    }

    public final long zzk() {
        return this.zzn;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final long zzl() {
        Object object;
        Object object2 = this.zzi;
        long l2 = -1;
        if (object2 == null) {
            return l2;
        }
        object2 = this.zzp;
        long l3 = ((AtomicLong)object2).get();
        long l4 = l3 - l2;
        Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object3 != false) {
            return this.zzp.get();
        }
        // MONITORENTER : this
        object2 = this.zzo;
        if (object2 == null) {
            object2 = zzcci.zza;
            object = new zzcgc(this);
            this.zzo = object2 = object2.zzb((Callable)object);
        }
        object2 = this.zzo;
        object3 = object2.isDone();
        if (object3 == false) return l2;
        try {
            object2 = this.zzp;
            object = this.zzo;
            object = object.get();
            object = (Long)object;
            l3 = (Long)object;
            ((AtomicLong)object2).compareAndSet(l2, l3);
            return this.zzp.get();
        }
        catch (InterruptedException | ExecutionException exception) {}
        return l2;
    }

    public final /* synthetic */ Long zzm() {
        zzbcu zzbcu2 = zzu.zzc();
        zzbcy zzbcy2 = this.zzi;
        return zzbcu2.zza(zzbcy2);
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final boolean zzo() {
        return this.zzm;
    }

    public final boolean zzp() {
        return this.zzl;
    }

    public final boolean zzq() {
        return this.zzk;
    }
}

