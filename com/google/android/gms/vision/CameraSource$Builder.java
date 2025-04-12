/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.vision;

import android.content.Context;
import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.CameraSource$zza;
import com.google.android.gms.vision.Detector;

public class CameraSource$Builder {
    private final Detector zza;
    private CameraSource zzb;

    public CameraSource$Builder(Context object, Detector detector) {
        CameraSource cameraSource;
        this.zzb = cameraSource = new CameraSource(null);
        if (object != null) {
            if (detector != null) {
                this.zza = detector;
                CameraSource.zza(cameraSource, object);
                return;
            }
            super("No detector supplied.");
            throw object;
        }
        super("No context supplied.");
        throw object;
    }

    public CameraSource build() {
        CameraSource cameraSource = this.zzb;
        cameraSource.getClass();
        Detector detector = this.zza;
        CameraSource$zza cameraSource$zza = new CameraSource$zza(cameraSource, detector);
        CameraSource.zza(cameraSource, cameraSource$zza);
        return this.zzb;
    }

    public CameraSource$Builder setAutoFocusEnabled(boolean bl2) {
        CameraSource.zza(this.zzb, bl2);
        return this;
    }

    public CameraSource$Builder setFacing(int n3) {
        int n4;
        if (n3 != 0 && n3 != (n4 = 1)) {
            String string2 = tk3_2.a(27, n3, "Invalid camera: ");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        CameraSource.zzc(this.zzb, n3);
        return this;
    }

    public CameraSource$Builder setFocusMode(String object) {
        Object object2 = "continuous-video";
        boolean bl2 = ((String)object).equals(object2);
        if (!bl2 && !(bl2 = ((String)object).equals(object2 = "continuous-picture"))) {
            String string2 = "FocusMode ";
            object2 = new StringBuilder(string2);
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(" is not supported for now.");
            object = this.zzb;
            bl2 = false;
            object2 = null;
            CameraSource.zza((CameraSource)object, null);
        } else {
            object2 = this.zzb;
            CameraSource.zza((CameraSource)object2, (String)object);
        }
        return this;
    }

    public CameraSource$Builder setRequestedFps(float f5) {
        IllegalArgumentException illegalArgumentException = null;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (object > 0) {
            CameraSource.zza(this.zzb, f5);
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder(28);
        stringBuilder.append("Invalid fps: ");
        stringBuilder.append(f5);
        String string2 = stringBuilder.toString();
        illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public CameraSource$Builder setRequestedPreviewSize(int n3, int n4) {
        int n7;
        if (n3 > 0 && n3 <= (n7 = 1000000) && n4 > 0 && n4 <= n7) {
            CameraSource.zza(this.zzb, n3);
            CameraSource.zzb(this.zzb, n4);
            return this;
        }
        String string2 = C12.a(45, n3, n4, "Invalid preview size: ", "x");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }
}

