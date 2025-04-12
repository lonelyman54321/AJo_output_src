/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ServiceConnection
 *  android.os.IBinder
 */
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

public final class LI2$b
implements ServiceConnection {
    public final CountDownLatch a;
    public IBinder b;

    public LI2$b() {
        CountDownLatch countDownLatch;
        this.a = countDownLatch = new CountDownLatch(1);
    }

    public final void onNullBinding(ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "name");
        this.a.countDown();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Intrinsics.checkNotNullParameter(componentName, "name");
        Intrinsics.checkNotNullParameter(iBinder, "serviceBinder");
        this.b = iBinder;
        this.a.countDown();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "name");
    }
}

