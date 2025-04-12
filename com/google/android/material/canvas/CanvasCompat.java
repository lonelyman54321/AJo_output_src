/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.RectF
 *  android.os.Build$VERSION
 */
package com.google.android.material.canvas;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;

public class CanvasCompat {
    private CanvasCompat() {
    }

    public static int saveLayerAlpha(Canvas canvas, float f5, float f6, float f7, float f8, int n3) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 21;
        if (n4 > n7) {
            return canvas.saveLayerAlpha(f5, f6, f7, f8, n3);
        }
        return canvas.saveLayerAlpha(f5, f6, f7, f8, n3, 31);
    }

    public static int saveLayerAlpha(Canvas canvas, RectF rectF, int n3) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 21;
        if (n4 > n7) {
            return canvas.saveLayerAlpha(rectF, n3);
        }
        return canvas.saveLayerAlpha(rectF, n3, 31);
    }
}

