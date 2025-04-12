/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 */
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class da$b {
    public static da_2 a() {
        da_2 da_22 = da_2.v;
        if (da_22 == null) {
            da_2.v = da_22 = new da_2(0, 0, 0, 0, 0, false, false, false, false, false, null, null, false, null, null, null, false, false, false, null, false, null, false, null, false, false, null);
        }
        da_22 = da_2.v;
        Intrinsics.checkNotNull(da_22, "null cannot be cast to non-null type com.ril.ajio.utility.glide.AjioImageLoader");
        return da_22;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String b(String var0) {
        block16: {
            if (var0 != null && (var1_1 = var0.length()) != 0) {
                block17: {
                    ** try [egrp 0[TRYBLOCK] [0 : 16->19)] { 
lbl3:
                    // 1 sources

                    var1_1 = 0;
                    var2_2 /* !! */  = h40_0.Q(false);
                    var3_3 = "fqdn_master";
                    var4_4 = var2_2 /* !! */ .optBoolean(var3_3);
                    if (!var4_4) break block16;
                    var2_2 /* !! */  = "assets.ajio.com";
                    var3_3 = ".gif";
                    var5_5 = true;
                    var6_6 = StringsKt.F(var0, var3_3, var5_5);
                    var7_7 /* !! */  = h40_0.Q(false);
                    var8_8 = "fqdn";
                    var7_7 /* !! */  = var7_7 /* !! */ .optString(var8_8);
                    var8_8 = "optString(...)";
                    Intrinsics.checkNotNullExpressionValue(var7_7 /* !! */ , var8_8);
                    var8_8 = h40_0.Q(false);
                    var9_9 = "is_replace_fqdn_image";
                    var10_10 = var8_8.optBoolean(var9_9);
                    var9_9 = h40_0.Q(false);
                    var11_11 = "is_replace_fqdn_gif";
                    var12_12 = var9_9.optBoolean(var11_11);
                    if (!var6_6 || !var12_12) break block17;
                    var0 = b.n(var0, (String)var2_2 /* !! */ , (String)var7_7 /* !! */ , false);
                    break block16;
                }
                if (!var6_6 && var10_10) {
                    var0 = b.n(var0, (String)var2_2 /* !! */ , (String)var7_7 /* !! */ , false);
                }
            }
        }
lbl42:
        // 2 sources

        return var0;
lbl44:
        // 12 sources

        catch (Exception v0) {
            ** continue;
        }
    }

    public static void c(ImageView imageView, String string2) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        string2 = da$b.b(string2);
        x31_0 x31_02 = new a01(string2);
        a.f((View)imageView).k().U(x31_02).Q(imageView);
    }

    public static void d(ImageView imageView, String string2) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        string2 = da$b.b(string2);
        x31_0 x31_02 = new a01(string2);
        a.f((View)imageView).n(x31_02).Q(imageView);
    }
}

