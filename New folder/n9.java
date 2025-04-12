/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class n9
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n9(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        object = this.b;
        String string2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (s12)object;
                Intrinsics.checkNotNullParameter(object, string2);
                ((s12)object).Pa();
                return;
            }
            case 1: {
                object = (d71)object;
                Intrinsics.checkNotNullParameter(object, string2);
                object = ((d71)object).b;
                if (object != null) {
                    object.q9();
                }
                return;
            }
            case 0: 
        }
        object = (q9_0)object;
        Intrinsics.checkNotNullParameter(object, string2);
        ((q9_0)object).zb();
    }
}

