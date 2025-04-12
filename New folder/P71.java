/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.UserUnratedItem;
import com.willy.ratingbar.BaseRatingBar$a;
import kotlin.jvm.internal.Intrinsics;

public final class P71
implements BaseRatingBar$a {
    public final /* synthetic */ o71_0 a;
    public final /* synthetic */ UserUnratedItem b;
    public final /* synthetic */ O71$b c;

    public /* synthetic */ P71(o71_0 o71_02, UserUnratedItem userUnratedItem, O71$b o71$b) {
        this.a = o71_02;
        this.b = userUnratedItem;
        this.c = o71$b;
    }

    public final void a(float f5, boolean bl2) {
        R71 r71;
        o71_0 o71_02 = this.a;
        Intrinsics.checkNotNullParameter(o71_02, "this$0");
        UserUnratedItem userUnratedItem = this.b;
        Intrinsics.checkNotNullParameter(userUnratedItem, "$item");
        O71$b o71$b = this.c;
        Intrinsics.checkNotNullParameter(o71$b, "this$1");
        float f6 = f5 - 0.0f;
        float f7 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (f7 != false && bl2 && (r71 = o71_02.d) != null) {
            int n3 = o71$b.getAdapterPosition();
            r71.a(f5, n3, userUnratedItem);
        }
    }
}

