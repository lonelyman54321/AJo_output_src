/*
 * Decompiled with CFR 0.152.
 */
import androidx.appcompat.widget.Toolbar;
import androidx.media3.exoplayer.source.n;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fA
 */
public final class fa_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fa_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                ((Toolbar)this.b).invalidateMenu();
                return;
            }
            case 1: {
                ((n)this.b).w();
                return;
            }
            case 0: 
        }
        Object object = (ia_1)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        qz1_2 qz1_22 = ((ia_1)object).g;
        if (qz1_22 != null) {
            String string2 = ((jo_2)((ia_1)object).p.getValue()).f();
            object = ((ia_1)object).g;
            if (object != null && (object = ((qz1_2)object).d) != null) {
                object = (String)((h83_0)object).getValue();
            } else {
                n3 = 0;
                object = null;
            }
            qz1_22.A(string2, (String)object);
        }
    }
}

