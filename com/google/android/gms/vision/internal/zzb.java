/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.Matrix
 *  android.graphics.Rect
 *  android.graphics.YuvImage
 *  android.media.Image$Plane
 */
package com.google.android.gms.vision.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import com.google.android.gms.internal.vision.zzfe;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class zzb {
    public static Bitmap zza(Bitmap bitmap, int n3, int n4, int n7) {
        if (n3 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f5 = n3;
        matrix.postRotate(f5);
        return Bitmap.createBitmap((Bitmap)bitmap, (int)0, (int)0, (int)n4, (int)n7, (Matrix)matrix, (boolean)true);
    }

    public static Bitmap zza(ByteBuffer object, int n3, int n4, int n7) {
        int n8;
        boolean n84 = ((ByteBuffer)object).hasArray();
        if (n84 && (n8 = ((ByteBuffer)object).arrayOffset()) == 0) {
            object = ((ByteBuffer)object).array();
        } else {
            ((ByteBuffer)object).rewind();
            int n10 = ((Buffer)object).limit();
            byte[] byArray = new byte[n10];
            ((ByteBuffer)object).get(byArray, 0, n10);
            object = byArray;
        }
        object = zzb.zza((byte[])object, n3, n4);
        n3 = ((Object)object).length;
        object = BitmapFactory.decodeByteArray((byte[])object, (int)0, (int)n3);
        n3 = object.getWidth();
        n4 = object.getHeight();
        return zzb.zza((Bitmap)object, n7, n3, n4);
    }

    public static ByteBuffer zza(Image.Plane[] object, int n3, int n4) {
        int n7 = n3 * n4;
        int n8 = n7 / 4;
        int n10 = 2;
        byte[] byArray = new byte[n8 * 2 + n7];
        n8 = 1;
        ByteBuffer byteBuffer = object[n8].getBuffer();
        Object object2 = object[n10].getBuffer();
        int n14 = ((Buffer)object2).position();
        int n15 = byteBuffer.limit();
        int n16 = n14 + 1;
        ((ByteBuffer)object2).position(n16);
        n16 = n15 + -1;
        byteBuffer.limit(n16);
        n16 = ((Buffer)object2).remaining();
        int n17 = n7 * 2 / 4;
        int n18 = n17 + -2;
        int n19 = 0;
        n16 = n16 == n18 && (n16 = ((ByteBuffer)object2).compareTo(byteBuffer)) == 0 ? 1 : 0;
        ((ByteBuffer)object2).position(n14);
        byteBuffer.limit(n15);
        if (n16 != 0) {
            object[0].getBuffer().get(byArray, 0, n7);
            ByteBuffer byteBuffer2 = object[n8].getBuffer();
            object = object[n10].getBuffer();
            ((ByteBuffer)object).get(byArray, n7, n8);
            byteBuffer2.get(byArray, n7 += n8, n17 -= n8);
        } else {
            Image.Plane plane = object[0];
            n15 = n3;
            n16 = n4;
            zzb.zza(plane, n3, n4, byArray, 0, 1);
            plane = object[n8];
            n18 = n7 + 1;
            n19 = 2;
            zzb.zza(plane, n3, n4, byArray, n18, n19);
            Object object3 = object[n10];
            n14 = 2;
            n10 = n3;
            object2 = byArray;
            zzb.zza((Image.Plane)object3, n3, n4, byArray, n7, n14);
        }
        return ByteBuffer.wrap(byArray);
    }

    private static void zza(Image.Plane plane, int n3, int n4, byte[] byArray, int n7, int n8) {
        ByteBuffer byteBuffer = plane.getBuffer();
        byteBuffer.rewind();
        int n10 = byteBuffer.limit();
        int n14 = plane.getRowStride() + n10 + -1;
        n10 = plane.getRowStride();
        if ((n14 /= n10) == 0) {
            return;
        }
        n3 /= (n4 /= n14);
        n4 = 0;
        int n15 = 0;
        for (n10 = 0; n10 < n14; ++n10) {
            int n16;
            int n17 = n15;
            for (n16 = 0; n16 < n3; ++n16) {
                int n18;
                byArray[n7] = n18 = byteBuffer.get(n17);
                n7 += n8;
                n18 = plane.getPixelStride();
                n17 += n18;
            }
            n16 = plane.getRowStride();
            n15 += n16;
        }
    }

    private static byte[] zza(byte[] object, int n3, int n4) {
        YuvImage yuvImage;
        int n7 = 17;
        YuvImage yuvImage2 = yuvImage;
        yuvImage = new YuvImage((byte[])object, n7, n3, n4, null);
        object = new ByteArrayOutputStream;
        ((ByteArrayOutputStream)object)();
        try {
            yuvImage2 = new Rect(0, 0, n3, n4);
            n3 = 100;
        }
        catch (Throwable throwable) {
            try {
                ((ByteArrayOutputStream)object).close();
            }
            catch (Throwable throwable2) {
                zzfe.zza(throwable, throwable2);
            }
            throw throwable;
        }
        yuvImage.compressToJpeg((Rect)yuvImage2, n3, (OutputStream)object);
        byte[] byArray = ((ByteArrayOutputStream)object).toByteArray();
        ((ByteArrayOutputStream)object).close();
        return byArray;
    }
}

