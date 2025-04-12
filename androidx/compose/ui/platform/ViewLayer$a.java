/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Outline
 *  android.view.View
 *  android.view.ViewOutlineProvider
 */
package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.platform.ViewLayer;
import kotlin.jvm.internal.Intrinsics;

public final class ViewLayer$a
extends ViewOutlineProvider {
    public final void getOutline(View view, Outline outline) {
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
        view = ((ViewLayer)view).e.b();
        Intrinsics.checkNotNull(view);
        outline.set((Outline)view);
    }
}

