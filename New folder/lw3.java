/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Rect
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.RippleDrawable
 */
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import java.lang.reflect.Method;

public final class lw3
extends RippleDrawable {
    public static Method e;
    public static boolean f;
    public final boolean a;
    public OX b;
    public Integer c;
    public boolean d;

    public lw3(boolean bl2) {
        ColorDrawable colorDrawable;
        int n3 = -16777216;
        ColorStateList colorStateList = ColorStateList.valueOf((int)n3);
        if (bl2) {
            int n4 = -1;
            colorDrawable = new ColorDrawable(n4);
        } else {
            colorDrawable = null;
        }
        super(colorStateList, null, (Drawable)colorDrawable);
        this.a = bl2;
    }

    public final Rect getDirtyBounds() {
        boolean bl2 = this.a;
        if (!bl2) {
            this.d = bl2 = true;
        }
        Rect rect = super.getDirtyBounds();
        this.d = false;
        return rect;
    }

    public final boolean isProjected() {
        return this.d;
    }
}

