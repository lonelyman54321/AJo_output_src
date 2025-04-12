/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.hardware.Camera
 *  android.hardware.Camera$PreviewCallback
 */
package com.google.android.gms.vision;

import android.hardware.Camera;
import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.zza;

final class CameraSource$zzb
implements Camera.PreviewCallback {
    private final /* synthetic */ CameraSource zza;

    private CameraSource$zzb(CameraSource cameraSource) {
        this.zza = cameraSource;
    }

    public /* synthetic */ CameraSource$zzb(CameraSource cameraSource, zza zza2) {
        this(cameraSource);
    }

    public final void onPreviewFrame(byte[] byArray, Camera camera) {
        CameraSource.zzc(this.zza).zza(byArray, camera);
    }
}

