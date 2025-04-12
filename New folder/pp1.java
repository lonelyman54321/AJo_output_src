/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Locale;

public final class pp1 {
    public final List a;
    public final QB1 b;
    public final String c;
    public final long d;
    public final pp1$a e;
    public final long f;
    public final String g;
    public final List h;
    public final dk_0 i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final yj_0 q;
    public final Zj r;
    public final oj_1 s;
    public final List t;
    public final pp1$b u;
    public final boolean v;
    public final py_0 w;
    public final cw0_1 x;
    public final Zo1 y;

    public pp1(List list, QB1 qB1, String string2, long l2, pp1$a pp1$a, long l3, String string3, List list2, dk_0 dk_02, int n3, int n4, int n7, float f5, float f6, float f7, float f8, yj_0 yj_02, Zj zj, List list3, pp1$b pp1$b, oj_1 oj_12, boolean bl2, py_0 py_02, cw0_1 cw0_12, Zo1 zo1) {
        this.a = list;
        this.b = qB1;
        this.c = string2;
        this.d = l2;
        this.e = pp1$a;
        this.f = l3;
        this.g = string3;
        this.h = list2;
        this.i = dk_02;
        this.j = n3;
        this.k = n4;
        this.l = n7;
        this.m = f5;
        this.n = f6;
        this.o = f7;
        this.p = f8;
        this.q = yj_02;
        this.r = zj;
        this.t = list3;
        this.u = pp1$b;
        this.s = oj_12;
        this.v = bl2;
        this.w = py_02;
        this.x = cw0_12;
        this.y = zo1;
    }

    public final String a(String string2) {
        int n3;
        int n4;
        Object object;
        StringBuilder stringBuilder = Ex0.a(string2);
        String string3 = this.c;
        stringBuilder.append(string3);
        string3 = "\n";
        stringBuilder.append(string3);
        Object object2 = this.b;
        Object object3 = ((QB1)object2).i;
        long l2 = this.f;
        object3 = (pp1)((pb1_0)object3).f(l2);
        if (object3 != null) {
            stringBuilder.append("\t\tParents: ");
            object = ((pp1)object3).c;
            stringBuilder.append((String)object);
            object = ((QB1)object2).i;
            long l3 = ((pp1)object3).f;
            object3 = (pp1)((pb1_0)object).f(l3);
            while (object3 != null) {
                stringBuilder.append("->");
                object = ((pp1)object3).c;
                stringBuilder.append((String)object);
                object = ((QB1)object2).i;
                l3 = ((pp1)object3).f;
                object3 = (pp1)((pb1_0)object).f(l3);
            }
            stringBuilder.append(string2);
            stringBuilder.append(string3);
        }
        if ((n4 = (object2 = this.h).isEmpty()) == 0) {
            stringBuilder.append(string2);
            object3 = "\tMasks: ";
            stringBuilder.append((String)object3);
            n3 = object2.size();
            stringBuilder.append(n3);
            stringBuilder.append(string3);
        }
        if ((n3 = this.j) != 0 && (n4 = this.k) != 0) {
            stringBuilder.append(string2);
            stringBuilder.append("\tBackground: ");
            object = Locale.US;
            object2 = n3;
            object3 = n4;
            int n7 = this.l;
            Integer n8 = n7;
            int n10 = 3;
            Object[] objectArray = new Object[n10];
            objectArray[0] = object2;
            objectArray[1] = object3;
            n3 = 2;
            objectArray[n3] = n8;
            object2 = String.format((Locale)object, "%dx%d %X\n", objectArray);
            stringBuilder.append((String)object2);
        }
        if ((n4 = (int)((object2 = this.a).isEmpty() ? 1 : 0)) == 0) {
            stringBuilder.append(string2);
            object3 = "\tShapes:\n";
            stringBuilder.append((String)object3);
            object2 = object2.iterator();
            while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                object3 = object2.next();
                stringBuilder.append(string2);
                object = "\t\t";
                stringBuilder.append((String)object);
                stringBuilder.append(object3);
                stringBuilder.append(string3);
            }
        }
        return stringBuilder.toString();
    }

    public final String toString() {
        return this.a("");
    }
}

