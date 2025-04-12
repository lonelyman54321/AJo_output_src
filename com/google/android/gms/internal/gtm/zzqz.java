/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzln;
import com.google.android.gms.internal.gtm.zzmc;
import com.google.android.gms.internal.gtm.zzmd;
import com.google.android.gms.internal.gtm.zzme;
import com.google.android.gms.internal.gtm.zzmf;
import com.google.android.gms.internal.gtm.zzmg;
import com.google.android.gms.internal.gtm.zzmh;
import com.google.android.gms.internal.gtm.zzmi;
import com.google.android.gms.internal.gtm.zzmj;
import com.google.android.gms.internal.gtm.zzmk;
import com.google.android.gms.internal.gtm.zzml;
import com.google.android.gms.internal.gtm.zzmm;
import com.google.android.gms.internal.gtm.zzmn;
import com.google.android.gms.internal.gtm.zzmo;
import com.google.android.gms.internal.gtm.zzmp;
import com.google.android.gms.internal.gtm.zzmq;
import com.google.android.gms.internal.gtm.zzmr;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class zzqz
extends zzqo {
    private static final Map zzb;
    private final String zzc;

    static {
        HashMap<String, zzjo> hashMap = new HashMap<String, zzjo>();
        zzjo zzjo2 = new zzmc();
        hashMap.put("charAt", zzjo2);
        zzjo2 = new zzmd();
        hashMap.put("concat", zzjo2);
        zzln zzln2 = zzln.zza;
        hashMap.put("hasOwnProperty", zzln2);
        zzjo2 = new zzme();
        hashMap.put("indexOf", zzjo2);
        zzjo2 = new zzmf();
        hashMap.put("lastIndexOf", zzjo2);
        zzjo2 = new zzmg();
        hashMap.put("match", zzjo2);
        zzjo2 = new zzmh();
        hashMap.put("replace", zzjo2);
        zzjo2 = new zzmi();
        hashMap.put("search", zzjo2);
        zzjo2 = new zzmj();
        hashMap.put("slice", zzjo2);
        zzjo2 = new zzmk();
        hashMap.put("split", zzjo2);
        zzjo2 = new zzml();
        hashMap.put("substring", zzjo2);
        zzjo2 = new zzmm();
        hashMap.put("toLocaleLowerCase", zzjo2);
        zzjo2 = new zzmn();
        hashMap.put("toLocaleUpperCase", zzjo2);
        zzjo2 = new zzmo();
        hashMap.put("toLowerCase", zzjo2);
        zzjo2 = new zzmq();
        hashMap.put("toUpperCase", zzjo2);
        zzjo2 = new zzmp();
        hashMap.put("toString", zzjo2);
        zzjo2 = new zzmr();
        hashMap.put("trim", zzjo2);
        zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzqz(String string2) {
        Preconditions.checkNotNull(string2);
        this.zzc = string2;
    }

    public static /* bridge */ /* synthetic */ String zzj(zzqz zzqz2) {
        return zzqz2.zzc;
    }

    public final boolean equals(Object object) {
        block4: {
            boolean bl2;
            block3: {
                block2: {
                    if (this != object) break block2;
                    bl2 = true;
                    break block3;
                }
                boolean bl3 = object instanceof zzqz;
                if (bl3) break block4;
                bl2 = false;
                object = null;
            }
            return bl2;
        }
        String string2 = this.zzc;
        object = ((zzqz)object).zzc;
        return string2.equals(object);
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzjm zza(String string2) {
        boolean bl2 = this.zzg(string2);
        if (bl2) {
            return (zzjm)zzb.get(string2);
        }
        string2 = cP.a("Native Method ", string2, " is not defined for type ListWrapper.");
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final /* synthetic */ Object zzc() {
        return this.zzc;
    }

    public final Iterator zze() {
        zzqy zzqy2 = new zzqy(this);
        return zzqy2;
    }

    public final boolean zzg(String string2) {
        return zzb.containsKey(string2);
    }

    public final zzqo zzi(int n3) {
        zzqo zzqo2;
        String string2;
        int n4;
        if (n3 >= 0 && n3 < (n4 = (string2 = this.zzc).length())) {
            string2 = this.zzc;
            n3 = string2.charAt(n3);
            String string3 = String.valueOf((char)n3);
            zzqo2 = new zzqz(string3);
        } else {
            zzqo2 = zzqs.zze;
        }
        return zzqo2;
    }

    public final String zzk() {
        return this.zzc;
    }
}

