/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.ImageFormat
 *  android.graphics.SurfaceTexture
 *  android.hardware.Camera
 *  android.hardware.Camera$CameraInfo
 *  android.hardware.Camera$Parameters
 *  android.hardware.Camera$PictureCallback
 *  android.hardware.Camera$PreviewCallback
 *  android.hardware.Camera$ShutterCallback
 *  android.hardware.Camera$Size
 *  android.view.SurfaceHolder
 *  android.view.WindowManager
 */
package com.google.android.gms.vision;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import com.google.android.gms.common.images.Size;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.vision.CameraSource$PictureCallback;
import com.google.android.gms.vision.CameraSource$ShutterCallback;
import com.google.android.gms.vision.CameraSource$zza;
import com.google.android.gms.vision.CameraSource$zzb;
import com.google.android.gms.vision.CameraSource$zzc;
import com.google.android.gms.vision.CameraSource$zzd;
import com.google.android.gms.vision.CameraSource$zze;
import com.google.android.gms.vision.zza;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;

public class CameraSource {
    public static final int CAMERA_FACING_BACK = 0;
    public static final int CAMERA_FACING_FRONT = 1;
    private Context zza;
    private final Object zzb;
    private Camera zzc;
    private int zzd;
    private int zze;
    private Size zzf;
    private float zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private String zzk;
    private SurfaceTexture zzl;
    private Thread zzm;
    private CameraSource$zza zzn;
    private final IdentityHashMap zzo;

    private CameraSource() {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        this.zzb = identityHashMap;
        this.zzd = 0;
        this.zzg = 30.0f;
        this.zzh = 1024;
        this.zzi = 768;
        this.zzj = false;
        this.zzo = identityHashMap = new IdentityHashMap();
    }

    public /* synthetic */ CameraSource(zza zza2) {
        this();
    }

    public static /* synthetic */ float zza(CameraSource cameraSource, float f5) {
        cameraSource.zzg = f5;
        return f5;
    }

    public static /* synthetic */ int zza(CameraSource cameraSource, int n3) {
        cameraSource.zzh = n3;
        return n3;
    }

    public static /* synthetic */ Context zza(CameraSource cameraSource, Context context) {
        cameraSource.zza = context;
        return context;
    }

    private final Camera zza() {
        float f5;
        int n3;
        Object object;
        String string2;
        int n4;
        CharSequence charSequence;
        int n7;
        Object object2;
        block24: {
            int n8 = this.zzd;
            object2 = new Camera.CameraInfo();
            n7 = 0;
            charSequence = null;
            n4 = 0;
            string2 = null;
            while (true) {
                object = Camera.getNumberOfCameras();
                n3 = -1;
                f5 = 0.0f / 0.0f;
                if (n4 >= object) break;
                Camera.getCameraInfo((int)n4, (Camera.CameraInfo)object2);
                object = object2.facing;
                if (object != n8) {
                    ++n4;
                    continue;
                }
                break block24;
                break;
            }
            n4 = -1;
        }
        if (n4 != n3) {
            int n10;
            Object object3;
            Object object4;
            int n14;
            Object object5;
            float f6;
            Object object6;
            float f7;
            Object object7;
            Object object8;
            int n15;
            Object object9 = Camera.open((int)n4);
            Object object10 = this.zzh;
            object = this.zzi;
            Object object11 = object9.getParameters();
            Object object12 = object11.getSupportedPreviewSizes();
            object11 = object11.getSupportedPictureSizes();
            Object object13 = new ArrayList();
            Iterator iterator = object12.iterator();
            block1: while ((n15 = iterator.hasNext()) != 0) {
                boolean bl2;
                object8 = (Camera.Size)iterator.next();
                object7 = object8.width;
                f7 = object7;
                object6 = object8.height;
                f6 = object6;
                f7 /= f6;
                Iterator iterator2 = object11.iterator();
                while (bl2 = iterator2.hasNext()) {
                    object5 = (Camera.Size)iterator2.next();
                    float f8 = ((Camera.Size)object5).width;
                    float f11 = ((Camera.Size)object5).height;
                    f8 /= f11;
                    f8 = Math.abs(f7 - f8);
                    n14 = 1008981770;
                    f11 = 0.01f;
                    float f12 = f8 - f11;
                    object4 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                    if (object4 >= 0) continue;
                    object3 = new CameraSource$zze((Camera.Size)object8, (Camera.Size)object5);
                    object13.add(object3);
                    continue block1;
                }
            }
            n3 = object13.size();
            iterator = null;
            if (n3 == 0) {
                object11 = object12.iterator();
                while ((n10 = object11.hasNext()) != 0) {
                    object12 = (Camera.Size)object11.next();
                    object8 = new CameraSource$zze((Camera.Size)object12, null);
                    object13.add(object8);
                }
            }
            n3 = object13.size();
            n10 = -1 >>> 1;
            object7 = 0;
            object3 = null;
            f7 = 0.0f;
            object8 = null;
            object6 = -1 >>> 1;
            f6 = 0.0f / 0.0f;
            for (n15 = 0; n15 < n3; ++n15) {
                object5 = object13.get(n15);
                object5 = (CameraSource$zze)object5;
                Size size = ((CameraSource$zze)object5).zza();
                n14 = Math.abs(size.getWidth() - object10);
                object4 = Math.abs(size.getHeight() - object) + n14;
                if (object4 >= object6) continue;
                object3 = object5;
                object6 = object4;
            }
            object2 = (CameraSource$zze)Preconditions.checkNotNull(object3);
            if (object2 != null) {
                Object object14 = object2.zzb();
                object2 = object2.zza();
                this.zzf = object2;
                float f14 = this.zzg;
                n3 = 1148846080;
                f5 = 1000.0f;
                object10 = (int)(f14 *= f5);
                object11 = object9.getParameters().getSupportedPreviewFpsRange().iterator();
                object13 = null;
                while (true) {
                    n15 = (int)(object11.hasNext() ? 1 : 0);
                    object7 = 1;
                    f7 = Float.MIN_VALUE;
                    if (n15 == 0) break;
                    object8 = (int[])object11.next();
                    object6 = object8[0];
                    object6 = object10 - object6;
                    object7 = object8[object7];
                    object7 = object10 - object7;
                    object6 = Math.abs(object6);
                    if ((object7 = Math.abs(object7) + object6) >= n10) continue;
                    object13 = object8;
                    n10 = object7;
                }
                object2 = (int[])Preconditions.checkNotNull(object13);
                if (object2 != null) {
                    object11 = object9.getParameters();
                    if (object14 != null) {
                        n10 = ((Size)object14).getWidth();
                        object = ((Size)object14).getHeight();
                        object11.setPictureSize(n10, object);
                    }
                    object = this.zzf.getWidth();
                    object12 = this.zzf;
                    n10 = ((Size)object12).getHeight();
                    object11.setPreviewSize(object, n10);
                    object = object2[0];
                    object10 = object2[object7];
                    object11.setPreviewFpsRange(object, object10);
                    f14 = 2.4E-44f;
                    object11.setPreviewFormat(17);
                    object2 = this.zza;
                    object14 = "window";
                    object2 = ((WindowManager)Preconditions.checkNotNull((WindowManager)object2.getSystemService((String)object14))).getDefaultDisplay();
                    object10 = object2.getRotation();
                    if (object10 != 0) {
                        if (object10 != object7) {
                            object = 2;
                            if (object10 != object) {
                                object = 3;
                                if (object10 == object) {
                                    n7 = 270;
                                }
                            } else {
                                n7 = 180;
                            }
                        } else {
                            n7 = 90;
                        }
                    }
                    object2 = new Camera.CameraInfo();
                    Camera.getCameraInfo((int)n4, (Camera.CameraInfo)object2);
                    n4 = object2.facing;
                    if (n4 == object7) {
                        object10 = (object2.orientation + n7) % 360;
                        n7 = (360 - object10) % 360;
                    } else {
                        n7 = object10 = (object2.orientation - n7 + 360) % 360;
                    }
                    this.zze = n4 = object10 / 90;
                    object9.setDisplayOrientation(n7);
                    object11.setRotation(object10);
                    object2 = this.zzk;
                    if (object2 != null) {
                        object2 = object11.getSupportedFocusModes();
                        object10 = object2.contains(charSequence = this.zzk);
                        if (object10 != 0) {
                            object2 = (String)Preconditions.checkNotNull(this.zzk);
                            object11.setFocusMode((String)object2);
                        } else {
                            object2 = this.zzk;
                            string2 = "FocusMode ";
                            charSequence = new StringBuilder(string2);
                            ((StringBuilder)charSequence).append((String)object2);
                            object2 = " is not supported on this device.";
                            ((StringBuilder)charSequence).append((String)object2);
                            this.zzk = null;
                        }
                    }
                    if ((object2 = this.zzk) == null && (object10 = (Object)this.zzj) != 0 && (object10 = (Object)(object2 = object11.getSupportedFocusModes()).contains(charSequence = "continuous-video")) != 0) {
                        object11.setFocusMode((String)charSequence);
                        this.zzk = charSequence;
                    }
                    object9.setParameters((Camera.Parameters)object11);
                    object2 = new CameraSource$zzb(this, null);
                    object9.setPreviewCallbackWithBuffer((Camera.PreviewCallback)object2);
                    object2 = this.zzf;
                    object2 = this.zza((Size)object2);
                    object9.addCallbackBuffer((byte[])object2);
                    object2 = this.zzf;
                    object2 = this.zza((Size)object2);
                    object9.addCallbackBuffer((byte[])object2);
                    object2 = this.zzf;
                    object2 = this.zza((Size)object2);
                    object9.addCallbackBuffer((byte[])object2);
                    object2 = this.zzf;
                    object2 = this.zza((Size)object2);
                    object9.addCallbackBuffer((byte[])object2);
                    return object9;
                }
                object9 = new IOException("Could not find suitable preview frames per second range.");
                throw object9;
            }
            object9 = new IOException("Could not find suitable preview size.");
            throw object9;
        }
        IOException iOException = new IOException("Could not find requested camera.");
        throw iOException;
    }

    public static /* synthetic */ CameraSource$zza zza(CameraSource cameraSource, CameraSource$zza cameraSource$zza) {
        cameraSource.zzn = cameraSource$zza;
        return cameraSource$zza;
    }

    public static /* synthetic */ Object zza(CameraSource cameraSource) {
        return cameraSource.zzb;
    }

    public static /* synthetic */ String zza(CameraSource cameraSource, String string2) {
        cameraSource.zzk = string2;
        return string2;
    }

    public static /* synthetic */ boolean zza(CameraSource cameraSource, boolean bl2) {
        cameraSource.zzj = bl2;
        return bl2;
    }

    private final byte[] zza(Size object) {
        byte[] byArray;
        int n3 = ImageFormat.getBitsPerPixel((int)17);
        long l2 = ((Size)object).getHeight();
        long l3 = ((Size)object).getWidth();
        l2 *= l3;
        l3 = n3;
        double d2 = l2 *= l3;
        double d5 = 8.0;
        int n4 = (int)(d2 = Math.ceil(d2 / d5)) + 1;
        object = new byte[n4];
        ByteBuffer byteBuffer = ByteBuffer.wrap((byte[])object);
        boolean bl2 = byteBuffer.hasArray();
        if (bl2 && (byArray = byteBuffer.array()) == object) {
            this.zzo.put(object, byteBuffer);
            return object;
        }
        object = new IllegalStateException("Failed to create valid buffer for camera source.");
        throw object;
    }

    public static /* synthetic */ int zzb(CameraSource cameraSource, int n3) {
        cameraSource.zzi = n3;
        return n3;
    }

    public static /* synthetic */ Camera zzb(CameraSource cameraSource) {
        return cameraSource.zzc;
    }

    public static /* synthetic */ int zzc(CameraSource cameraSource, int n3) {
        cameraSource.zzd = n3;
        return n3;
    }

    public static /* synthetic */ CameraSource$zza zzc(CameraSource cameraSource) {
        return cameraSource.zzn;
    }

    public static /* synthetic */ IdentityHashMap zzd(CameraSource cameraSource) {
        return cameraSource.zzo;
    }

    public static /* synthetic */ int zze(CameraSource cameraSource) {
        return cameraSource.zze;
    }

    public static /* synthetic */ Size zzf(CameraSource cameraSource) {
        return cameraSource.zzf;
    }

    public int getCameraFacing() {
        return this.zzd;
    }

    public Size getPreviewSize() {
        return this.zzf;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void release() {
        Object object = this.zzb;
        synchronized (object) {
            this.stop();
            CameraSource$zza cameraSource$zza = this.zzn;
            cameraSource$zza.zza();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public CameraSource start() {
        Object object = this.zzb;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                Object object2;
                try {
                    object2 = this.zzc;
                    if (object2 != null) {
                        return this;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                object2 = this.zza();
                this.zzc = object2;
                boolean bl2 = 100 != 0;
                object2 = new SurfaceTexture((int)(bl2 ? 1 : 0));
                this.zzl = object2;
                Object object3 = this.zzc;
                object3.setPreviewTexture((SurfaceTexture)object2);
                object2 = this.zzc;
                object2.startPreview();
                object3 = this.zzn;
                object2 = new Thread((Runnable)object3);
                this.zzm = object2;
                object3 = "gms.vision.CameraSource";
                ((Thread)object2).setName((String)object3);
                object2 = this.zzn;
                bl2 = true;
                ((CameraSource$zza)object2).zza(bl2);
                object2 = this.zzm;
                if (object2 != null) {
                    ((Thread)object2).start();
                }
                return this;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public CameraSource start(SurfaceHolder object) {
        Object object2 = this.zzb;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                Object object3;
                try {
                    object3 = this.zzc;
                    if (object3 != null) {
                        return this;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                this.zzc = object3 = this.zza();
                object3.setPreviewDisplay((SurfaceHolder)object);
                object = this.zzc;
                object.startPreview();
                object3 = this.zzn;
                object = new Thread((Runnable)object3);
                this.zzm = object;
                object = this.zzn;
                boolean bl2 = true;
                ((CameraSource$zza)object).zza(bl2);
                object = this.zzm;
                if (object != null) {
                    ((Thread)object).start();
                }
                return this;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void stop() {
        Object object = this.zzb;
        synchronized (object) {
            Throwable throwable22;
            block10: {
                Object object2;
                block9: {
                    try {
                        object2 = this.zzn;
                        ((CameraSource$zza)object2).zza(false);
                        object2 = this.zzm;
                        if (object2 == null) break block9;
                        try {
                            ((Thread)object2).join();
                        }
                        catch (InterruptedException interruptedException) {}
                        this.zzm = null;
                    }
                    catch (Throwable throwable22) {
                        break block10;
                    }
                }
                if ((object2 = this.zzc) != null) {
                    object2.stopPreview();
                    object2 = this.zzc;
                    object2.setPreviewCallbackWithBuffer(null);
                    try {
                        object2 = this.zzc;
                        object2.setPreviewTexture(null);
                        this.zzl = null;
                        object2 = this.zzc;
                        object2.setPreviewDisplay(null);
                    }
                    catch (Exception exception) {
                        object2 = String.valueOf(exception);
                        int n3 = ((String)object2).length() + 32;
                        StringBuilder stringBuilder = new StringBuilder(n3);
                    }
                    object2 = this.zzc;
                    object2 = Preconditions.checkNotNull(object2);
                    object2 = (Camera)object2;
                    object2.release();
                    this.zzc = null;
                }
                object2 = this.zzo;
                ((IdentityHashMap)object2).clear();
                return;
            }
            throw throwable22;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void takePicture(CameraSource$ShutterCallback object, CameraSource$PictureCallback cameraSource$PictureCallback) {
        Object object2 = this.zzb;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        Object object3 = this.zzc;
                        if (object3 == null) break block3;
                        object3 = new CameraSource$zzd(null);
                        CameraSource$zzd.zza((CameraSource$zzd)object3, (CameraSource$ShutterCallback)object);
                        object = new CameraSource$zzc(this, null);
                        CameraSource$zzc.zza((CameraSource$zzc)object, cameraSource$PictureCallback);
                        cameraSource$PictureCallback = this.zzc;
                        cameraSource$PictureCallback.takePicture((Camera.ShutterCallback)object3, null, null, (Camera.PictureCallback)object);
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
}

