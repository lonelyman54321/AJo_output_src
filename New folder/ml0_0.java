/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from ml0
 */
public final class ml0_0
implements sV1$a {
    public final /* synthetic */ nl0_1 a;

    public /* synthetic */ ml0_0(nl0_1 nl0_12) {
        this.a = nl0_12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(int n3) {
        nl0_1 nl0_12 = this.a;
        synchronized (nl0_12) {
            Throwable throwable2;
            block10: {
                block7: {
                    long l2;
                    Object object;
                    long l3;
                    int n4;
                    int n7;
                    block9: {
                        block8: {
                            block6: {
                                try {
                                    n7 = nl0_12.m;
                                    if (n7 == 0 || (n4 = nl0_12.d) != 0) break block6;
                                }
                                catch (Throwable throwable2) {}
                                return;
                            }
                            if (n7 == n3) {
                                return;
                            }
                            nl0_12.m = n3;
                            n7 = 1;
                            if (n3 == n7) return;
                            if (n3 == 0) return;
                            n7 = 8;
                            if (n3 == n7) break block7;
                            nl0_12.k = l3 = nl0_12.h(n3);
                            object = nl0_12.c;
                            l2 = object.elapsedRealtime();
                            n3 = nl0_12.f;
                            if (n3 <= 0) break block8;
                            l3 = nl0_12.g;
                            l3 = l2 - l3;
                            n4 = n3 = (int)l3;
                            break block9;
                        }
                        n4 = 0;
                    }
                    long l4 = nl0_12.h;
                    long l7 = nl0_12.k;
                    Object object2 = nl0_12;
                    nl0_12.i(n4, l4, l7);
                    nl0_12.g = l2;
                    nl0_12.h = l3 = 0L;
                    nl0_12.j = l3;
                    nl0_12.i = l3;
                    object = nl0_12.e;
                    object2 = ((i73)object).b;
                    ((ArrayList)object2).clear();
                    ((i73)object).d = n7 = -1;
                    ((i73)object).e = 0;
                    ((i73)object).f = 0;
                    return;
                    break block10;
                }
                return;
            }
            throw throwable2;
        }
    }
}

