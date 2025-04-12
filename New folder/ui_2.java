/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from uI
 */
public final class ui_2 {
    public String a;
    public long b;
    public long c;
    public String d;
    public JSONObject e;
    public boolean f;
    public List g;
    public String h;
    public JSONObject i;

    public ui_2() {
        ArrayList arrayList;
        this.g = arrayList = new ArrayList();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ui_2 b(String string2, JSONObject object) {
        JSONException jSONException2;
        block14: {
            String string3;
            int n3;
            ArrayList arrayList;
            boolean bl2;
            int n4;
            long l2;
            long l3;
            int n7;
            boolean bl3;
            Object object2 = "tags";
            String string4 = "msg";
            String string5 = "wzrk_ttl";
            String string6 = "date";
            String string7 = "_id";
            String string8 = "wzrk_id";
            Object object3 = null;
            try {
                bl3 = object.has(string7);
                string7 = bl3 ? object.getString(string7) : null;
            }
            catch (JSONException jSONException2) {
                break block14;
            }
            bl3 = object.has(string6);
            long l4 = 1000L;
            if (bl3) {
                n7 = object.getInt(string6);
                l3 = n7;
            } else {
                l3 = System.currentTimeMillis();
                l3 /= l4;
            }
            n7 = (int)(object.has(string5) ? 1 : 0);
            if (n7 != 0) {
                int n8 = object.getInt(string5);
                l2 = n8;
            } else {
                l2 = System.currentTimeMillis();
                long l7 = 86400000L;
                l2 += l7;
                l2 /= l4;
            }
            bl3 = object.has(string4);
            string4 = bl3 ? object.getJSONObject(string4) : null;
            ArrayList<String> arrayList2 = new ArrayList<String>();
            if (string4 != null) {
                n4 = string4.has((String)object2);
                if (n4 != 0) {
                    object2 = string4.getJSONArray((String)object2);
                } else {
                    bl2 = false;
                    object2 = null;
                }
                if (object2 != null) {
                    arrayList = null;
                    for (n4 = 0; n4 < (n3 = object2.length()); ++n4) {
                        string3 = object2.getString(n4);
                        arrayList2.add(string3);
                    }
                }
            }
            if ((n4 = ((String)(object2 = (bl2 = object.has(string8)) ? object.getString(string8) : arrayList)).equalsIgnoreCase((String)((Object)(arrayList = "0_0")))) != 0) {
                object.put(string8, object2);
            }
            string8 = new JSONObject();
            arrayList = object.keys();
            while ((n3 = (int)(arrayList.hasNext() ? 1 : 0)) != 0) {
                string3 = arrayList.next();
                Object object4 = "wzrk_";
                boolean bl4 = string3.startsWith((String)object4);
                if (!bl4) continue;
                object4 = object.get(string3);
                string8.put(string3, object4);
            }
            if (string7 == null) {
                return object3;
            }
            object = new Object();
            arrayList = new ArrayList();
            object.d = string7;
            object.e = string4;
            object.f = false;
            object.b = l3;
            object.c = l2;
            object.h = string2;
            object.g = arrayList2;
            object.a = object2;
            object.i = string8;
            return object;
        }
        jSONException2.getLocalizedMessage();
        com.clevertap.android.sdk.b.c();
        return null;
    }

    public final boolean a() {
        boolean bl2;
        com.clevertap.android.sdk.b.c();
        JSONObject jSONObject = this.c();
        Object object = new CTInboxMessage(jSONObject);
        object = ((CTInboxMessage)object).j;
        boolean bl3 = false;
        jSONObject = null;
        object = (CTInboxMessageContent)((ArrayList)object).get(0);
        boolean bl4 = ((CTInboxMessageContent)object).l();
        if (bl4 || (bl2 = ((CTInboxMessageContent)object).i())) {
            bl3 = true;
        }
        return bl3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JSONObject c() {
        Object object = this.g;
        JSONObject jSONObject = new JSONObject();
        String string2 = "id";
        try {
            String string3 = this.d;
            jSONObject.put(string2, (Object)string3);
            string2 = "msg";
            string3 = this.e;
            jSONObject.put(string2, (Object)string3);
            string2 = "isRead";
            int n3 = this.f;
            jSONObject.put(string2, n3 != 0);
            string2 = "date";
            long l2 = this.b;
            jSONObject.put(string2, l2);
            string2 = "wzrk_ttl";
            l2 = this.c;
            jSONObject.put(string2, l2);
            string2 = new JSONArray();
            n3 = 0;
            string3 = null;
            while (true) {
                int n4;
                if (n3 >= (n4 = object.size())) {
                    object = "tags";
                    jSONObject.put((String)object, (Object)string2);
                    object = "wzrk_id";
                    string2 = this.a;
                    jSONObject.put((String)object, (Object)string2);
                    object = "wzrkParams";
                    string2 = this.i;
                    jSONObject.put((String)object, (Object)string2);
                    return jSONObject;
                }
                Object e2 = object.get(n3);
                string2.put(e2);
                ++n3;
            }
        }
        catch (JSONException jSONException) {}
        jSONException.getLocalizedMessage();
        com.clevertap.android.sdk.b.j();
        return jSONObject;
    }
}

