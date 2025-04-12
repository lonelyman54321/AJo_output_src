/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.ota.ApplicationManager;
import java.util.concurrent.Callable;

/*
 * Renamed from kp
 */
public final class kp_2
implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ ApplicationManager b;

    public /* synthetic */ kp_2(ApplicationManager applicationManager, String string2) {
        this.a = string2;
        this.b = applicationManager;
    }

    public final Object call() {
        String string2 = this.a;
        return ApplicationManager.a(this.b, string2);
    }
}

