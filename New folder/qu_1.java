/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;
import com.skydoves.balloon.Balloon;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Qu
 */
public final class qu_1
implements Runnable {
    public final /* synthetic */ Balloon a;

    public /* synthetic */ qu_1(Balloon balloon2) {
        this.a = balloon2;
    }

    public final void run() {
        Balloon balloon2 = this.a;
        Intrinsics.checkNotNullParameter(balloon2, "this$0");
        Object object = Looper.getMainLooper();
        Handler handler = new Handler(object);
        object = new uu_2(balloon2);
        balloon2.b.getClass();
        handler.postDelayed((Runnable)object, 0L);
    }
}

