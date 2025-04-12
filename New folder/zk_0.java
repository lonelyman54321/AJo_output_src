/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.i;

/*
 * Renamed from ZK
 */
public final class zk_0
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i c;
    public final /* synthetic */ Function2 d;

    public zk_0(i i3, Function2 function2, f80_0 f80_02) {
        this.c = i3;
        this.d = function2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        i i3 = this.c;
        Function2 function2 = this.d;
        zk_0 zk_02 = new zk_0(i3, function2, f80_02);
        zk_02.b = object;
        return zk_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (x53_0)object;
        object2 = (f80_0)object2;
        object = (zk_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((zk_0)object).invokeSuspend(object2);
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
            object = (x53_0)this.b;
            fx0_2 fx0_22 = new ZK$a((x53_0)object);
            i i3 = this.c;
            i3.G((Function1)fx0_22);
            this.a = n4;
            fx0_22 = this.d;
            object = fx0_22.invoke(object, this);
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

