/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.AnimatorSet
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 */
import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

public final class Tk$b
extends Drawable.ConstantState {
    public aa3_1 a;
    public AnimatorSet b;
    public ArrayList c;
    public Jp d;

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable() {
        IllegalStateException illegalStateException = new IllegalStateException("No constant state support for SDK < 24.");
        throw illegalStateException;
    }

    public final Drawable newDrawable(Resources object) {
        object = new IllegalStateException("No constant state support for SDK < 24.");
        throw object;
    }
}

