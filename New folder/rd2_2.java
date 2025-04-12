/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rd2
 */
public final class rd2_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rd2_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                f f5 = (f)this.b;
                Intrinsics.checkNotNullParameter(f5, "$exoPlayer");
                f5.setPlayWhenReady(true);
                return Unit.a;
            }
            case 1: {
                qz1_2 qz1_22 = (qz1_2)this.b;
                Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
                Boolean bl2 = Boolean.TRUE;
                qz1_22.r.setValue(bl2);
                return Unit.a;
            }
            case 0: 
        }
        qz1_2 qz1_23 = (qz1_2)this.b;
        Intrinsics.checkNotNullParameter(qz1_23, "$viewModel");
        Boolean bl3 = Boolean.FALSE;
        qz1_23.n.setValue(bl3);
        return Unit.a;
    }
}

