/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.dresstool.DressToolModel;
import com.ril.ajio.services.data.dresstool.Question;
import com.ril.ajio.services.data.dresstool.Style;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from ov0
 */
public final class ov0_1
extends qg3_2
implements Function2 {
    public int a;
    public int b;
    public final /* synthetic */ Cl2 c;
    public final /* synthetic */ ov0_0 d;
    public final /* synthetic */ DressToolModel e;

    public ov0_1(hm0_0 hm0_02, ov0_0 ov0_02, DressToolModel dressToolModel, f80_0 f80_02) {
        this.c = hm0_02;
        this.d = ov0_02;
        this.e = dressToolModel;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        hm0_0 hm0_02 = (hm0_0)this.c;
        ov0_0 ov0_02 = this.d;
        DressToolModel dressToolModel = this.e;
        object = new ov0_1(hm0_02, ov0_02, dressToolModel, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ov0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ov0_1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Integer n3;
        Object object2;
        Object object3;
        int n4;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n7 = this.b;
        int n8 = 1;
        if (n7 != 0) {
            if (n7 != n8) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            n4 = this.a;
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = this.c;
            n7 = ((Cl2)object).j();
            int n10 = n7 + 1;
            this.a = n7;
            this.b = n8;
            object = Cl2.t((hm0_0)object, n10, this);
            if (object == j90_02) {
                return j90_02;
            }
            n4 = n7;
        }
        object = this.e;
        Object object4 = ((DressToolModel)object).getQuestions();
        n8 = 0;
        String string2 = null;
        if (object4 != null && (object4 = (Question)CollectionsKt.N(n4, (List)object4)) != null) {
            object4 = ((Question)object4).getQuestion_type();
        } else {
            n7 = 0;
            object4 = null;
        }
        ov0_0 ov0_02 = this.d;
        ov0_02.getClass();
        if (object4 != null) {
            object3 = "dress tool ";
            object2 = " selection halfcard screen";
            object4 = cP.a((String)object3, (String)object4, (String)object2);
        } else {
            n7 = 0;
            object4 = null;
        }
        object3 = "";
        if (object4 == null) {
            object4 = object3;
        }
        if ((object2 = ((DressToolModel)object).getQuestions()) != null && (object2 = (Question)CollectionsKt.N(n4, (List)object2)) != null && (n3 = ((Question)object2).getSelectedStyleIndex()) != null) {
            int n14 = n3;
            if ((object2 = (object2 = ((Question)object2).getStyles()) != null && (object2 = (Style)CollectionsKt.N(n14, (List)object2)) != null ? ((Style)object2).getStyle_name() : null) != null) {
                object3 = object2;
            }
        }
        if ((object = ((DressToolModel)object).getQuestions()) != null && (object = (Question)CollectionsKt.N(n4, (List)object)) != null) {
            string2 = ((Question)object).getQuestion_type();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(" selected");
        object = ((StringBuilder)object).toString();
        ov0_02.d((String)object4, (String)object3, (String)object);
        return Unit.a;
    }
}

