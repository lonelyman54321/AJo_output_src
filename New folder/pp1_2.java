/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.EditText
 */
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.d;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.ratings.RatingsResponse;
import java.lang.constant.Constable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from pP1
 */
public final class pp1_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ pp1_2(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final Object invoke(Object object) {
        int n3;
        int n4 = this.a;
        switch (n4) {
            default: {
                int n7;
                int n8;
                object = (Integer)object;
                Object object2 = (NewProductDetailsFragment)this.b;
                Object object3 = "this$0";
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                if (object != null && (n8 = ((Number)object).intValue()) != (n7 = -1)) {
                    Constable constable;
                    object3 = ((NewProductDetailsFragment)object2).cb().q;
                    if (object3 != null && (object3 = ((Product)object3).getRatingsResponse()) != null) {
                        constable = n8;
                        ((RatingsResponse)object3).setReviewIdChanged((Integer)constable);
                    }
                    if ((object3 = ((NewProductDetailsFragment)object2).cb().q) != null && (object3 = ((Product)object3).getRatingsResponse()) != null) {
                        constable = Boolean.TRUE;
                        ((RatingsResponse)object3).setFromLoginFlow((Boolean)constable);
                    }
                    if ((object3 = ((NewProductDetailsFragment)object2).L) != null && (object3 = ((RecyclerView)object3).getAdapter()) != null) {
                        ((RecyclerView$f)object3).notifyDataSetChanged();
                    }
                    object2 = (yh0_0)((NewProductDetailsFragment)object2).v1.getValue();
                    object = n8;
                    ((yh0_0)object2).f((Integer)object);
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        d d2 = (d)this.b;
        Intrinsics.checkNotNullParameter(d2, "this$0");
        Object object4 = d2.h;
        Object object5 = null;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressView");
            n3 = 0;
            object4 = null;
        }
        ((PEProgressView)((Object)object4)).dismiss();
        n3 = ((DataCallback)object).getStatus();
        if (n3 == 0 && (object = (LpStoredCardBalance)((DataCallback)object).getData()) != null) {
            object4 = ((LpStoredCardBalance)object).getError();
            int n10 = 1;
            int n14 = 32;
            String string2 = "mobileNumberEt";
            if (object4 != null) {
                String string3 = ((Error)object4).getCode();
                object4 = ((Error)object4).getDescription();
                String string4 = "ERR.LOY.704";
                int n15 = string4.equalsIgnoreCase(string3);
                if (n15 == 0 && (object4 == null || (n15 = StringsKt.F((CharSequence)object4, string3 = "mobile number is not registered", false)) == 0)) {
                    object4 = d2.q;
                    if (object4 != null) {
                        string3 = d2.d;
                        if (string3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                        } else {
                            object5 = string3;
                        }
                        object5 = object5.getText().toString();
                        int n16 = ((String)object5).length() - n10;
                        n15 = 0;
                        string3 = null;
                        boolean bl2 = false;
                        string4 = null;
                        while (n15 <= n16) {
                            int n17 = !bl2 ? n15 : n16;
                            n17 = Intrinsics.compare(((String)object5).charAt(n17), n14);
                            n17 = n17 <= 0 ? 1 : 0;
                            if (!bl2) {
                                if (n17 == 0) {
                                    bl2 = true;
                                    continue;
                                }
                                ++n15;
                                continue;
                            }
                            if (n17 == 0) break;
                            n16 += -1;
                        }
                        object5 = com.jio.jioads.adinterfaces.a.a(n16, n10, n15, (String)object5);
                        object4.Z0((LpStoredCardBalance)object, (String)object5);
                        d2.dismiss();
                    }
                } else {
                    d2.Ta((String)object4);
                }
            } else {
                object4 = d2.q;
                if (object4 != null) {
                    EditText editText = d2.d;
                    if (editText == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object5 = editText;
                    }
                    object5 = object5.getText().toString();
                    int n18 = ((String)object5).length() - n10;
                    int n19 = 0;
                    editText = null;
                    boolean bl3 = false;
                    Object var12_18 = null;
                    while (n19 <= n18) {
                        int n20 = !bl3 ? n19 : n18;
                        n20 = Intrinsics.compare(((String)object5).charAt(n20), n14);
                        n20 = n20 <= 0 ? 1 : 0;
                        if (!bl3) {
                            if (n20 == 0) {
                                bl3 = true;
                                continue;
                            }
                            ++n19;
                            continue;
                        }
                        if (n20 == 0) break;
                        n18 += -1;
                    }
                    object5 = com.jio.jioads.adinterfaces.a.a(n18, n10, n19, (String)object5);
                    object4.Z0((LpStoredCardBalance)object, (String)object5);
                }
                d2.dismiss();
            }
        }
        return Unit.a;
    }
}

