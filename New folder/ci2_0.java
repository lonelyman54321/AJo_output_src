/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1$registration$1;

/*
 * Renamed from CI2
 */
public final class ci2_0
implements Runnable {
    public final /* synthetic */ pz2_2 a;
    public final /* synthetic */ ConfigUpdate b;

    public /* synthetic */ ci2_0(pz2_2 pz2_22, ConfigUpdate configUpdate) {
        this.a = pz2_22;
        this.b = configUpdate;
    }

    public final void run() {
        pz2_2 pz2_22 = this.a;
        ConfigUpdate configUpdate = this.b;
        RemoteConfigKt$configUpdates$1$registration$1.a(pz2_22, configUpdate);
    }
}

