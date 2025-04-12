/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;

/*
 * Renamed from T0
 */
public final class t0_0
implements Function1 {
    public final /* synthetic */ w0_0 a;

    public /* synthetic */ t0_0(w0_0 w0_02) {
        this.a = w0_02;
    }

    public final Object invoke(Object object) {
        object = (JsonElement)object;
        Intrinsics.checkNotNullParameter(object, "node");
        w0_0 w0_02 = this.a;
        String string2 = (String)CollectionsKt.S(w0_02.a);
        w0_02.V(string2, (JsonElement)object);
        return Unit.a;
    }
}

