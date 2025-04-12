/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences$Editor
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public final class x0
extends zV {
    public final ai_0 b;
    public final CleverTapInstanceConfig c;
    public final b d;
    public final tu1_1 e;
    public final ha3_1 f;

    public x0(CleverTapInstanceConfig object, tu1_1 tu1_12, ha3_1 ha3_12, l80_0 object2) {
        this.c = object;
        this.b = object2 = ((l80_0)object2).g;
        this.d = object = ((CleverTapInstanceConfig)object).b();
        this.e = tu1_12;
        this.f = ha3_12;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     */
    public final void a(Context object, JSONObject object2, String object3) {
        block11: {
            JSONObject jSONObject;
            b b2;
            block12: {
                void var2_3;
                b2 = this.d;
                Object object4 = "arp";
                boolean bl2 = var2_3.has((String)object4);
                if (!bl2) break block11;
                Object object5 = var2_3.get((String)object4);
                jSONObject = (JSONObject)object5;
                int n3 = jSONObject.length();
                if (n3 <= 0) break block11;
                object4 = this.b;
                if (object4 == null) break block12;
                ((ai_0)object4).i(jSONObject);
            }
            try {
                this.c(jSONObject);
            }
            catch (Throwable throwable) {
                throwable.getLocalizedMessage();
                b2.a();
            }
            this.b((Context)object, jSONObject);
            {
                catch (Throwable throwable) {
                    String string2 = this.c.a;
                    b2.getClass();
                    com.clevertap.android.sdk.b.m();
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Context context, JSONObject object) {
        int n3 = object.length();
        if (n3 == 0) {
            return;
        }
        CharSequence charSequence = this.e.d();
        if (charSequence == null) {
            return;
        }
        context = gc3_0.f(context, (String)charSequence).edit();
        Object object2 = object.keys();
        while (true) {
            Object object3;
            String string2;
            b b2;
            Object object4;
            block11: {
                boolean bl2;
                boolean bl3 = object2.hasNext();
                object4 = this.c;
                b2 = this.d;
                if (!bl3) {
                    object2 = ((CleverTapInstanceConfig)object4).a;
                    charSequence = Gn.a("Stored ARP for namespace key: ", (String)charSequence, " values: ");
                    object = object.toString();
                    ((StringBuilder)charSequence).append((String)object);
                    object = ((StringBuilder)charSequence).toString();
                    b2.b((String)object2, (String)object);
                    gc3_0.i((SharedPreferences.Editor)context);
                    return;
                }
                string2 = (String)object2.next();
                try {
                    object3 = object.get(string2);
                }
                catch (JSONException jSONException) {}
                boolean bl4 = object3 instanceof Number;
                if (bl4) {
                    object3 = (Number)object3;
                    bl2 = ((Number)object3).intValue();
                    context.putInt(string2, (int)(bl2 ? 1 : 0));
                }
                bl4 = object3 instanceof String;
                if (bl4) {
                    object3 = (String)object3;
                    context.putString(string2, (String)object3);
                    continue;
                }
                bl4 = object3 instanceof Boolean;
                if (!bl4) break block11;
                object3 = (Boolean)object3;
                bl2 = (Boolean)object3;
                context.putBoolean(string2, bl2);
                continue;
            }
            object4 = ((CleverTapInstanceConfig)object4).a;
            object3 = new StringBuilder();
            String string3 = "ARP update for key ";
            ((StringBuilder)object3).append(string3);
            ((StringBuilder)object3).append(string2);
            string2 = " rejected (invalid data type)";
            ((StringBuilder)object3).append(string2);
            string2 = ((StringBuilder)object3).toString();
            b2.b((String)object4, string2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(JSONObject object) {
        JSONException jSONException2;
        b b2;
        Object object2;
        String string2;
        block6: {
            ArrayList<String> arrayList;
            block5: {
                string2 = "d_e";
                boolean bl2 = object.has(string2);
                object2 = this.c;
                b2 = this.d;
                if (!bl2) {
                    object = ((CleverTapInstanceConfig)object2).a;
                    b2.b((String)object, "ARP doesn't contain the Discarded Events key");
                    return;
                }
                try {
                    int n3;
                    arrayList = new ArrayList<String>();
                    object = object.getJSONArray(string2);
                    if (object == null) break block5;
                    string2 = null;
                    for (int i3 = 0; i3 < (n3 = object.length()); ++i3) {
                        String string3 = object.getString(i3);
                        arrayList.add(string3);
                    }
                }
                catch (JSONException jSONException2) {
                    break block6;
                }
            }
            if ((object = this.f) != null) {
                object.a = arrayList;
                return;
            }
            object = ((CleverTapInstanceConfig)object2).a;
            string2 = "Validator object is NULL";
            b2.b((String)object, string2);
            return;
        }
        string2 = ((CleverTapInstanceConfig)object2).a;
        object2 = "Error parsing discarded events list";
        StringBuilder stringBuilder = new StringBuilder((String)object2);
        String string4 = jSONException2.getLocalizedMessage();
        stringBuilder.append(string4);
        string4 = stringBuilder.toString();
        b2.b(string2, string4);
    }
}

