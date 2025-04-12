/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * Renamed from uu0$a
 */
public final class uu0$a_0 {
    public static final boolean a;
    public static final Method b;
    public static final Field c;
    public static final Field d;
    public static final Field e;
    public static final Field f;

    /*
     * Unable to fully structure code
     */
    static {
        block23: {
            block24: {
                var0 = true;
                var1_1 = "android.graphics.Insets";
                var1_1 = Class.forName((String)var1_1);
                var2_2 = Drawable.class;
                var3_3 = "getOpticalInsets";
                var2_2 = var2_2.getMethod((String)var3_3, null);
                var3_3 = "left";
                var3_3 = var1_1.getField((String)var3_3);
                var4_4 = "top";
                var4_4 = var1_1.getField((String)var4_4);
                var5_5 = "right";
                var5_5 = var1_1.getField((String)var5_5);
                var6_6 = "bottom";
                try {
                    var1_1 = var1_1.getField(var6_6);
                    var7_7 = true;
                    break block23;
                }
                catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException v0) {
                    break block24;
                }
                catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException v1) {
                    var5_5 = null;
                }
                break block24;
                catch (NoSuchFieldException v2) {
                    var4_4 = null;
lbl30:
                    // 6 sources

                    while (true) {
                        var5_5 = null;
                        break block24;
                        break;
                    }
                }
                catch (ClassNotFoundException v3) {
                    var4_4 = null;
                    ** GOTO lbl30
                }
                catch (NoSuchMethodException v4) {
                    var4_4 = null;
                    ** GOTO lbl30
                }
                catch (NoSuchFieldException v5) {
                    var3_3 = null;
lbl41:
                    // 2 sources

                    while (true) {
                        var4_4 = null;
                        ** GOTO lbl30
                        break;
                    }
                }
                catch (ClassNotFoundException v6) {
                    var3_3 = null;
lbl46:
                    // 2 sources

                    while (true) {
                        var4_4 = null;
                        ** GOTO lbl30
                        break;
                    }
                }
                catch (NoSuchMethodException v7) {
                    var3_3 = null;
lbl51:
                    // 2 sources

                    while (true) {
                        var4_4 = null;
                        ** continue;
                        break;
                    }
                }
                catch (NoSuchFieldException v8) {
                    var2_2 = null;
                    var3_3 = null;
                    ** continue;
                }
                catch (ClassNotFoundException v9) {
                    var2_2 = null;
                    var3_3 = null;
                    ** continue;
                }
                catch (NoSuchMethodException v10) {
                    var2_2 = null;
                    var3_3 = null;
                    ** continue;
                }
            }
            var1_1 = null;
            var7_7 = false;
            var6_6 = null;
        }
        if (var7_7) {
            uu0$a_0.b = var2_2;
            uu0$a_0.c = var3_3;
            uu0$a_0.d = var4_4;
            uu0$a_0.e = var5_5;
            uu0$a_0.f = var1_1;
            uu0$a_0.a = var0;
        } else {
            uu0$a_0.b = null;
            uu0$a_0.c = null;
            uu0$a_0.d = null;
            uu0$a_0.e = null;
            uu0$a_0.f = null;
            uu0$a_0.a = false;
        }
    }
}

