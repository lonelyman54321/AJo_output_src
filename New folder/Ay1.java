/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.task.a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public final class Ay1
implements Callable {
    public final /* synthetic */ Map a;
    public final /* synthetic */ By1 b;

    public Ay1(By1 by1, HashMap hashMap) {
        this.b = by1;
        this.a = hashMap;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        int n3;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Map map2;
        CleverTapInstanceConfig cleverTapInstanceConfig;
        Object object5;
        Object object6;
        block17: {
            block18: {
                int n4;
                Object object7;
                String string2;
                String string3;
                boolean bl2;
                boolean bl3;
                object6 = this.b;
                object5 = ((By1)object6).k;
                cleverTapInstanceConfig = ((By1)object6).f;
                map2 = this.a;
                if (map2 == null) {
                    return null;
                }
                try {
                    boolean bl4;
                    object4 = ((mp0_0)object5).f();
                    if (object4 == null) {
                        return null;
                    }
                    object3 = ((By1)object6).g;
                    object2 = ((By1)object6).p;
                    object = new iz1((Context)object3, cleverTapInstanceConfig, (mp0_0)object5, (ae0_1)object2);
                    object2 = ((By1)object6).o;
                    object3 = bf0_0.b((Context)object3, cleverTapInstanceConfig, (mp0_0)object5, (ea3_1)object2);
                    object2 = map2.keySet();
                    object2 = object2.iterator();
                    bl3 = false;
                    bl2 = false;
                    string3 = null;
                    while (bl4 = object2.hasNext()) {
                        Object e2 = object2.next();
                        string2 = (String)e2;
                        object7 = map2.get(string2);
                        n4 = object3.a(string2);
                        if (n4 == 0) continue;
                        if (object7 == null) break block15;
                    }
                }
                catch (Throwable throwable) {
                    object6 = cleverTapInstanceConfig.b();
                    object6.getClass();
                    com.clevertap.android.sdk.b.m();
                    return null;
                }
                {
                    block16: {
                        block15: {
                            try {
                                object7 = object7.toString();
                                break block16;
                            }
                            catch (Throwable throwable) {
                                continue;
                            }
                        }
                        object7 = null;
                    }
                    if (object7 == null || (n4 = ((String)object7).length()) <= 0) continue;
                    try {
                        ((By1)object6).a = string3 = ((iz1)object).c(string2, (String)object7);
                        if (string3 != null) {
                            bl2 = true;
                            break;
                        }
                    }
                    catch (Throwable throwable) {}
                    bl2 = true;
                    continue;
                }
                n3 = ((mp0_0)object5).j();
                object3 = cleverTapInstanceConfig.a;
                object2 = ((By1)object6).b;
                if (n3 != 0) break block17;
                if (!bl2) break block18;
                object5 = ((iz1)object).b();
                n3 = object5.length();
                if (n3 <= 0) {
                    bl3 = true;
                }
                string3 = "isAnonymousDevice:[";
                object5 = new StringBuilder(string3);
                ((StringBuilder)object5).append(bl3);
                string3 = "]";
                ((StringBuilder)object5).append(string3);
                object5 = ((StringBuilder)object5).toString();
                object = ((iz1)object).a;
                string3 = "ON_USER_LOGIN";
                ((CleverTapInstanceConfig)object).e(string3, (String)object5);
                if (!bl3) break block17;
            }
            object6 = cleverTapInstanceConfig.b();
            object5 = "onUserLogin: no identifier provided or device is anonymous, pushing on current user profile";
            object6.getClass();
            com.clevertap.android.sdk.b.f((String)object5);
            map2 = (HashMap)map2;
            ((we)object2).d0((HashMap)map2);
            return null;
        }
        if ((object5 = ((By1)object6).a) != null && (n3 = (int)(((String)object5).equals(object4) ? 1 : 0)) != 0) {
            object6 = cleverTapInstanceConfig.b();
            object5 = new StringBuilder();
            object = "onUserLogin: ";
            ((StringBuilder)object5).append((String)object);
            object = map2.toString();
            ((StringBuilder)object5).append((String)object);
            object = " maps to current device id ";
            ((StringBuilder)object5).append((String)object);
            ((StringBuilder)object5).append((String)object4);
            object4 = " pushing on current profile";
            ((StringBuilder)object5).append((String)object4);
            object5 = ((StringBuilder)object5).toString();
            object6.getClass();
            com.clevertap.android.sdk.b.f((String)object5);
            map2 = (HashMap)map2;
            ((we)object2).d0((HashMap)map2);
            return null;
        }
        object5 = cleverTapInstanceConfig.b();
        object4 = new StringBuilder();
        object = "onUserLogin: queuing reset profile for ";
        ((StringBuilder)object4).append((String)object);
        ((StringBuilder)object4).append(map2);
        object = " with Cached GUID ";
        ((StringBuilder)object4).append((String)object);
        object = ((By1)object6).a;
        if (object == null) {
            object = "NULL";
        }
        ((StringBuilder)object4).append((String)object);
        object4 = ((StringBuilder)object4).toString();
        ((b)object5).b((String)object3, (String)object4);
        object5 = ((By1)object6).a;
        map2 = (HashMap)map2;
        object4 = jh_1.a(cleverTapInstanceConfig);
        object4 = ((kh_1)object4).b();
        object = new zy1((By1)object6, (HashMap)map2, (String)object5);
        object6 = "resetProfile";
        ((a)object4).c((String)object6, (Callable)object);
        return null;
    }
}

