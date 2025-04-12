/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 */
package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$d;
import androidx.recyclerview.widget.c$a;
import androidx.recyclerview.widget.c$b;
import java.util.ArrayList;

/*
 * Renamed from androidx.recyclerview.widget.c
 */
public final class c_0 {
    public final c$b a;
    public final c$a b;
    public final ArrayList c;
    public int d = 0;
    public View e;

    public c_0(RecyclerView$d arrayList) {
        this.a = arrayList;
        arrayList = new ArrayList();
        this.b = arrayList;
        this.c = arrayList = new ArrayList();
    }

    public final void a(View view, int n3, boolean bl2) {
        c$b c$b = this.a;
        if (n3 < 0) {
            Object object = c$b;
            object = ((RecyclerView$d)c$b).a;
            n3 = object.getChildCount();
        } else {
            n3 = this.f(n3);
        }
        c$a c$a = this.b;
        c$a.e(n3, bl2);
        if (bl2) {
            this.i(view);
        }
        RecyclerView recyclerView = ((RecyclerView$d)c$b).a;
        recyclerView.addView(view, n3);
        recyclerView.dispatchChildAttached(view);
    }

    public final void b(View object, int n3, ViewGroup.LayoutParams object2, boolean bl2) {
        Object object3;
        Object object4;
        block10: {
            block9: {
                block8: {
                    Object object5;
                    object4 = this.a;
                    if (n3 < 0) {
                        object5 = object4;
                        object5 = ((RecyclerView$d)object4).a;
                        n3 = object5.getChildCount();
                    } else {
                        n3 = this.f(n3);
                    }
                    c$a c$a = this.b;
                    c$a.e(n3, bl2);
                    if (bl2) {
                        this.i((View)object);
                    }
                    object4 = (RecyclerView$d)object4;
                    object4.getClass();
                    object3 = RecyclerView.getChildViewHolderInt(object);
                    object4 = ((RecyclerView$d)object4).a;
                    if (object3 == null) break block8;
                    boolean bl3 = ((RecyclerView$B)object3).isTmpDetached();
                    if (!bl3 && !(bl3 = ((RecyclerView$B)object3).shouldIgnore())) {
                        object5 = new StringBuilder("Called attach on a child which is not detached: ");
                        ((StringBuilder)object5).append(object3);
                        object5 = lu_0.a((RecyclerView)object4, (StringBuilder)object5);
                        object = new IllegalArgumentException((String)object5);
                        throw object;
                    }
                    bl3 = RecyclerView.sVerboseLoggingEnabled;
                    if (bl3) {
                        ((RecyclerView$B)object3).toString();
                    }
                    ((RecyclerView$B)object3).clearTmpDetachFlag();
                    break block9;
                }
                bl2 = RecyclerView.sDebugAssertionsEnabled;
                if (bl2) break block10;
            }
            RecyclerView.access$000((RecyclerView)object4, object, n3, object2);
            return;
        }
        object3 = new StringBuilder("No ViewHolder found for child: ");
        ((StringBuilder)object3).append(object);
        ((StringBuilder)object3).append(", index: ");
        ((StringBuilder)object3).append(n3);
        object = lu_0.a((RecyclerView)object4, (StringBuilder)object3);
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public final void c(int n3) {
        Object object;
        Object object2;
        block9: {
            block8: {
                block7: {
                    n3 = this.f(n3);
                    this.b.f(n3);
                    object2 = ((RecyclerView$d)this.a).a;
                    object = object2.getChildAt(n3);
                    if (object == null) break block7;
                    if ((object = RecyclerView.getChildViewHolderInt((View)object)) != null) {
                        boolean bl2;
                        boolean n4 = ((RecyclerView$B)object).isTmpDetached();
                        if (n4 && !(bl2 = ((RecyclerView$B)object).shouldIgnore())) {
                            StringBuilder stringBuilder = new StringBuilder("called detach on an already detached child ");
                            stringBuilder.append(object);
                            object2 = lu_0.a((RecyclerView)object2, stringBuilder);
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object2);
                            throw illegalArgumentException;
                        }
                        boolean bl3 = RecyclerView.sVerboseLoggingEnabled;
                        if (bl3) {
                            ((RecyclerView$B)object).toString();
                        }
                        int n7 = 256;
                        ((RecyclerView$B)object).addFlags(n7);
                    }
                    break block8;
                }
                boolean bl4 = RecyclerView.sDebugAssertionsEnabled;
                if (bl4) break block9;
            }
            RecyclerView.access$100((RecyclerView)object2, n3);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("No view at offset ");
        stringBuilder.append(n3);
        String string2 = lu_0.a((RecyclerView)object2, stringBuilder);
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final View d(int n3) {
        n3 = this.f(n3);
        return ((RecyclerView$d)this.a).a.getChildAt(n3);
    }

    public final int e() {
        int n3 = ((RecyclerView$d)this.a).a.getChildCount();
        int n4 = this.c.size();
        return n3 - n4;
    }

    public final int f(int n3) {
        int n4;
        int n7 = -1;
        if (n3 < 0) {
            return n7;
        }
        RecyclerView recyclerView = ((RecyclerView$d)this.a).a;
        int n8 = recyclerView.getChildCount();
        for (int i3 = n3; i3 < n8; i3 += n4) {
            c$a c$a = this.b;
            n4 = c$a.b(i3);
            n4 = i3 - n4;
            if ((n4 = n3 - n4) != 0) continue;
            while ((n3 = (int)(c$a.d(i3) ? 1 : 0)) != 0) {
                ++i3;
            }
            return i3;
        }
        return n7;
    }

    public final View g(int n3) {
        return ((RecyclerView$d)this.a).a.getChildAt(n3);
    }

    public final int h() {
        return ((RecyclerView$d)this.a).a.getChildCount();
    }

    public final void i(View object) {
        this.c.add(object);
        Object object2 = (RecyclerView$d)this.a;
        object2.getClass();
        object = RecyclerView.getChildViewHolderInt((View)object);
        if (object != null) {
            object2 = ((RecyclerView$d)object2).a;
            ((RecyclerView$B)object).onEnteredHiddenState((RecyclerView)object2);
        }
    }

    public final int j(View view) {
        int n3;
        RecyclerView recyclerView = ((RecyclerView$d)this.a).a;
        int n4 = recyclerView.indexOfChild(view);
        if (n4 == (n3 = -1)) {
            return n3;
        }
        c$a c$a = this.b;
        boolean bl2 = c$a.d(n4);
        if (bl2) {
            return n3;
        }
        n3 = c$a.b(n4);
        return n4 - n3;
    }

    public final boolean k(View view) {
        return this.c.contains(view);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l(int n3) {
        Throwable throwable2;
        block7: {
            Object object;
            c$b c$b = this.a;
            int n4 = this.d;
            int n7 = 1;
            if (n4 == n7) {
                IllegalStateException illegalStateException = new IllegalStateException("Cannot call removeView(At) within removeView(At)");
                throw illegalStateException;
            }
            int n8 = 2;
            if (n4 == n8) {
                IllegalStateException illegalStateException = new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
                throw illegalStateException;
            }
            n4 = 0;
            n8 = 0;
            try {
                n3 = this.f(n3);
                object = c$b;
                object = (RecyclerView$d)c$b;
                object = ((RecyclerView$d)object).a;
                object = object.getChildAt(n3);
                if (object == null) {
                    this.d = 0;
                    this.e = null;
                    return;
                }
            }
            catch (Throwable throwable2) {
                break block7;
            }
            this.d = n7;
            this.e = object;
            c$a c$a = this.b;
            n7 = (int)(c$a.f(n3) ? 1 : 0);
            if (n7 != 0) {
                this.m((View)object);
            }
            c$b = (RecyclerView$d)c$b;
            ((RecyclerView$d)c$b).a(n3);
            this.d = 0;
            this.e = null;
            return;
        }
        this.d = 0;
        this.e = null;
        throw throwable2;
    }

    public final void m(View object) {
        Object object2 = this.c;
        boolean bl2 = ((ArrayList)object2).remove(object);
        if (bl2) {
            object2 = (RecyclerView$d)this.a;
            object2.getClass();
            object = RecyclerView.getChildViewHolderInt((View)object);
            if (object != null) {
                object2 = ((RecyclerView$d)object2).a;
                ((RecyclerView$B)object).onLeftHiddenState((RecyclerView)object2);
            }
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.b.toString();
        stringBuilder.append(string2);
        stringBuilder.append(", hidden list:");
        int n3 = this.c.size();
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }
}

