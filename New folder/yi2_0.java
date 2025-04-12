/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.concurrent.Callable;

/*
 * Renamed from yI2
 */
public final class yi2_0
implements Callable {
    public final /* synthetic */ RemoteConfigComponent a;

    public /* synthetic */ yi2_0(RemoteConfigComponent remoteConfigComponent) {
        this.a = remoteConfigComponent;
    }

    public final Object call() {
        return this.a.getDefault();
    }
}

