/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.clevertap.android.sdk.a$a;
import com.clevertap.android.sdk.b;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;

/*
 * Renamed from fJ0
 */
public final class fj0_1
implements cc1_1 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Bundle a(RemoteMessage object) {
        try {
            Bundle bundle = new Bundle();
            object = ((RemoteMessage)object).getData();
            object = object.entrySet();
            object = object.iterator();
            while (true) {
                boolean bl2;
                if (!(bl2 = object.hasNext())) {
                    object = xb2_0.a;
                    b.d();
                    return bundle;
                }
                Object object2 = object.next();
                object2 = (Map.Entry)object2;
                Object object3 = object2.getKey();
                object3 = (String)object3;
                object2 = object2.getValue();
                object2 = (String)object2;
                bundle.putString(object3, object2);
            }
        }
        catch (Throwable throwable) {
            object = xb2_0.a;
            a$a.INFO.intValue();
            return null;
        }
    }
}

