/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wY1
 */
public final class wy1_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wy1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (Boolean)object;
                Object object2 = "this$0";
                yn2_2 yn2_22 = (yn2_2)this.b;
                Intrinsics.checkNotNullParameter(yn2_22, (String)object2);
                boolean n4 = (Boolean)object;
                if (n4) {
                    int n7;
                    object = yn2_22.f;
                    if (object != null && (n7 = ((String)object).length()) != 0) {
                        object = yn2_22.f;
                        Intrinsics.checkNotNull(object);
                        yn2_22.getOrderDetails((String)object);
                    }
                    object = yn2_22.Qa().C;
                    object2 = Boolean.FALSE;
                    ((LiveData)object).k(object2);
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (Throwable)object;
        ky1_0 ky1_02 = (ky1_0)this.b;
        Intrinsics.checkNotNullParameter(ky1_02, "this$0");
        zr1_1 zr1_12 = ky1_02.m;
        Intrinsics.checkNotNull(object);
        object = ky1_02.c.handleApiException((Throwable)object, "BackGround_ShowWishList");
        zr1_12.k(object);
        return Unit.a;
    }
}

