/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.transition.Transition
 *  android.transition.Transition$EpicenterCallback
 *  android.transition.Transition$TransitionListener
 *  android.transition.TransitionManager
 *  android.transition.TransitionSet
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class EW0
extends GW0 {
    public static boolean z(Transition object) {
        boolean bl2;
        List list = object.getTargetIds();
        boolean bl3 = GW0.k(list);
        if (bl3 && (bl3 = GW0.k(list = object.getTargetNames())) && (bl2 = GW0.k((List)(object = object.getTargetTypes())))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final void A(Object object, ArrayList arrayList, ArrayList arrayList2) {
        block6: {
            int n3;
            int n4;
            List list;
            int n7;
            int n8;
            block5: {
                object = (Transition)object;
                n8 = object instanceof TransitionSet;
                if (n8 == 0) break block5;
                object = (TransitionSet)object;
                n8 = object.getTransitionCount();
                for (n7 = 0; n7 < n8; ++n7) {
                    Transition transition2 = object.getTransitionAt(n7);
                    this.A(transition2, arrayList, arrayList2);
                }
                break block6;
            }
            n8 = EW0.z((Transition)object);
            if (n8 != 0 || (list = object.getTargets()) == null || (n4 = list.size()) != (n3 = arrayList.size()) || (n8 = (int)(list.containsAll(arrayList) ? 1 : 0)) == 0) break block6;
            if (arrayList2 == null) {
                n8 = 0;
                list = null;
            } else {
                n8 = arrayList2.size();
            }
            while (n7 < n8) {
                View view = (View)arrayList2.get(n7);
                object.addTarget(view);
                ++n7;
            }
            for (int i3 = arrayList.size() + -1; i3 >= 0; i3 += -1) {
                list = (View)arrayList.get(i3);
                object.removeTarget((View)list);
            }
        }
    }

    public final void a(View view, Object object) {
        ((Transition)object).addTarget(view);
    }

    public final void b(Object object, ArrayList arrayList) {
        block4: {
            List list;
            int n3;
            int n4;
            block3: {
                if ((object = (Transition)object) == null) {
                    return;
                }
                n4 = object instanceof TransitionSet;
                if (n4 == 0) break block3;
                object = (TransitionSet)object;
                n4 = object.getTransitionCount();
                for (n3 = 0; n3 < n4; ++n3) {
                    Transition transition2 = object.getTransitionAt(n3);
                    this.b(transition2, arrayList);
                }
                break block4;
            }
            n4 = EW0.z((Transition)object);
            if (n4 != 0 || (n4 = (int)(GW0.k(list = object.getTargets()) ? 1 : 0)) == 0) break block4;
            n4 = arrayList.size();
            while (n3 < n4) {
                View view = (View)arrayList.get(n3);
                object.addTarget(view);
                ++n3;
            }
        }
    }

    public final void e(ViewGroup viewGroup, Object object) {
        object = (Transition)object;
        TransitionManager.beginDelayedTransition((ViewGroup)viewGroup, (Transition)object);
    }

    public final boolean g(Object object) {
        return object instanceof Transition;
    }

    public final Object h(Object object) {
        object = object != null ? ((Transition)object).clone() : null;
        return object;
    }

    public final boolean l() {
        Log.isLoggable((String)"FragmentManager", (int)4);
        return false;
    }

    public final boolean m(Object object) {
        String string2 = "FragmentManager";
        int n3 = 2;
        boolean bl2 = Log.isLoggable((String)string2, (int)n3);
        if (bl2) {
            Objects.toString(object);
        }
        return false;
    }

    public final Object n(Object object, Object object2, Object object3) {
        object = (Transition)object;
        object2 = (Transition)object2;
        object3 = (Transition)object3;
        if (object != null && object2 != null) {
            TransitionSet transitionSet = new TransitionSet();
            object = transitionSet.addTransition((Transition)object).addTransition((Transition)object2);
            int n3 = 1;
            object = object.setOrdering(n3);
        } else if (object == null) {
            object = object2 != null ? object2 : null;
        }
        if (object3 != null) {
            object2 = new TransitionSet();
            if (object != null) {
                object2.addTransition((Transition)object);
            }
            object2.addTransition((Transition)object3);
            return object2;
        }
        return object;
    }

    public final Object o(Object object, Object object2) {
        TransitionSet transitionSet = new TransitionSet();
        if (object != null) {
            object = (Transition)object;
            transitionSet.addTransition((Transition)object);
        }
        object2 = (Transition)object2;
        transitionSet.addTransition((Transition)object2);
        return transitionSet;
    }

    public final void p(Object object, View view, ArrayList arrayList) {
        object = (Transition)object;
        EW0$a eW0$a = new EW0$a(view, arrayList);
        object.addListener((Transition.TransitionListener)eW0$a);
    }

    public final void q(Object object, Object object2, ArrayList arrayList, Object object3, ArrayList arrayList2) {
        object = (Transition)object;
        FW0 fW0 = new FW0(this, object2, arrayList, object3, arrayList2);
        object.addListener((Transition.TransitionListener)fW0);
    }

    public final void s(View object, Object object2) {
        if (object != null) {
            object2 = (Transition)object2;
            Rect rect = new Rect();
            GW0.j(rect, object);
            object = new DW0(rect);
            object2.setEpicenterCallback((Transition.EpicenterCallback)object);
        }
    }

    public final void t(Object object, Rect rect) {
        object = (Transition)object;
        EW0$c eW0$c = new EW0$c(rect);
        object.setEpicenterCallback((Transition.EpicenterCallback)eW0$c);
    }

    public final void u(Fragment object, Object object2, fl_0 fl_02, Runnable runnable2) {
        object2 = (Transition)object2;
        object = new EW0$b(runnable2);
        object2.addListener((Transition.TransitionListener)object);
    }

    public final void w(Object object, View view, ArrayList arrayList) {
        object = (TransitionSet)object;
        List list = object.getTargets();
        list.clear();
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            View view2 = (View)arrayList.get(i3);
            GW0.f(view2, list);
        }
        list.add(view);
        arrayList.add(view);
        this.b(object, arrayList);
    }

    public final void x(Object object, ArrayList arrayList, ArrayList arrayList2) {
        if ((object = (TransitionSet)object) != null) {
            object.getTargets().clear();
            List list = object.getTargets();
            list.addAll(arrayList2);
            this.A(object, arrayList, arrayList2);
        }
    }

    public final Object y(Object object) {
        if (object == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        object = (Transition)object;
        transitionSet.addTransition((Transition)object);
        return transitionSet;
    }
}

