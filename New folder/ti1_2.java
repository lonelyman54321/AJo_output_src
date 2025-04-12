/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ti1
 */
public final class ti1_2
implements Function1 {
    public final /* synthetic */ long a;
    public final /* synthetic */ wi1_2 b;

    public /* synthetic */ ti1_2(long l2, wi1_2 wi1_22) {
        this.a = l2;
        this.b = wi1_22;
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        wi1_2 wi1_22 = this.b;
        Intrinsics.checkNotNullParameter(wi1_22, "this$0");
        long l2 = System.currentTimeMillis();
        yn3$a yn3$a = yn3_0.a;
        yn3$a.l("InstallReferrerDeligate");
        yn3$a.e((Throwable)object);
        long l3 = this.a;
        float f5 = l2 - l3;
        object = new qu3(null, null, false, "timeout_exception", f5);
        wi1_22.a((qu3)object);
        return Unit.a;
    }
}

