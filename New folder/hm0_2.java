/*
 * Decompiled with CFR 0.152.
 */
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hM0
 */
public abstract class hm0_2 {
    public static final vn1_2 a;

    static {
        Object object = "java.nio.file.Files";
        Class.forName((String)object);
        try {
            object = new vn1_2();
        }
        catch (ClassNotFoundException classNotFoundException) {
            object = new vn1_2();
        }
        a = object;
        object = hn2_2.b;
        object = System.getProperty("java.io.tmpdir");
        Intrinsics.checkNotNullExpressionValue(object, "getProperty(...)");
        hn2$a.a((String)object, false);
        ClassLoader classLoader = gk2_2.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
        object = new gk2_2(classLoader);
    }

    public abstract y63_0 a(hn2_2 var1);

    public abstract void b(hn2_2 var1, hn2_2 var2);

    public abstract void c(hn2_2 var1);

    public abstract void d(hn2_2 var1);

    public final void e(hn2_2 hn2_22) {
        Intrinsics.checkNotNullParameter(hn2_22, "path");
        this.d(hn2_22);
    }

    public final boolean f(hn2_2 object) {
        boolean bl2;
        String string2 = "path";
        Intrinsics.checkNotNullParameter(object, string2);
        String string3 = "<this>";
        Intrinsics.checkNotNullParameter(this, string3);
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.i((hn2_2)object);
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public abstract List g(hn2_2 var1);

    public final hl0_1 h(hn2_2 object) {
        Object object2 = "path";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        CharSequence charSequence = "<this>";
        Intrinsics.checkNotNullParameter(this, (String)charSequence);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = this.i((hn2_2)object);
        if (object2 != null) {
            return object2;
        }
        charSequence = new StringBuilder("no such file: ");
        ((StringBuilder)charSequence).append(object);
        object = ((StringBuilder)charSequence).toString();
        object2 = new FileNotFoundException((String)object);
        throw object2;
    }

    public abstract hl0_1 i(hn2_2 var1);

    public abstract ul0_1 j(hn2_2 var1);

    public abstract y63_0 k(hn2_2 var1);

    public abstract a93_0 l(hn2_2 var1);
}

