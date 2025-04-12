/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.transition.R$id;
import androidx.transition.Transition;
import androidx.transition.Transition$f;
import androidx.transition.Transition$i;
import androidx.transition.TransitionSet;
import androidx.transition.a;
import androidx.transition.b$a;
import androidx.transition.b$b;
import androidx.transition.c;
import androidx.transition.d;
import androidx.transition.g;
import androidx.transition.g$a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class b
extends GW0 {
    public static boolean z(Transition object) {
        boolean bl2;
        List list = ((Transition)object).getTargetIds();
        boolean bl3 = GW0.k(list);
        if (bl3 && (bl3 = GW0.k(list = ((Transition)object).getTargetNames())) && (bl2 = GW0.k((List)(object = ((Transition)object).getTargetTypes())))) {
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
            List list;
            int n4;
            int n7;
            int n8;
            block5: {
                object = (Transition)object;
                n8 = object instanceof TransitionSet;
                if (n8 == 0) break block5;
                object = (TransitionSet)object;
                ArrayList arrayList3 = ((TransitionSet)object).a;
                n8 = arrayList3.size();
                for (n7 = 0; n7 < n8; ++n7) {
                    Transition transition2 = ((TransitionSet)object).d(n7);
                    this.A(transition2, arrayList, arrayList2);
                }
                break block6;
            }
            n8 = b.z((Transition)object);
            if (n8 != 0 || (n4 = (list = ((Transition)object).getTargets()).size()) != (n3 = arrayList.size()) || (n8 = (int)(list.containsAll(arrayList) ? 1 : 0)) == 0) break block6;
            if (arrayList2 == null) {
                n8 = 0;
                list = null;
            } else {
                n8 = arrayList2.size();
            }
            while (n7 < n8) {
                View view = (View)arrayList2.get(n7);
                ((Transition)object).addTarget(view);
                ++n7;
            }
            for (int i3 = arrayList.size() + -1; i3 >= 0; i3 += -1) {
                list = (View)arrayList.get(i3);
                ((Transition)object).removeTarget((View)list);
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
                ArrayList arrayList2 = ((TransitionSet)object).a;
                n4 = arrayList2.size();
                for (n3 = 0; n3 < n4; ++n3) {
                    Transition transition2 = ((TransitionSet)object).d(n3);
                    this.b(transition2, arrayList);
                }
                break block4;
            }
            n4 = b.z((Transition)object);
            if (n4 != 0 || (n4 = (int)(GW0.k(list = ((Transition)object).getTargets()) ? 1 : 0)) == 0) break block4;
            n4 = arrayList.size();
            while (n3 < n4) {
                View view = (View)arrayList.get(n3);
                ((Transition)object).addTarget(view);
                ++n3;
            }
        }
    }

    public final void c(Object object) {
        ((Lr3)object).b();
    }

    public final void d(Object object, gn0_0 gn0_02) {
        ((Lr3)object).d(gn0_02);
    }

    public final void e(ViewGroup viewGroup, Object object) {
        object = (Transition)object;
        g.a(viewGroup, (Transition)object);
    }

    public final boolean g(Object object) {
        return object instanceof Transition;
    }

    public final Object h(Object object) {
        object = object != null ? ((Transition)object).clone() : null;
        return object;
    }

    public final Object i(ViewGroup object, Object object2) {
        int n3;
        int n4;
        boolean bl2;
        object2 = (Transition)object2;
        Cloneable cloneable = g.c;
        boolean n42 = ((ArrayList)cloneable).contains(object);
        Lr3 lr3 = null;
        if (!n42 && (bl2 = object.isLaidOut()) && (n4 = Build.VERSION.SDK_INT) >= (n3 = 34)) {
            boolean bl3 = ((Transition)object2).isSeekingSupported();
            if (bl3) {
                ((ArrayList)cloneable).add(object);
                object2 = ((Transition)object2).clone();
                cloneable = new TransitionSet();
                ((TransitionSet)cloneable).b((Transition)object2);
                g.c((ViewGroup)object, (Transition)cloneable);
                int n7 = R$id.transition_current_scene;
                object.setTag(n7, null);
                object2 = new Object();
                ((g$a)object2).a = cloneable;
                ((g$a)object2).b = object;
                object.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object2);
                ViewTreeObserver viewTreeObserver = object.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)object2);
                object.invalidate();
                lr3 = ((Transition)cloneable).createSeekController();
            } else {
                object = new IllegalArgumentException("The Transition must support seeking.");
                throw object;
            }
        }
        return lr3;
    }

    public final boolean l() {
        return true;
    }

    public final boolean m(Object object) {
        Object object2 = object;
        object2 = (Transition)object;
        boolean bl2 = ((Transition)object2).isSeekingSupported();
        if (!bl2) {
            Objects.toString(object);
        }
        return bl2;
    }

    public final Object n(Object object, Object object2, Object object3) {
        object = (Transition)object;
        object2 = (Transition)object2;
        object3 = (Transition)object3;
        if (object != null && object2 != null) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.b((Transition)object);
            transitionSet.b((Transition)object2);
            int n3 = 1;
            transitionSet.i(n3);
            object = transitionSet;
        } else if (object == null) {
            if (object2 != null) {
                object = object2;
            } else {
                boolean bl2 = false;
                object = null;
            }
        }
        if (object3 != null) {
            object2 = new TransitionSet();
            if (object != null) {
                ((TransitionSet)object2).b((Transition)object);
            }
            ((TransitionSet)object2).b((Transition)object3);
            return object2;
        }
        return object;
    }

    public final Object o(Object object, Object object2) {
        TransitionSet transitionSet = new TransitionSet();
        if (object != null) {
            object = (Transition)object;
            transitionSet.b((Transition)object);
        }
        object2 = (Transition)object2;
        transitionSet.b((Transition)object2);
        return transitionSet;
    }

    public final void p(Object object, View view, ArrayList arrayList) {
        object = (Transition)object;
        b$a b$a = new b$a(view, arrayList);
        ((Transition)object).addListener(b$a);
    }

    public final void q(Object object, Object object2, ArrayList arrayList, Object object3, ArrayList arrayList2) {
        object = (Transition)object;
        c c2 = new c(this, object2, arrayList, object3, arrayList2);
        ((Transition)object).addListener(c2);
    }

    public final void r(Object object, float f5) {
        boolean bl2 = (object = (Lr3)object).c();
        if (bl2) {
            long l2;
            float f6 = object.a();
            long l3 = (long)(f5 *= f6);
            long l4 = 0L;
            long l7 = 1L;
            Object object2 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
            if (object2 == false) {
                l3 = l7;
            }
            if ((object2 = (l2 = l3 - (l4 = object.a())) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                l3 = object.a() - l7;
            }
            object.e(l3);
        }
    }

    public final void s(View object, Object object2) {
        if (object != null) {
            object2 = (Transition)object2;
            Rect rect = new Rect();
            GW0.j(rect, object);
            object = new a(rect);
            ((Transition)object2).setEpicenterCallback((Transition$f)object);
        }
    }

    public final void t(Object object, Rect rect) {
        object = (Transition)object;
        b$b b$b = new b$b(rect);
        ((Transition)object).setEpicenterCallback(b$b);
    }

    public final void u(Fragment fragment, Object object, fl_0 fl_02, Runnable runnable2) {
        this.v(object, fl_02, null, runnable2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void v(Object object, fl_0 object2, an0_0 object3, Runnable runnable2) {
        object = (Transition)object;
        HW0 hW0 = new HW0((an0_0)object3, (Transition)object, runnable2);
        // MONITORENTER : object2
        while (true) {
            block14: {
                boolean bl2;
                block13: {
                    while (bl2 = ((fl_0)object2).c) {
                        object2.wait();
                    }
                    object3 = ((fl_0)object2).b;
                    if (object3 != hW0) break block13;
                    // MONITOREXIT : object2
                    break block14;
                }
                ((fl_0)object2).b = hW0;
                bl2 = ((fl_0)object2).a;
                if (bl2) {
                    // MONITOREXIT : object2
                    object2 = hW0.a;
                    if (object2 == null) {
                        hW0.b.cancel();
                        object2 = hW0.c;
                        object2.run();
                    } else {
                        object2.run();
                    }
                }
            }
            object2 = new d(runnable2);
            ((Transition)object).addListener((Transition$i)object2);
            return;
            catch (InterruptedException interruptedException) {
                continue;
            }
            break;
        }
    }

    public final void w(Object object, View view, ArrayList arrayList) {
        object = (TransitionSet)object;
        List list = ((Transition)object).getTargets();
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
            ((Transition)object).getTargets().clear();
            List list = ((Transition)object).getTargets();
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
        transitionSet.b((Transition)object);
        return transitionSet;
    }
}

