/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from rR
 */
public class rr_1
extends D41 {
    public float n0 = 0.5f;
    public final HashMap o0;
    public final HashMap p0;
    public final HashMap q0;
    public HashMap r0;
    public HashMap s0;
    public Fb3$a t0;

    public rr_1(Fb3 object, Fb3$d fb3$d) {
        super((Fb3)object, fb3$d);
        this.o0 = object = new Object();
        this.p0 = object = new Object();
        this.q0 = object = new Object();
        object = Fb3$a.SPREAD;
        this.t0 = object;
    }

    public final float t(String string2) {
        boolean bl2;
        HashMap hashMap = this.s0;
        if (hashMap != null && (bl2 = hashMap.containsKey(string2))) {
            return ((Float)this.s0.get(string2)).floatValue();
        }
        return 0.0f;
    }

    public final float u(String string2) {
        HashMap hashMap = this.q0;
        boolean bl2 = hashMap.containsKey(string2);
        if (bl2) {
            return ((Float)hashMap.get(string2)).floatValue();
        }
        return 0.0f;
    }

    public final float v(String string2) {
        boolean bl2;
        HashMap hashMap = this.r0;
        if (hashMap != null && (bl2 = hashMap.containsKey(string2))) {
            return ((Float)this.r0.get(string2)).floatValue();
        }
        return 0.0f;
    }

    public final float w(String string2) {
        HashMap hashMap = this.p0;
        boolean bl2 = hashMap.containsKey(string2);
        if (bl2) {
            return ((Float)hashMap.get(string2)).floatValue();
        }
        return 0.0f;
    }
}

