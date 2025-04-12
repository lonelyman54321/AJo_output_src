/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kV2
 */
public final class kv2_2
implements Function1 {
    public final /* synthetic */ vv2_2 a;

    public /* synthetic */ kv2_2(vv2_2 vv2_22) {
        this.a = vv2_22;
    }

    public final Object invoke(Object object) {
        int n3;
        Object object2;
        object = (String)object;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        Object object4 = yn3_0.a;
        Object object5 = kp1_0.c("debounced ", (String)object);
        uw2_1 uw2_12 = null;
        Object[] objectArray = new Object[]{};
        ((yn3$a)object4).a((String)object5, objectArray);
        object4 = z40_0.Companion;
        object4 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object4).a;
        object5 = "clearBtnEnabled";
        boolean n4 = ((ao0_0)object4).a((String)object5);
        int n7 = 8;
        if (n4 && (object4 = ((vv2_2)object3).T) != null) {
            object2 = ((vv2_2)object3).U;
            n3 = ((String)object2).length();
            if (n3 == 0) {
                n3 = 8;
            } else {
                n3 = 0;
                object2 = null;
            }
            object4.setVisibility(n3);
        }
        if ((object4 = ((vv2_2)object3).R) != null) {
            object2 = ((vv2_2)object3).U;
            n3 = ((String)object2).length();
            if (n3 == 0) {
                n3 = 8;
            } else {
                n3 = 0;
                object2 = null;
            }
            object4.setVisibility(n3);
        }
        object4 = ((vv2_2)object3).U;
        int n8 = ((String)object4).length();
        object2 = ((vv2_2)object3).C0;
        Object object6 = (Number)((hh3_2)object2).getValue();
        int n10 = ((Number)object6).intValue();
        String string2 = "searchHistoryLayout";
        String string3 = "searchList";
        if (n8 < n10) {
            object4 = ((vv2_2)object3).t0;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchSuggestionAdapter");
                boolean bl2 = false;
                object4 = null;
            }
            ((lv2_0)object4).b.clear();
            ((vv2_2)object3).s0.clear();
            object4 = ((vv2_2)object3).A;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                boolean bl3 = false;
                object4 = null;
            }
            object4.setVisibility(n7);
            object4 = ((vv2_2)object3).x;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl4 = false;
                object4 = null;
            }
            object4.setVisibility(0);
        } else {
            ((vv2_2)object3).i = false;
            object4 = ((vv2_2)object3).A;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                boolean bl5 = false;
                object4 = null;
            }
            object4.setVisibility(0);
            object4 = ((vv2_2)object3).x;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl6 = false;
                object4 = null;
            }
            object4.setVisibility(n7);
        }
        object4 = ((vv2_2)object3).U;
        int n14 = ((String)object4).length();
        object6 = "searchImage";
        if (n14 == 0) {
            object4 = ((vv2_2)object3).N;
            if (object4 != null) {
                object4.setVisibility(0);
            }
            if ((object4 = ((vv2_2)object3).S) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                boolean bl7 = false;
                object4 = null;
            }
            object4.setVisibility(n7);
        } else {
            boolean bl8;
            boolean bl9;
            boolean bl10;
            object4 = ((vv2_2)object3).N;
            if (object4 != null) {
                object4.setVisibility(n7);
            }
            if (bl10 = ((ao0_0)(object4 = z40$a.a((Context)AJIOApplication$a.a()).a)).a(string2 = "searchBtnEnabled")) {
                object4 = ((vv2_2)object3).S;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    boolean bl11 = false;
                    object4 = null;
                }
                object4.setVisibility(0);
            }
            if (!(bl9 = ((ao0_0)(object4 = z40$a.a((Context)AJIOApplication$a.a()).a)).a(string2)) && !(bl8 = ((ao0_0)(object4 = z40$a.a((Context)AJIOApplication$a.a()).a)).a((String)object5))) {
                object4 = ((vv2_2)object3).S;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    boolean bl12 = false;
                    object4 = null;
                }
                object4.setVisibility(0);
                object4 = ((vv2_2)object3).T;
                if (object4 != null) {
                    object4.setVisibility(n7);
                }
            }
        }
        int n15 = ((String)object).length();
        object4 = (Number)((hh3_2)object2).getValue();
        int n16 = ((Number)object4).intValue();
        if (n15 >= n16) {
            object = ((vv2_2)object3).t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchViewModel");
                n15 = 0;
                object = null;
            }
            object3 = ((vv2_2)object3).U;
            object.getClass();
            object4 = md3_0.c((jD3)object);
            object5 = C90$a.a;
            uw2_12 = new a((CoroutineContext$a)object5);
            boolean bl13 = true;
            object5 = new vw2_1(null, (yw2_0)object, (String)object3, bl13);
            n15 = 2;
            Ae3.d((i90_0)object4, uw2_12, null, (Function2)object5, n15);
        }
        return Unit.a;
    }
}

