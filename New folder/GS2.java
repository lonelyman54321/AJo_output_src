/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class GS2
implements BS2 {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ Function1 b;

    public GS2(Function2 function2, Function1 function1) {
        this.a = function2;
        this.b = function1;
    }

    public final Object a(ES2 eS2, Object object) {
        return this.a.invoke(eS2, object);
    }
}

