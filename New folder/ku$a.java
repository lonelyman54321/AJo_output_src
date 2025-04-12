/*
 * Decompiled with CFR 0.152.
 */
public final class ku$a
implements dx2_1 {
    public final long a;
    public final /* synthetic */ ku_0 b;

    public ku$a(ku_0 ku_02, long l2) {
        this.b = ku_02;
        this.a = l2;
    }

    public final dX2$a d(long l2) {
        Object object;
        int n3;
        ku_0 ku_02 = this.b;
        Object object2 = ku_02.i[0].b(l2);
        for (int i3 = 1; i3 < (n3 = ((HU[])(object = ku_02.i)).length); ++i3) {
            object = object[i3].b(l2);
            fx2_0 fx2_02 = object.a;
            long l3 = fx2_02.b;
            fx2_0 fx2_03 = object2.a;
            long l4 = fx2_03.b;
            long l7 = l3 - l4;
            Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object3 >= 0) continue;
            object2 = object;
        }
        return object2;
    }

    public final boolean g() {
        return true;
    }

    public final long getDurationUs() {
        return this.a;
    }
}

