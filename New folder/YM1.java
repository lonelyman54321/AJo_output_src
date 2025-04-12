/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.source.j$b;
import java.util.Objects;

public final class YM1 {
    public final j$b a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public YM1(j$b j$b, long l2, long l3, long l4, long l7, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        YM1 yM1 = this;
        boolean bl6 = bl2;
        boolean bl7 = bl3;
        boolean bl8 = bl4;
        boolean bl9 = bl5;
        boolean bl10 = true;
        boolean bl11 = !bl5 || bl3;
        ct3.a(bl11);
        bl11 = !bl8 || bl7;
        ct3.a(bl11);
        if (bl6 && (bl7 || bl8 || bl9)) {
            bl10 = false;
        }
        ct3.a(bl10);
        yM1.a = j$b;
        yM1.b = l2;
        yM1.c = l3;
        yM1.d = l4;
        yM1.e = l7;
        yM1.f = bl6;
        yM1.g = bl7;
        yM1.h = bl8;
        yM1.i = bl9;
    }

    public final YM1 a(long l2) {
        YM1 yM1;
        long l3 = this.c;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            yM1 = this;
        } else {
            boolean bl2 = this.h;
            boolean bl3 = this.i;
            j$b j$b = this.a;
            long l7 = this.b;
            long l8 = this.d;
            long l12 = this.e;
            boolean bl4 = this.f;
            boolean bl5 = this.g;
            yM1 = new YM1(j$b, l7, l2, l8, l12, bl4, bl5, bl2, bl3);
        }
        return yM1;
    }

    public final YM1 b(long l2) {
        YM1 yM1;
        long l3 = this.b;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            yM1 = this;
        } else {
            boolean bl2 = this.h;
            boolean bl3 = this.i;
            j$b j$b = this.a;
            long l7 = this.c;
            long l8 = this.d;
            long l12 = this.e;
            boolean bl4 = this.f;
            boolean bl5 = this.g;
            yM1 = new YM1(j$b, l2, l7, l8, l12, bl4, bl5, bl2, bl3);
        }
        return yM1;
    }

    public final boolean equals(Object object) {
        block4: {
            boolean bl2;
            block6: {
                block5: {
                    boolean bl3;
                    int n3;
                    long l2;
                    long l3;
                    long l4;
                    Object object2;
                    Class<YM1> clazz;
                    bl2 = true;
                    if (this == object) {
                        return bl2;
                    }
                    if (object == null || (clazz = YM1.class) != (object2 = object.getClass())) break block4;
                    object = (YM1)object;
                    long l7 = this.b;
                    long l8 = ((YM1)object).b;
                    long l12 = l7 - l8;
                    Object object3 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                    if (object3 != false || (object3 = (l4 = (l7 = this.c) - (l8 = ((YM1)object).c)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false || (object3 = (l3 = (l7 = this.d) - (l8 = ((YM1)object).d)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false || (object3 = (l2 = (l7 = this.e) - (l8 = ((YM1)object).e)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false || (n3 = this.f) != (bl3 = ((YM1)object).f) || (n3 = this.g) != (bl3 = ((YM1)object).g) || (n3 = this.h) != (bl3 = ((YM1)object).h) || (n3 = this.i) != (bl3 = ((YM1)object).i)) break block5;
                    n3 = gz3.a;
                    object2 = this.a;
                    object = ((YM1)object).a;
                    boolean bl4 = Objects.equals(object2, object);
                    if (bl4) break block6;
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = (this.a.hashCode() + 527) * 31;
        int n4 = (int)this.b;
        n3 = (n3 + n4) * 31;
        n4 = (int)this.c;
        n3 = (n3 + n4) * 31;
        n4 = (int)this.d;
        n3 = (n3 + n4) * 31;
        n4 = (int)this.e;
        n3 = (n3 + n4) * 31;
        int n7 = this.f;
        n3 = (n3 + n7) * 31;
        int n8 = this.g;
        n3 = (n3 + n8) * 31;
        int n10 = this.h;
        n3 = (n3 + n10) * 31;
        int n14 = this.i;
        return n3 + n14;
    }
}

