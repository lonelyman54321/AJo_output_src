/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qa0
 */
public final class qa0_2
implements Function2 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ int b;

    public /* synthetic */ qa0_2(Function0 function0, int n3) {
        this.a = function0;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        Function0 function0 = this.a;
        Intrinsics.checkNotNullParameter(function0, "$onBackPressed");
        int n3 = Me3.b(this.b | 1);
        ta0_0.a(function0, (b30_0)object, n3);
        return Unit.a;
    }
}

