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
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public class bQ
extends RecyclerView$B {
    public final KQ a;
    public final TextView b;

    public bQ(View view, KQ kQ) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(kQ, "categoryTitleClickListener");
        super(view);
        this.a = kQ;
        int n3 = R$id.category_facet_row_tv;
        view = (TextView)view.findViewById(n3);
        this.b = view;
    }

    public void w(Map.Entry object) {
        Intrinsics.checkNotNullParameter(object, "titleCountEntry");
        String string2 = (String)object.getKey();
        int n3 = ((Number)object.getValue()).intValue();
        Object object2 = new StringBuilder();
        object2.append(string2);
        object2.append(" (");
        object2.append(n3);
        object2.append(")");
        object2 = object2.toString();
        int n4 = string2.length() + 1;
        int n7 = ((String)object2).length();
        SpannableString spannableString = new SpannableString((CharSequence)object2);
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        aJIOApplication = hv3_0.o(9, (Context)aJIOApplication);
        Intrinsics.checkNotNull(aJIOApplication);
        object2 = new AjioCustomTypefaceSpan("", (Typeface)aJIOApplication);
        spannableString.setSpan(object2, n4, n7, 33);
        object2 = this.b;
        object2.setText((CharSequence)spannableString);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" ");
        stringBuilder.append(n3);
        stringBuilder.append(" products");
        object = stringBuilder.toString();
        object2.setContentDescription((CharSequence)object);
        object = this.itemView;
        object2 = new aQ(this, string2);
        object.setOnClickListener((View.OnClickListener)object2);
    }
}

