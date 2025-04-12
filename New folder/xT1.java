/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.q;
import androidx.navigation.q$a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class xT1 {
    public static void a(wT1 object, String object2, List object3, u10 object4, int n3) {
        boolean bl2;
        if ((n3 &= 2) != 0) {
            object3 = mz0_2.a;
        }
        mz0_2 mz0_22 = mz0_2.a;
        Object object5 = ((wT1)object).g;
        object5.getClass();
        Class<A20> clazz = A20.class;
        Intrinsics.checkNotNullParameter(clazz, "navigatorClass");
        String string2 = q$a.a(clazz);
        object5 = (A20)((q)object5).b(string2);
        B20 b20 = new B20((A20)object5, (String)object2, (u10)object4);
        object3 = (Iterable)object3;
        object2 = object3.iterator();
        while (bl2 = object2.hasNext()) {
            object3 = (HS1)object2.next();
            object4 = ((HS1)object3).a;
            Intrinsics.checkNotNullParameter(object4, "name");
            object3 = ((HS1)object3).b;
            Intrinsics.checkNotNullParameter(object3, "argument");
            object5 = b20.d;
            object5.put(object4, object3);
        }
        object2 = mz0_22.iterator();
        while (bl2 = object2.hasNext()) {
            object3 = (gt1_0)object2.next();
            Intrinsics.checkNotNullParameter(object3, "navDeepLink");
            object4 = b20.e;
            ((ArrayList)object4).add(object3);
        }
        b20.i = null;
        b20.j = null;
        b20.k = null;
        b20.l = null;
        b20.m = null;
        Intrinsics.checkNotNullParameter(b20, "navDestination");
        object = ((wT1)object).i;
        object2 = b20.a();
        ((ArrayList)object).add(object2);
    }
}

