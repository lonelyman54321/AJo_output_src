/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.reviewRatings.ProductReview;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class bP2$m
implements Function0 {
    public final /* synthetic */ yi2_1 a;
    public final /* synthetic */ ProductReview b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ tr1_0 d;

    public bP2$m(yi2_1 yi2_12, ProductReview productReview, Function1 function1, tr1_0 tr1_02) {
        this.a = yi2_12;
        this.b = productReview;
        this.c = function1;
        this.d = tr1_02;
    }

    public final Object invoke() {
        Boolean bl2;
        Boolean bl3;
        boolean bl4;
        boolean bl5;
        Object object;
        int n3 = 0;
        Integer n4 = null;
        Object object2 = this.a;
        if (object2 != null) {
            object2 = object2.d7();
            object = Boolean.TRUE;
            bl5 = Intrinsics.areEqual(object2, object);
        } else {
            bl5 = false;
            object2 = null;
        }
        object = this.b;
        if (bl5 && (bl4 = Intrinsics.areEqual(bl3 = (Boolean)(object2 = this.d).getValue(), bl2 = Boolean.FALSE))) {
            bl3 = Boolean.TRUE;
            object2.setValue(bl3);
            if (object != null) {
                object2 = (Boolean)object2.getValue();
                ((ProductReview)object).setMarkedHelpful((Boolean)object2);
            }
        }
        if (object != null && (object2 = ((ProductReview)object).getReviewId()) != null) {
            n3 = (Integer)object2;
        }
        n4 = n3;
        this.c.invoke(n4);
        return Unit.a;
    }
}

