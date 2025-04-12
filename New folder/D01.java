/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class D01
extends co1_1 {
    public final B01 i;

    public D01(List object) {
        super((List)object);
        int n3;
        float[] fArray = null;
        int n4 = 0;
        int[] nArray = null;
        for (int i3 = 0; i3 < (n3 = object.size()); ++i3) {
            Object object2 = (B01)((Bo1)object.get((int)i3)).b;
            if (object2 == null) continue;
            object2 = ((B01)object2).b;
            n3 = ((Object)object2).length;
            n4 = Math.max(n4, n3);
        }
        fArray = new float[n4];
        nArray = new int[n4];
        this.i = object = new B01(nArray, fArray);
    }

    public final Object g(Bo1 object, float f5) {
        int[] nArray;
        int[] nArray2;
        block7: {
            B01 b01;
            block4: {
                B01 b012;
                block6: {
                    float f6;
                    Object object2;
                    block5: {
                        block3: {
                            b012 = (B01)((Bo1)object).b;
                            object = (B01)((Bo1)object).c;
                            b01 = this.i;
                            b01.getClass();
                            object2 = b012.equals(object);
                            if (object2 == 0) break block3;
                            b01.a(b012);
                            break block4;
                        }
                        f6 = 0.0f;
                        nArray2 = null;
                        float f7 = f5 - 0.0f;
                        object2 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
                        if (object2 > 0) break block5;
                        b01.a(b012);
                        break block4;
                    }
                    f6 = 1.0f;
                    float f8 = f5 - f6;
                    object2 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                    if (object2 < 0) break block6;
                    b01.a((B01)object);
                    break block4;
                }
                nArray2 = b012.b;
                int n3 = nArray2.length;
                nArray = ((B01)object).b;
                int n4 = nArray.length;
                if (n3 == n4) {
                    int n7;
                    float[] fArray;
                    int[] nArray3;
                    n3 = 0;
                    while (true) {
                        n4 = nArray2.length;
                        nArray3 = b01.b;
                        fArray = b01.a;
                        if (n3 >= n4) break;
                        float[] fArray2 = b012.a;
                        float f11 = fArray2[n3];
                        float[] fArray3 = ((B01)object).a;
                        float f12 = fArray3[n3];
                        fArray[n3] = f11 = mp1_0.f(f11, f12, f5);
                        n4 = nArray2[n3];
                        int n8 = nArray[n3];
                        nArray3[n3] = n4 = hh3_1.c(f5, n4, n8);
                        ++n3;
                    }
                    for (int i3 = nArray2.length; i3 < (n7 = fArray.length); ++i3) {
                        n7 = nArray2.length + -1;
                        fArray[i3] = f5 = fArray[n7];
                        n7 = nArray2.length + -1;
                        nArray3[i3] = n7 = nArray3[n7];
                    }
                }
                break block7;
            }
            return b01;
        }
        CharSequence charSequence = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
        int n10 = nArray2.length;
        charSequence.append(n10);
        charSequence.append(" vs ");
        charSequence = g30.a(nArray.length, ")", charSequence);
        object = new IllegalArgumentException((String)charSequence);
        throw object;
    }
}

