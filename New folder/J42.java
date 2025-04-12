/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Notification$Action
 *  android.app.Notification$BigPictureStyle
 *  android.app.Notification$BigTextStyle
 *  android.app.Notification$BubbleMetadata
 *  android.app.Notification$Builder
 *  android.app.Notification$InboxStyle
 *  android.app.PendingIntent
 *  android.app.RemoteInput
 *  android.content.Context
 *  android.content.LocusId
 *  android.graphics.Bitmap
 *  android.graphics.drawable.Icon
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.widget.RemoteViews
 */
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.R$dimen;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.graphics.drawable.IconCompat$a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public final class J42 {
    public boolean A;
    public final String B;
    public Bundle C;
    public int D;
    public int E;
    public final Notification F;
    public RemoteViews G;
    public RemoteViews H;
    public String I;
    public int J;
    public final String K;
    public final Ew1 L;
    public long M;
    public final boolean N;
    public final H42 O;
    public final Notification P;
    public final Object Q;
    public final ArrayList R;
    public final Context a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public final PendingIntent h;
    public IconCompat i;
    public final CharSequence j;
    public int k;
    public int l;
    public boolean m;
    public final boolean n;
    public final boolean o;
    public U42 p;
    public CharSequence q;
    public final CharSequence r;
    public final int s;
    public final int t;
    public final boolean u;
    public final String v;
    public final boolean w;
    public final String x;
    public boolean y;
    public boolean z;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public J42(Context var1_1, Notification var2_2) {
        block108: {
            block109: {
                block112: {
                    block113: {
                        block119: {
                            block118: {
                                block117: {
                                    block116: {
                                        block115: {
                                            block114: {
                                                block111: {
                                                    block110: {
                                                        var3_3 = this;
                                                        var4_4 = var2_2;
                                                        var5_5 = 4;
                                                        var6_6 = 2;
                                                        var7_7 = Build.VERSION.SDK_INT;
                                                        var8_8 = 26;
                                                        if (var7_7 >= var8_8) {
                                                            var9_9 = B42.b(var2_2);
                                                            var10_10 = var1_1;
                                                        } else {
                                                            var10_10 = var1_1;
                                                            var11_11 = 0;
                                                            var9_9 = null;
                                                        }
                                                        var3_3((Context)var10_10, (String)var9_9);
                                                        var9_9 = var4_4.extras;
                                                        var12_12 = 24;
                                                        if (var9_9 == null) lbl-1000:
                                                        // 3 sources

                                                        {
                                                            while (true) {
                                                                var13_13 = false;
                                                                var14_14 = null;
                                                                break block108;
                                                                break;
                                                            }
                                                        }
                                                        var14_14 = var9_9.getString("androidx.core.app.extra.COMPAT_TEMPLATE");
                                                        if (var14_14 == null) break block110;
                                                        var15_15 = -1;
                                                        var16_16 = var14_14.hashCode();
                                                        switch (var16_16) {
                                                            default: {
                                                                break;
                                                            }
                                                            case 2090799565: {
                                                                var17_17 = "androidx.core.app.NotificationCompat$MessagingStyle";
                                                                var13_13 = var14_14.equals(var17_17);
                                                                if (!var13_13) break;
                                                                var15_15 = 5;
                                                                break;
                                                            }
                                                            case 919595044: {
                                                                var17_17 = "androidx.core.app.NotificationCompat$BigTextStyle";
                                                                var13_13 = var14_14.equals(var17_17);
                                                                if (!var13_13) break;
                                                                var15_15 = 4;
                                                                break;
                                                            }
                                                            case 912942987: {
                                                                var17_17 = "androidx.core.app.NotificationCompat$InboxStyle";
                                                                var13_13 = var14_14.equals(var17_17);
                                                                if (!var13_13) break;
                                                                var15_15 = 3;
                                                                break;
                                                            }
                                                            case 714386739: {
                                                                var17_17 = "androidx.core.app.NotificationCompat$CallStyle";
                                                                var13_13 = var14_14.equals(var17_17);
                                                                if (!var13_13) break;
                                                                var15_15 = 2;
                                                                break;
                                                            }
                                                            case -171946061: {
                                                                var17_17 = "androidx.core.app.NotificationCompat$BigPictureStyle";
                                                                var13_13 = var14_14.equals(var17_17);
                                                                if (!var13_13) break;
                                                                var15_15 = 1;
                                                                break;
                                                            }
                                                            case -716705180: {
                                                                var17_17 = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
                                                                var13_13 = var14_14.equals(var17_17);
                                                                if (!var13_13) break;
                                                                var15_15 = 0;
                                                                var18_18 = null;
                                                            }
                                                        }
                                                        switch (var15_15) {
                                                            default: {
                                                                break;
                                                            }
                                                            case 5: {
                                                                var14_14 = new R42();
                                                                break block111;
                                                            }
                                                            case 4: {
                                                                var14_14 = new U42();
                                                                break block111;
                                                            }
                                                            case 3: {
                                                                var14_14 = new P42();
                                                                break block111;
                                                            }
                                                            case 2: {
                                                                var14_14 = new N42();
                                                                break block111;
                                                            }
                                                            case 1: {
                                                                var14_14 = new U42();
                                                                break block111;
                                                            }
                                                            case 0: {
                                                                var14_14 = new U42();
                                                                break block111;
                                                            }
                                                        }
                                                    }
                                                    var13_13 = false;
                                                    var14_14 = null;
                                                }
                                                if (var14_14 != null) break block109;
                                                var14_14 = "android.selfDisplayName";
                                                var13_13 = var9_9.containsKey((String)var14_14);
                                                if (var13_13 || (var13_13 = var9_9.containsKey((String)(var14_14 = "android.messagingStyleUser")))) break block112;
                                                var14_14 = "android.picture";
                                                var13_13 = var9_9.containsKey((String)var14_14);
                                                if (var13_13 || (var13_13 = var9_9.containsKey((String)(var14_14 = "android.pictureIcon")))) break block113;
                                                var14_14 = "android.bigText";
                                                var13_13 = var9_9.containsKey((String)var14_14);
                                                if (!var13_13) break block114;
                                                var14_14 = new U42();
                                                break block109;
                                            }
                                            var14_14 = "android.textLines";
                                            var13_13 = var9_9.containsKey((String)var14_14);
                                            if (!var13_13) break block115;
                                            var14_14 = new P42();
                                            break block109;
                                        }
                                        var14_14 = "android.callType";
                                        var13_13 = var9_9.containsKey((String)var14_14);
                                        if (!var13_13) break block116;
                                        var14_14 = new N42();
                                        break block109;
                                    }
                                    var14_14 = var9_9.getString("android.template");
                                    if (var14_14 == null) lbl-1000:
                                    // 3 sources

                                    {
                                        while (true) {
                                            var13_13 = false;
                                            var14_14 = null;
                                            break block109;
                                            break;
                                        }
                                    }
                                    var18_18 = Notification.BigPictureStyle.class.getName();
                                    var15_15 = (int)var14_14.equals(var18_18);
                                    if (var15_15 != 0) {
                                        super();
lbl125:
                                        // 5 sources

                                        while (true) {
                                            var14_14 = var19_19 /* !! */ ;
                                            break block109;
                                            break;
                                        }
                                    }
                                    var18_18 = Notification.BigTextStyle.class.getName();
                                    var15_15 = (int)var14_14.equals(var18_18);
                                    if (var15_15 == 0) break block117;
                                    super();
                                    ** GOTO lbl125
                                }
                                var18_18 = Notification.InboxStyle.class.getName();
                                var15_15 = (int)var14_14.equals(var18_18);
                                if (var15_15 == 0) break block118;
                                super();
                                ** GOTO lbl125
                            }
                            if (var7_7 < var12_12) ** GOTO lbl-1000
                            var19_19 /* !! */  = S42.a().getName();
                            var7_7 = (int)var14_14.equals(var19_19 /* !! */ );
                            if (var7_7 == 0) break block119;
                            super();
                            ** GOTO lbl125
                        }
                        var19_19 /* !! */  = T42.a().getName();
                        var7_7 = (int)var14_14.equals(var19_19 /* !! */ );
                        if (var7_7 != 0) ** break;
                        ** while (true)
                        super();
                        ** while (true)
                    }
                    var14_14 = new U42();
                    break block109;
                }
                var14_14 = new R42();
            }
            if (var14_14 == null) ** GOTO lbl-1000
            try {
                var14_14.j((Bundle)var9_9);
            }
            catch (ClassCastException v0) {
                ** continue;
            }
        }
        var19_19 /* !! */  = var4_4.extras;
        var18_18 = "android.title";
        var19_19 /* !! */  = J42.b(var19_19 /* !! */ .getCharSequence(var18_18));
        var3_3.e = var19_19 /* !! */ ;
        var19_19 /* !! */  = var4_4.extras;
        var17_17 = "android.text";
        var19_19 /* !! */  = J42.b(var19_19 /* !! */ .getCharSequence((String)var17_17));
        var3_3.f = var19_19 /* !! */ ;
        var19_19 /* !! */  = var4_4.extras;
        var20_20 = "android.infoText";
        var19_19 /* !! */  = J42.b(var19_19 /* !! */ .getCharSequence((String)var20_20));
        var3_3.j = var19_19 /* !! */ ;
        var19_19 /* !! */  = var4_4.extras;
        var21_21 = "android.subText";
        var19_19 /* !! */  = J42.b(var19_19 /* !! */ .getCharSequence((String)var21_21));
        var3_3.q = var19_19 /* !! */ ;
        var7_7 = Build.VERSION.SDK_INT;
        if (var7_7 >= var8_8) {
            var22_22 = B42.c(var2_2);
        } else {
            var23_23 = false;
            var22_22 = null;
        }
        var24_24 = J42.b(var22_22);
        var3_3.r = var24_24;
        var3_3.g((U42)var14_14);
        var24_24 = var2_2.getGroup();
        var3_3.v = var24_24;
        var25_25 = var4_4.flags & 512;
        if (var25_25 != 0) {
            var25_25 = 1;
        } else {
            var25_25 = 0;
            var24_24 = null;
        }
        var3_3.w = var25_25;
        var25_25 = 29;
        if (var7_7 < var25_25 || (var22_22 = C42.c(var2_2)) == null) ** GOTO lbl206
        var10_10 = Ew1$a.b((LocusId)var22_22);
        var23_23 = TextUtils.isEmpty((CharSequence)var10_10);
        if (!var23_23) {
            var26_26 = new Ew1((String)var10_10);
        } else {
            super("id cannot be empty");
            throw var4_4;
lbl206:
            // 1 sources

            var27_27 = 0;
            var26_26 = null;
        }
        var3_3.L = var26_26;
        var26_26 = var9_9;
        var3_3.P.when = var28_28 = var4_4.when;
        var24_24 = var4_4.extras;
        var9_9 = "android.showWhen";
        var25_25 = (int)var24_24.getBoolean((String)var9_9);
        var3_3.m = var25_25;
        var24_24 = var4_4.extras;
        var10_10 = "android.showChronometer";
        var25_25 = (int)var24_24.getBoolean((String)var10_10);
        var3_3.n = var25_25;
        var25_25 = var4_4.flags;
        var12_12 = 16;
        if ((var25_25 &= var12_12) != 0) {
            var25_25 = 1;
        } else {
            var25_25 = 0;
            var24_24 = null;
        }
        var3_3.d(var12_12, (boolean)var25_25);
        var25_25 = var4_4.flags;
        var12_12 = 8;
        if ((var25_25 &= var12_12) != 0) {
            var25_25 = 1;
        } else {
            var25_25 = 0;
            var24_24 = null;
        }
        var3_3.d(var12_12, (boolean)var25_25);
        var25_25 = var4_4.flags & var6_6;
        if (var25_25 != 0) {
            var25_25 = 1;
        } else {
            var25_25 = 0;
            var24_24 = null;
        }
        var3_3.d(var6_6, (boolean)var25_25);
        var25_25 = var4_4.flags & 256;
        if (var25_25 != 0) {
            var25_25 = 1;
        } else {
            var25_25 = 0;
            var24_24 = null;
        }
        var3_3.y = var25_25;
        var24_24 = var4_4.largeIcon;
        var3_3.e((Bitmap)var24_24);
        if (var7_7 >= var8_8) {
            var25_25 = B42.a(var2_2);
        } else {
            var25_25 = 0;
            var24_24 = null;
        }
        var3_3.J = var25_25;
        var24_24 = var4_4.category;
        var3_3.B = var24_24;
        var25_25 = 29;
        if (var7_7 < var25_25 || (var22_22 = C42.b(var2_2)) == null) ** GOTO lbl-1000
        var12_12 = 30;
        if (var7_7 >= var12_12) {
            var24_24 = var10_10 = H42$b.a((Notification.BubbleMetadata)var22_22);
        } else if (var7_7 == var25_25) {
            var24_24 = H42$a.a((Notification.BubbleMetadata)var22_22);
        } else lbl-1000:
        // 2 sources

        {
            var25_25 = 0;
            var24_24 = null;
        }
        var3_3.O = var24_24;
        var3_3.k = var25_25 = var4_4.number;
        var24_24 = var4_4.tickerText;
        var10_10 = var3_3.P;
        var10_10.tickerText = var24_24 = J42.b((CharSequence)var24_24);
        var24_24 = var4_4.contentIntent;
        var3_3.g = var24_24;
        var24_24 = var4_4.deleteIntent;
        var10_10 = var3_3.P;
        var10_10.deleteIntent = var24_24;
        var24_24 = var4_4.fullScreenIntent;
        var12_12 = var4_4.flags;
        var30_29 = 128;
        if ((var12_12 &= var30_29) != 0) {
            var12_12 = 1;
        } else {
            var12_12 = 0;
            var10_10 = null;
        }
        var3_3.h = var24_24;
        var3_3.d(var30_29, (boolean)var12_12);
        var31_30 /* !! */  = var4_4.sound;
        var25_25 = var4_4.audioStreamType;
        var10_10 = var3_3.P;
        var10_10.sound = var31_30 /* !! */ ;
        var10_10.audioStreamType = var25_25;
        var32_31 = J42$a.a(J42$a.d(J42$a.c(J42$a.b(), var5_5), var25_25));
        var10_10.audioAttributes = var32_31;
        var32_31 = var4_4.vibrate;
        var31_30 /* !! */  = var3_3.P;
        var31_30 /* !! */ .vibrate = (long[])var32_31;
        var5_5 = var4_4.ledARGB;
        var25_25 = var4_4.ledOnMS;
        var12_12 = var4_4.ledOffMS;
        var31_30 /* !! */ .ledARGB = var5_5;
        var31_30 /* !! */ .ledOnMS = var25_25;
        var31_30 /* !! */ .ledOffMS = var12_12;
        if (var25_25 != 0 && var12_12 != 0) {
            var5_5 = 1;
        } else {
            var5_5 = 0;
            var32_31 = null;
        }
        var25_25 = var31_30 /* !! */ .flags & -2;
        var31_30 /* !! */ .flags = var5_5 |= var25_25;
        var5_5 = var4_4.defaults;
        var3_3.c(var5_5);
        var3_3.l = var5_5 = var4_4.priority;
        var3_3.D = var5_5 = var4_4.color;
        var3_3.E = var5_5 = var4_4.visibility;
        var32_31 = var4_4.publicVersion;
        var3_3.F = var32_31;
        var32_31 = var2_2.getSortKey();
        var3_3.x = var32_31;
        if (var7_7 >= var8_8) {
            var33_32 = B42.e(var2_2);
lbl324:
            // 2 sources

            while (true) {
                continue;
                break;
            }
        }
        var33_32 = 0L;
        ** while (true)
        var31_30 /* !! */  = var26_26;
        var3_3.M = var33_32;
        if (var7_7 >= var8_8) {
            var35_33 = B42.d(var2_2);
        } else {
            var6_6 = 0;
            var35_33 = null;
        }
        var3_3.K = var35_33;
        var35_33 = "android.progressMax";
        var27_27 = var31_30 /* !! */ .getInt((String)var35_33);
        var24_24 = "android.progress";
        var12_12 = var31_30 /* !! */ .getInt((String)var24_24);
        var32_31 = "android.progressIndeterminate";
        var8_8 = (int)var31_30 /* !! */ .getBoolean((String)var32_31);
        var3_3.s = var27_27;
        var3_3.t = var12_12;
        var3_3.u = var8_8;
        var27_27 = 29;
        if (var7_7 >= var27_27) {
            var27_27 = (int)C42.a(var2_2);
        } else {
            var27_27 = 0;
            var26_26 = null;
        }
        var3_3.N = var27_27;
        var27_27 = var4_4.icon;
        var8_8 = var4_4.iconLevel;
        var10_10 = var3_3.P;
        var10_10.icon = var27_27;
        var10_10.iconLevel = var8_8;
        var26_26 = var4_4.extras;
        var36_34 = "invisible_actions";
        var10_10 = "android.car.EXTENSIONS";
        var37_35 /* !! */  = var31_30 /* !! */ ;
        var31_30 /* !! */  = "android.people";
        var38_36 = var7_7;
        var19_19 /* !! */  = "android.people.list";
        var3_3 = "android.colorized";
        var39_37 = var14_14;
        var14_14 = "android.chronometerCountDown";
        if (var26_26 == null) {
            var32_31 = var36_34;
            var27_27 = 0;
            var26_26 = null;
        } else {
            var40_38 /* !! */  = var36_34;
            var36_34 = var4_4.extras;
            var26_26 = new Bundle((Bundle)var36_34);
            var26_26.remove(var18_18);
            var26_26.remove((String)var17_17);
            var26_26.remove((String)var20_20);
            var26_26.remove((String)var21_21);
            var26_26.remove("android.intent.extra.CHANNEL_ID");
            var36_34 = "android.intent.extra.CHANNEL_GROUP_ID";
            var26_26.remove((String)var36_34);
            var26_26.remove((String)var9_9);
            var26_26.remove((String)var24_24);
            var26_26.remove((String)var35_33);
            var26_26.remove((String)var32_31);
            var26_26.remove((String)var14_14);
            var26_26.remove((String)var3_3);
            var26_26.remove((String)var19_19 /* !! */ );
            var26_26.remove((String)var31_30 /* !! */ );
            var26_26.remove("android.support.sortKey");
            var26_26.remove("android.support.groupKey");
            var26_26.remove("android.support.isGroupSummary");
            var26_26.remove("android.support.localOnly");
            var26_26.remove("android.support.actionExtras");
            var32_31 = var26_26.getBundle((String)var10_10);
            if (var32_31 != null) {
                var35_33 = new Bundle((Bundle)var32_31);
                var32_31 = var40_38 /* !! */ ;
                var35_33.remove((String)var40_38 /* !! */ );
                var26_26.putBundle((String)var10_10, (Bundle)var35_33);
            } else {
                var32_31 = var40_38 /* !! */ ;
            }
            if (var39_37 != null) {
                var24_24 = var39_37;
                var39_37.c((Bundle)var26_26);
            }
        }
        var35_33 = var3_3;
        var3_3 = this;
        if (var26_26 != null) {
            var36_34 = this.C;
            if (var36_34 == null) {
                super((Bundle)var26_26);
                this.C = var36_34;
            } else {
                var36_34.putAll((Bundle)var26_26);
            }
        }
        var27_27 = 23;
        var8_8 = var38_36;
        if (var38_36 >= var27_27) {
            var36_34 = J42$b.b(var2_2);
            var3_3.Q = var36_34;
            var36_34 = J42$b.a(var2_2);
            if (var36_34 != null) {
                var24_24 = IconCompat.k;
                var36_34 = IconCompat$a.a(var36_34);
                var3_3.i = var36_34;
            }
        }
        if ((var36_34 = var4_4.actions) != null && (var11_11 = ((Notification.Action[])var36_34).length) != 0) {
            var11_11 = ((Icon)var36_34).length;
            var18_18 = null;
            for (var15_15 = 0; var15_15 < var11_11; ++var15_15) {
                var17_17 = var36_34[var15_15];
                var41_39 = Build.VERSION.SDK_INT;
                if (var41_39 >= var27_27 && (var20_20 = A42$a$b.a((Notification.Action)var17_17)) != null) {
                    var20_20 = A42$a$b.a((Notification.Action)var17_17);
                    var21_21 = IconCompat.k;
                    var42_40 = IconCompat$a.d(var20_20);
                    if (var42_40 == (var27_27 = 2) && (var42_40 = IconCompat$a.b(var20_20)) == 0) {
                        var41_39 = 0;
                        var20_20 = null;
                    } else {
                        var20_20 = IconCompat$a.a(var20_20);
                    }
                    var26_26 = var17_17.title;
                    var24_24 = var17_17.actionIntent;
                    var21_21 = new A42$a((IconCompat)var20_20, (CharSequence)var26_26, (PendingIntent)var24_24);
                } else {
                    var27_27 = var17_17.icon;
                    var24_24 = var17_17.title;
                    var20_20 = var17_17.actionIntent;
                    var21_21 = new A42$a(var27_27, (CharSequence)var24_24, (PendingIntent)var20_20);
                }
                var26_26 = A42$a$a.b((Notification.Action)var17_17);
                if (var26_26 != null && (var25_25 = ((RemoteInput[])var26_26).length) != 0) {
                    var25_25 = ((RemoteInput[])var26_26).length;
                    var20_20 = null;
                    for (var41_39 = 0; var41_39 < var25_25; var41_39 += var27_27) {
                        var40_38 /* !! */  = var26_26[var41_39];
                        var43_41 = var40_38 /* !! */ .getResultKey();
                        var44_42 = var26_26;
                        var26_26 = new HashSet();
                        var45_43 = var36_34;
                        var36_34 = new Bundle();
                        if (var43_41 != null) {
                            var46_44 /* !! */  = var40_38 /* !! */ .getLabel();
                            var47_45 = var40_38 /* !! */ .getChoices();
                            var48_46 = var40_38 /* !! */ .getAllowFreeFormInput();
                            var49_47 = var25_25;
                            var24_24 = var40_38 /* !! */ .getExtras();
                            if (var24_24 != null) {
                                var36_34.putAll((Bundle)var24_24);
                            }
                            var25_25 = Build.VERSION.SDK_INT;
                            var50_48 = var11_11;
                            var11_11 = 26;
                            if (var25_25 >= var11_11 && (var24_24 = GI2$a.a(var40_38 /* !! */ )) != null) {
                                var24_24 = var24_24.iterator();
                                while ((var11_11 = (int)var24_24.hasNext()) != 0) {
                                    var9_9 = (String)var24_24.next();
                                    var26_26.add(var9_9);
                                }
                            }
                            if ((var25_25 = Build.VERSION.SDK_INT) >= (var11_11 = 29)) {
                                var24_24 = var10_10;
                                var51_49 = var11_11 = GI2$b.a(var40_38 /* !! */ );
                            } else {
                                var24_24 = var10_10;
                                var51_49 = 0;
                                var52_50 = null;
                            }
                            var53_51 = var9_9;
                            var9_9 = new GI2((String)var43_41, (CharSequence)var46_44 /* !! */ , var47_45, var48_46, var51_49, (Bundle)var36_34, (HashSet)var26_26);
                            var26_26 = var21_21.f;
                            if (var26_26 == null) {
                                var21_21.f = var26_26 = new ArrayList();
                            }
                            var21_21.f.add(var9_9);
                            var27_27 = 1;
                            var10_10 = var24_24;
                            var26_26 = var44_42;
                            var36_34 = var45_43;
                            var25_25 = var49_47;
                            var11_11 = var50_48;
                            continue;
                        }
                        var4_4 = new IllegalArgumentException("Result key can't be null");
                        throw var4_4;
                    }
                }
                var45_43 = var36_34;
                var50_48 = var11_11;
                var24_24 = var10_10;
                var27_27 = Build.VERSION.SDK_INT;
                var8_8 = 24;
                if (var27_27 >= var8_8) {
                    var8_8 = (int)A42$a$c.a((Notification.Action)var17_17);
                    var21_21.d = var8_8;
                }
                if (var27_27 >= (var8_8 = 28)) {
                    var21_21.g = var8_8 = A42$a$d.a((Notification.Action)var17_17);
                }
                if (var27_27 >= (var8_8 = 29)) {
                    var11_11 = (int)A42$a$e.a((Notification.Action)var17_17);
                    var21_21.i = var11_11;
                }
                if (var27_27 >= (var11_11 = 31)) {
                    var27_27 = (int)A42$a$f.a((Notification.Action)var17_17);
                    var21_21.j = var27_27;
                }
                if ((var26_26 = A42$a$a.a((Notification.Action)var17_17)) != null) {
                    var9_9 = var21_21.e;
                    var9_9.putAll((Bundle)var26_26);
                }
                var26_26 = var21_21.a();
                var9_9 = var3_3.b;
                var9_9.add(var26_26);
                var10_10 = var24_24;
                var36_34 = var45_43;
                var11_11 = var50_48;
                var27_27 = 23;
            }
        }
        var24_24 = var10_10;
        var26_26 = new ArrayList();
        var36_34 = var4_4.extras.getBundle((String)var10_10);
        if (var36_34 != null && (var32_31 = var36_34.getBundle((String)var32_31)) != null) {
            var36_34 = null;
            for (var8_8 = 0; var8_8 < (var25_25 = var32_31.size()); var8_8 += var25_25) {
                var24_24 = Integer.toString(var8_8);
                var10_10 = (var24_24 = var32_31.getBundle((String)var24_24)).getBundle((String)(var9_9 = "extras"));
                if (var10_10 != null) {
                    var18_18 = "android.support.allowGeneratedReplies";
                    var16_16 = 0;
                    var17_17 = null;
                    var54_52 = var12_12 = (int)var10_10.getBoolean(var18_18, false);
                } else {
                    var16_16 = 0;
                    var17_17 = null;
                    var54_52 = 0;
                }
                var18_18 = "icon";
                var15_15 = var24_24.getInt(var18_18);
                var43_41 = var24_24.getCharSequence("title");
                var46_44 /* !! */  = var20_20 = var24_24.getParcelable("actionIntent");
                var46_44 /* !! */  = (PendingIntent)var20_20;
                var47_45 = var24_24.getBundle((String)var9_9);
                var9_9 = "remoteInputs";
                var20_20 = var24_24.getParcelableArray((String)var9_9);
                var42_40 = var20_20 instanceof Bundle[];
                var17_17 = Bundle[].class;
                if (var42_40 == 0 && var20_20 != null) {
                    var42_40 = var20_20.length;
                    var20_20 = (Bundle[])Arrays.copyOf(var20_20, var42_40, (Class<? extends T[]>)var17_17);
                    var24_24.putParcelableArray((String)var9_9, var20_20);
                } else {
                    var20_20 = (Bundle[])var20_20;
                }
                var55_53 = W42.a((Bundle[])var20_20);
                var9_9 = "dataOnlyRemoteInputs";
                var20_20 = var24_24.getParcelableArray((String)var9_9);
                var42_40 = var20_20 instanceof Bundle[];
                if (var42_40 == 0 && var20_20 != null) {
                    var42_40 = var20_20.length;
                    var17_17 = (Bundle[])Arrays.copyOf(var20_20, var42_40, (Class<? extends T[]>)var17_17);
                    var24_24.putParcelableArray((String)var9_9, var17_17);
                } else {
                    var17_17 = var20_20;
                    var17_17 = (Bundle[])var20_20;
                }
                var52_50 = W42.a((Bundle[])var17_17);
                var56_54 = var24_24.getInt("semanticAction");
                var9_9 = "showsUserInterface";
                var57_55 = var24_24.getBoolean((String)var9_9);
                if (var15_15 == 0) {
                    var11_11 = 0;
                    var9_9 = null;
                    var53_51 = null;
                } else {
                    var11_11 = 0;
                    var9_9 = null;
                    var53_51 = var24_24 = IconCompat.d(null, "", var15_15);
                }
                var45_43 = null;
                var49_47 = 0;
                var40_38 /* !! */  = var10_10;
                var10_10 = new A42((IconCompat)var53_51, var43_41, (PendingIntent)var46_44 /* !! */ , (Bundle)var47_45, var55_53, var52_50, (boolean)var54_52, var56_54, var57_55, false, false);
                var26_26.add(var10_10);
                var25_25 = 1;
            }
        }
        if ((var5_5 = (int)var26_26.isEmpty()) == 0) {
            var32_31 = var26_26.iterator();
            while ((var27_27 = (int)var32_31.hasNext()) != 0) {
                var26_26 = (A42)var32_31.next();
                if (var26_26 == null) continue;
                var36_34 = var3_3.d;
                var36_34.add(var26_26);
            }
        }
        if ((var32_31 = var4_4.extras.getStringArray((String)var31_30 /* !! */ )) != null && (var27_27 = ((Object)var32_31).length) != 0) {
            var27_27 = ((Object)var32_31).length;
            var31_30 /* !! */  = null;
            for (var30_29 = 0; var30_29 < var27_27; var30_29 += var8_8) {
                var36_34 = var32_31[var30_29];
                if (var36_34 != null && (var25_25 = (int)var36_34.isEmpty()) == 0) {
                    var24_24 = var3_3.R;
                    var24_24.add(var36_34);
                }
                var8_8 = 1;
            }
        }
        if ((var5_5 = Build.VERSION.SDK_INT) >= (var27_27 = 28) && (var4_4 = var4_4.extras.getParcelableArrayList((String)var19_19 /* !! */ )) != null && (var5_5 = (int)var4_4.isEmpty()) == 0) {
            var4_4 = var4_4.iterator();
            while ((var5_5 = (int)var4_4.hasNext()) != 0) {
                var32_31 = qr2$a.a(I42.a(var4_4.next()));
                var26_26 = var3_3.c;
                var26_26.add(var32_31);
            }
        }
        if ((var58_56 = Build.VERSION.SDK_INT) >= (var5_5 = 24)) {
            var32_31 = var37_35 /* !! */ ;
            var27_27 = (int)var37_35 /* !! */ .containsKey((String)var14_14);
            if (var27_27 != 0) {
                var27_27 = (int)var37_35 /* !! */ .getBoolean((String)var14_14);
                var3_3.o = var27_27;
                var31_30 /* !! */  = var3_3.C;
                if (var31_30 /* !! */  == null) {
                    super();
                    var3_3.C = var31_30 /* !! */ ;
                }
                var31_30 /* !! */  = var3_3.C;
                var31_30 /* !! */ .putBoolean((String)var14_14, (boolean)var27_27);
            }
lbl632:
            // 4 sources

            while (true) {
                continue;
                break;
            }
        }
        var32_31 = var37_35 /* !! */ ;
        ** while (true)
        var27_27 = 26;
        if (var58_56 >= var27_27 && (var58_56 = (int)var32_31.containsKey((String)var35_33)) != 0) {
            var58_56 = (int)var32_31.getBoolean((String)var35_33);
            var3_3.z = var58_56;
            var58_56 = 1;
            var3_3.A = var58_56;
        }
        return;
    }

    public J42(Context object, String string2) {
        long l2;
        Notification notification;
        boolean bl2;
        ArrayList arrayList;
        this.b = arrayList = new ArrayList();
        this.c = arrayList = new ArrayList();
        this.d = arrayList = new ArrayList();
        this.m = bl2 = true;
        this.y = false;
        this.D = 0;
        this.E = 0;
        this.J = 0;
        this.P = notification = new Notification();
        this.a = object;
        this.I = string2;
        notification.when = l2 = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.l = 0;
        this.R = object;
        this.N = bl2;
    }

    public static CharSequence b(CharSequence charSequence) {
        int n3;
        if (charSequence == null) {
            return charSequence;
        }
        int n4 = charSequence.length();
        if (n4 > (n3 = 5120)) {
            n4 = 0;
            charSequence = charSequence.subSequence(0, n3);
        }
        return charSequence;
    }

    public final Notification a() {
        V42 v42 = new V42(this);
        Object object = v42.c;
        U42 u42 = ((J42)object).p;
        if (u42 != null) {
            u42.b(v42);
        }
        RemoteViews remoteViews = u42 != null ? u42.h() : null;
        int n3 = Build.VERSION.SDK_INT;
        Notification.Builder builder = v42.b;
        int n4 = 26;
        if (n3 >= n4) {
            v42 = builder.build();
        } else {
            n4 = 24;
            if (n3 >= n4) {
                v42 = builder.build();
            } else {
                Bundle bundle = v42.f;
                builder.setExtras(bundle);
                bundle = builder.build();
                builder = v42.d;
                if (builder != null) {
                    bundle.contentView = builder;
                }
                if ((v42 = v42.e) != null) {
                    bundle.bigContentView = v42;
                }
                v42 = bundle;
            }
        }
        if (remoteViews != null) {
            ((Notification)v42).contentView = remoteViews;
        } else {
            remoteViews = ((J42)object).G;
            if (remoteViews != null) {
                ((Notification)v42).contentView = remoteViews;
            }
        }
        if (u42 != null && (remoteViews = u42.g()) != null) {
            ((Notification)v42).bigContentView = remoteViews;
        }
        if (u42 != null) {
            object = ((J42)object).p;
            ((U42)object).i();
        }
        if (u42 != null && (object = ((Notification)v42).extras) != null) {
            u42.a((Bundle)object);
        }
        return v42;
    }

    public final void c(int n3) {
        Notification notification = this.P;
        notification.defaults = n3;
        if ((n3 &= 4) != 0) {
            notification.flags = n3 = notification.flags | 1;
        }
    }

    public final void d(int n3, boolean bl2) {
        Notification notification = this.P;
        if (bl2) {
            int n4 = notification.flags;
            notification.flags = n3 |= n4;
        } else {
            int n7 = notification.flags;
            notification.flags = n3 = ~n3 & n7;
        }
    }

    public final void e(Bitmap bitmap) {
        if (bitmap == null) {
            bitmap = null;
        } else {
            Object object;
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 27;
            boolean bl2 = true;
            if (n3 < n4) {
                object = this.a.getResources();
                n4 = R$dimen.compat_notification_large_icon_max_width;
                n4 = object.getDimensionPixelSize(n4);
                int n7 = R$dimen.compat_notification_large_icon_max_height;
                n3 = object.getDimensionPixelSize(n7);
                n7 = bitmap.getWidth();
                if (n7 > n4 || (n7 = bitmap.getHeight()) > n3) {
                    double d2 = n4;
                    n4 = bitmap.getWidth();
                    n4 = Math.max(bl2 ? 1 : 0, n4);
                    double d5 = n4;
                    d2 /= d5;
                    double d7 = n3;
                    int n8 = bitmap.getHeight();
                    n8 = Math.max(bl2 ? 1 : 0, n8);
                    d5 = n8;
                    d7 /= d5;
                    d7 = Math.min(d2, d7);
                    d2 = Math.ceil((double)bitmap.getWidth() * d7);
                    n7 = (int)d2;
                    int n10 = bitmap.getHeight();
                    double d9 = (double)n10 * d7;
                    d7 = Math.ceil(d9);
                    n3 = (int)d7;
                    bitmap = Bitmap.createScaledBitmap((Bitmap)bitmap, (int)n7, (int)n3, (boolean)bl2);
                }
            }
            object = IconCompat.k;
            bitmap.getClass();
            object = new IconCompat(bl2 ? 1 : 0);
            object.b = bitmap;
            bitmap = object;
        }
        this.i = bitmap;
    }

    public final void f(Uri uri) {
        Notification notification = this.P;
        notification.sound = uri;
        notification.audioStreamType = -1;
        uri = J42$a.a(J42$a.e(J42$a.c(J42$a.b(), 4), 5));
        notification.audioAttributes = uri;
    }

    public final void g(U42 u42) {
        U42 u422 = this.p;
        if (u422 != u42) {
            this.p = u42;
            if (u42 != null) {
                u42.k(this);
            }
        }
    }
}

