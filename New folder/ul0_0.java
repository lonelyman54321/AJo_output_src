/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.concurrent.Callable;

/*
 * Renamed from Ul0
 */
public final class ul0_0
implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ul0_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object call() {
        int n3 = this.a;
        switch (n3) {
            default: {
                return FirebaseRemoteConfig.j((FirebaseRemoteConfig)this.b);
            }
            case 0: 
        }
        return DefaultHeartBeatController.a((DefaultHeartBeatController)this.b);
    }
}

