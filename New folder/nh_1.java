/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.task.a;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/*
 * Renamed from NH
 */
public final class nh_1 {
    public final CleverTapInstanceConfig a;
    public String b;
    public boolean c = false;
    public final i0_0 d;
    public final tf_0 e;
    public final lm0_1 f;
    public final Map g;

    public nh_1(String string2, CleverTapInstanceConfig cleverTapInstanceConfig, ck_1 ck_12, i0_0 i0_02, lm0_1 lm0_12) {
        Map map2 = new Map();
        this.g = map2 = Collections.synchronizedMap(map2);
        this.b = string2;
        this.a = cleverTapInstanceConfig;
        this.e = ck_12;
        this.d = i0_02;
        this.f = lm0_12;
        this.c();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(JSONObject object) {
        String string2 = "ArchiveData failed - ";
        Object object2 = "Feature flags saved into file-[";
        synchronized (this) {
            if (object != null) {
                try {
                    try {
                        Object object3 = this.f;
                        Object object4 = "Feature_Flag_";
                        CharSequence charSequence = new StringBuilder((String)object4);
                        object4 = this.a;
                        object4 = ((CleverTapInstanceConfig)object4).a;
                        ((StringBuilder)charSequence).append((String)object4);
                        object4 = "_";
                        ((StringBuilder)charSequence).append((String)object4);
                        object4 = this.b;
                        ((StringBuilder)charSequence).append((String)object4);
                        charSequence = ((StringBuilder)charSequence).toString();
                        object4 = "ff_cache.json";
                        ((lm0_1)object3).c((String)charSequence, (String)object4, (JSONObject)object);
                        object = this.a;
                        object = ((CleverTapInstanceConfig)object).b();
                        object3 = this.b();
                        charSequence = new StringBuilder((String)object2);
                        object2 = new StringBuilder();
                        Object object5 = "Feature_Flag_";
                        object4 = new StringBuilder((String)object5);
                        object5 = this.a;
                        object5 = ((CleverTapInstanceConfig)object5).a;
                        ((StringBuilder)object4).append((String)object5);
                        object5 = "_";
                        ((StringBuilder)object4).append((String)object5);
                        object5 = this.b;
                        ((StringBuilder)object4).append((String)object5);
                        object4 = ((StringBuilder)object4).toString();
                        ((StringBuilder)object2).append((String)object4);
                        object4 = "/ff_cache.json";
                        ((StringBuilder)object2).append((String)object4);
                        object2 = ((StringBuilder)object2).toString();
                        ((StringBuilder)charSequence).append((String)object2);
                        object2 = "]";
                        ((StringBuilder)charSequence).append((String)object2);
                        object2 = this.g;
                        ((StringBuilder)charSequence).append(object2);
                        object2 = ((StringBuilder)charSequence).toString();
                        ((b)object).b((String)object3, (String)object2);
                    }
                    catch (Exception exception) {
                        object2 = this.a;
                        object2 = ((CleverTapInstanceConfig)object2).b();
                        String string3 = this.b();
                        StringBuilder stringBuilder = new StringBuilder(string2);
                        String string4 = exception.getLocalizedMessage();
                        stringBuilder.append(string4);
                        string4 = stringBuilder.toString();
                        ((b)object2).b(string3, string4);
                    }
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
            return;
        }
    }

    public final String b() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.a.a;
        return h30_0.a(stringBuilder, string2, "[Feature Flag]");
    }

    public final void c() {
        Object object = this.b;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            return;
        }
        object = jh_1.a(this.a).a();
        Object object2 = new NH$a(this);
        ((a)object).b((e92)object2);
        object2 = new NH$b(this);
        ((a)object).c("initFeatureFlags", (Callable)object2);
    }
}

