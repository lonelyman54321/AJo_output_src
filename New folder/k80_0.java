/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from K80
 */
public final class k80_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Sk3 c;

    public k80_0(Sk3 sk3) {
        this.c = sk3;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        Sk3 sk3 = this.c;
        object = new J80(sk3);
        return object;
    }
}

