/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Bt
 */
public final class bt_2
implements Function0 {
    public final /* synthetic */ yT1 a;
    public final /* synthetic */ i90_0 b;
    public final /* synthetic */ ob0_1 c;

    public /* synthetic */ bt_2(c80 c802, ob0_1 ob0_12, yT1 yT12) {
        this.a = yT12;
        this.b = c802;
        this.c = ob0_12;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$navController");
        i90_0 i90_02 = this.b;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        ob0_1 ob0_12 = this.c;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        ft_2 ft_22 = new Object();
        ((e)object).o("benefits", ft_22);
        object = new gu_2(ob0_12, null);
        Ae3.d(i90_02, null, null, (Function2)object, 3);
        return Unit.a;
    }
}

