/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Color
 *  android.media.Image$Plane
 */
package com.google.android.gms.vision;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.Image;
import com.google.android.gms.vision.Frame$Metadata;
import com.google.android.gms.vision.Frame$zza;
import com.google.android.gms.vision.zzb;
import java.nio.ByteBuffer;

public class Frame {
    public static final int ROTATION_0 = 0;
    public static final int ROTATION_180 = 2;
    public static final int ROTATION_270 = 3;
    public static final int ROTATION_90 = 1;
    private final Frame$Metadata zza;
    private ByteBuffer zzb;
    private Frame$zza zzc;
    private Bitmap zzd;

    private Frame() {
        Frame$Metadata frame$Metadata;
        this.zza = frame$Metadata = new Frame$Metadata();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
    }

    public /* synthetic */ Frame(zzb zzb2) {
        this();
    }

    public static /* synthetic */ Bitmap zza(Frame frame, Bitmap bitmap) {
        frame.zzd = bitmap;
        return bitmap;
    }

    public static /* synthetic */ Frame$zza zza(Frame frame, Frame$zza frame$zza) {
        frame.zzc = frame$zza;
        return frame$zza;
    }

    public static /* synthetic */ ByteBuffer zza(Frame frame) {
        return frame.zzb;
    }

    public static /* synthetic */ ByteBuffer zza(Frame frame, ByteBuffer byteBuffer) {
        frame.zzb = byteBuffer;
        return byteBuffer;
    }

    public static /* synthetic */ Bitmap zzb(Frame frame) {
        return frame.zzd;
    }

    public static /* synthetic */ Frame$zza zzc(Frame frame) {
        return frame.zzc;
    }

    public Bitmap getBitmap() {
        return this.zzd;
    }

    public ByteBuffer getGrayscaleImageData() {
        Bitmap bitmap = this.zzd;
        if (bitmap != null) {
            if (bitmap == null) {
                return null;
            }
            int n3 = bitmap.getWidth();
            bitmap = this.zzd;
            int n4 = bitmap.getHeight();
            int n7 = n3 * n4;
            int[] nArray = new int[n7];
            Object object = this.zzd;
            float f5 = 0.0f;
            byte by2 = 0;
            float f6 = 0.0f;
            int n8 = n3;
            object.getPixels(nArray, 0, n3, 0, 0, n3, n4);
            object = new byte[n7];
            for (int i3 = 0; i3 < n7; ++i3) {
                f6 = (float)Color.red((int)nArray[i3]) * 0.299f;
                n8 = Color.green((int)nArray[i3]);
                float f7 = (float)n8 * 0.587f + f6;
                f6 = Color.blue((int)nArray[i3]);
                f5 = 0.114f;
                f6 = f6 * f5 + f7;
                by2 = (byte)f6;
                object[i3] = (Bitmap)by2;
            }
            return ByteBuffer.wrap((byte[])object);
        }
        return this.zzb;
    }

    public Frame$Metadata getMetadata() {
        return this.zza;
    }

    public Image.Plane[] getPlanes() {
        Frame$zza frame$zza = this.zzc;
        if (frame$zza == null) {
            return null;
        }
        return frame$zza.zza();
    }
}

