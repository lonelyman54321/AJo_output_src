/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

public final class n10$a {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;

    public n10$a() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
        this.b = arrayList = new ArrayList();
        this.c = arrayList = new ArrayList();
        this.d = arrayList = new ArrayList();
        this.e = arrayList = new ArrayList();
    }

    public n10$a(n10_0 object) {
        ArrayList arrayList;
        this.a = arrayList = CollectionsKt.m0(((n10_0)object).a);
        this.b = arrayList = CollectionsKt.m0(((n10_0)object).b);
        this.c = arrayList = CollectionsKt.m0(((n10_0)object).c);
        this.d = arrayList = CollectionsKt.m0(((n10_0)object).d);
        this.e = object = CollectionsKt.m0(((n10_0)object).e);
    }

    public final void a(eL0$a eL0$a, Class clazz) {
        ArrayList arrayList = this.d;
        Pair pair = new Pair(eL0$a, clazz);
        arrayList.add(pair);
    }

    public final void b(bH1 bH12, Class clazz) {
        ArrayList arrayList = this.b;
        Pair pair = new Pair(bH12, clazz);
        arrayList.add(pair);
    }

    public final n10_0 c() {
        List list = e.a(this.a);
        List list2 = e.a(this.b);
        List list3 = e.a(this.c);
        List list4 = e.a(this.d);
        List list5 = e.a(this.e);
        n10_0 n10_02 = new n10_0(list, list2, list3, list4, list5);
        return n10_02;
    }
}

