/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.ListAdapter
 */
import android.content.Context;
import android.widget.ListAdapter;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Home.LinkDetail;
import com.ril.ajio.services.data.Home.NavImpl;
import com.ril.ajio.services.data.Home.Navigation;
import com.ril.ajio.services.data.Home.NavigationParent;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from zZ1
 */
public final class zz1_1
implements Function1 {
    public final /* synthetic */ bz1_2 a;

    public /* synthetic */ zz1_1(bz1_2 bz1_22) {
        this.a = bz1_22;
    }

    public final Object invoke(Object object) {
        block13: {
            Object object2;
            block9: {
                Object object3;
                Object object4;
                int n3;
                Object object5;
                int n4;
                block10: {
                    block11: {
                        ArrayList arrayList;
                        block12: {
                            int n7;
                            n4 = 0;
                            object5 = null;
                            n3 = 1;
                            object = (DataCallback)object;
                            object2 = this.a;
                            Intrinsics.checkNotNullParameter(object2, "this$0");
                            object4 = cp_1.Companion;
                            int n8 = nn_2.b((cp$a)object4, (DataCallback)object);
                            if (n8 == 0) break block9;
                            ((bz1_2)object2).Wa();
                            Intrinsics.checkNotNull(object);
                            n8 = ((DataCallback)object).getStatus();
                            object3 = "format(...)";
                            if (n8 != 0) break block10;
                            object4 = ((DataCallback)object).getData();
                            if (object4 == null) break block11;
                            object = (NavigationParent)((DataCallback)object).getData();
                            arrayList = ((bz1_2)object2).S;
                            if (object == null) break block12;
                            object4 = ((NavigationParent)object).getChildDetails();
                            if (object4 == null) break block13;
                            object4 = ((NavigationParent)object).getChildDetails();
                            Intrinsics.checkNotNull(object4);
                            n8 = object4.size();
                            if (n8 == 0) break block13;
                            object = ((NavigationParent)object).getChildDetails();
                            Intrinsics.checkNotNull(object);
                            object = (Navigation)object.get(0);
                            if (object == null) break block13;
                            object = ((Navigation)object).getChildDetails();
                            ((bz1_2)object2).Ua();
                            object4 = z40_0.Companion;
                            object3 = ((Fragment)object2).requireActivity().getApplication();
                            String string2 = "getApplication(...)";
                            Intrinsics.checkNotNullExpressionValue(object3, string2);
                            object4.getClass();
                            object4 = z40$a.a((Context)object3).a;
                            object3 = "android_enable_appfeedback";
                            n8 = (int)(((ao0_0)object4).a((String)object3) ? 1 : 0);
                            if (n8 != 0) {
                                n7 = R$string.feedback;
                                object3 = hv3_0.K(n7);
                                int n10 = 123;
                                object4 = new v92_0(n10, (String)object3, false);
                                arrayList.add(object4);
                                object4 = ((bz1_2)object2).w0;
                                if (object4 != null) {
                                    Intrinsics.checkNotNull(object4);
                                    ((us1_2)object4).a = arrayList;
                                }
                            }
                            if (object != null && (n8 = (int)(object.isEmpty() ? 1 : 0)) == 0) {
                                object = object.iterator();
                                while ((n8 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                                    object4 = (Navigation)object.next();
                                    object3 = ((Navigation)object4).getLinkDetails();
                                    if (object3 == null) continue;
                                    object3 = ((Navigation)object4).getLinkDetails();
                                    Intrinsics.checkNotNull(object3);
                                    n7 = (int)(object3.isEmpty() ? 1 : 0);
                                    if (n7 != 0) continue;
                                    object3 = ((Navigation)object4).getLinkDetails();
                                    Intrinsics.checkNotNull(object3);
                                    if ((object3 = object3.get(0)) == null) continue;
                                    object3 = ((Navigation)object4).getLinkDetails();
                                    Intrinsics.checkNotNull(object3);
                                    if ((object3 = ((LinkDetail)object3.get(0)).getLinkName()) == null) continue;
                                    object3 = ((Navigation)object4).getLinkDetails();
                                    Intrinsics.checkNotNull(object3);
                                    string2 = "sign out";
                                    n7 = (int)(string2.equalsIgnoreCase((String)(object3 = ((LinkDetail)object3.get(0)).getLinkName())) ? 1 : 0);
                                    if (n7 != 0) continue;
                                    object4 = ((Navigation)object4).getLinkDetails();
                                    Intrinsics.checkNotNull(object4);
                                    object4 = (NavImpl)object4.get(0);
                                    arrayList.add(object4);
                                    object4 = ((bz1_2)object2).w0;
                                    if (object4 == null) continue;
                                    Intrinsics.checkNotNull(object4);
                                    ((us1_2)object4).a = arrayList;
                                }
                            }
                            object5 = ((bz1_2)object2).P;
                            n8 = R$layout.row_myaccount_list_refresh;
                            object = new ca2_1((Context)object5, n8, arrayList, (ms1_2)object2);
                            object5 = ((bz1_2)object2).G;
                            if (object5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("nonscroll_list_3");
                                n4 = 0;
                                object5 = null;
                            }
                            object5.setAdapter((ListAdapter)object);
                        }
                        if ((object = ((bz1_2)object2).w0) != null) {
                            Intrinsics.checkNotNull(object);
                            ((us1_2)object).a = arrayList;
                        }
                        break block13;
                    }
                    object = StringCompanionObject.INSTANCE;
                    int n14 = R$string.acc_error_message;
                    object = hv3_0.K(n14);
                    int n15 = R$string.something_wrong_msg;
                    object2 = hv3_0.K(n15);
                    object4 = new Object[n3];
                    object4[0] = object2;
                    object = xh2_0.a((Object[])object4, n3, (String)object, (String)object3);
                    n4 = R$string.something_wrong_msg;
                    object5 = hv3_0.K(n4);
                    mq0_2.b((String)object5, (String)object);
                    break block13;
                }
                int n16 = ((DataCallback)object).getStatus();
                if (n16 == n3) {
                    object = StringCompanionObject.INSTANCE;
                    n16 = R$string.acc_error_message;
                    object = hv3_0.K(n16);
                    int n17 = R$string.something_wrong_msg;
                    object2 = hv3_0.K(n17);
                    object4 = new Object[n3];
                    object4[0] = object2;
                    object = xh2_0.a((Object[])object4, n3, (String)object, (String)object3);
                    n4 = R$string.something_wrong_msg;
                    object5 = hv3_0.K(n4);
                    mq0_2.b((String)object5, (String)object);
                }
                break block13;
            }
            ((bz1_2)object2).Wa();
        }
        return Unit.a;
    }
}

