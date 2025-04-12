/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.ril.ajio.services.data.reviewRatings.ProductReview;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class bP2$e
extends qg3_2
implements Function2 {
    public final /* synthetic */ ProductReview a;
    public final /* synthetic */ yh0_0 b;
    public final /* synthetic */ tr1_0 c;

    public bP2$e(ProductReview productReview, yh0_0 yh0_02, tr1_0 tr1_02, f80_0 f80_02) {
        this.a = productReview;
        this.b = yh0_02;
        this.c = tr1_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yh0_0 yh0_02 = this.b;
        tr1_0 tr1_02 = this.c;
        ProductReview productReview = this.a;
        object = new bP2$e(productReview, yh0_02, tr1_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (bP2$e)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((bP2$e)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        int n3;
        Object object2;
        Object object3 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        boolean bl2 = false;
        object = null;
        object3 = this.a;
        if (object3 != null) {
            object2 = ((ProductReview)object3).getReviewId();
        } else {
            n3 = 0;
            object2 = null;
        }
        yh0_0 yh0_02 = this.b;
        if (yh0_02 != null && (parcelableSnapshotMutableState = yh0_02.q) != null) {
            object = (Integer)parcelableSnapshotMutableState.getValue();
        }
        if (bl2 = Intrinsics.areEqual(object2, object)) {
            object = Boolean.TRUE;
            object2 = this.c;
            object2.setValue(object);
            if (object3 != null) {
                object = (Boolean)object2.getValue();
                ((ProductReview)object3).setMarkedHelpful((Boolean)object);
            }
            if (yh0_02 != null && (object = yh0_02.q) != null) {
                n3 = -1;
                object3 = new Integer(n3);
                ((h83_0)object).setValue(object3);
            }
            if (yh0_02 != null && (object = yh0_02.p) != null) {
                object3 = Boolean.FALSE;
                ((h83_0)object).setValue(object3);
            }
        }
        return Unit.a;
    }
}

