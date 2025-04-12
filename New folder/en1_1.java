/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentActivity;
import in.juspay.hypersdk.core.JuspayServices;

/*
 * Renamed from en1
 */
public final class en1_1
implements Runnable {
    public final /* synthetic */ JuspayServices a;
    public final /* synthetic */ FragmentActivity b;

    public /* synthetic */ en1_1(JuspayServices juspayServices, FragmentActivity fragmentActivity) {
        this.a = juspayServices;
        this.b = fragmentActivity;
    }

    public final void run() {
        JuspayServices juspayServices = this.a;
        FragmentActivity fragmentActivity = this.b;
        JuspayServices.d(juspayServices, fragmentActivity);
    }
}

