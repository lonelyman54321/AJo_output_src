/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class dl2
extends Lambda
implements Function0 {
    public final /* synthetic */ Cl2 c;
    public final /* synthetic */ i90_0 d;

    public dl2(hm0_0 hm0_02, c80 c802) {
        this.c = hm0_02;
        this.d = c802;
        super(0);
    }

    public final Object invoke() {
        boolean bl2;
        hm0_0 hm0_02 = (hm0_0)this.c;
        c80 c802 = (c80)this.d;
        boolean bl3 = hm0_02.d();
        if (bl3) {
            il2_0 il2_02 = new il2_0(hm0_02, null);
            Ae3.d(c802, null, null, il2_02, 3);
            bl2 = true;
        } else {
            bl2 = false;
            hm0_02 = null;
        }
        return bl2;
    }
}

