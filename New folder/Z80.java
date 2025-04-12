/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class Z80
extends Lambda
implements Function0 {
    public final /* synthetic */ pg2_0 c;

    public Z80(pg2_0 pg2_02) {
        this.c = pg2_02;
        super(0);
    }

    public final Object invoke() {
        pg2_0 pg2_02 = this.c;
        Pk3 pk3 = new Pk3(pg2_02);
        return pk3;
    }
}

