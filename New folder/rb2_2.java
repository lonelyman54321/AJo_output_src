/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rb2
 */
public final class rb2_2
implements Function0 {
    public final /* synthetic */ tr1_0 a;
    public final /* synthetic */ tr1_0 b;

    public /* synthetic */ rb2_2(tr1_0 tr1_02, tr1_0 tr1_03) {
        this.a = tr1_02;
        this.b = tr1_03;
    }

    public final Object invoke() {
        tr1_0 tr1_02 = this.a;
        Intrinsics.checkNotNullParameter(tr1_02, "$isExpanded$delegate");
        tr1_0 tr1_03 = this.b;
        Intrinsics.checkNotNullParameter(tr1_03, "$isInteracted$delegate");
        Boolean bl2 = vb2.g(tr1_02) ^ true;
        tr1_02.setValue(bl2);
        bl2 = Boolean.TRUE;
        tr1_03.setValue(bl2);
        return Unit.a;
    }
}

