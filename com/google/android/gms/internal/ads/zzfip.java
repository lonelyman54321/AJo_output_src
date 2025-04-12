/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.ParcelFileDescriptor
 */
package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzfio;
import com.google.android.gms.internal.ads.zzgge;
import java.io.InputStream;

public final class zzfip {
    public static ParcelFileDescriptor zza(InputStream inputStream) {
        ParcelFileDescriptor parcelFileDescriptor = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor[0];
        parcelFileDescriptor = parcelFileDescriptor[1];
        zzgge zzgge2 = zzcci.zza;
        zzfio zzfio2 = new zzfio(inputStream, parcelFileDescriptor);
        zzgge2.execute(zzfio2);
        return parcelFileDescriptor2;
    }
}

