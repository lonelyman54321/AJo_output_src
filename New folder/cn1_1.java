/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import com.jio.jioads.adinterfaces.JioAdsLoader;
import in.juspay.hypersdk.core.JuspayServices;
import org.json.JSONObject;

/*
 * Renamed from cn1
 */
public final class cn1_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cn1_1(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                JioAdsLoader jioAdsLoader = (JioAdsLoader)this.b;
                String string2 = (String)this.c;
                JioAdsLoader.a(jioAdsLoader, string2);
                return;
            }
            case 0: 
        }
        JuspayServices juspayServices = (JuspayServices)this.b;
        JSONObject jSONObject = (JSONObject)this.c;
        JuspayServices.f(juspayServices, jSONObject);
    }
}

