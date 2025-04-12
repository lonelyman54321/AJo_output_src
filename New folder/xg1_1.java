/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Renamed from xg1
 */
public final class xg1_1
extends zV {
    public final Object b;
    public final tf_0 c;
    public final CleverTapInstanceConfig d;
    public final b e;
    public final l80_0 f;

    public xg1_1(CleverTapInstanceConfig object, ti_0 ti_02, tf_0 tf_02, l80_0 l80_02) {
        this.d = object;
        this.c = tf_02;
        this.e = object = ((CleverTapInstanceConfig)object).b();
        this.b = object = ti_02.b;
        this.f = l80_02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(Context object, JSONObject object2, String object3) {
        Throwable throwable3;
        block10: {
            boolean bl2;
            block9: {
                object = this.d;
                boolean bl3 = ((CleverTapInstanceConfig)object).h;
                if (bl3) {
                    object2 = this.e;
                    object = ((CleverTapInstanceConfig)object).a;
                    ((b)object2).b((String)object, "CleverTap instance is configured to analytics only, not processing inbox messages");
                    return;
                }
                object3 = this.e;
                object = ((CleverTapInstanceConfig)object).a;
                Object object4 = "Inbox: Processing response";
                ((b)object3).b((String)object, (String)object4);
                object = "inbox_notifs";
                bl2 = object2.has((String)object);
                if (!bl2) {
                    object = this.e;
                    object2 = this.d.a;
                    ((b)object).b((String)object2, "Inbox: Response JSON object doesn't contain the inbox key");
                    return;
                }
                object = "inbox_notifs";
                try {
                    object = object2.getJSONArray((String)object);
                    object2 = this.b;
                    // MONITORENTER : object2
                }
                catch (Throwable throwable2) {}
                try {
                    object3 = this.f;
                    object4 = ((l80_0)object3).e;
                    if (object4 != null) break block9;
                    ((l80_0)object3).a();
                }
                catch (Throwable throwable3) {
                    break block10;
                }
            }
            object3 = this.f;
            object3 = ((l80_0)object3).e;
            if (object3 != null && (bl2 = ((oi_1)object3).f((JSONArray)object))) {
                object = this.c;
                object.getClass();
            }
            // MONITOREXIT : object2
            return;
        }
        // MONITOREXIT : object2
        throw throwable3;
        object = this.e;
        object2 = this.d.a;
        object.getClass();
        com.clevertap.android.sdk.b.m();
    }
}

