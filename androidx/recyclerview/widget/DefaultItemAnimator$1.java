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
import androidx.recyclerview.widget.DefaultItemAnimator$b;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.Iterator;

class DefaultItemAnimator$1
implements Runnable {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ DefaultItemAnimator b;

    public DefaultItemAnimator$1(DefaultItemAnimator defaultItemAnimator, ArrayList arrayList) {
        this.b = defaultItemAnimator;
        this.a = arrayList;
    }

    public final void run() {
        DefaultItemAnimator defaultItemAnimator;
        ArrayList arrayList = this.a;
        Iterator iterator = arrayList.iterator();
        while (true) {
            h h3;
            Object object;
            int n3 = iterator.hasNext();
            defaultItemAnimator = this.b;
            if (n3 == 0) break;
            DefaultItemAnimator$b defaultItemAnimator$b = (DefaultItemAnimator$b)iterator.next();
            RecyclerView$B recyclerView$B = defaultItemAnimator$b.a;
            defaultItemAnimator.getClass();
            View view = recyclerView$B.itemView;
            int n4 = defaultItemAnimator$b.d;
            int n7 = defaultItemAnimator$b.b;
            n7 = n4 - n7;
            n4 = defaultItemAnimator$b.e;
            n3 = defaultItemAnimator$b.c;
            int n8 = n4 - n3;
            n3 = 0;
            defaultItemAnimator$b = null;
            if (n7 != 0) {
                object = view.animate();
                object.translationX(0.0f);
            }
            if (n8 != 0) {
                object = view.animate();
                object.translationY(0.0f);
            }
            ViewPropertyAnimator viewPropertyAnimator = view.animate();
            defaultItemAnimator.p.add(recyclerView$B);
            long l2 = defaultItemAnimator.e;
            defaultItemAnimator$b = viewPropertyAnimator.setDuration(l2);
            object = h3;
            h3 = new h(defaultItemAnimator, recyclerView$B, n7, view, n8, viewPropertyAnimator);
            defaultItemAnimator$b = defaultItemAnimator$b.setListener((Animator.AnimatorListener)h3);
            defaultItemAnimator$b.start();
        }
        arrayList.clear();
        defaultItemAnimator.m.remove(arrayList);
    }
}

