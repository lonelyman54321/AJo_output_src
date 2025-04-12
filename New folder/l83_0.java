/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from L83
 */
public final class l83_0
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ tr1_0 d;

    public l83_0(Function2 function2, tr1_0 tr1_02, f80_0 f80_02) {
        this.c = function2;
        this.d = tr1_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Function2 function2 = this.c;
        tr1_0 tr1_02 = this.d;
        l83_0 l83_02 = new l83_0(function2, tr1_02, f80_02);
        l83_02.b = object;
        return l83_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (l83_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((l83_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            object = (i90_0)this.b;
            tr1_0 tr1_02 = this.d;
            object = object.getCoroutineContext();
            nz2_0 nz2_02 = new nz2_0(tr1_02, (CoroutineContext)object);
            this.a = n4;
            object = this.c.invoke(nz2_02, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

