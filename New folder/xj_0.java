/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.viewbinding.R$id;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from xj
 */
public final class xj_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Fragment d;
    public final /* synthetic */ Context e;

    public xj_0(Function1 function1, Fragment fragment, Context context) {
        this.c = function1;
        this.d = fragment;
        this.e = context;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        int n3 = R$id.binding_reference;
        Object object2 = object.getTag(n3);
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding");
        object2 = (BC3)object2;
        this.c.invoke(object2);
        n3 = object instanceof ViewGroup;
        Object object3 = null;
        object = n3 != 0 ? (ViewGroup)object : null;
        if (object != null) {
            object2 = this.d;
            if (object2 != null && (object2 = ((Fragment)object2).getChildFragmentManager()) != null) {
                object3 = object2;
            } else {
                object2 = this.e;
                boolean bl2 = object2 instanceof FragmentActivity;
                if (bl2) {
                    object2 = (FragmentActivity)object2;
                } else {
                    n3 = 0;
                    object2 = null;
                }
                if (object2 != null) {
                    object3 = ((FragmentActivity)object2).getSupportFragmentManager();
                }
            }
            object2 = new wj_1((FragmentManager)object3);
            Aj.c((ViewGroup)object, (wj_1)object2);
        }
        return Unit.a;
    }
}

