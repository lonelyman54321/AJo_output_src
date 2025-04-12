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
import androidx.transition.Transition;
import androidx.transition.Transition$i;
import androidx.transition.g;
import androidx.transition.g$a$a;
import java.util.ArrayList;

public final class g$a
implements ViewTreeObserver.OnPreDrawListener,
View.OnAttachStateChangeListener {
    public Transition a;
    public ViewGroup b;

    public final boolean onPreDraw() {
        Object object = this.b;
        object.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
        object.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
        object = g.c;
        ViewGroup viewGroup = this.b;
        boolean bl2 = ((ArrayList)object).remove(viewGroup);
        boolean bl3 = true;
        if (!bl2) {
            return bl3;
        }
        object = g.b();
        Object object2 = (ArrayList<Transition>)((a53)object).get(viewGroup);
        ArrayList arrayList = null;
        if (object2 == null) {
            object2 = new ArrayList();
            ((a53)object).put(viewGroup, object2);
        } else {
            int n3 = ((ArrayList)object2).size();
            if (n3 > 0) {
                arrayList = new ArrayList(object2);
            }
        }
        Transition transition2 = this.a;
        ((ArrayList)object2).add(transition2);
        object2 = new g$a$a(this, (Jp)object);
        transition2.addListener((Transition$i)object2);
        bl2 = false;
        object = null;
        transition2.captureValues(viewGroup, false);
        if (arrayList != null) {
            boolean bl4;
            object = arrayList.iterator();
            while (bl4 = object.hasNext()) {
                object2 = (Transition)object.next();
                ((Transition)object2).resume((View)viewGroup);
            }
        }
        transition2.playTransition(viewGroup);
        return bl3;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View object) {
        int n3;
        object = this.b;
        object.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
        object.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
        object = g.c;
        ViewGroup viewGroup = this.b;
        ((ArrayList)object).remove(viewGroup);
        object = (ArrayList)g.b().get(viewGroup);
        if (object != null && (n3 = ((ArrayList)object).size()) > 0) {
            object = ((ArrayList)object).iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                Transition transition2 = (Transition)object.next();
                transition2.resume((View)viewGroup);
            }
        }
        this.a.clearValues(true);
    }
}

