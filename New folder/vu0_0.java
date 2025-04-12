/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 */
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vu0
 */
public final class vu0_0 {
    public static Bitmap a(Drawable drawable2, Bitmap.Config config, B63 object, WS2 wS2, boolean n3) {
        int n4;
        int n7;
        int n8;
        int n10;
        Bitmap.Config config2;
        Object object2;
        int n14;
        block17: {
            block18: {
                n14 = drawable2 instanceof BitmapDrawable;
                if (n14 == 0) break block17;
                object2 = drawable2;
                object2 = ((BitmapDrawable)drawable2).getBitmap();
                config2 = object2.getConfig();
                Object object3 = config != null && (n10 = b.b(config)) == 0 ? config : Bitmap.Config.ARGB_8888;
                if (config2 != object3) break block17;
                if (n3 != 0) break block18;
                n3 = object2.getWidth();
                n8 = object2.getHeight();
                object3 = B63.c;
                int n15 = Intrinsics.areEqual(object, object3);
                if (n15 != 0) {
                    n15 = object2.getWidth();
                } else {
                    wq0 wq02 = ((B63)object).a;
                    n15 = m.f(wq02, wS2);
                }
                n10 = (int)(Intrinsics.areEqual(object, object3) ? 1 : 0);
                if (n10 != 0) {
                    n10 = object2.getHeight();
                } else {
                    object3 = ((B63)object).b;
                    n10 = m.f((wq0)object3, wS2);
                }
                double d2 = cj0_0.a(n3, n8, n15, n10, wS2);
                double d5 = 1.0;
                n3 = (int)(d2 == d5 ? 0 : (d2 < d5 ? -1 : 1));
                if (n3 != 0) break block17;
            }
            return object2;
        }
        drawable2 = drawable2.mutate();
        Object object4 = m.a;
        n3 = drawable2 instanceof BitmapDrawable;
        n14 = 0;
        object2 = null;
        if (n3 != 0) {
            config2 = drawable2;
            config2 = (BitmapDrawable)drawable2;
        } else {
            n8 = 0;
            config2 = null;
        }
        n8 = config2 != null && (config2 = config2.getBitmap()) != null ? config2.getWidth() : drawable2.getIntrinsicWidth();
        n10 = 512;
        if (n8 <= 0) {
            n8 = 512;
        }
        if (n3 != 0) {
            object2 = drawable2;
            object2 = (BitmapDrawable)drawable2;
        }
        if ((n3 = object2 != null && (object4 = object2.getBitmap()) != null ? object4.getHeight() : drawable2.getIntrinsicHeight()) > 0) {
            n10 = n3;
        }
        if ((n14 = Intrinsics.areEqual(object, object4 = B63.c)) != 0) {
            n14 = n8;
        } else {
            object2 = ((B63)object).a;
            n14 = m.f((wq0)object2, wS2);
        }
        n3 = (int)(Intrinsics.areEqual(object, object4) ? 1 : 0);
        if (n3 != 0) {
            n7 = n10;
        } else {
            object = ((B63)object).b;
            n7 = m.f((wq0)object, wS2);
        }
        double d7 = cj0_0.a(n8, n10, n14, n7, wS2);
        n3 = ok1_1.a((double)n8 * d7);
        double d9 = n10;
        n7 = ok1_1.a(d7 *= d9);
        if (config == null || (n4 = b.b(config)) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        config = Bitmap.createBitmap((int)n3, (int)n7, (Bitmap.Config)config);
        wS2 = drawable2.getBounds();
        n14 = ((Rect)wS2).left;
        n8 = ((Rect)wS2).top;
        n10 = ((Rect)wS2).right;
        n4 = ((Rect)wS2).bottom;
        drawable2.setBounds(0, 0, n3, n7);
        object = new Canvas((Bitmap)config);
        drawable2.draw((Canvas)object);
        drawable2.setBounds(n14, n8, n10, n4);
        return config;
    }
}

