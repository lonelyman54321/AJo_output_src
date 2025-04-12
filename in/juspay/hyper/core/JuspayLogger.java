/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hyper.core;

import in.juspay.hyper.core.JuspayCoreLib;
import kotlin.jvm.internal.Intrinsics;

public final class JuspayLogger {
    public static final JuspayLogger INSTANCE;

    static {
        JuspayLogger juspayLogger;
        INSTANCE = juspayLogger = new JuspayLogger();
    }

    private JuspayLogger() {
    }

    public static final void d(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "tag");
        Intrinsics.checkNotNullParameter(string3, "description");
        JuspayCoreLib.isAppDebuggable();
    }

    public static final void e(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "tag");
        Intrinsics.checkNotNullParameter(string3, "description");
        JuspayCoreLib.isAppDebuggable();
    }

    public static final void e(String string2, String string3, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "tag");
        Intrinsics.checkNotNullParameter(string3, "description");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        JuspayCoreLib.isAppDebuggable();
    }

    public static final void i(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "tag");
        Intrinsics.checkNotNullParameter(string3, "description");
        JuspayCoreLib.isAppDebuggable();
    }

    /*
     * Unable to fully structure code
     */
    public static final void log(String var0, String var1_1, String var2_2) {
        block12: {
            Intrinsics.checkNotNullParameter(var0, "tag");
            Intrinsics.checkNotNullParameter(var1_1, "level");
            var3_3 = "description";
            Intrinsics.checkNotNullParameter(var2_2, var3_3);
            var4_4 = var1_1.hashCode();
            switch (var4_4) {
                default: {
                    break block12;
                }
                case 1952151455: {
                    var3_3 = "critical";
                    var5_5 = var1_1.equals(var3_3);
                    if (var5_5) ** GOTO lbl24
                    break block12;
                }
                case 1124446108: {
                    var3_3 = "warning";
                    var5_6 = var1_1.equals(var3_3);
                    if (var5_6) {
                        JuspayLogger.w(var0, var2_2);
                    }
                    break block12;
                }
                case 96784904: {
                    var3_3 = "error";
                    var5_7 = var1_1.equals(var3_3);
                    if (!var5_7) break block12;
lbl24:
                    // 2 sources

                    JuspayLogger.e(var0, var2_2);
                    break block12;
                }
                case 95458899: {
                    var3_3 = "debug";
                    var5_8 = var1_1.equals(var3_3);
                    if (var5_8) {
                        JuspayLogger.d(var0, var2_2);
                    }
                    break block12;
                }
                case 3237038: 
            }
            var3_3 = "info";
            var5_9 = var1_1.equals(var3_3);
            if (var5_9) {
                JuspayLogger.i(var0, var2_2);
            }
        }
    }

    public static final void w(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "tag");
        Intrinsics.checkNotNullParameter(string3, "description");
        JuspayCoreLib.isAppDebuggable();
    }
}

