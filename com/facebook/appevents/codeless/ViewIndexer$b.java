/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.util.Base64
 *  android.view.View
 */
package com.facebook.appevents.codeless;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Base64;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

public final class ViewIndexer$b
implements Callable {
    public final WeakReference a;

    public ViewIndexer$b(View view) {
        WeakReference<View> weakReference;
        Intrinsics.checkNotNullParameter(view, "rootView");
        this.a = weakReference = new WeakReference<View>(view);
    }

    public final Object call() {
        int n3;
        Object object = (View)this.a.get();
        if (object != null && (n3 = object.getWidth()) != 0 && (n3 = object.getHeight()) != 0) {
            n3 = object.getWidth();
            int n4 = object.getHeight();
            Bitmap.Config config = Bitmap.Config.RGB_565;
            Object object2 = Bitmap.createBitmap((int)n3, (int)n4, (Bitmap.Config)config);
            Intrinsics.checkNotNullExpressionValue(object2, "createBitmap(view.width,\u2026t, Bitmap.Config.RGB_565)");
            Canvas canvas = new Canvas(object2);
            object.draw(canvas);
            object = new ByteArrayOutputStream();
            canvas = Bitmap.CompressFormat.JPEG;
            int n7 = 10;
            object2.compress((Bitmap.CompressFormat)canvas, n7, (OutputStream)object);
            object = object.toByteArray();
            n3 = 2;
            object = Base64.encodeToString((byte[])object, (int)n3);
            object2 = "encodeToString(outputStr\u2026eArray(), Base64.NO_WRAP)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        } else {
            object = "";
        }
        return object;
    }
}

