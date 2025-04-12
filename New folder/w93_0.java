/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from w93
 */
public final class w93_0
implements Function0 {
    public final /* synthetic */ u93_0 a;

    public /* synthetic */ w93_0(u93_0 u93_02) {
        this.a = u93_02;
    }

    public final Object invoke() {
        u93_0 u93_02 = this.a;
        Intrinsics.checkNotNullParameter(u93_02, "this$0");
        yh0_0 yh0_02 = u93_0.Pa(u93_02);
        Boolean bl2 = Boolean.FALSE;
        yh0_02.h.setValue(bl2);
        ((yh0_0)u93_02.h.getValue()).e();
        u93_02.dismiss();
        return Unit.a;
    }
}

