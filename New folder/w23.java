/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class w23
implements F62 {
    public final /* synthetic */ B23 a;

    public /* synthetic */ w23(B23 b23) {
        this.a = b23;
    }

    public final void onChanged(Object object) {
        object = (DataCallback)object;
        Object object2 = B23.Companion;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object2.getClass();
        Object object3 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n3 != 0) {
            Intrinsics.checkNotNull(object);
            n3 = ((DataCallback)object).getStatus();
            int n4 = 1;
            if (n3 == 0) {
                qg3_2 qg3_22;
                boolean bl2;
                Object object4;
                int n7;
                object = ((B23)object2).c;
                n3 = 0;
                object3 = null;
                String string2 = "sharedWithMeViewModel";
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n7 = 0;
                    object = null;
                }
                if ((object4 = ((w23_0)object).p) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("saveForLaterProduct");
                    bl2 = false;
                    object4 = null;
                }
                n7 = ((w23_0)object).s;
                object = ((ArrayList)object4).get(n7);
                Intrinsics.checkNotNullExpressionValue(object, "get(...)");
                object = (Product)object;
                object4 = ((Product)object).getCode();
                Object object5 = ((B23)object2).c;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    object5 = null;
                }
                object5.getClass();
                int n8 = 3;
                if (object4 != null) {
                    object5 = md3_0.c((jD3)object5);
                    qg3_22 = new x23_0((String)object4, null);
                    Ae3.d((i90_0)object5, null, null, qg3_22, n8);
                }
                if ((object4 = ((Product)object).getPrice()) != null) {
                    object4 = ((Product)object).getPrice();
                    if (object4 != null) {
                        object4 = ((Price)object4).getValue();
                    } else {
                        bl2 = false;
                        object4 = null;
                    }
                    bl2 = TextUtils.isEmpty((CharSequence)object4);
                    if (!bl2) {
                        object4 = ((B23)object2).c;
                        if (object4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            bl2 = false;
                            object4 = null;
                        }
                        object5 = ((Product)object).getCode();
                        if ((object = ((Product)object).getPrice()) != null) {
                            object = ((Price)object).getValue();
                        } else {
                            n7 = 0;
                            object = null;
                        }
                        object4.getClass();
                        if (object5 != null && object != null) {
                            object4 = md3_0.c((jD3)object4);
                            qg3_22 = new s23_0((String)object5, (String)object, null);
                            Ae3.d((i90_0)object4, null, null, qg3_22, n8);
                        }
                    }
                }
                if ((object = ((B23)object2).c) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object3 = object;
                }
                ((w23_0)object3).t = n7 = ((w23_0)object3).t + n4;
                ((B23)object2).Pa();
            } else {
                int n10 = ((DataCallback)object).getStatus();
                if (n10 == n4) {
                    ((B23)object2).Pa();
                }
            }
        }
    }
}

