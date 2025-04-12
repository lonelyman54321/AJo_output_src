/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.concurrent.Callable;

/*
 * Renamed from Wl0
 */
public final class wl0_2
implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wl0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object call() {
        int n3 = this.a;
        switch (n3) {
            default: {
                return ((FirebaseRemoteConfig)this.b).getInfo();
            }
            case 0: 
        }
        return DefaultHeartBeatController.d((DefaultHeartBeatController)this.b);
    }
}

