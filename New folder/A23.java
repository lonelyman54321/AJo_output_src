/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
import android.content.DialogInterface;
import com.ril.ajio.data.database.entity.ListShareProductExperience;
import com.ril.ajio.data.database.entity.SharedWithMe;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public final class A23
implements DialogInterface.OnClickListener {
    public final /* synthetic */ B23 a;
    public final /* synthetic */ int b;

    public /* synthetic */ A23(B23 b23, int n3) {
        this.a = b23;
        this.b = n3;
    }

    public final void onClick(DialogInterface object, int n3) {
        boolean bl2;
        Object object2 = B23.Companion;
        object2 = "this$0";
        B23 b23 = this.a;
        Intrinsics.checkNotNullParameter(b23, (String)object2);
        object.dismiss();
        object = b23.f;
        n3 = this.b;
        if (object == null || (object = ((m23_0)object).i(n3)) == null || (object = ((Product)object).getFnlColorVariantData()) == null || (object = ((ProductFnlColorVariantData)object).getColorGroup()) == null) {
            object = "";
        }
        Iterator iterator = b23.h;
        Object object3 = null;
        if (iterator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedWithMe");
            iterator = null;
        }
        iterator = ((SharedWithMe)((Object)iterator)).getProductsShared();
        ArrayList arrayList = new ArrayList();
        iterator = iterator.iterator();
        while (bl2 = iterator.hasNext()) {
            Object t3;
            Object object4 = t3 = iterator.next();
            object4 = ((ListShareProductExperience)t3).getProductId();
            boolean bl3 = Intrinsics.areEqual(object4, object);
            if (!bl3) continue;
            arrayList.add(t3);
        }
        boolean bl4 = arrayList.isEmpty() ^ true;
        if (bl4) {
            b23.Ra().fswmdProgressView.show();
            object = b23.f;
            if (object != null) {
                ((m23_0)object).g(n3);
            }
            if ((object = b23.c) == null) {
                object = "sharedWithMeViewModel";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object3 = object;
            }
            ((w23_0)object3).b(arrayList);
        }
    }
}

