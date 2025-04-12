/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONObject
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.a;
import com.clevertap.android.sdk.a$a;
import com.clevertap.android.sdk.b;
import java.util.Objects;
import org.json.JSONObject;

/*
 * Renamed from WK0
 */
public final class wk0_1
extends zV {
    public final CleverTapInstanceConfig b;
    public final l80_0 c;
    public final tf_0 d;

    public wk0_1(ck_1 ck_12, l80_0 l80_02, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.b = cleverTapInstanceConfig;
        this.c = l80_02;
        this.d = ck_12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Context object, JSONObject object2, String object3) {
        object3 = this.d;
        l80_0 l80_02 = this.c;
        com.clevertap.android.sdk.b.d();
        Objects.toString(object2);
        Objects.toString(object);
        com.clevertap.android.sdk.b.d();
        object = this.b;
        int n3 = ((CleverTapInstanceConfig)object).h;
        if (n3 != 0) {
            com.clevertap.android.sdk.b.d();
            return;
        }
        if (object2 == null) {
            com.clevertap.android.sdk.b.d();
            return;
        }
        object = "vars";
        boolean bl2 = object2.has((String)object);
        if (!bl2) {
            com.clevertap.android.sdk.b.d();
            return;
        }
        try {
            com.clevertap.android.sdk.b.d();
            object = object2.getJSONObject((String)object);
            object2 = l80_02.n;
            if (object2 != null) {
                object3.getClass();
                object2 = l80_02.n;
                ((ki_1)object2).a((JSONObject)object);
                return;
            }
            com.clevertap.android.sdk.b.d();
            return;
        }
        catch (Throwable throwable) {
            n3 = com.clevertap.android.sdk.a.c;
            object = a$a.INFO;
            ((a$a)((Object)object)).intValue();
        }
    }
}

