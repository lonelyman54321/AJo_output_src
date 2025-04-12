/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.transition.Transition
 *  android.transition.Transition$EpicenterCallback
 */
import android.graphics.Rect;
import android.transition.Transition;

public final class EW0$c
extends Transition.EpicenterCallback {
    public final /* synthetic */ Rect a;

    public EW0$c(Rect rect) {
        this.a = rect;
    }

    public final Rect onGetEpicenter(Transition transition2) {
        boolean bl2;
        transition2 = this.a;
        if (transition2 != null && !(bl2 = transition2.isEmpty())) {
            return transition2;
        }
        return null;
    }
}

