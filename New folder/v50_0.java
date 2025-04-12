/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;

/*
 * Renamed from v50
 */
public final class v50_0 {
    public HashSet a = null;
    public int b;
    public boolean c;
    public final Y50 d;
    public final v50$a e;
    public v50_0 f;
    public int g = 0;
    public int h = -1 << -1;
    public k93_0 i;

    public v50_0(Y50 y50, v50$a v50$a) {
        this.d = y50;
        this.e = v50$a;
    }

    public final void a(v50_0 v50_02, int n3) {
        this.b(v50_02, n3, -1 << -1, false);
    }

    public final boolean b(v50_0 object, int n3, int n4, boolean bl2) {
        boolean bl3 = true;
        if (object == null) {
            this.j();
            return bl3;
        }
        if (!bl2 && !(bl2 = this.i((v50_0)object))) {
            return false;
        }
        this.f = object;
        HashSet hashSet = ((v50_0)object).a;
        if (hashSet == null) {
            ((v50_0)object).a = hashSet = new HashSet();
        }
        if ((object = this.f.a) != null) {
            ((HashSet)object).add(this);
        }
        this.g = n3;
        this.h = n4;
        return bl3;
    }

    public final void c(int n3, VF3 vF3, ArrayList arrayList) {
        Object object = this.a;
        if (object != null) {
            boolean bl2;
            object = ((HashSet)object).iterator();
            while (bl2 = object.hasNext()) {
                Y50 y50 = ((v50_0)object.next()).d;
                S11.a(y50, n3, arrayList, vF3);
            }
        }
    }

    public final int d() {
        boolean bl2 = this.c;
        if (!bl2) {
            return 0;
        }
        return this.b;
    }

    public final int e() {
        Object object;
        Y50 y50 = this.d;
        int n3 = y50.k0;
        int n4 = 8;
        if (n3 == n4) {
            return 0;
        }
        n3 = this.h;
        int n7 = -1 << -1;
        if (n3 != n7 && (object = this.f) != null) {
            object = ((v50_0)object).d;
            n7 = ((Y50)object).k0;
            if (n7 == n4) {
                return n3;
            }
        }
        return this.g;
    }

    public final v50_0 f() {
        Object object = this.e;
        int n3 = object.ordinal();
        Y50 y50 = this.d;
        switch (n3) {
            default: {
                object = object.name();
                AssertionError assertionError = new AssertionError(object);
                throw assertionError;
            }
            case 4: {
                return y50.M;
            }
            case 3: {
                return y50.L;
            }
            case 2: {
                return y50.O;
            }
            case 1: {
                return y50.N;
            }
            case 0: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
        }
        return null;
    }

    public final boolean g() {
        boolean bl2;
        Object object = this.a;
        if (object == null) {
            return false;
        }
        object = ((HashSet)object).iterator();
        while (bl2 = object.hasNext()) {
            v50_0 v50_02 = ((v50_0)object.next()).f();
            bl2 = v50_02.h();
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public final boolean h() {
        boolean bl2;
        v50_0 v50_02 = this.f;
        if (v50_02 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            v50_02 = null;
        }
        return bl2;
    }

    public final boolean i(v50_0 object) {
        Y50 y50;
        boolean bl2;
        v50$a v50$a;
        String string2;
        boolean bl3;
        block21: {
            block22: {
                block23: {
                    bl3 = false;
                    string2 = null;
                    if (object == null) {
                        return false;
                    }
                    v50$a = this.e;
                    bl2 = true;
                    y50 = object.d;
                    object = object.e;
                    if (object != v50$a) break block21;
                    object = v50$a.BASELINE;
                    if (v50$a != object) break block22;
                    boolean bl4 = y50.G;
                    if (!bl4) break block23;
                    object = this.d;
                    bl4 = ((Y50)object).G;
                    if (bl4) break block22;
                }
                return false;
            }
            return bl2;
        }
        int n3 = v50$a.ordinal();
        switch (n3) {
            default: {
                string2 = v50$a.name();
                object = new AssertionError((Object)string2);
                throw object;
            }
            case 6: {
                v50$a = v50$a.BASELINE;
                if (object != v50$a && object != (v50$a = v50$a.CENTER_X) && object != (v50$a = v50$a.CENTER_Y)) {
                    bl3 = true;
                }
                return bl3;
            }
            case 5: {
                v50$a = v50$a.LEFT;
                if (object != v50$a && object != (v50$a = v50$a.RIGHT)) {
                    return bl2;
                }
                return false;
            }
            case 2: 
            case 4: {
                boolean bl5;
                v50$a = v50$a.TOP;
                if (object != v50$a && object != (v50$a = v50$a.BOTTOM)) {
                    bl5 = false;
                    v50$a = null;
                } else {
                    bl5 = true;
                }
                boolean bl6 = y50 instanceof w11_0;
                if (bl6) {
                    if (bl5 || object == (v50$a = v50$a.CENTER_Y)) {
                        bl3 = true;
                    }
                    bl5 = bl3;
                }
                return bl5;
            }
            case 1: 
            case 3: {
                boolean bl7;
                v50$a = v50$a.LEFT;
                if (object != v50$a && object != (v50$a = v50$a.RIGHT)) {
                    bl7 = false;
                    v50$a = null;
                } else {
                    bl7 = true;
                }
                boolean bl8 = y50 instanceof w11_0;
                if (bl8) {
                    if (bl7 || object == (v50$a = v50$a.CENTER_X)) {
                        bl3 = true;
                    }
                    bl7 = bl3;
                }
                return bl7;
            }
            case 0: 
            case 7: 
            case 8: 
        }
        return false;
    }

    public final void j() {
        Object object = this.f;
        if (object != null && (object = ((v50_0)object).a) != null) {
            ((HashSet)object).remove(this);
            object = this.f.a;
            int n3 = ((HashSet)object).size();
            if (n3 == 0) {
                object = this.f;
                ((v50_0)object).a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = -1 << -1;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        k93_0 k93_02 = this.i;
        if (k93_02 == null) {
            k93$a k93$a = k93$a.UNRESTRICTED;
            this.i = k93_02 = new k93_0(k93$a);
        } else {
            k93_02.c();
        }
    }

    public final void l(int n3) {
        this.b = n3;
        this.c = true;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.d.m0;
        stringBuilder.append(string2);
        stringBuilder.append(":");
        string2 = ((Object)((Object)this.e)).toString();
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

