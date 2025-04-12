/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class yn3$a
extends yn3$b {
    public final void a(String string2, Object ... objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "args");
        for (yn3$b yn3$b : yn3_0.c) {
            int n3 = objectArray.length;
            Object[] objectArray2 = Arrays.copyOf(objectArray, n3);
            yn3$b.a(string2, objectArray2);
        }
    }

    public final void b(Throwable throwable) {
        for (yn3$b yn3$b : yn3_0.c) {
            yn3$b.b(throwable);
        }
    }

    public final void c(Exception exception, String string2, Object ... objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "args");
        for (yn3$b yn3$b : yn3_0.c) {
            int n3 = objectArray.length;
            Object[] objectArray2 = Arrays.copyOf(objectArray, n3);
            yn3$b.c(exception, string2, objectArray2);
        }
    }

    public final void d(String string2, Object ... objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "args");
        for (yn3$b yn3$b : yn3_0.c) {
            int n3 = objectArray.length;
            Object[] objectArray2 = Arrays.copyOf(objectArray, n3);
            yn3$b.d(string2, objectArray2);
        }
    }

    public final void e(Throwable throwable) {
        for (yn3$b yn3$b : yn3_0.c) {
            yn3$b.e(throwable);
        }
    }

    public final void f(String string2, Object ... objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "args");
        for (yn3$b yn3$b : yn3_0.c) {
            int n3 = objectArray.length;
            Object[] objectArray2 = Arrays.copyOf(objectArray, n3);
            yn3$b.f(string2, objectArray2);
        }
    }

    public final void g(Exception exception) {
        for (yn3$b yn3$b : yn3_0.c) {
            yn3$b.g(exception);
        }
    }

    public final void h(String object, Throwable throwable) {
        Intrinsics.checkNotNullParameter(object, "message");
        object = new AssertionError();
        throw object;
    }

    public final void j(Exception exception) {
        for (yn3$b yn3$b : yn3_0.c) {
            yn3$b.j(exception);
        }
    }

    public final void k(String string2, Object ... objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "args");
        for (yn3$b yn3$b : yn3_0.c) {
            int n3 = objectArray.length;
            Object[] objectArray2 = Arrays.copyOf(objectArray, n3);
            yn3$b.k(string2, objectArray2);
        }
    }

    public final void l(String string2) {
        Intrinsics.checkNotNullParameter(string2, "tag");
        for (yn3$b yn3$b : yn3_0.c) {
            ThreadLocal object = yn3$b.a;
            object.set(string2);
        }
    }
}

