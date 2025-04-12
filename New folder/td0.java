/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookSdk;
import com.facebook.j;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class td0 {
    public static final Set a;
    public static boolean b;

    static {
        WeakHashMap weakHashMap = new WeakHashMap();
        a = Collections.newSetFromMap(weakHashMap);
    }

    public static final void a(Object object, Throwable throwable) {
        Object object2 = "o";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = b;
        if (!bl2) {
            return;
        }
        object2 = a;
        object2.add(object);
        object = FacebookSdk.a;
        boolean bl3 = j.c();
        if (bl3) {
            sC0.a(throwable);
            object = Di1$b.CrashShield;
            object = Di1$a.b(throwable, (Di1$b)((Object)object));
            ((Di1)object).b();
        }
    }

    public static final boolean b(Object object) {
        Intrinsics.checkNotNullParameter(object, "o");
        return a.contains(object);
    }
}

