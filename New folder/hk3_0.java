/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Hk3
 */
public final class hk3_0
extends Iw {
    public final ql3_0 h;
    public final Ul3 i;

    /*
     * Enabled aggressive block sorting
     */
    public hk3_0(ql3_0 ql3_02, i72 i722, Ul3 ul3, lm3 lm32) {
        Sl sl = ql3_02.a;
        Object object = ul3 != null ? ul3.a : null;
        Tl3 tl3 = object;
        long l2 = ql3_02.b;
        object = this;
        super(sl, l2, tl3, i722, lm32);
        this.h = ql3_02;
        this.i = ul3;
    }

    public final List y(Function1 object) {
        long l2 = this.f;
        boolean bl2 = mm3.b(l2);
        if (bl2) {
            if ((object = (mx0)object.invoke(this)) != null) {
                object = kotlin.collections.a.b(object);
            } else {
                boolean bl3 = false;
                object = null;
            }
        } else {
            object = new bz_0("", 0);
            long l3 = this.f;
            int n3 = mm3.e(l3);
            long l4 = this.f;
            int n4 = mm3.e(l4);
            N03 n03 = new N03(n3, n4);
            n3 = 2;
            Object[] objectArray = new mx0[n3];
            objectArray[0] = object;
            int n7 = 1;
            objectArray[n7] = n03;
            object = xx_2.i(objectArray);
        }
        return object;
    }

    public final int z(Ul3 object, int n3) {
        float f5;
        int n4;
        Object object2;
        Object object3;
        block6: {
            block5: {
                object3 = ((Ul3)object).b;
                if (object3 == null) break block5;
                object2 = ((Ul3)object).c;
                if (object2 != null) {
                    n4 = 1;
                    object3 = object2.G((zp1)object3, n4 != 0);
                } else {
                    f5 = 0.0f;
                    object3 = null;
                }
                if (object3 != null) break block6;
            }
            object3 = aG2.e;
        }
        long l2 = this.h.b;
        n4 = (int)(l2 & 0xFFFFFFFFL);
        object2 = this.d;
        n4 = object2.b(n4);
        object = ((Ul3)object).a;
        aG2 aG22 = ((Tl3)object).c(n4);
        float f6 = ((aG2)object3).d();
        f5 = ((aG2)object3).c();
        f5 = C63.b(bo1_1.a(f6, f5));
        float f7 = n3;
        f5 *= f7;
        f7 = aG22.b;
        long l3 = h72.a(aG22.a, f5 += f7);
        int n7 = ((Tl3)object).b.e(l3);
        return object2.a(n7);
    }
}

