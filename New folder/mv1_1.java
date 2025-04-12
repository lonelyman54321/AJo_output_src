/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

/*
 * Renamed from mv1
 */
public final class mv1_1
implements eK$c {
    public final /* synthetic */ CoroutineContext a;
    public final /* synthetic */ l90_0 b;
    public final /* synthetic */ Function2 c;

    public /* synthetic */ mv1_1(CoroutineContext coroutineContext, l90_0 l90_02, Function2 function2) {
        this.a = coroutineContext;
        this.b = l90_02;
        this.c = function2;
    }

    public final Object a(eK$a eK$a) {
        Intrinsics.checkNotNullParameter(eK$a, "completer");
        Object object = i$a.a;
        Object object2 = this.a;
        object = (i)object2.get((CoroutineContext$a)object);
        Object object3 = new pv1_0((i)object);
        object = Cq0.INSTANCE;
        tk2_0 tk2_02 = eK$a.c;
        if (tk2_02 != null) {
            tk2_02.addListener((Runnable)object3, (Executor)object);
        }
        object = d.a((CoroutineContext)object2);
        object3 = this.c;
        object2 = new qv1_1((Function2)object3, eK$a, null);
        object3 = this.b;
        return Ae3.d((i90_0)object, null, (l90_0)((Object)object3), (Function2)object2, 1);
    }
}

