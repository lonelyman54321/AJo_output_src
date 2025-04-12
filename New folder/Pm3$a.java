/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.widget.TextView
 */
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import io.reactivex.android.MainThreadDisposable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class Pm3$a
extends MainThreadDisposable
implements TextWatcher {
    public final TextView b;
    public final e62_0 c;

    public Pm3$a(TextView textView, e62_0 e62_02) {
        this.b = textView;
        this.c = e62_02;
    }

    public final void a() {
        this.b.removeTextChangedListener((TextWatcher)this);
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
    }

    public final void onTextChanged(CharSequence object, int n3, int n4, int n7) {
        Object object2 = this.a;
        boolean bl2 = ((AtomicBoolean)object2).get();
        if (!bl2) {
            TextView textView = this.b;
            object2 = new hs_0(textView, (CharSequence)object, n3, n4, n7);
            object = this.c;
            object.b(object2);
        }
    }
}

