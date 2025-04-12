/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hV2
 */
public final class hv2_0
implements Function1 {
    public final /* synthetic */ vv2_2 a;

    public /* synthetic */ hv2_0(vv2_2 vv2_22) {
        this.a = vv2_22;
    }

    public final Object invoke(Object object) {
        object = (om3_0)object;
        vv2_2 vv2_22 = this.a;
        Intrinsics.checkNotNullParameter(vv2_22, "this$0");
        Intrinsics.checkNotNullParameter(object, "textChangeEvent");
        vv2_22.U = object = ((Object)((om3_0)object).d()).toString();
        return object;
    }
}

