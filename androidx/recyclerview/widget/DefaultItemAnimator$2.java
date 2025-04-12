/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.view.View
 *  android.view.ViewPropertyAnimator
 */
package androidx.recyclerview.widget;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DefaultItemAnimator$a;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.j;
import java.util.ArrayList;
import java.util.Iterator;

class DefaultItemAnimator$2
implements Runnable {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ DefaultItemAnimator b;

    public DefaultItemAnimator$2(DefaultItemAnimator defaultItemAnimator, ArrayList arrayList) {
        this.b = defaultItemAnimator;
        this.a = arrayList;
    }

    public final void run() {
        DefaultItemAnimator defaultItemAnimator;
        ArrayList arrayList = this.a;
        Iterator iterator = arrayList.iterator();
        while (true) {
            Object object;
            boolean bl2 = iterator.hasNext();
            defaultItemAnimator = this.b;
            if (!bl2) break;
            DefaultItemAnimator$a defaultItemAnimator$a = (DefaultItemAnimator$a)iterator.next();
            defaultItemAnimator.getClass();
            RecyclerView$B recyclerView$B = defaultItemAnimator$a.a;
            View view = null;
            recyclerView$B = recyclerView$B == null ? null : recyclerView$B.itemView;
            Object object2 = defaultItemAnimator$a.b;
            if (object2 != null) {
                view = ((RecyclerView$B)object2).itemView;
            }
            object2 = defaultItemAnimator.r;
            long l2 = defaultItemAnimator.f;
            if (recyclerView$B != null) {
                object = recyclerView$B.animate().setDuration(l2);
                RecyclerView$B recyclerView$B2 = defaultItemAnimator$a.a;
                ((ArrayList)object2).add(recyclerView$B2);
                int n3 = defaultItemAnimator$a.e;
                int n4 = defaultItemAnimator$a.c;
                float f5 = n3 - n4;
                object.translationX(f5);
                n3 = defaultItemAnimator$a.f;
                n4 = defaultItemAnimator$a.d;
                f5 = n3 -= n4;
                object.translationY(f5);
                recyclerView$B2 = object.alpha(0.0f);
                i i3 = new i(defaultItemAnimator, defaultItemAnimator$a, (ViewPropertyAnimator)object, (View)recyclerView$B);
                recyclerView$B = recyclerView$B2.setListener((Animator.AnimatorListener)i3);
                recyclerView$B.start();
            }
            if (view == null) continue;
            recyclerView$B = view.animate();
            object = defaultItemAnimator$a.b;
            ((ArrayList)object2).add(object);
            object2 = recyclerView$B.translationX(0.0f).translationY(0.0f).setDuration(l2);
            float f6 = 1.0f;
            object2 = object2.alpha(f6);
            j j3 = new j(defaultItemAnimator, defaultItemAnimator$a, (ViewPropertyAnimator)recyclerView$B, view);
            defaultItemAnimator$a = object2.setListener((Animator.AnimatorListener)j3);
            defaultItemAnimator$a.start();
        }
        arrayList.clear();
        defaultItemAnimator.n.remove(arrayList);
    }
}

