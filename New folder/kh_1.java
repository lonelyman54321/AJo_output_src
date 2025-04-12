/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.task.PostAsyncSafelyExecutor;
import com.clevertap.android.sdk.task.a;
import java.util.HashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KH
 */
public final class kh_1 {
    public final fc1_1 a;
    public final dg1_1 b;
    public final dg1_1 c;
    public final CleverTapInstanceConfig d;
    public final String e;
    public final HashMap f;

    public kh_1() {
        Object object = new dg1_1();
        this.b = object;
        this.c = object;
        object = new HashMap();
        this.f = object;
        this.d = null;
        this.a = object = new fc1_1();
        object = String.valueOf(System.currentTimeMillis());
        Intrinsics.checkNotNullExpressionValue(object, "valueOf(System.currentTimeMillis())");
        this.e = object = (String)lx3.c.invoke(object);
    }

    public kh_1(CleverTapInstanceConfig object) {
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        this.c = hashMap;
        this.f = hashMap = new HashMap();
        this.d = object;
        this.a = object = new fc1_1();
    }

    public final a a() {
        dg1_1 dg1_12 = this.c;
        fc1_1 fc1_12 = this.a;
        return this.d(fc1_12, dg1_12, "ioTask");
    }

    public final a b() {
        Object object = this.d;
        object = object != null ? ((CleverTapInstanceConfig)object).a : this.e;
        return this.c((String)object);
    }

    public final a c(String object) {
        if (object != null) {
            HashMap hashMap = this.f;
            PostAsyncSafelyExecutor postAsyncSafelyExecutor = (PostAsyncSafelyExecutor)hashMap.get(object);
            if (postAsyncSafelyExecutor == null) {
                postAsyncSafelyExecutor = new PostAsyncSafelyExecutor();
                hashMap.put(object, postAsyncSafelyExecutor);
            }
            object = this.c;
            return this.d(postAsyncSafelyExecutor, (Executor)object, "PostAsyncSafely");
        }
        object = new IllegalArgumentException("Tag can't be null");
        throw object;
    }

    public final a d(Executor object, Executor object2, String string2) {
        if (object != null && object2 != null) {
            CleverTapInstanceConfig cleverTapInstanceConfig = this.d;
            a a2 = new a(cleverTapInstanceConfig, (Executor)object, (Executor)object2, string2);
            return a2;
        }
        object2 = cP.a("Can't create task ", string2, " with null executors");
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

