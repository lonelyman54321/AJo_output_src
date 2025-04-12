/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from lK
 */
public final class lk_1
implements gU0 {
    public static final lk_1 a;
    public static Boolean b;

    static {
        lk_1 lk_12;
        a = lk_12 = new Object();
    }

    public final void a(boolean bl2) {
        b = bl2;
    }

    public final /* synthetic */ void b(QT0$b qT0$b) {
    }

    public final boolean c() {
        Boolean bl2 = b;
        if (bl2 != null) {
            return bl2;
        }
        bh1_1.d("canFocus is read before it is written");
        throw null;
    }

    public final /* synthetic */ void d(QT0$a qT0$a) {
    }
}

