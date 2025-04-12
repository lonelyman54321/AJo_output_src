/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from ql0
 */
public final class ql0_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Lj b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ rl0_0 e;
    public final /* synthetic */ kj1 f;

    public ql0_1(Lj lj, float f5, boolean bl2, rl0_0 rl0_02, kj1 kj12, f80_0 f80_02) {
        this.b = lj;
        this.c = f5;
        this.d = bl2;
        this.e = rl0_02;
        this.f = kj12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        rl0_0 rl0_02 = this.e;
        kj1 kj12 = this.f;
        Lj lj = this.b;
        float f5 = this.c;
        boolean bl2 = this.d;
        object = new ql0_1(lj, f5, bl2, rl0_02, kj12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ql0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ql0_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 2;
        int n7 = 1;
        float f5 = Float.MIN_VALUE;
        if (n3 != 0) {
            if (n3 != n7 && n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = this.b;
            Object object2 = (xs0_0)((Lj)object).e.getValue();
            float f6 = ((xs0_0)object2).a;
            float f7 = this.c;
            n3 = (int)(xs0_0.a(f6, f7) ? 1 : 0);
            if (n3 == 0) {
                n3 = (int)(this.d ? 1 : 0);
                if (n3 == 0) {
                    object2 = new xs0_0(f7);
                    this.a = n7;
                    if ((object = ((Lj)object).e(this, object2)) == j90_02) {
                        return j90_02;
                    }
                } else {
                    object2 = (xs0_0)((Lj)object).e.getValue();
                    f6 = ((xs0_0)object2).a;
                    rl0_0 rl0_02 = this.e;
                    float f8 = rl0_02.b;
                    boolean bl2 = xs0_0.a(f6, f8);
                    if (bl2) {
                        long l2 = 0L;
                        object2 = new Ey2$b(l2);
                    } else {
                        f8 = rl0_02.d;
                        bl2 = xs0_0.a(f6, f8);
                        if (bl2) {
                            object2 = new x91();
                        } else {
                            f5 = rl0_02.e;
                            n3 = (int)(xs0_0.a(f6, f5) ? 1 : 0);
                            if (n3 != 0) {
                                object2 = new Object();
                            } else {
                                n3 = 0;
                                f6 = 0.0f;
                                object2 = null;
                            }
                        }
                    }
                    this.a = n4;
                    kj1 kj12 = this.f;
                    object = ry0_0.a((Lj)object, f7, (kj1)object2, kj12, this);
                    if (object == j90_02) {
                        return j90_02;
                    }
                }
            }
        }
        return Unit.a;
    }
}

