/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lv1
 */
public final class lv1_0
implements eK$c {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ lv1_0(VZ2 vZ2, String string2, Function0 function0) {
        this.a = vZ2;
        this.b = string2;
        this.c = function0;
    }

    public final Object a(eK$a eK$a) {
        Intrinsics.checkNotNullParameter(eK$a, "completer");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Runnable runnable2 = new nv1_1(atomicBoolean);
        Object object = Cq0.INSTANCE;
        tk2_0 tk2_02 = eK$a.c;
        if (tk2_02 != null) {
            tk2_02.addListener(runnable2, (Executor)object);
        }
        object = this.c;
        runnable2 = new ov1_1(atomicBoolean, 0, eK$a, object);
        this.a.execute(runnable2);
        return this.b;
    }
}

