/*
 * Decompiled with CFR 0.152.
 */
import androidx.room.c;
import androidx.room.e;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase;

public final class SF2
implements OF2 {
    public final FP2 a;
    public final QF2 b;
    public final RF2 c;

    public SF2(ChuckerDatabase chuckerDatabase) {
        n23 n232;
        this.a = chuckerDatabase;
        super(chuckerDatabase);
        super(chuckerDatabase);
        this.b = n232;
        super(chuckerDatabase);
        this.c = n232;
    }

    public final e a(long l2) {
        int n3 = 1;
        HP2 hP2 = HP2.c(n3, "SELECT * FROM throwables WHERE id = ?");
        hP2.m0(n3, l2);
        c c2 = this.a.getInvalidationTracker();
        String[] stringArray = new String[]{"throwables"};
        UF2 uF2 = new UF2(this, hP2);
        return c2.b(stringArray, uF2);
    }

    public final Object b(long l2, f80_0 f80_02) {
        SF2$b sF2$b = new SF2$b(this, l2);
        return Q90.a((ChuckerDatabase)this.a, sF2$b, f80_02);
    }

    public final Object c(f80_0 f80_02) {
        SF2$a sF2$a = new SF2$a(this);
        return Q90.a((ChuckerDatabase)this.a, sF2$a, f80_02);
    }

    public final e d() {
        HP2 hP2 = HP2.c(0, "SELECT id,tag,date,clazz,message FROM throwables ORDER BY date DESC");
        c c2 = this.a.getInvalidationTracker();
        String[] stringArray = new String[]{"throwables"};
        TF2 tF2 = new TF2(this, hP2);
        return c2.b(stringArray, tF2);
    }
}

