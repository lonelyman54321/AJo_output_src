/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources$Theme
 *  android.os.Build$VERSION
 */
import android.content.res.Resources;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

public final class WK2$e {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Resources.Theme var0) {
        var1_2 = Build.VERSION.SDK_INT;
        var2_3 = 29;
        if (var1_2 >= var2_3) {
            WK2$e$b.a(var0);
            return;
        }
        var2_3 = 23;
        if (var1_2 < var2_3) return;
        var3_4 = WK2$e$a.a;
        synchronized (var3_4) {
            block10: {
                var2_3 = (int)WK2$e$a.c;
                if (var2_3) ** GOTO lbl24
                var2_3 = 1;
                var4_5 = Resources.Theme.class;
                var5_6 = "rebase";
                WK2$e$a.b = var4_5 = var4_5.getDeclaredMethod(var5_6, null);
                var4_5.setAccessible((boolean)var2_3);
                ** GOTO lbl23
                {
                    catch (Throwable var0_1) {
                        break block10;
                    }
                    catch (NoSuchMethodException v0) {}
lbl23:
                    // 2 sources

                    WK2$e$a.c = var2_3;
lbl24:
                    // 2 sources

                    if ((var6_7 = WK2$e$a.b) == null) return;
                    try {
                        var6_7.invoke((Object)var0, null);
                        ** GOTO lbl31
                    }
                    catch (IllegalAccessException | InvocationTargetException v1) {}
                    {
                        WK2$e$a.b = null;
lbl31:
                        // 2 sources

                        return;
                    }
                }
            }
            throw var0_1;
        }
    }
}

