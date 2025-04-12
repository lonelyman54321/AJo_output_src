/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Cs1
 */
public final class cs1_1
extends LP1$c
implements dy2_0 {
    public Function0 n;
    public zs1_0 o;
    public pg2_0 p;
    public boolean q;
    public boolean r;
    public CT2 s;
    public final ds1_1 t;
    public Cs1$d u;

    public cs1_1(hn1_2 fx0_22, zs1_0 zs1_02, pg2_0 pg2_02, boolean bl2, boolean bl3) {
        this.n = fx0_22;
        this.o = zs1_02;
        this.p = pg2_02;
        this.q = bl2;
        this.r = bl3;
        super(this);
        this.t = fx0_22;
        this.r1();
    }

    public final /* synthetic */ boolean N() {
        return false;
    }

    public final /* synthetic */ boolean c1() {
        return false;
    }

    public final boolean g1() {
        return false;
    }

    public final void i0(UY2 uY2) {
        Object object = RY2.a;
        object = MY2.m;
        Object object2 = RY2.a;
        int n3 = 6;
        Object object3 = object2[n3];
        object3 = Boolean.TRUE;
        object.getClass();
        uY2.a((TY2)object, object3);
        object = MY2.F;
        object3 = this.t;
        uY2.a((TY2)object, object3);
        object = this.p;
        object3 = pg2_0.Vertical;
        Object object4 = "scrollAxisRange";
        if (object == object3) {
            object = this.s;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                object = null;
            }
            object3 = MY2.q;
            int n4 = 11;
            object4 = object2[n4];
            object3.getClass();
            uY2.a((TY2)object3, object);
        } else {
            object = this.s;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                object = null;
            }
            object3 = MY2.p;
            int n7 = 10;
            object4 = object2[n7];
            object3.getClass();
            uY2.a((TY2)object3, object);
        }
        object = this.u;
        if (object != null) {
            object3 = yY2.f;
            object4 = new H1(null, (fx0_2)object);
            uY2.a((TY2)object3, object4);
        }
        object = new cs1$a_0(this);
        object3 = yY2.A;
        qy2_0 qy2_02 = new qy2_0((cs1$a_0)object);
        object4 = new H1(null, qy2_02);
        uY2.a((TY2)object3, object4);
        object = this.o.c();
        object3 = MY2.g;
        object2 = object2[20];
        object3.getClass();
        uY2.a((TY2)object3, object);
    }

    public final void r1() {
        Cs1$b cs1$b = new Cs1$b(this);
        Cs1$c cs1$c = new Cs1$c(this);
        boolean bl2 = this.r;
        Object object = new CT2(cs1$b, cs1$c, bl2);
        this.s = object;
        boolean bl3 = this.q;
        if (bl3) {
            object = new Cs1$d(this);
        } else {
            bl3 = false;
            object = null;
        }
        this.u = object;
    }
}

