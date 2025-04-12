/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Outline
 *  android.view.View
 *  android.view.ViewOutlineProvider
 */
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

public final class Ew2
extends ViewOutlineProvider {
    public final void getOutline(View view, Outline outline) {
        int n3 = view.getWidth();
        int n4 = view.getHeight();
        outline.setRect(0, 0, n3, n4);
        outline.setAlpha(0.0f);
    }
}

