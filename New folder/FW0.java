/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.transition.Transition
 *  android.transition.Transition$TransitionListener
 */
import android.transition.Transition;
import java.util.ArrayList;

public final class FW0
implements Transition.TransitionListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ EW0 g;

    public FW0(EW0 eW0, Object object, ArrayList arrayList, Object object2, ArrayList arrayList2) {
        this.g = eW0;
        this.a = object;
        this.b = arrayList;
        this.c = null;
        this.d = null;
        this.e = object2;
        this.f = arrayList2;
    }

    public final void onTransitionCancel(Transition transition2) {
    }

    public final void onTransitionEnd(Transition transition2) {
        transition2.removeListener((Transition.TransitionListener)this);
    }

    public final void onTransitionPause(Transition transition2) {
    }

    public final void onTransitionResume(Transition transition2) {
    }

    public final void onTransitionStart(Transition transition2) {
        ArrayList arrayList;
        EW0 eW0 = this.g;
        Object object = this.a;
        if (object != null) {
            arrayList = this.b;
            eW0.A(object, arrayList, null);
        }
        if ((object = this.c) != null) {
            arrayList = this.d;
            eW0.A(object, arrayList, null);
        }
        if ((object = this.e) != null) {
            arrayList = this.f;
            eW0.A(object, arrayList, null);
        }
    }
}

