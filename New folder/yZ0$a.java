/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 */
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public final class yZ0$a
extends Drawable.ConstantState {
    public final DZ0 a;

    public yZ0$a(DZ0 dZ0) {
        this.a = dZ0;
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable() {
        yz0_2 yz0_22 = new yz0_2(this);
        return yz0_22;
    }

    public final Drawable newDrawable(Resources object) {
        object = new yz0_2(this);
        return object;
    }
}

