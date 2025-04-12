/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.data.repo.ApiErrorRepo;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wS
 */
public final class ws_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ws_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (String)object;
                Object object2 = "this$0";
                s12 s122 = (s12)this.b;
                Intrinsics.checkNotNullParameter(s122, (String)object2);
                if (object == null || (n3 = ((String)object).length()) == 0) {
                    Intrinsics.checkNotNull(object);
                    object2 = s122.Ta();
                    if (object2 != null && (object2 = ((F12)object2).d) != null && (object2 = ((bv2_0)object2).i0) != null) {
                        object2 = (Integer)((HashMap)object2).get(object);
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    if (object2 != null) {
                        Object object3 = s122.Ta();
                        if (object3 != null && (object3 = ((F12)object3).d) != null && (object3 = ((bv2_0)object3).i0) != null) {
                            n3 = (Integer)object2 + -1;
                            object2 = n3;
                            object = (Integer)((HashMap)object3).put(object, object2);
                        }
                    } else {
                        object2 = s122.Ta();
                        if (object2 != null && (object2 = ((F12)object2).d) != null && (object2 = ((bv2_0)object2).i0) != null) {
                            Integer n4 = 0;
                            object = ((HashMap)object2).put(object, n4);
                        }
                    }
                    if ((object = s122.h) != null && (object = ((RecyclerView)object).getAdapter()) != null) {
                        ((RecyclerView$f)object).notifyDataSetChanged();
                    }
                    s122.cb();
                }
                return Unit.a;
            }
            case 1: {
                object = (UY2)object;
                yz_0 yz_02 = (yz_0)this.b;
                Intrinsics.checkNotNullParameter(yz_02, "$item");
                Intrinsics.checkNotNullParameter(object, "$this$semantics");
                String string2 = yz_02.a;
                RY2.e((UY2)object, string2);
                return Unit.a;
            }
            case 0: 
        }
        Object object4 = object;
        object4 = (Throwable)object;
        Object object5 = (ps_0)this.b;
        Intrinsics.checkNotNullParameter(object5, "this$0");
        object = ((ps_0)object5).c;
        object5 = ApiErrorRepo.INSTANCE;
        Intrinsics.checkNotNull(object4);
        object5 = ApiErrorRepo.handleApiException$default((ApiErrorRepo)object5, (Throwable)object4, "PETokenRequest", false, null, null, 28, null);
        ((LiveData)object).k(object5);
        return Unit.a;
    }
}

