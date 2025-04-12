/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.BlendMode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.StateListDrawable
 */
import android.graphics.BlendMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

public final class vf {
    public static /* bridge */ /* synthetic */ BlendMode a() {
        return BlendMode.DST_OVER;
    }

    public static /* bridge */ /* synthetic */ Drawable b(StateListDrawable stateListDrawable, int n3) {
        return stateListDrawable.getStateDrawable(n3);
    }
}

