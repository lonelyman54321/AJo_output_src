/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from n93
 */
public final class n93_0
implements Function2 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ tr1_0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ n93_0(Function0 function0, Function0 function02, tr1_0 tr1_02, int n3) {
        this.a = function0;
        this.b = function02;
        this.c = tr1_02;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        Function0 function0 = this.a;
        Intrinsics.checkNotNullParameter(function0, "$onSortClicked");
        Function0 function02 = this.b;
        Intrinsics.checkNotNullParameter(function02, "$onFilterClicked");
        tr1_0 tr1_02 = this.c;
        Intrinsics.checkNotNullParameter(tr1_02, "$filterApplied");
        int n3 = Me3.b(this.d | 1);
        r93_0.a(function0, function02, tr1_02, (b30_0)object, n3);
        return Unit.a;
    }
}

