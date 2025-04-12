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
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.g;
import java.util.ArrayList;
import java.util.Iterator;

class DefaultItemAnimator$3
implements Runnable {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ DefaultItemAnimator b;

    public DefaultItemAnimator$3(DefaultItemAnimator defaultItemAnimator, ArrayList arrayList) {
        this.b = defaultItemAnimator;
        this.a = arrayList;
    }

    public final void run() {
        DefaultItemAnimator defaultItemAnimator;
        ArrayList arrayList = this.a;
        Iterator iterator = arrayList.iterator();
        while (true) {
            boolean bl2 = iterator.hasNext();
            defaultItemAnimator = this.b;
            if (!bl2) break;
            RecyclerView$B recyclerView$B = (RecyclerView$B)iterator.next();
            defaultItemAnimator.getClass();
            View view = recyclerView$B.itemView;
            ViewPropertyAnimator viewPropertyAnimator = view.animate();
            defaultItemAnimator.o.add(recyclerView$B);
            float f5 = 1.0f;
            ViewPropertyAnimator viewPropertyAnimator2 = viewPropertyAnimator.alpha(f5);
            long l2 = defaultItemAnimator.c;
            viewPropertyAnimator2 = viewPropertyAnimator2.setDuration(l2);
            g g3 = new g(view, viewPropertyAnimator, defaultItemAnimator, recyclerView$B);
            recyclerView$B = viewPropertyAnimator2.setListener((Animator.AnimatorListener)g3);
            recyclerView$B.start();
        }
        arrayList.clear();
        defaultItemAnimator.l.remove(arrayList);
    }
}

