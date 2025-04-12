/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from FL2
 */
public final class fl2_1
implements Function0 {
    public final /* synthetic */ bb1_1 a;

    public /* synthetic */ fl2_1(bb1_1 bb1_12) {
        this.a = bb1_12;
    }

    public final Object invoke() {
        bb1_1 bb1_12 = this.a;
        Intrinsics.checkNotNullParameter(bb1_12, "$progress$delegate");
        return Float.valueOf(ml2_1.b(bb1_12));
    }
}

