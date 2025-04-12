/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  org.json.JSONArray
 */
package in.juspay.hyperlottie;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import in.juspay.hyper.core.FileProviderInterface;
import in.juspay.hyper.core.JsCallback;
import in.juspay.hyperlottie.LottieAnimation$Companion;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

public final class LottieAnimation {
    private static final String ALPHA = "lottieAlpha";
    public static final LottieAnimation$Companion Companion;
    private static final String LOTTIE_URL = "lottieUrl";
    private static final String MAX_FRAME = "maxFrame";
    private static final String MAX_PROGRESS = "maxProgress";
    private static final String MIN_FRAME = "minFrame";
    private static final String MIN_PROGRESS = "minProgress";
    private static final String REPEAT_COUNT = "repeatCount";
    private static final String REPEAT_MODE = "repeatMode";
    private static final String SAFE_MODE = "safeMode";
    private static final String SPEED = "speed";
    private static final String START_LOTTIE = "startLottie";
    private final Context context;
    private final JsCallback dynamicUI;
    private final FileProviderInterface fileProviderInterface;
    private final WeakHashMap jsonStringCache;

    static {
        LottieAnimation$Companion lottieAnimation$Companion;
        Companion = lottieAnimation$Companion = new LottieAnimation$Companion(null);
    }

    public LottieAnimation(Context object, JsCallback jsCallback, FileProviderInterface fileProviderInterface) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(jsCallback, "dynamicUI");
        Intrinsics.checkNotNullParameter(fileProviderInterface, "fileProviderInterface");
        this.context = object;
        this.dynamicUI = jsCallback;
        this.fileProviderInterface = fileProviderInterface;
        this.jsonStringCache = object;
    }

    public static /* synthetic */ void a(yc1_1 yc1_12, Object object, boolean bl2, QB1 qB1) {
        LottieAnimation.applyAnimation$lambda$0(yc1_12, object, bl2, qB1);
    }

    private static final void applyAnimation$lambda$0(yc1_1 yc1_12, Object object, boolean bl2, QB1 qB1) {
        String string2 = "$lottieDrawable";
        Intrinsics.checkNotNullParameter((Object)yc1_12, string2);
        yc1_12.p(qB1);
        object = (View)object;
        object.setBackground((Drawable)yc1_12);
        if (bl2) {
            yc1_12.start();
        } else {
            yc1_12.stop();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void applyAnimation(Object var1_1, JSONArray var2_2) {
        block87: {
            block86: {
                block85: {
                    block84: {
                        block83: {
                            block82: {
                                block81: {
                                    block80: {
                                        block79: {
                                            block78: {
                                                block77: {
                                                    block74: {
                                                        block76: {
                                                            block75: {
                                                                var3_3 = this;
                                                                var4_4 = var1_1;
                                                                var5_5 /* !! */  = var2_2;
                                                                var6_6 = "lottieAlpha";
                                                                var7_7 = "safeMode";
                                                                var8_8 = "maxProgress";
                                                                var9_9 = "minProgress";
                                                                var10_10 = "maxFrame";
                                                                var11_11 = "minFrame";
                                                                var12_12 /* !! */  = "speed";
                                                                var13_13 /* !! */  = "repeatCount";
                                                                var14_14 = "repeatMode";
                                                                var15_15 = "lottieUrl";
                                                                var16_16 = "animations";
                                                                Intrinsics.checkNotNullParameter(var2_2, (String)var16_16);
                                                                var17_17 = var1_1 instanceof View;
                                                                if (var17_17 == 0) {
                                                                    return;
                                                                }
                                                                try {
                                                                    var17_17 = var2_2.length();
                                                                    var18_18 = false;
                                                                    var19_19 = null;
                                                                    if (var17_17 != 0) ** GOTO lbl38
                                                                    var5_5 /* !! */  = var1_1;
                                                                }
                                                                catch (Exception v0) {
                                                                    ** continue;
                                                                }
                                                                var5_5 /* !! */  = (View)var1_1;
                                                                var5_5 /* !! */  = var5_5 /* !! */ .getBackground();
                                                                var20_20 = var5_5 /* !! */  instanceof yc1_1;
                                                                if (!var20_20) ** GOTO lbl37
                                                                var4_4 = (View)var1_1;
                                                                var4_4.setBackground(null);
lbl37:
                                                                // 2 sources

                                                                return;
lbl38:
                                                                // 1 sources

                                                                var17_17 = var2_2.length();
                                                                if (var17_17 <= (var21_22 = 1)) ** GOTO lbl45
                                                                var16_16 = this.dynamicUI;
                                                                var19_19 = "console.log(\"LottieAnimations Array is > 1\");";
                                                                var16_16.addJsToWebView((String)var19_19);
lbl45:
                                                                // 2 sources

                                                                var17_17 = var2_2.length() - var21_22;
                                                                var5_5 /* !! */  = var5_5 /* !! */ .getJSONObject(var17_17);
                                                                if (var5_5 /* !! */  == null) {
                                                                    return;
                                                                }
                                                                var16_16 = "startLottie";
                                                                var17_17 = var5_5 /* !! */ .optBoolean((String)var16_16, (boolean)var21_22);
                                                                var18_18 = var5_5 /* !! */ .has((String)var15_15);
                                                                if (!var18_18) break block74;
                                                                var15_15 = var5_5 /* !! */ .getString((String)var15_15);
                                                                var19_19 = var3_3.jsonStringCache;
                                                                var18_18 = var19_19.containsKey(var15_15);
                                                                if (!var18_18) break block75;
                                                                var19_19 = var3_3.jsonStringCache;
                                                                var19_19 = var19_19.get(var15_15);
                                                                var19_19 = (String)var19_19;
                                                                var22_23 = var6_6;
                                                                break block76;
                                                            }
                                                            var19_19 = var3_3.fileProviderInterface;
                                                            var23_24 /* !! */  = var3_3.context;
                                                            var22_23 = var6_6;
                                                            var6_6 = "url";
                                                            Intrinsics.checkNotNullExpressionValue(var15_15, (String)var6_6);
                                                            var19_19 = var19_19.readFromFile(var23_24 /* !! */ , (String)var15_15);
                                                            if (var19_19 == null) ** GOTO lbl105
                                                            var24_25 = var19_19.length();
                                                            if (var24_25 == 0) ** GOTO lbl105
                                                            var6_6 = var3_3.jsonStringCache;
                                                            var6_6.put(var15_15, var19_19);
                                                        }
                                                        var6_6 = new yc1_1();
                                                        var23_24 /* !! */  = new XB1((String)var19_19, (String)var15_15);
                                                        var18_18 = false;
                                                        var19_19 = null;
                                                        var15_15 = cc1_0.a((String)var15_15, (Callable)var23_24 /* !! */ , null);
                                                        var19_19 = new gb1_1((yc1_1)var6_6, var4_4, (boolean)var17_17);
                                                        var15_15.b((EC1)var19_19);
                                                        break block77;
lbl105:
                                                        // 2 sources

                                                        return;
                                                    }
                                                    var22_23 = var6_6;
                                                    var6_6 = var4_4;
                                                    var6_6 = (View)var4_4;
                                                    var6_6 = var6_6.getBackground();
                                                    var24_26 = var6_6 instanceof yc1_1;
                                                    if (!var24_26) ** GOTO lbl239
                                                    var4_4 = (View)var4_4;
                                                    var4_4 = var4_4.getBackground();
                                                    var6_6 = "null cannot be cast to non-null type com.airbnb.lottie.LottieDrawable";
                                                    Intrinsics.checkNotNull(var4_4, (String)var6_6);
                                                    var6_6 = var4_4;
                                                    var6_6 = (yc1_1)var4_4;
                                                }
                                                var25_27 = var5_5 /* !! */ .has(var14_14);
                                                if (var25_27 == 0) break block78;
                                                var4_4 = "reverse";
                                                var15_15 = "";
                                                var14_14 = var5_5 /* !! */ .optString(var14_14, (String)var15_15);
                                                var25_27 = Intrinsics.areEqual(var4_4, var14_14);
                                                var21_22 = var25_27 != 0 ? 2 : 1;
                                                var4_4 = var6_6.b;
                                                var4_4.setRepeatMode(var21_22);
                                            }
                                            var25_27 = var5_5 /* !! */ .has(var13_13 /* !! */ );
                                            var14_14 = null;
                                            if (var25_27 == 0) break block79;
                                            var25_27 = var5_5 /* !! */ .optInt(var13_13 /* !! */ , 0);
                                            if (var25_27 >= 0) ** GOTO lbl154
                                            var4_4 = var6_6.b;
                                            var26_28 = -1;
                                            var4_4.setRepeatCount(var26_28);
                                            break block79;
lbl154:
                                            // 1 sources

                                            var13_13 /* !! */  = var6_6.b;
                                            var13_13 /* !! */ .setRepeatCount(var25_27);
                                        }
                                        var25_27 = var5_5 /* !! */ .has(var12_12 /* !! */ );
                                        if (var25_27 == 0) break block80;
                                        var27_29 = 1.0;
                                        var29_30 = var5_5 /* !! */ .optDouble(var12_12 /* !! */ , var27_29);
                                        var31_31 = (float)var29_30;
                                        var12_12 /* !! */  = var6_6.b;
                                        var12_12 /* !! */ .d = var31_31;
                                    }
                                    var25_27 = (int)var5_5 /* !! */ .has(var11_11);
                                    if (var25_27 == 0) break block81;
                                    var25_27 = var5_5 /* !! */ .optInt(var11_11, 0);
                                    if (var25_27 < 0) break block81;
                                    var6_6.y(var25_27);
                                }
                                var25_27 = (int)var5_5 /* !! */ .has(var10_10);
                                if (var25_27 == 0) break block82;
                                var25_27 = var5_5 /* !! */ .optInt(var10_10, 0);
                                if (var25_27 < 0) break block82;
                                var6_6.r(var25_27);
                            }
                            var25_27 = (int)var5_5 /* !! */ .has(var9_9);
                            var32_32 = 1.0f;
                            var11_11 = null;
                            var29_30 = 0.0;
                            if (var25_27 == 0) break block83;
                            var27_29 = var5_5 /* !! */ .optDouble(var9_9, var29_30);
                            var31_31 = (float)var27_29;
                            cfr_temp_0 = 0.0f - var31_31;
                            var33_33 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                            if (var33_33 <= 0 && (var33_33 = var31_31 == var32_32 ? 0 : (var31_31 < var32_32 ? -1 : 1)) <= 0) {
                                var6_6.A(var31_31);
                            }
                        }
                        var25_27 = (int)var5_5 /* !! */ .has(var8_8);
                        if (var25_27 == 0) break block84;
                        var34_34 = var5_5 /* !! */ .optDouble(var8_8, var29_30);
                        var31_31 = (float)var34_34;
                        cfr_temp_1 = 0.0f - var31_31;
                        var36_35 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                        if (var36_35 <= 0 && (var36_35 = var31_31 == var32_32 ? 0 : (var31_31 < var32_32 ? -1 : 1)) <= 0) {
                            var6_6.t(var31_31);
                        }
                    }
                    var25_27 = (int)var5_5 /* !! */ .has(var7_7);
                    if (var25_27 == 0) break block85;
                    var25_27 = (int)var5_5 /* !! */ .optBoolean(var7_7, false);
                    var6_6.e = var25_27;
                }
                var4_4 = var22_23;
                var37_36 = var5_5 /* !! */ .has((String)var22_23);
                if (var37_36 == 0) break block86;
                var37_36 = 255;
                var25_27 = var5_5 /* !! */ .optInt((String)var22_23, var37_36);
                if (var25_27 < 0 || var25_27 >= (var20_21 = 256)) break block86;
                var6_6.setAlpha(var25_27);
            }
            if (var17_17 == 0) ** GOTO lbl238
            var6_6.start();
            break block87;
lbl238:
            // 1 sources

            var6_6.stop();
        }
    }
}

