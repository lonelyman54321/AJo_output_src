/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class ru3
implements mp {
    public final Object a;
    public final ArrayList b;
    public Object c;

    public ru3(Object object) {
        ArrayList arrayList;
        this.a = object;
        this.b = arrayList = new ArrayList();
        this.c = object;
    }

    public final Object a() {
        return this.c;
    }

    public final void b(int n3, int n4, int n7) {
        ((xp1_0)this.c).O(n3, n4, n7);
    }

    public final void c(int n3, int n4) {
        ((xp1_0)this.c).U(n3, n4);
    }

    public final void clear() {
        Object object;
        this.b.clear();
        this.c = object = this.a;
        ((xp1_0)this.a).T();
    }

    public final void e() {
        sg2_0 sg2_02 = ((xp1_0)this.a).i;
        if (sg2_02 != null) {
            sg2_02.v();
        }
    }

    public final void f(int n3, Object object) {
        object = (xp1_0)object;
        ((xp1_0)this.c).F(n3, (xp1_0)object);
    }

    public final void g(Object object) {
        ArrayList arrayList = this.b;
        Object object2 = this.c;
        arrayList.add(object2);
        this.c = object;
    }

    public final void h() {
        ArrayList arrayList = this.b;
        int n3 = arrayList.isEmpty() ^ 1;
        if (n3 != 0) {
            n3 = arrayList.size() + -1;
            arrayList = arrayList.remove(n3);
            this.c = arrayList;
            return;
        }
        sn2.c("empty stack");
        throw null;
    }
}

