/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Fp3$b {
    public HashMap A;
    public HashSet B;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public ImmutableList l;
    public int m;
    public ImmutableList n;
    public int o;
    public int p;
    public int q;
    public ImmutableList r;
    public Fp3$a s;
    public ImmutableList t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public Fp3$b() {
        ImmutableList immutableList;
        ImmutableList immutableList2;
        int n3;
        this.a = n3 = -1 >>> 1;
        this.b = n3;
        this.c = n3;
        this.d = n3;
        this.i = n3;
        this.j = n3;
        this.k = true;
        this.l = immutableList2 = ImmutableList.of();
        this.m = 0;
        this.n = immutableList = ImmutableList.of();
        this.o = 0;
        this.p = n3;
        this.q = n3;
        Cloneable cloneable = ImmutableList.of();
        this.r = cloneable;
        cloneable = Fp3$a.a;
        this.s = cloneable;
        cloneable = ImmutableList.of();
        this.t = cloneable;
        this.u = 0;
        this.v = 0;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = cloneable = new Cloneable();
        this.B = cloneable;
    }

    public Fp3 a() {
        Fp3 fp3 = new Fp3(this);
        return fp3;
    }

    public Fp3$b b(int n3) {
        int n4;
        Iterator iterator = this.A.values().iterator();
        while ((n4 = iterator.hasNext()) != 0) {
            qp3 qp32 = ((Ep3)iterator.next()).a;
            n4 = qp32.c;
            if (n4 != n3) continue;
            iterator.remove();
        }
        return this;
    }

    public final void c(Fp3 object) {
        int n3;
        this.a = n3 = ((Fp3)object).a;
        this.b = n3 = ((Fp3)object).b;
        this.c = n3 = ((Fp3)object).c;
        this.d = n3 = ((Fp3)object).d;
        this.e = n3 = ((Fp3)object).e;
        this.f = n3 = ((Fp3)object).f;
        this.g = n3 = ((Fp3)object).g;
        this.h = n3 = ((Fp3)object).h;
        this.i = n3 = ((Fp3)object).i;
        this.j = n3 = ((Fp3)object).j;
        n3 = ((Fp3)object).k ? 1 : 0;
        this.k = n3;
        Cloneable cloneable = ((Fp3)object).l;
        this.l = cloneable;
        this.m = n3 = ((Fp3)object).m;
        cloneable = ((Fp3)object).n;
        this.n = cloneable;
        this.o = n3 = ((Fp3)object).o;
        this.p = n3 = ((Fp3)object).p;
        this.q = n3 = ((Fp3)object).q;
        cloneable = ((Fp3)object).r;
        this.r = cloneable;
        cloneable = ((Fp3)object).s;
        this.s = cloneable;
        cloneable = ((Fp3)object).t;
        this.t = cloneable;
        this.u = n3 = ((Fp3)object).u;
        this.v = n3 = ((Fp3)object).v;
        n3 = ((Fp3)object).w ? 1 : 0;
        this.w = n3;
        n3 = ((Fp3)object).x ? 1 : 0;
        this.x = n3;
        n3 = ((Fp3)object).y ? 1 : 0;
        this.y = n3;
        n3 = ((Fp3)object).z ? 1 : 0;
        this.z = n3;
        ImmutableSet immutableSet = ((Fp3)object).B;
        this.B = cloneable = new Cloneable(immutableSet);
        object = ((Fp3)object).A;
        cloneable = new Cloneable(object);
        this.A = cloneable;
    }

    public Fp3$b d() {
        this.v = -3;
        return this;
    }

    public Fp3$b e(Ep3 ep3) {
        qp3 qp32 = ep3.a;
        int n3 = qp32.c;
        this.b(n3);
        this.A.put(qp32, ep3);
        return this;
    }

    public Fp3$b f() {
        String[] stringArray = new String[]{};
        return this.g(stringArray);
    }

    public Fp3$b g(String ... object) {
        ImmutableList$Builder immutableList$Builder = ImmutableList.builder();
        int n3 = ((String[])object).length;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = object[i3];
            string2.getClass();
            string2 = gz3.J(string2);
            immutableList$Builder.add(string2);
        }
        this.t = object = immutableList$Builder.build();
        return this;
    }

    public Fp3$b h() {
        this.u = 0;
        return this;
    }

    public Fp3$b i(int n3) {
        HashSet hashSet = this.B;
        Integer n4 = n3;
        hashSet.remove(n4);
        return this;
    }

    public Fp3$b j(int n3, int n4) {
        this.i = n3;
        this.j = n4;
        this.k = true;
        return this;
    }
}

