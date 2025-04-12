/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.dresstool.DressToolModel;
import com.ril.ajio.services.data.dresstool.Question;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kv0
 */
public final class kv0_1
implements hx0_2 {
    public final /* synthetic */ DressToolModel a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ ov0_0 c;

    public kv0_1(DressToolModel dressToolModel, xv0_2 xv0_22, ov0_0 ov0_02) {
        this.a = dressToolModel;
        this.b = xv0_22;
        this.c = ov0_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (wl2_0)object;
        object2 = (Number)object2;
        int n3 = ((Number)object2).intValue();
        object3 = (b30_0)object3;
        ((Number)object4).intValue();
        Intrinsics.checkNotNullParameter(object, "$this$HorizontalPager");
        int n4 = 0;
        object = null;
        object4 = this.a;
        object4 = object4 != null && (object4 = ((DressToolModel)object4).getQuestions()) != null ? (Question)object4.get(n3) : null;
        Object object5 = object4 != null ? ((Question)object4).getViewType() : null;
        if (object5 != null) {
            int n7 = ((String)object5).hashCode();
            int n8 = -383243290;
            int n10 = 8;
            ov0_0 ov0_02 = this.c;
            if (n7 != n8) {
                n3 = 1101405511;
                if (n7 != n3) {
                    n3 = 1951953708;
                    if (n7 == n3 && (n3 = (int)(((String)object5).equals(object2 = "BANNER") ? 1 : 0)) != 0) {
                        object3.K(1848498591);
                        object2 = Unit.a;
                        object5 = new hv0_2(ov0_02, null);
                        ly0_0.d((b30_0)object3, object2, (Function2)object5);
                        n3 = 1;
                        object = new u2_0(ov0_02, n3);
                        cv_1.a((Question)object4, (u2_0)object, (b30_0)object3, n10);
                        object3.E();
                        return Unit.a;
                    }
                } else {
                    object2 = "RESULT_FINDING";
                    n3 = (int)(((String)object5).equals(object2) ? 1 : 0);
                    if (n3 != 0) {
                        n3 = 1848877907;
                        object3.K(n3);
                        object2 = Unit.a;
                        object5 = new iv0_2(ov0_02, null);
                        ly0_0.d((b30_0)object3, object2, (Function2)object5);
                        object = (xv0_2)this.b;
                        ml2_1.a((Question)object4, (xv0_2)object, (b30_0)object3, n10);
                        object3.E();
                        return Unit.a;
                    }
                }
            } else {
                object = "QUESTION";
                n4 = (int)(((String)object5).equals(object) ? 1 : 0);
                if (n4 != 0) {
                    jv0_2 jv0_22;
                    n4 = 1849274521;
                    object3.K(n4);
                    object = Unit.a;
                    DressToolModel dressToolModel = this.a;
                    ov0_0 ov0_03 = this.c;
                    object5 = jv0_22;
                    n8 = n3;
                    jv0_22 = new jv0_2(dressToolModel, n3, ov0_03, (Question)object4, null);
                    ly0_0.d((b30_0)object3, object, jv0_22);
                    object = new gv0_1(ov0_02, n3);
                    ag2_1.a((Question)object4, (gv0_1)object, (b30_0)object3, n10);
                    object3.E();
                    return Unit.a;
                }
            }
        }
        n4 = 1849969913;
        object3.K(n4);
        object3.E();
        return Unit.a;
    }
}

