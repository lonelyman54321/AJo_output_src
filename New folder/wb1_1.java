/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 *  org.json.JSONObject
 */
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import in.juspay.services.HyperServices;
import org.json.JSONObject;

/*
 * Renamed from Wb1
 */
public final class wb1_1
implements Runnable {
    public final /* synthetic */ HyperServices a;
    public final /* synthetic */ FragmentActivity b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ JSONObject d;

    public /* synthetic */ wb1_1(HyperServices hyperServices, FragmentActivity fragmentActivity, ViewGroup viewGroup, JSONObject jSONObject) {
        this.a = hyperServices;
        this.b = fragmentActivity;
        this.c = viewGroup;
        this.d = jSONObject;
    }

    public final void run() {
        ViewGroup viewGroup = this.c;
        JSONObject jSONObject = this.d;
        HyperServices hyperServices = this.a;
        FragmentActivity fragmentActivity = this.b;
        HyperServices.c(hyperServices, fragmentActivity, viewGroup, jSONObject);
    }
}

