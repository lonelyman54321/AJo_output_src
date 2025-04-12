/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
import com.jio.jioads.multiad.H;
import com.jio.jioads.util.j;
import in.juspay.hypersdk.core.DuiInterface;
import in.juspay.hypersdk.core.SdkTracker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Renamed from mw0
 */
public final class mw0_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mw0_2(Object object, int n3, Object object2, Object object3) {
        this.a = n3;
        this.b = object;
        this.c = object2;
        this.d = object3;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                H h3 = (H)this.b;
                Object object = (JSONObject)this.c;
                Object object2 = (JSONArray)this.d;
                Intrinsics.checkNotNullParameter(h3, "this$0");
                Intrinsics.checkNotNullParameter(object, "$keyValueObj");
                Intrinsics.checkNotNullParameter(object2, "$expressionVal");
                Object object3 = h3.k;
                if (object3 != null) {
                    object = object.toString();
                    object3 = "toString(...)";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                    object2 = object2.toString();
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                    object3 = "\"";
                    String string2 = "\\\"";
                    object = kotlin.text.b.n((String)object, (String)object3, string2, false);
                    object2 = kotlin.text.b.n((String)object2, (String)object3, string2, false);
                    string2 = "javascript:cq.getTargettedAds(JSON.parse(\"";
                    object3 = new StringBuilder(string2);
                    ((StringBuilder)object3).append((String)object2);
                    String string3 = "\"),JSON.parse(\"";
                    ((StringBuilder)object3).append(string3);
                    ((StringBuilder)object3).append((String)object);
                    String string4 = "\"))";
                    ((StringBuilder)object3).append(string4);
                    object3 = ((StringBuilder)object3).toString();
                    j.d((String)object3);
                    h3 = h3.k;
                    if (h3 != null) {
                        object = uc0_0.a(string2, (String)object2, string3, (String)object, string4);
                        h3.loadUrl((String)object);
                    }
                }
                return;
            }
            case 0: 
        }
        String string5 = (String)this.c;
        SdkTracker sdkTracker = (SdkTracker)this.d;
        DuiInterface.g((DuiInterface)this.b, string5, sdkTracker);
    }
}

