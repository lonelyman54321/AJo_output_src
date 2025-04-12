/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzaqn;
import com.google.android.gms.internal.ads.zzaqs;
import com.google.android.gms.internal.ads.zzara;
import com.google.android.gms.internal.ads.zzarc;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzarh;
import com.google.android.gms.internal.ads.zzari;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzarn;
import com.google.android.gms.internal.ads.zzarp;
import java.util.Collections;
import java.util.Map;

public abstract class zzare
implements Comparable {
    private final zzarp zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzari zzf;
    private Integer zzg;
    private zzarh zzh;
    private boolean zzi;
    private zzaqn zzj;
    private zzard zzk;
    private final zzaqs zzl;

    public zzare(int n3, String string2, zzari zzari2) {
        Object object;
        int n4 = zzarp.zza;
        if (n4 != 0) {
            object = new zzarp();
        } else {
            n4 = 0;
            object = null;
        }
        this.zza = object;
        this.zze = object = new Object();
        n4 = 0;
        object = null;
        this.zzi = false;
        this.zzj = null;
        this.zzb = n3;
        this.zzc = string2;
        this.zzf = zzari2;
        Object object2 = new zzaqs();
        this.zzl = object2;
        n3 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0);
        if (n3 == 0 && (object2 = Uri.parse((String)string2)) != null && (object2 = object2.getHost()) != null) {
            n4 = ((String)object2).hashCode();
        }
        this.zzd = n4;
    }

    public static /* bridge */ /* synthetic */ zzarp zzi(zzare zzare2) {
        return zzare2.zza;
    }

    public final String toString() {
        String string2 = String.valueOf(Integer.toHexString(this.zzd));
        this.zzw();
        Integer n3 = this.zzg;
        StringBuilder stringBuilder = new StringBuilder("[ ] ");
        String string3 = this.zzc;
        stringBuilder.append(string3);
        stringBuilder.append(" ");
        string2 = "0x".concat(string2);
        stringBuilder.append(string2);
        stringBuilder.append(" NORMAL ");
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzaqn zzd() {
        return this.zzj;
    }

    public final zzare zze(zzaqn zzaqn2) {
        this.zzj = zzaqn2;
        return this;
    }

    public final zzare zzf(zzarh zzarh2) {
        this.zzh = zzarh2;
        return this;
    }

    public final zzare zzg(int n3) {
        Integer n4;
        this.zzg = n4 = Integer.valueOf(n3);
        return this;
    }

    public abstract zzark zzh(zzara var1);

    public final String zzj() {
        int n3 = this.zzb;
        String string2 = this.zzc;
        if (n3 != 0) {
            return n1.a(Integer.toString(1), "-", string2);
        }
        return string2;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() {
        return Collections.emptyMap();
    }

    public final void zzm(String string2) {
        boolean bl2 = zzarp.zza;
        if (bl2) {
            zzarp zzarp2 = this.zza;
            Thread thread2 = Thread.currentThread();
            long l2 = thread2.getId();
            zzarp2.zza(string2, l2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzn(zzarn zzarn2) {
        zzari zzari2;
        Object object = this.zze;
        synchronized (object) {
            zzari2 = this.zzf;
        }
        zzari2.zza(zzarn2);
    }

    public abstract void zzo(Object var1);

    public final void zzp(String object) {
        boolean bl2;
        Object object2 = this.zzh;
        if (object2 != null) {
            ((zzarh)object2).zzb(this);
        }
        if (bl2 = zzarp.zza) {
            Object object3;
            object2 = Thread.currentThread();
            long l2 = ((Thread)object2).getId();
            Object object4 = Looper.myLooper();
            if (object4 != (object3 = Looper.getMainLooper())) {
                object3 = Looper.getMainLooper();
                object4 = new Handler(object3);
                object3 = new zzarc(this, (String)object, l2);
                object4.post((Runnable)object3);
                return;
            }
            object4 = this.zza;
            ((zzarp)object4).zza((String)object, l2);
            object = this.zza;
            object2 = this.toString();
            ((zzarp)object).zzb((String)object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzq() {
        Object object = this.zze;
        synchronized (object) {
            boolean bl2;
            this.zzi = bl2 = true;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzr() {
        Object object = this.zze;
        // MONITORENTER : object
        zzard zzard2 = this.zzk;
        // MONITOREXIT : object
        if (zzard2 == null) return;
        zzard2.zza(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzs(zzark zzark2) {
        Object object = this.zze;
        // MONITORENTER : object
        zzard zzard2 = this.zzk;
        // MONITOREXIT : object
        if (zzard2 == null) return;
        zzard2.zzb(this, zzark2);
    }

    public final void zzt(int n3) {
        zzarh zzarh2 = this.zzh;
        if (zzarh2 != null) {
            zzarh2.zzc(this, n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzu(zzard zzard2) {
        Object object = this.zze;
        synchronized (object) {
            this.zzk = zzard2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzv() {
        Object object = this.zze;
        synchronized (object) {
            return this.zzi;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean zzw() {
        Object object = this.zze;
        // MONITORENTER : object
        // MONITOREXIT : object
        return false;
    }

    public byte[] zzx() {
        return null;
    }

    public final zzaqs zzy() {
        return this.zzl;
    }
}

