/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sd2
 */
public final class sd2_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sd2_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Function0 function0 = (Function0)this.b;
                Intrinsics.checkNotNullParameter(function0, "$onBackClick");
                function0.invoke();
                return Unit.a;
            }
            case 1: {
                qz1_2 qz1_22 = (qz1_2)this.b;
                Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
                Boolean bl2 = Boolean.TRUE;
                qz1_22.s.setValue(bl2);
                return Unit.a;
            }
            case 0: 
        }
        qz1_2 qz1_23 = (qz1_2)this.b;
        Intrinsics.checkNotNullParameter(qz1_23, "$viewModel");
        qz1_2.e(qz1_23);
        return Unit.a;
    }
}

