/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pA
 */
public final class pa_2
implements Function1 {
    public final /* synthetic */ kd1_1 a;

    public /* synthetic */ pa_2(kd1_1 kd1_12) {
        this.a = kd1_12;
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$imageDetails");
        yn3$a yn3$a = yn3_0.a;
        String string2 = ((kd1_1)object).a;
        string2 = kp1_0.c("error while reading image from disk for url : ", string2);
        Object[] objectArray = new Object[]{};
        yn3$a.a(string2, objectArray);
        aa_1.a.getClass();
        aa_1.c((kd1_1)object);
        return Unit.a;
    }
}

