/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from jw
 */
public final class jw_0
implements iw$a {
    public final /* synthetic */ kw_1 a;

    public /* synthetic */ jw_0(kw_1 kw_12) {
        this.a = kw_12;
    }

    public final void a() {
        Object object = this.a;
        es0_0 es0_02 = ((kw_1)object).r;
        float f5 = es0_02.m();
        int n3 = 1065353216;
        float f6 = 1.0f;
        float f7 = f5 - f6;
        Object object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object2 == false) {
            object2 = true;
            f5 = Float.MIN_VALUE;
        } else {
            object2 = false;
            f5 = 0.0f;
            es0_02 = null;
        }
        n3 = (int)(((kw_1)object).x ? 1 : 0);
        if (object2 != n3) {
            ((kw_1)object).x = object2;
            object = ((kw_1)object).o;
            ((yc1_1)((Object)object)).invalidateSelf();
        }
    }
}

