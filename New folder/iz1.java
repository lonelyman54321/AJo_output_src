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
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONObject;

public final class iz1 {
    public final CleverTapInstanceConfig a;
    public final Context b;
    public final mp0_0 c;
    public final ae0_1 d;

    public iz1(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, mp0_0 mp0_02, ae0_1 ae0_12) {
        this.b = context;
        this.a = cleverTapInstanceConfig;
        this.c = mp0_02;
        this.d = ae0_12;
    }

    public final void a(String string2, String object, String string3) {
        boolean bl2 = this.d();
        if (!bl2 && string2 != null && object != null && string3 != null) {
            Object object2 = this.d;
            String string4 = ((ae0_1)object2).b(string3, (String)object);
            CleverTapInstanceConfig cleverTapInstanceConfig = this.a;
            if (string4 == null) {
                string4 = this.b;
                int n3 = 1;
                os_2.e((Context)string4, cleverTapInstanceConfig, n3, (ae0_1)object2);
            } else {
                string3 = string4;
            }
            object2 = "_";
            object = n1.a((String)object, (String)object2, string3);
            string3 = this.b();
            string3.put((String)object, (Object)string2);
            try {
                this.g((JSONObject)string3);
            }
            catch (Throwable throwable) {
                object = cleverTapInstanceConfig.b();
                string3 = cleverTapInstanceConfig.a;
                string4 = "Error caching guid: ";
                object2 = new StringBuilder(string4);
                ((StringBuilder)object2).append(throwable);
                String string5 = ((StringBuilder)object2).toString();
                ((b)object).b(string3, string5);
            }
        }
    }

    public final JSONObject b() {
        Object object = this.b;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.a;
        String string2 = gc3_0.h(object, cleverTapInstanceConfig, "cachedGUIDsKey", null);
        Object object2 = new StringBuilder("getCachedGUIDs:[");
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append("]");
        object2 = ((StringBuilder)object2).toString();
        cleverTapInstanceConfig.e("ON_USER_LOGIN", (String)object2);
        object2 = cleverTapInstanceConfig.b();
        object = cleverTapInstanceConfig.a;
        return si_2.d(string2, (b)object2, (String)object);
    }

    public final String c(String string2, String object) {
        String string3 = ", value:";
        CharSequence charSequence = "ON_USER_LOGIN";
        Object object2 = this.a;
        String string4 = "getGUIDForIdentifier:[Key:";
        if (string2 != null) {
            CharSequence charSequence2 = this.d.b((String)object, string2);
            String string5 = "_";
            String string6 = n1.a(string2, string5, (String)charSequence2);
            JSONObject jSONObject = this.b();
            string6 = jSONObject.getString(string6);
            Object object3 = new StringBuilder(string4);
            ((StringBuilder)object3).append(string2);
            ((StringBuilder)object3).append(string3);
            ((StringBuilder)object3).append(string6);
            String string7 = "]";
            ((StringBuilder)object3).append(string7);
            object3 = ((StringBuilder)object3).toString();
            try {
                ((CleverTapInstanceConfig)object2).e((String)charSequence, (String)object3);
                return string6;
            }
            catch (Throwable throwable) {
                object3 = ((CleverTapInstanceConfig)object2).b();
                string7 = ((CleverTapInstanceConfig)object2).a;
                String string8 = "Error reading guid cache: ";
                StringBuilder stringBuilder = new StringBuilder(string8);
                stringBuilder.append(throwable);
                String string9 = stringBuilder.toString();
                ((b)object3).b(string7, string9);
                boolean bl2 = Objects.equals(charSequence2, object);
                if (bl2) {
                    return null;
                }
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append(string2);
                ((StringBuilder)charSequence2).append(string5);
                ((StringBuilder)charSequence2).append((String)object);
                object = ((StringBuilder)charSequence2).toString();
                object = jSONObject.getString((String)object);
                charSequence2 = new StringBuilder(string4);
                ((StringBuilder)charSequence2).append(string2);
                ((StringBuilder)charSequence2).append(string3);
                ((StringBuilder)charSequence2).append((String)object);
                string2 = "] after retry";
                ((StringBuilder)charSequence2).append(string2);
                string2 = ((StringBuilder)charSequence2).toString();
                try {
                    ((CleverTapInstanceConfig)object2).e((String)charSequence, string2);
                    return object;
                }
                catch (Throwable throwable2) {
                    object = ((CleverTapInstanceConfig)object2).b();
                    string3 = ((CleverTapInstanceConfig)object2).a;
                    object2 = "Error reading guid cache after retry: ";
                    charSequence = new StringBuilder((String)object2);
                    ((StringBuilder)charSequence).append(throwable2);
                    String string10 = ((StringBuilder)charSequence).toString();
                    ((b)object).b(string3, string10);
                }
            }
        }
        return null;
    }

    public final boolean d() {
        boolean bl2 = this.c.j();
        CharSequence charSequence = new StringBuilder("isErrorDeviceId:[");
        charSequence.append(bl2);
        charSequence.append("]");
        charSequence = charSequence.toString();
        this.a.e("ON_USER_LOGIN", (String)charSequence);
        return bl2;
    }

    public final void e() {
        Object object = this.a;
        Object object2 = this.b;
        Object object3 = "cachedGUIDsKey";
        object3 = gc3_0.l((CleverTapInstanceConfig)object, (String)object3);
        object2 = gc3_0.e(object2);
        object2 = object2.edit();
        object2 = object2.remove((String)object3);
        gc3_0.i((SharedPreferences.Editor)object2);
        object2 = "ON_USER_LOGIN";
        object3 = "removeCachedGUIDs:[]";
        try {
            ((CleverTapInstanceConfig)object).e((String)object2, (String)object3);
        }
        catch (Throwable throwable) {
            object3 = ((CleverTapInstanceConfig)object).b();
            object = ((CleverTapInstanceConfig)object).a;
            String string2 = "Error removing guid cache: ";
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(throwable);
            String string3 = stringBuilder.toString();
            ((b)object3).b((String)object, string3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(String string2, String object) {
        int n3;
        Iterator iterator;
        Object object2;
        block5: {
            boolean bl2 = this.d();
            if (bl2) return;
            if (string2 == null) return;
            if (object == null) {
                return;
            }
            object2 = this.b();
            try {
                iterator = object2.keys();
                break block5;
            }
            catch (Throwable throwable) {}
            object = this.a;
            object2 = ((CleverTapInstanceConfig)object).b();
            object = ((CleverTapInstanceConfig)object).a;
            String string3 = "Error removing cached key: ";
            StringBuilder stringBuilder = new StringBuilder(string3);
            stringBuilder.append(throwable);
            String string4 = stringBuilder.toString();
            ((b)object2).b((String)object, string4);
            return;
        }
        while ((n3 = iterator.hasNext()) != 0) {
            String string5;
            Object object3 = iterator.next();
            String string6 = ((String)(object3 = (String)object3)).toLowerCase();
            boolean bl3 = string6.contains(string5 = ((String)object).toLowerCase());
            if (!bl3 || !(bl3 = (string6 = object2.getString((String)object3)).equals(string2))) continue;
            object2.remove((String)object3);
            n3 = object2.length();
            if (n3 == 0) {
                this.e();
                continue;
            }
            this.g((JSONObject)object2);
        }
    }

    public final void g(JSONObject object) {
        Object object2 = this.a;
        Object object3 = "setCachedGUIDs:[";
        object = object.toString();
        Object object4 = this.b;
        CharSequence charSequence = "cachedGUIDsKey";
        charSequence = gc3_0.l((CleverTapInstanceConfig)object2, (String)charSequence);
        gc3_0.k((Context)object4, (String)charSequence, (String)object);
        object4 = "ON_USER_LOGIN";
        charSequence = new StringBuilder((String)object3);
        ((StringBuilder)charSequence).append((String)object);
        object = "]";
        ((StringBuilder)charSequence).append((String)object);
        object = ((StringBuilder)charSequence).toString();
        try {
            ((CleverTapInstanceConfig)object2).e((String)object4, (String)object);
        }
        catch (Throwable throwable) {
            object3 = ((CleverTapInstanceConfig)object2).b();
            object2 = ((CleverTapInstanceConfig)object2).a;
            charSequence = "Error persisting guid cache: ";
            object4 = new StringBuilder((String)charSequence);
            ((StringBuilder)object4).append(throwable);
            String string2 = ((StringBuilder)object4).toString();
            ((b)object3).b((String)object2, string2);
        }
    }
}

