/*
 * Decompiled with CFR 0.152.
 */
public final class Dr$a {
    public boolean a;
    public boolean b;
    public boolean c;

    public final Dr a() {
        boolean bl2 = this.a;
        if (!bl2 && ((bl2 = this.b) || (bl2 = this.c))) {
            IllegalStateException illegalStateException = new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
            throw illegalStateException;
        }
        Dr dr2 = new Dr(this);
        return dr2;
    }
}

