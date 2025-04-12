/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.text.Editable
 *  android.text.TextWatcher
 */
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jD0
 */
public final class jd0_2
implements TextWatcher {
    public final /* synthetic */ gd0_0 a;
    public final /* synthetic */ Activity b;

    public jd0_2(gd0_0 gd0_02, FragmentActivity fragmentActivity) {
        this.a = gd0_02;
        this.b = fragmentActivity;
    }

    public final void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "s");
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
    }

    public final void onTextChanged(CharSequence object, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(object, "s");
        object = this.a;
        Activity activity = this.b;
        ((gd0_0)object).j(activity);
    }
}

