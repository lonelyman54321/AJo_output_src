/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.text.Html
 *  android.widget.RemoteViews
 */
import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.widget.RemoteViews;
import com.clevertap.android.pushtemplates.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ix
 */
public class ix_0
extends q70_0 {
    public ix_0(int n3, uj3_1 uj3_12, Context context) {
        int n4;
        int n7;
        Intrinsics.checkNotNullParameter(context, "context");
        String string2 = "renderer";
        Intrinsics.checkNotNullParameter(uj3_12, string2);
        super(n3, uj3_12, context);
        this.a();
        String string3 = uj3_12.c;
        this.h(string3);
        string3 = uj3_12.d;
        this.e(string3);
        string3 = uj3_12.r;
        this.c(string3);
        string3 = uj3_12.h;
        this.i(string3);
        string3 = uj3_12.i;
        this.f(string3);
        string3 = uj3_12.e;
        if (string3 != null && (n7 = string3.length()) > 0) {
            n7 = Build.VERSION.SDK_INT;
            RemoteViews remoteViews = this.c;
            n4 = 24;
            if (n7 >= n4) {
                n7 = R$id.msg;
                string3 = jC2.a(string3);
                remoteViews.setTextViewText(n7, (CharSequence)string3);
            } else {
                n7 = R$id.msg;
                string3 = Html.fromHtml((String)string3);
                remoteViews.setTextViewText(n7, (CharSequence)string3);
            }
        }
        this.g();
        string3 = uj3_12.g;
        string2 = this.c;
        int n8 = 8;
        if (string3 != null && (n4 = string3.length()) > 0) {
            n4 = R$id.big_image;
            xz3_0.p(n4, string3, (RemoteViews)string2, context);
            n3 = (int)(Xv2.c ? 1 : 0);
            if (n3 != 0) {
                n3 = R$id.big_image;
                string2.setViewVisibility(n3, n8);
            }
        } else {
            n3 = R$id.big_image;
            string2.setViewVisibility(n3, n8);
        }
        string3 = uj3_12.f;
        this.d(string3);
    }
}

