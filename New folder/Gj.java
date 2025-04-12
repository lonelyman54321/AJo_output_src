/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.facebook.login.widget.a;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class Gj
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Gj(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                a a2 = (a)this.b;
                Class<a> clazz = a.class;
                boolean bl2 = td0.b(clazz);
                if (!bl2) {
                    String string2 = "this$0";
                    try {
                        Intrinsics.checkNotNullParameter(a2, string2);
                        a2.a();
                    }
                    catch (Throwable throwable) {
                        td0.a(clazz, throwable);
                    }
                }
                return;
            }
            case 2: {
                Object object = (jz1_2)this.b;
                String string3 = "this$0";
                Intrinsics.checkNotNullParameter(object, string3);
                object = ((jz1_2)object).f;
                if (object != null && (object = ((CustomToolbarViewMerger)object).getToolbar()) != null) {
                    ai0_2.a((View)object);
                }
                return;
            }
            case 1: {
                op_2 op_22 = (op_2)this.b;
                Intrinsics.checkNotNullParameter(op_22, "this$0");
                ArrayList arrayList = op_22.l;
                op_22.w(arrayList);
                return;
            }
            case 0: 
        }
        ((Function0)this.b).invoke();
    }
}

