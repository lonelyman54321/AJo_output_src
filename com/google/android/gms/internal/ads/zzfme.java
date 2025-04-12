/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbwj;
import com.google.android.gms.internal.ads.zzcze;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhe;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmg;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfmw;
import com.google.android.gms.internal.ads.zzfmy;
import com.google.android.gms.internal.ads.zzfnc;
import com.google.android.gms.internal.ads.zzfxr;
import com.google.android.gms.internal.ads.zzfyt;

public final class zzfme
implements zzfmc {
    private final Context zza;
    private final zzfmu zzb;
    private long zzc = 0L;
    private long zzd = -1;
    private boolean zze = false;
    private zzfmw zzf;
    private zzfmy zzg;
    private int zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private zzfnc zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private boolean zzq;
    private boolean zzr;

    public zzfme(Context context, zzfmu zzfmu2) {
        zzfnc zzfnc2;
        Object object = zzfmw.zza;
        this.zzf = object;
        object = zzfmy.zza;
        this.zzg = object;
        this.zzh = 0;
        this.zzi = object = "";
        this.zzj = object;
        this.zzk = object;
        this.zzl = object;
        this.zzm = zzfnc2 = zzfnc.zzb;
        this.zzn = object;
        this.zzo = object;
        this.zzp = object;
        this.zzq = false;
        this.zzr = false;
        this.zza = context;
        this.zzb = zzfmu2;
    }

    public static /* bridge */ /* synthetic */ zzfmu zzC(zzfme zzfme2) {
        return zzfme2.zzb;
    }

    public static /* bridge */ /* synthetic */ zzfmw zzD(zzfme zzfme2) {
        return zzfme2.zzf;
    }

    public static /* bridge */ /* synthetic */ zzfmy zzE(zzfme zzfme2) {
        return zzfme2.zzg;
    }

    public static /* bridge */ /* synthetic */ zzfnc zzF(zzfme zzfme2) {
        return zzfme2.zzm;
    }

    public static /* bridge */ /* synthetic */ String zzG(zzfme zzfme2) {
        return zzfme2.zzj;
    }

    public static /* bridge */ /* synthetic */ String zzH(zzfme zzfme2) {
        return zzfme2.zzp;
    }

    public static /* bridge */ /* synthetic */ String zzI(zzfme zzfme2) {
        return zzfme2.zzi;
    }

    public static /* bridge */ /* synthetic */ String zzJ(zzfme zzfme2) {
        return zzfme2.zzk;
    }

    public static /* bridge */ /* synthetic */ String zzK(zzfme zzfme2) {
        return zzfme2.zzl;
    }

    public static /* bridge */ /* synthetic */ String zzL(zzfme zzfme2) {
        return zzfme2.zzo;
    }

    public static /* bridge */ /* synthetic */ String zzM(zzfme zzfme2) {
        return zzfme2.zzn;
    }

    public static /* bridge */ /* synthetic */ boolean zzN(zzfme zzfme2) {
        return zzfme2.zze;
    }

    public static /* bridge */ /* synthetic */ int zzo(zzfme zzfme2) {
        return zzfme2.zzh;
    }

    public static /* bridge */ /* synthetic */ long zzp(zzfme zzfme2) {
        return zzfme2.zzc;
    }

    public static /* bridge */ /* synthetic */ long zzq(zzfme zzfme2) {
        return zzfme2.zzd;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzfme zzA() {
        synchronized (this) {
            Throwable throwable2;
            block3: {
                long l2;
                int n3;
                Object object;
                try {
                    int n4;
                    object = zzu.zzq();
                    Context context = this.zza;
                    this.zzh = n3 = ((zzab)object).zzm(context);
                    object = this.zza;
                    object = object.getResources();
                    object = object == null ? zzfmy.zza : ((object = object.getConfiguration()) == null ? zzfmy.zza : ((n3 = ((Configuration)object).orientation) == (n4 = 2) ? zzfmy.zzc : zzfmy.zzb));
                }
                catch (Throwable throwable2) {
                    break block3;
                }
                this.zzg = object;
                object = zzu.zzB();
                this.zzc = l2 = object.elapsedRealtime();
                n3 = 1;
                this.zzr = n3;
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
    public final zzfme zzB() {
        synchronized (this) {
            long l2;
            Clock clock = zzu.zzB();
            this.zzd = l2 = clock.elapsedRealtime();
            return this;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzl() {
        synchronized (this) {
            return this.zzr;
        }
    }

    public final boolean zzm() {
        String string2 = this.zzk;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        return !bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzfmg zzn() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                long l2;
                long l3;
                long l4;
                int n3;
                block5: {
                    try {
                        n3 = this.zzq;
                        if (n3 == 0) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return null;
                }
                n3 = 1;
                this.zzq = n3;
                n3 = this.zzr;
                if (n3 == 0) {
                    this.zzA();
                }
                if ((n3 = (l4 = (l3 = this.zzd) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) >= 0) return new zzfmg(this, null);
                this.zzB();
                return new zzfmg(this, null);
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzfme zzr(zze object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block4: {
                    boolean bl2;
                    block5: {
                        try {
                            object = ((zze)object).zze;
                            if (object == null) break block4;
                            String string2 = ((zzcze)(object = (zzcze)object)).zzk();
                            boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
                            if (bl3) break block5;
                            this.zzi = string2;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    if (!(bl2 = TextUtils.isEmpty((CharSequence)(object = ((zzcze)object).zzi())))) {
                        this.zzj = object;
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
    public final zzfme zzs(zzfhe object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                boolean bl2;
                Object object2;
                block4: {
                    try {
                        object2 = ((zzfhe)object).zzb;
                        object2 = ((zzfgw)object2).zzb;
                        bl2 = TextUtils.isEmpty((CharSequence)object2);
                        if (bl2) break block4;
                        object2 = ((zzfhe)object).zzb;
                        this.zzi = object2 = ((zzfgw)object2).zzb;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                object = ((zzfhe)object).zza;
                object = object.iterator();
                while (bl2 = object.hasNext()) {
                    object2 = object.next();
                    object2 = (zzfgt)object2;
                    String string2 = ((zzfgt)object2).zzac;
                    boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
                    if (bl3) continue;
                    this.zzj = object = ((zzfgt)object2).zzac;
                    break;
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
    public final zzfme zzt(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object = zzbep.zziP;
                        zzben zzben2 = zzba.zzc();
                        object = zzben2.zza((zzbeg)object);
                        object = (Boolean)object;
                        boolean bl2 = (Boolean)object;
                        if (!bl2) break block4;
                        this.zzp = string2;
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
    public final zzfme zzu(zzfmw zzfmw2) {
        synchronized (this) {
            this.zzf = zzfmw2;
            return this;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzfme zzv(String string2) {
        synchronized (this) {
            this.zzk = string2;
            return this;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzfme zzw(String string2) {
        synchronized (this) {
            this.zzl = string2;
            return this;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzfme zzx(zzfnc zzfnc2) {
        synchronized (this) {
            this.zzm = zzfnc2;
            return this;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzfme zzy(boolean bl2) {
        synchronized (this) {
            this.zze = bl2;
            return this;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzfme zzz(Throwable object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object2 = zzbep.zziP;
                        zzben zzben2 = zzba.zzc();
                        object2 = zzben2.zza((zzbeg)object2);
                        object2 = (Boolean)object2;
                        char c2 = ((Boolean)object2).booleanValue();
                        if (c2 == '\u0000') break block4;
                        this.zzo = object2 = zzbwj.zzf((Throwable)object);
                        object = zzbwj.zze((Throwable)object);
                        c2 = '\n';
                        object2 = zzfxr.zzc(c2);
                        object2 = zzfyt.zzc((zzfxr)object2);
                        object = ((zzfyt)object2).zzd((CharSequence)object);
                        object = object.iterator();
                        object = object.next();
                        this.zzn = object = (String)object;
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
}

