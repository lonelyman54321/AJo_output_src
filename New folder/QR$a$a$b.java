/*
 * Decompiled with CFR 0.152.
 */
import kotlinx.coroutines.i;

public final class QR$a$a$b
extends h80_0 {
    public QR$a$a a;
    public Object b;
    public i c;
    public /* synthetic */ Object d;
    public final /* synthetic */ QR$a$a e;
    public int f;

    public QR$a$a$b(QR$a$a qR$a$a, f80_0 f80_02) {
        this.e = qR$a$a;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.d = object;
        this.f = n3 = this.f | -1 << -1;
        return this.e.emit(null, this);
    }
}

