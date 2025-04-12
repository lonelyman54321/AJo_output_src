/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextWatcher
 *  android.view.View
 *  android.widget.EditText
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class YS$a
extends rw_2 {
    public final EditText b;
    public final EditText c;
    public final TextInputLayout d;
    public final TextView e;
    public final TextView f;
    public final /* synthetic */ ys_1 g;

    public YS$a(ys_1 object, View view) {
        Object object2;
        Intrinsics.checkNotNullParameter(view, "itemView");
        this.g = object;
        super(view);
        int n3 = R$id.tv_name_error;
        this.e = object2 = (TextView)view.findViewById(n3);
        n3 = R$id.tv_phone_error;
        this.f = object2 = (TextView)view.findViewById(n3);
        n3 = R$id.mobile_text_input;
        object2 = (TextInputLayout)view.findViewById(n3);
        this.d = object2;
        n3 = R$id.name_et;
        object2 = (EditText)view.findViewById(n3);
        this.c = object2;
        int n4 = R$id.mobile_et;
        view = (EditText)view.findViewById(n4);
        this.b = view;
        Object object3 = new YS$a$a(this, (ys_1)object);
        object2.addTextChangedListener((TextWatcher)object3);
        super(this, (ys_1)object);
        view.addTextChangedListener((TextWatcher)object3);
        object3 = new YS$a$c(this, (ys_1)object);
        view.setOnEditorActionListener((TextView.OnEditorActionListener)object3);
        object = new Object();
        object2.setOnEditorActionListener((TextView.OnEditorActionListener)object);
    }
}

