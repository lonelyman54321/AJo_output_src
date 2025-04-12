/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from NQ0
 */
public final class nq0_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ nq0_1(Function0 function0, int n3) {
        this.a = n3;
        this.b = function0;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Function0 function0 = this.b;
                Intrinsics.checkNotNullParameter(function0, "$onNeedHelpClicked");
                function0.invoke();
                return Unit.a;
            }
            case 0: 
        }
        Function0 function0 = this.b;
        Intrinsics.checkNotNullParameter(function0, "$onWishlistClicked");
        function0.invoke();
        return Unit.a;
    }
}

