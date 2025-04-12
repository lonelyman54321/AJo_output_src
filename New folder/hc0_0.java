/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExReturnAddressActivity;
import com.ril.ajio.services.data.returnexchange.dropatstore.DropAtStoreReturn;
import com.ril.ajio.services.data.returnexchange.dropatstore.StoreNode;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from hC0
 */
public final class hc0_0
implements F62 {
    public final /* synthetic */ jc0_1 a;

    public /* synthetic */ hc0_0(jc0_1 jc0_12) {
        this.a = jc0_12;
    }

    public final void onChanged(Object object) {
        int n3 = 0;
        Object object2 = null;
        int n4 = 1;
        object = (DataCallback)object;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        Intrinsics.checkNotNullParameter(object, "dropAtStoreListDataCallback");
        Object object4 = cp_1.Companion;
        int n7 = nn_2.b((cp$a)object4, (DataCallback)object);
        if (n7 != 0 && (object4 = ((jc0_1)object3).f) != null && (n7 = object4.isFinishing()) == 0) {
            Object[] objectArray;
            Object object5;
            object4 = ((jc0_1)object3).f;
            if (object4 != null && (object4 = ((ExReturnAddressActivity)object4).k0) != null) {
                ((AjioLoaderView)((Object)object4)).stopLoader();
            }
            if ((n7 = TextUtils.isEmpty((CharSequence)(object4 = ((jc0_1)object3).j))) == 0 && (object4 = ((jc0_1)object3).h) != null) {
                object5 = ((jc0_1)object3).j;
                Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type kotlin.String");
                Intrinsics.checkNotNullParameter(object5, "pinCode");
                objectArray = ((fc0_1)object4).c;
                if (objectArray != null) {
                    objectArray.setText((CharSequence)object5);
                }
                if ((objectArray = ((fc0_1)object4).c) != null) {
                    int n8 = ((String)object5).length();
                    objectArray.setSelection(n8);
                }
                if ((object4 = ((fc0_1)object4).c) != null) {
                    object4.clearFocus();
                }
            }
            n7 = ((DataCallback)object).getStatus();
            object5 = ((jc0_1)object3).l;
            if (n7 == 0) {
                Object object6;
                object = (DropAtStoreReturn)((DataCallback)object).getData();
                object4 = ((jc0_1)object3).g;
                objectArray = "Exchange / Return Address Screen";
                String string2 = "Store Returns";
                Iterator iterator = null;
                if (object != null && (object6 = ((DropAtStoreReturn)object).getStoreNodes()) != null) {
                    boolean bl2;
                    ((jc0_1)object3).k = false;
                    ((ArrayList)object4).clear();
                    object6 = new gc0_0(n4, null);
                    ((ArrayList)object4).add(object6);
                    iterator = ((DropAtStoreReturn)object).getStoreNodes().iterator();
                    object6 = "iterator(...)";
                    Intrinsics.checkNotNullExpressionValue(iterator, (String)object6);
                    while (bl2 = iterator.hasNext()) {
                        object6 = (StoreNode)iterator.next();
                        int n10 = 2;
                        gc0_0 gc0_02 = new gc0_0(n10, (StoreNode)object6);
                        ((ArrayList)object4).add(gc0_02);
                    }
                    if (object5 != null) {
                        object5.k1(n4 != 0);
                    }
                    if (n4 = ((jc0_1)object3).k) {
                        ((jc0_1)object3).k = false;
                        object2 = AnalyticsManager.Companion;
                        ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents().pushButtonTapEvent(string2, "Click on find  stores", (String)objectArray);
                        object2 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
                        String string3 = ((jc0_1)object3).j;
                        int n14 = ((DropAtStoreReturn)object).getStoreNodes().size();
                        object5 = " ";
                        object4 = new StringBuilder((String)object5);
                        ((StringBuilder)object4).append(string3);
                        string3 = " searched, ";
                        ((StringBuilder)object4).append(string3);
                        ((StringBuilder)object4).append(n14);
                        ((StringBuilder)object4).append(" results found");
                        object = ((StringBuilder)object4).toString();
                        ((GTMEvents)object2).pushButtonTapEvent(string2, object, (String)objectArray);
                    }
                    if ((object = ((jc0_1)object3).h) != null) {
                        ((RecyclerView$f)object).notifyDataSetChanged();
                    }
                } else {
                    boolean bl3 = ((jc0_1)object3).k;
                    if (bl3) {
                        ((jc0_1)object3).k = false;
                        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        object6 = ((jc0_1)object3).j;
                        String string4 = "No store found - ";
                        cP.b(string4, (String)object6, (GTMEvents)object, string2, (String)objectArray);
                    }
                    ((ArrayList)object4).clear();
                    if (object5 != null) {
                        object5.k1(false);
                    }
                    object = new gc0_0(n4, null);
                    ((ArrayList)object4).add(object);
                    n3 = 3;
                    object = new gc0_0(n3, null);
                    ((ArrayList)object4).add(object);
                    object = ((jc0_1)object3).h;
                    if (object != null) {
                        ((RecyclerView$f)object).notifyDataSetChanged();
                    }
                }
            } else {
                int n15 = ((DataCallback)object).getStatus();
                if (n15 == n4) {
                    object = StringCompanionObject.INSTANCE;
                    n15 = R$string.acc_error_message_page_load_fail;
                    object = hv3_0.K(n15);
                    n7 = R$string.addresses_not_able_to_fetch;
                    object4 = hv3_0.K(n7);
                    objectArray = new Object[n4];
                    objectArray[0] = object4;
                    object4 = "format(...)";
                    object = xh2_0.a(objectArray, n4, (String)object, (String)object4);
                    ExReturnAddressActivity exReturnAddressActivity = ((jc0_1)object3).f;
                    if (exReturnAddressActivity != null) {
                        int n16 = R$string.store_addresses_not_able_to_fetch;
                        object3 = hv3_0.K(n16);
                        exReturnAddressActivity.showNotification((String)object3, (String)object);
                    }
                    if (object5 != null) {
                        object5.k1(false);
                    }
                }
            }
        }
    }
}

