/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.B$a;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$l$c;

public final class B {
    public final a53 a;
    public final pb1_0 b;

    public B() {
        Object object = new a53();
        this.a = object;
        this.b = object = new pb1_0();
    }

    public final void a(RecyclerView$B recyclerView$B, RecyclerView$l$c recyclerView$l$c) {
        int n3;
        a53 a532 = this.a;
        B$a b$a = (B$a)a532.get(recyclerView$B);
        if (b$a == null) {
            b$a = B$a.a();
            a532.put(recyclerView$B, b$a);
        }
        b$a.c = recyclerView$l$c;
        b$a.a = n3 = b$a.a | 8;
    }

    public final RecyclerView$l$c b(RecyclerView$B object, int n3) {
        block5: {
            block8: {
                RecyclerView$l$c recyclerView$l$c;
                B$a b$a;
                int n4;
                a53 a532;
                block7: {
                    int n7;
                    block6: {
                        int n8;
                        a532 = this.a;
                        n4 = a532.f(object);
                        if (n4 < 0) {
                            return null;
                        }
                        b$a = (B$a)a532.l(n4);
                        if (b$a == null || (n7 = (n8 = b$a.a) & n3) == 0) break block5;
                        n7 = ~n3;
                        b$a.a = n8 &= n7;
                        n7 = 4;
                        if (n3 != n7) break block6;
                        recyclerView$l$c = b$a.b;
                        break block7;
                    }
                    n7 = 8;
                    if (n3 != n7) break block8;
                    recyclerView$l$c = b$a.c;
                }
                if ((n8 &= 0xC) == 0) {
                    a532.j(n4);
                    n4 = 0;
                    b$a.a = 0;
                    b$a.b = null;
                    b$a.c = null;
                    object = B$a.d;
                    ((zw2_0)object).a(b$a);
                }
                return recyclerView$l$c;
            }
            object = new IllegalArgumentException("Must provide flag PRE or POST");
            throw object;
        }
        return null;
    }

    public final void c(RecyclerView$B object) {
        int n3;
        a53 a532 = this.a;
        if ((object = (B$a)a532.get(object)) == null) {
            return;
        }
        ((B$a)object).a = n3 = ((B$a)object).a & 0xFFFFFFFE;
    }

    public final void d(RecyclerView$B object) {
        Object object2 = this.b;
        int n3 = ((pb1_0)object2).n();
        int n4 = 1;
        n3 -= n4;
        while (n3 >= 0) {
            Object[] objectArray = ((pb1_0)object2).o(n3);
            if (object == objectArray) {
                objectArray = ((pb1_0)object2).c;
                Object object3 = objectArray[n3];
                Object object4 = rb1_0.a;
                if (object3 == object4) break;
                objectArray[n3] = object4;
                ((pb1_0)object2).a = n4;
                break;
            }
            n3 += -1;
        }
        if ((object = (B$a)((a53)(object2 = this.a)).remove(object)) != null) {
            ((B$a)object).a = 0;
            ((B$a)object).b = null;
            ((B$a)object).c = null;
            object2 = B$a.d;
            ((zw2_0)object2).a(object);
        }
    }
}

