/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nF
 */
public final class nf_2 {
    public static final uf_1 a(uf_1 uf_12, CoroutineContext coroutineContext, Long l2, qb2_2 qb2_22) {
        Intrinsics.checkNotNullParameter(uf_12, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "context");
        Intrinsics.checkNotNullParameter(qb2_22, "listener");
        e01_0 e01_02 = e01_0.a;
        nF$a nF$a = new nF$a(uf_12, qb2_22, l2, null);
        return kf_1.d((i90_0)e01_02, (CoroutineContext)coroutineContext, (Function2)nF$a).a;
    }
}

