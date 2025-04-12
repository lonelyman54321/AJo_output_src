/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.perf.config.RemoteConfigManager;

/*
 * Renamed from EI2
 */
public final class ei2_0
implements OnFailureListener {
    public final /* synthetic */ RemoteConfigManager a;

    public /* synthetic */ ei2_0(RemoteConfigManager remoteConfigManager) {
        this.a = remoteConfigManager;
    }

    public final void onFailure(Exception exception) {
        RemoteConfigManager.a(this.a, exception);
    }
}

