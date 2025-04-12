/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class Fx1$g
extends qg3_2
implements Function2 {
    public StringBuilder a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ fw1_2 d;

    public Fx1$g(fw1_2 fw1_22, f80_0 f80_02) {
        this.d = fw1_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        fw1_2 fw1_22 = this.d;
        Fx1$g fx1$g = new Fx1$g(fw1_22, f80_02);
        fx1$g.c = object;
        return fx1$g;
    }

    public final Object invoke(Object object, Object object2) {
        object = (jb1_2)object;
        object2 = (f80_0)object2;
        object = (Fx1$g)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Fx1$g)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        int n3;
        Object object2;
        j90_0 j90_02;
        block23: {
            int n4;
            Object object3;
            Object object4;
            block22: {
                int n7;
                block24: {
                    int n8;
                    block21: {
                        k70_0 k70_02;
                        j90_02 = j90_0.COROUTINE_SUSPENDED;
                        int n10 = this.b;
                        object4 = "toString(...)";
                        switch (n10) {
                            default: {
                                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw object;
                            }
                            case 7: {
                                void var2_5;
                                Throwable throwable = (Throwable)this.c;
                                vl2_2.b(object);
                                throw var2_5;
                            }
                            case 6: {
                                int n14;
                                void var2_5;
                                Throwable throwable = (Throwable)((Object)this.a);
                                object4 = (fa1_1)this.c;
                                vl2_2.b(object);
                                this.c = throwable;
                                this.a = null;
                                this.b = n14 = 7;
                                object = ((fa1_1)object4).b(this);
                                if (object == j90_02) {
                                    return j90_02;
                                }
                                Throwable throwable2 = throwable;
                                throw var2_5;
                            }
                            case 4: {
                                object2 = (fa1_1)this.c;
                                vl2_2.b(object);
                                break block23;
                            }
                            case 3: 
                            case 5: {
                                vl2_2.b(object);
                                return Unit.a;
                            }
                            case 2: {
                                object2 = (fa1_1)this.c;
                                vl2_2.b(object);
                                break block24;
                            }
                            case 1: {
                                object2 = this.a;
                                object3 = (fa1_1)this.c;
                                try {
                                    vl2_2.b(object);
                                    fa1_1 fa1_12 = object3;
                                    object3 = object2;
                                    object2 = fa1_12;
                                    break block21;
                                }
                                catch (Throwable throwable) {
                                    fa1_1 fa1_13 = object3;
                                    object3 = object2;
                                    object2 = fa1_13;
                                    break block22;
                                }
                            }
                            case 0: 
                        }
                        vl2_2.b(object);
                        object = (jb1_2)this.c;
                        object2 = this.d;
                        object3 = fw1_2.NONE;
                        if (object2 == object3 || (n10 = (int)((object2 = ((jb1_2)object).a().getAttributes()).f((xq_2)(object3 = fx1_1.b)) ? 1 : 0)) != 0) return Unit.a;
                        object2 = ((jb1_2)object).a().getAttributes();
                        object3 = fx1_1.a;
                        object2 = (fa1_1)object2.g((xq_2)object3);
                        object3 = new StringBuilder();
                        try {
                            k70_02 = oa1_0.b((ma1_0)object);
                        }
                        catch (Throwable throwable) {}
                        object = ((jb1_2)object).b();
                        this.c = object2;
                        this.a = object3;
                        int n15 = 1;
                        this.b = n15;
                        object = px1_1.c((StringBuilder)object3, k70_02, (uf_1)object, this);
                        if (object != j90_02) break block21;
                        return j90_02;
                    }
                    object = ((StringBuilder)object3).toString();
                    Intrinsics.checkNotNullExpressionValue(object, (String)object4);
                    object = ((Object)StringsKt.m0((CharSequence)object)).toString();
                    this.c = object2;
                    this.a = null;
                    this.b = n8 = 2;
                    object = ((fa1_1)object2).d((String)object, this);
                    if (object == j90_02) {
                        return j90_02;
                    }
                }
                this.c = null;
                this.b = n7 = 3;
                object = ((fa1_1)object2).b(this);
                if (object != j90_02) return Unit.a;
                return j90_02;
            }
            object = ((StringBuilder)object3).toString();
            Intrinsics.checkNotNullExpressionValue(object, (String)object4);
            object = ((Object)StringsKt.m0((CharSequence)object)).toString();
            this.c = object2;
            this.a = null;
            this.b = n4 = 4;
            object = ((fa1_1)object2).d((String)object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        this.c = null;
        this.b = n3 = 5;
        object = ((fa1_1)object2).b(this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

