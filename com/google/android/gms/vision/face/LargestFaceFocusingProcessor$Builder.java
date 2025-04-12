/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.vision.face;

import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Tracker;
import com.google.android.gms.vision.face.LargestFaceFocusingProcessor;

public class LargestFaceFocusingProcessor$Builder {
    private LargestFaceFocusingProcessor zza;

    public LargestFaceFocusingProcessor$Builder(Detector detector, Tracker tracker) {
        LargestFaceFocusingProcessor largestFaceFocusingProcessor;
        this.zza = largestFaceFocusingProcessor = new LargestFaceFocusingProcessor(detector, tracker);
    }

    public LargestFaceFocusingProcessor build() {
        return this.zza;
    }

    public LargestFaceFocusingProcessor$Builder setMaxGapFrames(int n3) {
        LargestFaceFocusingProcessor.zza(this.zza, n3);
        return this;
    }
}

