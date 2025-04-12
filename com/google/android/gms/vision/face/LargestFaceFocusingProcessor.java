/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.vision.face;

import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Detector$Detections;
import com.google.android.gms.vision.FocusingProcessor;
import com.google.android.gms.vision.Tracker;
import com.google.android.gms.vision.face.Face;

public class LargestFaceFocusingProcessor
extends FocusingProcessor {
    public LargestFaceFocusingProcessor(Detector detector, Tracker tracker) {
        super(detector, tracker);
    }

    public static /* synthetic */ void zza(LargestFaceFocusingProcessor largestFaceFocusingProcessor, int n3) {
        largestFaceFocusingProcessor.zza(n3);
    }

    public int selectFocus(Detector$Detections object) {
        int n3 = (object = ((Detector$Detections)object).getDetectedItems()).size();
        if (n3 != 0) {
            int n4;
            n3 = 0;
            int n7 = object.keyAt(0);
            Face face = (Face)object.valueAt(0);
            float f5 = face.getWidth();
            for (int i3 = 1; i3 < (n4 = object.size()); ++i3) {
                n4 = object.keyAt(i3);
                Face face2 = (Face)object.valueAt(i3);
                float f6 = face2.getWidth();
                float f7 = f6 - f5;
                Object object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
                if (object2 <= 0) continue;
                n7 = n4;
                f5 = f6;
            }
            return n7;
        }
        object = new IllegalArgumentException("No faces for selectFocus.");
        throw object;
    }
}

