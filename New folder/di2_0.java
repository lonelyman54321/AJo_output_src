/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.perf.config.RemoteConfigManager;

/*
 * Renamed from DI2
 */
public final class di2_0
implements OnSuccessListener {
    public final /* synthetic */ RemoteConfigManager a;

    public /* synthetic */ di2_0(RemoteConfigManager remoteConfigManager) {
        this.a = remoteConfigManager;
    }

    public final void onSuccess(Object object) {
        RemoteConfigManager remoteConfigManager = this.a;
        object = (Boolean)object;
        RemoteConfigManager.b(remoteConfigManager, (Boolean)object);
    }
}

