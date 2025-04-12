/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class go0 {
    public static final void a(WR1 wR1, LP1$c objectArray) {
        objectArray = go0.f((fo0)objectArray).D();
        int n3 = objectArray.c;
        if (n3 > 0) {
            n3 += -1;
            objectArray = objectArray.a;
            do {
                LP1$c lP1$c = ((xp1_0)objectArray[n3]).y.e;
                wR1.b(lP1$c);
            } while ((n3 += -1) >= 0);
        }
    }

    public static final LP1$c b(WR1 object) {
        int n3;
        if (object != null && (n3 = ((WR1)object).k()) == 0) {
            n3 = ((WR1)object).c + -1;
            object = (LP1$c)((WR1)object).n(n3);
        } else {
            object = null;
        }
        return object;
    }

    public static final rp1_1 c(LP1$c lP1$c) {
        int n3 = lP1$c.c & 2;
        if (n3 != 0) {
            n3 = lP1$c instanceof rp1_1;
            if (n3 != 0) {
                return (rp1_1)((Object)lP1$c);
            }
            n3 = lP1$c instanceof mo0_0;
            if (n3 != 0) {
                lP1$c = ((mo0_0)lP1$c).o;
                while (lP1$c != null) {
                    n3 = lP1$c instanceof rp1_1;
                    if (n3 != 0) {
                        return (rp1_1)((Object)lP1$c);
                    }
                    n3 = lP1$c instanceof mo0_0;
                    if (n3 != 0 && (n3 = lP1$c.c & 2) != 0) {
                        lP1$c = ((mo0_0)lP1$c).o;
                        continue;
                    }
                    lP1$c = lP1$c.f;
                }
            }
        }
        return null;
    }

    public static final w32_0 d(fo0 fo02, int n3) {
        boolean bl2;
        w32_0 w32_02 = fo02.e().h;
        Intrinsics.checkNotNull(w32_02);
        LP1$c lP1$c = w32_02.j1();
        if (lP1$c == fo02 && (bl2 = c42_0.h(n3))) {
            w32_02 = w32_02.p;
            Intrinsics.checkNotNull(w32_02);
        }
        return w32_02;
    }

    public static final w32_0 e(fo0 object) {
        LP1$c lP1$c = object.e();
        boolean bl2 = lP1$c.m;
        if (bl2) {
            object = go0.d((fo0)object, 2);
            object.getClass();
            lP1$c = ((w32_0)object).j1();
            bl2 = lP1$c.m;
            if (bl2) {
                return object;
            }
            bh1_1.c("LayoutCoordinates is not attached.");
            throw null;
        }
        bh1_1.c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        throw null;
    }

    public static final xp1_0 f(fo0 object) {
        object = object.e().h;
        if (object != null) {
            return ((w32_0)object).m;
        }
        bh1_1.d("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw null;
    }

    public static final sg2_0 g(fo0 object) {
        object = go0.f((fo0)object).i;
        if (object != null) {
            return object;
        }
        bh1_1.d("This node does not have an owner.");
        throw null;
    }
}

