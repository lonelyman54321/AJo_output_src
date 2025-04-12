/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.i;

/*
 * Renamed from rN
 */
public final class rn_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ qn_2 b;
    public final /* synthetic */ Ref$ObjectRef c;

    public rn_2(qn_2 qn_22, Ref$ObjectRef ref$ObjectRef, f80_0 f80_02) {
        this.b = qn_22;
        this.c = ref$ObjectRef;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        qn_2 qn_22 = this.b;
        Ref$ObjectRef ref$ObjectRef = this.c;
        object = new rn_2(qn_22, ref$ObjectRef, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (rn_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((rn_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        qn_2 qn_22;
        Object object2;
        block7: {
            int n3;
            j90_0 j90_02;
            block8: {
                int n4;
                block4: {
                    block5: {
                        block6: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.a;
                            object2 = null;
                            n3 = 2;
                            n4 = 1;
                            qn_22 = this.b;
                            if (n7 == 0) break block4;
                            if (n7 == n4) break block5;
                            if (n7 != n3) break block6;
                            vl2_2.b(object);
                            break block7;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    vl2_2.b(object);
                    break block8;
                }
                vl2_2.b(object);
                object = qn_2.Companion;
                object = qn_22.Ra();
                List list = (List)this.c.element;
                this.a = n4;
                object.getClass();
                aW aW2 = md3_0.c((jD3)object);
                d4_0 d4_02 = new d4_0(list, (g4_0)object, null);
                int n8 = 3;
                object = Ae3.d(aW2, null, null, d4_02, n8);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object = (i)object;
            this.a = n3;
            object = object.I0(this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = qn_22.f;
        if (object == null) {
            object = "activityFragmentListener";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        object2.stopLoader();
        qn_22.Ta();
        return Unit.a;
    }
}

