/*
 * Decompiled with CFR 0.152.
 */
public final class I92$D
extends I92 {
    public static final I92$D c;

    static {
        I92$D i92$D;
        c = i92$D = new I92(1, 2);
    }

    public final void a(R92$a object, mp object2, q73 object3, F30$a f30$a) {
        object2 = null;
        Object object4 = ((R92$a)object).b(0);
        int n3 = 1;
        Object object5 = (Ae)((R92$a)object).b(n3);
        int n4 = ((R92$a)object).a(0);
        int n7 = object4 instanceof ui2_0;
        if (n7 != 0) {
            object2 = object4;
            object2 = ((ui2_0)object4).a;
            f30$a.g((ti2_0)object2);
        }
        n7 = ((q73)object3).c((Ae)object5);
        n3 = ((q73)object3).J(n7, n4);
        n3 = ((q73)object3).g(n3);
        Object[] objectArray = ((q73)object3).c;
        Object object6 = objectArray[n3];
        objectArray[n3] = object4;
        int n8 = object6 instanceof ui2_0;
        if (n8 != 0) {
            n8 = ((q73)object3).o();
            n4 = ((q73)object3).J(n7, n4);
            n8 -= n4;
            object6 = (ui2_0)object6;
            object = ((ui2_0)object6).b;
            if (object != null && (n7 = (int)(((Ae)object).a() ? 1 : 0)) != 0) {
                n4 = ((q73)object3).c((Ae)object);
                n7 = ((q73)object3).o();
                object5 = ((q73)object3).b;
                int n10 = ((q73)object3).q(n4) + n4;
                n10 = ((q73)object3).p(n10);
                int n14 = ((q73)object3).f((int[])object5, n10);
                n7 -= n14;
            } else {
                n4 = -1;
                n7 = -1;
            }
            object3 = ((ui2_0)object6).a;
            f30$a.e(n8, object3, n4, n7);
        } else {
            n4 = object6 instanceof CF2;
            if (n4 != 0) {
                object6 = (CF2)object6;
                ((CF2)object6).d();
            }
        }
    }

    public final String b(int n3) {
        boolean bl2 = I92$q.a(n3, 0);
        String string2 = bl2 ? "groupSlotIndex" : super.b(n3);
        return string2;
    }

    public final String c(int n3) {
        boolean bl2 = I92$t.a(n3, 0);
        String string2 = bl2 ? "value" : ((bl2 = I92$t.a(n3, 1)) ? "anchor" : super.c(n3));
        return string2;
    }
}

