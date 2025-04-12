/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QI3
 */
public final class qi3_0
implements eK$c {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ qi3_0(Executor executor, Function0 function0) {
        this.a = executor;
        this.b = function0;
    }

    public final Object a(eK$a eK$a) {
        Intrinsics.checkNotNullParameter(eK$a, "it");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        int n3 = 1;
        Runnable runnable2 = new U(atomicBoolean, n3);
        Object object = Cq0.INSTANCE;
        tk2_0 tk2_02 = eK$a.c;
        if (tk2_02 != null) {
            tk2_02.addListener(runnable2, (Executor)object);
        }
        object = this.b;
        runnable2 = new oh_1(atomicBoolean, 2, eK$a, object);
        this.a.execute(runnable2);
        return Unit.a;
    }
}

