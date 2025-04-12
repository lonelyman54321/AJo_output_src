/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from eU0
 */
public final class eu0_1
extends Lambda
implements Function1 {
    public static final eu0_1 d;
    public static final eu0_1 e;
    public final /* synthetic */ int c;

    static {
        eu0_1 eu0_12;
        d = eu0_12 = new eu0_1(1, 0);
        e = eu0_12 = new eu0_1(1, 1);
    }

    public /* synthetic */ eu0_1(int n3, int n4) {
        this.c = n4;
        super(n3);
    }

    public final Object invoke(Object object) {
        int n3 = this.c;
        switch (n3) {
            default: {
                object = (o)object;
                Intrinsics.checkNotNullParameter(object, "$this$navOptions");
                ((o)object).b = true;
                return Unit.a;
            }
            case 0: 
        }
        ((gU0)object).a(false);
        return Unit.a;
    }
}

