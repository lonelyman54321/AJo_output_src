/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iE1
 */
public final class ie1_2
implements Function2 {
    public final /* synthetic */ e a;
    public final /* synthetic */ bf1_2 b;
    public final /* synthetic */ oa1_1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ ie1_2(e e2, bf1_2 bf1_22, oa1_1 oa1_12, int n3) {
        this.a = e2;
        this.b = bf1_22;
        this.c = oa1_12;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        e e2 = this.a;
        Intrinsics.checkNotNullParameter(e2, "$navController");
        bf1_2 bf1_22 = this.b;
        Intrinsics.checkNotNullParameter(bf1_22, "$viewModel");
        oa1_1 oa1_12 = this.c;
        Intrinsics.checkNotNullParameter(oa1_12, "$loginViewModel");
        int n3 = Me3.b(this.d | 1);
        re1_1.b(e2, bf1_22, oa1_12, (b30_0)object, n3);
        return Unit.a;
    }
}

