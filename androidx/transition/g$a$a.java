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
import androidx.transition.g$a;
import java.util.ArrayList;

public final class g$a$a
extends f {
    public final /* synthetic */ Jp a;
    public final /* synthetic */ g$a b;

    public g$a$a(g$a g$a, Jp jp) {
        this.b = g$a;
        this.a = jp;
    }

    public final void onTransitionEnd(Transition transition2) {
        ViewGroup viewGroup = this.b.b;
        ((ArrayList)this.a.get(viewGroup)).remove(transition2);
        transition2.removeListener(this);
    }
}

