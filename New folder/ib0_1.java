/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ib0
 */
public final class ib0_1
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ib0_1(String string2, Function0 function0, int n3) {
        this.a = string2;
        this.b = function0;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        String string2 = this.a;
        Intrinsics.checkNotNullParameter(string2, "$title");
        Function0 function0 = this.b;
        Intrinsics.checkNotNullParameter(function0, "$onClick");
        int n3 = Me3.b(this.c | 1);
        ob0_0.e(string2, function0, (b30_0)object, n3);
        return Unit.a;
    }
}

