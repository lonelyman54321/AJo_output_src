/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.core.DuiInterface;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vw0
 */
public final class vw0_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vw0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = pj0_2.Companion;
                object = (pj0_2)object;
                Intrinsics.checkNotNullParameter(object, "this$0");
                object2 = cp_1.Companion;
                n3 = (int)(km_1.b((cp$a)object2) ? 1 : 0);
                if (n3 != 0) {
                    long l2;
                    ((pj0_2)object).O = l2 = ((pj0_2)object).O + 1L;
                    object2 = ((pj0_2)object).P;
                    vw0_2 vw0_22 = ((pj0_2)object).Q;
                    object2.postDelayed((Runnable)vw0_22, 1000L);
                    l2 = ((pj0_2)object).O;
                    long l3 = 3;
                    long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (l4 >= 0 && (n3 = (int)(((pj0_2)object).R ? 1 : 0)) == 0) {
                        ((pj0_2)object).R = true;
                        object2 = null;
                        ((pj0_2)object).b = false;
                        n3 = (int)(((pj0_2)object).S ? 1 : 0);
                        if (n3 == 0) {
                            ((pj0_2)object).Sa();
                        }
                    }
                }
                return;
            }
            case 0: 
        }
        DuiInterface.e((DuiInterface)object);
    }
}

