/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from jf2
 */
public final class jf2_2
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;

    public jf2_2(qz1_2 qz1_22, String string2, sb2_1 sb2_12, b7_0 b7_02) {
        this.a = qz1_22;
        this.b = string2;
        this.c = sb2_12;
        this.d = b7_02;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object = (CharSequence)this.a.i.getValue();
            n4 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
            if (n4 != 0) {
                Object object4 = object = this.c;
                object4 = (sb2_1)object;
                Object object5 = object = this.d;
                object5 = (b7_0)object;
                String string2 = this.b;
                qz1_2 qz1_22 = this.a;
                int n7 = 4096;
                qf2_0.b(string2, (sb2_1)object4, (b7_0)object5, qz1_22, (b30_0)object3, n7);
            }
        }
        return Unit.a;
    }
}

