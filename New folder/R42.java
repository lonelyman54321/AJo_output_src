/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$BigTextStyle
 *  android.app.Notification$Builder
 *  android.app.Notification$MessagingStyle
 *  android.app.Notification$MessagingStyle$Message
 *  android.content.res.ColorStateList
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.SpannableStringBuilder
 *  android.text.TextUtils
 *  android.text.style.TextAppearanceSpan
 */
import android.app.Notification;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.ArrayList;
import java.util.List;

public final class R42
extends U42 {
    public final ArrayList e;
    public final ArrayList f;
    public qr2 g;
    public CharSequence h;
    public Boolean i;

    public R42() {
        ArrayList arrayList;
        this.e = arrayList = new ArrayList();
        this.f = arrayList = new ArrayList();
    }

    public final void a(Bundle bundle) {
        boolean bl2;
        boolean bl3;
        super.a(bundle);
        Object object = this.g.a;
        bundle.putCharSequence("android.selfDisplayName", (CharSequence)object);
        object = this.g.b();
        bundle.putBundle("android.messagingStyleUser", (Bundle)object);
        CharSequence charSequence = this.h;
        bundle.putCharSequence("android.hiddenConversationTitle", charSequence);
        object = this.h;
        if (object != null && (bl3 = ((Boolean)(object = this.i)).booleanValue())) {
            object = "android.conversationTitle";
            charSequence = this.h;
            bundle.putCharSequence((String)object, charSequence);
        }
        if (!(bl2 = ((ArrayList)(object = this.e)).isEmpty())) {
            object = R42$d.a((List)object);
            charSequence = "android.messages";
            bundle.putParcelableArray((String)charSequence, (Parcelable[])object);
        }
        if (!(bl2 = ((ArrayList)(object = this.f)).isEmpty())) {
            object = R42$d.a((List)object);
            charSequence = "android.messages.historic";
            bundle.putParcelableArray((String)charSequence, (Parcelable[])object);
        }
        if ((object = this.i) != null) {
            charSequence = "android.isGroupConversation";
            bl3 = (Boolean)object;
            bundle.putBoolean((String)charSequence, bl3);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void b(V42 var1_1) {
        block27: {
            var2_2 = this.a;
            var3_3 = 28;
            var4_4 = 0;
            var5_5 = null;
            var6_6 = 1;
            if (var2_2 == null) ** GOTO lbl18
            var2_2 = var2_2.a.getApplicationInfo();
            var7_7 = var2_2.targetSdkVersion;
            if (var7_7 >= var3_3 || (var2_2 = this.i) != null) ** GOTO lbl18
            var2_2 = this.h;
            if (var2_2 != null) {
                var7_7 = 1;
            } else {
                while (true) {
                    var7_7 = 0;
                    var2_2 = null;
                    break block27;
                    break;
                }
lbl18:
                // 2 sources

                if ((var2_2 = this.i) == null) ** continue;
                var7_7 = (int)var2_2.booleanValue();
            }
        }
        this.i = var2_2 = Boolean.valueOf((boolean)var7_7);
        var7_7 = Build.VERSION.SDK_INT;
        var8_8 = this.e;
        var1_1 = var1_1.b;
        var9_9 = 24;
        if (var7_7 >= var9_9) {
            if (var7_7 >= var3_3) {
                var2_2 = this.g;
                var2_2.getClass();
                var2_2 = R42$c.a(qr2$a.b((qr2)var2_2));
            } else {
                var2_2 = R42$a.b(this.g.a);
            }
            var5_5 = var8_8.iterator();
            while ((var6_6 = (int)var5_5.hasNext()) != 0) {
                var10_10 = (R42$d)var5_5.next();
                var8_8 = Q42.a(var2_2);
                var10_10 = var10_10.c();
                R42$a.a((Notification.MessagingStyle)var8_8, (Notification.MessagingStyle.Message)var10_10);
            }
            var4_4 = Build.VERSION.SDK_INT;
            var6_6 = 26;
            if (var4_4 >= var6_6) {
                var5_5 = this.f.iterator();
                while ((var6_6 = (int)var5_5.hasNext()) != 0) {
                    var10_10 = (R42$d)var5_5.next();
                    var8_8 = Q42.a(var2_2);
                    var10_10 = var10_10.c();
                    R42$b.a((Notification.MessagingStyle)var8_8, (Notification.MessagingStyle.Message)var10_10);
                }
            }
            if ((var4_4 = (int)(var5_5 = this.i).booleanValue()) != 0 || (var4_4 = Build.VERSION.SDK_INT) >= var3_3) {
                var5_5 = Q42.a(var2_2);
                var10_10 = this.h;
                R42$a.c((Notification.MessagingStyle)var5_5, (CharSequence)var10_10);
            }
            if ((var4_4 = Build.VERSION.SDK_INT) >= var3_3) {
                var11_11 = Q42.a(var2_2);
                var5_5 = this.i;
                var4_4 = (int)var5_5.booleanValue();
                R42$c.b(var11_11, (boolean)var4_4);
            }
            var2_2.setBuilder((Notification.Builder)var1_1);
        } else {
            block28: {
                var7_7 = var8_8.size() - var6_6;
                while (true) {
                    var3_3 = 0;
                    var11_12 = null;
                    if (var7_7 < 0) break;
                    var12_13 = (R42$d)var8_8.get(var7_7);
                    var13_14 = var12_13.c;
                    if (var13_14 == null || (var14_15 = TextUtils.isEmpty((CharSequence)(var13_14 = var13_14.a))) != 0) {
                        var7_7 += -1;
                        continue;
                    }
                    break block28;
                    break;
                }
                var7_7 = (int)var8_8.isEmpty();
                if (var7_7 == 0) {
                    var12_13 = var2_2 = pp_0.a(var6_6, var8_8);
                    var12_13 = (R42$d)var2_2;
                } else {
                    var9_9 = 0;
                    var12_13 = null;
                }
            }
            var2_2 = this.h;
            if (var2_2 != null && (var7_7 = (int)(var2_2 = this.i).booleanValue()) != 0) {
                var2_2 = this.h;
                var1_1.setContentTitle((CharSequence)var2_2);
            } else if (var12_13 != null) {
                var1_1.setContentTitle("");
                var2_2 = var12_13.c;
                if (var2_2 != null) {
                    var2_2 = var2_2.a;
                    var1_1.setContentTitle((CharSequence)var2_2);
                }
            }
            if (var12_13 != null) {
                var2_2 = this.h;
                var2_2 = var2_2 != null ? this.l((R42$d)var12_13) : var12_13.a;
                var1_1.setContentText((CharSequence)var2_2);
            }
            var2_2 = new SpannableStringBuilder();
            var12_13 = this.h;
            if (var12_13 == null) {
                for (var9_9 = var8_8.size() - var6_6; var9_9 >= 0; var9_9 += -1) {
                    var13_14 = ((R42$d)var8_8.get((int)var9_9)).c;
                    if (var13_14 == null || (var13_14 = var13_14.a) != null) {
                        continue;
                    }
                    ** break block29
                }
                var9_9 = 0;
                var12_13 = null;
            } else lbl-1000:
            // 2 sources

            {
                var9_9 = 1;
            }
            for (var14_15 = var8_8.size() - var6_6; var14_15 >= 0; var14_15 += -1) {
                var15_16 = (R42$d)var8_8.get(var14_15);
                var15_16 = var9_9 != 0 ? this.l((R42$d)var15_16) : var15_16.a;
                var16_17 = var8_8.size() - var6_6;
                if (var14_15 != var16_17) {
                    var17_18 = "\n";
                    var2_2.insert(0, (CharSequence)var17_18);
                }
                var2_2.insert(0, (CharSequence)var15_16);
            }
            var5_5 = new Notification.BigTextStyle((Notification.Builder)var1_1);
            var1_1 = var5_5.setBigContentTitle(null);
            var1_1.bigText((CharSequence)var2_2);
        }
    }

    public final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.messagingStyleUser");
        bundle.remove("android.selfDisplayName");
        bundle.remove("android.conversationTitle");
        bundle.remove("android.hiddenConversationTitle");
        bundle.remove("android.messages");
        bundle.remove("android.messages.historic");
        bundle.remove("android.isGroupConversation");
    }

    public final String f() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    public final void j(Bundle object) {
        boolean bl2;
        super.j((Bundle)object);
        Object object2 = this.e;
        object2.clear();
        Object object3 = "android.messagingStyleUser";
        boolean bl3 = object.containsKey((String)object3);
        if (bl3) {
            this.g = object3 = qr2.a(object.getBundle((String)object3));
        } else {
            object3 = object.getString("android.selfDisplayName");
            qr2 qr22 = new Object();
            qr22.a = object3;
            qr22.b = null;
            qr22.c = null;
            qr22.d = null;
            bl2 = false;
            object3 = null;
            qr22.e = false;
            qr22.f = false;
            this.g = qr22;
        }
        this.h = object3 = object.getCharSequence("android.conversationTitle");
        if (object3 == null) {
            object3 = object.getCharSequence("android.hiddenConversationTitle");
            this.h = object3;
        }
        if ((object3 = object.getParcelableArray("android.messages")) != null) {
            object3 = R42$d.b((Parcelable[])object3);
            object2.addAll(object3);
        }
        if ((object2 = object.getParcelableArray("android.messages.historic")) != null) {
            object3 = this.f;
            object2 = R42$d.b(object2);
            ((ArrayList)object3).addAll(object2);
        }
        if (bl2 = object.containsKey((String)(object2 = "android.isGroupConversation"))) {
            boolean bl4 = object.getBoolean((String)object2);
            object = bl4;
            this.i = object;
        }
    }

    public final SpannableStringBuilder l(R42$d object) {
        Object object2;
        Hx hx = Hx.c();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Object object3 = ((R42$d)object).c;
        Object object4 = "";
        object3 = object3 == null ? object4 : ((qr2)object3).a;
        int n3 = TextUtils.isEmpty((CharSequence)object3);
        int n4 = -16777216;
        if (n3 != 0) {
            object3 = this.g.a;
            object2 = this.a;
            n3 = ((J42)object2).D;
            if (n3 != 0) {
                n4 = n3;
            }
        }
        object2 = hx.c;
        object3 = hx.d((CharSequence)object3, (Qj3)object2);
        spannableStringBuilder.append((CharSequence)object3);
        ColorStateList colorStateList = ColorStateList.valueOf((int)n4);
        object2 = new TextAppearanceSpan(null, 0, 0, colorStateList, null);
        n4 = spannableStringBuilder.length();
        int n7 = object3.length();
        n4 -= n7;
        n7 = spannableStringBuilder.length();
        int n8 = 33;
        spannableStringBuilder.setSpan(object2, n4, n7, n8);
        object = ((R42$d)object).a;
        if (object != null) {
            object4 = object;
        }
        object = spannableStringBuilder.append((CharSequence)"  ");
        object3 = hx.c;
        hx = hx.d((CharSequence)object4, (Qj3)object3);
        object.append((CharSequence)((Object)hx));
        return spannableStringBuilder;
    }
}

