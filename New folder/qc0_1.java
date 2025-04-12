/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$drawable;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.EddResult;
import com.ril.ajio.services.data.Product.Status;
import com.willy.ratingbar.BaseRatingBar$a;
import com.willy.ratingbar.ScaleRatingBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QC0
 */
public final class qc0_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qc0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 1;
        Object object2 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (Context)object;
                object2 = (qz1_2)object2;
                Intrinsics.checkNotNullParameter(object2, "$viewModel");
                Intrinsics.checkNotNullParameter(object, "ctx");
                ScaleRatingBar scaleRatingBar = new ScaleRatingBar((Context)object);
                int n7 = 5;
                scaleRatingBar.setNumStars(n7);
                scaleRatingBar.setStarPadding(n7);
                scaleRatingBar.setStepSize(1.0f);
                scaleRatingBar.setRating(0.0f);
                scaleRatingBar.setIsIndicator(false);
                scaleRatingBar.setClickable(n3 != 0);
                scaleRatingBar.setClearRatingEnabled(false);
                n7 = R$drawable.empty_star;
                scaleRatingBar.setEmptyDrawableRes(n7);
                n7 = R$drawable.gold_star;
                scaleRatingBar.setFilledDrawableRes(n7);
                object = new te2_0((qz1_2)object2);
                scaleRatingBar.setOnRatingChangeListener((BaseRatingBar$a)object);
                ai0_2.b(scaleRatingBar);
                return scaleRatingBar;
            }
            case 0: 
        }
        object = (DataCallback)object;
        Object object3 = rc0_2.Companion;
        object2 = (rc0_2)object2;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object3 = cp_1.Companion;
        n4 = (int)(nn_2.b((cp$a)object3, (DataCallback)object) ? 1 : 0);
        if (n4 != 0) {
            int n8;
            Object object4;
            n4 = 0;
            object3 = null;
            if (object != null && (object4 = ((DataCallback)object).getError()) != null && (object4 = ((DataError)object4).getErrorMessage()) != null) {
                object4 = ((DataError$ErrorMessage)object4).getMessage();
            } else {
                n8 = 0;
                object4 = null;
            }
            String string2 = "We are unable to verify exchange availability currently";
            if (object4 != null && (n8 = ((String)object4).length()) != 0) {
                ((rc0_2)object2).Ta(null, string2);
            } else {
                n8 = ((DataCallback)object).getStatus();
                if (n8 == 0) {
                    int n10;
                    Status status;
                    object4 = (EddResult)((DataCallback)object).getData();
                    if (object4 != null && (status = ((EddResult)object4).getStatus()) != null && (n10 = (status = ((EddResult)object4).getStatus()).getStatusCode()) == 0) {
                        ((rc0_2)object2).Ta((EddResult)object4, null);
                    } else {
                        int n14 = ((DataCallback)object).getStatus();
                        if (n14 == n3) {
                            ((rc0_2)object2).Ta(null, string2);
                        }
                    }
                } else {
                    int n15 = ((DataCallback)object).getStatus();
                    if (n15 == n3) {
                        ((rc0_2)object2).Ta(null, string2);
                    }
                }
            }
        }
        return Unit.a;
    }
}

