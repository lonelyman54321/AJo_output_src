/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from GL2
 */
public final class gl2_1
implements Function0 {
    public final /* synthetic */ bb1_1 a;

    public /* synthetic */ gl2_1(bb1_1 bb1_12) {
        this.a = bb1_12;
    }

    public final Object invoke() {
        String string2 = "$progress$delegate";
        bb1_1 bb1_12 = this.a;
        Intrinsics.checkNotNullParameter(bb1_12, string2);
        float f5 = ml2_1.b(bb1_12);
        float f6 = 1.0f;
        float f7 = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (f7 == false) {
            f7 = 1.0f;
            f5 = Float.MIN_VALUE;
        } else {
            f7 = 0.0f;
            f5 = 0.0f;
            string2 = null;
        }
        return (boolean)f7;
    }
}

