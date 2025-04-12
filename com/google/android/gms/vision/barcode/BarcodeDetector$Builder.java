/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.vision.barcode;

import android.content.Context;
import com.google.android.gms.internal.vision.zzk;
import com.google.android.gms.internal.vision.zzm;
import com.google.android.gms.vision.barcode.BarcodeDetector;

public class BarcodeDetector$Builder {
    private Context zza;
    private zzk zzb;

    public BarcodeDetector$Builder(Context object) {
        this.zza = object;
        this.zzb = object;
    }

    public BarcodeDetector build() {
        Object object = this.zza;
        zzk zzk2 = this.zzb;
        zzm zzm2 = new zzm((Context)object, zzk2);
        object = new BarcodeDetector(zzm2, null);
        return object;
    }

    public BarcodeDetector$Builder setBarcodeFormats(int n3) {
        this.zzb.zza = n3;
        return this;
    }
}

