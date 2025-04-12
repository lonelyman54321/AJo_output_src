/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.databinding.ItemRowAjiogramProductPdpBinding;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductImage;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ch2
 */
public final class ch2_2
extends RecyclerView$f {
    public final List a;
    public final zh2_0 b;
    public final Function1 c;

    public ch2_2(List list, zh2_0 zh2_02, eh2_1 eh2_12) {
        Intrinsics.checkNotNullParameter(list, "listProducts");
        Intrinsics.checkNotNullParameter(zh2_02, "onAjiogramWidgetClickListener");
        Intrinsics.checkNotNullParameter(eh2_12, "itemVisibility");
        this.a = list;
        this.b = zh2_02;
        this.c = eh2_12;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        recyclerView$B = (Ch2$a)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        List list = (List)this.a.get(n3);
        recyclerView$B.getClass();
        Intrinsics.checkNotNullParameter(list, "products");
        int n4 = 0;
        Object object = (Product)CollectionsKt.N(0, list);
        Object object2 = null;
        if (object != null && (object = ((Product)object).getImages()) != null && (object = (ProductImage)CollectionsKt.firstOrNull((List)object)) != null) {
            object = ((ProductImage)object).getUrl();
        } else {
            n4 = 0;
            object = null;
        }
        String string2 = "";
        if (object == null) {
            object = string2;
        }
        ItemRowAjiogramProductPdpBinding itemRowAjiogramProductPdpBinding = ((Ch2$a)recyclerView$B).a;
        AjioRoundedCornerImageView ajioRoundedCornerImageView = itemRowAjiogramProductPdpBinding.iv1;
        String string3 = "iv1";
        Intrinsics.checkNotNullExpressionValue((Object)ajioRoundedCornerImageView, string3);
        Ch2$a.w(ajioRoundedCornerImageView, (String)object);
        n4 = 1;
        object = (Product)CollectionsKt.N(n4, list);
        if (object != null && (object = ((Product)object).getImages()) != null && (object = (ProductImage)CollectionsKt.firstOrNull((List)object)) != null) {
            object = ((ProductImage)object).getUrl();
        } else {
            n4 = 0;
            object = null;
        }
        if (object == null) {
            object = string2;
        }
        ajioRoundedCornerImageView = itemRowAjiogramProductPdpBinding.iv2;
        string3 = "iv2";
        Intrinsics.checkNotNullExpressionValue((Object)ajioRoundedCornerImageView, string3);
        Ch2$a.w(ajioRoundedCornerImageView, (String)object);
        n4 = 2;
        object = (Product)CollectionsKt.N(n4, list);
        if (object != null && (object = ((Product)object).getImages()) != null && (object = (ProductImage)CollectionsKt.firstOrNull((List)object)) != null) {
            object = ((ProductImage)object).getUrl();
        } else {
            n4 = 0;
            object = null;
        }
        if (object == null) {
            object = string2;
        }
        ajioRoundedCornerImageView = itemRowAjiogramProductPdpBinding.iv3;
        string3 = "iv3";
        Intrinsics.checkNotNullExpressionValue((Object)ajioRoundedCornerImageView, string3);
        Ch2$a.w(ajioRoundedCornerImageView, (String)object);
        n4 = 3;
        object = (Product)CollectionsKt.N(n4, list);
        if (object != null && (object = ((Product)object).getImages()) != null && (object = (ProductImage)CollectionsKt.firstOrNull((List)object)) != null) {
            object = ((ProductImage)object).getUrl();
        } else {
            n4 = 0;
            object = null;
        }
        if (object == null) {
            object = string2;
        }
        ajioRoundedCornerImageView = itemRowAjiogramProductPdpBinding.iv4;
        string3 = "iv4";
        Intrinsics.checkNotNullExpressionValue((Object)ajioRoundedCornerImageView, string3);
        Ch2$a.w(ajioRoundedCornerImageView, (String)object);
        n4 = 4;
        object = (Product)CollectionsKt.N(n4, list);
        if (object != null && (object = ((Product)object).getImages()) != null && (object = (ProductImage)CollectionsKt.firstOrNull((List)object)) != null) {
            object2 = ((ProductImage)object).getUrl();
        }
        if (object2 != null) {
            string2 = object2;
        }
        object = itemRowAjiogramProductPdpBinding.iv5;
        Intrinsics.checkNotNullExpressionValue(object, "iv5");
        Ch2$a.w((ImageView)object, string2);
        object2 = ((Ch2$a)recyclerView$B).b;
        object = new bh2_1((Ch2$a)recyclerView$B, (ch2_2)object2, list);
        itemRowAjiogramProductPdpBinding.iv1.setOnClickListener((View.OnClickListener)object);
        itemRowAjiogramProductPdpBinding.iv2.setOnClickListener((View.OnClickListener)object);
        itemRowAjiogramProductPdpBinding.iv3.setOnClickListener((View.OnClickListener)object);
        itemRowAjiogramProductPdpBinding.iv4.setOnClickListener((View.OnClickListener)object);
        itemRowAjiogramProductPdpBinding.iv5.setOnClickListener((View.OnClickListener)object);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        Intrinsics.checkNotNullParameter(object, "parent");
        object = ItemRowAjiogramProductPdpBinding.inflate(LayoutInflater.from((Context)object.getContext()), object, false);
        Intrinsics.checkNotNullExpressionValue(object, "inflate(...)");
        Ch2$a ch2$a = new Ch2$a(this, (ItemRowAjiogramProductPdpBinding)object);
        return ch2$a;
    }

    public final void onViewAttachedToWindow(RecyclerView$B object) {
        object = (Ch2$a)object;
        Intrinsics.checkNotNullParameter(object, "holder");
        super.onViewAttachedToWindow((RecyclerView$B)object);
        object = ((RecyclerView$B)object).getLayoutPosition();
        this.c.invoke(object);
    }
}

