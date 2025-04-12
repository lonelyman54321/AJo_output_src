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
 * Renamed from n71
 */
public final class n71_0
implements Function0 {
    public final /* synthetic */ p71_0 a;

    public /* synthetic */ n71_0(p71_0 p71_02) {
        this.a = p71_02;
    }

    public final Object invoke() {
        p71_0 p71_02 = this.a;
        Intrinsics.checkNotNullParameter(p71_02, "this$0");
        Object object = Looper.getMainLooper();
        Handler handler = new Handler(object);
        object = new o71(p71_02, 0);
        handler.postDelayed((Runnable)object, (long)100);
        return Unit.a;
    }
}

