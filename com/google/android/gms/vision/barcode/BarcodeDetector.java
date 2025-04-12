/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.media.Image$Plane
 *  android.util.SparseArray
 */
package com.google.android.gms.vision.barcode;

import android.graphics.Bitmap;
import android.media.Image;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.vision.zzm;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.zzc;
import java.nio.ByteBuffer;

public final class BarcodeDetector
extends Detector {
    private final zzm zza;

    private BarcodeDetector() {
        IllegalStateException illegalStateException = new IllegalStateException("Default constructor called");
        throw illegalStateException;
    }

    private BarcodeDetector(zzm zzm2) {
        this.zza = zzm2;
    }

    public /* synthetic */ BarcodeDetector(zzm zzm2, zzc zzc2) {
        this(zzm2);
    }

    public final SparseArray detect(Frame object) {
        if (object != null) {
            AbstractSafeParcelable abstractSafeParcelable;
            int n3;
            Object object2 = zzs.zza((Frame)object);
            Object object3 = ((Frame)object).getBitmap();
            int n4 = 0;
            if (object3 != null) {
                object3 = this.zza;
                object = (Bitmap)Preconditions.checkNotNull(((Frame)object).getBitmap());
                if ((object = ((zzm)object3).zza((Bitmap)object, (zzs)object2)) == null) {
                    object = new IllegalArgumentException("Internal barcode detector error; check logcat output.");
                    throw object;
                }
            } else {
                object3 = ((Frame)object).getPlanes();
                if (object3 != null) {
                    zzs zzs2;
                    object3 = ((Image.Plane[])Preconditions.checkNotNull(((Frame)object).getPlanes()))[0].getBuffer();
                    n3 = ((Image.Plane[])Preconditions.checkNotNull(((Frame)object).getPlanes()))[0].getRowStride();
                    int n7 = ((zzs)object2).zzb;
                    int n8 = ((zzs)object2).zzc;
                    long l2 = ((zzs)object2).zzd;
                    int n10 = ((zzs)object2).zze;
                    abstractSafeParcelable = zzs2;
                    zzs2 = new zzs(n3, n7, n8, l2, n10);
                    object = this.zza;
                    object2 = (ByteBuffer)Preconditions.checkNotNull(object3);
                    object = ((zzm)object).zza((ByteBuffer)object2, zzs2);
                } else {
                    object = ((Frame)object).getGrayscaleImageData();
                    object3 = this.zza;
                    object = (ByteBuffer)Preconditions.checkNotNull(object);
                    object = ((zzm)object3).zza((ByteBuffer)object, (zzs)object2);
                }
            }
            int n14 = ((Barcode[])object).length;
            object2 = new SparseArray(n14);
            n14 = ((Barcode[])object).length;
            while (n4 < n14) {
                abstractSafeParcelable = object[n4];
                String string2 = abstractSafeParcelable.rawValue;
                n3 = string2.hashCode();
                object2.append(n3, (Object)abstractSafeParcelable);
                ++n4;
            }
            return object2;
        }
        object = new IllegalArgumentException("No frame supplied.");
        throw object;
    }

    public final boolean isOperational() {
        return this.zza.zzb();
    }

    public final void release() {
        super.release();
        this.zza.zzc();
    }
}

