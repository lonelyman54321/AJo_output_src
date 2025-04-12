/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.media.Image$Plane
 */
package com.google.android.gms.vision;

import android.graphics.Bitmap;
import android.media.Image;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.Frame$Metadata;
import com.google.android.gms.vision.Frame$zza;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class Frame$Builder {
    private final Frame zza;

    public Frame$Builder() {
        Frame frame;
        this.zza = frame = new Frame(null);
    }

    public Frame build() {
        Object object = Frame.zza(this.zza);
        if (object == null && (object = Frame.zzb(this.zza)) == null && (object = Frame.zzc(this.zza)) == null) {
            object = new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
            throw object;
        }
        return this.zza;
    }

    public Frame$Builder setBitmap(Bitmap object) {
        int n3 = object.getWidth();
        int n4 = object.getHeight();
        Frame.zza(this.zza, object);
        object = this.zza.getMetadata();
        Frame$Metadata.zza((Frame$Metadata)object, n3);
        Frame$Metadata.zzb((Frame$Metadata)object, n4);
        return this;
    }

    public Frame$Builder setId(int n3) {
        Frame$Metadata.zzd(this.zza.getMetadata(), n3);
        return this;
    }

    public Frame$Builder setImageData(ByteBuffer object, int n3, int n4, int n7) {
        if (object != null) {
            int n8;
            int n10 = ((Buffer)object).capacity();
            if (n10 >= (n8 = n3 * n4)) {
                n10 = 16;
                if (n7 != n10 && n7 != (n10 = 17) && n7 != (n10 = 842094169)) {
                    String string2 = tk3_2.a(37, n7, "Unsupported image format: ");
                    object = new IllegalArgumentException(string2);
                    throw object;
                }
                Frame.zza(this.zza, (ByteBuffer)object);
                object = this.zza.getMetadata();
                Frame$Metadata.zza((Frame$Metadata)object, n3);
                Frame$Metadata.zzb((Frame$Metadata)object, n4);
                Frame$Metadata.zzc((Frame$Metadata)object, n7);
                return this;
            }
            object = new IllegalArgumentException("Invalid image data size.");
            throw object;
        }
        object = new IllegalArgumentException("Null image data supplied.");
        throw object;
    }

    public Frame$Builder setPlanes(Image.Plane[] object, int n3, int n4, int n7) {
        if (object != null) {
            int n8 = ((Image.Plane[])object).length;
            int n10 = 3;
            if (n8 == n10) {
                Object object2 = object[0].getBuffer();
                n8 = ((Buffer)object2).capacity();
                if (n8 >= (n10 = n3 * n4)) {
                    object2 = this.zza;
                    Frame$zza frame$zza = new Frame$zza((Image.Plane[])object);
                    Frame.zza((Frame)object2, frame$zza);
                    object = this.zza.getMetadata();
                    Frame$Metadata.zza((Frame$Metadata)object, n3);
                    Frame$Metadata.zzb((Frame$Metadata)object, n4);
                    Frame$Metadata.zzc((Frame$Metadata)object, n7);
                    return this;
                }
                object = new IllegalArgumentException("Invalid image data size.");
                throw object;
            }
            object = new IllegalArgumentException("Only android.graphics.ImageFormat#YUV_420_888 is supported which should have 3 planes.");
            throw object;
        }
        object = new IllegalArgumentException("Null image data supplied.");
        throw object;
    }

    public Frame$Builder setRotation(int n3) {
        Frame$Metadata.zze(this.zza.getMetadata(), n3);
        return this;
    }

    public Frame$Builder setTimestampMillis(long l2) {
        Frame$Metadata.zza(this.zza.getMetadata(), l2);
        return this;
    }
}

