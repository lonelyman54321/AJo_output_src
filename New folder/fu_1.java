/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.sis.StoreInfo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fU
 */
public final class fu_1
implements View.OnClickListener {
    public final /* synthetic */ hU$a a;
    public final /* synthetic */ StoreInfo b;

    public /* synthetic */ fu_1(hU$a a2, StoreInfo storeInfo) {
        this.a = a2;
        this.b = storeInfo;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$storeInfo");
        object = ((hU$a)object).b;
        String string2 = ((StoreInfo)object2).storeId;
        Intrinsics.checkNotNullExpressionValue(string2, "storeId");
        object2 = ((StoreInfo)object2).subdomain;
        object.b5(string2, (String)object2);
    }
}

