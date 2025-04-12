/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 */
import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.functions.Function1;

public final class aI0$a
implements TextWatcher {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ hx0_2 b;
    public final /* synthetic */ hx0_2 c;

    public aI0$a(Function1 function1, hx0_2 hx0_22, hx0_2 hx0_23) {
        this.a = function1;
        this.b = hx0_22;
        this.c = hx0_23;
    }

    public final void afterTextChanged(Editable editable) {
        this.a.invoke(editable);
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Integer n8 = n3;
        Integer n10 = n4;
        Integer n14 = n7;
        this.b.invoke(charSequence, n8, n10, n14);
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Integer n8 = n3;
        Integer n10 = n4;
        Integer n14 = n7;
        this.c.invoke(charSequence, n8, n10, n14);
    }
}

