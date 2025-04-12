/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.ViewGroup
 */
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ril.ajio.databinding.PdpRatingReviewParentBinding;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Bg0
 */
public final class bg0_2
extends FunctionReferenceImpl
implements gx0_2 {
    public static final bg0_2 a;

    static {
        bg0_2 bg0_22;
        a = bg0_22 = new FunctionReferenceImpl(3, PdpRatingReviewParentBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/ril/ajio/databinding/PdpRatingReviewParentBinding;", 0);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (LayoutInflater)object;
        object2 = (ViewGroup)object2;
        boolean bl2 = (Boolean)object3;
        Intrinsics.checkNotNullParameter(object, "p0");
        return PdpRatingReviewParentBinding.inflate((LayoutInflater)object, (ViewGroup)object2, bl2);
    }
}

