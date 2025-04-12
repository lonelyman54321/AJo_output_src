/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Outline
 *  android.view.View
 *  android.view.ViewOutlineProvider
 */
package androidx.constraintlayout.utils.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.ImageFilterButton;

public final class ImageFilterButton$b
extends ViewOutlineProvider {
    public final /* synthetic */ ImageFilterButton a;

    public ImageFilterButton$b(ImageFilterButton imageFilterButton) {
        this.a = imageFilterButton;
    }

    public final void getOutline(View object, Outline outline) {
        object = this.a;
        int n3 = object.getWidth();
        int n4 = object.getHeight();
        float f5 = object.d;
        outline.setRoundRect(0, 0, n3, n4, f5);
    }
}

