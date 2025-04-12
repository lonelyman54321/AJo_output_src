/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Br0
 */
public final class br0_0
implements ti2_0 {
    public final Function1 a;
    public Cr0 b;

    public br0_0(Function1 function1) {
        this.a = function1;
    }

    public final void onAbandoned() {
    }

    public final void onForgotten() {
        Cr0 cr0 = this.b;
        if (cr0 != null) {
            cr0.dispose();
        }
        this.b = null;
    }

    public final void onRemembered() {
        Object object = ly0_0.a;
        this.b = object = (Cr0)this.a.invoke(object);
    }
}

