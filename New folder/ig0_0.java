/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.widget.TextView
 *  android.widget.Toast
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ig0
 */
public final class ig0_0 {
    public static final ig0$a Companion;

    static {
        ig0$a ig0$a;
        Companion = ig0$a = new Object();
    }

    public static void a(Context context, String object, Integer n3, String string2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(object, "msg");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)context);
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "from(...)");
        int n4 = R$layout.custom_revamp_toast;
        layoutInflater = layoutInflater.inflate(n4, null);
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "inflate(...)");
        n4 = R$id.toast_text;
        View view = layoutInflater.findViewById(n4);
        String string3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view, string3);
        view = (TextView)view;
        view.setText((CharSequence)object);
        if (string2 != null) {
            object = new ig0$b(string2);
            view.setAccessibilityDelegate((View.AccessibilityDelegate)object);
        }
        object = new Toast(context);
        object.setGravity(80, 0, 200);
        Intrinsics.checkNotNull(n3);
        int n7 = n3;
        object.setDuration(n7);
        object.setView((View)layoutInflater);
        object.show();
    }

    public static /* synthetic */ void b(Context context, String string2, Integer n3, int n4) {
        if ((n4 &= 4) != 0) {
            int n7 = 1;
            n3 = n7;
        }
        ig0_0.a(context, string2, n3, null);
    }

    public static void c(AJIOApplication aJIOApplication, String object, String string2) {
        Integer n3 = 0;
        Intrinsics.checkNotNullParameter(aJIOApplication, "context");
        Intrinsics.checkNotNullParameter(object, "msg");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)aJIOApplication);
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "from(...)");
        int n4 = R$layout.custom_revamp_toast;
        layoutInflater = layoutInflater.inflate(n4, null);
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "inflate(...)");
        n4 = R$id.toast_text;
        View view = layoutInflater.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view, "findViewById(...)");
        view = (TextView)view;
        view.setText((CharSequence)object);
        object = new jg0_0(string2);
        view.setAccessibilityDelegate((View.AccessibilityDelegate)object);
        object = new Toast((Context)aJIOApplication);
        object.setGravity(17, 0, 0);
        Intrinsics.checkNotNull(n3);
        object.setDuration(0);
        object.setView((View)layoutInflater);
        object.show();
    }
}

