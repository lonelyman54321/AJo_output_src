/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package androidx.recyclerview.widget;

import android.util.SparseArray;
import androidx.recyclerview.widget.C;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$f$a;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.d$a;
import androidx.recyclerview.widget.d$a$a;
import androidx.recyclerview.widget.e$a;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.p$b;
import androidx.recyclerview.widget.z;
import androidx.recyclerview.widget.z$a;
import androidx.recyclerview.widget.z$b;
import androidx.recyclerview.widget.z$c;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;

public final class e
implements p$b {
    public final d a;
    public final C b;
    public final ArrayList c;
    public final IdentityHashMap d;
    public final ArrayList e;
    public e$a f;
    public final d$a$a g;
    public final z h;

    public e(d object, d$a object2) {
        block5: {
            block3: {
                block4: {
                    long l2;
                    block2: {
                        Object object3 = new ArrayList();
                        this.c = object3;
                        this.d = object3;
                        object3 = new ArrayList();
                        this.e = object3;
                        this.f = object3 = new Object();
                        this.a = object;
                        object2.getClass();
                        object = new Object();
                        object3 = new SparseArray();
                        ((C)object).a = object3;
                        object3 = null;
                        ((C)object).b = 0;
                        this.b = object;
                        object = object2.a;
                        this.g = object;
                        object2 = d$a$a.NO_STABLE_IDS;
                        if (object != object2) break block2;
                        object = new z$b();
                        this.h = object;
                        break block3;
                    }
                    object2 = d$a$a.ISOLATED_STABLE_IDS;
                    if (object != object2) break block4;
                    object = new Object();
                    ((z$a)object).a = l2 = 0L;
                    this.h = object;
                    break block3;
                }
                object2 = d$a$a.SHARED_STABLE_IDS;
                if (object != object2) break block5;
                object = new z$c();
                this.h = object;
            }
            return;
        }
        object = new IllegalArgumentException("unknown stable id mode");
        throw object;
    }

    public final void a() {
        RecyclerView$f$a recyclerView$f$a;
        Object object;
        Object object2;
        block2: {
            int n3;
            object2 = this.e.iterator();
            while ((n3 = object2.hasNext()) != 0) {
                RecyclerView$f$a recyclerView$f$a2;
                object = (p)object2.next();
                RecyclerView$f$a recyclerView$f$a3 = object.c.getStateRestorationPolicy();
                if (recyclerView$f$a3 != (recyclerView$f$a = RecyclerView$f$a.PREVENT) && (recyclerView$f$a3 != (recyclerView$f$a2 = RecyclerView$f$a.PREVENT_WHEN_EMPTY) || (n3 = object.e) != 0)) continue;
                break block2;
            }
            recyclerView$f$a = RecyclerView$f$a.ALLOW;
        }
        if (recyclerView$f$a != (object = ((RecyclerView$f)(object2 = this.a)).getStateRestorationPolicy())) {
            ((d)object2).g(recyclerView$f$a);
        }
    }

    public final int b(p p2) {
        p p5;
        int n3;
        Iterator iterator = this.e.iterator();
        int n4 = 0;
        while ((n3 = iterator.hasNext()) != 0 && (p5 = (p)iterator.next()) != p2) {
            n3 = p5.e;
            n4 += n3;
        }
        return n4;
    }

    public final e$a c(int n3) {
        boolean bl2;
        Object object = this.f;
        boolean bl3 = ((e$a)object).c;
        if (bl3) {
            object = new Object();
        } else {
            ((e$a)object).c = bl3 = true;
        }
        Object object2 = this.e.iterator();
        int n4 = n3;
        while (bl2 = object2.hasNext()) {
            p p2 = (p)object2.next();
            int n7 = p2.e;
            if (n7 > n4) {
                ((e$a)object).a = p2;
                ((e$a)object).b = n4;
                break;
            }
            n4 -= n7;
        }
        if ((object2 = ((e$a)object).a) != null) {
            return object;
        }
        String string2 = hj0_0.a(n3, "Cannot find wrapper for ");
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final p d(RecyclerView$B object) {
        Object object2 = (p)this.d.get(object);
        if (object2 != null) {
            return object2;
        }
        StringBuilder stringBuilder = new StringBuilder("Cannot find wrapper for ");
        stringBuilder.append(object);
        stringBuilder.append(", seems like it is not bound by this adapter: ");
        stringBuilder.append(this);
        object = stringBuilder.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }
}

