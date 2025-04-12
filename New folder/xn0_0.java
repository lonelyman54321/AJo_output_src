/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.remoteconfig.CustomSignals;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.concurrent.Callable;

/*
 * Renamed from XN0
 */
public final class xn0_0
implements Callable {
    public final /* synthetic */ FirebaseRemoteConfig a;
    public final /* synthetic */ CustomSignals b;

    public /* synthetic */ xn0_0(FirebaseRemoteConfig firebaseRemoteConfig, CustomSignals customSignals) {
        this.a = firebaseRemoteConfig;
        this.b = customSignals;
    }

    public final Object call() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.a;
        CustomSignals customSignals = this.b;
        return FirebaseRemoteConfig.c(firebaseRemoteConfig, customSignals);
    }
}

