/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.dresstool.ApplicableStyle;
import com.ril.ajio.services.data.dresstool.DressToolModel;
import com.ril.ajio.services.data.dresstool.Question;
import com.ril.ajio.services.data.dresstool.ResultModel;
import com.ril.ajio.services.data.dresstool.Style;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Hv0
 */
public final class hv0_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ ov0_0 a;

    public hv0_1(ov0_0 ov0_02, f80_0 f80_02) {
        this.a = ov0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ov0_0 ov0_02 = this.a;
        object = new hv0_1(ov0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (hv0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((hv0_1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        int n3;
        Object object2;
        int n4;
        ArrayList<Object> arrayList;
        Object object3;
        Object object4;
        int n7;
        Object object5;
        block17: {
            block16: {
                block14: {
                    block15: {
                        object5 = j90_0.COROUTINE_SUSPENDED;
                        vl2_2.b(object);
                        object = this.a;
                        object5 = (bv0_1)((ov0_0)object).b.getValue();
                        n7 = object5 instanceof Bv0$d;
                        if (n7 == 0) break block14;
                        object5 = (Bv0$d)object5;
                        object4 = ((Bv0$d)object5).a;
                        if (object4 == null) break block14;
                        object4 = ((DressToolModel)object4).getQuestions();
                        object3 = null;
                        if (object4 == null) break block15;
                        object4 = (Iterable)object4;
                        arrayList = new ArrayList<Object>();
                        object4 = object4.iterator();
                        break block16;
                    }
                    arrayList = mz0_2.a;
                    break block17;
                }
                ov0_0.b((ov0_0)object);
                return Unit.a;
            }
            while ((n4 = object4.hasNext()) != 0) {
                object2 = (Question)object4.next();
                Integer n8 = ((Question)object2).getSelectedStyleIndex();
                if (n8 != null && (object2 = ((Question)object2).getStyles()) != null && (object2 = (Style)CollectionsKt.N(n3 = n8.intValue(), (List)object2)) != null) {
                    object2 = ((Style)object2).getApplicable_styles();
                } else {
                    n4 = 0;
                    object2 = null;
                }
                if (object2 == null) continue;
                arrayList.add(object2);
            }
        }
        if ((object4 = ((DressToolModel)(object5 = ((Bv0$d)object5).a)).getApplicable_styles_mapping()) != null && (n4 = object4.isEmpty()) == 0 && (n4 = arrayList.size()) > (n3 = 1)) {
            int n10;
            Object object6;
            int n14;
            n4 = (int)((arrayList = ((Iterable)arrayList).iterator()).hasNext() ? 1 : 0);
            if (n4 == 0) {
                object = new UnsupportedOperationException("Empty collection can't be reduced.");
                throw object;
            }
            object2 = arrayList.next();
            while ((n14 = arrayList.hasNext()) != 0) {
                object6 = (List)arrayList.next();
                object2 = (List)object2;
                object6 = CollectionsKt.o0((Iterable)object6);
                object2 = CollectionsKt.k0(CollectionsKt.P(object2, (Iterable)object6));
            }
            object2 = (List)object2;
            arrayList = new ArrayList<Object>();
            object2 = object2.iterator();
            while ((n14 = object2.hasNext()) != 0) {
                object6 = (String)object2.next();
                if ((object6 = (ApplicableStyle)object4.get(object6)) == null) continue;
                arrayList.add(object6);
            }
            n7 = arrayList.isEmpty() ^ n3;
            if (n7 == 0) {
                ov0_0.b((ov0_0)object);
                return Unit.a;
            }
            object4 = ((DressToolModel)object5).getResult_found_title();
            if (object4 == null) {
                object4 = "";
            }
            object2 = ((DressToolModel)object5).getResult_retake_cta_text();
            n14 = 0;
            object6 = null;
            n10 = object2 != null && (n10 = ((String)object2).length()) != 0 ? 0 : 1;
            if ((n10 ^= n3) == 0) {
                n4 = 0;
                object2 = null;
            }
            if (object2 == null) {
                n4 = R$string.retake;
                object2 = hv3_0.K(n4);
            }
            if ((object5 = ((DressToolModel)object5).getResult_find_matching_cta_text()) == null || (n10 = ((String)object5).length()) == 0) {
                n14 = 1;
            }
            if ((n3 ^= n14) != 0) {
                object3 = object5;
            }
            if (object3 == null) {
                int n15 = R$string.find_matching_bras;
                object3 = hv3_0.K(n15);
            }
            object5 = new ResultModel((String)object4, (String)object2, (String)object3, arrayList);
            object4 = new aM2$d((ResultModel)object5);
            object = ((ov0_0)object).c;
            ((h83_0)object).setValue(object4);
            return Unit.a;
        }
        ov0_0.b((ov0_0)object);
        return Unit.a;
    }
}

