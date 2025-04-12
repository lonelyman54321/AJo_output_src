/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import com.google.android.material.textfield.TextInputLayout;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import com.ril.ajio.services.query.QueryCustomer;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from CA1
 */
public final class ca1_1
implements F62 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ ca1_1(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onChanged(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (List)object;
                Object object2 = (nn3)this.b;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                ln3 ln32 = ((nn3)object2).c;
                Object var5_7 = null;
                if (ln32 != null) {
                    Intrinsics.checkNotNullExpressionValue(object, "throwables");
                    String string2 = "data";
                    Intrinsics.checkNotNullParameter(object, string2);
                    ln32.b = object;
                    ln32.notifyDataSetChanged();
                    object2 = ((nn3)object2).b;
                    if (object2 != null) {
                        int n4 = (object = (Collection)object).isEmpty();
                        if (n4 != 0) {
                            n4 = 0;
                            object = null;
                        } else {
                            n4 = 8;
                        }
                        ((vU)object2).d.setVisibility(n4);
                        return;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("errorsBinding");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("errorsAdapter");
                throw null;
            }
            case 0: 
        }
        object = (DataCallback)object;
        Object object3 = (ga1_0)this.b;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        Object object4 = cp_1.Companion;
        int n7 = nn_2.b((cp$a)object4, (DataCallback)object);
        if (n7 != 0) {
            object4 = ((ga1_0)object3).i;
            if (object4 != null) {
                object4.stopLoader();
            }
            if (object != null && (n7 = ((DataCallback)object).getStatus()) == 0) {
                int n8;
                ((ga1_0)object3).n = object = (AccountCheckResponse)((DataCallback)object).getData();
                if (object != null && (n8 = ((AccountCheckResponse)object).isSuccess()) == (n7 = 1)) {
                    object = ((ga1_0)object3).n;
                    if (object != null && (n8 = (int)(((AccountCheckResponse)object).isSocialLogin() ? 1 : 0)) == n7) {
                        object = ((ga1_0)object3).i;
                        if (object != null) {
                            object.startLoader();
                        }
                        object = new QueryCustomer();
                        Object object5 = ((ga1_0)object3).k;
                        Intrinsics.checkNotNull(object5);
                        object5 = object5.getText();
                        if (object5 != null && (object5 = object5.toString()) != null) {
                            int n10 = ((String)object5).length() - n7;
                            int n14 = 0;
                            boolean bl2 = false;
                            while (n14 <= n10) {
                                int n15 = !bl2 ? n14 : n10;
                                n15 = ((String)object5).charAt(n15);
                                int n16 = 32;
                                n15 = Intrinsics.compare(n15, n16);
                                n15 = n15 <= 0 ? 1 : 0;
                                if (!bl2) {
                                    if (n15 == 0) {
                                        bl2 = true;
                                        continue;
                                    }
                                    ++n14;
                                    continue;
                                }
                                if (n15 == 0) break;
                                n10 += -1;
                            }
                            object5 = com.jio.jioads.adinterfaces.a.a(n10, n7, n14, (String)object5);
                        } else {
                            object5 = null;
                        }
                        ((QueryCustomer)object).setMobileNumber((String)object5);
                        ((QueryCustomer)object).setMobileNumberEnterered(n7 != 0);
                        object4 = ((ga1_0)object3).t;
                        if (object4 != null) {
                            object5 = "<set-?>";
                            Intrinsics.checkNotNullParameter(object, (String)object5);
                            ((oa1_1)object4).C = object;
                        }
                        if ((object3 = ((ga1_0)object3).t) != null) {
                            object4 = "social login - mobile screen";
                            ((oa1_1)object3).k((QueryCustomer)object, (String)object4);
                        }
                    } else {
                        object = ((ga1_0)object3).C;
                        if (object == null || (n8 = ((String)object).length()) == 0) {
                            n8 = R$string.mobile_number_linked;
                            ((ga1_0)object3).C = object = hv3_0.K(n8);
                        }
                        if ((object = ((ga1_0)object3).l) != null) {
                            object3 = ((ga1_0)object3).C;
                            ((TextInputLayout)((Object)object)).setError((CharSequence)object3);
                        }
                    }
                }
            }
        }
    }
}

