/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mE1
 */
public final class me1_1
implements Function2 {
    public final /* synthetic */ e a;
    public final /* synthetic */ bf1_2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ me1_1(e e2, bf1_2 bf1_22, int n3) {
        this.a = e2;
        this.b = bf1_22;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        e e2 = this.a;
        Intrinsics.checkNotNullParameter(e2, "$navController");
        bf1_2 bf1_22 = this.b;
        Intrinsics.checkNotNullParameter(bf1_22, "$viewModel");
        int n3 = Me3.b(this.c | 1);
        re1_1.f(e2, bf1_22, (b30_0)object, n3);
        return Unit.a;
    }
}

