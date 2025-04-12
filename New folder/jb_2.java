/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.FeedbackRatingSnackbar;
import com.ril.ajio.customviews.FeedbackRatingSnackbar$Companion;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.myaccount.order.fragment.b;
import com.ril.ajio.myaccount.order.fragment.b$a;
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from jb
 */
public final class jb_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jb_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = "this$0";
        Object object3 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (DataCallback)object;
                object3 = (uc3_2)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                ((uc3_2)object3).k.k(object);
                return Unit.a;
            }
            case 2: {
                object = (Boolean)object;
                boolean bl2 = (Boolean)object;
                b$a b$a = com.ril.ajio.myaccount.order.fragment.b.Companion;
                object3 = (b)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                if (!bl2) {
                    object = FeedbackRatingSnackbar.Companion;
                    object2 = ((Fragment)object3).getView();
                    Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type android.view.ViewGroup");
                    object2 = (ViewGroup)object2;
                    object = ((FeedbackRatingSnackbar$Companion)object).make((View)object2);
                    int n4 = -2;
                    ((BaseTransientBottomBar)object).setDuration(n4);
                    ((BaseTransientBottomBar)object).show();
                    object2 = ((BaseTransientBottomBar)object).getView();
                    int n7 = R$id.img_close;
                    object2 = (ImageView)object2.findViewById(n7);
                    n3 = 0;
                    b$a = null;
                    object3 = new wf2_1(object, 0);
                    object2.setOnClickListener((View.OnClickListener)object3);
                }
                return Unit.a;
            }
            case 1: {
                object = (DataCallback)object;
                object3 = (q22_0)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object2 = cp_1.Companion;
                int n8 = nn_2.b((cp$a)object2, (DataCallback)object);
                if (n8 != 0 && (n8 = ((DataCallback)object).getStatus()) == 0) {
                    object = (Integer)((DataCallback)object).getData();
                    ((q22_0)object3).qb((Integer)object);
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (CMSNavigation)object;
        object3 = (Ref$ObjectRef)object3;
        Intrinsics.checkNotNullParameter(object3, "$path");
        Intrinsics.checkNotNullParameter(object, "subCategory");
        object2 = ((tr1_0)((Ref$ObjectRef)object3).element).getValue();
        object = ((CMSNavigation)object).getName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(object2);
        stringBuilder.append("/");
        stringBuilder.append((String)object);
        ((Ref$ObjectRef)object3).element = object = J83.g(stringBuilder.toString());
        return Unit.a;
    }
}

