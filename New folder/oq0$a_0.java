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

/*
 * Renamed from oq0$a
 */
public final class oq0$a_0
extends ViewOutlineProvider {
    public final void getOutline(View view, Outline outline) {
        int n3 = view.getWidth();
        int n4 = view.getHeight();
        outline.setRect(0, 0, n3, n4);
        outline.setAlpha(0.0f);
    }
}

