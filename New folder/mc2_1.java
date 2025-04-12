/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Mc2
 */
public final class mc2_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mc2_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                hd2_0 hd2_02 = (hd2_0)this.b;
                Intrinsics.checkNotNullParameter(hd2_02, "$rateReviewClickListener");
                hd2_02.G3();
                return Unit.a;
            }
            case 0: 
        }
        Function0 function0 = (Function0)this.b;
        Intrinsics.checkNotNullParameter(function0, "$onCloseButtonClicked");
        function0.invoke();
        return Unit.a;
    }
}

