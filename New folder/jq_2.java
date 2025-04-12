/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  android.view.View
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.payment.activity.OrderConfirmationActivity;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from jQ
 */
public final class jq_2
extends zj0_0 {
    public jq_2(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super(activity);
    }

    public final void b(Fragment object, int n3, String string2, int n4, String object2, boolean bl2, String object3) {
        block18: {
            Object object4;
            block17: {
                Fragment fragment;
                int n7;
                Bundle bundle;
                Activity activity;
                block19: {
                    block20: {
                        int n8;
                        boolean bl3;
                        int n10;
                        Intrinsics.checkNotNullParameter(object3, "originalUrl");
                        object4 = this.a;
                        boolean bl4 = object4 instanceof AjioHomeActivity;
                        if (!bl4) break block17;
                        object3 = "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity";
                        Intrinsics.checkNotNull(object4, (String)object3);
                        activity = object4;
                        activity = (AjioHomeActivity)object4;
                        bl2 = activity.V2(string2, bl2);
                        if (!bl2) break block18;
                        og1_1.g(false, false);
                        bundle = new Bundle();
                        if (object2 != null && (n10 = ((String)object2).length()) != 0) {
                            object3 = "search_landing_experiment";
                            bundle.putString((String)object3, (String)object2);
                        }
                        activity.w1 = n7 = 1;
                        activity.j3();
                        bundle.putBoolean("is_landing_page", n7 != 0);
                        object3 = h40_0.a;
                        n10 = (int)(h40_0.c() ? 1 : 0);
                        if (n10 == 0 || (n10 = (int)(Intrinsics.areEqual(object3 = od3_2.a(), object4 = ld3_2.STORE_AJIOGRAM.getStoreId()) ? 1 : 0)) == 0) break block19;
                        if (string2 == null || (n10 = string2.length()) == 0) break block20;
                        object3 = activity.getSupportFragmentManager().c.f();
                        int n14 = object3.size();
                        if (n14 <= 0) break block19;
                        object3 = ((Fragment)object3.get((int)0)).getChildFragmentManager().c.f();
                        Intrinsics.checkNotNullExpressionValue(object3, "getFragments(...)");
                        object3 = (Iterable)object3;
                        object4 = new ArrayList();
                        object3 = object3.iterator();
                        while (bl3 = object3.hasNext()) {
                            fragment = object3.next();
                            boolean bl5 = fragment instanceof q9_0;
                            if (!bl5) continue;
                            ((ArrayList)object4).add(fragment);
                        }
                        object3 = (q9_0)CollectionsKt.firstOrNull((List)object4);
                        if (object3 == null) break block19;
                        object = ((q9_0)object3).ab();
                        AjioHomeActivity.Companion.getClass();
                        Object object5 = AjioHomeActivity.D1;
                        if (object5 != null) {
                            ((AbstractCollection)object5).add(object);
                        }
                        ((q9_0)object3).G2 = n7;
                        object = ((q9_0)object3).X;
                        n3 = 0;
                        object5 = null;
                        String string3 = "ajiohomeViewModel";
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                            n8 = 0;
                            object = null;
                        }
                        ((x9_0)object).t = false;
                        object = "/shop/";
                        n7 = (int)(kotlin.text.b.s(string2, (String)object, false) ? 1 : 0);
                        if (n7 == 0 && (n7 = string2.length()) > 0) {
                            object2 = new StringBuilder((String)object);
                            ((StringBuilder)object2).append((Object)string2);
                            string2 = ((StringBuilder)object2).toString();
                        }
                        if ((object = ((q9_0)object3).X) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                        } else {
                            object5 = object;
                        }
                        if (string2 == null) {
                            string2 = "";
                        }
                        object5.getClass();
                        Intrinsics.checkNotNullParameter(string2, "<set-?>");
                        ((x9_0)object5).r = string2;
                        object = ((q9_0)object3).S;
                        if (object != null) {
                            ai0_2.i((View)object);
                        }
                        n8 = ((q9_0)object3).G2;
                        ((q9_0)object3).hb(n8 != 0);
                        object = ((q9_0)object3).D;
                        if (object != null) {
                            ai0_2.i((View)object);
                        }
                        n8 = -1;
                        ((q9_0)object3).yb(n8, false);
                    }
                    return;
                }
                object2 = q9_0.Companion;
                object2.getClass();
                q9_0 q9_02 = q9$a.b(bundle, string2);
                n7 = 1000;
                if (n4 == n7) {
                    fragment = activity.T0;
                    Boolean bl6 = Boolean.FALSE;
                    boolean bl7 = true;
                    activity.Q1(fragment, q9_02, bl7, string2, bl6);
                } else {
                    zj0_0.a((Fragment)object, q9_02, n3, string2);
                }
                break block18;
            }
            boolean bl8 = object4 instanceof OrderConfirmationActivity;
            if (bl8) {
                object = kj0_1.g();
                String string4 = "null cannot be cast to non-null type com.ril.ajio.payment.activity.OrderConfirmationActivity";
                Intrinsics.checkNotNull(object4, string4);
                object4 = (OrderConfirmationActivity)object4;
                object.getClass();
                kj0_1.k((OrderConfirmationActivity)object4, (String)object3);
            }
        }
    }
}

