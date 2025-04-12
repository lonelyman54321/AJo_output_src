/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dM2
 */
public final class dm2_0
implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ LP1 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ dm2_0(boolean bl2, LP1 lP1, float f5, Function1 function1, int n3) {
        this.a = bl2;
        this.b = lP1;
        this.c = f5;
        this.d = function1;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        Function1 function1 = this.d;
        Intrinsics.checkNotNullParameter(function1, "$onValueChange");
        int n3 = Me3.b(this.e | 1);
        LP1 lP1 = this.b;
        float f5 = this.c;
        tm2_1.b(this.a, lP1, f5, function1, (b30_0)object3, n3);
        return Unit.a;
    }
}

