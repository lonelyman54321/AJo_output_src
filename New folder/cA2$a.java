/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class cA2$a
implements Callable {
    public final /* synthetic */ cA2 a;

    public cA2$a(cA2 cA22) {
        this.a = cA22;
    }

    public final Object call() {
        Object object = this.a;
        Object object2 = ((cA2)object).d;
        HashMap hashMap = new HashMap(object2);
        object2 = "fetch_min_interval_seconds";
        hashMap.remove(object2);
        object2 = ((cA2)object).c;
        Object object3 = "Product_Config_";
        CharSequence charSequence = new StringBuilder((String)object3);
        object3 = ((cA2)object).a;
        object3 = ((CleverTapInstanceConfig)object3).a;
        charSequence.append((String)object3);
        object3 = "_";
        charSequence.append((String)object3);
        object3 = ((cA2)object).b;
        charSequence.append((String)object3);
        charSequence = charSequence.toString();
        object3 = "config_settings.json";
        JSONObject jSONObject = new JSONObject(hashMap);
        try {
            ((lm0_1)object2).c((String)charSequence, (String)object3, jSONObject);
            object = Boolean.TRUE;
        }
        catch (Exception exception) {
            object2 = ((cA2)object).a.b();
            object = da2_0.a(((cA2)object).a);
            object3 = "UpdateConfigToFile failed: ";
            charSequence = new StringBuilder((String)object3);
            String string2 = exception.getLocalizedMessage();
            charSequence.append(string2);
            string2 = charSequence.toString();
            ((b)object2).b((String)object, string2);
            object = Boolean.FALSE;
        }
        return object;
    }
}

