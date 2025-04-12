/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
package androidx.transition;

import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.f;

public final class ChangeBounds$h
extends f {
    public boolean a = false;
    public final ViewGroup b;

    public ChangeBounds$h(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    public final void onTransitionCancel(Transition transition2) {
        VC3.a(this.b, false);
        this.a = true;
    }

    public final void onTransitionEnd(Transition transition2) {
        boolean bl2 = this.a;
        if (!bl2) {
            ViewGroup viewGroup = this.b;
            VC3.a(viewGroup, false);
        }
        transition2.removeListener(this);
    }

    public final void onTransitionPause(Transition transition2) {
        VC3.a(this.b, false);
    }

    public final void onTransitionResume(Transition transition2) {
        VC3.a(this.b, true);
    }
}

