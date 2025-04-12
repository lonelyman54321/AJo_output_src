/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TQ2
 */
public final class tq2_1
implements View.OnClickListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ RQ2$c b;

    public /* synthetic */ tq2_1(String string2, RQ2$c c2) {
        this.a = string2;
        this.b = c2;
    }

    public final void onClick(View object) {
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        String string2 = this.a;
        if (string2 != null) {
            object = ((RQ2$c)object).b;
            object.i8(string2);
        }
    }
}

