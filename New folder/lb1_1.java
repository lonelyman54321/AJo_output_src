/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lb1
 */
public final class lb1_1 {
    public final ub1_2 a;
    public final by0_2 b;
    public final l41_0 c;
    public final wa1_1 d;
    public final Object e;
    public final CoroutineContext f;
    public final by0_2 g;

    public lb1_1(ub1_2 comparable, by0_2 by0_22, n72_0 n72_02, wa1_1 wa1_12, Object object, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(comparable, "statusCode");
        Intrinsics.checkNotNullParameter(by0_22, "requestTime");
        Intrinsics.checkNotNullParameter(n72_02, "headers");
        Intrinsics.checkNotNullParameter(wa1_12, "version");
        Intrinsics.checkNotNullParameter(object, "body");
        Intrinsics.checkNotNullParameter(coroutineContext, "callContext");
        this.a = comparable;
        this.b = by0_22;
        this.c = n72_02;
        this.d = wa1_12;
        this.e = object;
        this.f = coroutineContext;
        comparable = bi0_2.a(null);
        this.g = comparable;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HttpResponseData=(statusCode=");
        ub1_2 ub1_22 = this.a;
        stringBuilder.append(ub1_22);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

