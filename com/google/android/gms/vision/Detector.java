/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package com.google.android.gms.vision;

import android.util.SparseArray;
import com.google.android.gms.vision.Detector$Detections;
import com.google.android.gms.vision.Detector$Processor;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.Frame$Metadata;

public abstract class Detector {
    private final Object zza;
    private Detector$Processor zzb;

    public Detector() {
        Object object;
        this.zza = object = new Object();
    }

    public abstract SparseArray detect(Frame var1);

    public boolean isOperational() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void receiveFrame(Frame object) {
        Object object2 = ((Frame)object).getMetadata();
        Object object3 = new Frame$Metadata((Frame$Metadata)object2);
        ((Frame$Metadata)object3).zza();
        object = this.detect((Frame)object);
        boolean bl2 = this.isOperational();
        Detector$Detections detector$Detections = new Detector$Detections((SparseArray)object, (Frame$Metadata)object3, bl2);
        object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                try {
                    object3 = this.zzb;
                    if (object3 != null) {
                        object3.receiveDetections(detector$Detections);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object2 = "Detector processor must first be set with setProcessor in order to receive detection results.";
                object3 = new IllegalStateException((String)object2);
                throw object3;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void release() {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        Detector$Processor detector$Processor = this.zzb;
                        if (detector$Processor == null) break block3;
                        detector$Processor.release();
                        detector$Processor = null;
                        this.zzb = null;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public boolean setFocus(int n3) {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setProcessor(Detector$Processor detector$Processor) {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        Detector$Processor detector$Processor2 = this.zzb;
                        if (detector$Processor2 == null) break block3;
                        detector$Processor2.release();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.zzb = detector$Processor;
                return;
            }
            throw throwable2;
        }
    }
}

