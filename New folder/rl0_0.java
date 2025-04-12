/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from rl0
 */
public final class rl0_0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public rl0_0(float f5, float f6, float f7, float f8, float f11) {
        this.a = f5;
        this.b = f6;
        this.c = f7;
        this.d = f8;
        this.e = f11;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final il_0 a(boolean bl2, wr1_1 wr1_12, b30_0 b30_02, int n3) {
        ql0_1 ql0_12;
        int n4;
        Object object;
        int n7;
        Object object2;
        rl0_0 rl0_02 = this;
        boolean bl3 = bl2;
        Object object3 = wr1_12;
        b30_0 b30_03 = b30_02;
        int n8 = n3;
        int n10 = -1588756907;
        float f5 = -6.96239E-19f;
        b30_02.K(n10);
        Object object4 = b30_02.v();
        Object object5 = b30$a.a;
        if (object4 == object5) {
            object4 = new p83_0();
            b30_02.o(object4);
        }
        object4 = (p83_0)object4;
        int n14 = n8 & 0x70 ^ 0x30;
        int n15 = 32;
        int n16 = 1;
        if (n14 > n15 && (n14 = (int)(b30_03.J(object3) ? 1 : 0)) != 0 || (n14 = n8 & 0x30) == n15) {
            n14 = 1;
        } else {
            n14 = 0;
            object2 = null;
        }
        Object object6 = b30_02.v();
        Object object7 = null;
        if (n14 != 0 || object6 == object5) {
            object6 = new pl0_1((wr1_1)object3, (p83_0)object4, null);
            b30_03.o(object6);
        }
        object6 = (Function2)object6;
        ly0_0.d(b30_03, object3, (Function2)object6);
        object2 = object3 = CollectionsKt.T((List)object4);
        object2 = (kj1)object3;
        float f6 = !bl3 ? rl0_02.c : ((n7 = object2 instanceof Ey2$b) != 0 ? rl0_02.b : ((n7 = object2 instanceof x91) != 0 ? rl0_02.d : ((n7 = object2 instanceof rt0_0) != 0 ? rl0_02.e : rl0_02.a)));
        f5 = f6;
        object3 = b30_02.v();
        if (object3 == object5) {
            object6 = new xs0_0(f6);
            object = ya3_0.c;
            n4 = 12;
            object3 = new Lj(object6, (Ws3)object, null, n4);
            b30_03.o(object3);
        }
        object7 = object3;
        object7 = (Lj)object3;
        object = new xs0_0(f5);
        n7 = b30_03.x(object7);
        n15 = (int)(b30_03.b(f5) ? 1 : 0);
        n7 |= n15;
        n15 = n8 & 0xE ^ 6;
        n4 = 4;
        if (n15 > n4 && (n15 = (int)(b30_03.a(bl2) ? 1 : 0)) != 0 || (n15 = n8 & 6) == n4) {
            n15 = 1;
        } else {
            n15 = 0;
            object6 = null;
        }
        n7 |= n15;
        n15 = n8 & 0x380 ^ 0x180;
        n4 = 256;
        if ((n15 <= n4 || (n15 = (int)(b30_03.J(this) ? 1 : 0)) == 0) && (n8 &= 0x180) != n4) {
            n16 = 0;
            ql0_12 = null;
        }
        n7 |= n16;
        n8 = (int)(b30_03.x(object2) ? 1 : 0);
        Object object8 = b30_02.v();
        if ((n7 |= n8) != 0 || object8 == object5) {
            n15 = 0;
            object6 = null;
            object3 = ql0_12;
            object8 = object7;
            bl3 = bl2;
            object5 = this;
            ql0_12 = new ql0_1((Lj)object7, f5, bl2, this, (kj1)object2, null);
            b30_03.o(ql0_12);
            object8 = ql0_12;
        }
        object8 = (Function2)object8;
        ly0_0.d(b30_03, object, (Function2)object8);
        object3 = ((Lj)object7).c;
        b30_02.E();
        return object3;
    }
}

