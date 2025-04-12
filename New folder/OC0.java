/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.appcompat.app.f;
import kotlin.jvm.internal.Intrinsics;

public final class OC0
implements View.OnClickListener {
    public final /* synthetic */ f a;

    public /* synthetic */ OC0(f f5) {
        this.a = f5;
    }

    public final void onClick(View view) {
        f f5 = this.a;
        Intrinsics.checkNotNullParameter(f5, "$dialog");
        f5.dismiss();
    }
}

