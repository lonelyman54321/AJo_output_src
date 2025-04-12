/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ImageDecoder
 *  android.graphics.ImageDecoder$OnPartialImageListener
 *  android.view.View
 */
import android.graphics.ImageDecoder;
import android.view.View;

public final class Cm0 {
    public static /* bridge */ /* synthetic */ void a(int n3, View view) {
        view.setOutlineSpotShadowColor(n3);
    }

    public static /* bridge */ /* synthetic */ void b(ImageDecoder imageDecoder, Fm0$a fm0$a) {
        imageDecoder.setOnPartialImageListener((ImageDecoder.OnPartialImageListener)fm0$a);
    }
}

