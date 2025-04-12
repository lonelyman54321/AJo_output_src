/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Cw3
 */
public final class cw3_0
implements Function2 {
    public final /* synthetic */ hw3_0 a;

    public /* synthetic */ cw3_0(hw3_0 hw3_02) {
        this.a = hw3_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (String)object2;
        hw3_0 hw3_02 = this.a;
        Intrinsics.checkNotNullParameter(hw3_02, "this$0");
        Intrinsics.checkNotNullParameter(object, "email");
        Intrinsics.checkNotNullParameter(object2, "phoneNo");
        hy3_0 hy3_02 = hw3_02.m;
        if (hy3_02 != null) {
            hy3_02.t((String)object2, (String)object);
            object = Unit.a;
        } else {
            object = null;
        }
        return object;
    }
}

