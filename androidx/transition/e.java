/*
 * Decompiled with CFR 0.152.
 */
package androidx.transition;

import androidx.dynamicanimation.animation.b;
import androidx.dynamicanimation.animation.b$q;
import androidx.transition.Transition;
import androidx.transition.Transition$h;
import androidx.transition.Transition$j;
import androidx.transition.TransitionSet;
import java.util.ArrayList;

public final class e
implements b$q {
    public final /* synthetic */ Transition$h a;

    public /* synthetic */ e(Transition$h transition$h) {
        this.a = transition$h;
    }

    public final void a(b object, boolean bl2, float f5, float f6) {
        object = this.a;
        if (!bl2) {
            jr3_0 jr3_02 = Transition$j.b;
            Transition transition2 = ((Transition$h)object).g;
            float f7 = 1.0f;
            float f8 = f5 - f7;
            Object object2 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
            if (object2 < 0) {
                long l2 = transition2.getTotalDurationMillis();
                Transition transition3 = transition2;
                transition3 = ((TransitionSet)transition2).d(0);
                Transition transition4 = Transition.access$000(transition3);
                Transition.access$002(transition3, null);
                long l3 = ((Transition$h)object).a;
                long l4 = -1;
                transition2.setCurrentPlayTimeMillis(l4, l3);
                transition2.setCurrentPlayTimeMillis(l2, l4);
                ((Transition$h)object).a = l2;
                object = ((Transition$h)object).f;
                if (object != null) {
                    object.run();
                }
                object = transition2.mAnimators;
                ((ArrayList)object).clear();
                if (transition4 != null) {
                    boolean bl3 = true;
                    transition4.notifyListeners(jr3_02, bl3);
                }
            } else {
                transition2.notifyListeners(jr3_02, false);
            }
        } else {
            object.getClass();
        }
    }
}

