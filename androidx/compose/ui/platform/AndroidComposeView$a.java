/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AndroidComposeView;

public final class AndroidComposeView$a {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final boolean a() {
        block19: {
            block18: {
                var0 = 1;
                var1_1 = 2;
                var2_2 = false;
                var3_3 /* !! */  = AndroidComposeView.R0;
                try {
                    var3_3 /* !! */  = AndroidComposeView.R0;
                    if (var3_3 /* !! */  != null) ** GOTO lbl28
                    var3_3 /* !! */  = "android.os.SystemProperties";
                }
                catch (Exception v0) {
                    ** continue;
                }
                var3_3 /* !! */  = Class.forName((String)var3_3 /* !! */ );
                AndroidComposeView.R0 = var3_3 /* !! */ ;
                var4_4 = "getBoolean";
                var5_5 /* !! */  = new Class[var1_1];
                var6_6 /* !! */  = String.class;
                var5_5 /* !! */ [0] = var6_6 /* !! */ ;
                var6_6 /* !! */  = Boolean.TYPE;
                var5_5 /* !! */ [var0] = var6_6 /* !! */ ;
                var3_3 /* !! */  = var3_3 /* !! */ .getDeclaredMethod((String)var4_4, var5_5 /* !! */ );
                AndroidComposeView.S0 = var3_3 /* !! */ ;
lbl28:
                // 2 sources

                var3_3 /* !! */  = AndroidComposeView.S0;
                var4_4 = null;
                if (var3_3 /* !! */  == null) break block18;
                var7_7 = new Object[var1_1];
                var5_5 /* !! */  = "debug.layout";
                var7_7[0] = var5_5 /* !! */ ;
                var5_5 /* !! */  = Boolean.FALSE;
                var7_7[var0] = var5_5 /* !! */ ;
                var8_8 = var3_3 /* !! */ .invoke(null, var7_7);
                break block19;
            }
            var0 = 0;
            var8_8 = null;
        }
        var1_1 = var8_8 instanceof Boolean;
        if (var1_1 != 0) {
            var4_4 = var8_8;
            var4_4 = (Boolean)var8_8;
        }
        if (var4_4 != null) {
            var2_2 = var4_4.booleanValue();
        }
lbl54:
        // 4 sources

        return var2_2;
    }
}

