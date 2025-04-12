/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitcompat;

import com.google.android.play.core.splitcompat.zzk;
import com.google.android.play.core.splitcompat.zzn;
import com.google.android.play.core.splitcompat.zzt;
import java.util.Set;
import java.util.zip.ZipFile;

final class zzi
implements zzk {
    final /* synthetic */ Set zza;
    final /* synthetic */ zzt zzb;
    final /* synthetic */ zzn zzc;

    public zzi(zzn zzn2, Set set, zzt zzt2) {
        this.zzc = zzn2;
        this.zza = set;
        this.zzb = zzt2;
    }

    public final void zza(ZipFile object, Set set) {
        Set set2 = this.zza;
        zzn zzn2 = this.zzc;
        zzt zzt2 = this.zzb;
        object = zzn.zza(zzn2, set, zzt2, (ZipFile)object);
        set2.addAll(object);
    }
}

