/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalListeners;
import com.google.common.cache.RemovalNotification;
import java.util.concurrent.Executor;

/*
 * Renamed from NI2
 */
public final class ni2_0
implements RemovalListener {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ RemovalListener b;

    public /* synthetic */ ni2_0(RemovalListener removalListener, Executor executor) {
        this.a = executor;
        this.b = removalListener;
    }

    public final void onRemoval(RemovalNotification removalNotification) {
        Executor executor = this.a;
        RemovalListener removalListener = this.b;
        RemovalListeners.b(executor, removalListener, removalNotification);
    }
}

