/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.internal.ads.zzcz;
import com.google.android.gms.internal.ads.zzdb;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzfyw;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzmy;
import com.google.android.gms.internal.ads.zzpb;
import com.google.android.gms.internal.ads.zzpc;
import com.google.android.gms.internal.ads.zzpg;
import com.google.android.gms.internal.ads.zzph;
import com.google.android.gms.internal.ads.zzvo;
import java.util.HashMap;
import java.util.Random;

public final class zzpd
implements zzph {
    public static final zzfyw zza;
    private static final Random zzb;
    private final zzdb zzc;
    private final zzcz zzd;
    private final HashMap zze;
    private final zzfyw zzf;
    private zzpg zzg;
    private zzdc zzh;
    private String zzi;
    private long zzj;

    static {
        Object object = new zzpb();
        zza = object;
        zzb = object = new Random();
    }

    public zzpd() {
        throw null;
    }

    public zzpd(zzfyw object) {
        this.zzf = object;
        this.zzc = object = new zzdb();
        this.zzd = object = new zzcz();
        object = new HashMap();
        this.zze = object;
        this.zzh = object = zzdc.zza;
        this.zzj = -1;
    }

    public static /* bridge */ /* synthetic */ long zza(zzpd zzpd2) {
        return zzpd2.zzl();
    }

    public static /* bridge */ /* synthetic */ zzcz zzb(zzpd zzpd2) {
        return zzpd2.zzd;
    }

    public static /* bridge */ /* synthetic */ zzdb zzc(zzpd zzpd2) {
        return zzpd2.zzc;
    }

    public static /* synthetic */ String zzd() {
        return zzpd.zzn();
    }

    private final long zzl() {
        long l2;
        long l3;
        long l4;
        long l7;
        long l8;
        Object object = this.zze;
        String string2 = this.zzi;
        if ((object = (zzpc)((HashMap)object).get(string2)) != null && (l8 = (l7 = (l4 = zzpc.zzb((zzpc)object)) - (l3 = (long)-1)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false) {
            l2 = zzpc.zzb((zzpc)object);
        } else {
            l2 = this.zzj;
            long l12 = 1L;
            l2 += l12;
        }
        return l2;
    }

    private final zzpc zzm(int n3, zzvo zzvo2) {
        boolean bl2;
        Object object = this.zze.values().iterator();
        long l2 = Long.MAX_VALUE;
        zzpc zzpc2 = null;
        while (bl2 = object.hasNext()) {
            long l3;
            long l4;
            zzpc zzpc3 = (zzpc)object.next();
            zzpc3.zzg(n3, zzvo2);
            int n4 = zzpc3.zzj(n3, zzvo2);
            if (n4 == 0) continue;
            long l7 = zzpc.zzb(zzpc3);
            long l8 = l7 - (l4 = (long)-1);
            Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object2 != false && (l3 = l7 == l2 ? 0 : (l7 < l2 ? -1 : 1)) >= 0) {
                if (l3 != false) continue;
                n4 = zzgd.zza;
                zzvo zzvo3 = zzpc.zzc(zzpc2);
                if (zzvo3 == null || (zzvo3 = zzpc.zzc(zzpc3)) == null) continue;
                zzpc2 = zzpc3;
                continue;
            }
            zzpc2 = zzpc3;
            l2 = l7;
        }
        if (zzpc2 == null) {
            object = zzpd.zzn();
            zzpc zzpc4 = new zzpc(this, (String)object, n3, zzvo2);
            this.zze.put(object, zzpc4);
            return zzpc4;
        }
        return zzpc2;
    }

    private static String zzn() {
        byte[] byArray = new byte[12];
        zzb.nextBytes(byArray);
        return Base64.encodeToString((byte[])byArray, (int)10);
    }

    private final void zzo(zzpc zzpc2) {
        long l2;
        long l3 = zzpc.zzb(zzpc2);
        long l4 = l3 - (l2 = (long)-1);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            this.zzj = l3 = zzpc.zzb(zzpc2);
        }
        this.zzi = null;
    }

    private final void zzp(zzmy object) {
        block6: {
            Object object2;
            long l2;
            Object object3;
            Object object4;
            Object object5;
            block7: {
                int n3;
                block5: {
                    object5 = ((zzmy)object).zzb;
                    boolean n4 = ((zzdc)object5).zzo();
                    if (!n4) break block5;
                    object = this.zzi;
                    if (object != null) {
                        object = (zzpc)this.zze.get(object);
                        object.getClass();
                        this.zzo((zzpc)object);
                        return;
                    }
                    break block6;
                }
                object5 = this.zze;
                object4 = this.zzi;
                object5 = (zzpc)((HashMap)object5).get(object4);
                int n4 = ((zzmy)object).zzc;
                object3 = ((zzmy)object).zzd;
                object4 = this.zzm(n4, (zzvo)object3);
                this.zzi = object3 = zzpc.zzd((zzpc)object4);
                this.zzi((zzmy)object);
                object3 = ((zzmy)object).zzd;
                if (object3 == null || (n3 = ((zzvo)object3).zzb()) == 0) break block6;
                if (object5 == null) break block7;
                long l3 = ((zzvo)object3).zzd;
                l2 = zzpc.zzb((zzpc)object5);
                long l4 = l2 - l3;
                Object object6 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object6 != false || (object3 = zzpc.zzc((zzpc)object5)) == null) break block7;
                object3 = zzpc.zzc((zzpc)object5);
                int n7 = ((zzvo)object3).zzb;
                object2 = ((zzmy)object).zzd;
                n3 = ((zzvo)object2).zzb;
                if (n7 != n3) break block7;
                object5 = zzpc.zzc((zzpc)object5);
                int n8 = ((zzvo)object5).zzc;
                object3 = ((zzmy)object).zzd;
                n7 = ((zzvo)object3).zzc;
                if (n8 == n7) break block6;
            }
            object5 = ((zzmy)object).zzd;
            object2 = ((zzvo)object5).zza;
            l2 = ((zzvo)object5).zzd;
            object3 = new zzvo(object2, l2);
            int n10 = ((zzmy)object).zzc;
            object = this.zzm(n10, (zzvo)object3);
            zzpc.zzd((zzpc)object);
            zzpc.zzd((zzpc)object4);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zze() {
        synchronized (this) {
            return this.zzi;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzf(zzdc object, zzvo zzvo2) {
        synchronized (this) {
            Object object2 = zzvo2.zza;
            zzcz zzcz2 = this.zzd;
            object = ((zzdc)object).zzn(object2, zzcz2);
            int n3 = ((zzcz)object).zzd;
            object = this.zzm(n3, zzvo2);
            return zzpc.zzd((zzpc)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzg(zzmy zzmy2) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                Object object;
                Object object2;
                block6: {
                    try {
                        object2 = this.zzi;
                        if (object2 == null) break block6;
                        object = this.zze;
                        object2 = ((HashMap)object).get(object2);
                        if ((object2 = (zzpc)object2) == null) {
                            zzmy2 = null;
                            throw null;
                        }
                        this.zzo((zzpc)object2);
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                object2 = this.zze;
                object2 = ((HashMap)object2).values();
                object2 = object2.iterator();
                while (true) {
                    zzpg zzpg2;
                    boolean bl2;
                    if (!(bl2 = object2.hasNext())) {
                        return;
                    }
                    object = object2.next();
                    object = (zzpc)object;
                    object2.remove();
                    boolean bl3 = zzpc.zzi((zzpc)object);
                    if (!bl3 || (zzpg2 = this.zzg) == null) continue;
                    object = zzpc.zzd((zzpc)object);
                    zzpg2.zzd(zzmy2, (String)object, false);
                }
            }
            throw throwable2;
        }
    }

    public final void zzh(zzpg zzpg2) {
        this.zzg = zzpg2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzi(zzmy zzmy2) {
        synchronized (this) {
            Throwable throwable2;
            block11: {
                block9: {
                    Object object;
                    boolean bl2;
                    int n3;
                    Object object2;
                    long l2;
                    int n4;
                    Object object3;
                    block10: {
                        try {
                            long l3;
                            long l4;
                            object3 = this.zzg;
                            if (object3 == null) {
                                zzmy2 = null;
                                throw null;
                            }
                            object3 = zzmy2.zzb;
                            n4 = ((zzdc)object3).zzo();
                            if (n4 != 0) break block9;
                            object3 = zzmy2.zzd;
                            if (object3 == null) break block10;
                            l2 = ((zzvo)object3).zzd;
                            long l7 = this.zzl();
                            long l8 = l2 - l7;
                            n4 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
                            if (n4 < 0) break block9;
                            object3 = this.zze;
                            object2 = this.zzi;
                            object3 = ((HashMap)object3).get(object2);
                            if ((object3 = (zzpc)object3) != null && (l4 = (l3 = (l7 = zzpc.zzb((zzpc)object3)) - (l2 = (long)-1)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false && (n4 = zzpc.zza((zzpc)object3)) != (n3 = zzmy2.zzc)) break block9;
                        }
                        catch (Throwable throwable2) {
                            break block11;
                        }
                    }
                    n4 = zzmy2.zzc;
                    object2 = zzmy2.zzd;
                    object3 = this.zzm(n4, (zzvo)object2);
                    object2 = this.zzi;
                    if (object2 == null) {
                        this.zzi = object2 = zzpc.zzd((zzpc)object3);
                    }
                    object2 = zzmy2.zzd;
                    boolean bl3 = true;
                    if (object2 != null && (bl2 = ((zzvo)object2).zzb())) {
                        object = ((zzvo)object2).zza;
                        long l12 = ((zzvo)object2).zzd;
                        n3 = ((zzvo)object2).zzb;
                        n3 = zzmy2.zzc;
                        zzvo zzvo2 = new zzvo(object, l12, n3);
                        object2 = this.zzm(n3, zzvo2);
                        bl2 = zzpc.zzi((zzpc)object2);
                        if (!bl2) {
                            zzpc.zzf((zzpc)object2, bl3);
                            object = zzmy2.zzb;
                            Object object4 = zzmy2.zzd;
                            zzcz zzcz2 = this.zzd;
                            object4 = ((zzvo)object4).zza;
                            ((zzdc)object).zzn(object4, zzcz2);
                            object = this.zzd;
                            object4 = zzmy2.zzd;
                            int n7 = ((zzvo)object4).zzb;
                            ((zzcz)object).zzi(n7);
                            l2 = 0L;
                            long l14 = zzgd.zzu(l2);
                            long l15 = zzgd.zzu(l2);
                            Math.max(l2, l14 += l15);
                            zzpc.zzd((zzpc)object2);
                        }
                    }
                    if ((n3 = zzpc.zzi((zzpc)object3)) == 0) {
                        zzpc.zzf((zzpc)object3, bl3);
                        zzpc.zzd((zzpc)object3);
                    }
                    if ((n3 = (int)(((String)(object2 = zzpc.zzd((zzpc)object3))).equals(object = this.zzi) ? 1 : 0)) != 0 && (n3 = (int)(zzpc.zzh((zzpc)object3) ? 1 : 0)) == 0) {
                        zzpc.zze((zzpc)object3, bl3);
                        object2 = this.zzg;
                        object3 = zzpc.zzd((zzpc)object3);
                        object2.zzc(zzmy2, (String)object3);
                        return;
                    }
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
    public final void zzj(zzmy zzmy2, int n3) {
        synchronized (this) {
            Object object;
            try {
                object = this.zzg;
                if (object == null) {
                    zzmy2 = null;
                    throw null;
                }
                object = this.zze;
                object = ((HashMap)object).values();
                object = object.iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (true) {
                boolean bl2;
                boolean bl3;
                if (!(bl3 = object.hasNext())) {
                    this.zzp(zzmy2);
                    return;
                }
                Object object2 = object.next();
                boolean bl4 = ((zzpc)(object2 = (zzpc)object2)).zzk(zzmy2);
                if (!bl4) continue;
                object.remove();
                bl4 = zzpc.zzi((zzpc)object2);
                if (!bl4) continue;
                Object object3 = zzpc.zzd((zzpc)object2);
                String string2 = this.zzi;
                bl4 = ((String)object3).equals(string2);
                boolean bl5 = false;
                string2 = null;
                if (n3 == 0 && bl4 && (bl2 = zzpc.zzh((zzpc)object2))) {
                    bl5 = true;
                }
                if (bl4) {
                    this.zzo((zzpc)object2);
                }
                object3 = this.zzg;
                object2 = zzpc.zzd((zzpc)object2);
                object3.zzd(zzmy2, (String)object2, bl5);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzk(zzmy zzmy2) {
        synchronized (this) {
            Object object;
            Object object2;
            try {
                object2 = this.zzg;
                if (object2 == null) {
                    zzmy2 = null;
                    throw null;
                }
                object2 = this.zzh;
                object = zzmy2.zzb;
                this.zzh = object;
                object = this.zze;
                object = ((HashMap)object).values();
                object = object.iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (true) {
                String string2;
                boolean bl2;
                if (!(bl2 = object.hasNext())) {
                    this.zzp(zzmy2);
                    return;
                }
                Object object3 = object.next();
                Object object4 = this.zzh;
                boolean bl3 = ((zzpc)(object3 = (zzpc)object3)).zzl((zzdc)object2, (zzdc)object4);
                if (bl3 && !(bl3 = ((zzpc)object3).zzk(zzmy2))) continue;
                object.remove();
                bl3 = zzpc.zzi((zzpc)object3);
                if (!bl3) continue;
                object4 = zzpc.zzd((zzpc)object3);
                bl3 = ((String)object4).equals(string2 = this.zzi);
                if (bl3) {
                    this.zzo((zzpc)object3);
                }
                object4 = this.zzg;
                object3 = zzpc.zzd((zzpc)object3);
                string2 = null;
                object4.zzd(zzmy2, (String)object3, false);
            }
        }
    }
}

