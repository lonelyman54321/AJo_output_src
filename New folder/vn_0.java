/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookSdk;
import java.util.HashMap;

/*
 * Renamed from Vn
 */
public final class vn_0 {
    public static final vn_0 a;
    public static final String b;
    public static boolean c;

    static {
        vn_0 vn_02;
        a = vn_02 = new vn_0();
        b = vn_0.class.getCanonicalName();
    }

    public static void a(HashMap hashMap) {
        Object object = FacebookSdk.a();
        Object object2 = "com.facebook.sdk.CloudBridgeSavedCredentials";
        int n3 = 0;
        if ((object = object.getSharedPreferences((String)object2, 0)) == null) {
            return;
        }
        object2 = S03.DATASETID;
        String string2 = ((S03)((Object)object2)).getRawValue();
        string2 = hashMap.get(string2);
        Object object3 = S03.URL;
        String string3 = object3.getRawValue();
        string3 = hashMap.get(string3);
        Object[] objectArray = S03.ACCESSKEY;
        String string4 = objectArray.getRawValue();
        hashMap = hashMap.get(string4);
        if (string2 != null && string3 != null && hashMap != null) {
            object = object.edit();
            object2 = ((S03)((Object)object2)).getRawValue();
            string4 = string2.toString();
            object.putString((String)object2, string4);
            object2 = object3.getRawValue();
            object3 = string3.toString();
            object.putString((String)object2, (String)object3);
            object2 = objectArray.getRawValue();
            object3 = ((Object)hashMap).toString();
            object.putString((String)object2, (String)object3);
            object.apply();
            object = sx1.d;
            object = Ax1.APP_EVENTS;
            object2 = b.toString();
            object3 = " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ";
            int n4 = 3;
            objectArray = new Object[n4];
            objectArray[0] = string2;
            objectArray[1] = string3;
            n3 = 2;
            objectArray[n3] = hashMap;
            sx1$a.b((Ax1)((Object)object), (String)object2, (String)object3, objectArray);
        }
    }
}

