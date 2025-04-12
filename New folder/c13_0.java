/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from c13
 */
public final class c13_0
implements lv_2 {
    public static final c13_0 a;

    static {
        c13_0 c13_02;
        a = c13_02 = new Object();
    }

    public static jD3 b(Class object) {
        NoSuchMethodException noSuchMethodException2;
        Object object2;
        String string2;
        block8: {
            InstantiationException instantiationException2;
            block7: {
                string2 = "Cannot create an instance of ";
                Intrinsics.checkNotNullParameter(object, "modelClass");
                Object var2_2 = null;
                object2 = ((Class)object).getDeclaredConstructor(null);
                var2_2 = ((Constructor)object2).newInstance(null);
                object2 = "{\n            modelClass\u2026).newInstance()\n        }";
                try {
                    Intrinsics.checkNotNullExpressionValue(var2_2, (String)object2);
                    return var2_2;
                }
                catch (IllegalAccessException illegalAccessException) {
                }
                catch (InstantiationException instantiationException2) {
                    break block7;
                }
                catch (NoSuchMethodException noSuchMethodException2) {
                    break block8;
                }
                StringBuilder stringBuilder = new StringBuilder(string2);
                stringBuilder.append(object);
                object = stringBuilder.toString();
                object2 = new RuntimeException((String)object, illegalAccessException);
                throw object2;
            }
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(object);
            object = stringBuilder.toString();
            object2 = new RuntimeException((String)object, instantiationException2);
            throw object2;
        }
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(object);
        object = stringBuilder.toString();
        object2 = new RuntimeException((String)object, noSuchMethodException2);
        throw object2;
    }

    public static LP1 c(LP1 lP1, float f5, i13 i132, long l2, long l3, int n3) {
        int n4;
        LP1 lP12;
        float f6;
        int n7 = n3 & 4;
        if (n7) {
            f6 = 0.0f;
            n7 = Float.compare(f5, f6);
            if (n7 > 0) {
                n7 = 1;
                f6 = Float.MIN_VALUE;
            } else {
                n7 = 0;
                f6 = 0.0f;
                lP12 = null;
            }
            n4 = n7;
        } else {
            n4 = 0;
        }
        n7 = n3 & 8;
        long l4 = n7 != 0 ? b11_0.a : l2;
        n7 = n3 & 0x10;
        long l7 = n7 != 0 ? b11_0.a : l3;
        f6 = 0.0f;
        n7 = Float.compare(f5, f6);
        if (n7 <= 0 && !n4) {
            lP12 = lP1;
        } else {
            ShadowGraphicsLayerElement shadowGraphicsLayerElement;
            lP12 = shadowGraphicsLayerElement;
            shadowGraphicsLayerElement = new ShadowGraphicsLayerElement(f5, i132, n4 != 0, l4, l7);
            lP12 = lP1;
            lP12 = lP1.then(shadowGraphicsLayerElement);
        }
        return lP12;
    }

    public void a(da1_2 object, qg3_2 object2) {
        ks2_2 ks2_22;
        block3: {
            Object object3;
            ks2_2 ks2_23;
            block2: {
                int n3;
                object2 = (gx0_2)object2;
                Intrinsics.checkNotNullParameter(object, "client");
                Intrinsics.checkNotNullParameter(object2, "handler");
                ks2_23 = new ks2_2("BeforeReceive");
                object3 = ((da1_2)object).g;
                ks2_22 = nb1_2.f;
                object3.getClass();
                Intrinsics.checkNotNullParameter(ks2_22, "reference");
                String string2 = "phase";
                Intrinsics.checkNotNullParameter(ks2_23, string2);
                boolean n4 = ((hs2_2)object3).e(ks2_23);
                if (n4) break block2;
                int n7 = ((hs2_2)object3).c(ks2_22);
                if (n7 == (n3 = -1)) break block3;
                String string3 = "relativeTo";
                Intrinsics.checkNotNullParameter(ks2_22, string3);
                Ls2$b ls2$b = new ls2_1();
                us2_2 us2_22 = new us2_2(ks2_23, ls2$b);
                object3 = ((hs2_2)object3).a;
                object3.add(n7, us2_22);
            }
            object3 = new bf2_2((gx0_2)object2, null);
            ((da1_2)object).g.g(ks2_23, (gx0_2)object3);
            return;
        }
        object2 = new StringBuilder("Phase ");
        ((StringBuilder)object2).append(ks2_22);
        ((StringBuilder)object2).append(" was not registered for this pipeline");
        object2 = ((StringBuilder)object2).toString();
        object = new fk1_2((String)object2);
        throw object;
    }
}

