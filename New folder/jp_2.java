/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.ota.ApplicationManager;
import java.util.concurrent.Callable;

/*
 * Renamed from jp
 */
public final class jp_2
implements Callable {
    public final /* synthetic */ ApplicationManager a;
    public final /* synthetic */ String b;

    public /* synthetic */ jp_2(ApplicationManager applicationManager, String string2) {
        this.a = applicationManager;
        this.b = string2;
    }

    public final Object call() {
        ApplicationManager applicationManager = this.a;
        String string2 = this.b;
        return ApplicationManager.b(applicationManager, string2);
    }
}

