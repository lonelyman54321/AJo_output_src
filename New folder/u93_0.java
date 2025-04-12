/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.D;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.SortFilterReviewsSheetBinding;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from u93
 */
public final class u93_0
extends t61_0 {
    public static final u93$a Companion;
    public static final /* synthetic */ gn1_2[] i;
    public j3_0 f;
    public final cc3_2 g;
    public final D h;

    static {
        Object object = jz.a(u93_0.class, "binding", "getBinding()Lcom/ril/ajio/databinding/SortFilterReviewsSheetBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        i = gn1_2Array;
        Companion = object = new Object();
    }

    public u93_0() {
        Object object = z80_0.c(u93$b.a, this);
        this.g = object;
        object = Reflection.getOrCreateKotlinClass(yh0_0.class);
        u93$d u93$d = new u93$d(this);
        u93$e u93$e = new u93$e(this);
        u93$f u93$f = new u93$f(this);
        this.h = object = LW0.a(this, (yn1_2)object, u93$d, u93$e, u93$f);
    }

    public static final yh0_0 Pa(u93_0 u93_02) {
        return (yh0_0)u93_02.h.getValue();
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof j3_0;
        if (bl2) {
            object = (j3_0)object;
            this.f = object;
            return;
        }
        object = pn_2.b(object, "must implement ActivityFragmentListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        t93_0 t93_02 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)t93_02);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.sort_filter_reviews_sheet;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object = i[0];
        object = this.g.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        object = (SortFilterReviewsSheetBinding)object;
        object2 = object.composeSheetView;
        u93$c u93$c = new u93$c(this);
        u10 u102 = new u10(-1528522207, u93$c, true);
        ((ComposeView)((Object)object2)).setContent(u102);
        object = object.cancelBtn;
        object2 = new s93_0(this);
        object.setOnClickListener((View.OnClickListener)object2);
    }
}

