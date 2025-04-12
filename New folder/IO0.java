/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;

public final class IO0 {
    public int a;
    public int b;
    public final fp_2 c;
    public final AR1 d;
    public Qv1 e;
    public boolean f;

    public IO0() {
        Object object = new fp_2();
        this.c = object;
        this.d = object = new AR1();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(rk2_0 object) {
        int n3;
        Object object2 = "event";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        this.f = n3 = 1;
        int n4 = object instanceof rk2$b;
        int n7 = 2;
        int n8 = 0;
        fp_2 fp_22 = this.c;
        Object object3 = this.d;
        if (n4 != 0) {
            Qv1 qv1;
            object = (rk2$b)object;
            Qv1 qv12 = ((rk2$b)object).e;
            ((AR1)object3).b(qv12);
            this.e = qv1 = ((rk2$b)object).f;
            int[] nArray = IO0$a.$EnumSwitchMapping$0;
            object3 = ((rk2$b)object).a;
            int n10 = ((Enum)object3).ordinal();
            n4 = nArray[n10];
            n10 = ((rk2$b)object).c;
            Collection collection = ((rk2$b)object).b;
            if (n4 != n3) {
                int n14 = ((rk2$b)object).d;
                if (n4 == n7) {
                    this.b = n14;
                    collection = collection;
                    fp_22.addAll(collection);
                    return;
                }
                n3 = 3;
                if (n4 != n3) {
                    return;
                }
                fp_22.clear();
                this.b = n14;
                this.a = n10;
                collection = collection;
                fp_22.addAll(collection);
                return;
            }
            this.a = n10;
            int n15 = collection.size() - n3;
            kotlin.ranges.c.d.getClass();
            n4 = -1;
            object2 = new c(n15, 0, n4);
            object = ((c)object2).d();
            while ((n3 = (int)(((ui1_2)object).c ? 1 : 0)) != 0) {
                n3 = ((mi1_2)object).nextInt();
                object2 = collection.get(n3);
                fp_22.addFirst(object2);
            }
            return;
        }
        n4 = object instanceof rk2$a;
        if (n4 != 0) {
            object = (rk2$a)object;
            Rv1 rv1 = ((rk2$a)object).a;
            Ov1$c ov1$c = Ov1$c.c;
            ((AR1)object3).c(rv1, ov1$c);
            int[] nArray = IO0$a.$EnumSwitchMapping$0;
            object3 = ((rk2$a)object).a;
            int n16 = ((Enum)object3).ordinal();
            n4 = nArray[n16];
            n16 = ((rk2$a)object).d;
            if (n4 != n3) {
                if (n4 != n7) {
                    object = new IllegalArgumentException("Page drop type must be prepend or append");
                    throw object;
                }
                this.b = n16;
                int n17 = ((rk2$a)object).a();
                while (n8 < n17) {
                    fp_22.removeLast();
                    ++n8;
                }
                return;
            }
            this.a = n16;
            int n18 = ((rk2$a)object).a();
            while (n8 < n18) {
                fp_22.removeFirst();
                ++n8;
            }
            return;
        }
        n3 = object instanceof rk2$c;
        if (n3 != 0) {
            object = (rk2$c)object;
            object2 = ((rk2$c)object).a;
            ((AR1)object3).b((Qv1)object2);
            this.e = object = ((rk2$c)object).b;
            return;
        }
        n3 = object instanceof rk2$d;
        if (n3 == 0) return;
        object = (rk2$d)object;
        object2 = ((rk2$d)object).b;
        if (object2 != null) {
            ((AR1)object3).b((Qv1)object2);
        }
        if ((object2 = ((rk2$d)object).c) != null) {
            this.e = object2;
        }
        fp_22.clear();
        this.b = 0;
        this.a = 0;
        object = ((rk2$d)object).a;
        object2 = new Wq3(0, (List)object);
        fp_22.addLast(object2);
    }

    public final List b() {
        boolean bl2 = this.f;
        if (!bl2) {
            return mz0_2.a;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Object object = this.d.d();
        Object object2 = this.c;
        int n3 = ((fp_2)object2).isEmpty() ^ 1;
        if (n3 != 0) {
            rk2$b rk2$b = rk2$b.g;
            object2 = CollectionsKt.k0((Iterable)object2);
            n3 = this.a;
            int n4 = this.b;
            Qv1 qv1 = this.e;
            object = rk2$b$a.a((List)object2, n3, n4, (Qv1)object, qv1);
            arrayList.add(object);
        } else {
            Qv1 qv1 = this.e;
            object2 = new rk2$c((Qv1)object, qv1);
            arrayList.add(object2);
        }
        return arrayList;
    }
}

