/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.C;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$f$a;
import androidx.recyclerview.widget.d$a;
import androidx.recyclerview.widget.d$a$a;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.e$a;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.z$d;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;

public final class d
extends RecyclerView$f {
    public final e a;

    public d(RecyclerView$f ... object) {
        int n3;
        Object object2;
        block11: {
            int n4;
            Object object3;
            object2 = d$a.b;
            object = Arrays.asList(object);
            Object object4 = new e(this, (d$a)object2);
            this.a = object4;
            object = object.iterator();
            while (true) {
                boolean bl2;
                Object object5;
                Object object6;
                int n7;
                e e2;
                int n8;
                block12: {
                    n8 = object.hasNext();
                    n3 = 0;
                    object4 = null;
                    int n10 = 1;
                    if (n8 == 0) break block11;
                    object2 = (RecyclerView$f)object.next();
                    e2 = this.a;
                    object3 = e2.e;
                    n4 = ((ArrayList)object3).size();
                    if (n4 < 0 || n4 > (n7 = ((ArrayList)object3).size())) break;
                    object6 = e2.g;
                    Object object7 = d$a$a.NO_STABLE_IDS;
                    if (object6 == object7) {
                        n10 = 0;
                        object5 = null;
                    }
                    if (n10 != 0) {
                        n10 = ((RecyclerView$f)object2).hasStableIds();
                        object6 = "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS";
                        B41.a(n10 != 0, (String)object6);
                    } else {
                        ((RecyclerView$f)object2).hasStableIds();
                    }
                    n10 = ((ArrayList)object3).size();
                    while (true) {
                        n7 = -1;
                        if (n3 >= n10) break;
                        object7 = ((p)((ArrayList)object3).get((int)n3)).c;
                        if (object7 != object2) {
                            ++n3;
                            continue;
                        }
                        break block12;
                        break;
                    }
                    n3 = -1;
                }
                if (n3 == n7) {
                    n3 = 0;
                    object4 = null;
                } else {
                    object4 = (p)((ArrayList)object3).get(n3);
                }
                if (object4 != null) continue;
                object5 = e2.h.a();
                object6 = e2.b;
                object4 = new p((RecyclerView$f)object2, e2, (C)object6, (z$d)object5);
                ((ArrayList)object3).add(n4, object4);
                object5 = e2.c.iterator();
                while (bl2 = object5.hasNext()) {
                    object3 = (RecyclerView)((WeakReference)object5.next()).get();
                    if (object3 == null) continue;
                    ((RecyclerView$f)object2).onAttachedToRecyclerView((RecyclerView)object3);
                }
                n8 = ((p)object4).e;
                if (n8 > 0) {
                    n8 = e2.b((p)object4);
                    n3 = ((p)object4).e;
                    object5 = e2.a;
                    ((RecyclerView$f)object5).notifyItemRangeInserted(n8, n3);
                }
                e2.a();
            }
            object2 = new StringBuilder("Index must be between 0 and ");
            n3 = ((ArrayList)object3).size();
            ((StringBuilder)object2).append(n3);
            ((StringBuilder)object2).append(". Given:");
            ((StringBuilder)object2).append(n4);
            object2 = ((StringBuilder)object2).toString();
            super((String)object2);
            throw object;
        }
        object = this.a.g;
        object2 = d$a$a.NO_STABLE_IDS;
        if (object != object2) {
            n3 = 1;
        }
        super.setHasStableIds(n3 != 0);
    }

    public final int findRelativeAdapterPositionIn(RecyclerView$f object, RecyclerView$B recyclerView$B, int n3) {
        int n4;
        Object object2;
        block4: {
            int n7;
            block3: {
                p p2;
                block2: {
                    object2 = this.a;
                    p2 = (p)((e)object2).d.get(recyclerView$B);
                    if (p2 != null) break block2;
                    n7 = -1;
                    break block3;
                }
                int n8 = ((e)object2).b(p2);
                object2 = p2.c;
                n4 = ((RecyclerView$f)object2).getItemCount();
                if ((n3 -= n8) < 0 || n3 >= n4) break block4;
                n7 = ((RecyclerView$f)object2).findRelativeAdapterPositionIn((RecyclerView$f)object, recyclerView$B, n3);
            }
            return n7;
        }
        StringBuilder stringBuilder = fQ2.a("Detected inconsistent adapter updates. The local position of the view holder maps to ", " which is out of bounds for the adapter with size ", ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:", n3, n4);
        stringBuilder.append(recyclerView$B);
        stringBuilder.append("adapter:");
        stringBuilder.append(object);
        object = stringBuilder.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public final void g(RecyclerView$f$a recyclerView$f$a) {
        super.setStateRestorationPolicy(recyclerView$f$a);
    }

    public final int getItemCount() {
        int n3;
        Iterator iterator = this.a.e.iterator();
        int n4 = 0;
        while ((n3 = iterator.hasNext()) != 0) {
            p p2 = (p)iterator.next();
            n3 = p2.e;
            n4 += n3;
        }
        return n4;
    }

    public final long getItemId(int n3) {
        e e2 = this.a;
        e$a e$a = e2.c(n3);
        p p2 = e$a.a;
        int n4 = e$a.b;
        long l2 = p2.c.getItemId(n4);
        long l3 = p2.b.a(l2);
        e$a.c = false;
        e$a.a = null;
        e$a.b = -1;
        e2.f = e$a;
        return l3;
    }

    public final int getItemViewType(int n3) {
        e e2 = this.a;
        e$a e$a = e2.c(n3);
        p p2 = e$a.a;
        int n4 = e$a.b;
        n4 = p2.c.getItemViewType(n4);
        int n7 = p2.a.b(n4);
        e$a.c = false;
        e$a.a = null;
        e$a.b = -1;
        e2.f = e$a;
        return n7;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        block2: {
            boolean bl2;
            boolean bl3;
            Object object = this.a;
            Object object2 = ((e)object).c;
            WeakReference<RecyclerView> weakReference = ((ArrayList)object2).iterator();
            while (bl3 = weakReference.hasNext()) {
                Object t3 = ((WeakReference)weakReference.next()).get();
                if (t3 != recyclerView) continue;
                break block2;
            }
            weakReference = new WeakReference<RecyclerView>(recyclerView);
            ((ArrayList)object2).add(weakReference);
            object = ((e)object).e.iterator();
            while (bl2 = object.hasNext()) {
                object2 = ((p)object.next()).c;
                ((RecyclerView$f)object2).onAttachedToRecyclerView(recyclerView);
            }
        }
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        e e2 = this.a;
        e$a e$a = e2.c(n3);
        Object object = e2.d;
        p p2 = e$a.a;
        ((IdentityHashMap)object).put(recyclerView$B, p2);
        object = e$a.a;
        int n4 = e$a.b;
        ((p)object).c.bindViewHolder(recyclerView$B, n4);
        e$a.c = false;
        e$a.a = null;
        e$a.b = -1;
        e2.f = e$a;
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        p p2 = (p)this.a.b.a.get(n3);
        if (p2 != null) {
            n3 = p2.a.a(n3);
            return p2.c.onCreateViewHolder((ViewGroup)object, n3);
        }
        String string2 = hj0_0.a(n3, "Cannot find the wrapper for global view type ");
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        boolean bl2;
        Object object = this.a;
        Object object2 = ((e)object).c;
        for (int i3 = ((ArrayList)object2).size() + -1; i3 >= 0; i3 += -1) {
            WeakReference weakReference = (WeakReference)((ArrayList)object2).get(i3);
            Object t3 = weakReference.get();
            if (t3 == null) {
                ((ArrayList)object2).remove(i3);
                continue;
            }
            if ((weakReference = weakReference.get()) != recyclerView) continue;
            ((ArrayList)object2).remove(i3);
            break;
        }
        object = ((e)object).e.iterator();
        while (bl2 = object.hasNext()) {
            object2 = ((p)object.next()).c;
            ((RecyclerView$f)object2).onDetachedFromRecyclerView(recyclerView);
        }
    }

    public final boolean onFailedToRecycleView(RecyclerView$B object) {
        e e2 = this.a;
        Serializable serializable = e2.d;
        Object object2 = (p)((IdentityHashMap)serializable).get(object);
        if (object2 != null) {
            boolean bl2 = ((p)object2).c.onFailedToRecycleView((RecyclerView$B)object);
            ((IdentityHashMap)serializable).remove(object);
            return bl2;
        }
        object2 = new StringBuilder("Cannot find wrapper for ");
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(", seems like it is not bound by this adapter: ");
        ((StringBuilder)object2).append(e2);
        object = ((StringBuilder)object2).toString();
        serializable = new IllegalStateException((String)object);
        throw serializable;
    }

    public final void onViewAttachedToWindow(RecyclerView$B recyclerView$B) {
        this.a.d((RecyclerView$B)recyclerView$B).c.onViewAttachedToWindow(recyclerView$B);
    }

    public final void onViewDetachedFromWindow(RecyclerView$B recyclerView$B) {
        this.a.d((RecyclerView$B)recyclerView$B).c.onViewDetachedFromWindow(recyclerView$B);
    }

    public final void onViewRecycled(RecyclerView$B object) {
        e e2 = this.a;
        Serializable serializable = e2.d;
        Object object2 = (p)((IdentityHashMap)serializable).get(object);
        if (object2 != null) {
            ((p)object2).c.onViewRecycled((RecyclerView$B)object);
            ((IdentityHashMap)serializable).remove(object);
            return;
        }
        object2 = new StringBuilder("Cannot find wrapper for ");
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(", seems like it is not bound by this adapter: ");
        ((StringBuilder)object2).append(e2);
        object = ((StringBuilder)object2).toString();
        serializable = new IllegalStateException((String)object);
        throw serializable;
    }

    public final void setHasStableIds(boolean bl2) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
        throw unsupportedOperationException;
    }

    public final void setStateRestorationPolicy(RecyclerView$f$a object) {
        object = new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
        throw object;
    }
}

