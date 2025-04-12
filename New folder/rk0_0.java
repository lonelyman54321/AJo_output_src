/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.UserUnratedItem;
import com.willy.ratingbar.BaseRatingBar$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from RK0
 */
public final class rk0_0
implements BaseRatingBar$a {
    public final /* synthetic */ sk0_0 a;
    public final /* synthetic */ UserUnratedItem b;
    public final /* synthetic */ SK0$a c;

    public /* synthetic */ rk0_0(sk0_0 sk0_02, UserUnratedItem userUnratedItem, SK0$a a2) {
        this.a = sk0_02;
        this.b = userUnratedItem;
        this.c = a2;
    }

    public final void a(float f5, boolean bl2) {
        R71 r71;
        sk0_0 sk0_02 = this.a;
        Intrinsics.checkNotNullParameter(sk0_02, "this$0");
        UserUnratedItem userUnratedItem = this.b;
        Intrinsics.checkNotNullParameter(userUnratedItem, "$item");
        SK0$a sK0$a = this.c;
        Intrinsics.checkNotNullParameter(sK0$a, "this$1");
        float f6 = f5 - 0.0f;
        float f7 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (f7 != false && bl2 && (r71 = sk0_02.b) != null) {
            int n3 = sK0$a.getBindingAdapterPosition();
            r71.a(f5, n3, userUnratedItem);
        }
    }
}

