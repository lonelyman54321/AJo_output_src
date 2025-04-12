/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.nsd.NsdManager$RegistrationListener
 *  android.net.nsd.NsdServiceInfo
 */
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import kotlin.jvm.internal.Intrinsics;

public final class Qp0$a
implements NsdManager.RegistrationListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public Qp0$a(String string2, String string3) {
        this.a = string2;
        this.b = string3;
    }

    public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int n3) {
        Intrinsics.checkNotNullParameter(nsdServiceInfo, "serviceInfo");
        Qp0.a(this.b);
    }

    public final void onServiceRegistered(NsdServiceInfo object) {
        Intrinsics.checkNotNullParameter(object, "NsdServiceInfo");
        String string2 = this.a;
        object = object.getServiceName();
        boolean bl2 = Intrinsics.areEqual(string2, object);
        if (!bl2) {
            object = this.b;
            Qp0.a((String)object);
        }
    }

    public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
        Intrinsics.checkNotNullParameter(nsdServiceInfo, "serviceInfo");
    }

    public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int n3) {
        Intrinsics.checkNotNullParameter(nsdServiceInfo, "serviceInfo");
    }
}

