/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.gestures.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Me
 */
public final class me_0
extends qg3_2
implements gx0_2 {
    public int a;
    public final /* synthetic */ Ne b;
    public final /* synthetic */ Function2 c;

    public me_0(Ne ne, g g3, f80_0 f80_02) {
        this.b = ne;
        this.c = g3;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (be_0)object;
        object2 = (Xs0)object2;
        object3 = (f80_0)object3;
        object2 = (g)this.c;
        Ne ne = this.b;
        object = new me_0(ne, (g)object2, (f80_0)object3);
        object2 = Unit.a;
        return ((me_0)object).invokeSuspend(object2);
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
            object = this.b.a;
            this.a = n4;
            Function2 function2 = this.c;
            object = function2.invoke(object, this);
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

