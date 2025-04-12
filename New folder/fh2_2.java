/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Fh2
 */
public final class fh2_2
implements Function1 {
    public final /* synthetic */ ih2_1 a;

    public /* synthetic */ fh2_2(ih2_1 ih2_12) {
        this.a = ih2_12;
    }

    public final Object invoke(Object object) {
        object = (Integer)object;
        int n3 = (Integer)object;
        String string2 = "this$0";
        ih2_1 ih2_12 = this.a;
        Intrinsics.checkNotNullParameter(ih2_12, string2);
        if (n3 != 0) {
            int n4 = 1;
            if (n3 == n4) {
                ih2_12.z();
            }
        } else {
            ih2_12.A();
        }
        return Unit.a;
    }
}

