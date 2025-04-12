/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintStream;

/*
 * Renamed from HJ2
 */
public final class hj2_2 {
    public static final hj2$b_0 a;
    public static final hj2$a_0 b;

    static {
        boolean bl2;
        boolean bl3;
        String string2;
        Object object;
        block3: {
            int n3;
            String string3 = "stdout";
            object = new String[]{"System.out", string3, "sysout"};
            string2 = System.getProperty("slf4j.internal.report.stream");
            if (string2 != null && (n3 = string2.isEmpty()) == 0) {
                int n4;
                string3 = null;
                for (n3 = 0; n3 < (n4 = 3); ++n3) {
                    String string4 = object[n3];
                    n4 = (int)(string4.equalsIgnoreCase(string2) ? 1 : 0);
                    if (n4 == 0) continue;
                    object = hj2$b_0.Stdout;
                    break block3;
                }
                object = hj2$b_0.Stderr;
            } else {
                object = hj2$b_0.Stderr;
            }
        }
        a = object;
        object = System.getProperty("slf4j.internal.verbosity");
        object = object != null && !(bl3 = object.isEmpty()) ? ((bl3 = object.equalsIgnoreCase(string2 = "DEBUG")) ? hj2$a_0.DEBUG : ((bl3 = object.equalsIgnoreCase(string2 = "ERROR")) ? hj2$a_0.ERROR : ((bl2 = object.equalsIgnoreCase(string2 = "WARN")) ? hj2$a_0.WARN : hj2$a_0.INFO))) : hj2$a_0.INFO;
        b = object;
    }

    public static final void a(String string2) {
        PrintStream printStream = hj2_2.c();
        StringBuilder stringBuilder = new StringBuilder("SLF4J(E): ");
        stringBuilder.append(string2);
        string2 = stringBuilder.toString();
        printStream.println(string2);
    }

    public static final void b(String object, Throwable throwable) {
        PrintStream printStream = hj2_2.c();
        StringBuilder stringBuilder = new StringBuilder("SLF4J(E): ");
        stringBuilder.append((String)object);
        object = stringBuilder.toString();
        printStream.println((String)object);
        hj2_2.c().println("SLF4J(E): Reported exception:");
        object = hj2_2.c();
        throwable.printStackTrace((PrintStream)object);
    }

    public static PrintStream c() {
        int n3;
        hj2$b_0 hj2$b_0 = a;
        int n4 = hj2$b_0.ordinal();
        if (n4 != (n3 = 1)) {
            return System.err;
        }
        return System.out;
    }

    public static boolean d(hj2$a_0 hj2$a_0) {
        int n3 = hj2$a_0.levelInt;
        hj2$a_0 hj2$a_02 = b;
        int n4 = hj2$a_02.levelInt;
        if (n3 >= n4) {
            n3 = 1;
        } else {
            n3 = 0;
            hj2$a_0 = null;
        }
        return n3;
    }

    public static final void e(String string2) {
        Object object = hj2$a_0.WARN;
        boolean bl2 = hj2_2.d(object);
        if (bl2) {
            object = hj2_2.c();
            String string3 = "SLF4J(W): ";
            StringBuilder stringBuilder = new StringBuilder(string3);
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
            ((PrintStream)object).println(string2);
        }
    }
}

