/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.dresstool.DressToolModel;
import com.ril.ajio.services.data.dresstool.Question;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Jv0
 */
public final class jv0_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ ov0_0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Integer c;

    public jv0_1(ov0_0 ov0_02, int n3, Integer n4, f80_0 f80_02) {
        this.a = ov0_02;
        this.b = n3;
        this.c = n4;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        int n3 = this.b;
        Integer n4 = this.c;
        ov0_0 ov0_02 = this.a;
        object = new jv0_1(ov0_02, n3, n4, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (jv0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((jv0_1)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        jv0_1 jv0_12 = this;
        Object object3 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object3 = this.a;
        Object object4 = (bv0_1)((ov0_0)object3).b.getValue();
        boolean bl2 = object4 instanceof Bv0$d;
        object3 = ((ov0_0)object3).b;
        if (bl2) {
            object4 = (Bv0$d)object4;
            object2 = ((Bv0$d)object4).a;
            if (object2 != null) {
                ArrayList<void> arrayList;
                Integer n3;
                DressToolModel dressToolModel;
                if ((object2 = ((DressToolModel)object2).getQuestions()) != null) {
                    int n4;
                    object2 = (Iterable)object2;
                    int n7 = yx_2.o((Iterable)object2, 10);
                    ArrayList<void> arrayList2 = new ArrayList<void>(n7);
                    object2 = object2.iterator();
                    n7 = 0;
                    while ((n4 = object2.hasNext()) != 0) {
                        void var12_12;
                        Object t3 = object2.next();
                        int n8 = n7 + 1;
                        if (n7 < 0) {
                            xx_2.n();
                            throw null;
                        }
                        Object t4 = t3;
                        Question question = (Question)t3;
                        n4 = jv0_12.b;
                        if (n7 == n4) {
                            dressToolModel = null;
                            n3 = jv0_12.c;
                            int n10 = 111;
                            Question question2 = Question.copy$default(question, null, null, null, null, n3, null, null, n10, null);
                        }
                        arrayList2.add(var12_12);
                        n7 = n8;
                    }
                    arrayList = arrayList2;
                } else {
                    boolean bl3 = false;
                    arrayList = null;
                }
                dressToolModel = ((Bv0$d)object4).a;
                n3 = null;
                int n14 = 191;
                object4 = DressToolModel.copy$default(dressToolModel, null, null, null, null, null, null, arrayList, null, n14, null);
                object2 = new Bv0$d((DressToolModel)object4);
                ((h83_0)object3).setValue(object2);
                return Unit.a;
            }
        }
        object2 = "";
        object4 = new Bv0$a((String)object2);
        ((h83_0)object3).setValue(object4);
        return Unit.a;
    }
}

