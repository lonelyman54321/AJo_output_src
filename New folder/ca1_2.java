/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ca1
 */
public final class ca1_2
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ is2_2 b;
    public final /* synthetic */ da1_2 c;

    public ca1_2(da1_2 da1_22, f80_0 f80_02) {
        this.c = da1_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (is2_2)object;
        object2 = (kb1_2)object2;
        object3 = (f80_0)object3;
        da1_2 da1_22 = this.c;
        object2 = new ca1_2(da1_22, (f80_0)object3);
        ((ca1_2)object2).b = object;
        object = Unit.a;
        return ((ca1_2)object2).invokeSuspend(object);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        Object object3;
        block8: {
            object3 = j90_0.COROUTINE_SUSPENDED;
            int n3 = this.a;
            int n4 = 1;
            if (n3 != 0) {
                if (n3 != n4) {
                    object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw object;
                }
                object3 = this.b;
                try {
                    vl2_2.b(object);
                }
                catch (Throwable throwable) {
                    break block8;
                }
            }
            vl2_2.b(object);
            object = this.b;
            try {
                this.b = object;
                this.a = n4;
                object2 = ((is2_2)object).c(this);
                if (object2 == object3) {
                    return object3;
                }
                object3 = object;
                object = object2;
            }
            catch (Throwable throwable) {
                object3 = object;
                object = throwable;
                break block8;
            }
            {
                object = (kb1_2)object;
                return Unit.a;
            }
        }
        object2 = this.c.k;
        eb0_2 eb0_22 = ch3_0.d;
        Intrinsics.checkNotNullParameter(((ea1_2)((is2_2)object3).a).d(), "response");
        Intrinsics.checkNotNullParameter(object, "cause");
        ob1_2 ob1_22 = new Object();
        ((rb0_2)object2).a(eb0_22, ob1_22);
        throw object;
    }
}

