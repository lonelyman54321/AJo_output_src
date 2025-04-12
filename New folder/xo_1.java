/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XO
 */
public final class xo_1
implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ yo_1 b;

    public /* synthetic */ xo_1(boolean bl2, yo_1 yo_12) {
        this.a = bl2;
        this.b = yo_12;
    }

    public final Object invoke() {
        Object object = this.b;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = this.a;
        if (bl2) {
            object = ((yo_1)object).c;
            string2 = "know why";
            object.k4(string2);
        } else {
            object = ((yo_1)object).c;
            string2 = "knowMore";
            object.i9(string2);
        }
        return Unit.a;
    }
}

