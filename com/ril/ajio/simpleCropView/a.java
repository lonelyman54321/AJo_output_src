/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.RectF
 *  android.net.Uri
 *  android.opengl.GLES10
 */
package com.ril.ajio.simpleCropView;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.GLES10;
import com.ril.ajio.simpleCropView.CropImageView;
import com.ril.ajio.simpleCropView.CropImageView$6$1;
import com.ril.ajio.simpleCropView.CropImageView$7;

public final class a
implements i00_0 {
    public final /* synthetic */ RectF a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ CropImageView d;

    public a(CropImageView cropImageView, RectF rectF, Uri uri) {
        this.d = cropImageView;
        this.a = rectF;
        this.b = uri;
        this.c = false;
    }

    public final void a(v00$a serializable) {
        float f5;
        Object object;
        Object object2 = this.a;
        CropImageView cropImageView = this.d;
        cropImageView.n = object2;
        object2 = this.b;
        cropImageView.w = object2;
        Object object3 = this.c;
        String string2 = "Source Uri must not be null.";
        if (object3 != 0) {
            if (object2 != null) {
                Object object4;
                object = cropImageView.getContext();
                Uri uri = cropImageView.w;
                cropImageView.y = object3 = bz3_0.e(object, uri);
                object3 = cropImageView.a;
                int n3 = cropImageView.b;
                f5 = Math.max(object3, n3);
                n3 = 0x3DCCCCCD;
                float f6 = 0.1f;
                object3 = f5 *= f6;
                if (object3 == 0) {
                    object3 = 0;
                    f5 = 0.0f;
                    object = null;
                } else {
                    uri = cropImageView.getContext();
                    object4 = cropImageView.w;
                    object = bz3_0.c((Context)uri, object4, object3);
                    cropImageView.G = n3 = bz3_0.a;
                    cropImageView.H = n3 = bz3_0.b;
                }
                if (object != null) {
                    uri = cropImageView.v;
                    object4 = new CropImageView$7(cropImageView, (Bitmap)object);
                    uri.post((Runnable)object4);
                }
            } else {
                serializable = new IllegalStateException(string2);
                throw serializable;
            }
        }
        if (object2 != null) {
            Object object5;
            object2 = cropImageView.getContext();
            object = cropImageView.w;
            cropImageView.y = object5 = bz3_0.e((Context)object2, (Uri)object);
            object2 = new int[1];
            object3 = 3379;
            f5 = 4.735E-42f;
            int n4 = 0;
            string2 = null;
            GLES10.glGetIntegerv((int)object3, (int[])object2, (int)0);
            object5 = object2[0];
            if (object5 > 0) {
                object3 = 4096;
                f5 = 5.74E-42f;
                object5 = Math.min(object5, object3);
            } else {
                object5 = 2048;
            }
            object3 = cropImageView.a;
            n4 = cropImageView.b;
            object3 = Math.max(object3, n4);
            if (object3 != 0) {
                object5 = object3;
            }
            object = cropImageView.getContext();
            string2 = cropImageView.w;
            object2 = bz3_0.c(object, (Uri)string2, object5);
            cropImageView.G = object3 = bz3_0.a;
            cropImageView.H = object3 = bz3_0.b;
            cropImageView = cropImageView.v;
            object = new CropImageView$6$1(this, (Bitmap)object2, (v00$a)serializable);
            cropImageView.post((Runnable)object);
            return;
        }
        serializable = new IllegalStateException(string2);
        throw serializable;
    }
}

