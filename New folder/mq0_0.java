/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from MQ0
 */
public final class mq0_0
implements Function2 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ int b;

    public /* synthetic */ mq0_0(dq0_0 dq0_02, int n3) {
        this.a = dq0_02;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$onSearchClicked");
        int n3 = Me3.b(this.b | 1);
        UQ0.e((dq0_0)object2, (b30_0)object, n3);
        return Unit.a;
    }
}

