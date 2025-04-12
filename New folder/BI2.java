/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ktx.RemoteConfigKt$configUpdates$1$registration$1;

public final class BI2
implements Runnable {
    public final /* synthetic */ pz2_2 a;
    public final /* synthetic */ ConfigUpdate b;

    public /* synthetic */ BI2(pz2_2 pz2_22, ConfigUpdate configUpdate) {
        this.a = pz2_22;
        this.b = configUpdate;
    }

    public final void run() {
        pz2_2 pz2_22 = this.a;
        ConfigUpdate configUpdate = this.b;
        RemoteConfigKt$configUpdates$1$registration$1.a(pz2_22, configUpdate);
    }
}

