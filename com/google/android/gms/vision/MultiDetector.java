/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package com.google.android.gms.vision;

import android.util.SparseArray;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Detector$Processor;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.zzd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MultiDetector
extends Detector {
    private List zza;

    private MultiDetector() {
        ArrayList arrayList;
        this.zza = arrayList = new ArrayList();
    }

    public /* synthetic */ MultiDetector(zzd zzd2) {
        this();
    }

    public static /* synthetic */ List zza(MultiDetector multiDetector) {
        return multiDetector.zza;
    }

    public SparseArray detect(Frame object) {
        boolean bl2;
        Object object2 = new SparseArray();
        Iterator iterator = this.zza.iterator();
        while (bl2 = iterator.hasNext()) {
            int n3;
            SparseArray sparseArray = ((Detector)iterator.next()).detect((Frame)object);
            for (int i3 = 0; i3 < (n3 = sparseArray.size()); ++i3) {
                n3 = sparseArray.keyAt(i3);
                Object object3 = object2.get(n3);
                if (object3 == null) {
                    object3 = sparseArray.valueAt(i3);
                    object2.append(n3, object3);
                    continue;
                }
                object2 = oe2_0.a(104, n3, "Detection ID overlap for id = ", "  This means that one of the detectors is not using global IDs.");
                object = new IllegalStateException((String)object2);
                throw object;
            }
        }
        return object2;
    }

    public boolean isOperational() {
        boolean bl2;
        Iterator iterator = this.zza.iterator();
        while (bl2 = iterator.hasNext()) {
            Detector detector = (Detector)iterator.next();
            bl2 = detector.isOperational();
            if (bl2) continue;
            return false;
        }
        return true;
    }

    public void receiveFrame(Frame frame) {
        boolean bl2;
        Iterator iterator = this.zza.iterator();
        while (bl2 = iterator.hasNext()) {
            Detector detector = (Detector)iterator.next();
            detector.receiveFrame(frame);
        }
    }

    public void release() {
        boolean bl2;
        Iterator iterator = this.zza.iterator();
        while (bl2 = iterator.hasNext()) {
            Detector detector = (Detector)iterator.next();
            detector.release();
        }
        this.zza.clear();
    }

    public void setProcessor(Detector$Processor object) {
        object = new UnsupportedOperationException("MultiDetector.setProcessor is not supported.  You should set a processor instance on each underlying detector instead.");
        throw object;
    }
}

