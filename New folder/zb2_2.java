/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zb2
 */
public final class zb2_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zb2_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                u43_0 u43_02 = (u43_0)this.b;
                Intrinsics.checkNotNullParameter(u43_02, "this$0");
                Object object = Looper.getMainLooper();
                Handler handler = new Handler(object);
                object = new al0_1(u43_02, 1);
                handler.postDelayed((Runnable)object, (long)100);
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

