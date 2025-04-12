/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 */
import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.internal.Intrinsics;

public final class lM$c
implements TextWatcher {
    public final /* synthetic */ lm_2 a;

    public lM$c(lm_2 lm_22) {
        this.a = lm_22;
    }

    public final void afterTextChanged(Editable object) {
        Object object2 = "s";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.length();
        int n4 = 6;
        if (n3 == n4) {
            object = object.toString();
            object2 = this.a;
            ((lm_2)object2).Pa((String)object);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
    }
}

