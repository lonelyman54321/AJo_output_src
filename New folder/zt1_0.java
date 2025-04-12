/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Zt1
 */
public final class zt1_0
extends Lambda
implements Function1 {
    public static final zt1_0 d;
    public static final zt1_0 e;
    public final /* synthetic */ int c;

    static {
        zt1_0 zt1_02;
        d = zt1_02 = new zt1_0(1, 0);
        e = zt1_02 = new zt1_0(1, 1);
    }

    public /* synthetic */ zt1_0(int n3, int n4) {
        this.c = n4;
        super(n3);
    }

    public final Object invoke(Object object) {
        int n3 = this.c;
        switch (n3) {
            default: {
                Intrinsics.checkNotNullParameter((Dw2)object, "$this$null");
                return Unit.a;
            }
            case 0: 
        }
        int cfr_ignored_0 = ((Qe1)object).a;
        return Unit.a;
    }
}

