/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.dresstool.DressToolModel;
import com.ril.ajio.services.data.dresstool.Question;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jv0
 */
public final class jv0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ DressToolModel a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ov0_0 c;
    public final /* synthetic */ Question d;

    public jv0_2(DressToolModel dressToolModel, int n3, ov0_0 ov0_02, Question question, f80_0 f80_02) {
        this.a = dressToolModel;
        this.b = n3;
        this.c = ov0_02;
        this.d = question;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ov0_0 ov0_02 = this.c;
        Question question = this.d;
        DressToolModel dressToolModel = this.a;
        int n3 = this.b;
        object = new jv0_2(dressToolModel, n3, ov0_02, question, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (jv0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((jv0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        boolean bl2;
        int n3;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a.getQuestions();
        object2 = null;
        if (object != null && (object = (Question)object.get(n3 = this.b)) != null) {
            object = ((Question)object).getViewType();
        } else {
            bl2 = false;
            object = null;
        }
        Object object3 = "QUESTION";
        bl2 = Intrinsics.areEqual(object, object3);
        if (bl2) {
            object = this.d.getQuestion_type();
            object3 = this.c;
            object3.getClass();
            if (object != null) {
                String string2 = " selection halfcard screen";
                object2 = cP.a("dress tool ", (String)object, string2);
            }
            if (object2 == null) {
                object2 = "";
            }
            ((ov0_0)object3).e((String)object2);
        }
        return Unit.a;
    }
}

