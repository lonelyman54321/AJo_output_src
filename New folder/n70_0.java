/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.text.b;

/*
 * Renamed from N70
 */
public final class n70_0
extends Lambda
implements gx0_2 {
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ LP1 e;
    public final /* synthetic */ gx0_2 f;
    public final /* synthetic */ Function0 g;

    public n70_0(a80 a802, boolean bl2, LP1 lP1, gx0_2 gx0_22, Function0 function0) {
        this.c = a802;
        this.d = bl2;
        this.e = lP1;
        this.f = gx0_22;
        this.g = function0;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        block6: {
            block5: {
                int n3;
                Object object4;
                Object object5;
                block4: {
                    int n4;
                    object5 = object;
                    object5 = (E70)object;
                    object4 = object2;
                    object4 = (b30_0)object2;
                    int n7 = ((Number)(object3 = (Number)object3)).intValue();
                    n3 = n7 & 6;
                    if (n3 == 0) {
                        n3 = (int)(object4.J(object5) ? 1 : 0);
                        n3 = n3 != 0 ? 4 : 2;
                        n7 |= n3;
                    }
                    if ((n3 = n7 & 0x13) != (n4 = 18) || (n3 = (int)(object4.h() ? 1 : 0)) == 0) break block4;
                    object4.D();
                    break block5;
                }
                object2 = 0;
                object3 = this.c;
                Object object6 = object2 = object3.invoke(object4, object2);
                object6 = (String)object2;
                n3 = b.k((CharSequence)object6) ^ 1;
                if (n3 == 0) break block6;
                int n8 = (n7 <<= 6) & 0x380;
                boolean bl2 = this.d;
                LP1 lP1 = this.e;
                gx0_2 gx0_22 = this.f;
                Function0 function0 = this.g;
                X70.b((String)object6, bl2, (E70)object5, lP1, gx0_22, function0, (b30_0)object4, n8);
            }
            return Unit.a;
        }
        object2 = "Label must not be blank".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

