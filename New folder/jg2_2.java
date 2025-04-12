/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from jg2
 */
public final class jg2_2
implements Function2 {
    public final /* synthetic */ bg2_1 a;

    public jg2_2(bg2_1 bg2_12) {
        this.a = bg2_12;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0))) {
            object.D();
        } else {
            String string2;
            object2 = this.a;
            qz1_2 qz1_22 = ((bg2_1)object2).Pa();
            if ((object2 = ((Fragment)object2).getArguments()) != null) {
                string2 = "is_from_customer_care_page";
                n4 = (int)(object2.getBoolean(string2) ? 1 : 0);
            } else {
                n4 = 0;
                object2 = null;
            }
            string2 = null;
            int n7 = 8;
            vl0_0.a(n7, (b30_0)object, qz1_22, null, n4 != 0);
        }
        return Unit.a;
    }
}

