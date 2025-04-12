/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from FB
 */
public final class fb_1
implements Function0 {
    public final /* synthetic */ yT1 a;

    public /* synthetic */ fb_1(yT1 yT12) {
        this.a = yT12;
    }

    public final Object invoke() {
        yT1 yT12 = this.a;
        Intrinsics.checkNotNullParameter(yT12, "$fleekAppNavigationController");
        yT12.getClass();
        String string2 = "home";
        Intrinsics.checkNotNullParameter(string2, "route");
        boolean bl2 = yT12.s(string2, false, false);
        if (bl2) {
            bl2 = yT12.b();
        }
        return Unit.a;
    }
}

