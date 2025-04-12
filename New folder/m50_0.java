/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.a;
import com.clevertap.android.sdk.b;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Renamed from m50
 */
public final class m50_0
extends zV {
    public final CleverTapInstanceConfig b;
    public final b c;

    public m50_0(CleverTapInstanceConfig object) {
        this.b = object;
        this.c = object = ((CleverTapInstanceConfig)object).b();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Context object, JSONObject object2, String object3) {
        void var2_5;
        Object object4;
        b b2;
        Object object5;
        String string2;
        block6: {
            string2 = "dbg_lvl";
            object5 = this.b;
            b2 = this.c;
            object4 = "console";
            try {
                int n3 = var2_5.has((String)object4);
                if (n3 == 0) break block6;
                object4 = var2_5.get((String)object4);
                n3 = (object4 = (JSONArray)object4).length();
                if (n3 > 0) {
                    int n4;
                    Object object6;
                    for (n3 = 0; n3 < (n4 = object4.length()); object6 = object6.toString(), ++n3) {
                        object6 = ((CleverTapInstanceConfig)object5).a;
                        object6 = object4.get(n3);
                        b2.getClass();
                        com.clevertap.android.sdk.b.f((String)object6);
                    }
                }
            }
            catch (Throwable throwable) {}
        }
        try {
            boolean bl2 = var2_5.has(string2);
            if (!bl2) return;
            int n7 = var2_5.getInt(string2);
            if (n7 < 0) return;
            com.clevertap.android.sdk.a.c = n7;
            String string3 = ((CleverTapInstanceConfig)object5).a;
            object5 = new StringBuilder();
            object4 = "Set debug level to ";
            ((StringBuilder)object5).append((String)object4);
            ((StringBuilder)object5).append(n7);
            String string4 = " for this session (set by upstream)";
            ((StringBuilder)object5).append(string4);
            String string5 = ((StringBuilder)object5).toString();
            b2.b(string3, string5);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

