/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Ek2
 */
public final class ek2_1
extends qg3_2
implements Function2 {
    public Object a;
    public Object b;
    public ks1_1 c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ yk2_1 f;

    public ek2_1(yk2_1 yk2_12, f80_0 f80_02) {
        this.f = yk2_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yk2_1 yk2_12 = this.f;
        ek2_1 ek2_12 = new ek2_1(yk2_12, f80_02);
        ek2_12.e = object;
        return ek2_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (x53_0)object;
        object2 = (f80_0)object2;
        object = (ek2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ek2_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2;
        block25: {
            block17: {
                Object object3;
                Object object4;
                yk2_1 yk2_12;
                block22: {
                    int n4;
                    block23: {
                        Object object5;
                        int n7;
                        block26: {
                            JI2 jI2;
                            block16: {
                                Object object6;
                                block24: {
                                    int n8;
                                    int n10;
                                    block18: {
                                        block19: {
                                            block20: {
                                                block21: {
                                                    object2 = j90_0.COROUTINE_SUSPENDED;
                                                    n10 = this.d;
                                                    n4 = 3;
                                                    n7 = 2;
                                                    n8 = 1;
                                                    yk2_12 = this.f;
                                                    if (n10 == 0) break block18;
                                                    if (n10 == n8) break block19;
                                                    if (n10 == n7) break block20;
                                                    if (n10 != n4) break block21;
                                                    object2 = (hs1_2)this.b;
                                                    object4 = (Jk2$a)this.a;
                                                    object3 = (x53_0)this.e;
                                                    vl2_2.b(object);
                                                    break block22;
                                                }
                                                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                throw object;
                                            }
                                            object4 = (x53_0)this.e;
                                            vl2_2.b(object);
                                            break block23;
                                        }
                                        object4 = this.c;
                                        object6 = (Jk2$a)this.b;
                                        jI2 = (JI2)this.a;
                                        object5 = (x53_0)this.e;
                                        vl2_2.b(object);
                                        break block24;
                                    }
                                    vl2_2.b(object);
                                    object5 = object = this.e;
                                    object5 = (x53_0)object;
                                    object = yk2_12.i;
                                    n10 = 0;
                                    object4 = null;
                                    boolean n3 = ((AtomicBoolean)object).compareAndSet(false, n8 != 0);
                                    if (!n3) break block25;
                                    object = new Ek2$a(yk2_12, (x53_0)object5, null);
                                    Ae3.d((i90_0)object5, null, null, (Function2)object, n4);
                                    int n14 = 6;
                                    object = sr_2.a(0, n14, null);
                                    object4 = new Ek2$b((le_2)object, null, yk2_12);
                                    Ae3.d((i90_0)object5, null, null, (Function2)object4, n4);
                                    object4 = new Ek2$c((le_2)object, null, yk2_12);
                                    Ae3.d((i90_0)object5, null, null, (Function2)object4, n4);
                                    jI2 = yk2_12.e;
                                    if (jI2 == null) break block26;
                                    object = yk2_12.f;
                                    if (object != null) break block16;
                                    object = yk2_12.k;
                                    object4 = ((Jk2$a)object).a;
                                    this.e = object5;
                                    this.a = jI2;
                                    this.b = object;
                                    this.c = object4;
                                    this.d = n8;
                                    object6 = ((ks1_1)object4).d(this, null);
                                    if (object6 == object2) {
                                        return object2;
                                    }
                                    object6 = object;
                                }
                                try {
                                    object = ((Jk2$a)object6).b;
                                    object = ((Jk2)object).a(null);
                                }
                                finally {
                                    object4.b(null);
                                }
                            }
                            jI2.a((cm2)object);
                        }
                        this.e = object5;
                        this.a = null;
                        this.b = null;
                        this.c = null;
                        this.d = n7;
                        object = yk2_12.f(this);
                        if (object == object2) {
                            return object2;
                        }
                        object4 = object5;
                    }
                    object = yk2_12.k;
                    ks1_1 ks1_12 = ((Jk2$a)object).a;
                    this.e = object4;
                    this.a = object;
                    this.b = ks1_12;
                    this.d = n4;
                    object3 = ks1_12.d(this, null);
                    if (object3 == object2) {
                        return object2;
                    }
                    object3 = object4;
                    object2 = ks1_12;
                    object4 = object;
                }
                object = ((Jk2$a)object4).b;
                object = ((Jk2)object).l;
                object4 = Rv1.REFRESH;
                object = ((AR1)object).a((Rv1)((Object)object4));
                boolean bl2 = object instanceof Ov1$a;
                if (bl2) break block17;
                yk2_1.d(yk2_12, (i90_0)object3);
            }
            return Unit.a;
            finally {
                object2.b(null);
            }
        }
        object2 = "Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

