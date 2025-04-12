/*
 * Decompiled with CFR 0.152.
 */
package androidx.transition;

import androidx.transition.Transition;
import androidx.transition.Transition$j;
import androidx.transition.TransitionSet;
import androidx.transition.f;
import java.util.ArrayList;

public final class TransitionSet$b
extends f {
    public final /* synthetic */ TransitionSet a;

    public TransitionSet$b(TransitionSet transitionSet) {
        this.a = transitionSet;
    }

    public final void onTransitionCancel(Transition object) {
        TransitionSet transitionSet = this.a;
        ArrayList arrayList = transitionSet.a;
        arrayList.remove(object);
        boolean bl2 = transitionSet.hasAnimators();
        if (!bl2) {
            object = Transition$j.c;
            arrayList = null;
            transitionSet.notifyListeners((Transition$j)object, false);
            transitionSet.mEnded = bl2 = true;
            object = Transition$j.b;
            transitionSet.notifyListeners((Transition$j)object, false);
        }
    }
}

