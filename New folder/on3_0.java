/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from on3
 */
public final class on3_0
extends jD3 {
    public final kn1_0 a;

    public on3_0(long l2) {
        VF2 vF2 = bf0_0.b;
        if (vF2 != null) {
            kn1_0 kn1_02;
            this.a = kn1_02 = ft0.b(vF2.a.a().a(l2), null, 3);
            return;
        }
        String string2 = "You can't access the throwable repository if you don't initialize it!".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }
}

