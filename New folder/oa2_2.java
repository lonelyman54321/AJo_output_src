/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oA2
 */
public final class oa2_2
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ oa2_2(LP1 lP1, Function0 function0, int n3, int n4) {
        this.a = lP1;
        this.b = function0;
        this.c = n3;
        this.d = n4;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        LP1 lP1 = this.a;
        Intrinsics.checkNotNullParameter(lP1, "$modifier");
        Function0 function0 = this.b;
        Intrinsics.checkNotNullParameter(function0, "$onClick");
        int n3 = Me3.b(this.d | 1);
        int n4 = this.c;
        xA2.c(lP1, function0, n4, (b30_0)object, n3);
        return Unit.a;
    }
}

