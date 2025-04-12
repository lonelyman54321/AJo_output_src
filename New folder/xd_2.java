/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.content.pm.ResolveInfo
 */
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.ril.ajio.AJIOApplication;
import java.util.Collections;

/*
 * Renamed from XD
 */
public final class xd_2 {
    public static void a(AJIOApplication object, Intent object2) {
        Object object3 = object.getPackageManager();
        int n3 = 0;
        Object object4 = null;
        if ((object3 = object3.queryBroadcastReceivers(object2, 0)) == null) {
            object3 = Collections.emptyList();
        }
        n3 = object3.size();
        if (n3 != 0) {
            object3 = object3.iterator();
            while ((n3 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                object4 = (ResolveInfo)object3.next();
                Intent intent = new Intent(object2);
                if (object4 == null) continue;
                object4 = object4.resolvePackageName;
                intent.setPackage((String)object4);
                object.sendBroadcast(intent);
            }
            return;
        }
        object3 = new StringBuilder("unable to resolve intent: ");
        object2 = object2.toString();
        ((StringBuilder)object3).append((String)object2);
        object2 = ((StringBuilder)object3).toString();
        object = new Exception((String)object2);
        throw object;
    }
}

