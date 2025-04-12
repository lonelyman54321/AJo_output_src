/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Np1
 */
public final class np1_0 {
    public static int a(op1_1 op1_12, Rj1 rj1, Qj1 qj1, int n3) {
        Object object = sl1_0.Max;
        Enum enum_ = tL1.Height;
        ql1_0 ql1_02 = new ql1_0(qj1, (sl1_0)((Object)object), (tL1)enum_);
        long l2 = f60.b(n3, 0, 13);
        enum_ = rj1.getLayoutDirection();
        object = new dk1(rj1, (bp1_0)enum_);
        return op1_12.measure-3p2s80s((dl1_1)object, ql1_02, l2).getHeight();
    }

    public static int b(op1_1 op1_12, Rj1 rj1, Qj1 qj1, int n3) {
        Object object = sl1_0.Max;
        Enum enum_ = tL1.Width;
        ql1_0 ql1_02 = new ql1_0(qj1, (sl1_0)((Object)object), (tL1)enum_);
        long l2 = f60.b(0, n3, 7);
        enum_ = rj1.getLayoutDirection();
        object = new dk1(rj1, (bp1_0)enum_);
        return op1_12.measure-3p2s80s((dl1_1)object, ql1_02, l2).getWidth();
    }

    public static int c(op1_1 op1_12, Rj1 rj1, Qj1 qj1, int n3) {
        Object object = sl1_0.Min;
        Enum enum_ = tL1.Height;
        ql1_0 ql1_02 = new ql1_0(qj1, (sl1_0)((Object)object), (tL1)enum_);
        long l2 = f60.b(n3, 0, 13);
        enum_ = rj1.getLayoutDirection();
        object = new dk1(rj1, (bp1_0)enum_);
        return op1_12.measure-3p2s80s((dl1_1)object, ql1_02, l2).getHeight();
    }

    public static int d(op1_1 op1_12, Rj1 rj1, Qj1 qj1, int n3) {
        Object object = sl1_0.Min;
        Enum enum_ = tL1.Width;
        ql1_0 ql1_02 = new ql1_0(qj1, (sl1_0)((Object)object), (tL1)enum_);
        long l2 = f60.b(0, n3, 7);
        enum_ = rj1.getLayoutDirection();
        object = new dk1(rj1, (bp1_0)enum_);
        return op1_12.measure-3p2s80s((dl1_1)object, ql1_02, l2).getWidth();
    }
}

