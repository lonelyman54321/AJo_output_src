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
 * Renamed from hh2
 */
public final class hh2_1
implements View.OnFocusChangeListener {
    public final /* synthetic */ qh2_2 a;

    public /* synthetic */ hh2_1(qh2_2 qh2_22) {
        this.a = qh2_22;
    }

    public final void onFocusChange(View object, boolean bl2) {
        object = "this$0";
        qh2_2 qh2_22 = this.a;
        Intrinsics.checkNotNullParameter(qh2_22, (String)object);
        boolean bl3 = og1_1.b();
        if (bl3 && !bl2 && (object = qh2_22.l) != null) {
            bl2 = false;
            object.setBackgroundResource(0);
        }
    }
}

