/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.widget.TextView
 */
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.R$id;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.ril.ajio.R$color;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class aB0$a {
    public static void a(Activity activity) {
        int n3 = 1;
        Intrinsics.checkNotNullParameter(activity, "activity");
        int n4 = 0x1020002;
        Object object = activity.findViewById(n4);
        int n7 = R$string.api_alert_title;
        String string2 = hv3_0.K(n7);
        Handler handler = null;
        object = Snackbar.make((View)object, string2, 0);
        Intrinsics.checkNotNullExpressionValue(object, "make(...)");
        string2 = ((BaseTransientBottomBar)object).getView();
        Intrinsics.checkNotNullExpressionValue(string2, "getView(...)");
        int n8 = R$id.snackbar_text;
        Object object2 = (TextView)string2.findViewById(n8);
        int n10 = t70.getColor((Context)activity, 17170443);
        string2.setBackgroundColor(n10);
        if (object2 != null) {
            n10 = t70.getColor((Context)activity, 17170444);
            object2.setTextColor(n10);
        }
        object2 = StringCompanionObject.INSTANCE;
        object2 = hv3_0.K(R$string.acc_error_message);
        String string3 = hv3_0.K(R$string.api_alert_title);
        Object[] objectArray = new Object[n3];
        objectArray[0] = string3;
        String string4 = xh2_0.a(objectArray, n3, (String)object2, "format(...)");
        object2 = Looper.getMainLooper();
        handler = new Handler((Looper)object2);
        object2 = new za0_0((View)string2, string4);
        handler.postDelayed((Runnable)object2, (long)100);
        n3 = R$color.color_176d93;
        int n14 = t70.getColor((Context)activity, n3);
        ((Snackbar)object).setActionTextColor(n14);
        ((Snackbar)object).show();
    }
}

