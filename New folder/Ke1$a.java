/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class Ke1$a {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final Ke1$a$a j;
    public boolean k;

    public Ke1$a(String string2, float f5, float f6, float f7, float f8, long l2, int n3, boolean bl2, int n4) {
        Ke1$a$a ke1$a$a;
        Ke1$a ke1$a = this;
        int n7 = n4 & 1;
        Object object = n7 != 0 ? "" : string2;
        int n8 = n4 & 0x20;
        long l3 = n8 != 0 ? OX.l : l2;
        int n10 = n4 & 0x40;
        n10 = n10 != 0 ? 5 : n3;
        ke1$a.a = object;
        ke1$a.b = f5;
        ke1$a.c = f6;
        ke1$a.d = f7;
        ke1$a.e = f8;
        ke1$a.f = l3;
        ke1$a.g = n10;
        n7 = bl2 ? 1 : 0;
        ke1$a.h = bl2;
        ke1$a.i = object = new Object();
        ke1$a.j = ke1$a$a = new Ke1$a$a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        ((ArrayList)object).add(ke1$a$a);
    }

    public static void a(Ke1$a ke1$a, ArrayList arrayList, i93_0 i93_02) {
        ke1$a.c();
        Object object = ke1$a;
        object = ke1$a.i;
        object = ((Ke1$a$a)pp_0.a((int)1, (ArrayList)object)).j;
        ha3_0 ha3_02 = new ha3_0("", arrayList, 0, i93_02, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
        object.add(ha3_02);
    }

    public final Ke1 b() {
        ca3_0 ca3_02;
        Iterable iterable;
        List list;
        float f5;
        float f6;
        float f7;
        float f8;
        float f11;
        float f12;
        Object object;
        Ke1$a$a ke1$a$a;
        int n3;
        Object object2;
        int n4;
        Ke1$a ke1$a = this;
        this.c();
        while ((n4 = ((ArrayList)(object2 = ke1$a.i)).size()) > (n3 = 1)) {
            this.c();
            n4 = ((ArrayList)object2).size() - n3;
            ke1$a$a = (Ke1$a$a)((ArrayList)object2).remove(n4);
            object2 = ((Ke1$a$a)pp_0.a((int)n3, (ArrayList)object2)).j;
            object = ke1$a$a.a;
            float f14 = ke1$a$a.b;
            f12 = ke1$a$a.c;
            f11 = ke1$a$a.d;
            f8 = ke1$a$a.e;
            f7 = ke1$a$a.f;
            f6 = ke1$a$a.g;
            f5 = ke1$a$a.h;
            List list2 = ke1$a$a.i;
            list = ke1$a$a.j;
            iterable = new ca3_0((String)object, f14, f12, f11, f8, f7, f6, f5, list2, list);
            object2.add(iterable);
        }
        ke1$a$a = ke1$a.j;
        String string2 = ke1$a$a.a;
        f12 = ke1$a$a.b;
        f11 = ke1$a$a.c;
        f8 = ke1$a$a.d;
        f7 = ke1$a$a.e;
        f6 = ke1$a$a.f;
        f5 = ke1$a$a.g;
        float f15 = ke1$a$a.h;
        list = ke1$a$a.i;
        iterable = ke1$a$a.j;
        object = ca3_02;
        ca3_02 = new ca3_0(string2, f12, f11, f8, f7, f6, f5, f15, list, (List)iterable);
        n4 = ke1$a.g;
        boolean bl2 = ke1$a.h;
        string2 = ke1$a.a;
        f12 = ke1$a.b;
        f11 = ke1$a.c;
        f8 = ke1$a.d;
        f7 = ke1$a.e;
        long l2 = ke1$a.f;
        object2 = new Ke1(string2, f12, f11, f8, f7, ca3_02, l2, n4, bl2);
        ke1$a.k = n3;
        return object2;
    }

    public final void c() {
        boolean bl2 = this.k ^ true;
        if (bl2) {
            return;
        }
        bh1_1.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        throw null;
    }
}

