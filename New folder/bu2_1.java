/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.gestures.i;
import androidx.compose.foundation.gestures.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from bU2
 */
public final class bu2_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ long b;
    public final /* synthetic */ l c;

    public bu2_1(l l2, f80_0 f80_02) {
        this.c = l2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        long l2;
        l l3 = this.c;
        bu2_1 bu2_12 = new bu2_1(l3, f80_02);
        bu2_12.b = l2 = ((e72)object).a;
        return bu2_12;
    }

    public final Object invoke(Object object, Object object2) {
        long l2 = ((e72)object).a;
        object2 = (f80_0)object2;
        l l3 = this.c;
        object = new bu2_1(l3, (f80_0)object2);
        ((bu2_1)object).b = l2;
        object2 = Unit.a;
        return ((bu2_1)object).invokeSuspend(object2);
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
            long l2 = this.b;
            object = this.c.C;
            this.a = n4;
            object = i.a((ku2_0)object, l2, this);
            if (object != j90_02) return object;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return object;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

