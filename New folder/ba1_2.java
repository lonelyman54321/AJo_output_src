/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from ba1
 */
public final class ba1_2
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ is2_2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ da1_2 d;

    public ba1_2(da1_2 da1_22, f80_0 f80_02) {
        this.d = da1_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (is2_2)object;
        object3 = (f80_0)object3;
        da1_2 da1_22 = this.d;
        ba1_2 ba1_22 = new ba1_2(da1_22, (f80_0)object3);
        ba1_22.b = object;
        ba1_22.c = object2;
        object = Unit.a;
        return ba1_22.invokeSuspend(object);
    }

    public final Object invokeSuspend(Object object) {
        Object object2;
        Object object3;
        block9: {
            block7: {
                Object object4;
                Object object5;
                Object object6;
                int n3;
                block8: {
                    int n4;
                    block4: {
                        block5: {
                            block6: {
                                object3 = j90_0.COROUTINE_SUSPENDED;
                                int n7 = this.a;
                                n3 = 2;
                                n4 = 1;
                                if (n7 == 0) break block4;
                                if (n7 == n4) break block5;
                                if (n7 != n3) break block6;
                                vl2_2.b(object);
                                break block7;
                            }
                            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw object;
                        }
                        object2 = this.c;
                        object6 = this.b;
                        vl2_2.b(object);
                        break block8;
                    }
                    vl2_2.b(object);
                    object = this.b;
                    object2 = this.c;
                    boolean bl2 = object2 instanceof ea1_2;
                    if (!bl2) break block9;
                    object5 = this.d.i;
                    object4 = Unit.a;
                    Object object7 = object2;
                    object7 = ((ea1_2)object2).d();
                    this.b = object;
                    this.c = object2;
                    this.a = n4;
                    object6 = ((hs2_2)object5).a(object4, object7, this);
                    if (object6 == object3) {
                        return object3;
                    }
                    Object object8 = object6;
                    object6 = object;
                    object = object8;
                }
                object = (jb1_2)object;
                object5 = object2;
                object5 = (ea1_2)object2;
                object5.getClass();
                Intrinsics.checkNotNullParameter(object, "response");
                object4 = "<set-?>";
                Intrinsics.checkNotNullParameter(object, (String)object4);
                ((ea1_2)object5).c = object;
                this.b = null;
                this.c = null;
                this.a = n3;
                object = ((is2_2)object6).d(this, object2);
                if (object == object3) {
                    return object3;
                }
            }
            return Unit.a;
        }
        object = new StringBuilder("Error: HttpClientCall expected, but found ");
        ((StringBuilder)object).append(object2);
        ((StringBuilder)object).append('(');
        object3 = Reflection.getOrCreateKotlinClass(object2.getClass());
        ((StringBuilder)object).append(object3);
        ((StringBuilder)object).append(").");
        object = ((StringBuilder)object).toString();
        object = object.toString();
        object3 = new IllegalStateException((String)object);
        throw object3;
    }
}

