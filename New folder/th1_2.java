/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextWatcher
 *  android.widget.TextView
 */
import android.text.TextWatcher;
import android.widget.TextView;

/*
 * Renamed from th1
 */
public abstract class th1_2
extends t62_0 {
    public final void f(e62_0 e62_02) {
        Object object = this;
        object = (pm3_0)this;
        TextView textView = ((pm3_0)object).a;
        Pm3$a pm3$a = new Pm3$a(textView, e62_02);
        e62_02.a(pm3$a);
        textView.addTextChangedListener((TextWatcher)pm3$a);
        CharSequence charSequence = textView.getText();
        object = new hs_0(textView, charSequence, 0, 0, 0);
        e62_02.b(object);
    }
}

