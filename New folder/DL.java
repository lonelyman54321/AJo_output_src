/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.os.Build$VERSION
 */
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

public final class DL {
    public static Method a;
    public static Method b;
    public static boolean c;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void a(Canvas var0, boolean var1_1) {
        block36: {
            block39: {
                block38: {
                    var2_2 = 2;
                    var3_3 = 1;
                    var4_4 = Build.VERSION.SDK_INT;
                    var5_5 = 29;
                    if (var4_4 < var5_5) break block38;
                    var6_6 = EL.a;
                    var6_6.a(var0, var1_1);
                    ** GOTO lbl98
                }
                var5_5 = (int)DL.c;
                if (var5_5 != 0) ** GOTO lbl79
                var5_5 = 28;
                var7_8 = "insertInorderBarrier";
                var8_9 = "insertReorderBarrier";
                var9_10 = Canvas.class;
                if (var4_4 != var5_5) break block39;
                var10_11 = Class.class;
                var11_12 /* !! */  = "getDeclaredMethod";
                var12_13 = new Class[]{};
                var12_13 = var12_13.getClass();
                var13_14 = new Class[var2_2];
                var14_15 = String.class;
                var13_14[0] = var14_15;
                var13_14[var3_3] = var12_13;
                var10_11 = var10_11.getDeclaredMethod((String)var11_12 /* !! */ , var13_14);
                var11_12 /* !! */  = new Class[]{};
                var12_13 = new Object[var2_2];
                var12_13[0] = var8_9;
                var12_13[var3_3] = var11_12 /* !! */ ;
                var11_12 /* !! */  = var10_11.invoke(var9_10, var12_13);
                var11_12 /* !! */  = (Method)var11_12 /* !! */ ;
                DL.a = var11_12 /* !! */ ;
                var11_12 /* !! */  = new Class[]{};
                var6_7 /* !! */  = new Object[var2_2];
                var6_7 /* !! */ [0] = var7_8;
                var6_7 /* !! */ [var3_3] = var11_12 /* !! */ ;
                var6_7 /* !! */  = var10_11.invoke(var9_10, var6_7 /* !! */ );
                var6_7 /* !! */  = (Method)var6_7 /* !! */ ;
                DL.b = var6_7 /* !! */ ;
                ** GOTO lbl69
            }
            var6_7 /* !! */  = var9_10.getDeclaredMethod(var8_9, null);
            DL.a = var6_7 /* !! */ ;
            var6_7 /* !! */  = var9_10.getDeclaredMethod(var7_8, null);
            DL.b = var6_7 /* !! */ ;
lbl69:
            // 2 sources

            var6_7 /* !! */  = DL.a;
            if (var6_7 /* !! */  == null) ** GOTO lbl73
            var6_7 /* !! */ .setAccessible((boolean)var3_3);
lbl73:
            // 2 sources

            var6_7 /* !! */  = DL.b;
            if (var6_7 /* !! */  == null) break block36;
            try {
                var6_7 /* !! */ .setAccessible((boolean)var3_3);
            }
            catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException v0) {}
lbl77:
            // 2 sources

            while (true) {
                block37: {
                    DL.c = var3_3;
lbl79:
                    // 2 sources

                    if (var1_1) {
                        var6_7 /* !! */  = DL.a;
                        if (var6_7 /* !! */  == null) break block37;
                        Intrinsics.checkNotNull(var6_7 /* !! */ );
                        var6_7 /* !! */ .invoke((Object)var0, null);
                    }
                }
                if (var1_1) ** GOTO lbl98
                var15_16 = DL.b;
                if (var15_16 == null) ** GOTO lbl98
                Intrinsics.checkNotNull(var15_16);
                var15_16.invoke((Object)var0, null);
lbl98:
                // 5 sources

                return;
                break;
            }
        }
        ** while (true)
        catch (IllegalAccessException | InvocationTargetException v1) {
            ** continue;
        }
    }
}

