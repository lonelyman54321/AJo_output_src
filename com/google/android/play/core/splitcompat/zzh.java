/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitcompat;

import com.google.android.play.core.splitcompat.zzg;
import com.google.android.play.core.splitcompat.zzk;
import com.google.android.play.core.splitcompat.zzn;
import com.google.android.play.core.splitcompat.zzt;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

final class zzh
implements zzk {
    final /* synthetic */ zzt zza;
    final /* synthetic */ Set zzb;
    final /* synthetic */ AtomicBoolean zzc;
    final /* synthetic */ zzn zzd;

    public zzh(zzn zzn2, zzt zzt2, Set set, AtomicBoolean atomicBoolean) {
        this.zzd = zzn2;
        this.zza = zzt2;
        this.zzb = set;
        this.zzc = atomicBoolean;
    }

    public final void zza(ZipFile object, Set set) {
        object = this.zzd;
        zzt zzt2 = this.zza;
        zzg zzg2 = new zzg(this);
        zzn.zzd((zzn)object, zzt2, set, zzg2);
    }
}

