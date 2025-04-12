/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONObject
 */
import android.content.Context;
import com.facebook.appevents.b;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class eo {
    public static final HashMap a;

    static {
        Pair[] pairArray = eo$a.MOBILE_INSTALL_EVENT;
        Pair pair = new Pair(pairArray, "MOBILE_APP_INSTALL");
        pairArray = eo$a.CUSTOM_APP_EVENTS;
        Pair pair2 = new Pair(pairArray, "CUSTOM_APP_EVENTS");
        pairArray = new Pair[]{pair, pair2};
        a = fh1_2.h(pairArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final JSONObject a(eo$a object, zq_0 object2, String objectArray, boolean bl2, Context context) {
        Object object3;
        int n3;
        JSONObject jSONObject;
        block7: {
            Intrinsics.checkNotNullParameter(object, "activityType");
            Intrinsics.checkNotNullParameter(context, "context");
            jSONObject = new JSONObject();
            object = a.get(object);
            Object object4 = "event";
            jSONObject.put((String)object4, object);
            boolean bl3 = b.d;
            if (!bl3) {
                object = b.a;
                object.getClass();
                b.a();
            }
            object = b.b;
            object4 = ((ReentrantReadWriteLock)object).readLock();
            ((ReentrantReadWriteLock.ReadLock)object4).lock();
            try {
                object4 = b.c;
                object = ((ReentrantReadWriteLock)object).readLock();
                ((ReentrantReadWriteLock.ReadLock)object).unlock();
                if (object4 == null) break block7;
                object = "app_user_id";
            }
            catch (Throwable throwable) {
                b.b.readLock().unlock();
                throw throwable;
            }
            jSONObject.put((String)object, object4);
        }
        lz3_0.M(jSONObject, (zq_0)object2, (String)objectArray, bl2, context);
        try {
            lz3_0.N(context, jSONObject);
        }
        catch (Exception exception) {
            object2 = sx1.d;
            object2 = Ax1.APP_EVENTS;
            object = ((Object)exception).toString();
            n3 = 1;
            objectArray = new Object[n3];
            bl2 = false;
            objectArray[0] = object;
            object = "AppEvents";
            object3 = "Fetching extended device info parameters failed: '%s'";
            sx1$a.b((Ax1)((Object)object2), (String)object, (String)object3, objectArray);
        }
        object = lz3_0.p();
        if (object != null) {
            object2 = object.keys();
            while ((n3 = object2.hasNext()) != 0) {
                objectArray = (String)object2.next();
                object3 = object.get((String)objectArray);
                jSONObject.put((String)objectArray, object3);
            }
        }
        object2 = context.getPackageName();
        jSONObject.put("application_package_name", object2);
        return jSONObject;
    }
}

