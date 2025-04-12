/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.List;

/*
 * Renamed from hR
 */
public final class hr_1
implements lf3_0 {
    public final List a;

    public hr_1(List list) {
        this.a = list;
    }

    public final int a(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        int n3 = object < 0 ? 0 : -1;
        return n3;
    }

    public final List b(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        List list = object >= 0 ? this.a : Collections.emptyList();
        return list;
    }

    public final long c(int n3) {
        n3 = n3 == 0 ? 1 : 0;
        ct3.a(n3 != 0);
        return 0L;
    }

    public final int d() {
        return 1;
    }
}

