/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 */
package com.google.android.gms.vision.face;

import android.graphics.PointF;
import com.google.android.gms.vision.face.Contour;
import com.google.android.gms.vision.face.Landmark;
import java.util.Arrays;
import java.util.List;

public class Face {
    public static final float UNCOMPUTED_PROBABILITY = -1.0f;
    private int zza;
    private PointF zzb;
    private float zzc;
    private float zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private List zzh;
    private final List zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private final float zzm;

    public Face(int n3, PointF pointF, float f5, float f6, float f7, float f8, float f11, Landmark[] landmarkArray, Contour[] contourArray, float f12, float f14, float f15, float f16) {
        float f17;
        List<Object> list;
        this.zza = n3;
        this.zzb = pointF;
        this.zzc = f5;
        this.zzd = f6;
        this.zze = f7;
        this.zzf = f8;
        this.zzg = f11;
        this.zzh = list = Arrays.asList(landmarkArray);
        this.zzi = list = Arrays.asList(contourArray);
        this.zzj = f17 = Face.zza(f12);
        this.zzk = f17 = Face.zza(f14);
        this.zzl = f17 = Face.zza(f15);
        this.zzm = f17 = Face.zza(f16);
    }

    private static float zza(float f5) {
        float f6;
        float f7 = 0.0f;
        float f8 = f5 - 0.0f;
        Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object >= 0 && (object = (f6 = f5 - (f7 = 1.0f)) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) <= 0) {
            return f5;
        }
        return -1.0f;
    }

    public List getContours() {
        return this.zzi;
    }

    public float getEulerX() {
        return this.zzg;
    }

    public float getEulerY() {
        return this.zze;
    }

    public float getEulerZ() {
        return this.zzf;
    }

    public float getHeight() {
        return this.zzd;
    }

    public int getId() {
        return this.zza;
    }

    public float getIsLeftEyeOpenProbability() {
        return this.zzj;
    }

    public float getIsRightEyeOpenProbability() {
        return this.zzk;
    }

    public float getIsSmilingProbability() {
        return this.zzl;
    }

    public List getLandmarks() {
        return this.zzh;
    }

    public PointF getPosition() {
        PointF pointF = this.zzb;
        float f5 = pointF.x;
        float f6 = this.zzc;
        float f7 = 2.0f;
        float f8 = pointF.y;
        f6 = this.zzd / f7;
        PointF pointF2 = new PointF(f5 -= (f6 /= f7), f8 -= f6);
        return pointF2;
    }

    public float getWidth() {
        return this.zzc;
    }
}

