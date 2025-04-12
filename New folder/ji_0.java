/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Ji
 */
public final class ji_0
extends Lambda
implements Function1 {
    public static final ji_0 d;
    public static final ji_0 e;
    public final /* synthetic */ int c;

    static {
        ji_0 ji_02;
        d = ji_02 = new ji_0(1, 0);
        e = ji_02 = new ji_0(1, 1);
    }

    public /* synthetic */ ji_0(int n3, int n4) {
        this.c = n4;
        super(n3);
    }

    public final Object invoke(Object object) {
        int n3 = this.c;
        switch (n3) {
            default: {
                Intrinsics.checkNotNullParameter((Pair)object, "it");
                return Unit.a;
            }
            case 0: 
        }
        object = (UY2)object;
        Object object2 = RY2.a;
        object2 = MY2.r;
        Unit unit = Unit.a;
        object.a((TY2)object2, unit);
        return unit;
    }
}

