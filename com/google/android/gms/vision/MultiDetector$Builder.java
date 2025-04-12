/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.vision;

import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.MultiDetector;

public class MultiDetector$Builder {
    private MultiDetector zza;

    public MultiDetector$Builder() {
        MultiDetector multiDetector;
        this.zza = multiDetector = new MultiDetector(null);
    }

    public MultiDetector$Builder add(Detector detector) {
        MultiDetector.zza(this.zza).add(detector);
        return this;
    }

    public MultiDetector build() {
        Object object = MultiDetector.zza(this.zza);
        int n3 = object.size();
        if (n3 != 0) {
            return this.zza;
        }
        object = new RuntimeException("No underlying detectors added to MultiDetector.");
        throw object;
    }
}

