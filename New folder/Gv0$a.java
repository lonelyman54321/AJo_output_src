/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.ril.ajio.services.data.dresstool.DressToolModel;
import com.ril.ajio.services.data.dresstool.Question;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

public final class Gv0$a
implements fs0_2 {
    public final /* synthetic */ ov0_0 a;

    public Gv0$a(ov0_0 ov0_02) {
        this.a = ov0_02;
    }

    public final Object emit(Object object, f80_0 f80_02) {
        Object object2;
        block16: {
            block14: {
                ArrayList<Object> arrayList;
                String string2;
                int n3;
                String string3;
                String string4;
                int n4;
                int n7;
                Object object3;
                Object object4;
                Object object5;
                Object object6;
                Object object7;
                boolean bl2;
                block15: {
                    block13: {
                        object2 = object;
                        object2 = (kk2_1)object;
                        bl2 = object2 instanceof KK2$a;
                        object7 = "";
                        object6 = this.a;
                        if (!bl2) break block13;
                        ParcelableSnapshotMutableState parcelableSnapshotMutableState = ((ov0_0)object6).b;
                        object2 = ((KK2$a)object2).b;
                        if (object2 != null) {
                            object7 = object2;
                        }
                        object6 = new Bv0$a((String)object7);
                        parcelableSnapshotMutableState.setValue(object6);
                        break block14;
                    }
                    bl2 = object2 instanceof KK2$b;
                    if (!bl2) break block15;
                    object2 = ((ov0_0)object6).b;
                    Bv0$b bv0$b = Bv0$b.a;
                    ((h83_0)object2).setValue(bv0$b);
                    break block14;
                }
                bl2 = object2 instanceof KK2$c;
                if (!bl2) break block16;
                object2 = (KK2$c)object2;
                Object object8 = (DressToolModel)((kk2_1)object2).a;
                if (object8 != null && (object8 = ((DressToolModel)object8).getQuestions()) != null) {
                    boolean bl3;
                    object8 = (Iterable)object8;
                    object5 = new ArrayList();
                    object8 = object8.iterator();
                    while (bl3 = object8.hasNext()) {
                        object3 = object4 = object8.next();
                        object3 = (Question)object4;
                        if ((object4 = (Collection)((Question)object3).getStyles()) != null && !(bl3 = object4.isEmpty())) {
                            n7 = 95;
                            n4 = 0;
                            string4 = null;
                            string3 = null;
                            n3 = 0;
                            string2 = "QUESTION";
                            arrayList = null;
                            object4 = Question.copy$default((Question)object3, null, null, null, null, null, string2, null, n7, null);
                        } else {
                            bl3 = false;
                            object4 = null;
                        }
                        if (object4 == null) continue;
                        ((ArrayList)object5).add(object4);
                    }
                    arrayList = object5;
                } else {
                    arrayList = null;
                }
                if (arrayList != null && !(bl2 = arrayList.isEmpty())) {
                    bl2 = ((ov0_0)object6).f;
                    if (bl2) {
                        object8 = h40_0.a;
                        object8 = h40_0.t();
                        object5 = object8.optString("title");
                        object4 = object8.optString("subTitle");
                        string3 = object8.optString("imgUrl");
                        n3 = 28;
                        string2 = null;
                        object3 = null;
                        string4 = "BANNER";
                        object8 = new Question((String)object5, (String)object4, null, null, null, string4, string3, n3, null);
                        object7 = null;
                        arrayList.set(0, object8);
                    }
                    object2 = (DressToolModel)((kk2_1)object2).a;
                    object5 = ((DressToolModel)object2).getResult_finding_title();
                    object4 = ((DressToolModel)object2).getResult_found_title();
                    object8 = new Question((String)object5, (String)object4, null, null, null, "RESULT_FINDING", null, 92, null);
                    arrayList.add(object8);
                    n4 = 191;
                    string4 = null;
                    string3 = null;
                    n3 = 0;
                    string2 = null;
                    n7 = 0;
                    object3 = object2;
                    object2 = DressToolModel.copy$default((DressToolModel)object2, null, null, null, null, null, null, arrayList, null, n4, null);
                    object8 = new Bv0$d((DressToolModel)object2);
                    object2 = ((ov0_0)object6).b;
                    ((h83_0)object2).setValue(object8);
                } else {
                    object8 = ((ov0_0)object6).b;
                    object2 = ((kk2_1)object2).b;
                    if (object2 != null) {
                        object7 = object2;
                    }
                    object6 = new Bv0$a((String)object7);
                    ((h83_0)object8).setValue(object6);
                }
            }
            return Unit.a;
        }
        object2 = new NoWhenBranchMatchedException();
        throw object2;
    }
}

