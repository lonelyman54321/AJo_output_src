/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jX
 */
public final class jx_2
implements hx0_2 {
    public final /* synthetic */ he1_2 a;

    public jx_2(he1_2 he1_22) {
        this.a = he1_22;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (PA)object;
        object2 = (zd1_2)object2;
        object3 = (b30_0)object3;
        object4 = (Number)object4;
        int n3 = ((Number)object4).intValue();
        String string2 = "$this$ImageRequest";
        Intrinsics.checkNotNullParameter(object, string2);
        object = "imageState";
        Intrinsics.checkNotNullParameter(object2, (String)object);
        int n4 = n3 & 0x30;
        if (n4 == 0) {
            n4 = (int)(object3.J(object2) ? 1 : 0);
            n4 = n4 != 0 ? 32 : 16;
            n3 |= n4;
        }
        if ((n4 = n3 & 0x91) == (n3 = 144) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object = xw_0.a((zd1_2)object2);
            boolean bl2 = object instanceof WW$d;
            if (bl2 && (object = ((WW$d)object).a) != null) {
                object2 = LP1$a.b;
                object4 = mz0_2.a;
                object = ji2_2.a((Drawable)object, (List)object4, (b30_0)object3);
                object4 = this.a;
                int n7 = 48;
                ie3_1.a((he1_2)object4, (LP1)object2, (im2)object, (b30_0)object3, n7);
            }
        }
        return Unit.a;
    }
}

