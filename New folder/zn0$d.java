/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  android.util.SparseBooleanArray
 */
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import java.util.Objects;

public final class zn0$d
extends Fp3 {
    public static final /* synthetic */ int U;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final SparseArray S;
    public final SparseBooleanArray T;

    static {
        zn0$d$a zn0$d$a = new zn0$d$a();
        zn0$d$a.k();
        gz3.D(1000);
        gz3.D(1001);
        gz3.D(1002);
        gz3.D(1003);
        gz3.D(1004);
        f4.b(1005, 1006, 1007, 1008, 1009);
        f4.b(1010, 1011, 1012, 1013, 1014);
        gz3.D(1015);
        gz3.D(1016);
        gz3.D(1017);
        gz3.D(1018);
    }

    public zn0$d(zn0$d$a zn0$d$a) {
        super(zn0$d$a);
        SparseArray sparseArray;
        boolean bl2;
        this.D = bl2 = zn0$d$a.C;
        this.E = bl2 = zn0$d$a.D;
        this.F = bl2 = zn0$d$a.E;
        this.G = bl2 = zn0$d$a.F;
        this.H = bl2 = zn0$d$a.G;
        this.I = bl2 = zn0$d$a.H;
        this.J = bl2 = zn0$d$a.I;
        this.K = bl2 = zn0$d$a.J;
        this.L = bl2 = zn0$d$a.K;
        this.M = bl2 = zn0$d$a.L;
        this.N = bl2 = zn0$d$a.M;
        this.O = bl2 = zn0$d$a.N;
        this.P = bl2 = zn0$d$a.O;
        this.Q = bl2 = zn0$d$a.P;
        this.R = bl2 = zn0$d$a.Q;
        this.S = sparseArray = zn0$d$a.R;
        zn0$d$a = zn0$d$a.S;
        this.T = zn0$d$a;
    }

    public final Fp3$b a() {
        zn0$d$a zn0$d$a = new zn0$d$a(this);
        return zn0$d$a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        int n3 = 1;
        if (this == object) {
            return n3 != 0;
        }
        if (object == null) return false;
        Class<zn0$d> clazz = zn0$d.class;
        SparseBooleanArray sparseBooleanArray = object.getClass();
        if (clazz != sparseBooleanArray) return false;
        boolean bl2 = super.equals(object = (zn0$d)object);
        if (!bl2) return 0 != 0;
        bl2 = this.D;
        int n4 = ((zn0$d)object).D;
        if (bl2 != n4) return 0 != 0;
        bl2 = this.E;
        n4 = ((zn0$d)object).E;
        if (bl2 != n4) return 0 != 0;
        bl2 = this.F;
        n4 = ((zn0$d)object).F;
        if (bl2 != n4) return 0 != 0;
        bl2 = this.G;
        n4 = ((zn0$d)object).G;
        if (bl2 != n4) return 0 != 0;
        bl2 = this.H;
        n4 = ((zn0$d)object).H;
        if (bl2 != n4) return 0 != 0;
        bl2 = this.I;
        n4 = ((zn0$d)object).I;
        if (bl2 != n4) return 0 != 0;
        bl2 = this.J;
        n4 = ((zn0$d)object).J;
        if (bl2 != n4) return 0 != 0;
        bl2 = this.K;
        n4 = ((zn0$d)object).K;
        if (bl2 != n4) return 0 != 0;
        bl2 = this.L;
        n4 = ((zn0$d)object).L;
        if (bl2 != n4) return 0 != 0;
        bl2 = this.M;
        n4 = ((zn0$d)object).M;
        if (bl2 != n4) return 0 != 0;
        bl2 = this.N;
        n4 = ((zn0$d)object).N;
        if (bl2 != n4) return 0 != 0;
        bl2 = this.O;
        n4 = ((zn0$d)object).O;
        if (bl2 != n4) return 0 != 0;
        bl2 = this.P;
        n4 = ((zn0$d)object).P;
        if (bl2 != n4) return 0 != 0;
        bl2 = this.Q;
        n4 = ((zn0$d)object).Q;
        if (bl2 != n4) return 0 != 0;
        bl2 = this.R;
        n4 = ((zn0$d)object).R;
        if (bl2 != n4) return 0 != 0;
        sparseBooleanArray = this.T;
        n4 = sparseBooleanArray.size();
        SparseBooleanArray sparseBooleanArray2 = ((zn0$d)object).T;
        int n7 = sparseBooleanArray2.size();
        if (n7 != n4) return 0 != 0;
        Map map2 = null;
        for (n7 = 0; n7 < n4; n7 += n3) {
            int n8 = sparseBooleanArray.keyAt(n7);
            if ((n8 = sparseBooleanArray2.indexOfKey(n8)) < 0) return 0 != 0;
        }
        sparseBooleanArray = this.S;
        n4 = sparseBooleanArray.size();
        object = ((zn0$d)object).S;
        int n10 = object.size();
        if (n10 != n4) return 0 != 0;
        n10 = 0;
        sparseBooleanArray2 = null;
        while (n10 < n4) {
            n7 = sparseBooleanArray.keyAt(n10);
            if ((n7 = object.indexOfKey(n7)) < 0) return 0 != 0;
            Object object2 = (Map)sparseBooleanArray.valueAt(n10);
            map2 = (Map)object.valueAt(n7);
            int n14 = object2.size();
            int n15 = map2.size();
            if (n15 != n14) return 0 != 0;
            object2 = object2.entrySet().iterator();
            while ((n14 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                Map.Entry entry = (Map.Entry)object2.next();
                sp3 sp32 = (sp3)entry.getKey();
                int n16 = map2.containsKey(sp32);
                if (n16 == 0) return 0 != 0;
                Object v4 = entry.getValue();
                Object v5 = map2.get(sp32);
                n16 = gz3.a;
                n14 = (int)(Objects.equals(v4, v5) ? 1 : 0);
                if (n14 != 0) continue;
                return 0 != 0;
            }
            n10 += n3;
        }
        return n3 != 0;
    }

    public final int hashCode() {
        int n3 = (super.hashCode() + 31) * 31;
        int n4 = this.D;
        n3 = (n3 + n4) * 31;
        int n7 = this.E;
        n3 = (n3 + n7) * 31;
        int n8 = this.F;
        n3 = (n3 + n8) * 31;
        int n10 = this.G;
        n3 = (n3 + n10) * 31;
        int n14 = this.H;
        n3 = (n3 + n14) * 31;
        int n15 = this.I;
        n3 = (n3 + n15) * 31;
        int n16 = this.J;
        n3 = (n3 + n16) * 31;
        int n17 = this.K;
        n3 = (n3 + n17) * 31;
        int n18 = this.L;
        n3 = (n3 + n18) * 31;
        int n19 = this.M;
        n3 = (n3 + n19) * 31;
        int n20 = this.N;
        n3 = (n3 + n20) * 31;
        int n21 = this.O;
        n3 = (n3 + n21) * 31;
        int n22 = this.P;
        n3 = (n3 + n22) * 31;
        int n24 = this.Q;
        n3 = (n3 + n24) * 31;
        int n25 = this.R;
        return n3 + n25;
    }
}

