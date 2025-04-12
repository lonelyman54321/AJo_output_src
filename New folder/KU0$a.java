/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.view.ViewGroup
 *  android.view.animation.PathInterpolator
 */
import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$a;
import androidx.slidingpanelayout.widget.a;
import androidx.transition.ChangeBounds;
import androidx.transition.Transition;
import androidx.transition.g;
import kotlin.Unit;

public final class KU0$a
implements fs0_2 {
    public final /* synthetic */ a a;

    public KU0$a(a a2) {
        this.a = a2;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (JU0)object;
        object2 = this.a.d;
        if (object2 == null) {
            object = null;
        } else {
            object2 = ((SlidingPaneLayout$a)object2).a;
            ((SlidingPaneLayout)((Object)object2)).v = object;
            object = new ChangeBounds();
            long l2 = 300L;
            ((Transition)object).setDuration(l2);
            float f5 = 1.0f;
            float f6 = 0.2f;
            PathInterpolator pathInterpolator = new PathInterpolator(f6, 0.0f, 0.0f, f5);
            ((Transition)object).setInterpolator((TimeInterpolator)pathInterpolator);
            g.a((ViewGroup)object2, (Transition)object);
            object2.requestLayout();
            object = Unit.a;
        }
        object2 = j90_0.COROUTINE_SUSPENDED;
        if (object == object2) {
            return object;
        }
        return Unit.a;
    }
}

