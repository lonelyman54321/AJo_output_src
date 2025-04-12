/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QM0
 */
public final class qm0_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ qm0_0(Function0 function0, int n3) {
        this.a = n3;
        this.b = function0;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Function0 function0 = this.b;
                Intrinsics.checkNotNullParameter(function0, "$onCancelButtonClicked");
                function0.invoke();
                return Unit.a;
            }
            case 0: 
        }
        Function0 function0 = this.b;
        Intrinsics.checkNotNullParameter(function0, "$onResetFilter");
        function0.invoke();
        return Unit.a;
    }
}

