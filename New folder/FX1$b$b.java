/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;

public final class FX1$b$b
extends h80_0 {
    public FX1$b a;
    public DataCallback b;
    public /* synthetic */ Object c;
    public final /* synthetic */ FX1$b d;
    public int e;

    public FX1$b$b(FX1$b fX1$b, f80_0 f80_02) {
        this.d = fX1$b;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.c = object;
        this.e = n3 = this.e | -1 << -1;
        return this.d.c(null, this);
    }
}

