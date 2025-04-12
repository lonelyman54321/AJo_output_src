/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from LW1
 */
public final class lw1_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lw1_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                return ((bg2$d_0)((bg2_2)this.b)).e();
            }
            case 0: 
        }
        ex1_0 ex1_02 = (ex1_0)this.b;
        Intrinsics.checkNotNullParameter(ex1_02, "this$0");
        return ex1_02.requireActivity().getApplication();
    }
}

