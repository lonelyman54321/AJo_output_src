/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from H6
 */
public final class h6_0
implements Function1 {
    public final /* synthetic */ List a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ j7_0 c;

    public /* synthetic */ h6_0(ArrayList arrayList, t6_0 t6_02, j7_0 j7_02) {
        this.a = arrayList;
        this.b = t6_02;
        this.c = j7_02;
    }

    public final Object invoke(Object object) {
        object = (jr1_0)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$categories");
        fx0_2 fx0_22 = this.b;
        Intrinsics.checkNotNullParameter(fx0_22, "$onItemClick");
        j7_0 j7_02 = this.c;
        Intrinsics.checkNotNullParameter(j7_02, "$viewModel");
        String string2 = "$this$LazyVerticalGrid";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object2.size();
        object2 = (ArrayList)object2;
        fx0_22 = (t6_0)fx0_22;
        a7_0 a7_02 = new a7_0((ArrayList)object2, (t6_0)fx0_22, j7_02);
        int n4 = -1152683804;
        int n7 = 1;
        object2 = new u10(n4, a7_02, n7 != 0);
        Uo0.f((jr1_0)object, n3, (u10)object2);
        object2 = cp_1.Companion;
        boolean bl2 = km_1.b((cp$a)object2);
        if (!bl2) {
            object2 = new Object();
            fx0_22 = w10_0.c;
            n7 = 5;
            Uo0.e((jr1_0)object, (j6_0)object2, (u10)fx0_22, n7);
        }
        return Unit.a;
    }
}

