/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class pL2$b$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jb1_2 c;
    public final /* synthetic */ Function2 d;

    public pL2$b$a(jb1_2 jb1_22, Function2 function2, f80_0 f80_02) {
        this.c = jb1_22;
        this.d = function2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        jb1_2 jb1_22 = this.c;
        Function2 function2 = this.d;
        pL2$b$a pL2$b$a = new pL2$b$a(jb1_22, function2, f80_02);
        pL2$b$a.b = object;
        return pL2$b$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (pL2$b$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((pL2$b$a)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Throwable throwable3;
        Object object2;
        block15: {
            block14: {
                Throwable throwable22;
                Object object3;
                int n3;
                jb1_2 jb1_22;
                int n4;
                block17: {
                    block16: {
                        object2 = j90_0.COROUTINE_SUSPENDED;
                        n4 = this.a;
                        jb1_22 = this.c;
                        n3 = 2;
                        int n7 = 1;
                        if (n4 != 0) {
                            if (n4 != n7) {
                                if (n4 != n3) {
                                    object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    throw object;
                                }
                                try {
                                    vl2_2.b(object);
                                    break block14;
                                }
                                finally {
                                    break block15;
                                }
                            }
                            object3 = (i90_0)this.b;
                            try {
                                vl2_2.b(object);
                                break block16;
                            }
                            finally {
                                break block17;
                            }
                        }
                        vl2_2.b(object);
                        object = (i90_0)this.b;
                        object3 = this.d;
                        try {
                            // empty try
                        }
                        catch (Throwable throwable22) {}
                        this.b = object;
                        this.a = n7;
                        object = object3.invoke(jb1_22, this);
                        if (object != object2) break block16;
                        return object2;
                    }
                    object = Unit.a;
                    return tl2_2.b;
                }
                object3 = tl2_2.b;
                vl2_2.a(throwable22);
                object = jb1_22.b();
                n4 = (int)(object.i() ? 1 : 0);
                if (n4 != 0) return Unit.a;
                n4 = 0;
                object3 = null;
                try {
                    this.b = null;
                    this.a = n3;
                    long l2 = Long.MAX_VALUE;
                    object = wf_1.c((uf_1)object, l2, this);
                    if (object != object2) break block14;
                    return object2;
                }
                catch (Throwable throwable3) {}
            }
            object = (Number)object;
            long l3 = ((Number)object).longValue();
            object = new Long(l3);
            return tl2_2.b;
        }
        object2 = tl2_2.b;
        vl2_2.a(throwable3);
        return Unit.a;
    }
}

