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
import com.google.android.gms.vision.MultiProcessor$Factory;
import com.google.android.gms.vision.MultiProcessor$zza;
import com.google.android.gms.vision.Tracker;
import com.google.android.gms.vision.zze;
import java.io.Serializable;
import java.util.HashSet;

public class MultiProcessor
implements Detector$Processor {
    private MultiProcessor$Factory zza;
    private SparseArray zzb;
    private int zzc;

    private MultiProcessor() {
        SparseArray sparseArray;
        this.zzb = sparseArray = new SparseArray();
        this.zzc = 3;
    }

    public /* synthetic */ MultiProcessor(zze zze2) {
        this();
    }

    public static /* synthetic */ int zza(MultiProcessor multiProcessor, int n3) {
        multiProcessor.zzc = n3;
        return n3;
    }

    public static /* synthetic */ MultiProcessor$Factory zza(MultiProcessor multiProcessor, MultiProcessor$Factory multiProcessor$Factory) {
        multiProcessor.zza = multiProcessor$Factory;
        return multiProcessor$Factory;
    }

    public void receiveDetections(Detector$Detections detector$Detections) {
        int n3;
        int n4;
        Object object;
        Object object2;
        int n7;
        int n8;
        Object object3 = detector$Detections.getDetectedItems();
        Serializable serializable = null;
        for (n8 = 0; n8 < (n7 = object3.size()); ++n8) {
            n7 = object3.keyAt(n8);
            object2 = object3.valueAt(n8);
            object = this.zzb.get(n7);
            if (object != null) continue;
            n4 = 0;
            object = new MultiProcessor$zza(this, null);
            Tracker tracker = this.zza.create(object2);
            MultiProcessor$zza.zza((MultiProcessor$zza)object, tracker);
            tracker = MultiProcessor$zza.zza((MultiProcessor$zza)object);
            tracker.onNewItem(n7, object2);
            object2 = this.zzb;
            object2.append(n7, object);
        }
        object3 = detector$Detections.getDetectedItems();
        serializable = new HashSet();
        Object object4 = null;
        for (n7 = 0; n7 < (n3 = (object2 = this.zzb).size()); ++n7) {
            object2 = this.zzb;
            n3 = object2.keyAt(n7);
            object = object3.get(n3);
            if (object != null) continue;
            object = (MultiProcessor$zza)this.zzb.valueAt(n7);
            MultiProcessor$zza.zzb((MultiProcessor$zza)object);
            n4 = MultiProcessor$zza.zzc((MultiProcessor$zza)object);
            int n10 = this.zzc;
            if (n4 >= n10) {
                object = MultiProcessor$zza.zza((MultiProcessor$zza)object);
                ((Tracker)object).onDone();
                object2 = n3;
                ((HashSet)serializable).add(object2);
                continue;
            }
            object2 = MultiProcessor$zza.zza((MultiProcessor$zza)object);
            ((Tracker)object2).onMissing(detector$Detections);
        }
        object3 = ((HashSet)serializable).iterator();
        while ((n8 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
            serializable = (Integer)object3.next();
            object4 = this.zzb;
            n8 = (Integer)serializable;
            object4.delete(n8);
        }
        object3 = detector$Detections.getDetectedItems();
        serializable = null;
        for (n8 = 0; n8 < (n7 = object3.size()); ++n8) {
            n7 = object3.keyAt(n8);
            object2 = object3.valueAt(n8);
            object = this.zzb;
            object4 = (MultiProcessor$zza)object.get(n7);
            MultiProcessor$zza.zza((MultiProcessor$zza)object4, 0);
            object4 = MultiProcessor$zza.zza((MultiProcessor$zza)object4);
            ((Tracker)object4).onUpdate(detector$Detections, object2);
        }
    }

    public void release() {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = (object = this.zzb).size()); ++i3) {
            object = MultiProcessor$zza.zza((MultiProcessor$zza)this.zzb.valueAt(i3));
            ((Tracker)object).onDone();
        }
        this.zzb.clear();
    }
}

