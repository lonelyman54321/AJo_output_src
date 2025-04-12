/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tagmanager.InstallReferrerReceiver;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vi1
 */
public final class vi1_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vi1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                ThreadPoolExecutor threadPoolExecutor;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<Runnable>();
                Object object = threadPoolExecutor;
                threadPoolExecutor = new ThreadPoolExecutor(0, 1, 0L, timeUnit, linkedBlockingQueue);
                Context context = (Context)this.b;
                object = new iB2(context);
                threadPoolExecutor.execute((Runnable)object);
                return;
            }
            case 0: 
        }
        Object object = (String)this.b;
        Intrinsics.checkNotNullParameter(object, "$referrerUrl");
        InstallReferrerReceiver installReferrerReceiver = new InstallReferrerReceiver();
        Intent intent = new Intent("com.android.vending.INSTALL_REFERRER");
        intent.putExtra("referrer", (String)object);
        AJIOApplication.Companion.getClass();
        object = AJIOApplication$a.a();
        installReferrerReceiver.onReceive((Context)object, intent);
    }
}

