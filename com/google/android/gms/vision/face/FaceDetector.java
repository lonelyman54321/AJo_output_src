/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.media.Image$Plane
 *  android.util.SparseArray
 */
package com.google.android.gms.vision.face;

import android.graphics.Bitmap;
import android.media.Image;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.internal.vision.zzw;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.internal.client.zzb;
import com.google.android.gms.vision.face.internal.client.zzf;
import com.google.android.gms.vision.face.zza;
import com.google.android.gms.vision.zzc;
import java.nio.ByteBuffer;
import java.util.HashSet;

public final class FaceDetector
extends Detector {
    public static final int ACCURATE_MODE = 1;
    public static final int ALL_CLASSIFICATIONS = 1;
    public static final int ALL_LANDMARKS = 1;
    public static final int CONTOUR_LANDMARKS = 2;
    public static final int FAST_MODE = 0;
    public static final int NO_CLASSIFICATIONS = 0;
    public static final int NO_LANDMARKS = 0;
    public static final int SELFIE_MODE = 2;
    private final zzc zza;
    private final zzb zzb;
    private final Object zzc;
    private boolean zzd;

    private FaceDetector() {
        Object object = new zzc();
        this.zza = object;
        this.zzc = object = new Object();
        this.zzd = true;
        object = new IllegalStateException("Default constructor called");
        throw object;
    }

    private FaceDetector(zzb zzb2) {
        Object object = new zzc();
        this.zza = object;
        this.zzc = object = new Object();
        this.zzd = true;
        this.zzb = zzb2;
    }

    public /* synthetic */ FaceDetector(zzb zzb2, zza zza2) {
        this(zzb2);
    }

    public static /* synthetic */ boolean zza(zzf zzf2) {
        return FaceDetector.zzb(zzf2);
    }

    private static boolean zzb(zzf zzf2) {
        int n3;
        int n4 = zzf2.zza;
        int n7 = 0;
        int n8 = 1;
        int n10 = 2;
        n4 = n4 != n10 && (n4 = zzf2.zzb) == n10 ? 0 : 1;
        int n14 = zzf2.zzb;
        if (n14 != n10 || (n3 = zzf2.zzc) != n8) {
            n7 = n4;
        }
        return n7 != 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final SparseArray detect(Frame object) {
        Object object2;
        block14: {
            Object object3;
            Object object4;
            boolean bl2;
            boolean bl3;
            if (object == null) {
                object = new IllegalArgumentException("No frame supplied.");
                throw object;
            }
            object2 = ((Frame)object).getPlanes();
            if (object2 != null && (bl3 = ((Image.Plane[])(object2 = (Image.Plane[])Preconditions.checkNotNull(((Frame)object).getPlanes()))).length) == (bl2 = 3 != 0)) {
                object2 = this.zzc;
                // MONITORENTER : object2
                bl2 = this.zzd;
                if (!bl2) {
                    String string2 = "Cannot use detector after release()";
                    object = new IllegalStateException(string2);
                    throw object;
                }
                object4 = this.zzb;
                object3 = ((Frame)object).getPlanes();
                object3 = Preconditions.checkNotNull(object3);
                object = zzs.zza((Frame)object);
                object = ((zzb)object4).zza((Image.Plane[])object3, (zzs)object);
                // MONITOREXIT : object2
            }
            object2 = ((Frame)object).getBitmap();
            if (object2 != null) {
                object2 = (Bitmap)Preconditions.checkNotNull(((Frame)object).getBitmap());
                bl2 = true;
                object2 = zzw.zza((Bitmap)object2, bl2);
            } else {
                object2 = ((Frame)object).getGrayscaleImageData();
            }
            object4 = this.zzc;
            // MONITORENTER : object4
            int n3 = this.zzd;
            if (n3 == 0) break block14;
            object3 = this.zzb;
            object2 = Preconditions.checkNotNull(object2);
            object2 = (ByteBuffer)object2;
            object = zzs.zza((Frame)object);
            object = object3.zza((ByteBuffer)object2, (zzs)object);
            // MONITOREXIT : object4
            object2 = new HashSet();
            n3 = ((Object)object).length;
            object4 = new SparseArray(n3);
            n3 = ((Object)object).length;
            int n4 = 0;
            int n7 = 0;
            while (n4 < n3) {
                Object object5 = object[n4];
                int n8 = ((Face)object5).getId();
                n7 = Math.max(n7, n8);
                Object object6 = n8;
                boolean bl4 = ((HashSet)object2).contains(object6);
                if (bl4) {
                    n7 = n8 = n7 + 1;
                }
                object6 = n8;
                ((HashSet)object2).add(object6);
                object6 = this.zza;
                n8 = ((zzc)object6).zza(n8);
                object4.append(n8, object5);
                ++n4;
            }
            return object4;
        }
        object2 = "Cannot use detector after release()";
        object = new IllegalStateException((String)object2);
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void finalize() {
        Throwable throwable3;
        block8: {
            block7: {
                try {
                    Object object = this.zzc;
                    // MONITORENTER : object
                }
                catch (Throwable throwable2) {
                    super.finalize();
                    throw throwable2;
                }
                try {
                    boolean bl2 = this.zzd;
                    if (!bl2) break block7;
                    this.release();
                }
                catch (Throwable throwable3) {
                    break block8;
                }
            }
            // MONITOREXIT : object
            super.finalize();
            return;
        }
        throw throwable3;
    }

    public final boolean isOperational() {
        return this.zzb.zzb();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void release() {
        super.release();
        Object object = this.zzc;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                boolean bl2;
                try {
                    bl2 = this.zzd;
                    if (!bl2) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                zzb zzb2 = this.zzb;
                zzb2.zzc();
                bl2 = false;
                zzb2 = null;
                this.zzd = false;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean setFocus(int n3) {
        n3 = this.zza.zzb(n3);
        Object object = this.zzc;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                try {
                    boolean bl2 = this.zzd;
                    if (bl2) {
                        zzb zzb2 = this.zzb;
                        return (int)(zzb2.zza(n3) ? 1 : 0) != 0;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                String string2 = "Cannot use detector after release()";
                RuntimeException runtimeException = new RuntimeException(string2);
                throw runtimeException;
            }
            throw throwable2;
        }
    }
}

