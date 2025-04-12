/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzch;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzco;
import java.io.File;

final class zzck
implements zzci {
    public final /* synthetic */ String zza(File file, String string2) {
        zzco zzco2 = zzco.zza;
        return this.zza(file, string2, zzco2);
    }

    public final /* synthetic */ String zza(File object, String string2, zzco zzco2) {
        File file = new File((File)object, string2);
        object = file.getPath();
        return this.zza((String)object, zzco2);
    }

    public final /* synthetic */ String zza(String string2) {
        zzco zzco2 = zzco.zza;
        return this.zza(string2, zzco2);
    }

    public final /* synthetic */ String zza(String string2, zzco zzco2) {
        zzcl zzcl2 = zzcl.zza;
        return this.zzb(string2, zzco2, zzcl2);
    }

    public final String zza(String string2, zzco zzco2, zzcl zzcl2) {
        return string2;
    }

    public final /* synthetic */ String zzb(String string2, zzco zzco2, zzcl zzcl2) {
        return zzch.zza(this, string2, zzco2, zzcl2);
    }
}

