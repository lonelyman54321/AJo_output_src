/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class Vg1$a
implements ib3_0 {
    public Object a;
    public Object b;
    public final Vs3 c;
    public final ParcelableSnapshotMutableState d;
    public Gl e;
    public ni3_0 f;
    public boolean g;
    public boolean h;
    public long i;
    public final /* synthetic */ vg1_0 j;

    public Vg1$a(vg1_0 object, Number number, Number number2, Ws3 ws3, Gl gl) {
        this.j = object;
        this.a = number;
        this.b = number2;
        this.c = ws3;
        this.d = object = J83.g(number);
        this.e = gl;
        Object object2 = this.a;
        Object object3 = this.b;
        this.f = object = new ni3_0(gl, ws3, object2, object3, null);
    }

    public final Object getValue() {
        return this.d.getValue();
    }
}

