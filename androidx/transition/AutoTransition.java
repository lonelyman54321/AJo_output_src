/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 */
package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;

public class AutoTransition
extends TransitionSet {
    public AutoTransition() {
        this.j();
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j();
    }

    public final void j() {
        int n3 = 1;
        this.i(n3);
        Transition transition2 = new Fade(2);
        this.b(transition2);
        transition2 = new ChangeBounds();
        this.b(transition2);
        transition2 = new Fade(n3);
        this.b(transition2);
    }
}

