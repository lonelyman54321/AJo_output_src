/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ga1
 */
public final class ga1_2
implements Function1 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ga1_2(Function1 function1, Function1 function12) {
        this.a = function1;
        this.b = function12;
    }

    public final Object invoke(Object object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Function1 function1 = this.a;
        if (function1 != null) {
            function1.invoke(object);
        }
        this.b.invoke(object);
        return Unit.a;
    }
}

