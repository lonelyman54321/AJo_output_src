/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.transition.Transition
 *  android.transition.Transition$TransitionListener
 *  android.view.View
 */
import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

public final class EW0$a
implements Transition.TransitionListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ ArrayList b;

    public EW0$a(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    public final void onTransitionCancel(Transition transition2) {
    }

    public final void onTransitionEnd(Transition object) {
        object.removeListener((Transition.TransitionListener)this);
        this.a.setVisibility(8);
        object = this.b;
        int n3 = ((ArrayList)object).size();
        for (int i3 = 0; i3 < n3; ++i3) {
            View view = (View)((ArrayList)object).get(i3);
            view.setVisibility(0);
        }
    }

    public final void onTransitionPause(Transition transition2) {
    }

    public final void onTransitionResume(Transition transition2) {
    }

    public final void onTransitionStart(Transition transition2) {
        transition2.removeListener((Transition.TransitionListener)this);
        transition2.addListener((Transition.TransitionListener)this);
    }
}

