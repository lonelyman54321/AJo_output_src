/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package com.google.android.gms.vision;

import android.util.SparseArray;
import com.google.android.gms.vision.Frame$Metadata;

public class Detector$Detections {
    private final SparseArray zza;
    private final Frame.Metadata zzb;
    private final boolean zzc;

    public Detector$Detections(SparseArray sparseArray, Frame.Metadata metadata, boolean bl2) {
        this.zza = sparseArray;
        this.zzb = metadata;
        this.zzc = bl2;
    }

    public boolean detectorIsOperational() {
        return this.zzc;
    }

    public SparseArray getDetectedItems() {
        return this.zza;
    }

    public Frame.Metadata getFrameMetadata() {
        return this.zzb;
    }
}

