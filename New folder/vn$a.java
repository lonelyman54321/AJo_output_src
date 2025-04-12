/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.LayerDrawable
 */
import android.graphics.drawable.LayerDrawable;

public final class vn$a {
    public static void a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int n3) {
        int n4 = layerDrawable.getLayerGravity(n3);
        layerDrawable2.setLayerGravity(n3, n4);
        n4 = layerDrawable.getLayerWidth(n3);
        layerDrawable2.setLayerWidth(n3, n4);
        n4 = layerDrawable.getLayerHeight(n3);
        layerDrawable2.setLayerHeight(n3, n4);
        n4 = layerDrawable.getLayerInsetLeft(n3);
        layerDrawable2.setLayerInsetLeft(n3, n4);
        n4 = layerDrawable.getLayerInsetRight(n3);
        layerDrawable2.setLayerInsetRight(n3, n4);
        n4 = layerDrawable.getLayerInsetTop(n3);
        layerDrawable2.setLayerInsetTop(n3, n4);
        n4 = layerDrawable.getLayerInsetBottom(n3);
        layerDrawable2.setLayerInsetBottom(n3, n4);
        n4 = layerDrawable.getLayerInsetStart(n3);
        layerDrawable2.setLayerInsetStart(n3, n4);
        int n7 = layerDrawable.getLayerInsetEnd(n3);
        layerDrawable2.setLayerInsetEnd(n3, n7);
    }
}

