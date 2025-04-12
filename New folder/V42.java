/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Notification$Action
 *  android.app.Notification$Action$Builder
 *  android.app.Notification$Builder
 *  android.app.PendingIntent
 *  android.app.Person
 *  android.app.RemoteInput
 *  android.app.RemoteInput$Builder
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.drawable.Icon
 *  android.media.AudioAttributes
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.widget.RemoteViews
 */
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.R$color;
import androidx.core.R$drawable;
import androidx.core.R$string;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Collection;

public final class V42 {
    public final Context a;
    public final Notification.Builder b;
    public final J42 c;
    public final RemoteViews d;
    public final RemoteViews e;
    public final Bundle f;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public V42(J42 var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        super();
        new ArrayList<E>();
        var4_4 = new Bundle();
        this.f = var4_4;
        this.c = var1_1;
        var4_4 = var1_1.a;
        this.a = var4_4;
        var5_5 = Build.VERSION.SDK_INT;
        var6_6 = 26;
        if (var5_5 >= var6_6) {
            var7_7 = var1_1.I;
            var7_7 = V42$c.a((Context)var4_4, (String)var7_7);
            this.b = var7_7;
        } else {
            var8_8 /* !! */  = var1_1.a;
            var7_7 = new Notification.Builder(var8_8 /* !! */ );
            this.b = var7_7;
        }
        var7_7 = var3_3.P;
        var8_8 /* !! */  = var2_2.b;
        var9_9 = var7_7.when;
        var8_8 /* !! */  = var8_8 /* !! */ .setWhen(var9_9);
        var11_10 = var7_7.icon;
        var12_11 = var7_7.iconLevel;
        var8_8 /* !! */  = var8_8 /* !! */ .setSmallIcon(var11_10, var12_11);
        var13_12 = var7_7.contentView;
        var8_8 /* !! */  = var8_8 /* !! */ .setContent((RemoteViews)var13_12);
        var13_12 = var7_7.tickerText;
        var12_11 = 0;
        var14_13 = null;
        var8_8 /* !! */  = var8_8 /* !! */ .setTicker((CharSequence)var13_12, null);
        var13_12 = var7_7.vibrate;
        var8_8 /* !! */  = var8_8 /* !! */ .setVibrate((long[])var13_12);
        var11_10 = var7_7.ledARGB;
        var15_14 = var7_7.ledOnMS;
        var16_15 = var7_7.ledOffMS;
        var8_8 /* !! */  = var8_8 /* !! */ .setLights(var11_10, var15_14, var16_15);
        var11_10 = var7_7.flags;
        var15_14 = 2;
        var17_16 = 1;
        if ((var11_10 &= var15_14) != 0) {
            var11_10 = 1;
        } else {
            var11_10 = 0;
            var13_12 = null;
        }
        var8_8 /* !! */  = var8_8 /* !! */ .setOngoing((boolean)var11_10);
        var11_10 = var7_7.flags & 8;
        if (var11_10 != 0) {
            var11_10 = 1;
        } else {
            var11_10 = 0;
            var13_12 = null;
        }
        var8_8 /* !! */  = var8_8 /* !! */ .setOnlyAlertOnce((boolean)var11_10);
        var11_10 = var7_7.flags & 16;
        if (var11_10 != 0) {
            var11_10 = 1;
        } else {
            var11_10 = 0;
            var13_12 = null;
        }
        var8_8 /* !! */  = var8_8 /* !! */ .setAutoCancel((boolean)var11_10);
        var11_10 = var7_7.defaults;
        var8_8 /* !! */  = var8_8 /* !! */ .setDefaults(var11_10);
        var13_12 = var3_3.e;
        var8_8 /* !! */  = var8_8 /* !! */ .setContentTitle((CharSequence)var13_12);
        var13_12 = var3_3.f;
        var8_8 /* !! */  = var8_8 /* !! */ .setContentText((CharSequence)var13_12);
        var13_12 = var3_3.j;
        var8_8 /* !! */  = var8_8 /* !! */ .setContentInfo((CharSequence)var13_12);
        var13_12 = var3_3.g;
        var8_8 /* !! */  = var8_8 /* !! */ .setContentIntent((PendingIntent)var13_12);
        var13_12 = var7_7.deleteIntent;
        var8_8 /* !! */  = var8_8 /* !! */ .setDeleteIntent((PendingIntent)var13_12);
        var13_12 = var3_3.h;
        var18_17 = var7_7.flags & 128;
        if (var18_17 != 0) {
            var18_17 = 1;
        } else {
            var18_17 = 0;
            var19_18 = null;
        }
        var8_8 /* !! */  = var8_8 /* !! */ .setFullScreenIntent((PendingIntent)var13_12, (boolean)var18_17);
        var11_10 = var3_3.k;
        var8_8 /* !! */  = var8_8 /* !! */ .setNumber(var11_10);
        var11_10 = var3_3.s;
        var18_17 = var3_3.t;
        var20_19 = var3_3.u;
        var8_8 /* !! */ .setProgress(var11_10, var18_17, (boolean)var20_19);
        var21_20 = 23;
        if (var5_5 < var21_20) {
            var4_4 = var2_2.b;
            var22_21 = var3_3.i;
            if (var22_21 == null) {
                var5_5 = 0;
                var22_21 = null;
            } else {
                var22_21 = var22_21.e();
            }
            var4_4.setLargeIcon((Bitmap)var22_21);
        } else {
            var22_21 = var2_2.b;
            var13_12 = var3_3.i;
            if (var13_12 == null) {
                var23_22 = 0;
                var4_4 = null;
            } else {
                var4_4 = var13_12.m((Context)var4_4);
            }
            V42$a.b((Notification.Builder)var22_21, (Icon)var4_4);
        }
        var4_4 = var2_2.b;
        var22_21 = var3_3.q;
        var4_4 = var4_4.setSubText((CharSequence)var22_21);
        var5_5 = (int)var3_3.n;
        var4_4 = var4_4.setUsesChronometer((boolean)var5_5);
        var5_5 = var3_3.l;
        var4_4.setPriority(var5_5);
        var4_4 = var3_3.p;
        var5_5 = var4_4 instanceof N42;
        if (var5_5 != 0) {
            var4_4 = (N42)var4_4;
            var20_19 = R$drawable.ic_call_decline;
            var22_21 = var4_4.h;
            if (var22_21 == null) {
                var24_23 = R$string.call_notification_hang_up_action;
                var25_24 = var4_4.l;
                var26_25 = R$color.call_notification_decline_color;
                var22_21 = var4_4.i;
                var19_18 = var4_4;
                var27_26 = var22_21;
                var22_21 = var4_4.l(var20_19, var24_23, (Integer)var25_24, var26_25, (PendingIntent)var22_21);
            } else {
                var24_23 = R$string.call_notification_decline_action;
                var25_24 = var4_4.l;
                var26_25 = R$color.call_notification_decline_color;
                var19_18 = var4_4;
                var27_26 = var22_21;
                var22_21 = var4_4.l(var20_19, var24_23, (Integer)var25_24, var26_25, (PendingIntent)var22_21);
            }
            var11_10 = R$drawable.ic_call_answer_video;
            var18_17 = R$drawable.ic_call_answer;
            var25_24 = var4_4.g;
            if (var25_24 == null) {
                var11_10 = 0;
                var13_12 = null;
            } else {
                var20_19 = (int)var4_4.j;
                if (var20_19 == 0) {
                    var11_10 = var18_17;
                }
                if (var20_19 != 0) {
                    var18_17 = R$string.call_notification_answer_video_action;
lbl150:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var18_17 = R$string.call_notification_answer_action;
                ** continue;
                var24_23 = var18_17;
                var28_27 = var4_4.k;
                var26_25 = R$color.call_notification_answer_color;
                var19_18 = var4_4;
                var27_26 = var28_27;
                var20_19 = var11_10;
                var13_12 = var25_24;
                var25_24 = var28_27;
                var27_26 = var13_12;
                var13_12 = var4_4.l(var11_10, var18_17, (Integer)var28_27, var26_25, (PendingIntent)var13_12);
            }
            var20_19 = 3;
            var19_18 = new ArrayList(var20_19);
            var19_18.add(var22_21);
            var4_4 = var4_4.a.b;
            if (var4_4 != null) {
                var4_4 = var4_4.iterator();
                while ((var5_5 = (int)var4_4.hasNext()) != 0) {
                    var22_21 = (A42)var4_4.next();
                    var20_19 = (int)var22_21.g;
                    if (var20_19 != 0) {
                        var19_18.add(var22_21);
                    } else {
                        var29_28 /* !! */  = var22_21.a;
                        var28_27 = "key_action_priority";
                        var20_19 = (int)var29_28 /* !! */ .getBoolean((String)var28_27);
                        if (var20_19 == 0 && var15_14 > var17_16) {
                            var19_18.add(var22_21);
                            var15_14 += -1;
                        }
                    }
                    if (var13_12 == null || var15_14 != var17_16) continue;
                    var19_18.add(var13_12);
                    var15_14 += -1;
                }
            }
            if (var13_12 != null && var15_14 >= var17_16) {
                var19_18.add(var13_12);
            }
            var4_4 = var19_18.iterator();
            while ((var5_5 = (int)var4_4.hasNext()) != 0) {
                var22_21 = (A42)var4_4.next();
                var2_2.a((A42)var22_21);
            }
        } else {
            var4_4 = var3_3.b.iterator();
            while ((var5_5 = (int)var4_4.hasNext()) != 0) {
                var22_21 = (A42)var4_4.next();
                var2_2.a((A42)var22_21);
            }
        }
        if ((var4_4 = var3_3.C) != null) {
            var22_21 = var2_2.f;
            var22_21.putAll((Bundle)var4_4);
        }
        var23_22 = Build.VERSION.SDK_INT;
        var22_21 = var3_3.G;
        var2_2.d = var22_21;
        var22_21 = var3_3.H;
        var2_2.e = var22_21;
        var22_21 = var2_2.b;
        var11_10 = (int)var3_3.m;
        var22_21.setShowWhen((boolean)var11_10);
        var22_21 = var2_2.b;
        var11_10 = var3_3.y;
        var22_21.setLocalOnly((boolean)var11_10);
        var22_21 = var2_2.b;
        var13_12 = var3_3.v;
        var22_21.setGroup((String)var13_12);
        var22_21 = var2_2.b;
        var13_12 = var3_3.x;
        var22_21.setSortKey((String)var13_12);
        var22_21 = var2_2.b;
        var11_10 = (int)var3_3.w;
        var22_21.setGroupSummary((boolean)var11_10);
        var22_21 = var2_2.b;
        var13_12 = var3_3.B;
        var22_21.setCategory((String)var13_12);
        var22_21 = var2_2.b;
        var11_10 = var3_3.D;
        var22_21.setColor(var11_10);
        var22_21 = var2_2.b;
        var11_10 = var3_3.E;
        var22_21.setVisibility(var11_10);
        var22_21 = var2_2.b;
        var13_12 = var3_3.F;
        var22_21.setPublicVersion((Notification)var13_12);
        var22_21 = var2_2.b;
        var13_12 = var7_7.sound;
        var7_7 = var7_7.audioAttributes;
        var22_21.setSound((Uri)var13_12, (AudioAttributes)var7_7);
        var22_21 = var3_3.R;
        var7_7 = var3_3.c;
        var11_10 = 28;
        if (var23_22 < var11_10) {
            if (var7_7 == null) {
                var23_22 = 0;
                var4_4 = null;
            } else {
                var15_14 = var7_7.size();
                var4_4 = new ArrayList(var15_14);
                var30_29 = var7_7.iterator();
                while ((var17_16 = (int)var30_29.hasNext()) != 0) {
                    var31_30 = (qr2)var30_29.next();
                    var19_18 = var31_30.c;
                    if (var19_18 == null) {
                        var31_30 = var31_30.a;
                        if (var31_30 != null) {
                            var28_27 = "name:";
                            var19_18 = new StringBuilder((String)var28_27);
                            var19_18.append(var31_30);
                            var19_18 = var19_18.toString();
                        } else {
                            var19_18 = "";
                        }
                    }
                    var4_4.add(var19_18);
                }
            }
            if (var4_4 != null) {
                if (var22_21 == null) {
                    var22_21 = var4_4;
                } else {
                    var17_16 = var4_4.size();
                    var18_17 = var22_21.size() + var17_16;
                    var30_29 = new Np(var18_17);
                    var30_29.addAll((Collection)var4_4);
                    var30_29.addAll((Collection)var22_21);
                    var22_21 = new ArrayList(var30_29);
                }
            }
        }
        if (var22_21 != null && (var23_22 = (int)var22_21.isEmpty()) == 0) {
            var4_4 = var22_21.iterator();
            while ((var5_5 = (int)var4_4.hasNext()) != 0) {
                var22_21 = (String)var4_4.next();
                var30_29 = var2_2.b;
                var30_29.addPerson((String)var22_21);
            }
        }
        if ((var5_5 = (var4_4 = var3_3.d).size()) > 0) {
            var22_21 = var3_3.C;
            if (var22_21 == null) {
                var22_21 = new Bundle();
                var3_3.C = var22_21;
            }
            var22_21 = var3_3.C;
            var30_29 = "android.car.EXTENSIONS";
            if ((var22_21 = var22_21.getBundle((String)var30_29)) == null) {
                var22_21 = new Bundle();
            }
            super((Bundle)var22_21);
            var19_18 = new Bundle();
            var28_27 = null;
            for (var20_19 = 0; var20_19 < (var24_23 = var4_4.size()); ++var20_19) {
                var29_28 /* !! */  = Integer.toString(var20_19);
                var25_24 = (A42)var4_4.get(var20_19);
                var13_12 = new Bundle();
                var27_26 = var25_24.a();
                if (var27_26 != null) {
                    var16_15 = var32_31 = var27_26.f();
                } else {
                    var16_15 = 0;
                    var33_32 = null;
                }
                var13_12.putInt("icon", var16_15);
                var33_32 = var25_24.i;
                var13_12.putCharSequence("title", (CharSequence)var33_32);
                var33_32 = var25_24.j;
                var13_12.putParcelable("actionIntent", (Parcelable)var33_32);
                var14_13 = var25_24.a;
                if (var14_13 != null) {
                    super(var14_13);
                } else {
                    super();
                }
                var6_6 = var25_24.d;
                var33_32.putBoolean("android.support.allowGeneratedReplies", (boolean)var6_6);
                var34_33 /* !! */  = "extras";
                var13_12.putBundle((String)var34_33 /* !! */ , (Bundle)var33_32);
                var14_13 = var25_24.c;
                if (var14_13 == null) {
                    var35_34 = var4_4;
                    var36_35 = var7_7;
                    var16_15 = 0;
                    var33_32 = null;
                } else {
                    var16_15 = ((GI2[])var14_13).length;
                    var33_32 = new Bundle[var16_15];
                    var35_34 = var4_4;
                    var8_8 /* !! */  = null;
                    for (var21_20 = 0; var21_20 < (var23_22 = ((GI2[])var14_13).length); ++var21_20) {
                        var4_4 = var14_13[var21_20];
                        var37_36 = var14_13;
                        var14_13 = new Bundle();
                        var36_35 = var7_7;
                        var7_7 = var4_4.a;
                        var14_13.putString("resultKey", (String)var7_7);
                        var7_7 = var4_4.b;
                        var14_13.putCharSequence("label", (CharSequence)var7_7);
                        var7_7 = var4_4.c;
                        var14_13.putCharSequenceArray("choices", (CharSequence[])var7_7);
                        var38_37 = var4_4.d;
                        var14_13.putBoolean("allowFreeFormInput", (boolean)var38_37);
                        var2_2 = var4_4.f;
                        var14_13.putBundle((String)var34_33 /* !! */ , (Bundle)var2_2);
                        var2_2 = var4_4.g;
                        if (var2_2 != null && (var23_22 = (int)var2_2.isEmpty()) == 0) {
                            var38_37 = var2_2.size();
                            var4_4 = new ArrayList(var38_37);
                            var2_2 = var2_2.iterator();
                            while ((var38_37 = (int)var2_2.hasNext()) != 0) {
                                var7_7 = (String)var2_2.next();
                                var4_4.add(var7_7);
                            }
                            var2_2 = "allowedDataTypes";
                            var14_13.putStringArrayList((String)var2_2, (ArrayList)var4_4);
                        }
                        var33_32[var21_20] = var14_13;
                        var2_2 = this;
                        var14_13 = var37_36;
                        var7_7 = var36_35;
                    }
                    var36_35 = var7_7;
                }
                var13_12.putParcelableArray("remoteInputs", (Parcelable[])var33_32);
                var23_22 = (int)var25_24.e;
                var13_12.putBoolean("showsUserInterface", (boolean)var23_22);
                var23_22 = var25_24.f;
                var13_12.putInt("semanticAction", var23_22);
                var19_18.putBundle((String)var29_28 /* !! */ , (Bundle)var13_12);
                var6_6 = 26;
                var21_20 = 23;
                var11_10 = 28;
                var12_11 = 0;
                var14_13 = null;
                var2_2 = this;
                var4_4 = var35_34;
                var7_7 = var36_35;
            }
            var36_35 = var7_7;
            var2_2 = "invisible_actions";
            var22_21.putBundle((String)var2_2, (Bundle)var19_18);
            var31_30.putBundle((String)var2_2, (Bundle)var19_18);
            var2_2 = var3_3.C;
            if (var2_2 == null) {
                var2_2 = new Bundle();
                var3_3.C = var2_2;
            }
            var3_3.C.putBundle((String)var30_29, (Bundle)var22_21);
            var2_2 = this;
            var4_4 = this.f;
            var4_4.putBundle((String)var30_29, (Bundle)var31_30);
        } else {
            var36_35 = var7_7;
        }
        var23_22 = Build.VERSION.SDK_INT;
        var5_5 = 23;
        if (var23_22 >= var5_5 && (var22_21 = var3_3.Q) != null) {
            var34_33 /* !! */  = var2_2.b;
            V42$a.c(var34_33 /* !! */ , var22_21);
        }
        if (var23_22 >= (var5_5 = 24)) {
            var22_21 = var2_2.b;
            var34_33 /* !! */  = var3_3.C;
            var22_21.setExtras((Bundle)var34_33 /* !! */ );
            V42$b.d(var2_2.b);
            var22_21 = var3_3.G;
            if (var22_21 != null) {
                var34_33 /* !! */  = var2_2.b;
                V42$b.c(var34_33 /* !! */ , (RemoteViews)var22_21);
            }
            if ((var22_21 = var3_3.H) != null) {
                var34_33 /* !! */  = var2_2.b;
                V42$b.b(var34_33 /* !! */ , (RemoteViews)var22_21);
            }
        }
        if (var23_22 >= (var5_5 = 26)) {
            var22_21 = var2_2.b;
            var6_6 = var3_3.J;
            V42$c.b((Notification.Builder)var22_21, var6_6);
            var22_21 = var2_2.b;
            var34_33 /* !! */  = var3_3.r;
            V42$c.e((Notification.Builder)var22_21, (CharSequence)var34_33 /* !! */ );
            var22_21 = var2_2.b;
            var34_33 /* !! */  = var3_3.K;
            V42$c.f((Notification.Builder)var22_21, (String)var34_33 /* !! */ );
            var22_21 = var2_2.b;
            var39_38 = var3_3.M;
            V42$c.g((Notification.Builder)var22_21, var39_38);
            var22_21 = var2_2.b;
            V42$c.d((Notification.Builder)var22_21);
            var5_5 = (int)var3_3.A;
            if (var5_5 != 0) {
                var22_21 = var2_2.b;
                var6_6 = (int)var3_3.z;
                V42$c.c((Notification.Builder)var22_21, (boolean)var6_6);
            }
            if ((var5_5 = (int)TextUtils.isEmpty((CharSequence)(var22_21 = var3_3.I))) == 0) {
                var22_21 = var2_2.b;
                var6_6 = 0;
                var34_33 /* !! */  = null;
                var22_21 = var22_21.setSound(null);
                var38_37 = 0;
                var7_7 = null;
                var22_21 = var22_21.setDefaults(0).setLights(0, 0, 0);
                var22_21.setVibrate(null);
lbl457:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
        }
        var6_6 = 0;
        var34_33 /* !! */  = null;
        ** while (true)
        var5_5 = 28;
        if (var23_22 >= var5_5) {
            var4_4 = var36_35.iterator();
            while ((var5_5 = (int)var4_4.hasNext()) != 0) {
                var22_21 = (qr2)var4_4.next();
                var7_7 = var2_2.b;
                var22_21.getClass();
                var22_21 = qr2$a.b((qr2)var22_21);
                V42$d.a((Notification.Builder)var7_7, (Person)var22_21);
            }
        }
        if ((var23_22 = Build.VERSION.SDK_INT) >= (var5_5 = 29)) {
            var7_7 = var2_2.b;
            var21_20 = (int)var3_3.N;
            V42$e.a((Notification.Builder)var7_7, (boolean)var21_20);
            var7_7 = var2_2.b;
            var8_8 /* !! */  = var3_3.O;
            if (var8_8 /* !! */  == null) {
                while (true) {
                    var12_11 = 0;
                    var14_13 = null;
                    break;
                }
            } else {
                var11_10 = 30;
                if (var23_22 >= var11_10) {
                    var14_13 = H42$b.b((H42)var8_8 /* !! */ );
                } else {
                    if (var23_22 != var5_5) ** continue;
                    var14_13 = H42$a.b((H42)var8_8 /* !! */ );
                }
            }
            V42$e.b((Notification.Builder)var7_7, var14_13);
            var3_3 = var3_3.L;
            if (var3_3 != null) {
                var4_4 = var2_2.b;
                var3_3 = var3_3.b;
                V42$e.d((Notification.Builder)var4_4, var3_3);
            }
        }
    }

    public final void a(A42 a42) {
        int n3;
        String string2;
        Object object;
        int n4 = Build.VERSION.SDK_INT;
        IconCompat iconCompat = a42.a();
        Object object2 = a42.j;
        Bundle bundle = a42.i;
        int n7 = 23;
        int n8 = 0;
        if (n4 >= n7) {
            n4 = 0;
            object = null;
            if (iconCompat != null) {
                object = iconCompat.m(null);
            }
            object = V42$a.a(object, (CharSequence)bundle, (PendingIntent)object2);
        } else {
            if (iconCompat != null) {
                n4 = iconCompat.f();
            } else {
                n4 = 0;
                object = null;
            }
            iconCompat = new Notification.Action.Builder(n4, (CharSequence)bundle, (PendingIntent)object2);
            object = iconCompat;
        }
        int n10 = 29;
        object2 = a42.c;
        if (object2 != null) {
            int n14;
            int n15 = ((GI2[])object2).length;
            bundle = new RemoteInput[n15];
            string2 = null;
            for (n7 = 0; n7 < (n14 = ((Bundle)object2).length); ++n7) {
                Bundle bundle2 = object2[n7];
                Object object3 = bundle2.a;
                RemoteInput.Builder builder = new RemoteInput.Builder((String)object3);
                object3 = bundle2.b;
                builder = builder.setLabel((CharSequence)object3);
                object3 = bundle2.c;
                builder = builder.setChoices((CharSequence[])object3);
                int n16 = bundle2.d;
                builder = builder.setAllowFreeFormInput(n16 != 0);
                object3 = bundle2.f;
                builder = builder.addExtras((Bundle)object3);
                n16 = Build.VERSION.SDK_INT;
                int n17 = 26;
                if (n16 >= n17 && (object3 = bundle2.g) != null) {
                    object3 = object3.iterator();
                    while ((n17 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                        String string3 = (String)object3.next();
                        GI2$a.b(builder, string3);
                    }
                }
                if ((n16 = Build.VERSION.SDK_INT) >= n10) {
                    n14 = bundle2.e;
                    GI2$b.b(builder, n14);
                }
                bundle[n7] = bundle2 = builder.build();
            }
            n3 = ((Bundle)bundle).length;
            while (n8 < n3) {
                string2 = bundle[n8];
                object.addRemoteInput((RemoteInput)string2);
                ++n8;
            }
        }
        bundle = (object2 = a42.a) != null ? new Bundle(object2) : new Bundle();
        n3 = a42.d;
        string2 = "android.support.allowGeneratedReplies";
        bundle.putBoolean(string2, n3 != 0);
        n7 = Build.VERSION.SDK_INT;
        n8 = 24;
        if (n7 >= n8) {
            V42$b.a((Notification.Action.Builder)object, n3 != 0);
        }
        object2 = "android.support.action.semanticAction";
        n8 = a42.f;
        bundle.putInt((String)object2, n8);
        n3 = 28;
        if (n7 >= n3) {
            V42$d.b((Notification.Action.Builder)object, n8);
        }
        if (n7 >= n10) {
            n10 = (int)(a42.g ? 1 : 0);
            V42$e.c((Notification.Action.Builder)object, n10 != 0);
        }
        if (n7 >= (n10 = 31)) {
            n10 = a42.k;
            V42$f.a((Notification.Action.Builder)object, n10 != 0);
        }
        boolean bl2 = a42.e;
        bundle.putBoolean("android.support.action.showsUserInterface", bl2);
        object.addExtras(bundle);
        a42 = object.build();
        this.b.addAction((Notification.Action)a42);
    }
}

