/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class R02
implements Predicate {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ R02(I8 i8) {
        this.a = i8;
    }

    public final boolean test(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        return (Boolean)function1.invoke(object);
    }
}

