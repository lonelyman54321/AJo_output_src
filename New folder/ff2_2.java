/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ff2
 */
public final class ff2_2
implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ tr1_0 c;
    public final /* synthetic */ Handler d;

    public /* synthetic */ ff2_2(boolean bl2, b7_0 b7_02, tr1_0 tr1_02, Handler handler) {
        this.a = bl2;
        this.b = b7_02;
        this.c = tr1_02;
        this.d = handler;
    }

    public final Object invoke() {
        Function0 function0 = this.b;
        Intrinsics.checkNotNullParameter(function0, "$onChatClicked");
        tr1_0 tr1_02 = this.c;
        Intrinsics.checkNotNullParameter(tr1_02, "$openDialog");
        Object object = "$handler";
        Handler handler = this.d;
        Intrinsics.checkNotNullParameter(handler, (String)object);
        boolean bl2 = this.a;
        if (bl2) {
            function0.invoke();
        } else {
            object = (Boolean)tr1_02.getValue() ^ true;
            tr1_02.setValue(object);
            bl2 = false;
            handler.removeCallbacksAndMessages(null);
            int n3 = 1;
            object = new to_0(tr1_02, n3);
            long l2 = 2000L;
            handler.postDelayed((Runnable)object, l2);
        }
        return Unit.a;
    }
}

