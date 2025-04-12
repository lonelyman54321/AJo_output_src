/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.material.AnchoredDragFinishedSignal;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

public final class Fe$a$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ i90_0 d;

    public Fe$a$a(Function2 function2, Object object, i90_0 i90_02, f80_0 f80_02) {
        this.b = function2;
        this.c = object;
        this.d = i90_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Object object2 = this.c;
        i90_0 i90_02 = this.d;
        Function2 function2 = this.b;
        object = new Fe$a$a(function2, object2, i90_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Fe$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Fe$a$a)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
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
            this.a = n4;
            object = this.b;
            Object object2 = this.c;
            object = object.invoke(object2, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = new AnchoredDragFinishedSignal();
        kotlinx.coroutines.d.b(this.d, (CancellationException)object);
        return Unit.a;
    }
}

