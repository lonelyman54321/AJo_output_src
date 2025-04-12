/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from OW
 */
public final class ow_1
implements Function1 {
    public final /* synthetic */ StringBuilder a;

    public /* synthetic */ ow_1(StringBuilder stringBuilder) {
        this.a = stringBuilder;
    }

    public final Object invoke(Object object) {
        object = pw_1.g((Byte)object);
        this.a.append((String)object);
        return Unit.a;
    }
}

