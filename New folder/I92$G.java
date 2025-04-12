/*
 * Decompiled with CFR 0.152.
 */
public final class I92$G
extends I92 {
    public static final I92$G c;

    static {
        I92$G i92$G;
        int n3 = 1;
        c = i92$G = new I92(n3, n3);
    }

    public final void a(R92$a object, mp object2, q73 q732, F30$a f30$a) {
        object2 = null;
        Object object3 = ((R92$a)object).b(0);
        int n3 = ((R92$a)object).a(0);
        int n4 = object3 instanceof ui2_0;
        if (n4 != 0) {
            object2 = object3;
            object2 = ((ui2_0)object3).a;
            f30$a.g((ti2_0)object2);
        }
        n4 = q732.t;
        n4 = q732.J(n4, n3);
        n4 = q732.g(n4);
        Object[] objectArray = q732.c;
        Object object4 = objectArray[n4];
        objectArray[n4] = object3;
        n4 = object4 instanceof ui2_0;
        if (n4 != 0) {
            n4 = q732.o();
            int n7 = q732.t;
            n3 = q732.J(n7, n3);
            object4 = (ui2_0)object4;
            object = ((ui2_0)object4).a;
            int n8 = -1;
            f30$a.e(n4 -= n3, object, n8, n8);
        } else {
            n3 = object4 instanceof CF2;
            if (n3 != 0) {
                object4 = (CF2)object4;
                ((CF2)object4).d();
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
        String string2 = bl2 ? "value" : super.c(n3);
        return string2;
    }
}

