/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from HL2
 */
public final class hl2_1
implements Function0 {
    public final /* synthetic */ bb1_1 a;

    public /* synthetic */ hl2_1(bb1_1 bb1_12) {
        this.a = bb1_12;
    }

    public final Object invoke() {
        boolean bl2;
        String string2 = "$progress$delegate";
        bb1_1 bb1_12 = this.a;
        Intrinsics.checkNotNullParameter(bb1_12, string2);
        float f5 = ml2_1.b(bb1_12);
        double d2 = f5;
        double d5 = 0.55;
        double d7 = d2 == d5 ? 0 : (d2 < d5 ? -1 : 1);
        if (d7 < 0) {
            bl2 = true;
            f5 = Float.MIN_VALUE;
        } else {
            bl2 = false;
            f5 = 0.0f;
            string2 = null;
        }
        return bl2;
    }
}

