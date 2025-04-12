/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.vision.face;

import android.content.Context;
import com.google.android.gms.vision.face.FaceDetector;
import com.google.android.gms.vision.face.internal.client.zzb;
import com.google.android.gms.vision.face.internal.client.zzf;

public class FaceDetector$Builder {
    private final Context zza;
    private int zzb = 0;
    private boolean zzc = false;
    private int zzd = 0;
    private boolean zze = true;
    private int zzf = 0;
    private float zzg = -1.0f;

    public FaceDetector$Builder(Context context) {
        this.zza = context;
    }

    public FaceDetector build() {
        float f5;
        int n3;
        Object object = new zzf();
        ((zzf)object).zza = n3 = this.zzf;
        ((zzf)object).zzb = n3 = this.zzb;
        ((zzf)object).zzc = n3 = this.zzd;
        n3 = (int)(this.zzc ? 1 : 0);
        ((zzf)object).zzd = n3;
        n3 = (int)(this.zze ? 1 : 0);
        ((zzf)object).zze = n3;
        ((zzf)object).zzf = f5 = this.zzg;
        n3 = (int)(FaceDetector.zza((zzf)object) ? 1 : 0);
        if (n3 != 0) {
            Context context = this.zza;
            zzb zzb2 = new zzb(context, (zzf)object);
            object = new FaceDetector(zzb2, null);
            return object;
        }
        object = new IllegalArgumentException("Invalid build options");
        throw object;
    }

    public FaceDetector$Builder setClassificationType(int n3) {
        int n4;
        if (n3 != 0 && n3 != (n4 = 1)) {
            String string2 = tk3_2.a(40, n3, "Invalid classification type: ");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        this.zzd = n3;
        return this;
    }

    public FaceDetector$Builder setLandmarkType(int n3) {
        int n4;
        if (n3 != 0 && n3 != (n4 = 1) && n3 != (n4 = 2)) {
            String string2 = tk3_2.a(34, n3, "Invalid landmark type: ");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        this.zzb = n3;
        return this;
    }

    public FaceDetector$Builder setMinFaceSize(float f5) {
        float f6;
        float f7 = 0.0f;
        IllegalArgumentException illegalArgumentException = null;
        float f8 = f5 - 0.0f;
        Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object >= 0 && (object = (f6 = f5 - (f7 = 1.0f)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) <= 0) {
            this.zzg = f5;
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder(47);
        stringBuilder.append("Invalid proportional face size: ");
        stringBuilder.append(f5);
        String string2 = stringBuilder.toString();
        illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public FaceDetector$Builder setMode(int n3) {
        int n4;
        if (n3 != 0 && n3 != (n4 = 1) && n3 != (n4 = 2)) {
            String string2 = tk3_2.a(25, n3, "Invalid mode: ");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        this.zzf = n3;
        return this;
    }

    public FaceDetector$Builder setProminentFaceOnly(boolean bl2) {
        this.zzc = bl2;
        return this;
    }

    public FaceDetector$Builder setTrackingEnabled(boolean bl2) {
        this.zze = bl2;
        return this;
    }
}

