/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.PlpListViewEvents;
import java.io.Serializable;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Fa
 */
public final class fa_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ fa_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onClick(View object) {
        int n3 = 1;
        int n4 = 0;
        Object object2 = null;
        Fragment fragment = null;
        Object object3 = "this$0";
        Object[] objectArray = this.b;
        int n7 = this.a;
        switch (n7) {
            default: {
                objectArray = (vv2_2)objectArray;
                Intrinsics.checkNotNullParameter(objectArray, (String)object3);
                object = objectArray.t;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchViewModel");
                    n3 = 0;
                    object = null;
                }
                object3 = objectArray.U;
                object.getClass();
                aW aW2 = md3_0.c((jD3)object);
                Object object4 = C90$a.a;
                uw2_1 uw2_12 = new a((CoroutineContext$a)object4);
                object4 = new vw2_1(null, (yw2_0)object, (String)object3, false);
                n3 = 2;
                Ae3.d(aW2, uw2_12, null, (Function2)object4, n3);
                object = objectArray.I;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchInfoContainer");
                    n3 = 0;
                    object = null;
                }
                object.setVisibility(0);
                object = objectArray.J;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchSuggestionContainer");
                    n3 = 0;
                    object = null;
                }
                int n8 = 8;
                object.setVisibility(n8);
                object = objectArray.A;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchList");
                    n3 = 0;
                    object = null;
                }
                object.setVisibility(n8);
                object = objectArray.x;
                if (object == null) {
                    object = "searchHistoryLayout";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                } else {
                    object2 = object;
                }
                object2.setVisibility(0);
                return;
            }
            case 2: {
                int n10;
                objectArray = (ff1_2)objectArray;
                Intrinsics.checkNotNullParameter(objectArray, (String)object3);
                object3 = objectArray.k;
                if (object3 != null) {
                    object3 = ((ky1_0)object3).t;
                } else {
                    n10 = 0;
                    object3 = null;
                }
                if (object3 != null) {
                    fragment = objectArray.getTargetFragment();
                    if (fragment != null) {
                        fragment = new Intent();
                        object3 = new Bundle();
                        Object object5 = objectArray.k;
                        if (object5 != null) {
                            object2 = ((ky1_0)object5).t;
                        }
                        Intrinsics.checkNotNull(object2);
                        object5 = "slected_product";
                        object3.putSerializable((String)object5, (Serializable)object2);
                        object2 = "product_quantity";
                        object3.putInt((String)object2, n3);
                        fragment.putExtras((Bundle)object3);
                        object = objectArray.getTargetFragment();
                        if (object != null) {
                            n4 = objectArray.getTargetRequestCode();
                            n10 = -1;
                            object.onActivityResult(n4, n10, (Intent)fragment);
                        }
                        objectArray.dismiss();
                    }
                } else {
                    object2 = StringCompanionObject.INSTANCE;
                    object2 = hv3_0.K(R$string.acc_alert_message);
                    n10 = R$string.select_size_text;
                    object3 = hv3_0.K(n10);
                    objectArray = new Object[n3];
                    objectArray[0] = object3;
                    object3 = "format(...)";
                    object = xh2_0.a(objectArray, n3, (String)object2, (String)object3);
                    n4 = R$string.select_size_text;
                    object2 = hv3_0.K(n4);
                    hv3_0.o0(0, (String)object2, (String)object);
                }
                return;
            }
            case 1: {
                objectArray = (io0_1)objectArray;
                Intrinsics.checkNotNullParameter(objectArray, (String)object3);
                objectArray.dismissAllowingStateLoss();
                return;
            }
            case 0: 
        }
        objectArray = (ia_0)objectArray;
        Intrinsics.checkNotNullParameter(objectArray, (String)object3);
        object = PlpListViewEvents.Companion.getInstance();
        object2 = objectArray.G0;
        object.logToggleButtonClickEvent((Yj2)((Object)object2));
        object = objectArray.G0;
        object2 = Yj2.LIST;
        if (object == object2) {
            object2 = Yj2.GRID;
        }
        objectArray.G0 = object2;
        objectArray.Ab();
    }
}

