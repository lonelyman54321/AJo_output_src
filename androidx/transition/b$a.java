/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.transition;

import android.view.View;
import androidx.transition.Transition;
import androidx.transition.Transition$i;
import java.util.ArrayList;

public final class b$a
implements Transition$i {
    public final /* synthetic */ View a;
    public final /* synthetic */ ArrayList b;

    public b$a(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    public final void onTransitionCancel(Transition transition2) {
    }

    public final void onTransitionEnd(Transition cloneable) {
        ((Transition)cloneable).removeListener(this);
        this.a.setVisibility(8);
        cloneable = this.b;
        int n3 = ((ArrayList)cloneable).size();
        for (int i3 = 0; i3 < n3; ++i3) {
            View view = (View)((ArrayList)cloneable).get(i3);
            view.setVisibility(0);
        }
    }

    public final void onTransitionEnd(Transition transition2, boolean bl2) {
        this.onTransitionEnd(transition2);
    }

    public final void onTransitionPause(Transition transition2) {
    }

    public final void onTransitionResume(Transition transition2) {
    }

    public final void onTransitionStart(Transition transition2) {
        transition2.removeListener(this);
        transition2.addListener(this);
    }

    public final void onTransitionStart(Transition transition2, boolean bl2) {
        this.onTransitionStart(transition2);
    }
}

