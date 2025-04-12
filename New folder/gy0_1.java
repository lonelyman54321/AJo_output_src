/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.customviews.widgets.PEProgressView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Gy0
 */
public final class gy0_1
implements Function1 {
    public final /* synthetic */ hy0_2 a;

    public /* synthetic */ gy0_1(hy0_2 hy0_22) {
        this.a = hy0_22;
    }

    public final Object invoke(Object object) {
        object = (Boolean)object;
        boolean bl2 = (Boolean)object;
        hy0_2 hy0_22 = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(hy0_22, string2);
        if (bl2) {
            object = hy0_22.a;
            if (object != null) {
                ((PEProgressView)((Object)object)).show();
            }
        } else {
            object = hy0_22.a;
            if (object != null) {
                ((PEProgressView)((Object)object)).dismiss();
            }
        }
        return Unit.a;
    }
}

