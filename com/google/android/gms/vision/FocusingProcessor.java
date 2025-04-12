/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.vision;

import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Detector$Detections;
import com.google.android.gms.vision.Detector$Processor;
import com.google.android.gms.vision.Tracker;

public abstract class FocusingProcessor
implements Detector$Processor {
    private Detector zza;
    private Tracker zzb;
    private int zzc = 3;
    private boolean zzd = false;
    private int zze;
    private int zzf = 0;

    public FocusingProcessor(Detector detector, Tracker tracker) {
        this.zza = detector;
        this.zzb = tracker;
    }

    public void receiveDetections(Detector$Detections object) {
        Object object2;
        Object object3 = ((Detector$Detections)object).getDetectedItems();
        int n3 = object3.size();
        int n4 = 1;
        if (n3 == 0) {
            int n7;
            int n8 = this.zzf;
            n3 = this.zzc;
            if (n8 == n3) {
                object = this.zzb;
                ((Tracker)object).onDone();
                this.zzd = false;
            } else {
                object3 = this.zzb;
                ((Tracker)object3).onMissing((Detector$Detections)object);
            }
            this.zzf = n7 = this.zzf + n4;
            return;
        }
        this.zzf = 0;
        n3 = (int)(this.zzd ? 1 : 0);
        if (n3 != 0) {
            n3 = this.zze;
            object2 = object3.get(n3);
            if (object2 != null) {
                this.zzb.onUpdate((Detector$Detections)object, object2);
                return;
            }
            object2 = this.zzb;
            ((Tracker)object2).onDone();
            this.zzd = false;
        }
        if ((object3 = object3.get(n3 = this.selectFocus((Detector$Detections)object))) == null) {
            return;
        }
        this.zzd = n4;
        this.zze = n3;
        this.zza.setFocus(n3);
        object2 = this.zzb;
        n4 = this.zze;
        ((Tracker)object2).onNewItem(n4, object3);
        this.zzb.onUpdate((Detector$Detections)object, object3);
    }

    public void release() {
        this.zzb.onDone();
    }

    public abstract int selectFocus(Detector$Detections var1);

    public final void zza(int n3) {
        if (n3 >= 0) {
            this.zzc = n3;
            return;
        }
        String string2 = tk3_2.a(28, n3, "Invalid max gap: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }
}

