/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 */
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.LocalDataStore;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.task.a;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/*
 * Renamed from Gp0
 */
public final class gp0_0
implements e92 {
    public final /* synthetic */ mp0_0 a;

    public gp0_0(mp0_0 mp0_02) {
        this.a = mp0_02;
    }

    public final void onSuccess(Object object) {
        object = (String)object;
        Iterator iterator = this.a;
        Object object2 = ((mp0_0)((Object)iterator)).d.b();
        Object object3 = new StringBuilder();
        Object object4 = ((mp0_0)((Object)iterator)).d;
        Object object5 = ((CleverTapInstanceConfig)object4).a;
        String string2 = ":async_deviceID";
        object3 = h30_0.a((StringBuilder)object3, (String)object5, string2);
        object5 = new StringBuilder("DeviceID initialized successfully!");
        Object object6 = Thread.currentThread();
        ((StringBuilder)object5).append(object6);
        object5 = ((StringBuilder)object5).toString();
        ((b)object2).b((String)object3, (String)object5);
        com.clevertap.android.sdk.a a2 = com.clevertap.android.sdk.a.k(((mp0_0)((Object)iterator)).e, (CleverTapInstanceConfig)object4);
        iterator = a2.b;
        String string3 = ((H80)((Object)iterator)).a.a;
        object2 = ((H80)((Object)iterator)).j;
        if (object2 == null) {
            object = a2.f();
            iterator = new Iterator();
            ((StringBuilder)((Object)iterator)).append(string3);
            ((StringBuilder)((Object)iterator)).append(string2);
            iterator = ((StringBuilder)((Object)iterator)).toString();
            object2 = "ControllerManager not set yet! Returning from deviceIDCreated()";
            ((b)object).b((String)((Object)iterator), (String)object2);
        } else {
            boolean bl2;
            boolean bl3;
            mv_0 mv_02;
            object3 = ((H80)((Object)iterator)).r;
            object5 = ((H80)((Object)iterator)).q;
            object4 = jd3_1.a.a();
            iterator = a2.b;
            Object object7 = ((H80)((Object)iterator)).l;
            iterator = ((H80)((Object)iterator)).d;
            object2 = a2.a;
            ((LocalDataStore)((Object)iterator)).e((Context)object2);
            a a3 = jh_1.a(a2.b.a).a();
            iterator = mv_02;
            object2 = a2;
            object6 = object;
            Object object8 = string3;
            mv_02 = new mv_0(a2, (kd3_0)object3, (jd3_1)object4, (ae0_1)object5, (String)object, string3, (yB0)object7);
            a3.c("initStores", mv_02);
            iterator = a2.b.j.a;
            if (iterator == null) {
                iterator = a2.f();
                object2 = Ft2.a(string3, string2);
                object3 = new StringBuilder("Initializing InAppFC after Device ID Created = ");
                ((StringBuilder)object3).append((String)object);
                object3 = ((StringBuilder)object3).toString();
                ((b)((Object)iterator)).b((String)object2, (String)object3);
                iterator = a2.b;
                object8 = ((H80)((Object)iterator)).j;
                object3 = ((H80)((Object)iterator)).a;
                object5 = ((H80)((Object)iterator)).r;
                object6 = ((H80)((Object)iterator)).m;
                object2 = a2.a;
                iterator = object7;
                object4 = object;
                ((l80_0)object8).a = object7 = new Gf1((Context)object2, (CleverTapInstanceConfig)object3, (String)object, (kd3_0)object5, (df1_1)object6);
            }
            if ((iterator = a2.b.j.d) != null && (bl3 = TextUtils.isEmpty((CharSequence)(object2 = ((nh_1)((Object)iterator)).b)))) {
                object2 = a2.f();
                object3 = Ft2.a(string3, string2);
                object5 = "Initializing Feature Flags after Device ID Created = ";
                object4 = new StringBuilder((String)object5);
                ((StringBuilder)object4).append((String)object);
                object4 = ((StringBuilder)object4).toString();
                ((b)object2).b((String)object3, (String)object4);
                bl3 = ((nh_1)((Object)iterator)).c;
                if (!bl3) {
                    ((nh_1)((Object)iterator)).b = object;
                    ((nh_1)((Object)iterator)).c();
                }
            }
            if ((iterator = a2.b.j.g) != null) {
                object2 = ((ai_0)((Object)iterator)).h;
                object3 = ((cA2)object2).b;
                bl2 = TextUtils.isEmpty((CharSequence)object3);
                if (bl2) {
                    object3 = a2.f();
                    object4 = Ft2.a(string3, string2);
                    object6 = "Initializing Product Config after Device ID Created = ";
                    object5 = new StringBuilder((String)object6);
                    ((StringBuilder)object5).append((String)object);
                    object5 = ((StringBuilder)object5).toString();
                    ((b)object3).b((String)object4, (String)object5);
                    object3 = ((ai_0)((Object)iterator)).c;
                    bl2 = ((AtomicBoolean)object3).get();
                    if (!bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)object))) {
                        ((cA2)object2).b = object;
                        ((ai_0)((Object)iterator)).f();
                    }
                }
            }
            iterator = a2.f();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(string3);
            ((StringBuilder)object2).append(string2);
            object2 = ((StringBuilder)object2).toString();
            object3 = "Got device id from DeviceInfo, notifying user profile initialized to SyncListener";
            ((b)((Object)iterator)).b((String)object2, (String)object3);
            iterator = (ck_1)a2.b.i;
            if (object != null) {
                iterator.getClass();
            } else {
                iterator = ((ck_1)((Object)iterator)).d;
                ((mp0_0)((Object)iterator)).f();
            }
            iterator = (ck_1)a2.b.i;
            iterator.getClass();
            object3 = Looper.getMainLooper();
            object2 = new Handler((Looper)object3);
            iterator = ((ck_1)((Object)iterator)).f.iterator();
            while (bl2 = iterator.hasNext()) {
                object3 = (e82_0)iterator.next();
                object4 = new ak_1((e82_0)object3, (String)object);
                object2.post((Runnable)object4);
            }
        }
    }
}

