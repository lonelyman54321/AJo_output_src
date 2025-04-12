/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.OverwritingInputMerger;
import androidx.work.b;
import kotlin.jvm.internal.Intrinsics;

public final class EI3 {
    public static final di3_2 y;
    public final String a;
    public hI3$b b;
    public final String c;
    public final String d;
    public b e;
    public final b f;
    public final long g;
    public long h;
    public long i;
    public b60 j;
    public final int k;
    public final Au l;
    public final long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public sg2 r;
    public final int s;
    public final int t;
    public long u;
    public int v;
    public final int w;
    public String x;

    static {
        di3_2 di3_22;
        Intrinsics.checkNotNullExpressionValue(qx1.b("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
        y = di3_22 = new Object();
    }

    public EI3(String string2, hI3$b hI3$b, String string3, String string4, b b2, b b3, long l2, long l3, long l4, b60 b602, int n3, Au au4, long l7, long l8, long l12, long l14, boolean bl2, sg2 sg22, int n4, int n7, long l15, int n8, int n10, String string5) {
        Intrinsics.checkNotNullParameter(string2, "id");
        Intrinsics.checkNotNullParameter((Object)hI3$b, "state");
        Intrinsics.checkNotNullParameter(string3, "workerClassName");
        Intrinsics.checkNotNullParameter(string4, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(b2, "input");
        Intrinsics.checkNotNullParameter(b3, "output");
        Intrinsics.checkNotNullParameter(b602, "constraints");
        Intrinsics.checkNotNullParameter((Object)au4, "backoffPolicy");
        Intrinsics.checkNotNullParameter((Object)sg22, "outOfQuotaPolicy");
        this.a = string2;
        this.b = hI3$b;
        this.c = string3;
        this.d = string4;
        this.e = b2;
        this.f = b3;
        this.g = l2;
        this.h = l3;
        this.i = l4;
        this.j = b602;
        this.k = n3;
        this.l = au4;
        this.m = l7;
        this.n = l8;
        this.o = l12;
        this.p = l14;
        this.q = bl2;
        this.r = sg22;
        this.s = n4;
        this.t = n7;
        this.u = l15;
        this.v = n8;
        this.w = n10;
        this.x = string5;
    }

    public /* synthetic */ EI3(String string2, hI3$b hI3$b, String string3, String string4, b b2, b b3, long l2, long l3, long l4, b60 b602, int n3, Au au4, long l7, long l8, long l12, long l14, boolean bl2, sg2 sg22, int n4, long l15, int n7, int n8, String string5, int n10) {
        String string6;
        int n14;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        int n15 = n10;
        int n16 = n10 & 2;
        Object object9 = n16 != 0 ? (object8 = hI3$b.ENQUEUED) : hI3$b;
        n16 = n15 & 8;
        if (n16) {
            object8 = OverwritingInputMerger.class.getName();
            object7 = "OverwritingInputMerger::class.java.name";
            Intrinsics.checkNotNullExpressionValue(object8, object7);
            object6 = object8;
        } else {
            object6 = string4;
        }
        n16 = n15 & 0x10;
        if (n16) {
            object8 = androidx.work.b.b;
            object5 = object8;
        } else {
            object5 = b2;
        }
        n16 = n15 & 0x20;
        if (n16) {
            object8 = androidx.work.b.b;
            object4 = object8;
        } else {
            object4 = b3;
        }
        n16 = n15 & 0x40;
        long l16 = 0L;
        long l17 = n16 != 0 ? l16 : l2;
        n16 = n15 & 0x80;
        long l18 = n16 != 0 ? l16 : l3;
        n16 = n15 & 0x100;
        long l19 = n16 != 0 ? l16 : l4;
        n16 = n15 & 0x200;
        if (n16) {
            object8 = b60.j;
            object3 = object8;
        } else {
            object3 = b602;
        }
        n16 = n15 & 0x400;
        int n17 = n16 != 0 ? 0 : n3;
        n16 = n15 & 0x800;
        if (n16) {
            object8 = Au.EXPONENTIAL;
            object2 = object8;
        } else {
            object2 = au4;
        }
        n16 = n15 & 0x1000;
        long l20 = n16 != 0 ? 30000L : l7;
        n16 = n15 & 0x2000;
        long l21 = -1;
        long l22 = n16 != 0 ? l21 : l8;
        n16 = n15 & 0x4000;
        long l23 = n16 != 0 ? l16 : l12;
        n16 = 0x8000 & n15;
        long l24 = n16 != 0 ? l21 : l14;
        n16 = 0x10000 & n15;
        if (n16) {
            n16 = 0;
            object8 = null;
        } else {
            n16 = bl2 ? 1 : 0;
        }
        int n18 = 0x20000 & n15;
        if (n18 != 0) {
            object7 = sg2.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
            object = object7;
        } else {
            object = sg22;
        }
        n18 = 0x40000 & n15;
        int n19 = n18 != 0 ? 0 : n4;
        n18 = 0x100000 & n15;
        long l25 = n18 != 0 ? (l16 = Long.MAX_VALUE) : l15;
        n18 = 0x200000 & n15;
        int n20 = n18 != 0 ? 0 : n7;
        n18 = 0x400000 & n15;
        if (n18 != 0) {
            n18 = -256;
            n14 = -256;
        } else {
            n14 = n8;
        }
        n18 = 0x800000;
        if ((n15 &= n18) != 0) {
            n15 = 0;
            string6 = null;
        } else {
            string6 = string5;
        }
        object7 = this;
        l21 = l22;
        l22 = l23;
        l23 = l24;
        int n21 = n20;
        n20 = n14;
        this(string2, (hI3$b)((Object)object9), string3, (String)object6, (b)object5, (b)object4, l17, l18, l19, (b60)object3, n17, (Au)((Object)object2), l20, l21, l22, l24, n16 != 0, (sg2)((Object)object), n19, 0, l25, n21, n14, string6);
    }

    /*
     * WARNING - void declaration
     */
    public static EI3 b(EI3 eI3, String string2, hI3$b hI3$b, String string3, b b2, int n3, long l2, int n4, int n7, long l3, int n8, int n10) {
        void var45_38;
        int n14;
        Object object;
        Object object2;
        Object object3;
        EI3 eI32 = eI3;
        int n15 = n10;
        int n16 = n10 & 1;
        Object object4 = n16 != 0 ? (object3 = eI3.a) : string2;
        n16 = n15 & 2;
        if (n16 != 0) {
            object3 = eI32.b;
            object2 = object3;
        } else {
            object2 = hI3$b;
        }
        n16 = n15 & 4;
        Object object5 = n16 != 0 ? (object3 = eI32.c) : string3;
        String string4 = eI32.d;
        n16 = n15 & 0x10;
        if (n16 != 0) {
            object3 = eI32.e;
            object = object3;
        } else {
            object = b2;
        }
        b b3 = eI32.f;
        long l4 = eI32.g;
        long l7 = eI32.h;
        long l8 = eI32.i;
        object3 = eI32.j;
        int n17 = n15 & 0x400;
        int n18 = n17 != 0 ? (n17 = eI32.k) : n3;
        Object object6 = eI32.l;
        long l12 = l8;
        long l14 = l8 = eI32.m;
        int n19 = n15 & 0x2000;
        long l15 = n19 != 0 ? (l8 = eI32.n) : l2;
        long l16 = eI32.o;
        long l17 = l8 = eI32.p;
        n19 = eI32.q ? 1 : 0;
        sg2 sg22 = eI32.r;
        int bl2 = n15 & 0x40000;
        if (bl2 != 0) {
            int n20 = n19;
            n14 = n19 = eI32.s;
        } else {
            int n21 = n19;
            n14 = n4;
        }
        n19 = 0x80000 & n15;
        int n22 = n19 != 0 ? (n19 = eI32.t) : n7;
        n19 = 0x100000 & n15;
        long l18 = l7;
        long l19 = n19 != 0 ? (l7 = eI32.u) : l3;
        int n24 = 0x200000;
        n15 = (n15 &= n24) != 0 ? eI32.v : n8;
        n19 = eI32.w;
        String string5 = eI32.x;
        eI3.getClass();
        Intrinsics.checkNotNullParameter(object4, "id");
        Intrinsics.checkNotNullParameter(object2, "state");
        Intrinsics.checkNotNullParameter(object5, "workerClassName");
        Intrinsics.checkNotNullParameter(string4, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(object, "input");
        Intrinsics.checkNotNullParameter(b3, "output");
        Intrinsics.checkNotNullParameter(object3, "constraints");
        Intrinsics.checkNotNullParameter(object6, "backoffPolicy");
        Intrinsics.checkNotNullParameter((Object)sg22, "outOfQuotaPolicy");
        Enum enum_ = object6;
        object6 = eI32;
        l7 = l18;
        l8 = l12;
        Au au4 = enum_;
        enum_ = sg22;
        l18 = l19;
        eI32 = new EI3((String)object4, (hI3$b)((Object)object2), (String)object5, string4, (b)object, b3, l4, l7, l12, (b60)object3, n18, au4, l14, l15, l16, l17, (boolean)var45_38, sg22, n14, n22, l19, n15, n19, string5);
        return eI32;
    }

    public final long a() {
        boolean bl2;
        int n3;
        EI3 eI3 = this;
        hI3$b hI3$b = this.b;
        hI3$b hI3$b2 = hI3$b.ENQUEUED;
        if (hI3$b == hI3$b2 && (n3 = this.k) > 0) {
            n3 = 1;
            bl2 = true;
        } else {
            n3 = 0;
            hI3$b = null;
            bl2 = false;
            hI3$b2 = null;
        }
        long l2 = eI3.n;
        boolean bl3 = this.f();
        long l3 = eI3.i;
        long l4 = eI3.h;
        long l7 = eI3.u;
        int n4 = eI3.k;
        Au au4 = eI3.l;
        long l8 = eI3.m;
        int n7 = eI3.s;
        long l12 = eI3.g;
        return EI3$a.a(bl2, n4, au4, l8, l2, n7, bl3, l12, l3, l4, l7);
    }

    public final int c() {
        return this.t;
    }

    public final String d() {
        return this.x;
    }

    public final boolean e() {
        b60 b602 = b60.j;
        b60 b603 = this.j;
        return Intrinsics.areEqual(b602, b603) ^ true;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof EI3;
        if (n3 == 0) {
            return false;
        }
        object = (EI3)object;
        Object object2 = this.a;
        Object object3 = ((EI3)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object3 = this.b;
        object2 = ((EI3)object).b;
        if (object3 != object2) {
            return false;
        }
        object3 = this.c;
        object2 = ((EI3)object).c;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        object3 = this.d;
        object2 = ((EI3)object).d;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        object3 = this.e;
        object2 = ((EI3)object).e;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        object3 = this.f;
        object2 = ((EI3)object).f;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        long l2 = this.g;
        long l3 = ((EI3)object).g;
        long l4 = l2 - l3;
        n3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (n3 != 0) {
            return false;
        }
        l2 = this.h;
        l3 = ((EI3)object).h;
        long l7 = l2 - l3;
        n3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (n3 != 0) {
            return false;
        }
        l2 = this.i;
        l3 = ((EI3)object).i;
        long l8 = l2 - l3;
        n3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (n3 != 0) {
            return false;
        }
        object3 = this.j;
        object2 = ((EI3)object).j;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        n3 = this.k;
        int n4 = ((EI3)object).k;
        if (n3 != n4) {
            return false;
        }
        object3 = this.l;
        object2 = ((EI3)object).l;
        if (object3 != object2) {
            return false;
        }
        l2 = this.m;
        l3 = ((EI3)object).m;
        long l12 = l2 - l3;
        n3 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (n3 != 0) {
            return false;
        }
        l2 = this.n;
        l3 = ((EI3)object).n;
        long l14 = l2 - l3;
        n3 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (n3 != 0) {
            return false;
        }
        l2 = this.o;
        l3 = ((EI3)object).o;
        long l15 = l2 - l3;
        n3 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
        if (n3 != 0) {
            return false;
        }
        l2 = this.p;
        l3 = ((EI3)object).p;
        long l16 = l2 - l3;
        n3 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
        if (n3 != 0) {
            return false;
        }
        n3 = this.q ? 1 : 0;
        n4 = ((EI3)object).q ? 1 : 0;
        if (n3 != n4) {
            return false;
        }
        object3 = this.r;
        object2 = ((EI3)object).r;
        if (object3 != object2) {
            return false;
        }
        n3 = this.s;
        n4 = ((EI3)object).s;
        if (n3 != n4) {
            return false;
        }
        n3 = this.t;
        n4 = ((EI3)object).t;
        if (n3 != n4) {
            return false;
        }
        l2 = this.u;
        l3 = ((EI3)object).u;
        long l17 = l2 - l3;
        n3 = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
        if (n3 != 0) {
            return false;
        }
        n3 = this.v;
        n4 = ((EI3)object).v;
        if (n3 != n4) {
            return false;
        }
        n3 = this.w;
        n4 = ((EI3)object).w;
        if (n3 != n4) {
            return false;
        }
        object3 = this.x;
        object = ((EI3)object).x;
        boolean bl3 = Intrinsics.areEqual(object3, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final boolean f() {
        long l2 = this.h;
        long l3 = 0L;
        long l4 = l2 - l3;
        long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = l7 != false;
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode();
        int n4 = 31;
        int n7 = (((Object)((Object)this.b)).hashCode() + (n3 *= 31)) * 31;
        Object object = this.c;
        n3 = zy_2.b(n7, n4, (String)object);
        Object object2 = this.d;
        n3 = zy_2.b(n3, n4, (String)object2);
        n7 = (this.e.hashCode() + n3) * 31;
        n3 = (this.f.hashCode() + n7) * 31;
        long l2 = this.g;
        int n8 = 32;
        long l3 = l2 >>> n8;
        int n10 = (int)(l2 ^ l3);
        n3 = (n3 + n10) * 31;
        l2 = this.h;
        l3 = l2 >>> n8;
        n10 = (int)(l2 ^ l3);
        n3 = (n3 + n10) * 31;
        l2 = this.i;
        l3 = l2 >>> n8;
        n10 = (int)(l2 ^ l3);
        n3 = (n3 + n10) * 31;
        object2 = this.j;
        n7 = (((b60)object2).hashCode() + n3) * 31;
        n3 = this.k;
        n7 = (n7 + n3) * 31;
        object = this.l;
        n3 = (object.hashCode() + n7) * 31;
        l2 = this.m;
        l3 = l2 >>> n8;
        n10 = (int)(l2 ^ l3);
        n3 = (n3 + n10) * 31;
        l2 = this.n;
        l3 = l2 >>> n8;
        n10 = (int)(l2 ^ l3);
        n3 = (n3 + n10) * 31;
        l2 = this.o;
        l3 = l2 >>> n8;
        n10 = (int)(l2 ^ l3);
        n3 = (n3 + n10) * 31;
        l2 = this.p;
        l3 = l2 >>> n8;
        n10 = (int)(l2 ^= l3);
        n3 = (n3 + n10) * 31;
        n7 = this.q ? 1 : 0;
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 + n7) * 31;
        object2 = this.r;
        n7 = (object2.hashCode() + n3) * 31;
        n3 = this.s;
        n7 = (n7 + n3) * 31;
        n3 = this.t;
        n7 = (n7 + n3) * 31;
        l3 = this.u;
        long l4 = l3 >>> n8 ^ l3;
        n3 = (int)l4;
        n7 = (n7 + n3) * 31;
        n3 = this.v;
        n7 = (n7 + n3) * 31;
        n3 = this.w;
        n7 = (n7 + n3) * 31;
        object = this.x;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        return n7 + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("{WorkSpec: ");
        String string2 = this.a;
        return ui0_1.a(stringBuilder, string2, '}');
    }
}

