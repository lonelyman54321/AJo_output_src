/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Qp1
 */
public final class qp1_0 {
    public static int a(rp1_1 rp1_12, Rj1 rj1, Qj1 qj1, int n3) {
        Object object = g42.Max;
        Enum enum_ = h42_0.Height;
        e42_0 e42_02 = new e42_0(qj1, (g42)((Object)object), (h42_0)enum_);
        long l2 = f60.b(n3, 0, 13);
        enum_ = rj1.getLayoutDirection();
        object = new dk1(rj1, (bp1_0)enum_);
        return rp1_12.measure-3p2s80s((dl1_1)object, e42_02, l2).getHeight();
    }

    public static int b(rp1_1 rp1_12, Rj1 rj1, Qj1 qj1, int n3) {
        Object object = g42.Max;
        Enum enum_ = h42_0.Width;
        e42_0 e42_02 = new e42_0(qj1, (g42)((Object)object), (h42_0)enum_);
        long l2 = f60.b(0, n3, 7);
        enum_ = rj1.getLayoutDirection();
        object = new dk1(rj1, (bp1_0)enum_);
        return rp1_12.measure-3p2s80s((dl1_1)object, e42_02, l2).getWidth();
    }

    public static int c(rp1_1 rp1_12, Rj1 rj1, Qj1 qj1, int n3) {
        Object object = g42.Min;
        Enum enum_ = h42_0.Height;
        e42_0 e42_02 = new e42_0(qj1, (g42)((Object)object), (h42_0)enum_);
        long l2 = f60.b(n3, 0, 13);
        enum_ = rj1.getLayoutDirection();
        object = new dk1(rj1, (bp1_0)enum_);
        return rp1_12.measure-3p2s80s((dl1_1)object, e42_02, l2).getHeight();
    }

    public static int d(rp1_1 rp1_12, Rj1 rj1, Qj1 qj1, int n3) {
        Object object = g42.Min;
        Enum enum_ = h42_0.Width;
        e42_0 e42_02 = new e42_0(qj1, (g42)((Object)object), (h42_0)enum_);
        long l2 = f60.b(0, n3, 7);
        enum_ = rj1.getLayoutDirection();
        object = new dk1(rj1, (bp1_0)enum_);
        return rp1_12.measure-3p2s80s((dl1_1)object, e42_02, l2).getWidth();
    }
}

