/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class g90
extends Lambda
implements Function0 {
    public final /* synthetic */ Vt1 c;
    public final /* synthetic */ ou0_0 d;
    public final /* synthetic */ boolean e;

    public g90(Vt1 vt1, ou0_0 ou0_02, boolean bl2) {
        this.c = vt1;
        this.d = ou0_02;
        this.e = bl2;
        super(0);
    }

    public final Object invoke() {
        b93 b932;
        boolean bl2 = this.e ^ true;
        Vt1 vt1 = this.c;
        boolean bl3 = vt1.b();
        if (!bl3) {
            ou0_0 ou0_02 = this.d;
            ou0_02.b();
        } else if (bl2 && (b932 = vt1.c) != null) {
            b932.show();
        }
        return Boolean.TRUE;
    }
}

