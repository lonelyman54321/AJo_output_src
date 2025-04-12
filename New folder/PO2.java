/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.webkit.URLUtil
 *  android.widget.FrameLayout
 *  android.widget.RelativeLayout
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.services.data.ratings.UploadImageAttributes;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class PO2
extends RecyclerView$f {
    public HO2 a;
    public HO2 b;
    public HO2 c;
    public ArrayList d;

    public final int getItemCount() {
        int n3;
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            n3 = arrayList.size();
        } else {
            n3 = 0;
            arrayList = null;
        }
        return n3;
    }

    public final int getItemViewType(int n3) {
        Object object;
        Object object2 = this.d;
        if (object2 != null && (object = (UploadImageAttributes)CollectionsKt.N(n3, (List)object2)) != null) {
            object = ((UploadImageAttributes)object).getViewType();
        } else {
            n3 = 0;
            object = null;
        }
        object2 = "ADD_IMAGE";
        n3 = (int)(Intrinsics.areEqual(object, object2) ? 1 : 0);
        if (n3 != 0) {
            return Oe1.ADD_IMAGE.getViewType();
        }
        return Oe1.REVIEW_IMAGE.getViewType();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onBindViewHolder(RecyclerView$B var1_1, int var2_2) {
        block18: {
            block17: {
                var3_3 = "viewHolder";
                Intrinsics.checkNotNullParameter(var1_1, (String)var3_3);
                var4_4 = var1_1 instanceof PO2$b;
                if (!var4_4) break block17;
                var3_3 = this.d;
                var5_5 = false;
                var6_6 = null;
                if (var3_3 != null) {
                    var7_8 = (UploadImageAttributes)var3_3.get(var2_2);
                } else {
                    var2_2 = 0;
                    var7_8 = null;
                }
                var1_1 = (PO2$b)var1_1;
                var1_1.getClass();
                var3_3 = "getValue(...)";
                var8_10 = true;
                if (var7_8 != null && (var9_12 /* !! */  = var7_8.getImagePath()) != null) {
                    var10_13 = AjioRoundedCornerImageView.Companion;
                    var11_14 = hv3_0.q(R$dimen.dp8);
                    var12_15 = var11_14;
                    var10_13.setRadius(var12_15);
                    var13_16 = URLUtil.isNetworkUrl((String)var9_12 /* !! */ );
                    var14_17 = var1_1.a;
                    if (var13_16) {
                        var10_13 = new da$a();
                        var10_13.k = var8_10;
                        var10_13.g = var8_10;
                        var14_17 = var14_17.getValue();
                        Intrinsics.checkNotNullExpressionValue(var14_17, (String)var3_3);
                        var14_17 = (AjioRoundedCornerImageView)var14_17;
                        var10_13.n = var9_12 /* !! */ ;
                        var10_13.u = var14_17;
                        var10_13.a();
                    } else {
                        var10_13 = new da$a();
                        var10_13.k = var8_10;
                        var10_13.g = var8_10;
                        var10_13.C = var8_10;
                        var15_18 = new File((String)var9_12 /* !! */ );
                        var9_12 /* !! */  = var14_17.getValue();
                        Intrinsics.checkNotNullExpressionValue(var9_12 /* !! */ , (String)var3_3);
                        var9_12 /* !! */  = (AjioRoundedCornerImageView)var9_12 /* !! */ ;
                        var10_13.D = var15_18;
                        var10_13.u = var9_12 /* !! */ ;
                        var10_13.a();
                    }
                    var9_12 /* !! */  = var1_1.w();
                    var14_17 = var1_1.g;
                    var10_13 = new QO2((PO2)var14_17, (PO2$b)var1_1, (UploadImageAttributes)var7_8);
                    ai0_2.v((View)var9_12 /* !! */ , (Function1)var10_13);
                    var9_12 /* !! */  = var1_1.y();
                    var10_13 = new RO2((PO2)var14_17, (PO2$b)var1_1, (UploadImageAttributes)var7_8);
                    ai0_2.v((View)var9_12 /* !! */ , (Function1)var10_13);
                    var9_12 /* !! */  = var1_1.x();
                    var10_13 = new so2_0((PO2)var14_17, (PO2$b)var1_1, (UploadImageAttributes)var7_8);
                    ai0_2.v((View)var9_12 /* !! */ , (Function1)var10_13);
                }
                if (var7_8 != null) {
                    var6_6 = var7_8.getImageUploadStatus();
                }
                if (var6_6 == null) break block18;
                var16_19 = var6_6.hashCode();
                var10_13 = var1_1.f;
                var14_17 = var1_1.d;
                var17_20 = 8;
                switch (var16_19) {
                    default: {
                        break block18;
                    }
                    case 1383663147: {
                        var7_8 = "COMPLETED";
                        var2_2 = (int)var6_6.equals(var7_8);
                        if (var2_2 != 0) ** GOTO lbl78
                        break block18;
                    }
                    case 79219778: {
                        var7_8 = "START";
                        var2_2 = (int)var6_6.equals(var7_8);
                        if (var2_2 == 0) break block18;
lbl78:
                        // 2 sources

                        var14_17.setProgress(0);
                        var14_17.setVisibility(var17_20);
                        var7_8 = var10_13.getValue();
                        Intrinsics.checkNotNullExpressionValue(var7_8, (String)var3_3);
                        ((FrameLayout)var7_8).setVisibility(var17_20);
                        var1_1.x().setVisibility(var17_20);
                        var7_8 = var1_1.y();
                        var7_8.setVisibility(var17_20);
                        var1_1 = var1_1.w();
                        var1_1.setVisibility(0);
                        break block18;
                    }
                    case 66247144: {
                        var7_8 = "ERROR";
                        var2_2 = (int)var6_6.equals(var7_8);
                        if (var2_2 != 0) {
                            var14_17.setProgressCompat(0, var8_10);
                            var14_17.setVisibility(var17_20);
                            var1_1.w().setVisibility(var17_20);
                            var7_8 = var10_13.getValue();
                            Intrinsics.checkNotNullExpressionValue(var7_8, (String)var3_3);
                            ((FrameLayout)var7_8).setVisibility(0);
                            var7_8 = var1_1.x();
                            var7_8.setVisibility(0);
                            var1_1 = var1_1.y();
                            var1_1.setVisibility(0);
                        }
                        break block18;
                    }
                    case -604548089: 
                }
                var18_21 = "IN_PROGRESS";
                var5_5 = var6_6.equals(var18_21);
                if (var5_5) {
                    var1_1.x().setVisibility(var17_20);
                    var6_6 = var1_1.y();
                    var6_6.setVisibility(var17_20);
                    var1_1.w().setVisibility(0);
                    var1_1 = var10_13.getValue();
                    Intrinsics.checkNotNullExpressionValue(var1_1, (String)var3_3);
                    var1_1 = (FrameLayout)var1_1;
                    var1_1.setVisibility(0);
                    var14_17.setVisibility(0);
                    var19_22 = var7_8.getImageUploadProgressPercent();
                    var14_17.setProgress(var19_22);
                }
                break block18;
            }
            var2_2 = var1_1 instanceof PO2$a;
            if (var2_2 != 0) {
                var1_1 = (PO2$a)var1_1;
                var7_9 = (RelativeLayout)var1_1.a.getValue();
                var6_7 = var1_1.b;
                var8_11 = 1;
                var3_3 = new ko_1(var8_11, var6_7, var1_1);
                var7_9.setOnClickListener((View.OnClickListener)var3_3);
            }
        }
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3, List object2) {
        Intrinsics.checkNotNullParameter(object, "holder");
        Object object3 = "payloads";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        boolean bl2 = object instanceof PO2$b;
        if (bl2) {
            object3 = object2;
            object3 = (Collection)object2;
            bl2 = object3.isEmpty();
            boolean bl3 = true;
            if (bl2 ^= bl3) {
                UploadImageAttributes uploadImageAttributes;
                object3 = this.d;
                if (object3 != null) {
                    uploadImageAttributes = (UploadImageAttributes)((ArrayList)object3).get(n3);
                } else {
                    n3 = 0;
                    uploadImageAttributes = null;
                }
                object2 = CollectionsKt.firstOrNull((List)object2);
                object3 = "PROGRESS_BAR_UPDATE";
                boolean bl4 = Intrinsics.areEqual(object2, object3);
                if (bl4) {
                    object = ((PO2$b)object).d;
                    if (uploadImageAttributes != null) {
                        n3 = uploadImageAttributes.getImageUploadProgressPercent();
                    } else {
                        n3 = 0;
                        uploadImageAttributes = null;
                    }
                    ((LinearProgressIndicator)((Object)object)).setProgressCompat(n3, bl3);
                }
            } else {
                super.onBindViewHolder((RecyclerView$B)object, n3, (List)object2);
            }
        } else {
            super.onBindViewHolder((RecyclerView$B)object, n3, (List)object2);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        RecyclerView$B recyclerView$B;
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Oe1 oe1 = Oe1.ADD_IMAGE;
        int n4 = oe1.getViewType();
        String string2 = "inflate(...)";
        if (n3 == n4) {
            oe1 = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.reviews_image_add_item;
            viewGroup = oe1.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            recyclerView$B = new PO2$a(this, (View)viewGroup);
        } else {
            oe1 = LayoutInflater.from((Context)viewGroup.getContext());
            int n8 = R$layout.reviews_images_list_item;
            viewGroup = oe1.inflate(n8, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            recyclerView$B = new PO2$b(this, (View)viewGroup);
        }
        return recyclerView$B;
    }
}

