/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.skydoves.balloon.Balloon;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Pu
 */
public final class pu_2
implements View.OnClickListener {
    public final /* synthetic */ Balloon a;

    public /* synthetic */ pu_2(Balloon balloon2) {
        this.a = balloon2;
    }

    public final void onClick(View object) {
        Balloon balloon2 = this.a;
        Intrinsics.checkNotNullParameter(balloon2, "this$0");
        object = balloon2.b;
        boolean bl2 = object.J;
        if (bl2) {
            balloon2.h();
        }
    }
}

