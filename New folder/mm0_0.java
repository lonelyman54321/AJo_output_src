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
 * Renamed from MM0
 */
public final class mm0_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mm0_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                sD3 sD32 = (jz1_2)this.b;
                Intrinsics.checkNotNullParameter(sD32, "this$0");
                sD32 = sD32.getActivity();
                sD32 = sD32 != null ? sD32.getApplication() : null;
                b52_0 b52_02 = new b52_0((Application)sD32);
                return b52_02;
            }
            case 1: {
                Function0 function0 = (Function0)this.b;
                Intrinsics.checkNotNullParameter(function0, "$onCloseButtonClicked");
                function0.invoke();
                return Unit.a;
            }
            case 0: 
        }
        Function0 function0 = (Function0)this.b;
        Intrinsics.checkNotNullParameter(function0, "$onApplyFilter");
        function0.invoke();
        return Unit.a;
    }
}

