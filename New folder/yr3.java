/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class yr3 {
    public static final yr3$b a = yr3$b.c;
    public static final rq1_2 b;

    static {
        et1_2 et1_22 = et1_2.NONE;
        yr3$a yr3$a = yr3$a.c;
        b = yr1_2.a(et1_22, yr3$a);
    }

    public static final gr3$a a(gr3 object, Ws3 object2, String object3, b30_0 object4, int n3, int n4) {
        int n7;
        int n8;
        if ((n4 &= 2) != 0) {
            object3 = "DeferredAnimation";
        }
        n4 = n3 & 0xE ^ 6;
        int n10 = 1;
        int n14 = 4;
        n8 = n4 > n14 && (n8 = object4.J(object)) != 0 || (n8 = n3 & 6) == n14 ? 1 : 0;
        Object object5 = object4.v();
        b30$a$a b30$a$a = b30$a.a;
        if (n8 != 0 || object5 == b30$a$a) {
            object5 = new gr3$a((gr3)object, (Ws3)object2, (String)object3);
            object4.o(object5);
        }
        object5 = (gr3$a)object5;
        if ((n4 <= n14 || (n7 = object4.J(object)) == 0) && (n7 = n3 & 6) != n14) {
            n10 = 0;
        }
        n7 = object4.x(object5) | n10;
        object3 = object4.v();
        if (n7 != 0 || object3 == b30$a$a) {
            object3 = new cr3_0((gr3)object, (gr3$a)object5);
            object4.o(object3);
        }
        object3 = (Function1)object3;
        ly0_0.b(object5, (Function1)object3, (b30_0)object4);
        boolean bl2 = ((gr3)object).h();
        if (bl2 && (object = (gr3$a$a)((gr3$a)object5).b.getValue()) != null) {
            object2 = ((gr3$a$a)object).c;
            object3 = ((gr3$a)object5).c;
            object4 = ((gr3)object3).f().b();
            object2 = object2.invoke(object4);
            object4 = ((gr3$a$a)object).c;
            Object object6 = ((gr3)object3).f().a();
            object4 = object4.invoke(object6);
            object6 = ((gr3$a$a)object).b;
            object3 = ((gr3)object3).f();
            object3 = (un0_0)object6.invoke(object3);
            object = ((gr3$a$a)object).a;
            ((gr3$d)object).t(object2, object4, (un0_0)object3);
        }
        return object5;
    }

    public static final gr3$d b(gr3 gr32, Object object, Object object2, un0_0 un0_02, Vs3 vs3, b30_0 b30_02, int n3) {
        n3 = (int)(b30_02.J(gr32) ? 1 : 0);
        Object object3 = b30_02.v();
        b30$a$a b30$a$a = b30$a.a;
        if (n3 != 0 || object3 == b30$a$a) {
            Ol ol = (Ol)vs3.a().invoke(object2);
            ol.d();
            object3 = new gr3$d(gr32, object, ol, vs3);
            b30_02.o(object3);
        }
        object3 = (gr3$d)object3;
        boolean bl2 = gr32.h();
        if (bl2) {
            ((gr3$d)object3).t(object, object2, un0_02);
        } else {
            ((gr3$d)object3).u(object2, un0_02);
        }
        boolean bl3 = b30_02.J(gr32);
        boolean bl4 = b30_02.J(object3);
        object2 = b30_02.v();
        if ((bl3 |= bl4) || object2 == b30$a$a) {
            object2 = new er3_0(gr32, (gr3$d)object3);
            b30_02.o(object2);
        }
        object2 = (Function1)object2;
        ly0_0.b(object3, (Function1)object2, b30_02);
        return object3;
    }

    public static final gr3 c(gx2_0 object, b30_0 b30_02) {
        Object object2;
        int n3 = b30_02.J(object);
        Object object3 = null;
        Object object4 = b30_02.v();
        b30$a$a b30$a$a = b30$a.a;
        if (n3 != 0 || object4 == b30$a$a) {
            object2 = "entry";
            object4 = new gr3((Mr3)object, null, (String)object2);
            b30_02.o(object4);
        }
        object4 = (gr3)object4;
        n3 = object instanceof gx2_0;
        if (n3 != 0) {
            n3 = 1030413636;
            b30_02.K(n3);
            object2 = ((gx2_0)object).c.getValue();
            object3 = ((gx2_0)object).b.getValue();
            boolean bl2 = b30_02.J(object);
            Object object5 = b30_02.v();
            if (bl2 || object5 == b30$a$a) {
                object5 = new Fr3((gx2_0)object, null);
                b30_02.o(object5);
            }
            object5 = (Function2)object5;
            ly0_0.e(object2, object3, (Function2)object5, b30_02);
            b30_02.E();
        } else {
            n3 = 1030875195;
            b30_02.K(n3);
            object = ((gx2_0)object).b.getValue();
            ((gr3)object4).a(object, b30_02, 0);
            b30_02.E();
        }
        boolean bl3 = b30_02.J(object4);
        object2 = b30_02.v();
        if (bl3 || object2 == b30$a$a) {
            object2 = new hr3_0((gr3)object4);
            b30_02.o(object2);
        }
        object2 = (Function1)object2;
        ly0_0.b(object4, (Function1)object2, b30_02);
        return object4;
    }

    public static final gr3 d(Object object, String string2, b30_0 b30_02, int n3, int n4) {
        b30$a$a b30$a$a;
        Object object2;
        int n7;
        if ((n4 &= 2) != 0) {
            n7 = 0;
            string2 = null;
        }
        if ((object2 = b30_02.v()) == (b30$a$a = b30$a.a)) {
            VR1 vR1 = new VR1(object);
            object2 = new gr3(vR1, null, string2);
            b30_02.o(object2);
        }
        object2 = (gr3)object2;
        n7 = n3 & 8 | 0x30;
        ((gr3)object2).a(object, b30_02, n7 |= (n3 &= 0xE));
        object = b30_02.v();
        if (object == b30$a$a) {
            object = new yr3$c((gr3)object2);
            b30_02.o(object);
        }
        object = (Function1)object;
        ly0_0.b(object2, (Function1)object, b30_02);
        return object2;
    }
}

