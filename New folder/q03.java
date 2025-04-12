/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.StringCompanionObject;

public final class q03 {
    public static final /* synthetic */ int a;

    public static final String a() {
        int n3 = 1;
        Object[] objectArray = StringCompanionObject.INSTANCE;
        objectArray = new Object[n3];
        String string2 = FacebookSdk.t;
        objectArray[0] = string2;
        return xh2_0.a(objectArray, n3, "m.%s", "format(format, *args)");
    }

    public static final String b() {
        Object object = StringCompanionObject.INSTANCE;
        object = FacebookSdk.f();
        int n3 = 1;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        return xh2_0.a(objectArray, n3, "https://graph.%s", "format(format, *args)");
    }

    public static final String c() {
        int n3 = 1;
        Object[] objectArray = StringCompanionObject.INSTANCE;
        objectArray = new Object[n3];
        String string2 = FacebookSdk.s;
        objectArray[0] = string2;
        return xh2_0.a(objectArray, n3, "m.%s", "format(format, *args)");
    }
}

