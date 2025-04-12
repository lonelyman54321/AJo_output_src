/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.model.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Up2
 */
public final class up2_2
implements Function1 {
    public final /* synthetic */ xp2_2 a;

    public /* synthetic */ up2_2(xp2_2 xp2_22) {
        this.a = xp2_22;
    }

    public final Object invoke(Object object) {
        object = (BaseResponse)object;
        xp2_2 xp2_22 = this.a;
        Intrinsics.checkNotNullParameter(xp2_22, "this$0");
        Intrinsics.checkNotNull(object);
        xp2_22.Sa((BaseResponse)object);
        return Unit.a;
    }
}

