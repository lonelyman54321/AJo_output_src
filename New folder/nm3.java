/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.b;
import androidx.navigation.b$a;
import androidx.navigation.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

public final class nm3 {
    public static final long a(int n3, int n4) {
        char c2 = ']';
        String string2 = ", end: ";
        if (n3 >= 0) {
            if (n4 >= 0) {
                long l2 = (long)n3 << 32;
                long l3 = (long)n4 & 0xFFFFFFFFL | l2;
                c2 = mm3.c;
                return l3;
            }
            StringBuilder stringBuilder = new StringBuilder("end cannot be negative. [start: ");
            stringBuilder.append(n3);
            stringBuilder.append(string2);
            stringBuilder.append(n4);
            stringBuilder.append(c2);
            String string3 = stringBuilder.toString();
            string3 = string3.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
            throw illegalArgumentException;
        }
        StringBuilder stringBuilder = new StringBuilder("start cannot be negative. [start: ");
        stringBuilder.append(n3);
        stringBuilder.append(string2);
        stringBuilder.append(n4);
        stringBuilder.append(c2);
        String string4 = stringBuilder.toString();
        string4 = string4.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string4);
        throw illegalArgumentException;
    }

    public static final long b(int n3, long l2) {
        long l3 = l2 >> 32;
        int n4 = (int)l3;
        int n7 = f.g(n4, 0, n3);
        long l4 = 0xFFFFFFFFL & l2;
        int n8 = (int)l4;
        n3 = f.g(n8, 0, n3);
        if (n7 == n4 && n3 == n8) {
            return l2;
        }
        return nm3.a(n7, n3);
    }

    public static final HS1 c(String string2, Function1 object) {
        Object object2;
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(object, "builder");
        Object object3 = new c();
        object.invoke(object3);
        object = ((c)object3).a;
        object3 = ((b$a)object).a;
        if (object3 == null) {
            object3 = cU1.f;
            Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            object2 = "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>";
            Intrinsics.checkNotNull(object3, (String)object2);
        }
        boolean bl2 = ((b$a)object).b;
        object2 = new b((cU1)object3, bl2);
        HS1 hS1 = new HS1(string2, (b)object2);
        return hS1;
    }
}

