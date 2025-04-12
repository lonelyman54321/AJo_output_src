/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from hi0
 */
public final class hi0_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ List c;

    public hi0_1(List list, f80_0 f80_02) {
        this.c = list;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        List list = this.c;
        hi0_1 hi0_12 = new hi0_1(list, f80_02);
        hi0_12.b = object;
        return hi0_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (xh1)object;
        object2 = (f80_0)object2;
        object = (hi0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((hi0_1)object).invokeSuspend(object2);
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
            object = (xh1)this.b;
            this.a = n4;
            List list = this.c;
            object = ki0$a.a(list, (xh1)object, this);
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

