/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zk2
 */
public final class zk2_1
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ fs0_2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yk2_1 d;
    public final /* synthetic */ Rv1 e;
    public ks1_1 f;
    public int g;

    public zk2_1(f80_0 f80_02, yk2_1 yk2_12, Rv1 rv1) {
        this.d = yk2_12;
        this.e = rv1;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object3 = (f80_0)object3;
        yk2_1 yk2_12 = this.d;
        Rv1 rv1 = this.e;
        zk2_1 zk2_12 = new zk2_1((f80_0)object3, yk2_12, rv1);
        zk2_12.b = object;
        zk2_12.c = object2;
        object = Unit.a;
        return zk2_12.invokeSuspend(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Throwable throwable2;
        ks1_1 ks1_12;
        block15: {
            int n3;
            Object object2;
            block17: {
                fs0_2 fs0_22;
                int n4;
                j90_0 j90_02;
                block14: {
                    yk2_1 yk2_12;
                    int n7;
                    block16: {
                        boolean bl2;
                        Object object3;
                        block13: {
                            object2 = this.e;
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            n7 = this.a;
                            yk2_12 = this.d;
                            n4 = 2;
                            n3 = 1;
                            if (n7 != 0) {
                                if (n7 != n3) {
                                    if (n7 == n4) {
                                        vl2_2.b(object);
                                        return Unit.a;
                                    }
                                    object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    throw object;
                                }
                                n7 = this.g;
                                ks1_12 = this.f;
                                object3 = (Jk2$a)this.c;
                                fs0_22 = this.b;
                                vl2_2.b(object);
                            } else {
                                vl2_2.b(object);
                                fs0_22 = this.b;
                                n7 = ((Number)this.c).intValue();
                                object3 = yk2_12.k;
                                ks1_12 = ((Jk2$a)object3).a;
                                this.b = fs0_22;
                                this.c = object3;
                                this.f = ks1_12;
                                this.g = n7;
                                this.a = n3;
                                object = ks1_12.d(this, null);
                                if (object == j90_02) {
                                    return j90_02;
                                }
                            }
                            try {
                                object = ((Jk2$a)object3).b;
                                object = ((Jk2)object).l;
                                object3 = ((AR1)object).a((Rv1)((Object)object2));
                                Ov1$c ov1$c = Ov1$c.b;
                                bl2 = Intrinsics.areEqual(object3, ov1$c);
                                ov1$c = null;
                                if (!bl2) break block13;
                                object = new ez0_0[]{};
                                object2 = new os0_1((Object[])object);
                                ks1_12.b(null);
                                break block14;
                            }
                            catch (Throwable throwable2) {
                                break block15;
                            }
                        }
                        object3 = ((AR1)object).a((Rv1)((Object)object2));
                        bl2 = object3 instanceof Ov1$a;
                        if (bl2) break block16;
                        object3 = Ov1$c.c;
                        ((AR1)object).c((Rv1)((Object)object2), (Ov1)object3);
                    }
                    object = Unit.a;
                    ks1_12.b(null);
                    object = yk2_12.h.a((Rv1)((Object)object2));
                    if (n7 == 0) {
                        n3 = 0;
                    }
                    if (n3 < 0) break block17;
                    object2 = new et0_2((i23_0)object, n3);
                    object = new ck2_2((et0_2)object2, n7);
                    object2 = object;
                }
                this.b = null;
                this.c = null;
                this.f = null;
                this.a = n4;
                object = ms0_1.i(this, (es0_2)object2, fs0_22);
                if (object != j90_02) return Unit.a;
                return j90_02;
            }
            object = hj0_0.a(n3, "Drop count should be non-negative, but had ");
            object = object.toString();
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        ks1_12.b(null);
        throw throwable2;
    }
}

