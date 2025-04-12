/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import java.util.concurrent.Callable;

/*
 * Renamed from YN0
 */
public final class yn0_1
implements Callable {
    public final /* synthetic */ FirebaseRemoteConfig a;
    public final /* synthetic */ FirebaseRemoteConfigSettings b;

    public /* synthetic */ yn0_1(FirebaseRemoteConfig firebaseRemoteConfig, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.a = firebaseRemoteConfig;
        this.b = firebaseRemoteConfigSettings;
    }

    public final Object call() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.a;
        FirebaseRemoteConfigSettings firebaseRemoteConfigSettings = this.b;
        return FirebaseRemoteConfig.a(firebaseRemoteConfig, firebaseRemoteConfigSettings);
    }
}

