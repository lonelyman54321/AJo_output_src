/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.text.SpannableStringBuilder
 *  android.view.View
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

public final class as
extends RecyclerView$B {
    public final TextView a;

    public as(View view) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        int n3 = R$id.plp_auto_correct_row_tv;
        view = (TextView)view.findViewById(n3);
        this.a = view;
    }

    public final void w(String string2, String string3) {
        Object object = StringCompanionObject.INSTANCE;
        int n3 = R$string.auto_correct_msg;
        object = hv3_0.K(n3);
        int n4 = 2;
        Object object2 = new Object[n4];
        AJIOApplication aJIOApplication = null;
        object2[0] = string2;
        int n7 = 1;
        object2[n7] = string3;
        String string4 = "format(...)";
        object = xh2_0.a((Object[])object2, n4, (String)object, string4);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)object);
        if (string2 != null && string3 != null) {
            int n8 = 6;
            n7 = StringsKt.O((CharSequence)object, string2, 0, false, n8);
            int n10 = string2.length() + n7;
            FontsManager fontsManager = FontsManager.getInstance();
            AJIOApplication.Companion.getClass();
            Object object3 = AJIOApplication$a.a();
            int n14 = 10;
            fontsManager = fontsManager.getTypefaceWithFont((Context)object3, n14);
            object3 = "";
            AjioCustomTypefaceSpan ajioCustomTypefaceSpan = new AjioCustomTypefaceSpan((String)object3, (Typeface)fontsManager);
            int n15 = 33;
            spannableStringBuilder.setSpan((Object)ajioCustomTypefaceSpan, n7, n10, n15);
            n10 = StringsKt.R((CharSequence)object, string3, 0, n8);
            int n16 = string3.length() + n10;
            object2 = FontsManager.getInstance();
            aJIOApplication = AJIOApplication$a.a();
            object2 = ((FontsManager)object2).getTypefaceWithFont((Context)aJIOApplication, n14);
            object = new AjioCustomTypefaceSpan((String)object3, (Typeface)object2);
            spannableStringBuilder.setSpan(object, n10, n16, n15);
        }
        this.a.setText((CharSequence)spannableStringBuilder);
    }
}

