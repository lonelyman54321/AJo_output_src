/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzelf;
import com.google.android.gms.internal.ads.zzelg;
import com.google.android.gms.internal.ads.zzelj;
import com.google.android.gms.internal.ads.zzelm;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzggm;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzekq {
    private final Map zza;
    private final List zzb;
    private final zzggm zzc;
    private final List zzd;
    private final Set zze;
    private zzelg zzf;
    private int zzg;
    private final String zzh;
    private final int zzi;
    private final zzelf zzj;
    private zzfgt zzk;
    private boolean zzl;

    public zzekq(zzfhf object, zzelf object2, zzggm object3) {
        int n3;
        int n4;
        Cloneable cloneable;
        this.zza = cloneable = new Cloneable();
        this.zzb = cloneable;
        super();
        this.zzd = cloneable;
        super();
        this.zze = cloneable;
        this.zzg = -1 >>> 1;
        cloneable = null;
        this.zzl = false;
        Object object4 = ((zzfhf)object).zzb.zzb;
        this.zzi = n4 = ((zzfgw)object4).zzq;
        this.zzj = object2;
        this.zzc = object3;
        this.zzh = object2 = zzelm.zzc((zzfhf)object);
        object = ((zzfhf)object).zzb.zza;
        for (int i3 = 0; i3 < (n3 = object.size()); ++i3) {
            object2 = this.zza;
            object3 = (zzfgt)object.get(i3);
            object4 = i3;
            object2.put(object3, object4);
        }
        this.zzb.addAll(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zze() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Object object;
                Object object2;
                try {
                    object2 = this.zzj;
                    object = this.zzk;
                    ((zzelf)object2).zzi((zzfgt)object);
                    object2 = this.zzf;
                    if (object2 != null) {
                        object = this.zzc;
                        ((zzggm)object).zzc(object2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object2 = this.zzc;
                object = this.zzh;
                int n3 = 3;
                zzelj zzelj2 = new zzelj(n3, (String)object);
                ((zzggm)object2).zzd(zzelj2);
                return;
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
    private final boolean zzf(boolean bl2) {
        synchronized (this) {
            int n3;
            int n4;
            try {
                Object object = this.zzb;
                object = object.iterator();
                while ((n4 = object.hasNext()) != 0) {
                    Set set;
                    Object object2 = object.next();
                    object2 = (zzfgt)object2;
                    Object object3 = this.zza;
                    object3 = object3.get(object2);
                    n3 = (object3 = (Integer)object3) != null ? (Integer)object3 : -1 >>> 1;
                    if (!bl2 && (n4 = (int)((set = this.zze).contains(object2 = ((zzfgt)object2).zzau) ? 1 : 0)) != 0) continue;
                    n4 = this.zzg;
                    if (n3 >= n4) break block6;
                }
            }
            catch (Throwable throwable) {}
            {
                block6: {
                    return true;
                }
                if (n3 <= n4) continue;
            }
            return false;
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final boolean zzg() {
        int n3;
        // MONITORENTER : this
        Object object = this.zzd;
        object = object.iterator();
        while ((n3 = object.hasNext()) != 0) {
            int n4;
            Object object2 = object.next();
            object2 = (zzfgt)object2;
            Map map2 = this.zza;
            object2 = map2.get(object2);
            n3 = (object2 = (Integer)object2) != null ? (Integer)object2 : -1 >>> 1;
            if (n3 >= (n4 = this.zzg)) continue;
            return true;
        }
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean zzh() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                boolean bl2;
                block5: {
                    block4: {
                        bl2 = true;
                        try {
                            boolean bl3 = this.zzf(bl2);
                            if (!bl3 && !(bl3 = this.zzg())) break block4;
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    return false;
                }
                return bl2;
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
    private final boolean zzi() {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                Object object;
                int n3;
                block7: {
                    block6: {
                        try {
                            n3 = this.zzl;
                            if (n3 == 0) break block6;
                        }
                        catch (Throwable throwable2) {}
                        return false;
                    }
                    object = this.zzb;
                    n3 = object.isEmpty();
                    if (n3 != 0) break block7;
                    object = this.zzb;
                    object = object.get(0);
                    object = (zzfgt)object;
                    n3 = ((zzfgt)object).zzaw;
                    if (n3 == 0 || (n3 = (int)((object = this.zzd).isEmpty() ? 1 : 0)) != 0) break block7;
                    return false;
                }
                n3 = this.zzd();
                if (n3 != 0) break block8;
                object = this.zzd;
                int n4 = this.zzi;
                n3 = object.size();
                if (n3 >= n4 || (n3 = (int)(this.zzf(false) ? 1 : 0)) == 0) break block8;
                return true;
            }
            return false;
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzfgt zza() {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                boolean bl2;
                Object object;
                Set set;
                Object object2;
                zzfgt zzfgt2;
                int n3;
                block8: {
                    try {
                        block7: {
                            int n4;
                            n3 = this.zzi();
                            if (n3 == 0) return null;
                            n3 = 0;
                            zzfgt2 = null;
                            while (n3 < (n4 = (object2 = this.zzb).size())) {
                                object2 = this.zzb;
                                object2 = object2.get(n3);
                                object2 = (zzfgt)object2;
                                set = this.zze;
                                object = ((zzfgt)object2).zzau;
                                bl2 = set.contains(object);
                                if (bl2) {
                                    ++n3;
                                    continue;
                                }
                                break block7;
                            }
                            return null;
                        }
                        bl2 = ((zzfgt)object2).zzaw;
                        if (!bl2) break block8;
                        this.zzl = bl2 = true;
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                }
                if (!(bl2 = TextUtils.isEmpty((CharSequence)object))) {
                    set = this.zze;
                    set.add(object);
                }
                object = this.zzd;
                object.add(object2);
                object2 = this.zzb;
                zzfgt2 = (zzfgt)object2.remove(n3);
                return zzfgt2;
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
    public final void zzb(Throwable object, zzfgt object2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                boolean bl2 = false;
                object = null;
                try {
                    this.zzl = false;
                    object = this.zzd;
                    object.remove(object2);
                    object = this.zze;
                    object2 = ((zzfgt)object2).zzau;
                    object.remove(object2);
                    bl2 = this.zzd();
                    if (!bl2 && !(bl2 = this.zzh())) {
                        this.zze();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(zzelg object, zzfgt zzfgt2) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                int n3 = 0;
                Object object2 = null;
                try {
                    this.zzl = false;
                    object2 = this.zzd;
                    object2.remove(zzfgt2);
                    n3 = this.zzd();
                    if (n3 != 0) {
                        object.zzq();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                object2 = this.zza;
                object2 = object2.get(zzfgt2);
                n3 = (object2 = (Integer)object2) != null ? (Integer)object2 : -1 >>> 1;
                int n4 = this.zzg;
                if (n3 > n4) {
                    object = this.zzj;
                    ((zzelf)object).zzm(zzfgt2);
                    return;
                }
                Object object3 = this.zzf;
                if (object3 != null) {
                    object3 = this.zzj;
                    zzfgt zzfgt3 = this.zzk;
                    ((zzelf)object3).zzm(zzfgt3);
                }
                this.zzg = n3;
                this.zzf = object;
                this.zzk = zzfgt2;
                boolean bl2 = this.zzh();
                if (!bl2) {
                    this.zze();
                    return;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzd() {
        synchronized (this) {
            zzggm zzggm2 = this.zzc;
            return zzggm2.isDone();
        }
    }
}

