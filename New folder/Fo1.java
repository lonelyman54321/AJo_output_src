/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class Fo1 {
    public static final Gm1$a a = Gm1$a.a("k");

    public static ArrayList a(gm1_0 gm1_02, QB1 qB1, float f5, qA3 qA32, boolean bl2) {
        int n3;
        Object object;
        ArrayList<Gm1$b> arrayList = new ArrayList<Gm1$b>();
        Object object2 = gm1_02.z();
        if (object2 == (object = Gm1$b.STRING)) {
            qB1.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        gm1_02.b();
        while ((n3 = gm1_02.k()) != 0) {
            boolean bl3;
            object2 = a;
            n3 = gm1_02.C((Gm1$a)object2);
            if (n3 != 0) {
                gm1_02.H();
                continue;
            }
            object2 = gm1_02.z();
            if (object2 == (object = Gm1$b.BEGIN_ARRAY)) {
                gm1_02.a();
                object2 = gm1_02.z();
                object = Gm1$b.NUMBER;
                if (object2 == object) {
                    object2 = Eo1.b(gm1_02, qB1, f5, qA32, false, bl2);
                    arrayList.add((Gm1$b)((Object)object2));
                } else {
                    while ((n3 = (int)(gm1_02.k() ? 1 : 0)) != 0) {
                        bl3 = true;
                        object = gm1_02;
                        object2 = Eo1.b(gm1_02, qB1, f5, qA32, bl3, bl2);
                        arrayList.add((Gm1$b)((Object)object2));
                    }
                }
                gm1_02.c();
                continue;
            }
            bl3 = false;
            object = gm1_02;
            object2 = Eo1.b(gm1_02, qB1, f5, qA32, false, bl2);
            arrayList.add((Gm1$b)((Object)object2));
        }
        gm1_02.d();
        Fo1.b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int n3;
        int n4;
        int n7 = arrayList.size();
        int n8 = 0;
        Object object = null;
        while (true) {
            n4 = 1;
            n3 = n7 + -1;
            if (n8 >= n3) break;
            Bo1 bo1 = (Bo1)arrayList.get(n8);
            Object object2 = (Bo1)arrayList.get(++n8);
            float f5 = ((Bo1)object2).g;
            Object object3 = Float.valueOf(f5);
            bo1.h = object3;
            object3 = bo1.c;
            if (object3 != null || (object2 = ((Bo1)object2).b) == null) continue;
            bo1.c = object2;
            n3 = bo1 instanceof nn2;
            if (n3 == 0) continue;
            bo1 = (nn2)bo1;
            ((nn2)bo1).d();
        }
        Bo1 bo1 = (Bo1)arrayList.get(n3);
        object = bo1.b;
        if ((object == null || (object = bo1.c) == null) && (n8 = arrayList.size()) > n4) {
            arrayList.remove(bo1);
        }
    }
}

