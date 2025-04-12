/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 */
import com.facebook.FacebookSdk;
import java.util.HashMap;
import org.json.JSONArray;

/*
 * Renamed from lG2
 */
public final class lg2_0 {
    public static final lg2_0 a;
    public static boolean b;
    public static HashMap c;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        c = hashMap = new HashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        String string3 = "value";
        String string2 = "key";
        boolean bl2 = td0.b(this);
        if (bl2) {
            return;
        }
        try {
            Object object = FacebookSdk.b();
            object = dl0_2.k((String)object, false);
            if (object == null) {
                return;
            }
            try {
                int n3;
                HashMap hashMap;
                c = hashMap = new HashMap();
                object = ((al0_2)object).t;
                if (object == null || (n3 = object.length()) == 0) return;
                n3 = object.length();
                for (int i3 = 0; i3 < n3; ++i3) {
                    Object object2 = object.getJSONObject(i3);
                    boolean bl3 = object2.has(string2);
                    boolean bl4 = object2.has(string3);
                    if (!bl3 || !bl4) continue;
                    String string4 = object2.getString(string2);
                    object2 = object2.getJSONArray(string3);
                    if (string4 == null || (object2 = lz3_0.g((JSONArray)object2)) == null) continue;
                    HashMap hashMap2 = c;
                    hashMap2.put(string4, object2);
                }
                return;
            }
            catch (Exception exception) {}
            return;
        }
        catch (Throwable throwable22222) {}
        td0.a(this, throwable22222);
    }
}

