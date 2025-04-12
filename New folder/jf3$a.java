/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

public final class jf3$a {
    public static final jf3$a$a Companion;
    public final AjioTextView a;
    public final View b;
    public final View c;

    static {
        jf3$a$a jf3$a$a;
        Companion = jf3$a$a = new Object();
    }

    public jf3$a(View view) {
        Intrinsics.checkNotNullParameter(view, "convertView");
        int n3 = R$id.sub_category_sub_tv;
        Object object = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (AjioTextView)object;
        this.a = object;
        n3 = R$id.row_sub_category_sub_child;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.b = object;
        n3 = R$id.sub_category_sub_imv;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        this.c = view;
    }
}

