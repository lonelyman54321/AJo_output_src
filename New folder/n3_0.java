/*
 * Decompiled with CFR 0.152.
 */
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.task.a;
import java.util.concurrent.Callable;

/*
 * Renamed from n3
 */
public final class n3_0
implements InstallReferrerStateListener {
    public final /* synthetic */ InstallReferrerClient a;
    public final /* synthetic */ k3_0 b;

    public n3_0(k3_0 k3_02, InstallReferrerClient installReferrerClient) {
        this.b = k3_02;
        this.a = installReferrerClient;
    }

    public final void onInstallReferrerServiceDisconnected() {
        k3_0 k3_02 = this.b;
        E80 e80 = k3_02.f;
        boolean bl2 = e80.i;
        if (!bl2) {
            k3_0.a(k3_02);
        }
    }

    public final void onInstallReferrerSetupFinished(int n3) {
        Object object = this.b;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 == n4) {
                    Object object2 = ((k3_0)object).d.b();
                    object = ((k3_0)object).d.a;
                    object2.getClass();
                    object2 = "Install Referrer data not set, API not supported by Play Store on device";
                    com.clevertap.android.sdk.b.f((String)object2);
                }
            } else {
                Object object3 = ((k3_0)object).d.b();
                object = ((k3_0)object).d.a;
                object3.getClass();
                object3 = "Install Referrer data not set, connection to Play Store unavailable";
                com.clevertap.android.sdk.b.f((String)object3);
            }
        } else {
            a a2 = jh_1.a(((k3_0)object).d).b();
            Object object4 = this.a;
            object = new l3_0(this, (InstallReferrerClient)object4);
            a2.b((e92)object);
            object = new m3_0(this, (InstallReferrerClient)object4);
            object4 = "ActivityLifeCycleManager#getInstallReferrer";
            a2.c((String)object4, (Callable)object);
        }
    }
}

