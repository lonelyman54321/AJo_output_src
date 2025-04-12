/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.Magnifier
 *  android.widget.Magnifier$Builder
 */
import android.view.View;
import android.widget.Magnifier;

/*
 * Renamed from nt2
 */
public final class nt2_1
implements lt2 {
    public static final nt2_1 a;

    static {
        nt2_1 nt2_12;
        a = nt2_12 = new Object();
    }

    public final boolean a() {
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public final kt2_0 b(View view, boolean bl2, long l2, float f5, float f6, boolean bl3, Vo0 vo0, float f7) {
        nt2$a nt2$a;
        if (bl2) {
            Magnifier magnifier = new Magnifier(view);
            nt2$a = new mt2$a(magnifier);
        } else {
            void var7_7;
            void var9_9;
            void var6_6;
            float f8;
            void var3_4;
            void var8_8;
            long l3 = var8_8.Z0((long)var3_4);
            float f11 = var8_8.J0(f8);
            f8 = var8_8.J0((float)var6_6);
            Magnifier.Builder builder = new Magnifier.Builder(view);
            long l4 = 9205357640488583168L;
            long l7 = l3 - l4;
            Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object != false) {
                float f12 = C63.d(l3);
                object = ok1_1.b(f12);
                float f14 = C63.b(l3);
                int n3 = ok1_1.b(f14);
                builder.setSize((int)object, n3);
            }
            if ((object = (Object)Float.isNaN(f11)) == false) {
                builder.setCornerRadius(f11);
            }
            if ((object = (Object)Float.isNaN(f8)) == false) {
                builder.setElevation(f8);
            }
            if ((object = (Object)Float.isNaN((float)var9_9)) == false) {
                builder.setInitialZoom((float)var9_9);
            }
            builder.setClippingEnabled((boolean)var7_7);
            view = builder.build();
            nt2$a = new mt2$a((Magnifier)view);
        }
        return nt2$a;
    }
}

