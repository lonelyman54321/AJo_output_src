/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.hardware.Camera
 *  android.hardware.Camera$PictureCallback
 */
package com.google.android.gms.vision;

import android.hardware.Camera;
import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.CameraSource$PictureCallback;
import com.google.android.gms.vision.zza;

final class CameraSource$zzc
implements Camera.PictureCallback {
    private CameraSource$PictureCallback zza;
    private final /* synthetic */ CameraSource zzb;

    private CameraSource$zzc(CameraSource cameraSource) {
        this.zzb = cameraSource;
    }

    public /* synthetic */ CameraSource$zzc(CameraSource cameraSource, zza zza2) {
        this(cameraSource);
    }

    public static /* synthetic */ CameraSource$PictureCallback zza(CameraSource$zzc cameraSource$zzc, CameraSource$PictureCallback cameraSource$PictureCallback) {
        cameraSource$zzc.zza = cameraSource$PictureCallback;
        return cameraSource$PictureCallback;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onPictureTaken(byte[] object, Camera object2) {
        object2 = this.zza;
        if (object2 != null) {
            object2.onPictureTaken((byte[])object);
        }
        object = CameraSource.zza(this.zzb);
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        object2 = this.zzb;
                        object2 = CameraSource.zzb((CameraSource)object2);
                        if (object2 == null) break block4;
                        object2 = this.zzb;
                        object2 = CameraSource.zzb((CameraSource)object2);
                        object2.startPreview();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

