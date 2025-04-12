/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vo0
 */
public final class vo0_2
implements View.OnFocusChangeListener {
    public final /* synthetic */ yo0_2 a;

    public /* synthetic */ vo0_2(yo0_2 yo0_22) {
        this.a = yo0_22;
    }

    public final void onFocusChange(View object, boolean bl2) {
        yo0_2 yo0_22 = this.a;
        Intrinsics.checkNotNullParameter(yo0_22, "this$0");
        object = yo0_22.a;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            object = null;
        }
        object.tvReason.showDropDown();
    }
}

