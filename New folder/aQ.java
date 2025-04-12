/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class aQ
implements View.OnClickListener {
    public final /* synthetic */ bQ a;
    public final /* synthetic */ String b;

    public /* synthetic */ aQ(bQ bQ2, String string2) {
        this.a = bQ2;
        this.b = string2;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$title");
        object.a.J9(string2);
    }
}

