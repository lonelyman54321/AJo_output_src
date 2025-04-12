/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aN0
 */
public final class an0_2
implements Function0 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ yT1 b;
    public final /* synthetic */ i90_0 c;

    public /* synthetic */ an0_2(c80 c802, ob0_1 ob0_12, yT1 yT12) {
        this.a = ob0_12;
        this.b = yT12;
        this.c = c802;
    }

    public final Object invoke() {
        ob0_1 ob0_12 = this.a;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        Object object = this.b;
        Intrinsics.checkNotNullParameter(object, "$navController");
        i90_0 i90_02 = this.c;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        ob0_12.w(true);
        ((e)object).q();
        object = new in0_2(ob0_12, null);
        Ae3.d(i90_02, null, null, (Function2)object, 3);
        return Unit.a;
    }
}

