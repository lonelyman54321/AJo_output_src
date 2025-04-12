/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.ranges.c;
import kotlin.ranges.f;

public final class KA3
implements Ql {
    public final ArrayList a;

    public KA3(float f5, float f6, Ol ol) {
        int n3 = ol.b();
        Object object = f.m(0, n3);
        float f7 = 1.4E-44f;
        int n4 = yx_2.o((Iterable)object, 10);
        ArrayList<ns0_0> arrayList = new ArrayList<ns0_0>(n4);
        object = ((c)object).iterator();
        while (true) {
            Object object2 = object;
            object2 = (ui1_2)object;
            n4 = (int)(((ui1_2)object2).c ? 1 : 0);
            if (n4 == 0) break;
            object2 = object;
            object2 = (mi1_2)object;
            n4 = ((mi1_2)object2).nextInt();
            f7 = ol.a(n4);
            ns0_0 ns0_02 = new ns0_0(f5, f6, f7);
            arrayList.add(ns0_02);
        }
        this.a = arrayList;
    }

    public final YR0 get(int n3) {
        return (ns0_0)this.a.get(n3);
    }
}

