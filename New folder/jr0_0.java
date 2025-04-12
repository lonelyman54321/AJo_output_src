/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Jr0
 */
public final class jr0_0
extends Lambda
implements Function0 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xs2_1 d;
    public final /* synthetic */ String e;

    public jr0_0(boolean bl2, xs2_1 xs2_12, String string2) {
        this.c = bl2;
        this.d = xs2_12;
        this.e = string2;
        super(0);
    }

    public final Object invoke() {
        boolean bl2 = this.c;
        if (bl2) {
            Object object = this.d;
            object.getClass();
            String string2 = this.e;
            String string3 = "key";
            Intrinsics.checkNotNullParameter(string2, string3);
            object = ((xs2_1)object).a;
            ((CR2)object).d(string2);
        }
        return Unit.a;
    }
}

