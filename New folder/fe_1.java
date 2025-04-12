/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Fe
 */
public final class fe_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function2 d;

    public fe_1(Function0 function0, Function2 function2, f80_0 f80_02) {
        this.c = function0;
        this.d = function2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Function0 function0 = this.c;
        Function2 function2 = this.d;
        fe_1 fe_12 = new fe_1(function0, function2, f80_02);
        fe_12.b = object;
        return fe_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (fe_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((fe_1)object).invokeSuspend(object2);
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
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            br2_2 br2_22 = J83.k(this.c);
            Function2 function2 = this.d;
            Fe$a fe$a = new Fe$a(ref$ObjectRef, (i90_0)object, function2);
            this.a = n4;
            object = br2_22.collect(fe$a, this);
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

