/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.task.a;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from oI
 */
public final class oi_1 {
    public final mh0_0 a;
    public ArrayList b;
    public final Object c;
    public final String d;
    public final boolean e;
    public final ti_0 f;
    public final tf_0 g;
    public final CleverTapInstanceConfig h;

    public oi_1(CleverTapInstanceConfig cleverTapInstanceConfig, String object, mh0_0 mh0_02, ti_0 ti_02, tf_0 tf_02, boolean bl2) {
        Object object2;
        this.c = object2 = new Object();
        this.d = object;
        this.a = mh0_02;
        this.b = object = mh0_02.i((String)object);
        this.e = bl2;
        this.f = ti_02;
        this.g = tf_02;
        this.h = cleverTapInstanceConfig;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String string2) {
        Object object;
        Object object2 = this.c(string2);
        if (object2 == null) {
            return;
        }
        Object object3 = this.c;
        synchronized (object3) {
            object = this.b;
            ((ArrayList)object).remove(object2);
        }
        object2 = jh_1.a(this.h).b();
        object = new ni_2(this, string2);
        ((a)object2).c("RunDeleteMessage", (Callable)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean b(String string2) {
        boolean bl2;
        Object object = this.c(string2);
        if (object == null) {
            return false;
        }
        Object object2 = this.c;
        synchronized (object2) {
            ((ui_2)object).f = bl2 = true;
        }
        object = jh_1.a(this.h).b();
        object2 = new ki_2(this);
        ((a)object).b((e92)object2);
        object2 = new Object();
        ((a)object).a((li_2)object2);
        oI$a oI$a = new oI$a(this, string2);
        ((a)object).c("RunMarkMessageRead", oI$a);
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final ui_2 c(String string2) {
        boolean bl2;
        Object object = this.c;
        // MONITORENTER : object
        Object object2 = this.b;
        object2 = ((ArrayList)object2).iterator();
        while (bl2 = object2.hasNext()) {
            Object object3 = object2.next();
            object3 = (ui_2)object3;
            String string3 = ((ui_2)object3).d;
            boolean bl3 = string3.equals(string2);
            if (!bl3) continue;
            // MONITOREXIT : object
            return object3;
        }
        com.clevertap.android.sdk.b.j();
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList d() {
        Object object = this.c;
        synchronized (object) {
            this.e();
            return this.b;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        com.clevertap.android.sdk.b.j();
        Object object = new ArrayList();
        Object object2 = this.c;
        synchronized (object2) {
            boolean bl2;
            Object object3;
            try {
                object3 = this.b;
                object3 = ((ArrayList)object3).iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (bl2 = object3.hasNext()) {
                Object object4 = object3.next();
                object4 = (ui_2)object4;
                boolean bl3 = this.e;
                if (!bl3 && (bl3 = ((ui_2)object4).a())) {
                    com.clevertap.android.sdk.b.c();
                    ((ArrayList)object).add(object4);
                    continue;
                }
                long l2 = ((ui_2)object4).c;
                long l3 = 0L;
                long l4 = l2 - l3;
                Object object5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object5 <= 0) continue;
                l3 = System.currentTimeMillis();
                long l7 = 1000L;
                long l8 = (l3 /= l7) - l2;
                object5 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (object5 <= 0) continue;
                com.clevertap.android.sdk.b.j();
                ((ArrayList)object).add(object4);
            }
            int n3 = ((ArrayList)object).size();
            if (n3 <= 0) {
                return;
            }
            object = ((ArrayList)object).iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object3 = object.next();
                object3 = (ui_2)object3;
                object3 = ((ui_2)object3).d;
                this.a((String)object3);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean f(JSONArray object) {
        com.clevertap.android.sdk.b.j();
        Object object2 = new ArrayList();
        boolean bl2 = false;
        String string2 = null;
        int n3 = 0;
        while (true) {
            block6: {
                JSONException jSONException2;
                block8: {
                    Object object3;
                    block7: {
                        int n4;
                        if (n3 >= (n4 = object.length())) {
                            int n7 = ((ArrayList)object2).size();
                            if (n7 <= 0) return bl2;
                            this.a.o((ArrayList)object2);
                            com.clevertap.android.sdk.b.j();
                            object = this.c;
                            synchronized (object) {
                                object2 = this.a;
                                string2 = this.d;
                                this.b = object2 = ((mh0_0)object2).i(string2);
                                this.e();
                                return true;
                            }
                        }
                        try {
                            object3 = object.getJSONObject(n3);
                            String string3 = this.d;
                            object3 = ui_2.b(string3, (JSONObject)object3);
                            if (object3 == null) break block6;
                            boolean bl3 = this.e;
                            if (bl3 || !(bl3 = ((ui_2)object3).a())) break block7;
                            com.clevertap.android.sdk.b.c();
                            break block6;
                        }
                        catch (JSONException jSONException2) {
                            break block8;
                        }
                    }
                    ((ArrayList)object2).add(object3);
                    com.clevertap.android.sdk.b.j();
                    break block6;
                }
                jSONException2.getLocalizedMessage();
                com.clevertap.android.sdk.b.c();
            }
            ++n3;
        }
    }
}

