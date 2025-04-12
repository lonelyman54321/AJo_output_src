/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  android.text.Spannable$Factory
 *  android.view.View
 *  android.widget.TextView
 */
import android.graphics.Typeface;
import android.text.Spannable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from MM
 */
public final class mm_2
extends RecyclerView$B {
    public final j82_0 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;

    public mm_2(View view, j82_0 object) {
        Intrinsics.checkNotNullParameter(view, "view");
        String string2 = "onCartClickListener";
        Intrinsics.checkNotNullParameter(object, string2);
        super(view);
        this.a = object;
        view = this.itemView;
        object = "itemView";
        Intrinsics.checkNotNullExpressionValue(view, (String)object);
        Intrinsics.checkNotNullParameter(view, (String)object);
        int n3 = R$id.ajioWalletInfoTv;
        object = (TextView)view.findViewById(n3);
        this.b = object;
        n3 = R$id.knowMore;
        object = (TextView)view.findViewById(n3);
        this.c = object;
        n3 = R$id.ajioWalletTv;
        view = (TextView)view.findViewById(n3);
        this.d = view;
        boolean bl2 = og1_1.b();
        if (bl2) {
            TextView textView;
            view = this.c;
            n3 = 0;
            object = null;
            string2 = "ajioInfoView";
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                view = null;
            }
            if ((textView = this.c) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object = textView;
            }
            n3 = object.getPaintFlags() | 8;
            view.setPaintFlags(n3);
        }
    }

    public static void w(TextView textView, String string2) {
        String string3;
        AJIOApplication.Companion.getClass();
        Object object = mz3_0.t(AJIOApplication$a.a(), 10);
        AjioCustomTypefaceSpan ajioCustomTypefaceSpan = new AjioCustomTypefaceSpan("", (Typeface)object);
        object = "\u20b9";
        int n3 = 0;
        int n4 = 6;
        int n7 = StringsKt.O(string2, (String)object, 0, false, n4);
        if (n7 > 0 && (n3 = StringsKt.O(string2, string3 = " ", n7, false, n4 = 4)) > 0) {
            Spannable.Factory factory = Spannable.Factory.getInstance();
            string2 = factory.newSpannable((CharSequence)string2);
            n4 = 33;
            string2.setSpan((Object)ajioCustomTypefaceSpan, n7, n3, n4);
            textView.setText((CharSequence)string2);
        } else {
            textView.setText((CharSequence)string2);
        }
    }
}

