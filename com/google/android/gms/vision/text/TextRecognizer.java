/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.Rect
 *  android.graphics.YuvImage
 *  android.util.SparseArray
 */
package com.google.android.gms.vision.text;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.vision.zzah;
import com.google.android.gms.internal.vision.zzaj;
import com.google.android.gms.internal.vision.zzan;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.internal.vision.zzw;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.Frame$Metadata;
import com.google.android.gms.vision.text.TextBlock;
import com.google.android.gms.vision.text.zzb;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class TextRecognizer
extends Detector {
    private final zzan zza;

    private TextRecognizer() {
        IllegalStateException illegalStateException = new IllegalStateException("Default constructor called");
        throw illegalStateException;
    }

    private TextRecognizer(zzan zzan2) {
        this.zza = zzan2;
    }

    public /* synthetic */ TextRecognizer(zzan zzan2, zzb zzb2) {
        this(zzan2);
    }

    public final SparseArray detect(Frame object) {
        Object object2 = new Rect();
        zzaj zzaj2 = new zzaj((Rect)object2);
        if (object != null) {
            int n3;
            int n4;
            int n7;
            int n8;
            Object object3;
            Object object4;
            int n14;
            int n15;
            Object object5;
            object2 = zzs.zza((Frame)object);
            Object object6 = ((Frame)object).getBitmap();
            int n16 = 0;
            if (object6 != null) {
                object6 = ((Frame)object).getBitmap();
            } else {
                YuvImage yuvImage;
                int n10;
                object6 = ((Frame)object).getMetadata();
                object5 = (ByteBuffer)Preconditions.checkNotNull(((Frame)object).getGrayscaleImageData());
                n15 = object6.getFormat();
                n14 = object2.zza;
                int n17 = object2.zzb;
                boolean n102 = ((ByteBuffer)object5).hasArray();
                if (n102 && (n10 = ((ByteBuffer)object5).arrayOffset()) == 0) {
                    object4 = object5 = (Object)((ByteBuffer)object5).array();
                } else {
                    int n18 = ((Buffer)object5).capacity();
                    object3 = new byte[n18];
                    ((ByteBuffer)object5).get((byte[])object3);
                    object4 = object3;
                }
                object5 = new ByteArrayOutputStream();
                object3 = yuvImage;
                n8 = n14;
                n7 = n17;
                yuvImage = new YuvImage((byte[])object4, n15, n14, n17, null);
                object3 = new Rect(0, 0, n14, n17);
                n14 = 100;
                yuvImage.compressToJpeg((Rect)object3, n14, (OutputStream)object5);
                object6 = ((ByteArrayOutputStream)object5).toByteArray();
                n4 = ((Bitmap)object6).length;
                object6 = BitmapFactory.decodeByteArray((byte[])object6, (int)0, (int)n4);
            }
            object6 = zzw.zza((Bitmap)Preconditions.checkNotNull(object6), (zzs)object2);
            object5 = zzaj2.zza;
            n4 = object5.isEmpty();
            if (n4 == 0) {
                object5 = zzaj2.zza;
                object3 = ((Frame)object).getMetadata();
                int n19 = ((Frame$Metadata)object3).getWidth();
                object = ((Frame)object).getMetadata();
                int n20 = ((Frame$Metadata)object).getHeight();
                n3 = object2.zze;
                n15 = 1;
                if (n3 != n15) {
                    n15 = 2;
                    if (n3 != n15) {
                        n20 = 3;
                        if (n3 == n20) {
                            n3 = ((Rect)object5).top;
                            n15 = ((Rect)object5).right;
                            n15 = n19 - n15;
                            n8 = ((Rect)object5).bottom;
                            n4 = ((Rect)object5).left;
                            int n21 = n19 - n4;
                            object5 = object = new Rect(n3, n15, n8, n21);
                        }
                    } else {
                        n15 = ((Rect)object5).right;
                        n15 = n19 - n15;
                        n8 = ((Rect)object5).bottom;
                        n8 = n20 - n8;
                        n7 = ((Rect)object5).left;
                        int n22 = n19 - n7;
                        n4 = ((Rect)object5).top;
                        object5 = object4 = new Rect(n15, n8, n22, n20 -= n4);
                    }
                } else {
                    n3 = ((Rect)object5).bottom;
                    n3 = n20 - n3;
                    n15 = ((Rect)object5).left;
                    n8 = ((Rect)object5).top;
                    n4 = ((Rect)object5).right;
                    object5 = object3 = new Rect(n3, n15, n20 -= n8, n4);
                }
                object = zzaj2.zza;
                object.set((Rect)object5);
            }
            object2.zze = 0;
            object = this.zza.zza((Bitmap)object6, (zzs)object2, zzaj2);
            zzaj2 = new SparseArray();
            int n24 = ((Object)object).length;
            object6 = null;
            for (n14 = 0; n14 < n24; ++n14) {
                object5 = object[n14];
                int n25 = ((zzah)object5).zzf;
                object3 = (SparseArray)zzaj2.get(n25);
                if (object3 == null) {
                    object3 = new SparseArray();
                    n3 = ((zzah)object5).zzf;
                    zzaj2.append(n3, object3);
                }
                n3 = ((zzah)object5).zzg;
                object3.append(n3, object5);
            }
            n24 = zzaj2.size();
            object = new SparseArray(n24);
            while (n16 < (n24 = zzaj2.size())) {
                n24 = zzaj2.keyAt(n16);
                object5 = (SparseArray)zzaj2.valueAt(n16);
                object6 = new TextBlock((SparseArray)object5);
                object.append(n24, object6);
                ++n16;
            }
            return object;
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

