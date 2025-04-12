/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ed
 */
public final class ed_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ed_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                iv1_2 iv1_22 = (iv1_2)this.b;
                Intrinsics.checkNotNullParameter(iv1_22, "this$0");
                iv1_22 = iv1_22.requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(iv1_22, "getApplication(...)");
                ed0_2 ed0_22 = new ed0_2((Application)iv1_22);
                return ed0_22;
            }
            case 0: 
        }
        Function1 function1 = (Function1)this.b;
        Intrinsics.checkNotNullParameter(function1, "$onFollowClicked");
        Boolean bl2 = Boolean.FALSE;
        function1.invoke(bl2);
        return Unit.a;
    }
}

