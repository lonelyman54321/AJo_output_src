/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.ratings.RatingsModel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from ue1
 */
public final class ue1_2
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public static final ue1$a Companion;
    public View a;
    public View b;
    public View c;
    public boolean d = true;
    public TextView e;
    public TextView f;
    public TextView g;
    public JU2 h;
    public String i;
    public RatingsModel j;

    static {
        ue1$a ue1$a;
        Companion = ue1$a = new Object();
    }

    public final void onClick(View view) {
        ue1_2 ue1_22 = this;
        Object object = "v";
        Object object2 = view;
        Intrinsics.checkNotNullParameter(view, (String)object);
        int n3 = view.getId();
        int n4 = R$id.layout_upload_photo;
        String string2 = null;
        Object object3 = "RATINGS_REVIEW_PAGE";
        if (n3 == n4) {
            n3 = (int)(h40_0.l2() ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(Intrinsics.areEqual(object = this.i, object3) ? 1 : 0)) != 0) {
                object = LD2.a;
                object = this.j;
                if (object != null) {
                    object = ((RatingsModel)object).getOrderId();
                } else {
                    n3 = 0;
                    object = null;
                }
                object2 = ue1_22.j;
                if (object2 != null) {
                    object2 = ((RatingsModel)object2).getSkuId();
                } else {
                    n4 = 0;
                    object2 = null;
                }
                object3 = ue1_22.j;
                object3 = object3 != null ? ((RatingsModel)object3).getBrandName() : null;
                Object object4 = ue1_22.j;
                if (object4 != null) {
                    string2 = ((RatingsModel)object4).getProductBrick();
                }
                object4 = AnalyticsManager.Companion;
                String string3 = av_0.a((AnalyticsManager$Companion)object4);
                String string4 = av_0.a((AnalyticsManager$Companion)object4);
                String string5 = bv_0.a((AnalyticsManager$Companion)object4);
                Bundle bundle = LD2.a((String)object, (String)object2, (String)object3, string2);
                String string6 = cv_0.a((AnalyticsManager$Companion)object4);
                NewCustomEventsRevamp newCustomEventsRevamp = LD2.a;
                String string7 = "reviews & ratings interactions";
                String string8 = "Add a photo";
                String string9 = "select from gallery";
                String string10 = "reviews_rating_interactions";
                int n7 = 1536;
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string7, string8, string9, string10, string3, string4, string5, bundle, string6, false, null, n7, null);
            }
            ue1_22.d = false;
            this.dismiss();
            object = ue1_22.h;
            if (object != null) {
                object.h3();
            }
        } else {
            n4 = R$id.layout_click_photo;
            if (n3 == n4) {
                n3 = (int)(h40_0.l2() ? 1 : 0);
                if (n3 != 0 && (n3 = (int)(Intrinsics.areEqual(object = this.i, object3) ? 1 : 0)) != 0) {
                    object = LD2.a;
                    object = this.j;
                    if (object != null) {
                        object = ((RatingsModel)object).getOrderId();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    object2 = ue1_22.j;
                    if (object2 != null) {
                        object2 = ((RatingsModel)object2).getSkuId();
                    } else {
                        n4 = 0;
                        object2 = null;
                    }
                    object3 = ue1_22.j;
                    object3 = object3 != null ? ((RatingsModel)object3).getBrandName() : null;
                    Object object5 = ue1_22.j;
                    if (object5 != null) {
                        string2 = ((RatingsModel)object5).getProductBrick();
                    }
                    object5 = AnalyticsManager.Companion;
                    String string11 = av_0.a((AnalyticsManager$Companion)object5);
                    String string12 = av_0.a((AnalyticsManager$Companion)object5);
                    String string13 = bv_0.a((AnalyticsManager$Companion)object5);
                    Bundle bundle = LD2.a((String)object, (String)object2, (String)object3, string2);
                    String string14 = cv_0.a((AnalyticsManager$Companion)object5);
                    NewCustomEventsRevamp newCustomEventsRevamp = LD2.a;
                    String string15 = "reviews & ratings interactions";
                    String string16 = "Add a photo";
                    String string17 = "click a photo";
                    String string18 = "reviews_rating_interactions";
                    int n8 = 1536;
                    NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string15, string16, string17, string18, string11, string12, string13, bundle, string14, false, null, n8, null);
                }
                ue1_22.d = false;
                this.dismiss();
                object = ue1_22.h;
                if (object != null) {
                    object.r3();
                }
            } else {
                n4 = R$id.id_image_search_close_dialog;
                if (n3 == n4) {
                    n3 = 1;
                    this.d = n3;
                    this.dismiss();
                }
            }
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        te1_0 te1_02 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)te1_02);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        object = this.i;
        String string2 = "RATINGS_REVIEW_PAGE";
        int n3 = kotlin.text.b.i((String)object, string2, false);
        if (n3 != 0) {
            n3 = R$layout.image_search_old_bottom_sheet;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.image_search_bottom_sheet;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onDismiss(DialogInterface object) {
        String string2 = "dialog";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onDismiss((DialogInterface)object);
        object = this.h;
        if (object != null) {
            boolean bl2 = this.d;
            object.f0(bl2);
        }
    }

    public final void onViewCreated(View object, Bundle object2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.id_image_search_title;
        object2 = (TextView)object.findViewById(n3);
        this.f = object2;
        n3 = R$id.id_image_search_sub_text;
        object2 = (TextView)object.findViewById(n3);
        this.e = object2;
        n3 = R$id.layout_upload_photo_title;
        object2 = (TextView)object.findViewById(n3);
        this.g = object2;
        n3 = R$id.layout_click_photo;
        object2 = object.findViewById(n3);
        this.a = object2;
        n3 = R$id.layout_upload_photo;
        object2 = object.findViewById(n3);
        this.b = object2;
        n3 = R$id.id_image_search_close_dialog;
        object2 = object.findViewById(n3);
        this.c = object2;
        n3 = R$id.layout_parent_image_search;
        object = (ConstraintLayout)object.findViewById(n3);
        Object object3 = Looper.getMainLooper();
        object2 = new Handler(object3);
        int n4 = 1;
        object3 = new rw0_2(object, n4);
        long l2 = 100;
        object2.postDelayed((Runnable)object3, l2);
        object = this.a;
        if (object != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        if ((object = this.b) != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        if ((object = this.c) != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        if (bl2 = Intrinsics.areEqual(object = this.i, object2 = "RATINGS_REVIEW_PAGE")) {
            object = this.f;
            if (object != null) {
                n3 = R$string.upload_image;
                object2 = this.getString(n3);
                object.setText((CharSequence)object2);
            }
            if ((object = this.e) != null) {
                n3 = R$string.review_images_count_text;
                object2 = this.getString(n3);
                object.setText((CharSequence)object2);
            }
            if ((object = this.g) != null) {
                n3 = R$string.select_from_gallery;
                object2 = this.getString(n3);
                object.setText((CharSequence)object2);
            }
        }
    }
}

