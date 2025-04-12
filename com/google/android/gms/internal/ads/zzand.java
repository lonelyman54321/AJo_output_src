/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzfxm;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class zzand {
    private String zza;
    private String zzb;
    private Set zzc;
    private String zzd;
    private String zze;
    private int zzf;
    private boolean zzg;
    private int zzh;
    private boolean zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private float zzn;
    private int zzo;
    private boolean zzp;

    public zzand() {
        int n3;
        Set set;
        String string2;
        this.zza = string2 = "";
        this.zzb = string2;
        this.zzc = set = Collections.emptySet();
        this.zzd = string2;
        this.zze = null;
        this.zzg = false;
        this.zzi = false;
        this.zzj = n3 = -1;
        this.zzk = n3;
        this.zzl = n3;
        this.zzm = n3;
        this.zzo = n3;
        this.zzp = false;
    }

    private static int zzA(int n3, String string2, String string3, int n4) {
        int n7 = string2.isEmpty();
        if (n7 == 0 && n3 != (n7 = -1)) {
            boolean bl2 = string2.equals(string3);
            if (bl2) {
                return n3 + n4;
            }
            return n7;
        }
        return n3;
    }

    public final float zza() {
        return this.zzn;
    }

    public final int zzb() {
        boolean bl2 = this.zzi;
        if (bl2) {
            return this.zzh;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Background color not defined.");
        throw illegalStateException;
    }

    public final int zzc() {
        boolean bl2 = this.zzg;
        if (bl2) {
            return this.zzf;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Font color not defined");
        throw illegalStateException;
    }

    public final int zzd() {
        return this.zzm;
    }

    public final int zze() {
        return this.zzo;
    }

    public final int zzf(String string2, String object, Set set, String string3) {
        int n3;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        Object object2 = this.zza;
        boolean n4 = ((String)object2).isEmpty();
        if (n4 && (bl4 = ((String)(object2 = this.zzb)).isEmpty()) && (bl3 = (object2 = this.zzc).isEmpty()) && (bl2 = ((String)(object2 = this.zzd)).isEmpty())) {
            boolean bl5 = TextUtils.isEmpty((CharSequence)object);
            if (bl5) {
                return 1;
            }
            return 0;
        }
        object2 = this.zza;
        int n7 = zzand.zzA(0, (String)object2, string2, 0x40000000);
        object2 = this.zzb;
        int n8 = 2;
        n7 = zzand.zzA(n7, (String)object2, (String)object, n8);
        object = this.zzd;
        int n10 = 4;
        if ((n7 = zzand.zzA(n7, (String)object, string3, n10)) != (n3 = -1) && (n3 = (int)(set.containsAll((Collection<?>)(object = this.zzc)) ? 1 : 0)) != 0) {
            return this.zzc.size() * 4 + n7;
        }
        return 0;
    }

    public final int zzg() {
        int n3;
        int n4 = this.zzk;
        int n7 = -1;
        if (n4 == n7 && (n3 = this.zzl) == n7) {
            return n7;
        }
        n7 = 0;
        n3 = 1;
        n4 = n4 == n3 ? 1 : 0;
        int n8 = this.zzl;
        if (n8 == n3) {
            n7 = 2;
        }
        return n4 | n7;
    }

    public final zzand zzh(int n3) {
        this.zzh = n3;
        this.zzi = true;
        return this;
    }

    public final zzand zzi(boolean bl2) {
        this.zzk = 1;
        return this;
    }

    public final zzand zzj(boolean bl2) {
        this.zzp = bl2;
        return this;
    }

    public final zzand zzk(int n3) {
        this.zzf = n3;
        this.zzg = true;
        return this;
    }

    public final zzand zzl(String string2) {
        this.zze = string2 = zzfxm.zza(string2);
        return this;
    }

    public final zzand zzm(float f5) {
        this.zzn = f5;
        return this;
    }

    public final zzand zzn(int n3) {
        this.zzm = n3;
        return this;
    }

    public final zzand zzo(boolean bl2) {
        this.zzl = 1;
        return this;
    }

    public final zzand zzp(int n3) {
        this.zzo = n3;
        return this;
    }

    public final zzand zzq(boolean bl2) {
        this.zzj = 1;
        return this;
    }

    public final String zzr() {
        return this.zze;
    }

    public final void zzs(String[] object) {
        HashSet hashSet;
        object = Arrays.asList(object);
        this.zzc = hashSet = new HashSet(object);
    }

    public final void zzt(String string2) {
        this.zza = string2;
    }

    public final void zzu(String string2) {
        this.zzb = string2;
    }

    public final void zzv(String string2) {
        this.zzd = string2;
    }

    public final boolean zzw() {
        return this.zzp;
    }

    public final boolean zzx() {
        return this.zzi;
    }

    public final boolean zzy() {
        return this.zzg;
    }

    public final boolean zzz() {
        int n3 = this.zzj;
        int n4 = 1;
        if (n3 == n4) {
            return n4 != 0;
        }
        return false;
    }
}

