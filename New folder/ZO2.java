/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class ZO2
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ Boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ ZO2(LP1 lP1, Boolean bl2, bP2$m bP2$m, int n3) {
        this.a = lP1;
        this.b = bl2;
        this.c = bP2$m;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$modifier");
        Function0 function0 = this.c;
        Intrinsics.checkNotNullParameter(function0, "$onClick");
        int n3 = Me3.b(this.d | 1);
        Boolean bl2 = this.b;
        function0 = (bP2$m)function0;
        bp2_0.a((LP1)object2, bl2, (bP2$m)function0, (b30_0)object, n3);
        return Unit.a;
    }
}

