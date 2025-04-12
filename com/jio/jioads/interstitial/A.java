/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.CountDownTimer
 *  android.text.TextUtils
 */
package com.jio.jioads.interstitial;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.text.TextUtils;
import com.jio.jioads.R$drawable;
import com.jio.jioads.interstitial.InterstitialActivity;
import com.jio.jioads.interstitial.z;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class A
extends CountDownTimer {
    public final /* synthetic */ InterstitialActivity a;

    public A(InterstitialActivity interstitialActivity, long l2) {
        this.a = interstitialActivity;
        super(l2, 1000L);
    }

    public final void onFinish() {
        InterstitialActivity interstitialActivity = this.a;
        Object object = new z(interstitialActivity);
        long l2 = 1000L;
        s.b(l2, (Function0)object);
        int n3 = InterstitialActivity.access$isRewardedAd(interstitialActivity);
        int n4 = 8;
        boolean bl2 = true;
        float f5 = 1.0f;
        if (n3 != 0) {
            object = InterstitialActivity.access$getTxtvRewardAd$p(interstitialActivity);
            if (object != null) {
                object.setAlpha(f5);
            }
            object = InterstitialActivity.access$getTxtvRewardAd$p(interstitialActivity);
            if (object != null) {
                object.setFocusable(bl2);
            }
            object = InterstitialActivity.access$getTxtvCloseAd$p(interstitialActivity);
            if (object != null) {
                object.setVisibility(n4);
            }
        } else {
            object = InterstitialActivity.access$getTxtvCloseAd$p(interstitialActivity);
            if (object != null) {
                object.setAlpha(f5);
            }
            object = InterstitialActivity.access$getTxtvCloseAd$p(interstitialActivity);
            if (object != null) {
                object.setFocusable(bl2);
            }
            object = InterstitialActivity.access$getTxtvRewardAd$p(interstitialActivity);
            if (object != null) {
                object.setVisibility(n4);
            }
        }
        l2 = 0L;
        InterstitialActivity.access$setRemainingTime$p(interstitialActivity, l2);
        object = InterstitialActivity.access$getMSkipDelay$p(interstitialActivity);
        InterstitialActivity.access$setServedDuration$p(interstitialActivity, (Integer)object);
        object = InterstitialActivity.access$getMSkipDelay$p(interstitialActivity);
        InterstitialActivity.access$setTotalDuration$p(interstitialActivity, (Integer)object);
        object = Utility.INSTANCE;
        n3 = ((Utility)object).getCurrentUIModeType((Context)interstitialActivity);
        n4 = 4;
        if (n3 == n4) {
            object = InterstitialActivity.access$getCustomContainerPortrait$p(interstitialActivity);
            if (object == null || (n3 = ((Integer)object).intValue()) != (n4 = -1)) {
                String string2;
                object = InterstitialActivity.access$getSkipAdText$p(interstitialActivity);
                n3 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
                if (n3 == 0) {
                    object = InterstitialActivity.access$getTxtvCloseAd$p(interstitialActivity);
                    if (object != null) {
                        string2 = InterstitialActivity.access$getSkipAdText$p(interstitialActivity);
                        object.setText((CharSequence)string2);
                    }
                    interstitialActivity.restrictBackPress();
                }
                if ((n3 = (int)(TextUtils.isEmpty((CharSequence)(object = InterstitialActivity.access$getRewardAfterText$p(interstitialActivity))) ? 1 : 0)) == 0) {
                    object = InterstitialActivity.access$getTxtvRewardAd$p(interstitialActivity);
                    if (object != null) {
                        string2 = InterstitialActivity.access$getRewardAfterText$p(interstitialActivity);
                        object.setText((CharSequence)string2);
                    }
                    interstitialActivity.restrictBackPress();
                }
            } else {
                InterstitialActivity.access$handleClose(interstitialActivity);
                interstitialActivity.allowBackPress();
            }
        } else {
            InterstitialActivity.access$handleClose(interstitialActivity);
            interstitialActivity.allowBackPress();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onTick(long var1_1) {
        block46: {
            block48: {
                block47: {
                    block43: {
                        block45: {
                            block44: {
                                var3_2 = this.a;
                                var4_3 = 1;
                                InterstitialActivity.access$setAdSkipCounterRunning$p(var3_2, (boolean)var4_3);
                                var5_4 = 1000;
                                var6_5 = var5_4;
                                InterstitialActivity.access$setRemainingTime$p(var3_2, var1_1 /= var6_5);
                                var8_6 = InterstitialActivity.access$isRewardedAd(var3_2);
                                var6_5 = 0L;
                                var9_7 = 17;
                                var10_8 = -16777216;
                                var11_9 = 32;
                                var12_10 = "SKIP_COUNTER";
                                var13_11 = 0.5f;
                                var14_12 = 8;
                                if (var8_6 == 0) break block43;
                                var15_13 = InterstitialActivity.access$getTxtvRewardAd$p(var3_2);
                                if (var15_13 != null) {
                                    var15_13.setVisibility(0);
                                }
                                var15_13 = InterstitialActivity.access$getTxtvCloseAd$p(var3_2);
                                if (var15_13 != null) {
                                    var15_13.setVisibility(var14_12);
                                }
                                var15_13 = InterstitialActivity.access$getTxtvRewardAd$p(var3_2);
                                if (var15_13 != null) {
                                    var15_13.setAlpha(var13_11);
                                }
                                var15_13 = Utility.INSTANCE;
                                var8_6 = var15_13.getCurrentUIModeType((Context)var3_2);
                                var13_11 = 0.0f;
                                var16_15 = 4;
                                var17_16 = 3;
                                if (var8_6 == var16_15) {
                                    var15_13 = InterstitialActivity.access$getTxtvRewardAd$p(var3_2);
                                    if (var15_13 != null) {
                                        var18_17 = InterstitialActivity.access$getRewardAdDrawables$p(var3_2);
                                        if (var18_17 != null) {
                                            var19_19 /* !! */  = (Drawable)tp_2.E(var4_3, var18_17);
                                        } else {
                                            var4_3 = 0;
                                            var19_19 /* !! */  = null;
                                        }
                                        var19_19 /* !! */  = InterstitialActivity.access$getBoundedDrawable(var3_2, var19_19 /* !! */ );
                                        var18_17 = InterstitialActivity.access$getRewardAdDrawables$p(var3_2);
                                        if (var18_17 != null) {
                                            var18_17 = (Drawable[])tp_2.E(var17_16, var18_17);
                                        } else {
                                            var16_15 = 0;
                                            var18_17 = null;
                                        }
                                        var18_17 = InterstitialActivity.access$getBoundedDrawable(var3_2, (Drawable)var18_17);
                                        var15_13.setCompoundDrawables(null, var19_19 /* !! */ , null, (Drawable)var18_17);
                                    }
                                } else {
                                    var15_13 = InterstitialActivity.access$getTxtvRewardAd$p(var3_2);
                                    if (var15_13 != null) {
                                        var18_18 = InterstitialActivity.access$getRewardAdDrawables$p(var3_2);
                                        if (var18_18 != null) {
                                            var19_19 /* !! */  = (Drawable)tp_2.E(var4_3, var18_18);
                                        } else {
                                            var4_3 = 0;
                                            var19_19 /* !! */  = null;
                                        }
                                        var19_19 /* !! */  = InterstitialActivity.access$getBoundedDrawable(var3_2, var19_19 /* !! */ );
                                        var18_18 = InterstitialActivity.access$getRewardAdDrawables$p(var3_2);
                                        if (var18_18 != null) {
                                            var20_21 = 2;
                                            var18_18 = (Drawable[])tp_2.E(var20_21, var18_18);
                                        } else {
                                            var16_15 = 0;
                                            var18_18 = null;
                                        }
                                        var18_18 = InterstitialActivity.access$getBoundedDrawable(var3_2, (Drawable)var18_18);
                                        var21_22 = InterstitialActivity.access$getRewardAdDrawables$p(var3_2);
                                        if (var21_22 != null) {
                                            var22_23 = (Drawable)tp_2.E(var17_16, var21_22);
                                        } else {
                                            var17_16 = 0;
                                            var22_23 = null;
                                        }
                                        var22_23 = InterstitialActivity.access$getBoundedDrawable(var3_2, var22_23);
                                        var15_13.setCompoundDrawables(null, var19_19 /* !! */ , (Drawable)var18_18, var22_23);
                                    }
                                }
                                if ((var8_6 = (int)TextUtils.isEmpty((CharSequence)(var15_13 = InterstitialActivity.access$getRewardAfterText$p(var3_2)))) != 0) break block44;
                                var15_13 = InterstitialActivity.access$getRewardAfterText$p(var3_2);
                                if (var15_13 == null) ** GOTO lbl-1000
                                var15_13 = InterstitialActivity.access$getRewardAfterText$p(var3_2);
                                Intrinsics.checkNotNull(var15_13);
                                var8_6 = (int)StringsKt.F((CharSequence)var15_13, var12_10, false);
                                if (var8_6 != 0) {
                                    var15_13 = InterstitialActivity.access$getRewardAfterText$p(var3_2);
                                    Intrinsics.checkNotNull(var15_13);
                                    var23_24 = InterstitialActivity.access$getRemainingTime$p(var3_2);
                                    var19_19 /* !! */  = String.valueOf(var23_24);
                                    var15_13 = b.n((String)var15_13, var12_10, (String)var19_19 /* !! */ , false);
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var15_13 = new StringBuilder();
                                    var19_19 /* !! */  = InterstitialActivity.access$getRewardAfterText$p(var3_2);
                                    var15_13.append((String)var19_19 /* !! */ );
                                    var15_13.append((char)var11_9);
                                    var25_26 = InterstitialActivity.access$getRemainingTime$p(var3_2);
                                    var15_13.append(var25_26);
                                    var15_13 = var15_13.toString();
                                }
                                break block45;
                            }
                            var25_27 = InterstitialActivity.access$getRemainingTime$p(var3_2);
                            var15_13 = String.valueOf(var25_27);
                        }
                        var19_19 /* !! */  = InterstitialActivity.access$getRewardAfterText$p(var3_2);
                        var4_3 = (int)TextUtils.isEmpty((CharSequence)var19_19 /* !! */ );
                        if (var4_3 != 0) {
                            var19_19 /* !! */  = InterstitialActivity.access$getTxtvRewardAd$p(var3_2);
                            if (var19_19 /* !! */  != null) {
                                var11_9 = R$drawable.circle_black_background;
                                var27_30 = t70.getDrawable((Context)var3_2, var11_9);
                                var19_19 /* !! */ .setBackground(var27_30);
                            }
                            var19_19 /* !! */  = InterstitialActivity.access$getTxtvRewardAd$p(var3_2);
                            if (var19_19 /* !! */  != null) {
                                var19_19 /* !! */ .setTextColor(var10_8);
                            }
                            if ((var19_19 /* !! */  = InterstitialActivity.access$getTxtvRewardAd$p(var3_2)) != null) {
                                var19_19 /* !! */ .setGravity(var9_7);
                            }
                        }
                        if ((var28_32 = InterstitialActivity.access$getTxtvRewardAd$p(var3_2)) != null) {
                            var28_32.setText((CharSequence)var15_13);
                        }
                        var15_13 = InterstitialActivity.access$getTxtvRewardAd$p(var3_2);
                        if (var15_13 != null) {
                            var15_13.setVisibility(0);
                        }
                        var15_13 = InterstitialActivity.access$getTxtvCustomContainerCloseAd$p(var3_2);
                        if (var15_13 != null) {
                            var15_13.setVisibility(var14_12);
                        }
                        var1_1 = InterstitialActivity.access$getRemainingTime$p(var3_2);
                        var4_3 = (int)(var1_1 == var6_5 ? 0 : (var1_1 < var6_5 ? -1 : 1));
                        if (var4_3 == 0) {
                            this.onFinish();
                        }
                        if ((var15_13 = InterstitialActivity.access$getTxtvRewardAd$p(var3_2)) != null) {
                            var15_13.setFocusable(false);
                        }
                        var3_2.restrictBackPress();
                        break block46;
                    }
                    var15_14 = InterstitialActivity.access$getTxtvRewardAd$p(var3_2);
                    if (var15_14 != null) {
                        var15_14.setVisibility(var14_12);
                    }
                    var15_14 = InterstitialActivity.access$getTxtvCloseAd$p(var3_2);
                    if (var15_14 != null) {
                        var15_14.setVisibility(0);
                    }
                    var15_14 = InterstitialActivity.access$getTxtvCloseAd$p(var3_2);
                    if (var15_14 != null) {
                        var15_14.setAlpha(var13_11);
                    }
                    var15_14 = InterstitialActivity.access$getSkipAfterText$p(var3_2);
                    var8_6 = (int)TextUtils.isEmpty((CharSequence)var15_14);
                    if (var8_6 != 0) break block47;
                    var15_14 = InterstitialActivity.access$getSkipAfterText$p(var3_2);
                    if (var15_14 == null) ** GOTO lbl-1000
                    var15_14 = InterstitialActivity.access$getSkipAfterText$p(var3_2);
                    Intrinsics.checkNotNull(var15_14);
                    var8_6 = (int)StringsKt.F((CharSequence)var15_14, var12_10, false);
                    if (var8_6 != 0) {
                        var15_14 = InterstitialActivity.access$getSkipAfterText$p(var3_2);
                        Intrinsics.checkNotNull(var15_14);
                        var23_25 = InterstitialActivity.access$getRemainingTime$p(var3_2);
                        var19_20 = String.valueOf(var23_25);
                        var15_14 = b.n((String)var15_14, var12_10, var19_20, false);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var15_14 = new StringBuilder();
                        var19_20 = InterstitialActivity.access$getSkipAfterText$p(var3_2);
                        var15_14.append(var19_20);
                        var15_14.append((char)var11_9);
                        var25_28 = InterstitialActivity.access$getRemainingTime$p(var3_2);
                        var15_14.append(var25_28);
                        var15_14 = var15_14.toString();
                    }
                    break block48;
                }
                var25_29 = InterstitialActivity.access$getRemainingTime$p(var3_2);
                var15_14 = String.valueOf(var25_29);
            }
            var19_20 = InterstitialActivity.access$getSkipAfterText$p(var3_2);
            var4_3 = TextUtils.isEmpty((CharSequence)var19_20);
            if (var4_3 != 0) {
                var19_20 = InterstitialActivity.access$getTxtvCloseAd$p(var3_2);
                if (var19_20 != null) {
                    var11_9 = R$drawable.circle_black_background;
                    var27_31 = t70.getDrawable((Context)var3_2, var11_9);
                    var19_20.setBackground(var27_31);
                }
                var19_20 = InterstitialActivity.access$getTxtvCloseAd$p(var3_2);
                if (var19_20 != null) {
                    var19_20.setTextColor(var10_8);
                }
                if ((var19_20 = InterstitialActivity.access$getTxtvCloseAd$p(var3_2)) != null) {
                    var19_20.setGravity(var9_7);
                }
            }
            if ((var28_33 = InterstitialActivity.access$getTxtvCloseAd$p(var3_2)) != null) {
                var28_33.setText((CharSequence)var15_14);
            }
            var15_14 = InterstitialActivity.access$getTxtvCloseAd$p(var3_2);
            if (var15_14 != null) {
                var15_14.setVisibility(0);
            }
            var15_14 = InterstitialActivity.access$getTxtvCustomContainerCloseAd$p(var3_2);
            if (var15_14 != null) {
                var15_14.setVisibility(var14_12);
            }
            var1_1 = InterstitialActivity.access$getRemainingTime$p(var3_2);
            var4_3 = (int)(var1_1 == var6_5 ? 0 : (var1_1 < var6_5 ? -1 : 1));
            if (var4_3 == 0) {
                this.onFinish();
            }
            if ((var15_14 = InterstitialActivity.access$getTxtvCloseAd$p(var3_2)) != null) {
                var15_14.setFocusable(false);
            }
            var3_2.restrictBackPress();
            var8_6 = InterstitialActivity.access$getMSkipDelay$p(var3_2);
            var9_7 = -1;
            if (var8_6 == var9_7 && (var15_14 = InterstitialActivity.access$getTxtvCloseAd$p(var3_2)) != null) {
                var15_14.setVisibility(var14_12);
            }
        }
    }
}

