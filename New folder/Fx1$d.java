/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class Fx1$d
extends qg3_2
implements gx0_2 {
    public StringBuilder a;
    public int b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ fw1_2 f;
    public final /* synthetic */ List g;

    public Fx1$d(boolean bl2, fw1_2 fw1_22, List list, f80_0 f80_02) {
        this.e = bl2;
        this.f = fw1_22;
        this.g = list;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (lL2$a)object;
        object2 = (jb1_2)object2;
        object3 = (f80_0)object3;
        List list = this.g;
        boolean bl2 = this.e;
        fw1_2 fw1_22 = this.f;
        Fx1$d fx1$d = new Fx1$d(bl2, fw1_22, list, (f80_0)object3);
        fx1$d.c = object;
        fx1$d.d = object2;
        object = Unit.a;
        return fx1$d.invokeSuspend(object);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        block19: {
            Object object3;
            Object object4;
            fw1_2 fw1_22;
            int n3;
            int n4;
            String string2;
            int n7;
            block17: {
                Throwable throwable222222;
                Object object5;
                int n8;
                block20: {
                    block16: {
                        block18: {
                            object2 = j90_0.COROUTINE_SUSPENDED;
                            n7 = this.b;
                            string2 = "toString(...)";
                            n4 = 3;
                            n8 = 2;
                            n3 = 1;
                            fw1_22 = this.f;
                            if (n7 == 0) break block18;
                            if (n7 != n3) {
                                if (n7 == n8) {
                                    vl2_2.b(object);
                                    return Unit.a;
                                }
                                if (n7 != n4) {
                                    object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    throw object;
                                }
                                object2 = (Throwable)this.c;
                                vl2_2.b(object);
                                break block19;
                            } else {
                                object4 = this.a;
                                object3 = (fa1_1)this.d;
                                object5 = (jb1_2)this.c;
                                vl2_2.b(object);
                                break block16;
                            }
                        }
                        vl2_2.b(object);
                        object = (lL2$a)this.c;
                        object5 = object4 = this.d;
                        object5 = (jb1_2)object4;
                        n7 = (int)(this.e ? 1 : 0);
                        if (n7 != 0) {
                            return Unit.a;
                        }
                        object4 = fw1_2.NONE;
                        if (fw1_22 == object4) return Unit.a;
                        object4 = ((jb1_2)object5).a().getAttributes();
                        n7 = (int)(object4.f((xq_2)(object3 = fx1_1.b)) ? 1 : 0);
                        if (n7 != 0) {
                            return Unit.a;
                        }
                        object4 = ((jb1_2)object5).a().getAttributes();
                        object3 = fx1_1.a;
                        object3 = object4 = object4.g((xq_2)object3);
                        object3 = (fa1_1)object4;
                        object4 = new StringBuilder();
                        try {
                            i90_0 i90_02 = ((jb1_2)object5).a();
                            i90_02 = i90_02.d();
                            List list = this.g;
                            px1_1.d((StringBuilder)object4, (jb1_2)i90_02, fw1_22, list);
                            this.c = object5;
                            this.d = object3;
                            this.a = object4;
                            this.b = n3;
                            object = ((lL2$a)object).a;
                            object = ((is2_2)object).c(this);
                            if (object != object2) break block16;
                            return object2;
                        }
                        catch (Throwable throwable222222) {}
                    }
                    object = (jb1_2)object;
                    object = ((StringBuilder)object4).toString();
                    break block20;
                    Intrinsics.checkNotNullExpressionValue(object, string2);
                    ((fa1_1)object3).f((String)object);
                    boolean bl2 = fw1_22.getBody();
                    if (bl2) return Unit.a;
                    this.c = null;
                    this.d = null;
                    this.a = null;
                    this.b = n8;
                    object = ((fa1_1)object3).b(this);
                    if (object != object2) return Unit.a;
                    return object2;
                }
                n8 = 0;
                object5 = ((jb1_2)object5).a();
                object5 = ((ea1_2)object5).c();
                fx1_1.i(fw1_22, (StringBuilder)object4, (bb1_2)object5, throwable222222);
                try {
                    throw throwable222222;
                }
                catch (Throwable throwable3) {
                    break block17;
                }
                catch (Throwable throwable4) {
                    n3 = 0;
                }
            }
            object4 = ((StringBuilder)object4).toString();
            Intrinsics.checkNotNullExpressionValue(object4, string2);
            ((fa1_1)object3).f((String)object4);
            if (n3 == 0) {
                n7 = (int)(fw1_22.getBody() ? 1 : 0);
                if (n7 != 0) throw object;
            }
            this.c = object;
            this.d = null;
            this.a = null;
            this.b = n4;
            object4 = ((fa1_1)object3).b(this);
            if (object4 == object2) {
                return object2;
            }
            object2 = object;
        }
        object = object2;
        throw object;
    }
}

