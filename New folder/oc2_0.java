/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from oc2
 */
public final class oc2_0
implements Function2 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    public oc2_0(ArrayList arrayList, ld2_1 ld2_12, md2_1 md2_12) {
        this.a = arrayList;
        this.b = ld2_12;
        this.c = md2_12;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        object2 = (Number)object2;
        int n3 = ((Number)object2).intValue() & 0xB;
        int n4 = 2;
        float f5 = 2.8E-45f;
        if (n3 == n4 && (n3 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object = LP1$a.b;
            f5 = 16;
            LP1 lP1 = j.c(h.e((LP1)object, f5), 1.0f);
            object2 = (ld2_1)this.b;
            md2_1 md2_12 = (md2_1)this.c;
            ArrayList arrayList = this.a;
            object = new nc2_2(arrayList, (ld2_1)object2, md2_12);
            n4 = 986987913;
            f5 = 0.0016192655f;
            u10 u102 = v10.c(n4, (fx0_2)object, (b30_0)object3);
            int n7 = 3078;
            int n8 = 6;
            md2_12 = null;
            arrayList = null;
            OA.a(lP1, null, false, u102, (b30_0)object3, n7, n8);
        }
        return Unit.a;
    }
}

