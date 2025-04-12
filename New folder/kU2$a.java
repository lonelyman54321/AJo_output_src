/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Ref$LongRef;

public final class kU2$a
extends h80_0 {
    public Ref$LongRef a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ku2_0 c;
    public int d;

    public kU2$a(ku2_0 ku2_02, f80_0 f80_02) {
        this.c = ku2_02;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.b = object;
        this.d = n3 = this.d | -1 << -1;
        return this.c.b(0L, this);
    }
}

