/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ob3
 */
public final class ob3_1
implements EL1 {
    public final VV a;
    public boolean b;
    public long c;
    public long d;
    public ot2_0 e;

    public ob3_1(VV object) {
        this.a = object;
        this.e = object = ot2_0.d;
    }

    public final void a(long l2) {
        this.c = l2;
        boolean bl2 = this.b;
        if (bl2) {
            VV vV = this.a;
            this.d = l2 = vV.elapsedRealtime();
        }
    }

    public final /* synthetic */ boolean f() {
        return false;
    }

    public final ot2_0 getPlaybackParameters() {
        return this.e;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final long q() {
        long l2 = this.c;
        boolean bl2 = this.b;
        if (!bl2) return l2;
        VV vV = this.a;
        long l3 = vV.elapsedRealtime();
        long l4 = this.d;
        l3 -= l4;
        ot2_0 ot2_02 = this.e;
        float f5 = ot2_02.a;
        float f6 = 1.0f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object == false) {
            l3 = gz3.I(l3);
            return l2 += l3;
        } else {
            int n3 = ot2_02.c;
            l4 = n3;
            l3 *= l4;
        }
        return l2 += l3;
    }

    public final void setPlaybackParameters(ot2_0 ot2_02) {
        boolean bl2 = this.b;
        if (bl2) {
            long l2 = this.q();
            this.a(l2);
        }
        this.e = ot2_02;
    }
}

