/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Ew0
 */
public final class ew0_0
extends pS0 {
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function1 c;

    public ew0_0(Function0 function0, Function1 function1) {
        this.b = function0;
        this.c = function1;
    }

    public final float a() {
        return ((Number)this.b.invoke()).floatValue();
    }

    public final void b(float f5) {
        Float f6 = Float.valueOf(f5);
        this.c.invoke(f6);
    }
}

