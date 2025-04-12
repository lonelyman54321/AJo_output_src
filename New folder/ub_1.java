/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.ui.PlayerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uB
 */
public final class ub_1
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ub_1(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Intrinsics.checkNotNullParameter((Object)((PlayerView)((Object)object)), "playerView");
                return Unit.a;
            }
            case 0: 
        }
        object = (dt1_0)object;
        Intrinsics.checkNotNullParameter(object, "$this$LazyRow");
        u10 u102 = e10_0.a;
        bt1.b((dt1_0)object, 5, null, u102, 6);
        return Unit.a;
    }
}

