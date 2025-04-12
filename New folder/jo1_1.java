/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences$Editor
 *  org.json.JSONObject
 */
import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import org.json.JSONObject;

/*
 * Renamed from JO1
 */
public final class jo1_1
extends zV {
    public final CleverTapInstanceConfig b;
    public final mp0_0 c;
    public final b d;
    public final tu1_1 e;

    public jo1_1(CleverTapInstanceConfig object, mp0_0 mp0_02, tu1_1 tu1_12) {
        this.b = object;
        this.d = object = ((CleverTapInstanceConfig)object).b();
        this.c = mp0_02;
        this.e = tu1_12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Context context, JSONObject jSONObject, String string2) {
        string2 = "_j";
        Object object = "IJ";
        Object object2 = this.e;
        String string3 = "_i";
        Object object3 = this.b;
        b b2 = this.d;
        Object object4 = "g";
        String string4 = "Got a new device ID: ";
        try {
            boolean bl2 = jSONObject.has((String)object4);
            if (bl2) {
                object4 = jSONObject.getString((String)object4);
                Object object5 = this.c;
                ((mp0_0)object5).b((String)object4);
                object5 = ((CleverTapInstanceConfig)object3).a;
                StringBuilder stringBuilder = new StringBuilder(string4);
                stringBuilder.append((String)object4);
                object4 = stringBuilder.toString();
                b2.b((String)object5, (String)object4);
            }
        }
        catch (Throwable throwable) {
            object3 = ((CleverTapInstanceConfig)object3).a;
            b2.getClass();
            com.clevertap.android.sdk.b.m();
        }
        try {
            boolean bl3 = jSONObject.has(string3);
            if (bl3) {
                long l2 = jSONObject.getLong(string3);
                object2.getClass();
                b2 = gc3_0.f(context, (String)object);
                b2 = b2.edit();
                object4 = ((tu1_1)object2).c;
                string4 = "comms_i";
                object4 = gc3_0.l((CleverTapInstanceConfig)object4, string4);
                b2.putLong((String)object4, l2);
                gc3_0.i((SharedPreferences.Editor)b2);
            }
        }
        catch (Throwable throwable) {}
        try {
            boolean bl4 = jSONObject.has(string2);
            if (!bl4) return;
            long l3 = jSONObject.getLong(string2);
            object2.getClass();
            context = gc3_0.f(context, (String)object);
            context = context.edit();
            object = ((tu1_1)object2).c;
            object2 = "comms_j";
            object = gc3_0.l((CleverTapInstanceConfig)object, (String)object2);
            context.putLong((String)object, l3);
            gc3_0.i((SharedPreferences.Editor)context);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

