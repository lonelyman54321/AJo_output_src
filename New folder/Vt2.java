/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.ui.PlayerControlView;
import kotlin.jvm.internal.Intrinsics;

public final class Vt2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Vt2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = ld3_1.Companion;
                object = (ld3_1)object;
                Intrinsics.checkNotNullParameter(object, "this$0");
                object2 = cp_1.Companion;
                n3 = (int)(km_1.b((cp$a)object2) ? 1 : 0);
                if (n3 != 0) {
                    long l2;
                    ((ld3_1)object).L = l2 = ((ld3_1)object).L + 1L;
                    object2 = ((ld3_1)object).O;
                    Vt2 vt2 = ((ld3_1)object).P;
                    object2.postDelayed((Runnable)vt2, 1000L);
                    l2 = ((ld3_1)object).L;
                    long l3 = 3;
                    long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (l4 >= 0 && (n3 = (int)(((ld3_1)object).Q ? 1 : 0)) == 0) {
                        ((ld3_1)object).Q = true;
                        n3 = 0;
                        object2 = null;
                        ((ld3_1)object).b = false;
                        ((ld3_1)object).Ua();
                    }
                }
                return;
            }
            case 0: 
        }
        float[] fArray = PlayerControlView.Q0;
        ((PlayerControlView)((Object)object)).o();
    }
}

