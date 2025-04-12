/*
 * Decompiled with CFR 0.152.
 */
import kotlinx.coroutines.i;

public final class Fe$a$b
extends h80_0 {
    public Fe$a a;
    public Object b;
    public i c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Fe$a e;
    public int f;

    public Fe$a$b(Fe$a fe$a, f80_0 f80_02) {
        this.e = fe$a;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.d = object;
        this.f = n3 = this.f | -1 << -1;
        return this.e.emit(null, this);
    }
}

