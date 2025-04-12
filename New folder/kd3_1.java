/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Kd3
 */
public final class kd3_1
implements Function0 {
    public final /* synthetic */ ld3_1 a;

    public /* synthetic */ kd3_1(ld3_1 ld3_12) {
        this.a = ld3_12;
    }

    public final Object invoke() {
        List list = ld3_1.Companion;
        ld3_1 ld3_12 = this.a;
        Intrinsics.checkNotNullParameter(ld3_12, "this$0");
        list = ld3_12.j;
        list = list != null ? ((Subcomponent)((Object)list)).getResources() : null;
        return list;
    }
}

