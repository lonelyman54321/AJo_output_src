/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 */
import android.graphics.drawable.Drawable;

public final class Tk$a
implements Drawable.Callback {
    public final /* synthetic */ tk_0 a;

    public Tk$a(tk_0 tk_02) {
        this.a = tk_02;
    }

    public final void invalidateDrawable(Drawable drawable2) {
        this.a.invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable2, Runnable runnable2, long l2) {
        this.a.scheduleSelf(runnable2, l2);
    }

    public final void unscheduleDrawable(Drawable drawable2, Runnable runnable2) {
        this.a.unscheduleSelf(runnable2);
    }
}

