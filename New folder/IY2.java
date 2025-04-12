/*
 * Decompiled with CFR 0.152.
 */
public final class IY2 {
    public final zy2_0 a;
    public final ur1_0 b;

    public IY2(GY2 object, Qi1 qi1) {
        int n3 = 1;
        Object object2 = ((GY2)object).d;
        this.a = object2;
        object2 = aj1.a;
        this.b = object2 = new ur1_0(null);
        object = GY2.h((GY2)object, n3 != 0, 4);
        int n4 = object.size();
        for (int i3 = 0; i3 < n4; i3 += n3) {
            GY2 gY2 = (GY2)object.get(i3);
            int n7 = gY2.g;
            if ((n7 = (int)(qi1.a(n7) ? 1 : 0)) == 0) continue;
            ur1_0 ur1_02 = this.b;
            int n8 = gY2.g;
            ur1_02.b(n8);
        }
    }
}

