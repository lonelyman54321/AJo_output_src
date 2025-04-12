/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ad2
 */
public final class ad2_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ad2_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Function0 function0 = (Function0)this.b;
                Intrinsics.checkNotNullParameter(function0, "$onFilterClicked");
                function0.invoke();
                return Unit.a;
            }
            case 0: 
        }
        qz1_2 qz1_22 = (qz1_2)this.b;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        Boolean bl2 = Boolean.FALSE;
        qz1_22.n.setValue(bl2);
        return Unit.a;
    }
}

