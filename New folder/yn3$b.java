/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public abstract class yn3$b {
    public final ThreadLocal a;

    public yn3$b() {
        ThreadLocal threadLocal;
        this.a = threadLocal = new ThreadLocal();
    }

    public void a(String string2, Object ... objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "args");
        int n3 = objectArray.length;
        objectArray = Arrays.copyOf(objectArray, n3);
        this.i(3, null, string2, objectArray);
    }

    public void b(Throwable throwable) {
        Object[] objectArray = new Object[]{};
        this.i(3, throwable, null, objectArray);
    }

    public void c(Exception exception, String string2, Object ... objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "args");
        int n3 = objectArray.length;
        objectArray = Arrays.copyOf(objectArray, n3);
        this.i(6, exception, string2, objectArray);
    }

    public void d(String string2, Object ... objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "args");
        int n3 = objectArray.length;
        objectArray = Arrays.copyOf(objectArray, n3);
        this.i(6, null, string2, objectArray);
    }

    public void e(Throwable throwable) {
        Object[] objectArray = new Object[]{};
        this.i(6, throwable, null, objectArray);
    }

    public void f(String string2, Object ... objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "args");
        int n3 = objectArray.length;
        objectArray = Arrays.copyOf(objectArray, n3);
        this.i(4, null, string2, objectArray);
    }

    public void g(Exception exception) {
        Object[] objectArray = new Object[]{};
        this.i(4, exception, null, objectArray);
    }

    public abstract void h(String var1, Throwable var2);

    public final void i(int n3, Throwable throwable, String object, Object ... object2) {
        int n4;
        Object object3 = this.a;
        Object object4 = (String)((ThreadLocal)object3).get();
        if (object4 != null) {
            ((ThreadLocal)object3).remove();
        }
        object3 = "sw.toString()";
        int n7 = 256;
        if (object != null && (n4 = ((String)object).length()) != 0) {
            String string2;
            n4 = ((Object[])object2).length;
            int n8 = 1;
            if (n4 == 0) {
                n4 = 1;
            } else {
                n4 = 0;
                string2 = null;
            }
            if ((n4 ^= n8) != 0) {
                Intrinsics.checkNotNullParameter(object, "message");
                string2 = "args";
                Intrinsics.checkNotNullParameter(object2, string2);
                n4 = ((Object)object2).length;
                object2 = Arrays.copyOf(object2, n4);
                n4 = ((Object)object2).length;
                String string3 = "java.lang.String.format(this, *args)";
                object = xh2_0.a((Object[])object2, n4, (String)object, string3);
            }
            if (throwable != null) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(object);
                char c2 = '\n';
                ((StringBuilder)object2).append(c2);
                object = new StringWriter(n7);
                object4 = new PrintWriter((Writer)object, false);
                throwable.printStackTrace((PrintWriter)object4);
                ((PrintWriter)object4).flush();
                object = ((StringWriter)object).toString();
                Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                ((StringBuilder)object2).append((String)object);
                object = ((StringBuilder)object2).toString();
            }
        } else {
            if (throwable == null) {
                return;
            }
            object = new StringWriter(n7);
            object2 = new PrintWriter((Writer)object, false);
            throwable.printStackTrace((PrintWriter)object2);
            ((PrintWriter)object2).flush();
            object = ((StringWriter)object).toString();
            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        }
        this.h((String)object, throwable);
    }

    public void j(Exception exception) {
        Object[] objectArray = new Object[]{};
        this.i(5, exception, null, objectArray);
    }

    public void k(String string2, Object ... objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "args");
        int n3 = objectArray.length;
        objectArray = Arrays.copyOf(objectArray, n3);
        this.i(5, null, string2, objectArray);
    }
}

