/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from N83
 */
public final class n83_0
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ CoroutineContext c;
    public final /* synthetic */ es0_2 d;

    public n83_0(CoroutineContext coroutineContext, es0_2 es0_22, f80_0 f80_02) {
        this.c = coroutineContext;
        this.d = es0_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        CoroutineContext coroutineContext = this.c;
        es0_2 es0_22 = this.d;
        n83_0 n83_02 = new n83_0(coroutineContext, es0_22, f80_02);
        n83_02.b = object;
        return n83_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Mz2)object;
        object2 = (f80_0)object2;
        object = (n83_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((n83_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 2;
        int n7 = 1;
        if (n3 != 0) {
            if (n3 != n7 && n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = (Mz2)this.b;
            Object object2 = f.a;
            CoroutineContext coroutineContext = this.c;
            n3 = (int)(Intrinsics.areEqual(coroutineContext, object2) ? 1 : 0);
            es0_2 es0_22 = this.d;
            if (n3 != 0) {
                object2 = new N83$a((Mz2)object);
                this.a = n7;
                object = es0_22.collect((fs0_2)object2, this);
                if (object == j90_02) {
                    return j90_02;
                }
            } else {
                n7 = 0;
                object2 = new N83$b(es0_22, (Mz2)object, null);
                this.a = n4;
                object = Ae3.g(this, coroutineContext, (Function2)object2);
                if (object == j90_02) {
                    return j90_02;
                }
            }
        }
        return Unit.a;
    }
}

