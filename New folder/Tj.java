/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class Tj {
    public static final Gm1$a a = Gm1$a.a("k", "x", "y");

    public static Sj a(vm1_1 object, QB1 object2) {
        Object object3;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Object object4 = ((vm1_1)object).z();
        if (object4 == (object3 = Gm1$b.BEGIN_ARRAY)) {
            boolean bl2;
            ((vm1_1)object).a();
            while (bl2 = ((vm1_1)object).k()) {
                boolean bl3;
                float f5;
                object4 = ((vm1_1)object).z();
                if (object4 == (object3 = Gm1$b.BEGIN_OBJECT)) {
                    bl2 = true;
                    f5 = Float.MIN_VALUE;
                    bl3 = true;
                } else {
                    bl2 = false;
                    f5 = 0.0f;
                    object4 = null;
                    bl3 = false;
                }
                float f6 = wz3.c();
                sn2 sn22 = sn2.a;
                object3 = object;
                object4 = Eo1.b((gm1_0)object, (QB1)object2, f6, sn22, bl3, false);
                object3 = new nn2((QB1)object2, (Bo1)object4);
                arrayList.add(object3);
            }
            ((vm1_1)object).c();
            Fo1.b(arrayList);
        } else {
            float f7 = wz3.c();
            object = Xm1.b((gm1_0)object, f7);
            object2 = new Bo1(object);
            arrayList.add(object2);
        }
        object = new Sj(arrayList);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static fk_0 b(vm1_1 object, QB1 qB1) {
        Gm1$b gm1$b;
        Gm1$b gm1$b2;
        ((vm1_1)object).b();
        Sj sj = null;
        oj_1 oj_12 = null;
        oj_1 oj_13 = null;
        boolean bl2 = false;
        while ((gm1$b2 = ((vm1_1)object).z()) != (gm1$b = Gm1$b.END_OBJECT)) {
            block11: {
                int n3;
                block12: {
                    block10: {
                        Gm1$b gm1$b3;
                        Gm1$a gm1$a = a;
                        int n4 = ((vm1_1)object).C(gm1$a);
                        if (!n4) break block11;
                        n3 = 1;
                        if (n4 != n3) {
                            int n7 = 2;
                            if (n4 != n7) {
                                ((vm1_1)object).G();
                                ((vm1_1)object).H();
                                continue;
                            }
                            Gm1$b gm1$b4 = ((vm1_1)object).z();
                            if (gm1$b4 == (gm1$b3 = Gm1$b.STRING)) {
                                ((vm1_1)object).H();
                                break block10;
                            } else {
                                oj_13 = gk_1.c((gm1_0)object, qB1, n3 != 0);
                                continue;
                            }
                        }
                        Gm1$b gm1$b5 = ((vm1_1)object).z();
                        if (gm1$b5 != (gm1$b3 = Gm1$b.STRING)) break block12;
                        ((vm1_1)object).H();
                    }
                    bl2 = true;
                    continue;
                }
                oj_12 = gk_1.c((gm1_0)object, qB1, n3 != 0);
                continue;
            }
            sj = Tj.a((vm1_1)object, qB1);
        }
        ((vm1_1)object).d();
        if (bl2) {
            object = "Lottie doesn't support expressions.";
            qB1.a((String)object);
        }
        if (sj == null) return new Xj(oj_12, oj_13);
        return sj;
    }
}

