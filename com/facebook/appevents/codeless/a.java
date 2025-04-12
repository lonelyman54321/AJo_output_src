/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 */
package com.facebook.appevents.codeless;

import android.os.Bundle;
import android.view.View;
import com.facebook.FacebookSdk;
import com.facebook.appevents.codeless.CodelessMatcher$a;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

public final class a {
    public static final a a;

    static {
        a a2;
        a = a2 = new a();
    }

    public static final void a(CB0 cB0, View object, View object2) {
        Class<a> clazz = a.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return;
        }
        String string2 = "mapping";
        try {
            Intrinsics.checkNotNullParameter(cB0, string2);
            string2 = "rootView";
        }
        catch (Throwable throwable) {
            td0.a(clazz, throwable);
            return;
        }
        Intrinsics.checkNotNullParameter(object, string2);
        string2 = "hostView";
        Intrinsics.checkNotNullParameter(object2, string2);
        string2 = cB0.a;
        cB0 = CodelessMatcher$a.b(cB0, (View)object, object2);
        object = a;
        ((a)object).b((Bundle)cB0);
        object = FacebookSdk.d();
        object2 = new qw_0(0, string2, cB0);
        object.execute((Runnable)object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Bundle var1_1) {
        block15: {
            block14: {
                var2_3 = "_valueToSum";
                var3_4 = td0.b(this);
                if (var3_4) {
                    return;
                }
                var4_5 = "parameters";
                try {
                    Intrinsics.checkNotNullParameter(var1_1, (String)var4_5);
                    var4_5 = var1_1.getString(var2_3);
                    if (var4_5 == null) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var2_3 = "_is_fb_codeless";
                            var4_5 = "1";
                            var1_1.putString(var2_3, (String)var4_5);
                            return;
                        }
                    }
                    var5_6 = 0.0;
                    var7_7 = "[-+]*\\d+([.,]\\d+)*([.,]\\d+)?";
                    var8_8 = 8;
                    ** try [egrp 2[TRYBLOCK] [3 : 52->97)] { 
lbl20:
                    // 1 sources

                    ** GOTO lbl-1000
lbl21:
                    // 1 sources

                    catch (ParseException v0) {}
lbl-1000:
                    // 1 sources

                    {
                        var4_5 = (var7_7 = Pattern.compile((String)var7_7, var8_8)).matcher((CharSequence)var4_5);
                        var9_9 = var4_5.find();
                        if (var9_9) break block14;
                    }
lbl25:
                    // 3 sources

                    while (true) {
                        var1_1.putDouble(var2_3, var5_6);
                        ** continue;
                        break;
                    }
                }
                catch (Throwable var1_2) {
                    break block15;
                }
            }
            var9_9 = false;
            var7_7 = null;
            var4_5 = var4_5.group(0);
            var7_7 = lz3_0.a;
            try {
                var7_7 = FacebookSdk.a();
                var7_7 = var7_7.getResources();
                var7_7 = var7_7.getConfiguration();
                var7_7 = var7_7.locale;
            }
            catch (Exception v1) {
                var9_9 = false;
                var7_7 = null;
            }
            if (var7_7 != null) ** GOTO lbl48
            {
                var7_7 = Locale.getDefault();
                var10_10 = "getDefault()";
                Intrinsics.checkNotNullExpressionValue(var7_7, var10_10);
lbl48:
                // 2 sources

                var7_7 = NumberFormat.getNumberInstance((Locale)var7_7);
                var4_5 = var7_7.parse((String)var4_5);
                var5_6 = var4_5.doubleValue();
                ** continue;
            }
        }
        td0.a(this, var1_2);
    }
}

