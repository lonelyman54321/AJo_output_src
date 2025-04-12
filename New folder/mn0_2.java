/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

/*
 * Renamed from Mn0
 */
public final class mn0_2
extends qg3_2
implements gx0_2 {
    public is2_2 a;
    public at3_0 b;
    public int c;
    public /* synthetic */ is2_2 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ da1_2 f;

    public mn0_2(da1_2 da1_22, f80_0 f80_02) {
        this.f = da1_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (is2_2)object;
        object2 = (kb1_2)object2;
        object3 = (f80_0)object3;
        da1_2 da1_22 = this.f;
        mn0_2 mn0_22 = new mn0_2(da1_22, (f80_0)object3);
        mn0_22.d = object;
        mn0_22.e = object2;
        object = Unit.a;
        return mn0_22.invokeSuspend(object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        block46: {
            block40: {
                block35: {
                    int n3;
                    Object object7;
                    Object object8;
                    block36: {
                        int n4;
                        block42: {
                            block30: {
                                Object object9;
                                block45: {
                                    block31: {
                                        int n7;
                                        block44: {
                                            block32: {
                                                Object object10;
                                                int n8;
                                                boolean bl2;
                                                Object object11;
                                                block43: {
                                                    block33: {
                                                        int n10;
                                                        int n14;
                                                        block34: {
                                                            block41: {
                                                                block37: {
                                                                    block38: {
                                                                        block39: {
                                                                            n4 = 0;
                                                                            object6 = null;
                                                                            object5 = j90_0.COROUTINE_SUSPENDED;
                                                                            n7 = this.c;
                                                                            object8 = "<this>";
                                                                            n14 = 0;
                                                                            object4 = null;
                                                                            switch (n7) {
                                                                                default: {
                                                                                    object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                    throw object;
                                                                                }
                                                                                case 10: {
                                                                                    object6 = (at3_0)this.e;
                                                                                    object5 = this.d;
                                                                                    vl2_2.b(object);
                                                                                    break block30;
                                                                                }
                                                                                case 9: {
                                                                                    object6 = (at3_0)this.e;
                                                                                    object5 = this.d;
                                                                                    vl2_2.b(object);
                                                                                    break block31;
                                                                                }
                                                                                case 8: {
                                                                                    object6 = (at3_0)this.e;
                                                                                    object5 = this.d;
                                                                                    vl2_2.b(object);
                                                                                    break block32;
                                                                                }
                                                                                case 7: {
                                                                                    object6 = (at3_0)this.e;
                                                                                    object5 = this.d;
                                                                                    vl2_2.b(object);
                                                                                    break block33;
                                                                                }
                                                                                case 6: {
                                                                                    object6 = (at3_0)this.e;
                                                                                    object3 = this.d;
                                                                                    vl2_2.b(object);
                                                                                    break block34;
                                                                                }
                                                                                case 5: {
                                                                                    object6 = (at3_0)this.e;
                                                                                    object5 = this.d;
                                                                                    vl2_2.b(object);
                                                                                    break block35;
                                                                                }
                                                                                case 4: {
                                                                                    object6 = this.b;
                                                                                    object3 = this.a;
                                                                                    object8 = (at3_0)this.e;
                                                                                    object2 = this.d;
                                                                                    vl2_2.b(object);
                                                                                    break block36;
                                                                                }
                                                                                case 3: {
                                                                                    object6 = (at3_0)this.e;
                                                                                    object5 = this.d;
                                                                                    vl2_2.b(object);
                                                                                    break block37;
                                                                                }
                                                                                case 2: {
                                                                                    object6 = this.b;
                                                                                    object3 = this.a;
                                                                                    object2 = (at3_0)this.e;
                                                                                    object7 = this.d;
                                                                                    vl2_2.b(object);
                                                                                    break block38;
                                                                                }
                                                                                case 1: {
                                                                                    object6 = (at3_0)this.e;
                                                                                    object5 = this.d;
                                                                                    vl2_2.b(object);
                                                                                    break;
                                                                                }
                                                                                case 0: {
                                                                                    vl2_2.b(object);
                                                                                    object = this.d;
                                                                                    object3 = (kb1_2)this.e;
                                                                                    object2 = ((kb1_2)object3).a;
                                                                                    object3 = ((kb1_2)object3).b;
                                                                                    boolean bl3 = object3 instanceof uf_1;
                                                                                    if (!bl3) {
                                                                                        return Unit.a;
                                                                                    }
                                                                                    object7 = ((ea1_2)((is2_2)object).a).d();
                                                                                    object9 = ((at3_0)object2).a;
                                                                                    object11 = Reflection.getOrCreateKotlinClass(Unit.class);
                                                                                    bl2 = Intrinsics.areEqual(object9, object11);
                                                                                    if (!bl2) break block39;
                                                                                    vf_1.a((uf_1)object3);
                                                                                    object3 = Unit.a;
                                                                                    object6 = new kb1_2((at3_0)object2, object3);
                                                                                    this.d = object;
                                                                                    this.e = object2;
                                                                                    this.c = n7 = 1;
                                                                                    object6 = ((is2_2)object).d(this, object6);
                                                                                    if (object6 == object5) {
                                                                                        return object5;
                                                                                    }
                                                                                    object5 = object;
                                                                                    object = object6;
                                                                                    object6 = object2;
                                                                                }
                                                                            }
                                                                            object4 = object;
                                                                            object4 = (kb1_2)object;
                                                                            break block40;
                                                                        }
                                                                        object11 = Reflection.getOrCreateKotlinClass(Integer.TYPE);
                                                                        bl2 = Intrinsics.areEqual(object9, object11);
                                                                        n8 = 2;
                                                                        if (!bl2) break block41;
                                                                        object3 = (uf_1)object3;
                                                                        this.d = object;
                                                                        this.e = object2;
                                                                        this.a = object;
                                                                        this.b = object2;
                                                                        this.c = n8;
                                                                        object6 = wf_1.k((uf_1)object3, this);
                                                                        if (object6 == object5) {
                                                                            return object5;
                                                                        }
                                                                        object3 = object;
                                                                        object7 = object;
                                                                        object = object6;
                                                                        object6 = object2;
                                                                    }
                                                                    object = (b93_0)object;
                                                                    Intrinsics.checkNotNullParameter(object, (String)object8);
                                                                    int n15 = Integer.parseInt(Py3.b((b93_0)object));
                                                                    object8 = new Integer(n15);
                                                                    object = new kb1_2((at3_0)object6, object8);
                                                                    this.d = object7;
                                                                    this.e = object2;
                                                                    this.a = null;
                                                                    this.b = null;
                                                                    this.c = n4 = 3;
                                                                    object = ((is2_2)object3).d(this, object);
                                                                    if (object == object5) {
                                                                        return object5;
                                                                    }
                                                                    object6 = object2;
                                                                    object5 = object7;
                                                                }
                                                                object4 = object;
                                                                object4 = (kb1_2)object;
                                                                break block40;
                                                            }
                                                            object11 = b93_0.class;
                                                            object10 = Reflection.getOrCreateKotlinClass((Class)object11);
                                                            boolean bl4 = Intrinsics.areEqual(object9, object10);
                                                            if (bl4 || (bl2 = Intrinsics.areEqual(object9, object11 = Reflection.getOrCreateKotlinClass((Class)object11)))) break block42;
                                                            object11 = Reflection.getOrCreateKotlinClass(byte[].class);
                                                            bl2 = Intrinsics.areEqual(object9, object11);
                                                            if (!bl2) break block43;
                                                            object3 = (uf_1)object3;
                                                            this.d = object;
                                                            this.e = object2;
                                                            this.c = n4 = 6;
                                                            object6 = wf_1.p((uf_1)object3, this);
                                                            if (object6 == object5) {
                                                                return object5;
                                                            }
                                                            object3 = object;
                                                            object = object6;
                                                            object6 = object2;
                                                        }
                                                        object = (byte[])object;
                                                        object8 = oa1_0.a(((ea1_2)((is2_2)object3).a).d());
                                                        object4 = ((ea1_2)((is2_2)object3).a).c().getMethod();
                                                        object2 = pa1_0.d;
                                                        n14 = Intrinsics.areEqual(object4, object2);
                                                        if (n14 == 0) {
                                                            long l2;
                                                            long l3;
                                                            n14 = ((Object)object).length;
                                                            long l4 = n14;
                                                            object7 = nn0_2.a;
                                                            if (object8 != null && (bl2 = (l3 = (l2 = ((Long)object8).longValue()) - l4) == 0L ? 0 : (l3 < 0L ? -1 : 1))) {
                                                                object = new StringBuilder("Content-Length mismatch: expected ");
                                                                ((StringBuilder)object).append(object8);
                                                                ((StringBuilder)object).append(" bytes, but received ");
                                                                ((StringBuilder)object).append(l4);
                                                                ((StringBuilder)object).append(" bytes");
                                                                object = ((StringBuilder)object).toString();
                                                                object = object.toString();
                                                                object6 = new IllegalStateException((String)object);
                                                                throw object6;
                                                            }
                                                        }
                                                        object8 = new kb1_2((at3_0)object6, object);
                                                        this.d = object3;
                                                        this.e = object6;
                                                        this.c = n10 = 7;
                                                        object = ((is2_2)object3).d(this, object8);
                                                        if (object == object5) {
                                                            return object5;
                                                        }
                                                        object5 = object3;
                                                    }
                                                    object4 = object;
                                                    object4 = (kb1_2)object;
                                                    break block40;
                                                }
                                                object11 = Reflection.getOrCreateKotlinClass(uf_1.class);
                                                bl2 = Intrinsics.areEqual(object9, object11);
                                                if (!bl2) break block44;
                                                object9 = object7.getCoroutineContext();
                                                object11 = i$a.a;
                                                object9 = (i)object9.get((CoroutineContext$a)object11);
                                                object11 = new xl1_2((i)object9);
                                                object9 = this.f.e;
                                                object10 = new mn0$a_0(object3, (jb1_2)object7, null);
                                                object3 = kf_1.e((i90_0)object, (CoroutineContext)object9, (Function2)object10, n8);
                                                object4 = new ln0_2(object11, 0);
                                                Intrinsics.checkNotNullParameter(object3, (String)object8);
                                                Intrinsics.checkNotNullParameter(object4, "block");
                                                object8 = new jf_1(object4, 0);
                                                ((rj3_2)object3).b.G((Function1)object8);
                                                object3 = ((rj3_2)object3).a;
                                                object6 = new kb1_2((at3_0)object2, object3);
                                                this.d = object;
                                                this.e = object2;
                                                this.c = n7 = 8;
                                                object6 = ((is2_2)object).d(this, object6);
                                                if (object6 == object5) {
                                                    return object5;
                                                }
                                                object5 = object;
                                                object = object6;
                                                object6 = object2;
                                            }
                                            object4 = object;
                                            object4 = (kb1_2)object;
                                            break block40;
                                        }
                                        object6 = Reflection.getOrCreateKotlinClass(ub1_2.class);
                                        n4 = (int)(Intrinsics.areEqual(object9, object6) ? 1 : 0);
                                        if (n4 == 0) break block45;
                                        vf_1.a((uf_1)object3);
                                        object3 = ((jb1_2)object7).e();
                                        object6 = new kb1_2((at3_0)object2, object3);
                                        this.d = object;
                                        this.e = object2;
                                        this.c = n7 = 9;
                                        object6 = ((is2_2)object).d(this, object6);
                                        if (object6 == object5) {
                                            return object5;
                                        }
                                        object5 = object;
                                        object = object6;
                                        object6 = object2;
                                    }
                                    object4 = object;
                                    object4 = (kb1_2)object;
                                    break block40;
                                }
                                object6 = Reflection.getOrCreateKotlinClass(vq1_1.class);
                                n4 = (int)(Intrinsics.areEqual(object9, object6) ? 1 : 0);
                                if (n4 == 0) break block46;
                                object6 = (ea1_2)((is2_2)object).a;
                                object8 = ((ea1_2)object6).d().getHeaders();
                                object7 = ja1_1.a;
                                object7 = "Content-Type";
                                if ((object8 = object8.get((String)object7)) == null) {
                                    object6 = "No content type provided for multipart".toString();
                                    object = new IllegalStateException((String)object6);
                                    throw object;
                                }
                                object7 = k70_0.e;
                                object7 = k70$b.a((String)object8);
                                boolean bl5 = ((k70_0)object7).b((k70_0)(object9 = k70$c.a));
                                if (!bl5) {
                                    object = new StringBuilder("Expected multipart/form-data, got ");
                                    ((StringBuilder)object).append(object7);
                                    object = ((StringBuilder)object).toString();
                                    object = object.toString();
                                    object6 = new IllegalStateException((String)object);
                                    throw object6;
                                }
                                object6 = ((ea1_2)object6).d().getHeaders();
                                object7 = "Content-Length";
                                if ((object6 = object6.get((String)object7)) != null) {
                                    long l7 = Long.parseLong((String)object6);
                                    object4 = new Long(l7);
                                }
                                object7 = object.getCoroutineContext();
                                object3 = (uf_1)object3;
                                object6 = new mg_1((CoroutineContext)object7, (uf_1)object3, (String)object8, (Long)object4);
                                object3 = new kb1_2((at3_0)object2, object6);
                                this.d = object;
                                this.e = object2;
                                this.c = n4 = 10;
                                object6 = ((is2_2)object).d(this, object3);
                                if (object6 == object5) {
                                    return object5;
                                }
                                object5 = object;
                                object = object6;
                                object6 = object2;
                            }
                            object4 = object;
                            object4 = (kb1_2)object;
                            break block40;
                        }
                        object3 = (uf_1)object3;
                        this.d = object;
                        this.e = object2;
                        this.a = object;
                        this.b = object2;
                        this.c = n4 = 4;
                        object6 = wf_1.k((uf_1)object3, this);
                        if (object6 == object5) {
                            return object5;
                        }
                        object3 = object;
                        object8 = object2;
                        object = object6;
                        object6 = object2;
                        object2 = object3;
                    }
                    object7 = new kb1_2((at3_0)object6, object);
                    this.d = object2;
                    this.e = object8;
                    this.a = null;
                    this.b = null;
                    this.c = n3 = 5;
                    object = ((is2_2)object3).d(this, object7);
                    if (object == object5) {
                        return object5;
                    }
                    object6 = object8;
                    object5 = object2;
                }
                object4 = object;
                object4 = (kb1_2)object;
            }
            object2 = object6;
            object = object5;
        }
        if (object4 != null) {
            object6 = nn0_2.a;
            object3 = "Transformed with default transformers response body for ";
            object5 = new StringBuilder((String)object3);
            object = ((ea1_2)((is2_2)object).a).c().getUrl();
            ((StringBuilder)object5).append(object);
            ((StringBuilder)object5).append(" to ");
            object = ((at3_0)object2).a;
            ((StringBuilder)object5).append(object);
            object = ((StringBuilder)object5).toString();
            object6.g((String)object);
        }
        return Unit.a;
    }
}

