/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import androidx.media3.exoplayer.d$a;
import androidx.media3.exoplayer.n;

public final class d
implements EL1 {
    public final ob3_1 a;
    public final d$a b;
    public n c;
    public EL1 d;
    public boolean e;
    public boolean f;

    public d(d$a object, VV vV) {
        this.b = object;
        this.a = object = new ob3_1(vV);
        this.e = true;
    }

    public final boolean f() {
        boolean bl2 = this.e;
        if (bl2) {
            this.a.getClass();
            bl2 = false;
            Object var2_2 = null;
        } else {
            EL1 eL1 = this.d;
            eL1.getClass();
            bl2 = eL1.f();
        }
        return bl2;
    }

    public final ot2_0 getPlaybackParameters() {
        Object object = this.d;
        object = object != null ? object.getPlaybackParameters() : this.a.e;
        return object;
    }

    public final long q() {
        long l2;
        boolean bl2 = this.e;
        if (bl2) {
            ob3_1 ob3_12 = this.a;
            l2 = ob3_12.q();
        } else {
            EL1 eL1 = this.d;
            eL1.getClass();
            l2 = eL1.q();
        }
        return l2;
    }

    public final void setPlaybackParameters(ot2_0 ot2_02) {
        EL1 eL1 = this.d;
        if (eL1 != null) {
            eL1.setPlaybackParameters(ot2_02);
            ot2_02 = this.d.getPlaybackParameters();
        }
        this.a.setPlaybackParameters(ot2_02);
    }
}

