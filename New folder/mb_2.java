/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mb
 */
public final class mb_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mb_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object = (or2_0)this.b;
                String string2 = "this$0";
                Intrinsics.checkNotNullParameter(object, string2);
                object = ((or2_0)object).f;
                if (object != null) {
                    ai0_2.a((View)object);
                }
                return;
            }
            case 0: 
        }
        ob_2 ob_22 = (ob_2)this.b;
        Intrinsics.checkNotNullParameter(ob_22, "this$0");
        ob_22.o();
    }
}

