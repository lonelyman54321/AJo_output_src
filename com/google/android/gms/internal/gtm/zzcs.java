/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.ApplicationInfo
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.gtm;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzeh;
import java.util.HashSet;
import java.util.Set;

public final class zzcs {
    private final zzbu zza;
    private volatile Boolean zzb;
    private String zzc;
    private Set zzd;

    public zzcs(zzbu zzbu2) {
        Preconditions.checkNotNull(zzbu2);
        this.zza = zzbu2;
    }

    public static final long zzc() {
        return (Long)zzeh.zzy.zzb();
    }

    public static final long zzd() {
        return (Long)zzeh.zzg.zzb();
    }

    public static final long zze() {
        return (Long)zzeh.zzf.zzb();
    }

    public static final int zzf() {
        return (Integer)zzeh.zzr.zzb();
    }

    public static final int zzg() {
        return (Integer)zzeh.zzj.zzb();
    }

    public static final int zzh() {
        return (Integer)zzeh.zzi.zzb();
    }

    public static final String zzi() {
        return (String)zzeh.zzl.zzb();
    }

    public static final String zzj() {
        return (String)zzeh.zzm.zzb();
    }

    public static final String zzk() {
        return (String)zzeh.zzk.zzb();
    }

    public static final boolean zzl() {
        return (Boolean)zzeh.zza.zzb();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Set zza() {
        String string2;
        String string3 = (String)zzeh.zzu.zzb();
        Set set = this.zzd;
        if (set != null && (string2 = this.zzc) != null) {
            boolean bl2 = string2.equals(string3);
            if (bl2) return this.zzd;
        }
        String[] stringArray = TextUtils.split((String)string3, (String)",");
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int n3 = stringArray.length;
        int n4 = 0;
        while (true) {
            if (n4 >= n3) {
                this.zzc = string3;
                this.zzd = hashSet;
                return this.zzd;
            }
            String string4 = stringArray[n4];
            try {
                int n7 = Integer.parseInt(string4);
                Integer n8 = n7;
                hashSet.add(n8);
            }
            catch (NumberFormatException numberFormatException) {}
            ++n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzb() {
        Object object = this.zzb;
        if (object != null) return this.zzb;
        synchronized (this) {
            Throwable throwable2;
            block6: {
                boolean bl2;
                String string2;
                block4: {
                    boolean bl3;
                    block5: {
                        try {
                            object = this.zzb;
                            if (object != null) return this.zzb;
                            object = this.zza;
                            object = ((zzbu)object).zza();
                            object = object.getApplicationInfo();
                            string2 = ProcessUtils.getMyProcessName();
                            if (object == null) break block4;
                            object = ((ApplicationInfo)object).processName;
                            bl3 = false;
                            if (object == null || !(bl2 = ((String)object).equals(string2))) break block5;
                            bl3 = true;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    this.zzb = object = Boolean.valueOf(bl3);
                }
                if (((object = this.zzb) == null || !(bl2 = ((Boolean)(object = this.zzb)).booleanValue())) && (bl2 = ((String)(object = "com.google.android.gms.analytics")).equals(string2))) {
                    this.zzb = object = Boolean.TRUE;
                }
                if ((object = this.zzb) != null) return this.zzb;
                this.zzb = object = Boolean.TRUE;
                object = this.zza;
                object = ((zzbu)object).zzm();
                string2 = "My process not in the list of running processes";
                ((zzbq)object).zzI(string2);
                return this.zzb;
            }
            throw throwable2;
        }
    }
}

