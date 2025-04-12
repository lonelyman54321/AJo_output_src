/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Wc3
 */
public final class wc3_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wc3_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Function0 function0 = (Function0)this.b;
                Intrinsics.checkNotNullParameter(function0, "$onBrandClicked");
                function0.invoke();
                return Unit.a;
            }
            case 0: 
        }
        ed3_2 ed3_22 = (ed3_2)this.b;
        Intrinsics.checkNotNullParameter(ed3_22, "this$0");
        ed3_22 = ed3_22.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(ed3_22, "getApplication(...)");
        ky1_0 ky1_02 = new ky1_0((Application)ed3_22);
        return ky1_02;
    }
}

