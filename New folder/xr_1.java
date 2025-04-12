/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from xR
 */
public final class xr_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ yr_0 d;

    public xr_1(Function2 function2, yr_0 yr_02, f80_0 f80_02) {
        this.c = function2;
        this.d = yr_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Function2 function2 = this.c;
        yr_0 yr_02 = this.d;
        xr_1 xr_12 = new xr_1(function2, yr_02, f80_02);
        xr_12.b = object;
        return xr_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (bt2_2)object;
        object2 = (f80_0)object2;
        object = (xr_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((xr_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = (bt2_2)this.b;
            AtomicReference<Object> atomicReference = new AtomicReference<Object>(null);
            yr_0 yr_02 = this.d;
            xR$a xR$a = new xR$a((bt2_2)object, atomicReference, yr_02);
            this.a = n4;
            object = this.c.invoke(xR$a, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = new KotlinNothingValueException();
        throw object;
    }
}

