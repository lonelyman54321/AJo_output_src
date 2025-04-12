/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.e;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lE1
 */
public final class le1_1
implements Function1 {
    public final /* synthetic */ bf1_2 a;
    public final /* synthetic */ e b;

    public /* synthetic */ le1_1(bf1_2 bf1_22, e e2) {
        this.a = bf1_22;
        this.b = e2;
    }

    public final Object invoke(Object object) {
        object = (dt1_0)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$viewModel");
        e e2 = this.b;
        Intrinsics.checkNotNullParameter(e2, "$navController");
        Intrinsics.checkNotNullParameter(object, "$this$LazyColumn");
        int n3 = ((List)re1_1.a.getValue()).size();
        rE1$b rE1$b = new rE1$b((bf1_2)object2, e2);
        object2 = new u10(1492805804, rE1$b, true);
        bt1.b((dt1_0)object, n3, null, (u10)object2, 6);
        return Unit.a;
    }
}

