/*
 * Decompiled with CFR 0.152.
 */
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;

public final class Lb1$a
extends h80_0 {
    public HttpTransaction a;
    public /* synthetic */ Object b;
    public final /* synthetic */ lb1_0 c;
    public int d;

    public Lb1$a(lb1_0 lb1_02, f80_0 f80_02) {
        this.c = lb1_02;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.b = object;
        this.d = n3 = this.d | -1 << -1;
        return this.c.c(null, this);
    }
}

