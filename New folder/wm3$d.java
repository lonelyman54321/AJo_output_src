/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class wm3$d
extends Lambda
implements Function1 {
    public final /* synthetic */ wm3 c;

    public wm3$d(wm3 wm32) {
        this.c = wm32;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Boolean)object;
        boolean bl2 = (Boolean)object;
        wm3 wm32 = this.c;
        wm3$a wm3$a = wm32.y;
        if (wm3$a == null) {
            object = Boolean.FALSE;
        } else {
            wm3$a.c = bl2;
            wm3.r1(wm32);
            object = Boolean.TRUE;
        }
        return object;
    }
}

