/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzapo {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private String zze;

    public zzapo(int n3, int n4, int n7) {
        String string2;
        String string3 = "";
        int n8 = -1 << -1;
        if (n3 != n8) {
            String string4 = "/";
            string2 = UX.a(n3, string4);
        } else {
            string2 = string3;
        }
        this.zza = string2;
        this.zzb = n4;
        this.zzc = n7;
        this.zzd = n8;
        this.zze = string3;
    }

    private final void zzd() {
        int n3 = this.zzd;
        int n4 = -1 << -1;
        if (n3 != n4) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("generateNewId() must be called before retrieving ids.");
        throw illegalStateException;
    }

    public final int zza() {
        this.zzd();
        return this.zzd;
    }

    public final String zzb() {
        this.zzd();
        return this.zze;
    }

    public final void zzc() {
        String string2;
        int n3 = this.zzd;
        int n4 = -1 << -1;
        if (n3 == n4) {
            n3 = this.zzb;
        } else {
            n4 = this.zzc;
            n3 += n4;
        }
        this.zzd = n3;
        String string3 = this.zza;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append(n3);
        this.zze = string2 = stringBuilder.toString();
    }
}

