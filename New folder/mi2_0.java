/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalListeners;
import com.google.common.cache.RemovalNotification;

/*
 * Renamed from MI2
 */
public final class mi2_0
implements Runnable {
    public final /* synthetic */ RemovalListener a;
    public final /* synthetic */ RemovalNotification b;

    public /* synthetic */ mi2_0(RemovalListener removalListener, RemovalNotification removalNotification) {
        this.a = removalListener;
        this.b = removalNotification;
    }

    public final void run() {
        RemovalListener removalListener = this.a;
        RemovalNotification removalNotification = this.b;
        RemovalListeners.a(removalListener, removalNotification);
    }
}

