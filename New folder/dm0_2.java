/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from DM0
 */
public final class dm0_2
implements Function2 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ dm0_2(Function0 function0, Function0 function02, int n3) {
        this.a = function0;
        this.b = function02;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        Function0 function0 = this.a;
        Intrinsics.checkNotNullParameter(function0, "$onReset");
        Function0 function02 = this.b;
        Intrinsics.checkNotNullParameter(function02, "$onApplyFilter");
        int n3 = Me3.b(this.c | 1);
        tm0_1.a(function0, function02, (b30_0)object, n3);
        return Unit.a;
    }
}

