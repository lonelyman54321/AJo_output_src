/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Outline
 *  android.view.View
 *  android.view.ViewOutlineProvider
 */
package androidx.compose.ui.graphics.layer;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.layer.ViewLayer;

public final class ViewLayer$a
extends ViewOutlineProvider {
    public final void getOutline(View view, Outline outline) {
        boolean bl2 = view instanceof ViewLayer;
        if (bl2 && (view = ((ViewLayer)view).e) != null) {
            outline.set((Outline)view);
        }
    }
}

