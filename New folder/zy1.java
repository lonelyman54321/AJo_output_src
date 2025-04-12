/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.LocalDataStore;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.events.EventQueueManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;

public final class zy1
implements Callable {
    public final /* synthetic */ Map a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ By1 d;

    public zy1(By1 by1, HashMap hashMap, String string2) {
        this.d = by1;
        this.a = hashMap;
        this.b = string2;
        this.c = null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        Object object;
        Object object2;
        block23: {
            boolean bl2;
            Object object3;
            Object object4;
            Object object5;
            object2 = "NULL and cleverTapID ";
            object = "asyncProfileSwitchUser:[profile ";
            try {
                boolean bl3;
                object5 = this.d;
                object5 = ((By1)object5).f;
                object5 = ((CleverTapInstanceConfig)object5).b();
                object4 = this.d;
                object4 = ((By1)object4).f;
                object4 = ((CleverTapInstanceConfig)object4).a;
                object3 = new StringBuilder((String)object);
                object = this.a;
                ((StringBuilder)object3).append(object);
                object = " with Cached GUID ";
                ((StringBuilder)object3).append((String)object);
                object = this.b;
                if (object != null) {
                    object2 = this.d;
                    object2 = ((By1)object2).a;
                } else {
                    object = new StringBuilder((String)object2);
                    object2 = this.c;
                    ((StringBuilder)object).append((String)object2);
                    object2 = ((StringBuilder)object).toString();
                }
                ((StringBuilder)object3).append((String)object2);
                object2 = ((StringBuilder)object3).toString();
                ((b)object5).b((String)object4, (String)object2);
                object2 = this.d;
                object2 = ((By1)object2).i;
                object = null;
                ((E80)object2).k(false);
                object2 = this.d;
                object2 = ((By1)object2).m;
                object5 = ((hC2)object2).a;
                object5 = ((ArrayList)object5).iterator();
                while (bl3 = object5.hasNext()) {
                    object4 = object5.next();
                    object4 = (XB2$a)((Object)object4);
                    ((hC2)object2).f(null, false, (XB2$a)((Object)object4));
                }
                object2 = this.d;
                object5 = ((By1)object2).c;
                object2 = ((By1)object2).g;
                object4 = FB0.REGULAR;
                object5 = (EventQueueManager)object5;
                ((EventQueueManager)object5).T((Context)object2, (FB0)((Object)object4), null);
                object2 = this.d;
                object5 = ((By1)object2).c;
                object2 = ((By1)object2).g;
                object4 = FB0.PUSH_NOTIFICATION_VIEWED;
                object5 = (EventQueueManager)object5;
                ((EventQueueManager)object5).T((Context)object2, (FB0)((Object)object4), null);
                object2 = this.d;
                object5 = ((By1)object2).j;
                object2 = ((By1)object2).g;
                ((Nh0)object5).a((Context)object2);
                bl2 = true;
                E80.w = bl2;
                object5 = this.d;
                object5 = ((By1)object5).n;
                ((x03)object5).Z();
                object5 = this.b;
                if (object5 != null) {
                    object4 = this.d;
                    object4 = ((By1)object4).k;
                    ((mp0_0)object4).b((String)object5);
                    object5 = this.d;
                    object5 = ((By1)object5).e;
                    object4 = this.b;
                    object5 = (ck_1)object5;
                    if (object4 != null) {
                        object5.getClass();
                    } else {
                        object5 = ((ck_1)object5).d;
                        ((mp0_0)object5).f();
                    }
                } else {
                    object5 = this.d;
                    object4 = ((By1)object5).f;
                    bl3 = ((CleverTapInstanceConfig)object4).n;
                    if (bl3) {
                        object5 = ((By1)object5).k;
                        ((mp0_0)object5).a();
                    } else {
                        object5 = ((By1)object5).k;
                        object5.getClass();
                        object3 = "__";
                        object4 = new StringBuilder((String)object3);
                        object3 = UUID.randomUUID();
                        object3 = ((UUID)object3).toString();
                        String string2 = "-";
                        String string3 = "";
                        object3 = ((String)object3).replace(string2, string3);
                        ((StringBuilder)object4).append((String)object3);
                        object4 = ((StringBuilder)object4).toString();
                        ((mp0_0)object5).b((String)object4);
                    }
                }
                object5 = this.d;
                object5 = ((By1)object5).l;
                object4 = ((LocalDataStore)object5).h;
                object4.clear();
                object4 = ((LocalDataStore)object5).a;
                synchronized (object4) {
                    object3 = ((LocalDataStore)object5).a;
                    ((HashMap)object3).clear();
                }
            }
            catch (Throwable throwable) {
                break block23;
            }
            {
                boolean bl4;
                object4 = ((LocalDataStore)object5).c;
                ((LocalDataStore)object5).e((Context)object4);
                object5 = this.d;
                object4 = ((By1)object5).e;
                object5 = ((By1)object5).k;
                object5 = ((mp0_0)object5).f();
                object4 = (ck_1)object4;
                if (object5 != null) {
                    object4.getClass();
                } else {
                    object5 = ((ck_1)object4).d;
                    ((mp0_0)object5).f();
                }
                object5 = this.d;
                object5 = ((By1)object5).k;
                ((mp0_0)object5).l();
                object5 = this.d;
                By1.a((By1)object5);
                object5 = this.d;
                object5 = ((By1)object5).b;
                object4 = ((we)object5).h;
                ((E80)object4).i(false);
                ((we)object5).W();
                object5 = this.a;
                if (object5 != null) {
                    object4 = this.d;
                    object4 = ((By1)object4).b;
                    object5 = (HashMap)object5;
                    ((we)object4).d0((HashMap)object5);
                }
                object5 = this.d;
                object5 = ((By1)object5).m;
                object4 = ((hC2)object5).a;
                object4 = ((ArrayList)object4).iterator();
                while (bl4 = object4.hasNext()) {
                    object3 = object4.next();
                    object3 = (XB2$a)((Object)object3);
                    ((hC2)object5).f(null, bl2, (XB2$a)((Object)object3));
                }
                object2 = this.d;
                By1.b((By1)object2);
                object2 = this.d;
                By1.c((By1)object2);
                object2 = this.d;
                By1.d((By1)object2);
                object2 = this.d;
                ((By1)object2).f();
                object2 = this.d;
                object5 = ((By1)object2).h;
                object5 = ((l80_0)object5).c;
                if (object5 != null) {
                    ((hh_1)object5).a();
                } else {
                    object2 = ((By1)object2).f;
                    object5 = ((CleverTapInstanceConfig)object2).b();
                    object4 = "DisplayUnit : Can't reset Display Units, DisplayUnitcontroller is null";
                    object2 = ((CleverTapInstanceConfig)object2).a;
                    ((b)object5).b((String)object2, (String)object4);
                }
                object2 = this.d;
                ((By1)object2).e();
                object2 = this.d;
                object5 = ((By1)object2).h;
                object5 = ((l80_0)object5).a;
                object2 = ((By1)object2).k;
                object2 = ((mp0_0)object2).f();
                object4 = ((Gf1)object5).e;
                object3 = ((df1_1)object4).d;
                ((LinkedHashMap)object3).clear();
                ((df1_1)object4).e = 0;
                ((Gf1)object5).d = object2;
                ((Gf1)object5).g((String)object2);
                return null;
            }
        }
        object2 = this.d.f.b();
        object = this.d.f.a;
        object2.getClass();
        com.clevertap.android.sdk.b.m();
        return null;
    }
}

