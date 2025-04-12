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
import androidx.constraintlayout.utils.widget.ImageFilterView;

public final class ImageFilterView$b
extends ViewOutlineProvider {
    public final /* synthetic */ ImageFilterView a;

    public ImageFilterView$b(ImageFilterView imageFilterView) {
        this.a = imageFilterView;
    }

    public final void getOutline(View object, Outline outline) {
        object = this.a;
        int n3 = object.getWidth();
        int n4 = object.getHeight();
        float f5 = object.g;
        outline.setRoundRect(0, 0, n3, n4, f5);
    }
}

