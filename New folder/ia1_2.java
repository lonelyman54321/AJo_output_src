/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ia1
 */
public final class ia1_2
implements Function1 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ia1_2(Function1 function1, ba1_1 ba1_12) {
        this.a = function1;
        this.b = ba1_12;
    }

    public final Object invoke(Object object) {
        object = (wa1_2)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        this.a.invoke(object);
        this.b.invoke(object);
        return Unit.a;
    }
}

