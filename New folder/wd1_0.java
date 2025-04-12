/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.text.SpannableString
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from WD1
 */
public final class wd1_0
extends bQ {
    public final KQ c;
    public final TextView d;

    public wd1_0(View view, KQ kQ) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(kQ, "categoryTitleClickListener");
        super(view, kQ);
        this.c = kQ;
        int n3 = R$id.category_facet_row_tv;
        view = (TextView)view.findViewById(n3);
        this.d = view;
    }

    public final void w(Map.Entry object) {
        Intrinsics.checkNotNullParameter(object, "titleCountEntry");
        String string2 = (String)object.getKey();
        int n3 = ((Number)object.getValue()).intValue();
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append(" (");
        ((StringBuilder)object2).append(n3);
        ((StringBuilder)object2).append(")");
        object = ((StringBuilder)object2).toString();
        int n4 = string2.length() + 1;
        int n7 = ((String)object).length();
        SpannableString spannableString = new SpannableString((CharSequence)object);
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        aJIOApplication = hv3_0.o(9, (Context)aJIOApplication);
        Intrinsics.checkNotNull(aJIOApplication);
        object = new AjioCustomTypefaceSpan("", (Typeface)aJIOApplication);
        spannableString.setSpan(object, n4, n7, 33);
        this.d.setText((CharSequence)spannableString);
        object = this.itemView;
        object2 = new a71_0(1, this, string2);
        object.setOnClickListener((View.OnClickListener)object2);
    }
}

