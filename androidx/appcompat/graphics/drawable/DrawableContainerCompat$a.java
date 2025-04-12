/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 */
package androidx.appcompat.graphics.drawable;

import android.graphics.drawable.Drawable;

public final class DrawableContainerCompat$a
implements Drawable.Callback {
    public Drawable.Callback a;

    public final void invalidateDrawable(Drawable drawable2) {
    }

    public final void scheduleDrawable(Drawable drawable2, Runnable runnable2, long l2) {
        Drawable.Callback callback2 = this.a;
        if (callback2 != null) {
            callback2.scheduleDrawable(drawable2, runnable2, l2);
        }
    }

    public final void unscheduleDrawable(Drawable drawable2, Runnable runnable2) {
        Drawable.Callback callback2 = this.a;
        if (callback2 != null) {
            callback2.unscheduleDrawable(drawable2, runnable2);
        }
    }
}

