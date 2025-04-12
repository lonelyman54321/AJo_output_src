/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.install;

import com.google.android.play.core.install.InstallState;

final class zza
extends InstallState {
    private final int zza;
    private final long zzb;
    private final long zzc;
    private final int zzd;
    private final String zze;

    public zza(int n3, long l2, long l3, int n4, String string2) {
        this.zza = n3;
        this.zzb = l2;
        this.zzc = l3;
        this.zzd = n4;
        if (string2 != null) {
            this.zze = string2;
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("Null packageName");
        throw nullPointerException;
    }

    public final long bytesDownloaded() {
        return this.zzb;
    }

    public final boolean equals(Object object) {
        String string2;
        boolean bl2;
        long l2;
        long l3;
        long l4;
        long l7;
        int n3;
        boolean bl3 = true;
        if (object == this) {
            return bl3;
        }
        int n4 = object instanceof InstallState;
        if (n4 != 0 && (n4 = this.zza) == (n3 = ((InstallState)(object = (InstallState)object)).installStatus()) && (n4 = (int)((l7 = (l4 = this.zzb) - (l3 = ((InstallState)object).bytesDownloaded())) == 0L ? 0 : (l7 < 0L ? -1 : 1))) == 0 && (n4 = (int)((l2 = (l4 = this.zzc) - (l3 = ((InstallState)object).totalBytesToDownload())) == 0L ? 0 : (l2 < 0L ? -1 : 1))) == 0 && (n4 = this.zzd) == (n3 = ((InstallState)object).installErrorCode()) && (bl2 = (string2 = this.zze).equals(object = ((InstallState)object).packageName()))) {
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zza;
        int n4 = 1000003;
        n3 ^= n4;
        long l2 = this.zzb;
        int n7 = 32;
        long l3 = l2 >>> n7;
        l2 ^= l3;
        l3 = this.zzc;
        long l4 = l3 >>> n7 ^ l3;
        n3 *= n4;
        int n8 = (int)l2;
        n3 = (n3 ^ n8) * n4;
        int n10 = (int)l4;
        n3 = (n3 ^ n10) * n4;
        n10 = this.zzd;
        n3 ^= n10;
        n10 = this.zze.hashCode();
        return n3 * n4 ^ n10;
    }

    public final int installErrorCode() {
        return this.zzd;
    }

    public final int installStatus() {
        return this.zza;
    }

    public final String packageName() {
        return this.zze;
    }

    public final String toString() {
        int n3 = this.zza;
        long l2 = this.zzb;
        long l3 = this.zzc;
        int n4 = this.zzd;
        String string2 = this.zze;
        StringBuilder stringBuilder = new StringBuilder("InstallState{installStatus=");
        stringBuilder.append(n3);
        stringBuilder.append(", bytesDownloaded=");
        stringBuilder.append(l2);
        fn0_2.b(stringBuilder, ", totalBytesToDownload=", l3, ", installErrorCode=");
        stringBuilder.append(n4);
        stringBuilder.append(", packageName=");
        stringBuilder.append(string2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final long totalBytesToDownload() {
        return this.zzc;
    }
}

