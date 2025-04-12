/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 */
import android.graphics.PointF;

/*
 * Renamed from Kv2
 */
public final class kv2_1
implements qA3 {
    public static final kv2_1 a;

    static {
        kv2_1 kv2_12;
        a = kv2_12 = new Object();
    }

    public final Object a(gm1_0 object, float f5) {
        Gm1$b gm1$b;
        block6: {
            block4: {
                boolean bl2;
                Gm1$b gm1$b2;
                block5: {
                    block3: {
                        gm1$b = ((gm1_0)object).z();
                        if (gm1$b != (gm1$b2 = Gm1$b.BEGIN_ARRAY)) break block3;
                        object = Xm1.b((gm1_0)object, f5);
                        break block4;
                    }
                    gm1$b2 = Gm1$b.BEGIN_OBJECT;
                    if (gm1$b != gm1$b2) break block5;
                    object = Xm1.b((gm1_0)object, f5);
                    break block4;
                }
                gm1$b2 = Gm1$b.NUMBER;
                if (gm1$b != gm1$b2) break block6;
                double d2 = ((gm1_0)object).p();
                float f6 = (float)d2 * f5;
                double d5 = ((gm1_0)object).p();
                float f7 = (float)d5 * f5;
                gm1$b = new PointF(f6, f7);
                while (bl2 = ((gm1_0)object).k()) {
                    ((gm1_0)object).H();
                }
                object = gm1$b;
            }
            return object;
        }
        CharSequence charSequence = new StringBuilder("Cannot convert json to point. Next token is ");
        charSequence.append((Object)gm1$b);
        charSequence = charSequence.toString();
        object = new IllegalArgumentException((String)charSequence);
        throw object;
    }
}

