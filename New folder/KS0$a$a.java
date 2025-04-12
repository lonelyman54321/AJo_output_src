/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Ref$ObjectRef;

public final class KS0$a$a
extends h80_0 {
    public KS0$a a;
    public Ref$ObjectRef b;
    public /* synthetic */ Object c;
    public final /* synthetic */ KS0$a d;
    public int e;

    public KS0$a$a(KS0$a kS0$a, f80_0 f80_02) {
        this.d = kS0$a;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.c = object;
        this.e = n3 = this.e | -1 << -1;
        return this.d.emit(null, this);
    }
}

