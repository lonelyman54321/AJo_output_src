/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from I6
 */
public final class i6_0
implements Function2 {
    public final /* synthetic */ List a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ j7_0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ i6_0(ArrayList arrayList, t6_0 t6_02, j7_0 j7_02, int n3) {
        this.a = arrayList;
        this.b = t6_02;
        this.c = j7_02;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$categories");
        Function1 function1 = this.b;
        Intrinsics.checkNotNullParameter(function1, "$onItemClick");
        j7_0 j7_02 = this.c;
        Intrinsics.checkNotNullParameter(j7_02, "$viewModel");
        int n3 = Me3.b(this.d | 1);
        object2 = (ArrayList)object2;
        function1 = (t6_0)function1;
        Z6.b((ArrayList)object2, (t6_0)function1, j7_02, (b30_0)object, n3);
        return Unit.a;
    }
}

