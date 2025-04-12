/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ColorSpace
 *  android.graphics.ColorSpace$Named
 *  android.graphics.ImageDecoder
 *  android.graphics.ImageDecoder$ImageInfo
 *  android.graphics.ImageDecoder$OnHeaderDecodedListener
 *  android.graphics.ImageDecoder$Source
 *  android.os.Build$VERSION
 *  android.util.Log
 */
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;

public final class Fm0
implements ImageDecoder.OnHeaderDecodedListener {
    public final M31 a;
    public final int b;
    public final int c;
    public final Yi0 d;
    public final ss0 e;
    public final boolean f;
    public final ty2_1 g;

    public Fm0(int n3, int n4, Z92 z92) {
        M31 m31;
        this.a = m31 = M31.a();
        this.b = n3;
        this.c = n4;
        Object object = vs0.f;
        object = (Yi0)((Object)z92.c((U92)object));
        this.d = object;
        object = ss0.f;
        object = (ss0)z92.c((U92)object);
        this.e = object;
        object = vs0.i;
        Object object2 = z92.c((U92)object);
        if (object2 != null && (n3 = (int)(((Boolean)(object = (Boolean)z92.c((U92)object))).booleanValue() ? 1 : 0)) != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        this.f = n3;
        object = vs0.g;
        object = (ty2_1)((Object)z92.c((U92)object));
        this.g = object;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source object) {
        object = this.a;
        int n3 = this.b;
        int n4 = this.c;
        int n7 = this.f;
        int n8 = 0;
        boolean bl2 = object.c(n3, n4, n7 != 0, false);
        if (bl2) {
            zm0_1.a(imageDecoder);
        } else {
            am0_0.a(imageDecoder);
        }
        object = this.d;
        Enum enum_ = Yi0.PREFER_RGB_565;
        if (object == enum_) {
            bm0_0.a(imageDecoder);
        }
        object = new Object();
        Cm0.b(imageDecoder, (Fm0$a)object);
        object = Hd1.a(imageInfo);
        n3 = this.b;
        n4 = -1 << -1;
        float f5 = -0.0f;
        if (n3 == n4) {
            n3 = object.getWidth();
        }
        if ((n7 = this.c) == n4) {
            n7 = object.getHeight();
        }
        ss0 ss02 = this.e;
        n8 = object.getWidth();
        int n10 = object.getHeight();
        float f6 = ss02.b(n8, n10, n3, n7);
        f5 = (float)object.getWidth() * f6;
        n4 = Math.round(f5);
        float f7 = object.getHeight();
        n3 = Math.round(f6 *= f7);
        String string2 = "ImageDecoder";
        n8 = 2;
        n7 = Log.isLoggable((String)string2, (int)n8) ? 1 : 0;
        if (n7 != 0) {
            object.getWidth();
            object.getHeight();
        }
        Id1.a(imageDecoder, n4, n3);
        object = this.g;
        if (object != null) {
            n3 = Build.VERSION.SDK_INT;
            n4 = 28;
            f5 = 3.9E-44f;
            if (n3 >= n4) {
                boolean bl3;
                enum_ = ty2_1.DISPLAY_P3;
                imageInfo = object == enum_ && (object = Dm0.a(imageInfo)) != null && (bl3 = Em0.a((ColorSpace)(imageInfo = Dm0.a(imageInfo)))) ? TY.a() : sy_0.a();
                imageInfo = BY.a((ColorSpace.Named)imageInfo);
                td1.a(imageDecoder, (ColorSpace)imageInfo);
            } else {
                int n14 = 26;
                if (n3 >= n14) {
                    imageInfo = BY.a(sy_0.a());
                    td1.a(imageDecoder, (ColorSpace)imageInfo);
                }
            }
        }
    }
}

