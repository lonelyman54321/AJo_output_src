/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.helper.UrlHelper$Companion;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from Ij2
 */
public final class ij2_1 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final JSONObject a(String string2) {
        Object object = "customerId";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        String string3 = "ajio_android";
        Object object2 = UrlHelper.Companion;
        Object object3 = ((UrlHelper$Companion)object2).getInstance();
        boolean bl2 = ((UrlHelper)object3).isUATDomain();
        object3 = bl2 ? "ajio" : "ajio_prod";
        object2 = ((UrlHelper$Companion)object2).getInstance();
        boolean bl3 = ((UrlHelper)object2).isUATDomain();
        object2 = bl3 ? "sandbox" : "prod";
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String string4 = "clientId";
        try {
            jSONObject2.put(string4, (Object)string3);
            string3 = "action";
            string4 = "initiate";
        }
        catch (JSONException jSONException) {
            return jSONObject;
        }
        jSONObject2.put(string3, (Object)string4);
        string3 = "merchantId";
        jSONObject2.put(string3, object3);
        jSONObject2.put((String)object, (Object)string2);
        string2 = "environment";
        jSONObject2.put(string2, object2);
        string2 = "payload";
        jSONObject.put(string2, (Object)jSONObject2);
        string2 = "service";
        object = "in.juspay.hyperpay";
        jSONObject.put(string2, object);
        string2 = "requestId";
        object = UUID.randomUUID();
        object = ((UUID)object).toString();
        string3 = "toString(...)";
        Intrinsics.checkNotNullExpressionValue(object, string3);
        jSONObject.put(string2, object);
        return jSONObject;
    }
}

