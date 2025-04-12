/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.pdprefresh.holders;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.pdprefresh.view.BasePDPNewAjioView;
import com.ril.ajio.services.data.Product.fleek.Brand;
import com.ril.ajio.services.data.Product.fleek.BrandResponse;
import com.ril.ajio.services.data.Product.fleek.PostsResponse;
import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component;
import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component$Subcomponent;
import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component$Subcomponent$Media;
import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component$Subcomponent$Media$Metadata;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class PDPStylingIdeasImageHolder
extends BasePDPNewAjioView {
    public static final /* synthetic */ int h;
    public ImageView a;
    public TextView b;
    public yi2_1 c;
    public PostsResponse$Component d;
    public bf3_1 e;
    public ConstraintLayout f;
    public int g;

    public PDPStylingIdeasImageHolder(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet);
        this.a(context);
    }

    public PDPStylingIdeasImageHolder(Context context, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3);
        this.a(context);
    }

    public final void a(Context object) {
        Object object2;
        block5: {
            block4: {
                object = LayoutInflater.from((Context)object);
                int n3 = R$layout.pdp_styling_post_parent;
                boolean bl2 = true;
                object = object.inflate(n3, (ViewGroup)this, bl2);
                n3 = R$id.iv_styling_post;
                object2 = (ImageView)object.findViewById(n3);
                this.a = object2;
                n3 = R$id.txt_product_count;
                object2 = (TextView)object.findViewById(n3);
                this.b = object2;
                n3 = R$id.constraint_product_view;
                object = (ConstraintLayout)object.findViewById(n3);
                this.f = object;
                object = this.a;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivStylingPost");
                    object = null;
                }
                object = object.getLayoutParams();
                Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                object = (ConstraintLayout$LayoutParams)((Object)object);
                object2 = this.d;
                if (object2 == null || (object2 = ((PostsResponse$Component)object2).getSubcomponent()) == null) break block4;
                bl2 = false;
                if ((object2 = (PostsResponse$Component$Subcomponent)object2.get(0)) != null && (object2 = ((PostsResponse$Component$Subcomponent)object2).getMedia()) != null && (object2 = (PostsResponse$Component$Subcomponent$Media)CollectionsKt.N(0, (List)object2)) != null && (object2 = ((PostsResponse$Component$Subcomponent$Media)object2).getMetadata()) != null && (object2 = ((PostsResponse$Component$Subcomponent$Media$Metadata)object2).getAspectRatio()) != null) break block5;
            }
            object2 = "1:1";
        }
        object.G = object2;
    }

    public final void b() {
        int n3;
        int n4;
        Object object;
        int n7;
        int n8;
        Object object2 = this.getPdpInfoProvider();
        CharSequence charSequence = null;
        if (object2 != null && (object2 = object2.N6()) != null && (object2 = ((PostsResponse)object2).getComponents()) != null) {
            n8 = this.g;
            object2 = (PostsResponse$Component)object2.get(n8);
        } else {
            n7 = 0;
            object2 = null;
        }
        Object object3 = this.getPdpInfoProvider();
        if (object3 != null) {
            n8 = object3.W2();
            object3 = n8;
        } else {
            n8 = 0;
            object3 = null;
        }
        Object object4 = "";
        Object object5 = object2 != null && (object = ((PostsResponse$Component)object2).getPostID()) != null ? object : object4;
        object = this.getPdpInfoProvider().P4();
        if (object != null && (object = ((BrandResponse)object).getBrand()) != null && (object = ((Brand)object).getName()) != null) {
            object4 = object;
        }
        object = "fleek_post_";
        String string2 = ((String)object).concat((String)object4);
        object4 = "content";
        if (object2 != null && (object = ((PostsResponse$Component)object2).getSubcomponent()) != null && (object = (PostsResponse$Component$Subcomponent)CollectionsKt.firstOrNull((List)object)) != null && (object = ((PostsResponse$Component$Subcomponent)object).getResources()) != null && (n4 = object.size()) > (n3 = 1)) {
            object4 = "content+product";
        }
        if (object2 != null && (object2 = ((PostsResponse$Component)object2).getSubcomponent()) != null && (object2 = (PostsResponse$Component$Subcomponent)CollectionsKt.firstOrNull((List)object2)) != null && (object2 = ((PostsResponse$Component$Subcomponent)object2).getMedia()) != null && (object2 = (PostsResponse$Component$Subcomponent$Media)CollectionsKt.firstOrNull((List)object2)) != null) {
            charSequence = ((PostsResponse$Component$Subcomponent$Media)object2).getMediaType();
        }
        object2 = (n7 = Intrinsics.areEqual(charSequence, object2 = "IMAGE")) != 0 ? "- image" : "- video";
        String string3 = Qj0.b((String)object4, (String)object2);
        n7 = this.g;
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(object3);
        ((StringBuilder)charSequence).append(" | ");
        ((StringBuilder)charSequence).append(n7);
        String string4 = ((StringBuilder)charSequence).toString();
        object2 = sq0_1.a;
        sq0_1.i("pdp screen", (String)object5, string2, string3, string4, true);
    }

    public final PostsResponse$Component getComponentItem() {
        return this.d;
    }

    public final ConstraintLayout getConstraintProductView() {
        return this.f;
    }

    public final int getItemPosition() {
        return this.g;
    }

    public final yi2_1 getPdpInfoProvider() {
        yi2_1 yi2_12 = this.c;
        if (yi2_12 != null) {
            return yi2_12;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pdpInfoProvider");
        return null;
    }

    public final bf3_1 getStylishIdeasCallback() {
        return this.e;
    }

    public final void setComponentItem(PostsResponse$Component postsResponse$Component) {
        this.d = postsResponse$Component;
    }

    public final void setConstraintProductView(ConstraintLayout constraintLayout) {
        this.f = constraintLayout;
    }

    public void setData() {
        Object object = this.d;
        if (object != null) {
            ImageView imageView = this.a;
            Object object2 = null;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivStylingPost");
                imageView = null;
            }
            if (imageView != null && (object = ((PostsResponse$Component)object).getSubcomponent()) != null) {
                int n3 = 0;
                Object object3 = null;
                if ((object = (PostsResponse$Component$Subcomponent)CollectionsKt.N(0, (List)object)) != null) {
                    boolean bl2;
                    Object object4 = ((PostsResponse$Component$Subcomponent)object).getMedia();
                    Collection collection = object4;
                    collection = (Collection)object4;
                    int n4 = 1;
                    if (collection != null && !(bl2 = collection.isEmpty()) && object4 != null && (object3 = (PostsResponse$Component$Subcomponent$Media)object4.get(0)) != null) {
                        object4 = new da$a();
                        ((da$a)object4).k = n4;
                        ((da$a)object4).g = n4;
                        ((da$a)object4).n = object3 = ((PostsResponse$Component$Subcomponent$Media)object3).getThumbnailUrl();
                        ((da$a)object4).u = imageView;
                        ((da$a)object4).a();
                    }
                    object3 = object = ((PostsResponse$Component$Subcomponent)object).getResources();
                    object3 = (Collection)object;
                    if (object3 != null && (n3 = object3.isEmpty()) == 0 && (n3 = object.size()) > n4) {
                        object3 = this.f;
                        if (object3 != null) {
                            ai0_2.B((View)object3);
                        }
                        int n7 = object.size();
                        object = n7;
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append(object);
                        ((StringBuilder)object3).append(" products");
                        object = ((StringBuilder)object3).toString();
                        object3 = this.b;
                        if (object3 == null) {
                            object3 = "txtProductCount";
                            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        } else {
                            object2 = object3;
                        }
                        if (object2 != null) {
                            object2.setText((CharSequence)object);
                        }
                        if ((object = this.f) != null) {
                            object2 = new kj2_0(this);
                            object.setOnClickListener((View.OnClickListener)object2);
                        }
                    }
                    object = new lj2_2(this);
                    imageView.setOnClickListener((View.OnClickListener)object);
                }
            }
        }
    }

    public final void setItemPosition(int n3) {
        this.g = n3;
    }

    public final void setPdpInfoProvider(yi2_1 yi2_12) {
        Intrinsics.checkNotNullParameter(yi2_12, "<set-?>");
        this.c = yi2_12;
    }

    public final void setStylishIdeasCallback(bf3_1 bf3_12) {
        this.e = bf3_12;
    }
}

