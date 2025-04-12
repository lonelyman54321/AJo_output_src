/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.core.InflateJSON;
import in.juspay.hypersdk.core.InflateView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import org.json.JSONObject;

public class CallbackHandler
implements InvocationHandler {
    private final InflateJSON infl;
    private final JSONObject obj;

    public CallbackHandler(InflateJSON inflateJSON, JSONObject jSONObject) {
        this.obj = jSONObject;
        this.infl = inflateJSON;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object invoke(Object object, Method object2, Object[] objectArray) {
        Throwable throwable2;
        block3: {
            Object object3;
            String string2;
            try {
                string2 = ((Method)object2).getName();
                object3 = this.obj;
                boolean bl2 = object3.has(string2);
                if (!bl2) {
                    return ((Method)object2).invoke((Object)this, objectArray);
                }
            }
            catch (Throwable throwable2) {
                break block3;
            }
            object3 = this.infl;
            String string3 = "proxy";
            ((InflateView)object3).putInState(string3, object);
            object3 = this.infl;
            string3 = "method";
            ((InflateView)object3).putInState(string3, object2);
            object2 = this.infl;
            object3 = "args";
            ((InflateView)object2).putInState((String)object3, objectArray);
            object2 = this.infl;
            objectArray = this.obj;
            return ((InflateJSON)object2).runProps((JSONObject)objectArray, string2, object);
        }
        object2 = this.infl.getDUI().getLogger();
        objectArray = new StringBuilder("error in callback handler");
        Object object4 = throwable2.getMessage();
        objectArray.append((String)object4);
        object4 = objectArray.toString();
        object2.e("ERROR", (String)object4);
        return new Object();
    }
}

