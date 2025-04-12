/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.CheckoutFragment;
import com.ril.ajio.payment.view.PaymentActivity;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.entity.Component;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;

/*
 * Renamed from CT
 */
public final class ct_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ ct_1(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final Object invoke(Object object) {
        int n3 = 0;
        Object object2 = null;
        Fragment fragment = this.b;
        Object object3 = "this$0";
        String string2 = null;
        int n4 = 1;
        int n7 = this.a;
        switch (n7) {
            default: {
                object = (Component)object;
                fragment = (NewProductDetailsFragment)fragment;
                Intrinsics.checkNotNullParameter(fragment, (String)object3);
                if (object != null && (object3 = ((NewProductDetailsFragment)fragment).w1) == null) {
                    int n8;
                    ((NewProductDetailsFragment)fragment).w1 = object;
                    object = ((NewProductDetailsFragment)fragment).L;
                    if (object != null) {
                        object = ((RecyclerView)object).getAdapter();
                    } else {
                        n8 = 0;
                        object = null;
                    }
                    boolean bl2 = object instanceof yh2_1;
                    if (bl2) {
                        object = (yh2_1)object;
                    } else {
                        n8 = 0;
                        object = null;
                    }
                    if (object != null) {
                        n3 = 27;
                        object2 = ((yh2_1)object).g(n3);
                    }
                    if (object2 != null) {
                        n8 = ((Number)object2).intValue();
                        object2 = ((NewProductDetailsFragment)fragment).L;
                        if (object2 != null && (object2 = object2.getAdapter()) != null) {
                            object2.notifyItemChanged(n8);
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        fragment = (CheckoutFragment)fragment;
        Intrinsics.checkNotNullParameter(fragment, (String)object3);
        object3 = cp_1.Companion;
        int n10 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n10 != 0) {
            n10 = ((DataCallback)object).getStatus();
            if (n10 == 0) {
                block32: {
                    object3 = ((CheckoutFragment)fragment).Qa();
                    object = ((DataCallback)object).getData();
                    object = JsonUtils.toJson(object);
                    if (object == null) break block32;
                    object3.getClass();
                    string2 = "\\\\u0026";
                    object2 = new Regex(string2);
                    string2 = "&";
                    object2 = object2.replace((CharSequence)object, string2);
                }
                try {
                    ((kj2_1)object3).D = object2;
                }
                catch (Exception exception) {
                    object2 = yn3_0.a;
                    object2.e(exception);
                }
                ((CheckoutFragment)fragment).Oa();
            } else {
                n3 = ((DataCallback)object).getStatus();
                if (n3 == n4) {
                    ((CheckoutFragment)fragment).h();
                    object2 = ((DataCallback)object).getError();
                    if (object2 != null && (object2 = object2.getErrors()) != null) {
                        n3 = object2.size();
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    object3 = "format(...)";
                    CharSequence charSequence = "";
                    if (n3 > 0) {
                        if ((object = ((DataCallback)object).getError()) != null && (object = ((DataError)object).getErrors()) != null) {
                            object = ((Iterable)object).iterator();
                            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                                object2 = (DataError$ErrorMessage)object.next();
                                charSequence = Ex0.a((String)charSequence);
                                object2 = object2.getMessage();
                                ((StringBuilder)charSequence).append((String)object2);
                                ((StringBuilder)charSequence).append(" ");
                                charSequence = ((StringBuilder)charSequence).toString();
                                object2 = fragment.getActivity();
                                if (object2 == null || (n3 = (int)(object2.isFinishing() ? 1 : 0)) != 0) continue;
                                object2 = StringCompanionObject.INSTANCE;
                                n3 = R$string.acc_error_message;
                                object2 = hv3_0.K(n3);
                                Object object4 = new Object[n4];
                                object4[0] = charSequence;
                                object2 = xh2_0.a((Object[])object4, n4, (String)object2, (String)object3);
                                object4 = (PaymentActivity)fragment.getActivity();
                                if (object4 == null) continue;
                                ((PaymentActivity)object4).showNotification((String)charSequence, (String)object2);
                            }
                        }
                    } else {
                        int n14;
                        object = fragment.getActivity();
                        if (object != null && (n14 = object.isFinishing()) == 0) {
                            n14 = TextUtils.isEmpty((CharSequence)charSequence);
                            if (n14 != 0) {
                                charSequence = "Oops something went wrong";
                            }
                            object = StringCompanionObject.INSTANCE;
                            n14 = R$string.acc_error_message_page_load_fail;
                            object = hv3_0.K(n14);
                            object2 = new Object[n4];
                            object2[0] = charSequence;
                            object = xh2_0.a(object2, n4, (String)object, (String)object3);
                            object2 = (PaymentActivity)fragment.getActivity();
                            if (object2 != null) {
                                object2.showNotification((String)charSequence, (String)object);
                            }
                        }
                    }
                }
            }
        }
        return Unit.a;
    }
}

