/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.ril.ajio.services.data.dresstool.DressToolModel;
import com.ril.ajio.services.data.dresstool.Question;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Lv0
 */
public final class lv0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ ov0_0 a;

    public lv0_2(ov0_0 ov0_02, f80_0 f80_02) {
        this.a = ov0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ov0_0 ov0_02 = this.a;
        object = new lv0_2(ov0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (lv0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((lv0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        ov0_0 ov0_02 = this.a;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = ov0_02.d;
        Object object2 = Boolean.TRUE;
        parcelableSnapshotMutableState.setValue(object2);
        parcelableSnapshotMutableState = ov0_02.b;
        object2 = (bv0_1)parcelableSnapshotMutableState.getValue();
        boolean bl2 = object2 instanceof Bv0$d;
        if (bl2) {
            object2 = (Bv0$d)object2;
            Object object3 = ((Bv0$d)object2).a;
            if (object3 != null) {
                int n3;
                Object object4;
                Object object5;
                ArrayList<DressToolModel> arrayList;
                if ((object3 = ((DressToolModel)object3).getQuestions()) != null) {
                    object3 = (Iterable)object3;
                    int n4 = yx_2.o((Iterable)object3, 10);
                    arrayList = new ArrayList<DressToolModel>(n4);
                    object3 = object3.iterator();
                    while ((n4 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                        object4 = object5 = object3.next();
                        object4 = (Question)object5;
                        n3 = 111;
                        object5 = Question.copy$default((Question)object4, null, null, null, null, null, null, null, n3, null);
                        arrayList.add((DressToolModel)object5);
                    }
                } else {
                    arrayList = null;
                }
                object5 = ((Bv0$d)object2).a;
                object4 = null;
                n3 = 191;
                object2 = DressToolModel.copy$default(object5, null, null, null, null, null, null, arrayList, null, n3, null);
                object3 = new Bv0$d((DressToolModel)object2);
                parcelableSnapshotMutableState.setValue(object3);
            }
        }
        object2 = "retake";
        ov0_02.d("dress tool style selection halfcard screen", (String)object2, (String)object2);
        return Unit.a;
    }
}

