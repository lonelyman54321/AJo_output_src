/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.os.Build$VERSION
 *  android.text.Html
 *  android.text.format.DateUtils
 *  android.widget.RemoteViews
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.Html;
import android.text.format.DateUtils;
import android.widget.RemoteViews;
import com.clevertap.android.pushtemplates.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from q70
 */
public class q70_0 {
    public final Context a;
    public final uj3_1 b;
    public final RemoteViews c;

    public q70_0(int n3, uj3_1 uj3_12, Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(uj3_12, "renderer");
        this.a = object;
        this.b = uj3_12;
        object = object.getPackageName();
        super((String)object, n3);
        this.c = uj3_12;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a() {
        var1_1 = this.c;
        var2_2 = R$id.app_name;
        var3_3 = this.a;
        var4_4 = xz3_0.e(var3_3);
        var1_1.setTextViewText(var2_2, (CharSequence)var4_4);
        var2_2 = R$id.timestamp;
        var5_5 = System.currentTimeMillis();
        var7_6 = 1;
        var4_4 = DateUtils.formatDateTime((Context)var3_3, (long)var5_5, (int)var7_6);
        var1_1.setTextViewText(var2_2, (CharSequence)var4_4);
        var8_7 = this.b;
        var4_4 = var8_7.M;
        if (var4_4 == null) ** GOTO lbl-1000
        Intrinsics.checkNotNull(var4_4);
        var9_8 = var4_4.length();
        if (var9_8 > 0) {
            var9_8 = Build.VERSION.SDK_INT;
            var10_9 = 24;
            if (var9_8 >= var10_9) {
                var9_8 = R$id.subtitle;
                var11_10 /* !! */  = jC2.a(var8_7.M);
                var1_1.setTextViewText(var9_8, (CharSequence)var11_10 /* !! */ );
            } else {
                var9_8 = R$id.subtitle;
                var11_10 /* !! */  = Html.fromHtml((String)var8_7.M);
                var1_1.setTextViewText(var9_8, (CharSequence)var11_10 /* !! */ );
            }
        } else lbl-1000:
        // 2 sources

        {
            var9_8 = R$id.subtitle;
            var10_9 = 8;
            var1_1.setViewVisibility(var9_8, var10_9);
            var9_8 = R$id.sep_subtitle;
            var1_1.setViewVisibility(var9_8, var10_9);
        }
        var4_4 = var8_7.F;
        if (var4_4 != null) {
            Intrinsics.checkNotNull(var4_4);
            var9_8 = var4_4.length();
            if (var9_8 > 0) {
                var9_8 = R$id.app_name;
                var11_10 /* !! */  = var8_7.F;
                var12_11 = "#A6A6A6";
                var10_9 = xz3_0.h((String)var11_10 /* !! */ , var12_11);
                var1_1.setTextColor(var9_8, var10_9);
                var9_8 = R$id.timestamp;
                var10_9 = xz3_0.h(var8_7.F, var12_11);
                var1_1.setTextColor(var9_8, var10_9);
                var9_8 = R$id.subtitle;
                var11_10 /* !! */  = var8_7.F;
                var10_9 = xz3_0.h((String)var11_10 /* !! */ , var12_11);
                var1_1.setTextColor(var9_8, var10_9);
                var1_1 = var3_3.getResources();
                var4_4 = "pt_dot_sep";
                var11_10 /* !! */  = "drawable";
                var12_11 = var3_3.getPackageName();
                var13_12 = var1_1.getIdentifier(var4_4, (String)var11_10 /* !! */ , var12_11);
                var8_7 = var8_7.F;
                try {
                    xz3_0.r(var3_3, var13_12, (String)var8_7);
                }
                catch (NullPointerException v0) {
                    ak2_1.a();
                }
            }
        }
    }

    public final void b(String string2) {
        int n3;
        if (string2 != null && (n3 = string2.length()) > 0) {
            RemoteViews remoteViews = this.c;
            int n4 = R$id.content_view_small;
            int n7 = xz3_0.h(string2, "#FFFFFF");
            String string3 = "setBackgroundColor";
            remoteViews.setInt(n4, string3, n7);
        }
    }

    public final void c(String string2) {
        int n3;
        if (string2 != null && (n3 = string2.length()) > 0) {
            RemoteViews remoteViews = this.c;
            int n4 = R$id.content_view_big;
            int n7 = xz3_0.h(string2, "#FFFFFF");
            String string3 = "setBackgroundColor";
            remoteViews.setInt(n4, string3, n7);
        }
    }

    public final void d(String string2) {
        int n3;
        RemoteViews remoteViews = this.c;
        if (string2 != null && (n3 = string2.length()) > 0) {
            n3 = R$id.large_icon;
            Context context = this.a;
            xz3_0.p(n3, string2, remoteViews, context);
        } else {
            int n4 = R$id.large_icon;
            n3 = 8;
            remoteViews.setViewVisibility(n4, n3);
        }
    }

    public final void e(String string2) {
        int n3;
        if (string2 != null && (n3 = string2.length()) > 0) {
            n3 = Build.VERSION.SDK_INT;
            RemoteViews remoteViews = this.c;
            int n4 = 24;
            if (n3 >= n4) {
                n3 = R$id.msg;
                string2 = jC2.a(string2);
                remoteViews.setTextViewText(n3, (CharSequence)string2);
            } else {
                n3 = R$id.msg;
                string2 = Html.fromHtml((String)string2);
                remoteViews.setTextViewText(n3, (CharSequence)string2);
            }
        }
    }

    public final void f(String string2) {
        int n3;
        if (string2 != null && (n3 = string2.length()) > 0) {
            RemoteViews remoteViews = this.c;
            int n4 = R$id.msg;
            String string3 = "#000000";
            int n7 = xz3_0.h(string2, string3);
            remoteViews.setTextColor(n4, n7);
        }
    }

    public final void g() {
        uj3_1 uj3_12 = this.b;
        Bitmap bitmap = uj3_12.I;
        RemoteViews remoteViews = this.c;
        if (bitmap != null) {
            int n3 = R$id.small_icon;
            remoteViews.setImageViewBitmap(n3, bitmap);
        } else {
            int n4 = R$id.small_icon;
            int n7 = uj3_12.u;
            remoteViews.setImageViewResource(n4, n7);
        }
    }

    public final void h(String string2) {
        int n3;
        if (string2 != null && (n3 = string2.length()) > 0) {
            n3 = Build.VERSION.SDK_INT;
            RemoteViews remoteViews = this.c;
            int n4 = 24;
            if (n3 >= n4) {
                n3 = R$id.title;
                string2 = jC2.a(string2);
                remoteViews.setTextViewText(n3, (CharSequence)string2);
            } else {
                n3 = R$id.title;
                string2 = Html.fromHtml((String)string2);
                remoteViews.setTextViewText(n3, (CharSequence)string2);
            }
        }
    }

    public final void i(String string2) {
        int n3;
        if (string2 != null && (n3 = string2.length()) > 0) {
            RemoteViews remoteViews = this.c;
            int n4 = R$id.title;
            String string3 = "#000000";
            int n7 = xz3_0.h(string2, string3);
            remoteViews.setTextColor(n4, n7);
        }
    }
}

