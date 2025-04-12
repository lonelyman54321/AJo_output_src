/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Rb2
 */
public final class rb2_1
implements Function0 {
    public final /* synthetic */ yT1 a;

    public /* synthetic */ rb2_1(yT1 yT12) {
        this.a = yT12;
    }

    public final Object invoke() {
        yT1 yT12 = this.a;
        Intrinsics.checkNotNullParameter(yT12, "$navController");
        e.p(yT12, "finish_route", null, 6);
        return Unit.a;
    }
}

