/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.PointF
 *  android.media.Image$Plane
 *  android.os.RemoteException
 */
package com.google.android.gms.vision.face.internal.client;

import android.content.Context;
import android.graphics.PointF;
import android.media.Image;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.internal.vision.zzt;
import com.google.android.gms.internal.vision.zzu;
import com.google.android.gms.vision.face.Contour;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.Landmark;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.gms.vision.face.internal.client.zza;
import com.google.android.gms.vision.face.internal.client.zzf;
import com.google.android.gms.vision.face.internal.client.zzh;
import com.google.android.gms.vision.face.internal.client.zzl;
import java.nio.ByteBuffer;

public final class zzb
extends zzt {
    private final zzf zza;

    public zzb(Context context, zzf zzf2) {
        super(context, "FaceNativeHandle", "face");
        this.zza = zzf2;
        this.zzd();
    }

    private static Face zza(FaceParcel faceParcel) {
        Face face;
        float f5;
        Object object;
        PointF pointF;
        Object object2;
        int n3;
        int n4;
        Contour[] contourArray;
        float f6;
        Landmark[] landmarkArray;
        int n7;
        Object object3 = faceParcel;
        int n8 = faceParcel.zza;
        float f7 = faceParcel.zzb;
        float f8 = faceParcel.zzc;
        PointF pointF2 = new PointF(f7, f8);
        f7 = faceParcel.zzd;
        f8 = faceParcel.zze;
        float f11 = faceParcel.zzf;
        float f12 = faceParcel.zzg;
        float f14 = faceParcel.zzh;
        Object[] objectArray = faceParcel.zzi;
        float f15 = 0.0f;
        Object[] objectArray2 = null;
        if (objectArray == null) {
            objectArray = new Landmark[]{};
        } else {
            n7 = objectArray.length;
            landmarkArray = new Landmark[n7];
            f6 = 0.0f;
            contourArray = null;
            for (n4 = 0; n4 < (n3 = objectArray.length); ++n4) {
                object2 = objectArray[n4];
                f15 = ((LandmarkParcel)object2).zza;
                float f16 = ((LandmarkParcel)object2).zzb;
                pointF = new PointF(f15, f16);
                int n10 = ((LandmarkParcel)object2).zzc;
                landmarkArray[n4] = object = new Landmark(pointF, n10);
                f15 = 0.0f;
                objectArray2 = null;
            }
            objectArray = landmarkArray;
        }
        objectArray2 = ((FaceParcel)object3).zzm;
        if (objectArray2 == null) {
            n7 = 0;
            f5 = 0.0f;
            landmarkArray = null;
            objectArray2 = new Contour[]{};
        } else {
            f5 = 0.0f;
            landmarkArray = null;
            n4 = objectArray2.length;
            contourArray = new Contour[n4];
            for (n7 = 0; n7 < (n3 = objectArray2.length); ++n7) {
                object2 = objectArray2[n7];
                pointF = ((zza)object2).zza;
                n3 = ((zza)object2).zzb;
                contourArray[n7] = object = new Contour((PointF[])pointF, n3);
            }
            objectArray2 = contourArray;
        }
        f5 = ((FaceParcel)object3).zzj;
        f6 = ((FaceParcel)object3).zzk;
        float f17 = ((FaceParcel)object3).zzl;
        float f18 = ((FaceParcel)object3).zzn;
        object3 = face;
        face = new Face(n8, pointF2, f7, f8, f11, f12, f14, (Landmark[])objectArray, (Contour[])objectArray2, f5, f6, f17, f18);
        return face;
    }

    public final /* synthetic */ Object zza(DynamiteModule object, Context object2) {
        Object object3 = "com.google.android.gms.vision.dynamite.face";
        boolean bl2 = zzu.zza(object2, (String)object3);
        if (bl2) {
            object3 = "com.google.android.gms.vision.face.NativeFaceDetectorV2Creator";
            object = zzl.asInterface(((DynamiteModule)object).instantiate((String)object3));
        } else {
            object3 = "com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator";
            object = zzl.asInterface(((DynamiteModule)object).instantiate((String)object3));
        }
        if (object == null) {
            return null;
        }
        object2 = ObjectWrapper.wrap(object2);
        object3 = (zzf)Preconditions.checkNotNull(this.zza);
        return object.newFaceDetector((IObjectWrapper)object2, (zzf)object3);
    }

    public final void zza() {
        ((zzh)Preconditions.checkNotNull((zzh)this.zzd())).zza();
    }

    public final boolean zza(int n3) {
        Object object;
        boolean bl2 = this.zzb();
        if (!bl2) {
            return false;
        }
        try {
            object = this.zzd();
        }
        catch (RemoteException remoteException) {
            return false;
        }
        object = (zzh)object;
        object = Preconditions.checkNotNull(object);
        object = (zzh)object;
        return object.zza(n3);
    }

    public final Face[] zza(ByteBuffer faceParcelArray, zzs faceArray) {
        int n3 = this.zzb();
        if (n3 == 0) {
            return new Face[0];
        }
        faceParcelArray = ObjectWrapper.wrap(faceParcelArray);
        Object object = this.zzd();
        object = (zzh)object;
        object = Preconditions.checkNotNull(object);
        object = (zzh)object;
        try {
            faceParcelArray = object.zza((IObjectWrapper)faceParcelArray, (zzs)faceArray);
        }
        catch (RemoteException remoteException) {
            return new Face[0];
        }
        int n4 = faceParcelArray.length;
        faceArray = new Face[n4];
        for (int i3 = 0; i3 < (n3 = faceParcelArray.length); ++i3) {
            faceArray[i3] = object = zzb.zza(faceParcelArray[i3]);
        }
        return faceArray;
    }

    public final Face[] zza(Image.Plane[] faceParcelArray, zzs faceArray) {
        int n3;
        int n4 = this.zzb();
        if (n4 == 0) {
            return new Face[0];
        }
        if (faceParcelArray != null && (n4 = faceParcelArray.length) != (n3 = 3)) {
            faceParcelArray = new IllegalArgumentException("Only android.graphics.ImageFormat#YUV_420_888 is supported which should have 3 planes.");
            throw faceParcelArray;
        }
        Object object = this.zzd();
        object = (zzh)object;
        Object object2 = object = Preconditions.checkNotNull(object);
        object2 = (zzh)object;
        object = faceParcelArray[0];
        object = object.getBuffer();
        IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(object);
        n4 = 1;
        Object object3 = faceParcelArray[n4];
        object3 = object3.getBuffer();
        object3 = ObjectWrapper.wrap(object3);
        int n7 = 2;
        Object object4 = faceParcelArray[n7];
        object4 = object4.getBuffer();
        object4 = ObjectWrapper.wrap(object4);
        Image.Plane plane = faceParcelArray[0];
        int n8 = plane.getPixelStride();
        Image.Plane plane2 = faceParcelArray[n4];
        int n10 = plane2.getPixelStride();
        Image.Plane plane3 = faceParcelArray[n7];
        int n14 = plane3.getPixelStride();
        Image.Plane plane4 = faceParcelArray[0];
        int n15 = plane4.getRowStride();
        object = faceParcelArray[n4];
        n4 = object.getRowStride();
        faceParcelArray = faceParcelArray[n7];
        int n16 = faceParcelArray.getRowStride();
        int n17 = n8;
        n8 = n10;
        n10 = n14;
        n14 = n15;
        n15 = n4;
        try {
            faceParcelArray = object2.zza(iObjectWrapper, (IObjectWrapper)object3, (IObjectWrapper)object4, n17, n8, n10, n14, n4, n16, (zzs)faceArray);
        }
        catch (RemoteException remoteException) {
            return new Face[0];
        }
        int n18 = faceParcelArray.length;
        faceArray = new Face[n18];
        for (int i3 = 0; i3 < (n4 = faceParcelArray.length); ++i3) {
            faceArray[i3] = object = zzb.zza(faceParcelArray[i3]);
        }
        return faceArray;
    }
}

