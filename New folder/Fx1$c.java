/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class Fx1$c
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ gL2$a b;
    public /* synthetic */ jb1_2 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ tx1_2 e;
    public final /* synthetic */ List f;
    public final /* synthetic */ fw1_2 g;
    public final /* synthetic */ mv_2 h;

    public Fx1$c(boolean bl2, tx1_2 tx1_22, List list, fw1_2 fw1_22, mv_2 mv_22, f80_0 f80_02) {
        this.d = bl2;
        this.e = tx1_22;
        this.f = list;
        this.g = fw1_22;
        this.h = mv_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (gL2$a)object;
        object2 = (jb1_2)object2;
        Object object4 = object3;
        object4 = (f80_0)object3;
        fw1_2 fw1_22 = this.g;
        mv_2 mv_22 = this.h;
        boolean bl2 = this.d;
        tx1_2 tx1_22 = this.e;
        List list = this.f;
        object3 = new Fx1$c(bl2, tx1_22, list, fw1_22, mv_22, (f80_0)object4);
        ((Fx1$c)object3).b = object;
        ((Fx1$c)object3).c = object2;
        object = Unit.a;
        return ((Fx1$c)object3).invokeSuspend(object);
    }

    public final Object invokeSuspend(Object object) {
        block9: {
            Object object2;
            i90_0 i90_02;
            int n3;
            int n4;
            j90_0 j90_02;
            block10: {
                int n7;
                block6: {
                    block7: {
                        block8: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            n4 = this.a;
                            n3 = 2;
                            n7 = 1;
                            if (n4 == 0) break block6;
                            if (n4 == n7) break block7;
                            if (n4 != n3) break block8;
                            vl2_2.b(object);
                            break block9;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    i90_02 = this.c;
                    object2 = this.b;
                    vl2_2.b(object);
                    break block10;
                }
                vl2_2.b(object);
                object = this.b;
                i90_02 = this.c;
                boolean bl2 = this.d;
                if (!bl2) break block9;
                this.b = object;
                this.c = i90_02;
                this.a = n7;
                tx1_2 tx1_22 = this.e;
                List list = this.f;
                fw1_2 fw1_22 = this.g;
                mv_2 mv_22 = this.h;
                object2 = fx1_1.j(tx1_22, list, fw1_22, mv_22, (jb1_2)i90_02, this);
                if (object2 == j90_02) {
                    return j90_02;
                }
                Object object3 = object2;
                object2 = object;
                object = object3;
            }
            object = (jb1_2)object;
            n4 = (int)(Intrinsics.areEqual(object, i90_02) ? 1 : 0);
            if (n4 == 0) {
                n4 = 0;
                this.b = null;
                this.c = null;
                this.a = n3;
                i90_02 = ((gL2$a)object2).a;
                if ((object = ((is2_2)i90_02).d(this, object)) == j90_02) {
                    return j90_02;
                }
            }
        }
        return Unit.a;
    }
}

