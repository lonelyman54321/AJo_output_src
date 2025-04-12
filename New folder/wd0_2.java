/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wD0
 */
public final class wd0_2
implements View.OnClickListener {
    public final /* synthetic */ ReturnOrderItemDetails a;
    public final /* synthetic */ ReturnOrderItemDetails b;
    public final /* synthetic */ AppCompatActivity c;

    public /* synthetic */ wd0_2(ReturnOrderItemDetails returnOrderItemDetails, ReturnOrderItemDetails returnOrderItemDetails2, AppCompatActivity appCompatActivity) {
        this.a = returnOrderItemDetails;
        this.b = returnOrderItemDetails2;
        this.c = appCompatActivity;
    }

    public final void onClick(View object) {
        Object object2;
        Object object3;
        boolean bl2;
        Object object4 = this.a;
        Intrinsics.checkNotNullParameter(object4, "$returnOrderItemDetails");
        ReturnOrderItemDetails returnOrderItemDetails = this.b;
        Intrinsics.checkNotNullParameter(returnOrderItemDetails, "$retunOrderItem");
        AppCompatActivity appCompatActivity = this.c;
        Intrinsics.checkNotNullParameter(appCompatActivity, "$activity");
        object = ((ReturnOrderItemDetails)object4).getSelectedControllerConfirmedList();
        Intrinsics.checkNotNullExpressionValue(object, "getSelectedControllerConfirmedList(...)");
        object4 = new ArrayList();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            object2 = object3 = object.next();
            object2 = ((CartEntry)object3).getOrderEntry();
            boolean bl3 = ((CartEntry)object2).isExchangeItem() ^ true;
            if (!bl3) continue;
            ((ArrayList)object4).add(object3);
        }
        boolean bl4 = ((ArrayList)object4).isEmpty() ^ true;
        if (bl4) {
            object = new ReturnOrderItemDetails();
            object3 = new ih2_2();
            object2 = new Bundle();
            ArrayList arrayList = ((ReturnOrderItemDetails)object).getSelectedControllerConfirmedList();
            arrayList.addAll(object4);
            object2.putSerializable("Return_Order_Details", (Serializable)object);
            object4 = returnOrderItemDetails.getActionContent();
            object2.putSerializable("actionContent", (Serializable)object4);
            ((Fragment)object3).setArguments((Bundle)object2);
            object = appCompatActivity.getSupportFragmentManager();
            object4 = "Refund Breakup";
            ((DialogFragment)object3).show((FragmentManager)object, (String)object4);
        }
    }
}

