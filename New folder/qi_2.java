/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  org.json.JSONObject
 */
import android.content.Context;
import android.os.Build;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.task.a;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from QI
 */
public final class qi_2
implements I83 {
    public static final qi_2 b;
    public final /* synthetic */ int a;

    static {
        qi_2 qi_22;
        b = qi_22 = new qi_2(1);
    }

    public /* synthetic */ qi_2(int n3) {
        this.a = n3;
    }

    public static final boolean a(Context context) {
        boolean bl2;
        Object object = "<this>";
        Intrinsics.checkNotNullParameter(context, (String)object);
        try {
            object = new s52(context);
            bl2 = ((s52)object).a();
        }
        catch (Exception exception) {
            com.clevertap.android.sdk.b.c();
            bl2 = true;
        }
        return bl2;
    }

    public static final void c(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(jSONObject2, "other");
        Iterator iterator = jSONObject2.keys();
        String string2 = "other.keys()";
        Intrinsics.checkNotNullExpressionValue(iterator, string2);
        while (bl2 = iterator.hasNext()) {
            string2 = (String)iterator.next();
            Object object = jSONObject2.opt(string2);
            jSONObject.put(string2, object);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void d(Context object, com.clevertap.android.sdk.a a2, String string2, String string3) {
        Intrinsics.checkNotNullParameter(a2, "<this>");
        Intrinsics.checkNotNullParameter(string2, "logTag");
        Intrinsics.checkNotNullParameter(string3, "caller");
        Intrinsics.checkNotNullParameter(object, "context");
        a a3 = jh_1.a(a2.b.a).b();
        pi_1 pi_12 = new pi_1((Context)object, a2, string3, string2);
        object = a3.d(string2, pi_12);
        try {
            object.get();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static final boolean e(String string2) {
        boolean bl2;
        boolean bl3 = true;
        if (string2 != null && !(bl2 = kotlin.text.b.k(string2))) {
            bl2 = false;
            string2 = null;
        } else {
            bl2 = true;
        }
        return bl2 ^ bl3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean f(int n3, Context context) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(context, string2);
        int n4 = Build.VERSION.SDK_INT;
        if (n4 <= n3) return 0 != 0;
        Intrinsics.checkNotNullParameter(context, string2);
        context = context.getApplicationContext().getApplicationInfo();
        int n7 = context.targetSdkVersion;
        if (n7 <= n3) return 0 != 0;
        return 1 != 0;
    }

    public static final Pair g(String object, JSONObject object2) {
        Intrinsics.checkNotNullParameter(object2, "<this>");
        Object object3 = "key";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object = object2.optJSONArray((String)object);
        object2 = null;
        if (object == null) {
            object3 = Boolean.FALSE;
            object = new Pair(object3, null);
            return object;
        }
        int n3 = object.length();
        if (n3 >= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object3 = null;
        }
        object3 = n3 != 0;
        int n4 = object.length();
        if (n4 < 0) {
            object = null;
        }
        object2 = new Pair(object3, object);
        return object2;
    }

    public static final Pair h(String object, JSONObject object2) {
        Intrinsics.checkNotNullParameter(object2, "<this>");
        Object object3 = "key";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object = object2.optJSONArray((String)object);
        object2 = null;
        if (object == null) {
            object3 = Boolean.FALSE;
            object = new Pair(object3, null);
            return object;
        }
        int n3 = object.length();
        if (n3 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object3 = null;
        }
        object3 = n3 != 0;
        int n4 = object.length();
        if (n4 <= 0) {
            object = null;
        }
        object2 = new Pair(object3, object);
        return object2;
    }

    public boolean b(Object object, Object object2) {
        return Intrinsics.areEqual(object, object2);
    }

    public String toString() {
        int n3 = this.a;
        switch (n3) {
            default: {
                return super.toString();
            }
            case 1: 
        }
        return "StructuralEqualityPolicy";
    }
}

