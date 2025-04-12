/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import java.net.URLEncoder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/*
 * Renamed from z01$a
 */
public final class z01$a_0
extends Lambda
implements Function1 {
    public final /* synthetic */ JSONObject c;

    public z01$a_0(JSONObject jSONObject) {
        this.c = jSONObject;
        super(1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object object) {
        object = (String)object;
        String string2 = "UTF-8";
        Object object2 = this.c.opt((String)object);
        String string3 = null;
        if (object2 == null) {
            return string3;
        }
        try {
            object = URLEncoder.encode((String)object, string2);
            object2 = object2.toString();
            string2 = URLEncoder.encode((String)object2, string2);
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object);
            char c2 = '=';
            ((StringBuilder)object2).append(c2);
            ((StringBuilder)object2).append(string2);
            return ((StringBuilder)object2).toString();
        }
        catch (Exception exception) {
            return string3;
        }
    }
}

