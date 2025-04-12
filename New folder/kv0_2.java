/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.dresstool.ApplicableStyle;
import com.ril.ajio.services.data.dresstool.ResultModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Kv0
 */
public final class kv0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ ov0_0 a;
    public final /* synthetic */ int b;

    public kv0_2(ov0_0 ov0_02, int n3, f80_0 f80_02) {
        this.a = ov0_02;
        this.b = n3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ov0_0 ov0_02 = this.a;
        int n3 = this.b;
        object = new kv0_2(ov0_02, n3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (kv0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((kv0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        kv0_2 kv0_22 = this;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = this.a;
        Object object3 = (am2_2)((ov0_0)object2).c.getValue();
        boolean bl2 = object3 instanceof aM2$d;
        if (bl2) {
            object3 = (aM2$d)object3;
            Object object4 = ((aM2$d)object3).a;
            if (object4 != null) {
                int n3;
                Object t3;
                int n4;
                object4 = ((ResultModel)object4).getRecommendedStyles();
                int n7 = yx_2.o((Iterable)object4, 10);
                ArrayList<Object> arrayList = new ArrayList<Object>(n7);
                object4 = object4.iterator();
                n7 = 0;
                ResultModel resultModel = null;
                while ((n4 = object4.hasNext()) != 0) {
                    t3 = object4.next();
                    n3 = n7 + 1;
                    if (n7 >= 0) {
                        Object object5 = t3;
                        object5 = (ApplicableStyle)t3;
                        n4 = kv0_22.b;
                        if (n7 == n4) {
                            n7 = (int)(((ApplicableStyle)object5).isSelected() ? 1 : 0);
                            boolean bl3 = n7 ^ 1;
                            int n8 = 15;
                            object5 = ApplicableStyle.copy$default((ApplicableStyle)object5, null, null, null, null, bl3, n8, null);
                        }
                        arrayList.add(object5);
                        n7 = n3;
                        continue;
                    }
                    xx_2.n();
                    throw null;
                }
                n3 = 0;
                resultModel = ((aM2$d)object3).a;
                n4 = 0;
                t3 = null;
                int n10 = 7;
                object3 = ResultModel.copy$default(resultModel, null, null, null, arrayList, n10, null);
                Intrinsics.checkNotNullParameter(object3, "data");
                object4 = new aM2$d((ResultModel)object3);
                object2 = ((ov0_0)object2).c;
                ((h83_0)object2).setValue(object4);
            }
        }
        return Unit.a;
    }
}

