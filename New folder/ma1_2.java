/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from MA1
 */
public final class ma1_2
implements Function1 {
    public final /* synthetic */ oa1_1 a;

    public /* synthetic */ ma1_2(oa1_1 oa1_12) {
        this.a = oa1_12;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        oa1_1 oa1_12 = this.a;
        Intrinsics.checkNotNullParameter(oa1_12, "this$0");
        wh_2 wh_22 = xh_1.a;
        if (wh_22 != null) {
            wh_22.j1();
        }
        oa1_12.j.k(object);
        return Unit.a;
    }
}

