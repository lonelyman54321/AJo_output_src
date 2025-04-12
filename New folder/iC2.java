/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.NotificationManager
 *  android.content.Context
 *  android.os.Bundle
 */
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.a;
import java.util.HashMap;
import java.util.Objects;

public final class iC2
implements n2_0 {
    public final boolean a(Context context, Bundle object, int n3) {
        Object object2;
        int n4;
        Object object3 = object.getString("actionId");
        String string2 = object.getString("pt_dismiss_on_click");
        HashMap<String, String> hashMap = (CleverTapInstanceConfig)object.getParcelable("config");
        if (string2 != null && (n4 = string2.equalsIgnoreCase((String)(object2 = "true"))) != 0) {
            boolean bl2;
            n4 = 1;
            if (object3 != null && (bl2 = ((String)object3).contains((CharSequence)(object2 = "remind")))) {
                boolean bl3;
                boolean bl4;
                object3 = hashMap != null ? a.k(context, (CleverTapInstanceConfig)((Object)hashMap)) : a.g(context);
                hashMap = new HashMap<String, String>();
                object2 = object.keySet().iterator();
                while (bl4 = object2.hasNext()) {
                    String string3;
                    String string4 = (String)object2.next();
                    boolean bl5 = string4.contains(string3 = "pt_event_property");
                    if (!bl5) continue;
                    string3 = object.getString(string4);
                    if (string3 != null && !(bl5 = (string3 = object.getString(string4)).isEmpty())) {
                        string3 = "pt_event_property_";
                        boolean bl6 = string4.contains(string3);
                        if (bl6) {
                            string3 = string4.split(string3)[n4];
                            string4 = object.getString(string4);
                            hashMap.put(string3, string4);
                            continue;
                        }
                        ak2_1.b();
                        continue;
                    }
                    string3 = "Property Key is Empty. Skipping Property: ";
                    string3.concat(string4);
                    ak2_1.b();
                }
                if ((object = xz3_0.j((Bundle)object)) != null && !(bl3 = ((String)object).isEmpty())) {
                    if (object3 != null) {
                        ((a)object3).p((String)object, hashMap);
                    } else {
                        ak2_1.a();
                    }
                }
            }
            ((NotificationManager)context.getSystemService("notification")).cancel(n3);
            return n4 != 0;
        }
        return false;
    }

    public final boolean b(Context context, String object, Bundle bundle) {
        ak2_1.a();
        object = new uj3_1(context, bundle);
        Object object2 = zb2_0.a(bundle);
        object2 = a.h(context, (String)object2);
        Objects.requireNonNull(object2);
        try {
            ((a)object2).r((ec1_1)object, context, bundle);
        }
        catch (Throwable throwable) {
            ak2_1.c();
        }
        return true;
    }
}

