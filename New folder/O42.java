/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$Style
 *  android.app.PendingIntent
 *  android.graphics.Bitmap
 *  android.os.Build$VERSION
 *  android.os.SystemClock
 *  android.widget.RemoteViews
 */
import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.SystemClock;
import android.widget.RemoteViews;
import androidx.core.R$color;
import androidx.core.R$dimen;
import androidx.core.R$id;
import androidx.core.R$integer;
import androidx.core.R$layout;
import androidx.core.R$string;
import androidx.core.graphics.drawable.IconCompat;
import java.text.NumberFormat;
import java.util.ArrayList;

public final class O42
extends U42 {
    public final void b(V42 v42) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            v42 = v42.b;
            Notification.Style style2 = O42$a.a();
            v42.setStyle(style2);
        }
    }

    public final String f() {
        return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }

    public final RemoteViews g() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            return null;
        }
        J42 j42 = this.a;
        RemoteViews remoteViews = j42.H;
        if (remoteViews == null) {
            remoteViews = j42.G;
        }
        if (remoteViews == null) {
            return null;
        }
        return this.l(remoteViews, true);
    }

    public final RemoteViews h() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            return null;
        }
        RemoteViews remoteViews = this.a.G;
        if (remoteViews == null) {
            return null;
        }
        return this.l(remoteViews, false);
    }

    public final void i() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            return;
        }
        this.a.getClass();
        RemoteViews cfr_ignored_0 = this.a.G;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final RemoteViews l(RemoteViews var1_1, boolean var2_2) {
        var3_3 = R$layout.notification_template_custom_big;
        var4_4 = this.a.a.getResources();
        var6_6 = this.a.a.getPackageName();
        var5_5 = new RemoteViews((String)var6_6, var3_3);
        var7_7 = this.a;
        var8_8 = var7_7.l;
        var9_9 = Build.VERSION.SDK_INT;
        var6_6 = var7_7.i;
        if (var6_6 != null) {
            var3_3 = R$id.icon;
            var5_5.setViewVisibility(var3_3, 0);
            var3_3 = R$id.icon;
            var6_6 = this.a.i;
            var6_6 = this.d((IconCompat)var6_6, 0, 0);
            var5_5.setImageViewBitmap(var3_3, (Bitmap)var6_6);
            var7_7 = this.a.P;
            var3_3 = var7_7.icon;
            if (var3_3 != 0) {
                var3_3 = R$dimen.notification_right_icon_size;
                var3_3 = var4_4.getDimensionPixelSize(var3_3);
                var8_8 = R$dimen.notification_small_icon_background_padding;
                var8_8 = var4_4.getDimensionPixelSize(var8_8) * 2;
                var8_8 = var3_3 - var8_8;
                var10_10 = this.a;
                var11_11 /* !! */  = var10_10.P;
                var12_12 = var11_11 /* !! */ .icon;
                var13_13 = var10_10.D;
                var7_7 = this.e(var12_12, var3_3, var8_8, var13_13);
                var8_8 = R$id.right_icon;
                var5_5.setImageViewBitmap(var8_8, (Bitmap)var7_7);
                var3_3 = R$id.right_icon;
                var5_5.setViewVisibility(var3_3, 0);
            }
        } else {
            var7_7 = var7_7.P;
            var3_3 = var7_7.icon;
            if (var3_3 != 0) {
                var3_3 = R$id.icon;
                var5_5.setViewVisibility(var3_3, 0);
                var3_3 = R$dimen.notification_large_icon_width;
                var3_3 = var4_4.getDimensionPixelSize(var3_3);
                var8_8 = R$dimen.notification_big_circle_margin;
                var8_8 = var4_4.getDimensionPixelSize(var8_8);
                var3_3 -= var8_8;
                var8_8 = R$dimen.notification_small_icon_size_as_large;
                var8_8 = var4_4.getDimensionPixelSize(var8_8);
                var10_10 = this.a;
                var11_11 /* !! */  = var10_10.P;
                var12_12 = var11_11 /* !! */ .icon;
                var13_13 = var10_10.D;
                var7_7 = this.e(var12_12, var3_3, var8_8, var13_13);
                var8_8 = R$id.icon;
                var5_5.setImageViewBitmap(var8_8, (Bitmap)var7_7);
            }
        }
        if ((var7_7 = this.a.e) != null) {
            var8_8 = R$id.title;
            var5_5.setTextViewText(var8_8, (CharSequence)var7_7);
        }
        var7_7 = this.a.f;
        var14_14 = true;
        if (var7_7 != null) {
            var8_8 = R$id.text;
            var5_5.setTextViewText(var8_8, (CharSequence)var7_7);
            var3_3 = 1;
        } else {
            var3_3 = 0;
            var7_7 = null;
        }
        var6_6 = this.a;
        var10_10 = var6_6.j;
        var15_15 = 8;
        if (var10_10 != null) {
            var3_3 = R$id.info;
            var5_5.setTextViewText(var3_3, (CharSequence)var10_10);
            var3_3 = R$id.info;
            var5_5.setViewVisibility(var3_3, 0);
lbl73:
            // 2 sources

            while (true) {
                var3_3 = 1;
                var16_16 = 1;
                var17_18 = 1.4E-45f;
                break;
            }
        } else {
            var8_8 = var6_6.k;
            if (var8_8 > 0) {
                var3_3 = R$integer.status_bar_notification_info_maxnum;
                var3_3 = var4_4.getInteger(var3_3);
                var6_6 = this.a;
                var8_8 = var6_6.k;
                if (var8_8 > var3_3) {
                    var3_3 = R$id.info;
                    var8_8 = R$string.status_bar_notification_info_overflow;
                    var4_4 = var4_4.getString(var8_8);
                    var5_5.setTextViewText(var3_3, (CharSequence)var4_4);
                } else {
                    var7_7 = NumberFormat.getIntegerInstance();
                    var16_16 = R$id.info;
                    var6_6 = this.a;
                    var8_8 = var6_6.k;
                    var18_17 = var8_8;
                    var7_7 = var7_7.format(var18_17);
                    var5_5.setTextViewText(var16_16, (CharSequence)var7_7);
                }
                var3_3 = R$id.info;
                var5_5.setViewVisibility(var3_3, 0);
                ** continue;
            }
            var16_16 = R$id.info;
            var5_5.setViewVisibility(var16_16, var15_15);
            var16_16 = 0;
            var17_18 = 0.0f;
            var4_4 = null;
        }
        var6_6 = this.a.q;
        if (var6_6 != null) {
            var13_13 = R$id.text;
            var5_5.setTextViewText(var13_13, (CharSequence)var6_6);
            var6_6 = this.a.f;
            if (var6_6 != null) {
                var13_13 = R$id.text2;
                var5_5.setTextViewText(var13_13, (CharSequence)var6_6);
                var8_8 = R$id.text2;
                var5_5.setViewVisibility(var8_8, 0);
                var13_13 = R$id.line1;
                var20_19 = 0;
                var21_20 = null;
                var22_21 = 0;
                var12_12 = 0;
                var11_11 /* !! */  = null;
                var23_22 = 0;
                var24_23 = null;
                var6_6 = var5_5;
                var5_5.setViewPadding(var13_13, 0, 0, 0, 0);
            } else {
                var8_8 = R$id.text2;
                var5_5.setViewVisibility(var8_8, var15_15);
            }
        }
        var6_6 = this.a;
        var13_13 = (int)var6_6.m;
        var25_24 = 0L;
        if (var13_13 != 0) {
            var10_10 = var6_6.P;
            var27_25 = var10_10.when;
        } else {
            var27_25 = var25_24;
        }
        var13_13 = (int)(var27_25 == var25_24 ? 0 : (var27_25 < var25_24 ? -1 : 1));
        if (var13_13 != 0) {
            var16_16 = (int)var6_6.n;
            if (var16_16 != 0) {
                var16_16 = R$id.chronometer;
                var5_5.setViewVisibility(var16_16, 0);
                var16_16 = R$id.chronometer;
                var6_6 = this.a;
                var13_13 = (int)var6_6.m;
                if (var13_13 != 0) {
                    var6_6 = var6_6.P;
                    var25_24 = var6_6.when;
                }
                var18_17 = SystemClock.elapsedRealtime();
                var27_25 = System.currentTimeMillis();
                var18_17 = var18_17 - var27_25 + var25_24;
                var11_11 /* !! */  = "setBase";
                var5_5.setLong(var16_16, (String)var11_11 /* !! */ , var18_17);
                var16_16 = R$id.chronometer;
                var6_6 = "setStarted";
                var5_5.setBoolean(var16_16, (String)var6_6, var14_14);
                var4_4 = this.a;
                var16_16 = (int)var4_4.o;
                if (var16_16 != 0) {
                    var8_8 = 24;
                    var29_26 = 3.4E-44f;
                    if (var9_9 >= var8_8) {
                        var8_8 = R$id.chronometer;
                        U42$a.a(var5_5, var8_8, (boolean)var16_16);
                    }
                }
            } else {
                var16_16 = R$id.time;
                var5_5.setViewVisibility(var16_16, 0);
                var16_16 = R$id.time;
                var6_6 = this.a;
                var13_13 = (int)var6_6.m;
                if (var13_13 != 0) {
                    var6_6 = var6_6.P;
                    var25_24 = var6_6.when;
                }
                var6_6 = "setTime";
                var5_5.setLong(var16_16, (String)var6_6, var25_24);
            }
            var16_16 = 1;
            var17_18 = 1.4E-45f;
        }
        var8_8 = R$id.right_side;
        if (var16_16 != 0) {
            var16_16 = 0;
            var17_18 = 0.0f;
            var4_4 = null;
        } else {
            var16_16 = 8;
            var17_18 = 1.1E-44f;
        }
        var5_5.setViewVisibility(var8_8, var16_16);
        var16_16 = R$id.line3;
        if (var3_3 != 0) {
            var3_3 = 0;
            var7_7 = null;
        } else {
            var3_3 = 8;
        }
        var5_5.setViewVisibility(var16_16, var3_3);
        var3_3 = R$id.actions;
        var5_5.removeAllViews(var3_3);
        var7_7 = this.a.b;
        if (var7_7 == null) {
            var3_3 = 0;
            var7_7 = null;
        } else {
            var4_4 = new ArrayList();
            var7_7 = var7_7.iterator();
            while ((var8_8 = (int)var7_7.hasNext()) != 0) {
                var6_6 = (A42)var7_7.next();
                var13_13 = (int)var6_6.g;
                if (var13_13 != 0) continue;
                var4_4.add(var6_6);
            }
            var7_7 = var4_4;
        }
        if (var2_2 == 0 || var7_7 == null) ** GOTO lbl-1000
        var2_2 = var7_7.size();
        var16_16 = 3;
        var17_18 = 4.2E-45f;
        if ((var2_2 = Math.min(var2_2, var16_16)) > 0) {
            var17_18 = 0.0f;
            var4_4 = null;
            for (var16_16 = 0; var16_16 < var2_2; ++var16_16) {
                var6_6 = (A42)var7_7.get(var16_16);
                var10_10 = var6_6.j;
                if (var10_10 == null) {
                    var13_13 = 1;
                } else {
                    var13_13 = 0;
                    var10_10 = null;
                }
                var24_23 = this.a.a.getPackageName();
                var20_19 = var13_13 != 0 ? R$layout.notification_action_tombstone : R$layout.notification_action;
                var11_11 /* !! */  = new RemoteViews((String)var24_23, var20_19);
                var24_23 = var6_6.a();
                if (var24_23 != null) {
                    var20_19 = R$id.action_image;
                    var22_21 = R$color.notification_action_color_filter;
                    var24_23 = this.d((IconCompat)var24_23, var22_21, 0);
                    var11_11 /* !! */ .setImageViewBitmap(var20_19, (Bitmap)var24_23);
                }
                var23_22 = R$id.action_text;
                var21_20 = var6_6.i;
                var11_11 /* !! */ .setTextViewText(var23_22, var21_20);
                if (var13_13 == 0) {
                    var13_13 = R$id.action_container;
                    var6_6 = var6_6.j;
                    var11_11 /* !! */ .setOnClickPendingIntent(var13_13, (PendingIntent)var6_6);
                }
                var8_8 = R$id.action_container;
                var11_11 /* !! */ .setContentDescription(var8_8, var21_20);
                var8_8 = R$id.actions;
                var5_5.addView(var8_8, (RemoteViews)var11_11 /* !! */ );
            }
            var2_2 = 0;
            var30_27 = 0.0f;
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = 8;
            var30_27 = 1.1E-44f;
        }
        var3_3 = R$id.actions;
        var5_5.setViewVisibility(var3_3, var2_2);
        var3_3 = R$id.action_divider;
        var5_5.setViewVisibility(var3_3, var2_2);
        var2_2 = R$id.title;
        var5_5.setViewVisibility(var2_2, var15_15);
        var2_2 = R$id.text2;
        var5_5.setViewVisibility(var2_2, var15_15);
        var2_2 = R$id.text;
        var5_5.setViewVisibility(var2_2, var15_15);
        var2_2 = R$id.notification_main_column;
        var5_5.removeAllViews(var2_2);
        var2_2 = R$id.notification_main_column;
        var1_1 = var1_1.clone();
        var5_5.addView(var2_2, var1_1);
        var31_28 = R$id.notification_main_column;
        var5_5.setViewVisibility(var31_28, 0);
        var1_1 = this.a.a.getResources();
        var2_2 = R$dimen.notification_top_pad;
        var2_2 = var1_1.getDimensionPixelSize(var2_2);
        var3_3 = R$dimen.notification_top_pad_large_text;
        var3_3 = var1_1.getDimensionPixelSize(var3_3);
        var1_1 = var1_1.getConfiguration();
        var32_29 = var1_1.fontScale;
        var16_16 = 1065353216;
        var17_18 = 1.0f;
        var8_8 = (int)(var32_29 == var17_18 ? 0 : (var32_29 < var17_18 ? -1 : 1));
        if (var8_8 < 0) {
            var31_28 = 1065353216;
            var32_29 = 1.0f;
        } else {
            var8_8 = 1067869798;
            var29_26 = 1.3f;
            cfr_temp_0 = var32_29 - var29_26;
            var13_13 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
            if (var13_13 > 0) {
                var31_28 = 1067869798;
                var32_29 = 1.3f;
            }
        }
        var32_29 = (var32_29 - var17_18) / 0.29999995f;
        var17_18 -= var32_29;
        var30_27 = var2_2;
        var17_18 *= var30_27;
        var30_27 = var3_3;
        var23_22 = Math.round(var32_29 * var30_27 + var17_18);
        var13_13 = R$id.notification_main_column_container;
        var6_6 = var5_5;
        var5_5.setViewPadding(var13_13, 0, var23_22, 0, 0);
        return var5_5;
    }
}

