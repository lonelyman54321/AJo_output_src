/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from E8
 */
public final class e8_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e8_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = this.b;
        Object object3 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object4 = object;
                object4 = (Throwable)object;
                object2 = (op2_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object = ((op2_2)object2).l;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object4);
                object2 = apiErrorRepo.handleApiException((Throwable)object4, "PAYMENT_PayNowByCard", true, "single page checkout", "Forward");
                ((LiveData)object).k(object2);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        Object object5 = q9_0.Companion;
        object2 = (q9_0)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = cp_1.Companion;
        boolean bl2 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (bl2) {
            object3 = oo_0.Companion;
            object3.getClass();
            bl2 = Oo$a.a();
            if (bl2) {
                object3 = ((q9_0)object2).X;
                object5 = "ajiohomeViewModel";
                Object object6 = null;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    bl2 = false;
                    object3 = null;
                }
                if ((bl2 = ((x9_0)object3).t) && !(bl2 = qo_0.b) && (object = (Integer)((DataCallback)object).getData()) != null) {
                    int n4 = ((Number)object).intValue();
                    object3 = "commonCmsViewDelegate";
                    if (n4 != 0) {
                        x9_0 x9_02 = ((q9_0)object2).X;
                        if (x9_02 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                            x9_02 = null;
                        }
                        if ((n3 = (int)(w61_0.b((String)(object5 = x9_02.r)) ? 1 : 0)) != 0) {
                            object2 = ((q9_0)object2).Z;
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                            } else {
                                object6 = object2;
                            }
                            object2 = ((e00)object6).v;
                            if (object2 != null) {
                                ((E61)object2).w = n4;
                            }
                            if (object2 != null) {
                                ((RecyclerView$f)object2).notifyDataSetChanged();
                            }
                        }
                    } else {
                        object = ((q9_0)object2).X;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                            n4 = 0;
                            object = null;
                        }
                        if ((n4 = (int)(w61_0.b((String)(object = ((x9_0)object).r)) ? 1 : 0)) != 0) {
                            object = ((q9_0)object2).Z;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                            } else {
                                object6 = object;
                            }
                            ((e00)object6).l();
                        }
                    }
                }
            }
        }
        return Unit.a;
    }
}

