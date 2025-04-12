/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup$MarginLayoutParams
 */
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.search.SearchView;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.closet.activity.ClosetAddToBagActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class eW
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eW(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = null;
        Object object2 = "this$0";
        Object object3 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                ((SearchView)object3).requestFocusAndShowKeyboardIfNeeded();
                return;
            }
            case 1: {
                boolean bl3;
                object3 = (b32)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object2 = ((b32)object3).Q;
                if (object2 != null) {
                    object = object2.getLayoutParams();
                }
                if (bl3 = object instanceof ViewGroup.MarginLayoutParams) {
                    object2 = object;
                    object2 = (ViewGroup.MarginLayoutParams)object;
                    object2.setMarginStart(6);
                    n3 = object2.getMarginEnd() + 18;
                    object2.setMarginEnd(n3);
                    object2 = ((b32)object3).Q;
                    if (object2 != null) {
                        object2.setLayoutParams(object);
                    }
                    if (object2 != null) {
                        object2.requestLayout();
                    }
                }
                return;
            }
            case 0: 
        }
        Object object4 = ClosetAddToBagActivity.Companion;
        object3 = (ClosetAddToBagActivity)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object2 = ((ClosetAddToBagActivity)object3).y0;
        if (object2 != null) {
            int bl2 = ((LinearLayoutManager)object2).findLastVisibleItemPosition();
            object2 = bl2;
        } else {
            boolean bl2 = false;
            object2 = null;
        }
        object4 = ((ClosetAddToBagActivity)object3).w0;
        int n4 = 0;
        if (object4 != null) {
            n3 = ((ArrayList)object4).size();
            object4 = n3;
        } else {
            object4 = 0;
        }
        boolean bl3 = Intrinsics.areEqual(object2, object4);
        object4 = "sizeIncrementTv";
        if (bl3) {
            object2 = ((ClosetAddToBagActivity)object3).p0;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                boolean bl4 = false;
                object2 = null;
            }
            int n7 = R$drawable.quantity_disable_inc;
            object2.setBackgroundResource(n7);
            object2 = ((ClosetAddToBagActivity)object3).p0;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                boolean bl5 = false;
                object2 = null;
            }
            n7 = R$string.acc_quantity_increase_icon;
            String string2 = hv3_0.K(n7);
            object2.setContentDescription((CharSequence)string2);
            object2 = ((ClosetAddToBagActivity)object3).p0;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            } else {
                object = object2;
            }
            object.setClickable(false);
        } else {
            object2 = ((ClosetAddToBagActivity)object3).p0;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                boolean bl6 = false;
                object2 = null;
            }
            n4 = R$drawable.nextlevel_arrow;
            object2.setBackgroundResource(n4);
            object2 = ((ClosetAddToBagActivity)object3).p0;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            } else {
                object = object2;
            }
            boolean bl7 = true;
            object.setClickable(bl7);
        }
        ((ClosetAddToBagActivity)object3).z0 = -1;
    }
}

