/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.OnImageSearchCategoryClickListener;
import com.ril.ajio.services.data.ProductType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class ImageSearchCategoryWidget
extends FrameLayout
implements View.OnClickListener,
OnImageSearchCategoryClickListener {
    public static final int $stable = 8;
    private List categories;
    private Group groupCroppedUri;
    private we1_0 imageSearchCategoryAdapter;
    public ImageView ivCamera;
    public ImageView ivCameraIcon;
    public ImageView iv_cancel;
    private OnImageSearchCategoryClickListener listener;
    private RecyclerView rvCategory;
    private Uri selectedUri;

    public ImageSearchCategoryWidget(Context context) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context);
        this.categories = arrayList = new ArrayList();
        this.initView(context);
    }

    public ImageSearchCategoryWidget(Context context, AttributeSet object) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, object);
        super();
        this.categories = object;
        this.initView(context);
    }

    public ImageSearchCategoryWidget(Context context, AttributeSet object, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, object, n3);
        super();
        this.categories = object;
        this.initView(context);
    }

    public ImageSearchCategoryWidget(Context context, AttributeSet object, int n3, int n4) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, object, n3, n4);
        super();
        this.categories = object;
        this.initView(context);
    }

    public static /* synthetic */ void a(ImageSearchCategoryWidget imageSearchCategoryWidget, View view) {
        ImageSearchCategoryWidget.setOnClickListener$lambda$2(imageSearchCategoryWidget, view);
    }

    public static /* synthetic */ void b(ImageSearchCategoryWidget imageSearchCategoryWidget, View view) {
        ImageSearchCategoryWidget.setOnClickListener$lambda$0(imageSearchCategoryWidget, view);
    }

    public static /* synthetic */ void c(ImageSearchCategoryWidget imageSearchCategoryWidget, View view) {
        ImageSearchCategoryWidget.setOnClickListener$lambda$1(imageSearchCategoryWidget, view);
    }

    private final void initView(Context object) {
        RecyclerView recyclerView;
        object = LayoutInflater.from((Context)object);
        int n3 = R$layout.view_image_search_category;
        object = object.inflate(n3, (ViewGroup)this, true);
        n3 = R$id.rv_category;
        this.rvCategory = recyclerView = (RecyclerView)object.findViewById(n3);
        n3 = R$id.ivCameraIcon;
        recyclerView = (ImageView)object.findViewById(n3);
        this.setIvCameraIcon((ImageView)recyclerView);
        n3 = R$id.iv_camera;
        recyclerView = (ImageView)object.findViewById(n3);
        this.setIvCamera((ImageView)recyclerView);
        n3 = R$id.iv_cancel;
        recyclerView = (ImageView)object.findViewById(n3);
        this.setIv_cancel((ImageView)recyclerView);
        n3 = R$id.groupCroppedUri;
        object = (Group)object.findViewById(n3);
        this.groupCroppedUri = object;
        this.setOnClickListener();
    }

    private final void setOnClickListener() {
        ImageView imageView = this.getIvCamera();
        Object object = new k4_0(2, this);
        imageView.setOnClickListener((View.OnClickListener)object);
        imageView = this.getIvCameraIcon();
        object = new ye1_0(this);
        imageView.setOnClickListener((View.OnClickListener)object);
        imageView = this.getIv_cancel();
        object = new ze1_0(this);
        imageView.setOnClickListener((View.OnClickListener)object);
    }

    private static final void setOnClickListener$lambda$0(ImageSearchCategoryWidget onImageSearchCategoryClickListener, View object) {
        object = "this$0";
        Intrinsics.checkNotNullParameter(onImageSearchCategoryClickListener, (String)object);
        onImageSearchCategoryClickListener = ((ImageSearchCategoryWidget)onImageSearchCategoryClickListener).listener;
        if (onImageSearchCategoryClickListener != null) {
            boolean bl2 = true;
            onImageSearchCategoryClickListener.onCameraClick(bl2);
        }
    }

    private static final void setOnClickListener$lambda$1(ImageSearchCategoryWidget onImageSearchCategoryClickListener, View object) {
        object = "this$0";
        Intrinsics.checkNotNullParameter(onImageSearchCategoryClickListener, (String)object);
        onImageSearchCategoryClickListener = ((ImageSearchCategoryWidget)onImageSearchCategoryClickListener).listener;
        if (onImageSearchCategoryClickListener != null) {
            object = null;
            onImageSearchCategoryClickListener.onCameraClick(false);
        }
    }

    private static final void setOnClickListener$lambda$2(ImageSearchCategoryWidget onImageSearchCategoryClickListener, View object) {
        object = "this$0";
        Intrinsics.checkNotNullParameter(onImageSearchCategoryClickListener, (String)object);
        onImageSearchCategoryClickListener = ((ImageSearchCategoryWidget)onImageSearchCategoryClickListener).listener;
        if (onImageSearchCategoryClickListener != null) {
            onImageSearchCategoryClickListener.onCameraCancelClick();
        }
    }

    private final void setupCategoryRv() {
        Object object = this.categories;
        Object object2 = new we1_0((List)object, this);
        this.imageSearchCategoryAdapter = object2;
        object2 = this.rvCategory;
        if (object2 != null) {
            Context context = object2.getContext();
            object = new LinearLayoutManager(context, 0, false);
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object);
            object = this.imageSearchCategoryAdapter;
            ((RecyclerView)object2).setAdapter((RecyclerView$f)object);
        }
    }

    private final void updateCategory(int n3) {
        boolean bl2;
        Object object = ((Iterable)this.categories).iterator();
        String string2 = null;
        int n4 = 0;
        while (bl2 = object.hasNext()) {
            Object object2 = object.next();
            int n7 = n4 + 1;
            if (n4 >= 0) {
                boolean bl3 = ((ProductType)(object2 = (ProductType)object2)).getSelected();
                if (bl3) {
                    ((ProductType)object2).setSelected(false);
                } else if (n4 == n3) {
                    n4 = 1;
                    ((ProductType)object2).setSelected(n4 != 0);
                }
                n4 = n7;
                continue;
            }
            xx_2.n();
            throw null;
        }
        we1_0 we1_02 = this.imageSearchCategoryAdapter;
        if (we1_02 != null) {
            object = this.categories;
            string2 = "categories";
            Intrinsics.checkNotNullParameter(object, string2);
            we1_02.a = object;
            we1_02.notifyDataSetChanged();
        }
    }

    public final we1_0 getImageSearchCategoryAdapter() {
        return this.imageSearchCategoryAdapter;
    }

    public final ImageView getIvCamera() {
        ImageView imageView = this.ivCamera;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ivCamera");
        return null;
    }

    public final ImageView getIvCameraIcon() {
        ImageView imageView = this.ivCameraIcon;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ivCameraIcon");
        return null;
    }

    public final ImageView getIv_cancel() {
        ImageView imageView = this.iv_cancel;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iv_cancel");
        return null;
    }

    public final RecyclerView getRvCategory() {
        return this.rvCategory;
    }

    public void onCameraCancelClick() {
    }

    public void onCameraClick(boolean bl2) {
    }

    public void onCategoryClick(int n3, ProductType productType) {
        Object object = "type";
        Intrinsics.checkNotNullParameter(productType, (String)object);
        boolean bl2 = productType.getSelected();
        if (!bl2) {
            this.updateCategory(n3);
            object = this.listener;
            if (object != null) {
                object.onCategoryClick(n3, productType);
            }
        }
    }

    public void onClick(View view) {
    }

    public final void setCategory(List list) {
        Intrinsics.checkNotNullParameter(list, "types");
        this.categories = list;
        this.setupCategoryRv();
    }

    public final void setDataImageSearch(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.selectedUri = uri;
    }

    public final void setImageSearchCamera() {
        Object object = h40_0.a;
        boolean bl2 = h40_0.b();
        if (bl2) {
            object = this.groupCroppedUri;
            if (object != null) {
                ai0_2.B((View)object);
            }
            ai0_2.i((View)this.getIvCameraIcon());
            object = this.getIvCamera();
            Uri uri = this.selectedUri;
            object.setImageURI(uri);
        } else {
            object = this.groupCroppedUri;
            if (object != null) {
                ai0_2.i((View)object);
            }
            object = this.getIvCameraIcon();
            ai0_2.B((View)object);
        }
    }

    public final void setImageSearchCategoryAdapter(we1_0 we1_02) {
        this.imageSearchCategoryAdapter = we1_02;
    }

    public final void setIvCamera(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.ivCamera = imageView;
    }

    public final void setIvCameraIcon(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.ivCameraIcon = imageView;
    }

    public final void setIv_cancel(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.iv_cancel = imageView;
    }

    public final void setOnImageSearchCategoryClickListener(OnImageSearchCategoryClickListener onImageSearchCategoryClickListener) {
        Intrinsics.checkNotNullParameter(onImageSearchCategoryClickListener, "listener");
        this.listener = onImageSearchCategoryClickListener;
    }

    public final void setRvCategory(RecyclerView recyclerView) {
        this.rvCategory = recyclerView;
    }
}

