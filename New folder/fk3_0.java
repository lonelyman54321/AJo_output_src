/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fk3
 */
public final class fk3_0 {
    public static void a(ql3_0 object, Mj3 object2, Tl3 object3, zp1 zp12, Il3 il3, boolean n3, i72 i722) {
        float f5;
        boolean bl2;
        float f6;
        long l2;
        String string2;
        if (n3 == 0) {
            return;
        }
        long l3 = ((ql3_0)object).b;
        int n4 = mm3.d(l3);
        if ((n4 = i722.b(n4)) < (n3 = (string2 = ((Tl3)object3).a.a.a).length())) {
            object = ((Tl3)object3).b(n4);
        } else if (n4 != 0) {
            object = ((Tl3)object3).b(n4 += -1);
        } else {
            object = ((Mj3)object2).b;
            object3 = ((Mj3)object2).g;
            object2 = ((Mj3)object2).h;
            long l4 = gk3.b((xm3)object, (Vo0)object3, (RU0$a)object2);
            l2 = 0xFFFFFFFFL;
            f6 = (int)(l4 &= l2);
            bl2 = false;
            f5 = 0.0f;
            object2 = null;
            n3 = 1065353216;
            float f7 = 1.0f;
            object = object3 = new aG2(0.0f, 0.0f, f7, f6);
        }
        f5 = ((aG2)object).a;
        float f8 = ((aG2)object).b;
        long l7 = h72.a(f5, f8);
        l7 = zp12.a0(l7);
        float f11 = e72.d(l7);
        f5 = e72.e(l7);
        l7 = h72.a(f11, f5);
        f11 = ((aG2)object).d();
        f6 = ((aG2)object).c();
        l2 = bo1_1.a(f11, f6);
        object = cg2_0.d(l7, l2);
        object2 = (Il3)il3.a.b.get();
        bl2 = Intrinsics.areEqual(object2, il3);
        if (bl2) {
            object2 = il3.b;
            object2.f((aG2)object);
        }
    }
}

