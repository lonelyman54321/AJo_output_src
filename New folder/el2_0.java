/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from el2
 */
public final class el2_0
extends Lambda
implements Function0 {
    public final /* synthetic */ Cl2 c;
    public final /* synthetic */ i90_0 d;

    public el2_0(hm0_0 hm0_02, c80 c802) {
        this.c = hm0_02;
        this.d = c802;
        super(0);
    }

    public final Object invoke() {
        boolean bl2;
        hm0_0 hm0_02 = (hm0_0)this.c;
        c80 c802 = (c80)this.d;
        boolean bl3 = hm0_02.c();
        if (bl3) {
            hl2_0 hl2_02 = new hl2_0(hm0_02, null);
            Ae3.d(c802, null, null, hl2_02, 3);
            bl2 = true;
        } else {
            bl2 = false;
            hm0_02 = null;
        }
        return bl2;
    }
}

