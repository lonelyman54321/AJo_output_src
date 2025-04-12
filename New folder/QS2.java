/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class QS2
extends Lambda
implements Function2 {
    public final /* synthetic */ lg3_0 c;
    public final /* synthetic */ xf3_1 d;
    public final /* synthetic */ List e;
    public final /* synthetic */ List f;
    public final /* synthetic */ Integer g;
    public final /* synthetic */ gx0_2 h;

    public QS2(lg3_0 lg3_02, xf3_1 xf3_12, ArrayList arrayList, ArrayList arrayList2, Integer n3, u10 u102) {
        this.c = lg3_02;
        this.d = xf3_12;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = n3;
        this.h = u102;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        object2 = (Number)object2;
        int n3 = ((Number)object2).intValue() & 3;
        int n4 = 2;
        float f5 = 2.8E-45f;
        if (n3 == n4 && (n3 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            float f6;
            Object object3 = this.c;
            Object object4 = this.d;
            object2 = new gi1((lg3_0)object3, (Vo0)object4);
            object3 = this.e;
            n4 = (int)(object3.isEmpty() ? 1 : 0);
            f5 = n4 != 0 ? ((gi1)object2).calculateTopPadding-D9Ej5fM() : 0.0f;
            Object object5 = this.f;
            int n7 = object5.isEmpty();
            if (n7 == 0 && (object5 = this.g) != null) {
                n7 = (Integer)object5;
                f6 = object4.D0(n7);
            } else {
                f6 = ((gi1)object2).calculateBottomPadding-D9Ej5fM();
            }
            bp1_0 bp1_02 = object4.getLayoutDirection();
            float f7 = androidx.compose.foundation.layout.h.c((mk2_0)object2, bp1_02);
            object4 = object4.getLayoutDirection();
            float f8 = androidx.compose.foundation.layout.h.b((mk2_0)object2, (bp1_0)((Object)object4));
            object4 = new nk2_0(f7, f5, f8, f6);
            object2 = 0;
            object3 = this.h;
            object3.invoke(object4, object, object2);
        }
        return Unit.a;
    }
}

