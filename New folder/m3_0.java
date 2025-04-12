/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.b;
import java.util.concurrent.Callable;

/*
 * Renamed from m3
 */
public final class m3_0
implements Callable {
    public final /* synthetic */ n3_0 a;
    public final /* synthetic */ InstallReferrerClient b;

    public /* synthetic */ m3_0(n3_0 n3_02, InstallReferrerClient installReferrerClient) {
        this.a = n3_02;
        this.b = installReferrerClient;
    }

    public final Object call() {
        Object object = this.b;
        Object object2 = this.a;
        object2.getClass();
        try {
            object = ((InstallReferrerClient)object).getInstallReferrer();
        }
        catch (RemoteException remoteException) {
            object2 = ((n3_0)object2).b;
            b b2 = ((k3_0)object2).d.b();
            CharSequence charSequence = ((k3_0)object2).d.a;
            String string2 = "Remote exception caused by Google Play Install Referrer library - ";
            charSequence = new StringBuilder(string2);
            String string3 = remoteException.getMessage();
            ((StringBuilder)charSequence).append(string3);
            string3 = ((StringBuilder)charSequence).toString();
            b2.getClass();
            com.clevertap.android.sdk.b.f(string3);
            ((InstallReferrerClient)object).endConnection();
            object2 = ((k3_0)object2).f;
            ((E80)object2).i = false;
            object = null;
        }
        return object;
    }
}

