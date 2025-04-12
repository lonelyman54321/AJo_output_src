/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from a63
 */
public final class a63_0
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ X53 c;

    public a63_0(X53 x53, f80_0 f80_02) {
        this.c = x53;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        X53 x53 = this.c;
        a63_0 a63_02 = new a63_0(x53, f80_02);
        a63_02.b = object;
        return a63_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (X53$a)object;
        object2 = (f80_0)object2;
        object = (a63_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((a63_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        X53 x53;
        int n3;
        int n4;
        j90_0 j90_02;
        block9: {
            block14: {
                block12: {
                    block10: {
                        boolean bl2;
                        gb3_0 gb3_02;
                        block13: {
                            block11: {
                                j90_02 = j90_0.COROUTINE_SUSPENDED;
                                n4 = this.a;
                                n3 = 2;
                                int n7 = 1;
                                if (n4 != 0) {
                                    if (n4 != n7 && n4 != n3) {
                                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        throw object;
                                    }
                                    vl2_2.b(object);
                                    return Unit.a;
                                }
                                vl2_2.b(object);
                                object = (X53$a)this.b;
                                n4 = object instanceof X53$a$a;
                                x53 = this.c;
                                if (n4 == 0) break block9;
                                object = (X53$a$a)object;
                                this.a = n7;
                                gb3_02 = (gb3_0)x53.h.getValue();
                                n3 = gb3_02 instanceof Yh0;
                                if (n3 != 0) break block10;
                                n3 = gb3_02 instanceof AE2;
                                if (n3 == 0) break block11;
                                object = ((X53$a$a)object).a;
                                if (gb3_02 != object) break block10;
                                object = x53.f(this);
                                if (object != j90_02) {
                                    object = Unit.a;
                                }
                                break block12;
                            }
                            object = Iv3.a;
                            bl2 = Intrinsics.areEqual(gb3_02, object);
                            if (!bl2) break block13;
                            object = x53.f(this);
                            if (object != j90_02) {
                                object = Unit.a;
                            }
                            break block12;
                        }
                        bl2 = gb3_02 instanceof ln0_0;
                        if (bl2) break block14;
                    }
                    object = Unit.a;
                }
                if (object != j90_02) return Unit.a;
                return j90_02;
            }
            String string2 = "Can't read in final state.".toString();
            object = new IllegalStateException(string2);
            throw object;
        }
        n4 = object instanceof X53$a$b;
        if (n4 == 0) return Unit.a;
        object = (X53$a$b)object;
        this.a = n3;
        if ((object = X53.b(x53, (X53$a$b)object, this)) != j90_02) return Unit.a;
        return j90_02;
    }
}

