/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.dresstool.DressToolModel;
import com.ril.ajio.services.data.dresstool.Question;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Iv0
 */
public final class iv0_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ ov0_0 a;

    public iv0_1(ov0_0 ov0_02, f80_0 f80_02) {
        this.a = ov0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ov0_0 ov0_02 = this.a;
        object = new iv0_1(ov0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (iv0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((iv0_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        Object object2 = this.a;
        object2.getClass();
        Object object3 = md3_0.c((jD3)object2);
        Object object4 = ir0_2.a;
        object4 = em0_2.b;
        int n3 = 2;
        Serializable serializable = new qg3_2(n3, null);
        Ae3.d((i90_0)object3, (CoroutineContext)object4, null, (Function2)((Object)serializable), n3);
        object3 = Boolean.TRUE;
        object4 = ((ov0_0)object2).d;
        ((h83_0)object4).setValue(object3);
        object2 = ((ov0_0)object2).b;
        object3 = (bv0_1)((h83_0)object2).getValue();
        boolean bl2 = object3 instanceof Bv0$d;
        if (bl2) {
            object3 = (Bv0$d)object3;
            object4 = ((Bv0$d)object3).a;
            if (object4 != null) {
                Serializable serializable2;
                String string2;
                Object object5;
                if ((object4 = ((DressToolModel)object4).getQuestions()) != null) {
                    object4 = (Iterable)object4;
                    serializable = new ArrayList();
                    object4 = object4.iterator();
                    while ((n3 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                        Question question = (Question)object4.next();
                        object5 = question.getViewType();
                        boolean bl3 = Intrinsics.areEqual(object5, string2 = "BANNER") ^ true;
                        if (!bl3) {
                            n3 = 0;
                            question = null;
                        }
                        if (question == null) continue;
                        ((ArrayList)serializable).add(question);
                    }
                    serializable2 = serializable;
                } else {
                    serializable2 = null;
                }
                object5 = ((Bv0$d)object3).a;
                string2 = null;
                int n4 = 191;
                object3 = DressToolModel.copy$default((DressToolModel)object5, null, null, null, null, null, null, (List)((Object)serializable2), null, n4, null);
                object4 = new Bv0$d((DressToolModel)object3);
                ((h83_0)object2).setValue(object4);
            }
        }
        return Unit.a;
    }
}

