/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Outline
 *  android.graphics.drawable.Drawable
 */
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

public final class K2
extends Drawable {
    public final ActionBarContainer a;

    public K2(ActionBarContainer actionBarContainer) {
        this.a = actionBarContainer;
    }

    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.a;
        boolean bl2 = actionBarContainer.h;
        if (bl2) {
            actionBarContainer = actionBarContainer.g;
            if (actionBarContainer != null) {
                actionBarContainer.draw(canvas);
            }
        } else {
            boolean bl3;
            Drawable drawable2 = actionBarContainer.e;
            if (drawable2 != null) {
                drawable2.draw(canvas);
            }
            if ((drawable2 = actionBarContainer.f) != null && (bl3 = actionBarContainer.i)) {
                drawable2.draw(canvas);
            }
        }
    }

    public final int getOpacity() {
        return 0;
    }

    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.a;
        boolean bl2 = actionBarContainer.h;
        if (bl2) {
            Drawable drawable2 = actionBarContainer.g;
            if (drawable2 != null) {
                actionBarContainer = actionBarContainer.e;
                actionBarContainer.getOutline(outline);
            }
        } else {
            actionBarContainer = actionBarContainer.e;
            if (actionBarContainer != null) {
                actionBarContainer.getOutline(outline);
            }
        }
    }

    public final void setAlpha(int n3) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

