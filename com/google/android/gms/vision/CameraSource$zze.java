/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.hardware.Camera$Size
 */
package com.google.android.gms.vision;

import android.hardware.Camera;
import com.google.android.gms.common.images.Size;

final class CameraSource$zze {
    private Size zza;
    private Size zzb;

    public CameraSource$zze(Camera.Size object, Camera.Size size) {
        Size size2;
        int n3 = object.width;
        int n4 = object.height;
        this.zza = size2 = new Size(n3, n4);
        if (size != null) {
            int n7 = size.width;
            int n8 = size.height;
            super(n7, n8);
            this.zzb = object;
        }
    }

    public final Size zza() {
        return this.zza;
    }

    public final Size zzb() {
        return this.zzb;
    }
}

