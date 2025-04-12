/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class k90
extends Lambda
implements Function1 {
    public final /* synthetic */ dr3 c;
    public final /* synthetic */ ql3_0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Se1 g;
    public final /* synthetic */ Vt1 h;
    public final /* synthetic */ i72 i;
    public final /* synthetic */ Sk3 j;
    public final /* synthetic */ ou0_0 k;

    public k90(dr3 dr32, ql3_0 ql3_02, boolean bl2, boolean bl3, Se1 se1, Vt1 vt1, i72 i722, Sk3 sk3, ou0_0 ou0_02) {
        this.c = dr32;
        this.d = ql3_02;
        this.e = bl2;
        this.f = bl3;
        this.g = se1;
        this.h = vt1;
        this.i = i722;
        this.j = sk3;
        this.k = ou0_02;
        super(1);
    }

    public final Object invoke(Object object) {
        int n3;
        boolean bl2;
        k90 k902 = this;
        Object object2 = object;
        object2 = (UY2)object;
        Object object3 = this.c.a;
        Object object4 = RY2.a;
        object4 = MY2.y;
        Object object5 = RY2.a;
        int bl3 = 16;
        Object object6 = object5[bl3];
        object4.getClass();
        object2.a((TY2)object4, object3);
        ql3_0 ql3_02 = this.d;
        long l2 = ql3_02.b;
        object6 = MY2.z;
        int n4 = 17;
        Object object7 = object5[n4];
        object7 = new mm3(l2);
        object6.getClass();
        object2.a((TY2)object6, object7);
        boolean bl4 = this.e;
        if (!bl4) {
            object3 = MY2.j;
            object4 = Unit.a;
            object2.a((TY2)object3, object4);
        }
        boolean bl5 = k902.f;
        if (bl4 && !bl5) {
            bl2 = true;
        } else {
            bl2 = false;
            object3 = null;
        }
        object4 = MY2.G;
        int n7 = 23;
        object5 = object5[n7];
        object5 = bl2;
        object4.getClass();
        object2.a((TY2)object4, object5);
        Vt1 vt1 = k902.h;
        object4 = new b90(vt1);
        RY2.c((UY2)object2, (Function1)object4);
        if (bl2) {
            d90 d902;
            object3 = new c90(vt1, (UY2)object2);
            object4 = yY2.i;
            object5 = new H1(null, (fx0_2)object3);
            object2.a((TY2)object4, object5);
            object6 = k902.h;
            ql3_0 ql3_03 = k902.d;
            n3 = k902.f;
            boolean bl6 = k902.e;
            object3 = d902;
            object7 = object2;
            d902 = new d90(n3 != 0, bl6, (Vt1)object6, (UY2)object2, ql3_03);
            object3 = yY2.m;
            object4 = new H1(null, d902);
            object2.a((TY2)object3, object4);
        }
        object4 = k902.j;
        object5 = k902.h;
        i72 i722 = k902.i;
        boolean bl7 = k902.e;
        object7 = k902.d;
        object3 = new e90(i722, bl7, (ql3_0)object7, (Sk3)object4, (Vt1)object5);
        object4 = yY2.h;
        object5 = new H1(null, (fx0_2)object3);
        object2.a((TY2)object4, object5);
        object3 = k902.g;
        n3 = ((Se1)object3).e;
        object5 = new f90(vt1, (Se1)object3);
        object3 = MY2.A;
        object6 = new Qe1(n3);
        object2.a((TY2)object3, object6);
        object3 = yY2.n;
        object4 = new H1(null, (fx0_2)object5);
        object2.a((TY2)object3, object4);
        object4 = k902.k;
        object3 = new g90(vt1, (ou0_0)object4, bl5);
        object4 = yY2.b;
        object5 = new H1(null, (fx0_2)object3);
        object2.a((TY2)object4, object5);
        object4 = k902.j;
        object3 = new h90((Sk3)object4);
        object5 = yY2.c;
        object6 = new H1(null, (fx0_2)object3);
        object2.a((TY2)object5, object6);
        long l3 = ql3_02.b;
        bl2 = mm3.b(l3);
        if (!bl2) {
            object3 = new i90((Sk3)object4);
            object5 = yY2.o;
            object6 = new H1(null, (fx0_2)object3);
            object2.a((TY2)object5, object6);
            if (bl4 && !bl5) {
                object3 = new j90((Sk3)object4);
                object5 = yY2.p;
                object6 = new H1(null, (fx0_2)object3);
                object2.a((TY2)object5, object6);
            }
        }
        if (bl4 && !bl5) {
            object3 = new a90((Sk3)object4);
            object4 = yY2.q;
            object5 = new H1(null, (fx0_2)object3);
            object2.a((TY2)object4, object5);
        }
        return Unit.a;
    }
}

