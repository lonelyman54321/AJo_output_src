/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.task.a;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class aA2
extends zV {
    public final CleverTapInstanceConfig b;
    public final E80 c;
    public final b d;
    public final l80_0 e;

    public aA2(CleverTapInstanceConfig object, E80 e80, l80_0 l80_02) {
        this.b = object;
        this.d = object = ((CleverTapInstanceConfig)object).b();
        this.c = e80;
        this.e = l80_02;
    }

    public final void a(Context object, JSONObject jSONObject, String string2) {
        object = this.b;
        string2 = object.a;
        b b2 = this.d;
        String string3 = "Processing Product Config response...";
        b2.b(string2, string3);
        boolean bl2 = object.h;
        if (bl2) {
            object = object.a;
            b2.b((String)object, "CleverTap instance is configured to analytics only, not processing Product Config response");
            return;
        }
        if (jSONObject == null) {
            object = object.a;
            b2.b((String)object, "Product Config : Can't parse Product Config Response, JSON response object is null");
            this.b();
            return;
        }
        string2 = "pc_notifs";
        boolean bl3 = jSONObject.has(string2);
        if (!bl3) {
            object = object.a;
            b2.b((String)object, "Product Config : JSON object doesn't contain the Product Config key");
            this.b();
            return;
        }
        object = object.a;
        string3 = "Product Config : Processing Product Config response";
        b2.b((String)object, string3);
        object = jSONObject.getJSONObject(string2);
        try {
            this.c((JSONObject)object);
        }
        catch (Throwable throwable) {
            this.b();
            com.clevertap.android.sdk.b.m();
        }
    }

    public final void b() {
        E80 e80 = this.c;
        boolean bl2 = e80.l;
        if (bl2) {
            Object object = this.e.g;
            if (object != null) {
                Object object2 = ((ai_0)object).f;
                boolean bl3 = true;
                ((AtomicBoolean)object2).compareAndSet(bl3, false);
                object = ((ai_0)object).e;
                object2 = ((CleverTapInstanceConfig)object).b();
                object = da2_0.a((CleverTapInstanceConfig)object);
                String string2 = "Fetch Failed";
                ((b)object2).b((String)object, string2);
            }
            e80.l = false;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void c(JSONObject object) {
        Object object2;
        Object object3 = object.getJSONArray("kv");
        if (object3 != null && (object3 = this.e.g) != null) {
            object2 = "Fetch file-[";
            String string2 = ((ai_0)object3).h.b;
            boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
            if (bl2) {
                return;
            }
            // MONITORENTER : object3
            bl2 = false;
            string2 = null;
            ((ai_0)object3).g((JSONObject)object);
            object = ((ai_0)object3).d;
            Object object4 = ((ai_0)object3).e();
            Object object5 = "activated.json";
            Map map2 = ((ai_0)object3).i;
            JSONObject jSONObject = new JSONObject(map2);
            ((lm0_1)object).c((String)object4, (String)object5, jSONObject);
            object = ((ai_0)object3).e;
            object = ((CleverTapInstanceConfig)object).b();
            object4 = ((ai_0)object3).e;
            object4 = da2_0.a((CleverTapInstanceConfig)object4);
            object5 = new StringBuilder((String)object2);
            object2 = ((ai_0)object3).d();
            ((StringBuilder)object5).append((String)object2);
            object2 = "] write success: ";
            ((StringBuilder)object5).append((String)object2);
            object2 = ((ai_0)object3).i;
            ((StringBuilder)object5).append(object2);
            object2 = ((StringBuilder)object5).toString();
            ((b)object).b((String)object4, (String)object2);
            object = ((ai_0)object3).e;
            object = jh_1.a((CleverTapInstanceConfig)object);
            object2 = ((kh_1)object).c;
            object4 = "Main";
            object5 = ((kh_1)object).b;
            object = ((kh_1)object).d((Executor)object5, (Executor)object2, (String)object4);
            object2 = "sendPCFetchSuccessCallback";
            object4 = new bi_0((ai_0)object3);
            ((a)object).c((String)object2, (Callable)object4);
            object = ((ai_0)object3).f;
            boolean bl3 = ((AtomicBoolean)object).getAndSet(false);
            if (!bl3) return;
            ((ai_0)object3).b();
            return;
        }
        this.b();
        return;
        {
            catch (Throwable throwable) {
                throw throwable;
            }
            catch (Exception exception) {}
            {
                object = ((ai_0)object3).e;
                object = ((CleverTapInstanceConfig)object).b();
                object2 = ((ai_0)object3).e;
                object2 = da2_0.a((CleverTapInstanceConfig)object2);
                String string3 = "Product Config: fetch Failed";
                ((b)object).b((String)object2, string3);
                object = AI$f.FETCHED;
                ((ai_0)object3).h((AI$f)((Object)object));
                object = ((ai_0)object3).f;
                boolean bl4 = true;
                ((AtomicBoolean)object).compareAndSet(bl4, false);
                // MONITOREXIT : object3
                return;
            }
        }
    }
}

