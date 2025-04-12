/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzct;
import com.google.android.gms.internal.ads.zzcz;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzfya;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgbe;
import com.google.android.gms.internal.ads.zzgbf;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzvo;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

final class zzoz {
    private final zzcz zza;
    private zzgbc zzb;
    private zzgbf zzc;
    private zzvo zzd;
    private zzvo zze;
    private zzvo zzf;

    public zzoz(zzcz object) {
        this.zza = object;
        this.zzb = object = zzgbc.zzm();
        this.zzc = object = zzgbf.zzd();
    }

    public static /* bridge */ /* synthetic */ zzgbc zzf(zzoz zzoz2) {
        return zzoz2.zzb;
    }

    private static zzvo zzj(zzct zzct2, zzgbc zzgbc2, zzvo zzvo2, zzcz zzcz2) {
        boolean bl2;
        boolean bl3;
        int n3;
        int n4;
        int n7;
        Object object;
        zzdc zzdc2 = zzct2.zzn();
        int n8 = zzct2.zze();
        boolean bl32 = zzdc2.zzo();
        if (bl32) {
            bl32 = false;
            object = null;
        } else {
            object = zzdc2.zzf(n8);
        }
        boolean bl4 = zzct2.zzx();
        int bl5 = -1;
        if (bl4 || (bl4 = zzdc2.zzo())) {
            n7 = -1;
        } else {
            zzcz2 = zzdc2.zzd(n8, zzcz2, false);
            long l2 = zzgd.zzr(zzct2.zzk());
            n7 = zzcz2.zzc(l2);
        }
        zzdc2 = null;
        for (int i3 = 0; i3 < (n8 = zzgbc2.size()); ++i3) {
            boolean bl6;
            zzvo zzvo3 = (zzvo)zzgbc2.get(i3);
            bl4 = zzoz.zzm(zzvo3, object, bl6 = zzct2.zzx(), n4 = zzct2.zzb(), n3 = zzct2.zzc(), n7);
            if (!bl4) continue;
            return zzvo3;
        }
        boolean bl7 = zzgbc2.isEmpty();
        if (bl7 && zzvo2 != null && (bl3 = zzoz.zzm(zzvo2, object, bl2 = zzct2.zzx(), n4 = zzct2.zzb(), n3 = zzct2.zzc(), n7))) {
            return zzvo2;
        }
        return null;
    }

    private final void zzk(zzgbe zzgbe2, zzvo zzvo2, zzdc zzdc2) {
        if (zzvo2 != null) {
            int n3;
            Object object = zzvo2.zza;
            int n4 = zzdc2.zza(object);
            if (n4 != (n3 = -1)) {
                zzgbe2.zza(zzvo2, zzdc2);
                return;
            }
            zzdc2 = (zzdc)this.zzc.get(zzvo2);
            if (zzdc2 != null) {
                zzgbe2.zza(zzvo2, zzdc2);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private final void zzl(zzdc object) {
        zzgbe zzgbe2 = new zzgbe();
        Object object2 = this.zzb;
        boolean n3 = ((AbstractCollection)object2).isEmpty();
        if (n3) {
            boolean bl2;
            boolean bl3;
            object2 = this.zze;
            this.zzk(zzgbe2, (zzvo)object2, (zzdc)object);
            object2 = this.zzf;
            zzvo zzvo2 = this.zze;
            boolean bl4 = zzfya.zza(object2, zzvo2);
            if (!bl4) {
                object2 = this.zzf;
                this.zzk(zzgbe2, (zzvo)object2, (zzdc)object);
            }
            if (!(bl3 = zzfya.zza(object2 = this.zzd, zzvo2 = this.zze)) && !(bl2 = zzfya.zza(object2 = this.zzd, zzvo2 = this.zzf))) {
                object2 = this.zzd;
                this.zzk(zzgbe2, (zzvo)object2, (zzdc)object);
            }
        } else {
            Object object3;
            int n4;
            void var4_9;
            boolean bl5 = false;
            object2 = null;
            while (var4_9 < (n4 = ((AbstractCollection)(object3 = this.zzb)).size())) {
                object3 = (zzvo)this.zzb.get((int)var4_9);
                this.zzk(zzgbe2, (zzvo)object3, (zzdc)object);
                ++var4_9;
            }
            object2 = this.zzb;
            object3 = this.zzd;
            boolean bl6 = ((zzgbc)object2).contains(object3);
            if (!bl6) {
                object2 = this.zzd;
                this.zzk(zzgbe2, (zzvo)object2, (zzdc)object);
            }
        }
        this.zzc = object = zzgbe2.zzc();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean zzm(zzvo zzvo2, Object object, boolean n3, int n4, int n7, int n8) {
        boolean bl2 = zzvo2.zza.equals(object);
        boolean bl3 = false;
        if (!bl2) {
            return false;
        }
        bl2 = true;
        if (n3 != 0) {
            n3 = zzvo2.zzb;
            if (n3 != n4) return bl3;
            int n10 = zzvo2.zzc;
            if (n10 != n7) return false;
            return true;
        }
        n3 = zzvo2.zzb;
        n4 = -1;
        if (n3 != n4) return bl3;
        int n14 = zzvo2.zze;
        if (n14 != n8) return bl3;
        return true;
    }

    public final zzdc zza(zzvo zzvo2) {
        return (zzdc)this.zzc.get(zzvo2);
    }

    public final zzvo zzb() {
        return this.zzd;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final zzvo zzc() {
        Object e2;
        boolean bl2;
        Object object = this.zzb;
        boolean bl3 = ((AbstractCollection)object).isEmpty();
        if (bl3) {
            return null;
        }
        object = this.zzb;
        int n3 = object instanceof List;
        if (n3 != 0) {
            n3 = ((List)object).isEmpty();
            if (n3 == 0) {
                n3 = ((List)object).size() + -1;
                object = ((List)object).get(n3);
                return (zzvo)object;
            }
            object = new NoSuchElementException();
            throw object;
        }
        object = object.iterator();
        do {
            e2 = object.next();
        } while (bl2 = object.hasNext());
        object = e2;
        return (zzvo)object;
    }

    public final zzvo zzd() {
        return this.zze;
    }

    public final zzvo zze() {
        return this.zzf;
    }

    public final void zzg(zzct object) {
        zzgbc zzgbc2 = this.zzb;
        zzvo zzvo2 = this.zze;
        zzcz zzcz2 = this.zza;
        this.zzd = object = zzoz.zzj((zzct)object, zzgbc2, zzvo2, zzcz2);
    }

    public final void zzh(List object, zzvo zzvo2, zzct zzct2) {
        Object object2 = zzgbc.zzk((Collection)object);
        this.zzb = object2;
        boolean bl2 = object.isEmpty();
        if (!bl2) {
            bl2 = false;
            object2 = null;
            this.zze = object = (zzvo)object.get(0);
            zzvo2.getClass();
            this.zzf = zzvo2;
        }
        if ((object = this.zzd) == null) {
            object = this.zzb;
            zzvo2 = this.zze;
            object2 = this.zza;
            this.zzd = object = zzoz.zzj(zzct2, (zzgbc)object, zzvo2, (zzcz)object2);
        }
        object = zzct2.zzn();
        this.zzl((zzdc)object);
    }

    public final void zzi(zzct object) {
        Object object2 = this.zzb;
        zzvo zzvo2 = this.zze;
        zzcz zzcz2 = this.zza;
        this.zzd = object2 = zzoz.zzj((zzct)object, (zzgbc)object2, zzvo2, zzcz2);
        object = object.zzn();
        this.zzl((zzdc)object);
    }
}

