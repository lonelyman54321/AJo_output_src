/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import com.jio.jioads.adinterfaces.JioAdsTracker;
import in.juspay.hypersdk.core.JuspayServices;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;

/*
 * Renamed from dn1
 */
public final class dn1_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dn1_1(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef)this.b;
                JioAdsTracker jioAdsTracker = (JioAdsTracker)this.c;
                JioAdsTracker.a(ref$ObjectRef, jioAdsTracker);
                return;
            }
            case 0: 
        }
        JuspayServices juspayServices = (JuspayServices)this.b;
        JSONObject jSONObject = (JSONObject)this.c;
        JuspayServices.a(juspayServices, jSONObject);
    }
}

