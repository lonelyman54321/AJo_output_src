/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.transition.AutoTransition;
import androidx.transition.R$id;
import androidx.transition.Transition;
import androidx.transition.g$a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class g {
    public static final AutoTransition a;
    public static final ThreadLocal b;
    public static final ArrayList c;

    static {
        ArrayList arrayList = new ArrayList();
        a = arrayList;
        arrayList = new ArrayList();
        b = arrayList;
        c = arrayList = new ArrayList();
    }

    public static void a(ViewGroup viewGroup, Transition transition2) {
        Object object = c;
        boolean bl2 = ((ArrayList)object).contains(viewGroup);
        if (!bl2 && (bl2 = viewGroup.isLaidOut())) {
            ((ArrayList)object).add(viewGroup);
            if (transition2 == null) {
                transition2 = a;
            }
            transition2 = transition2.clone();
            g.c(viewGroup, transition2);
            int n3 = R$id.transition_current_scene;
            bl2 = false;
            viewGroup.setTag(n3, null);
            if (transition2 != null) {
                object = new Object();
                ((g$a)object).a = transition2;
                ((g$a)object).b = viewGroup;
                viewGroup.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object);
                viewGroup = viewGroup.getViewTreeObserver();
                viewGroup.addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)object);
            }
        }
    }

    public static Jp b() {
        ThreadLocal threadLocal = b;
        Object object = (WeakReference)threadLocal.get();
        if (object != null && (object = (Jp)((Reference)object).get()) != null) {
            return object;
        }
        object = new Jp();
        WeakReference<Object> weakReference = new WeakReference<Object>(object);
        threadLocal.set(weakReference);
        return object;
    }

    public static void c(ViewGroup object, Transition transition2) {
        int n3;
        int n4;
        Object object2 = (ArrayList)g.b().get(object);
        if (object2 != null && (n4 = ((ArrayList)object2).size()) > 0) {
            object2 = ((ArrayList)object2).iterator();
            while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                Transition transition3 = (Transition)object2.next();
                transition3.pause((View)object);
            }
        }
        if (transition2 != null) {
            boolean bl2 = true;
            transition2.captureValues((ViewGroup)object, bl2);
        }
        if ((object = (it2_0)object.getTag(n3 = R$id.transition_current_scene)) == null) {
            return;
        }
        throw null;
    }
}

