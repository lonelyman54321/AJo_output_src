/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextWatcher
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 *  android.widget.TextView
 */
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fC0$a
 */
public final class fc0$a_0
extends RecyclerView$B {
    public final TextView a;
    public final TextInputLayout b;

    public fc0$a_0(fc0_1 object, View view) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        int n3 = R$id.tv_pincode_check;
        View view2 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.a = view2;
        int n4 = R$id.pincode_text_input;
        Object object2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextInputLayout)((Object)object2);
        this.b = object2;
        view2.setOnClickListener((View.OnClickListener)object);
        n3 = R$id.pincode_et;
        view = (EditText)view.findViewById(n3);
        ((fc0_1)object).c = view;
        if (view != null) {
            object = new fC0$a$a(this);
            view.addTextChangedListener((TextWatcher)object);
        }
    }
}

