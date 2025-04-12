/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from JH
 */
public final class jh_1 {
    public static final Map a;

    static {
        HashMap hashMap = new HashMap();
        a = Collections.synchronizedMap(hashMap);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static kh_1 a(CleverTapInstanceConfig object) {
        if (object == null) {
            object = new IllegalArgumentException("Can't create task for null config");
            throw object;
        }
        Map map2 = a;
        Object object2 = ((CleverTapInstanceConfig)object).a;
        if ((object2 = (kh_1)map2.get(object2)) != null) return object2;
        Class<jh_1> clazz = jh_1.class;
        synchronized (clazz) {
            try {
                object2 = ((CleverTapInstanceConfig)object).a;
                object2 = map2.get(object2);
                object2 = (kh_1)object2;
                if (object2 != null) return object2;
                object2 = new kh_1((CleverTapInstanceConfig)object);
                object = ((CleverTapInstanceConfig)object).a;
                map2.put(object, object2);
                return object2;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

