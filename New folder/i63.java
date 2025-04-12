/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileOutputStream;

public final class i63
extends h80_0 {
    public X53 a;
    public File b;
    public FileOutputStream c;
    public FileOutputStream d;
    public /* synthetic */ Object e;
    public final /* synthetic */ X53 f;
    public int g;

    public i63(X53 x53, f80_0 f80_02) {
        this.f = x53;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.e = object;
        this.g = n3 = this.g | -1 << -1;
        return this.f.j(this, null);
    }
}

