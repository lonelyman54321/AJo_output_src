/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

public final class wJ2 {
    public final wJ2$b a;
    public final ArrayDeque b;
    public final ArrayDeque c;
    public final PriorityQueue d;
    public int e;
    public wJ2$a f;

    public wJ2(wJ2$b abstractCollection) {
        this.a = abstractCollection;
        this.b = abstractCollection = new AbstractCollection();
        this.c = abstractCollection = new AbstractCollection();
        this.d = abstractCollection;
        this.e = -1;
    }

    public final void a(long l2, Xm2 object) {
        block6: {
            long l3;
            long l4;
            Object object2;
            int n3;
            int n4;
            PriorityQueue priorityQueue;
            block7: {
                int n7 = this.e;
                if (n7 == 0) break block6;
                priorityQueue = this.d;
                n4 = -1;
                if (n7 == n4 || (n7 = priorityQueue.size()) < (n3 = this.e)) break block7;
                object2 = (wJ2$a)priorityQueue.peek();
                n3 = gz3.a;
                l4 = ((wJ2$a)object2).b;
                long l7 = l2 - l4;
                n7 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
                if (n7 < 0) break block6;
            }
            object2 = (n3 = (int)(((ArrayDeque)(object2 = this.b)).isEmpty() ? 1 : 0)) != 0 ? new Xm2() : (Xm2)((ArrayDeque)object2).pop();
            n3 = ((Xm2)object).a();
            ((Xm2)object2).F(n3);
            Object object3 = ((Xm2)object).a;
            int n8 = ((Xm2)object).b;
            byte[] byArray = ((Xm2)object2).a;
            int n10 = ((Xm2)object2).a();
            boolean bl2 = false;
            System.arraycopy(object3, n8, byArray, 0, n10);
            object = this.f;
            if (object != null && (n10 = (int)((l3 = l2 - (l4 = ((wJ2$a)object).b)) == 0L ? 0 : (l3 < 0L ? -1 : 1))) == 0) {
                ((wJ2$a)object).a.add(object2);
                return;
            }
            object = this.c;
            n3 = (int)(((ArrayDeque)object).isEmpty() ? 1 : 0);
            object = n3 != 0 ? new wJ2$a() : (wJ2$a)((ArrayDeque)object).pop();
            object.getClass();
            l4 = -9223372036854775807L;
            n10 = (int)(l2 == l4 ? 0 : (l2 < l4 ? -1 : 1));
            if (n10 != 0) {
                bl2 = true;
            }
            ct3.a(bl2);
            object3 = ((wJ2$a)object).a;
            boolean bl3 = ((ArrayList)object3).isEmpty();
            ct3.f(bl3);
            ((wJ2$a)object).b = l2;
            ((ArrayList)object3).add(object2);
            priorityQueue.add(object);
            this.f = object;
            int n14 = this.e;
            if (n14 != n4) {
                this.b(n14);
            }
            return;
        }
        this.a.a(l2, (Xm2)object);
    }

    public final void b(int n3) {
        Object object;
        int n4;
        while ((n4 = ((PriorityQueue)(object = this.d)).size()) > n3) {
            long l2;
            long l3;
            long l4;
            long l7;
            Object object2;
            object = (wJ2$a)((PriorityQueue)object).poll();
            n4 = gz3.a;
            n4 = 0;
            Object object3 = null;
            while (true) {
                Object object4 = ((wJ2$a)object).a;
                int n7 = ((ArrayList)object4).size();
                object2 = ((wJ2$a)object).a;
                if (n4 >= n7) break;
                long l8 = ((wJ2$a)object).b;
                object4 = (Xm2)((ArrayList)object2).get(n4);
                wJ2$b wJ2$b = this.a;
                wJ2$b.a(l8, (Xm2)object4);
                object4 = this.b;
                object2 = (Xm2)((ArrayList)object2).get(n4);
                ((ArrayDeque)object4).push(object2);
                ++n4;
            }
            ((ArrayList)object2).clear();
            object3 = this.f;
            if (object3 != null && (l7 = (l4 = (l3 = ((wJ2$a)object3).b) - (l2 = ((wJ2$a)object).b)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
                n4 = 0;
                object3 = null;
                this.f = null;
            }
            object3 = this.c;
            ((ArrayDeque)object3).push(object);
        }
    }
}

