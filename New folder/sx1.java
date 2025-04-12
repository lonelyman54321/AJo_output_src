/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookSdk;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class sx1 {
    public static final sx1$a d;
    public static final HashMap e;
    public final Ax1 a;
    public final String b;
    public StringBuilder c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        e = hashMap = new HashMap();
    }

    public sx1(Ax1 object) {
        Intrinsics.checkNotNullParameter(object, "behavior");
        String string2 = "Request";
        String string3 = "tag";
        Intrinsics.checkNotNullParameter(string2, string3);
        this.a = object;
        Xz3.g(string2, string3);
        this.b = "FacebookSDK.Request";
        this.c = object;
    }

    public final void a(Object object, String string2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(object, "value");
        Object[] objectArray = new Object[]{string2, object};
        Intrinsics.checkNotNullParameter("  %s:\t%s\n", "format");
        Intrinsics.checkNotNullParameter(objectArray, "args");
        this.c();
    }

    public final void b() {
        CharSequence charSequence = this.c.toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "contents.toString()");
        Intrinsics.checkNotNullParameter(charSequence, "string");
        String string2 = this.b;
        sx1$a.c(this.a, string2, charSequence);
        charSequence = new StringBuilder();
        this.c = charSequence;
    }

    public final void c() {
        FacebookSdk.i(this.a);
    }
}

