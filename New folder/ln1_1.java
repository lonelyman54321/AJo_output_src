/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import in.juspay.hypersdk.core.JuspayServices;

/*
 * Renamed from ln1
 */
public final class ln1_1
implements Runnable {
    public final /* synthetic */ JuspayServices a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ FragmentActivity c;

    public /* synthetic */ ln1_1(JuspayServices juspayServices, ViewGroup viewGroup, FragmentActivity fragmentActivity) {
        this.a = juspayServices;
        this.b = viewGroup;
        this.c = fragmentActivity;
    }

    public final void run() {
        ViewGroup viewGroup = this.b;
        FragmentActivity fragmentActivity = this.c;
        JuspayServices.g(this.a, viewGroup, fragmentActivity);
    }
}

