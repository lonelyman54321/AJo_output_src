/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.nonagon.signalgeneration.zzp;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzfhe;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmg;
import com.google.android.gms.internal.ads.zzfmm;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzfmw;
import com.google.android.gms.internal.ads.zzfnc;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class zzfmn
implements Runnable {
    private final List zza;
    private final zzfmq zzb;
    private zzfmw zzc;
    private String zzd;
    private zzfnc zze;
    private String zzf;
    private zzfhe zzg;
    private zze zzh;
    private Future zzi;

    public zzfmn(zzfmq zzfmq2) {
        Object object = new ArrayList();
        this.zza = object;
        this.zzc = object = zzfmw.zza;
        this.zze = object = zzfnc.zzb;
        this.zzb = zzfmq2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        synchronized (this) {
            this.zzi();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzfmn zza(zzfmc scheduledFuture) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block3: {
                    int n3;
                    Object object;
                    block4: {
                        try {
                            object = zzbgd.zzc;
                            object = ((zzbfv)object).zze();
                            object = (Boolean)object;
                            n3 = ((Boolean)object).booleanValue();
                            if (n3 == 0) break block3;
                            object = this.zza;
                            scheduledFuture.zzk();
                            object.add(scheduledFuture);
                            scheduledFuture = this.zzi;
                            if (scheduledFuture == null) break block4;
                            n3 = 0;
                            object = null;
                            scheduledFuture.cancel(false);
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    scheduledFuture = zzcci.zzd;
                    object = zzbep.zziN;
                    zzben zzben2 = zzba.zzc();
                    object = zzben2.zza((zzbeg)object);
                    object = (Integer)object;
                    n3 = (Integer)object;
                    long l2 = n3;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    this.zzi = scheduledFuture = scheduledFuture.schedule(this, l2, timeUnit);
                }
                return this;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzfmn zzb(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object = zzbgd.zzc;
                        object = ((zzbfv)object).zze();
                        object = (Boolean)object;
                        boolean bl2 = (Boolean)object;
                        if (!bl2 || !(bl2 = zzfmm.zzf(string2))) break block4;
                        this.zzd = string2;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return this;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzfmn zzc(zze zze2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object = zzbgd.zzc;
                        object = ((zzbfv)object).zze();
                        object = (Boolean)object;
                        boolean bl2 = (Boolean)object;
                        if (!bl2) break block4;
                        this.zzh = zze2;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return this;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzfmn zzd(zzfmw zzfmw2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object = zzbgd.zzc;
                        object = ((zzbfv)object).zze();
                        object = (Boolean)object;
                        boolean bl2 = (Boolean)object;
                        if (!bl2) break block4;
                        this.zzc = zzfmw2;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return this;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzfmn zze(ArrayList object) {
        synchronized (this) {
            Throwable throwable2;
            block11: {
                block5: {
                    block6: {
                        block7: {
                            block8: {
                                block9: {
                                    block12: {
                                        boolean bl2;
                                        Object object2;
                                        block10: {
                                            try {
                                                object2 = zzbgd.zzc;
                                                object2 = ((zzbfv)object2).zze();
                                                object2 = (Boolean)object2;
                                                bl2 = (Boolean)object2;
                                                if (!bl2) break block5;
                                                object2 = "banner";
                                                bl2 = ((ArrayList)object).contains(object2);
                                                if (bl2) break block6;
                                                object2 = AdFormat.BANNER;
                                                bl2 = ((ArrayList)object).contains(object2 = ((Enum)object2).name());
                                                if (bl2) break block6;
                                                object2 = "interstitial";
                                                bl2 = ((ArrayList)object).contains(object2);
                                                if (bl2) break block7;
                                                object2 = AdFormat.INTERSTITIAL;
                                                bl2 = ((ArrayList)object).contains(object2 = ((Enum)object2).name());
                                                if (bl2) break block7;
                                                object2 = "native";
                                                bl2 = ((ArrayList)object).contains(object2);
                                                if (bl2) break block8;
                                                object2 = AdFormat.NATIVE;
                                                bl2 = ((ArrayList)object).contains(object2 = ((Enum)object2).name());
                                                if (bl2) break block8;
                                                object2 = "rewarded";
                                                bl2 = ((ArrayList)object).contains(object2);
                                                if (bl2) break block9;
                                                object2 = AdFormat.REWARDED;
                                                bl2 = ((ArrayList)object).contains(object2 = ((Enum)object2).name());
                                                if (bl2) break block9;
                                                object2 = "app_open_ad";
                                                bl2 = ((ArrayList)object).contains(object2);
                                                if (!bl2) break block10;
                                                this.zzc = object = zzfmw.zzf;
                                                break block5;
                                            }
                                            catch (Throwable throwable2) {
                                                break block11;
                                            }
                                        }
                                        object2 = "rewarded_interstitial";
                                        bl2 = ((ArrayList)object).contains(object2);
                                        if (bl2) break block12;
                                        object2 = AdFormat.REWARDED_INTERSTITIAL;
                                        boolean bl3 = ((ArrayList)object).contains(object2 = ((Enum)object2).name());
                                        if (!bl3) break block5;
                                    }
                                    this.zzc = object = zzfmw.zze;
                                    break block5;
                                }
                                this.zzc = object = zzfmw.zzd;
                                break block5;
                            }
                            this.zzc = object = zzfmw.zzg;
                            break block5;
                        }
                        this.zzc = object = zzfmw.zzc;
                        break block5;
                    }
                    this.zzc = object = zzfmw.zzb;
                }
                return this;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzfmn zzf(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object = zzbgd.zzc;
                        object = ((zzbfv)object).zze();
                        object = (Boolean)object;
                        boolean bl2 = (Boolean)object;
                        if (!bl2) break block4;
                        this.zzf = string2;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return this;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzfmn zzg(Bundle object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object2 = zzbgd.zzc;
                        object2 = ((zzbfv)object2).zze();
                        object2 = (Boolean)object2;
                        boolean bl2 = (Boolean)object2;
                        if (!bl2) break block4;
                        object = zzp.zza(object);
                        this.zze = object;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return this;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzfmn zzh(zzfhe zzfhe2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object = zzbgd.zzc;
                        object = ((zzbfv)object).zze();
                        object = (Boolean)object;
                        boolean bl2 = (Boolean)object;
                        if (!bl2) break block4;
                        this.zzg = zzfhe2;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return this;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzi() {
        synchronized (this) {
            Object object;
            boolean bl2;
            Throwable throwable2;
            Object object2;
            block13: {
                try {
                    object2 = zzbgd.zzc;
                    object2 = ((zzbfv)object2).zze();
                    object2 = (Boolean)object2;
                    boolean bl3 = (Boolean)object2;
                    if (bl3) break block13;
                }
                catch (Throwable throwable2) {}
                return;
            }
            object2 = this.zzi;
            if (object2 != null) {
                bl2 = false;
                object = null;
                object2.cancel(false);
            }
            object2 = this.zza;
            object2 = object2.iterator();
            {
                throw throwable2;
                while (bl2 = object2.hasNext()) {
                    boolean bl4;
                    object = object2.next();
                    object = (zzfmc)object;
                    Object object3 = this.zzc;
                    zzfmw zzfmw2 = zzfmw.zza;
                    if (object3 != zzfmw2) {
                        object.zzd((zzfmw)object3);
                    }
                    if (!(bl4 = TextUtils.isEmpty((CharSequence)(object3 = this.zzd)))) {
                        object3 = this.zzd;
                        object.zzf((String)object3);
                    }
                    if (!(bl4 = TextUtils.isEmpty((CharSequence)(object3 = this.zzf))) && !(bl4 = object.zzm())) {
                        object3 = this.zzf;
                        object.zze((String)object3);
                    }
                    if ((object3 = this.zzg) != null) {
                        object.zzb((zzfhe)object3);
                    } else {
                        object3 = this.zzh;
                        if (object3 != null) {
                            object.zza((zze)object3);
                        }
                    }
                    object3 = this.zze;
                    object.zzg((zzfnc)object3);
                    object3 = this.zzb;
                    object = object.zzn();
                    ((zzfmq)object3).zzb((zzfmg)object);
                }
                object2 = this.zza;
                object2.clear();
                return;
            }
        }
    }
}

