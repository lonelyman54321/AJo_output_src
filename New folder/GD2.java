/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.E$b;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$style;
import com.ril.ajio.services.data.user.UserInformation;
import java.util.Timer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class GD2
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public static final GD2$a Companion;
    public String a;
    public ConstraintLayout b;
    public ConstraintLayout c;
    public kd2_0 d;
    public RecyclerView e;
    public j3_0 f;
    public ShimmerFrameLayout g;
    public ConstraintLayout h;
    public Timer i;
    public String j;

    static {
        GD2$a gD2$a;
        Companion = gD2$a = new Object();
    }

    public final int getTheme() {
        String string2 = this.j;
        String string3 = ld3_2.STORE_AJIOGRAM.getStoreId();
        int n3 = Intrinsics.areEqual(string2, string3);
        string3 = this.a;
        String string4 = "PDP";
        boolean bl2 = Intrinsics.areEqual(string3, string4);
        n3 = !bl2 && !(bl2 = Intrinsics.areEqual(string3 = this.a, string4 = "PLP")) ? R$style.RatingBottomSheetFragment : (n3 != 0 ? R$style.FleekRatingBottomSheetFragment : R$style.RatingBottomSheetFragment);
        return n3;
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof j3_0;
        if (bl2) {
            object = (j3_0)object;
            this.f = object;
            return;
        }
        object = pn_2.b(object, "must implement ActivityFragmentListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onClick(View object) {
        int n3;
        int n4;
        if (object != null) {
            n4 = object.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n7 = R$id.cancelBtn;
        if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
            this.dismiss();
        } else {
            n7 = R$id.tv_continue;
            if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
                this.dismiss();
            } else {
                n7 = R$id.tv_skip;
                if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
                    this.dismiss();
                } else {
                    n7 = R$id.rate_other_product_txt;
                    if (object != null && (n4 = ((Integer)object).intValue()) == n7) {
                        object = this.f;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                            n4 = 0;
                            object = null;
                        }
                        String string2 = "RatingFeedbackFragment";
                        n3 = 62;
                        object.onFragmentInteraction(string2, n3, null);
                        this.dismiss();
                    }
                }
            }
        }
    }

    public final void onCreate(Bundle object) {
        Object object2;
        super.onCreate((Bundle)object);
        object = this.getArguments();
        Object object3 = null;
        if (object != null) {
            object2 = "RATING_PAGE_SOURCE";
            object = object.getString((String)object2);
        } else {
            object = null;
        }
        this.a = object;
        object = this.getArguments();
        if (object != null) {
            object3 = object.getString("STORE_ID");
        }
        this.j = object3;
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        object3 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object2 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object3, "store");
        Intrinsics.checkNotNullParameter(object2, "factory");
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        Class<kd2_0> clazz = kd2_0.class;
        String string2 = "modelClass";
        object = rl3_0.b((rd3_0)object3, (E$b)object2, (Wd0)object, clazz, string2);
        object3 = ef0_0.a(clazz, string2, string2, "<this>");
        object2 = object3.getQualifiedName();
        if (object2 != null) {
            object2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object2);
            this.d = object = (kd2_0)((pD3)object).a((yn1_2)object3, (String)object2);
            return;
        }
        object3 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object3);
        throw object;
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        FD2 fD2 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)fD2);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_rating_submitted_dialog;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroyView() {
        Timer timer = this.i;
        if (timer != null) {
            timer.cancel();
        }
        super.onDestroyView();
    }

    public final void onViewCreated(View object, Bundle object2) {
        block20: {
            boolean bl2;
            String string2;
            int n3;
            Object object3;
            int n4;
            Object object4;
            block23: {
                block21: {
                    block22: {
                        object4 = "view";
                        Intrinsics.checkNotNullParameter(object, (String)object4);
                        super.onViewCreated((View)object, (Bundle)object2);
                        n4 = R$id.cancelBtn;
                        object2 = (ImageView)object.findViewById(n4);
                        if (object2 != null) {
                            object2.setOnClickListener((View.OnClickListener)this);
                        }
                        if ((object2 = (TextView)object.findViewById(n4 = R$id.tv_continue)) != null) {
                            object2.setOnClickListener((View.OnClickListener)this);
                        }
                        n4 = R$id.feedback_container_homepage;
                        object2 = (ConstraintLayout)object.findViewById(n4);
                        this.b = object2;
                        n4 = R$id.feedback_container_other;
                        object2 = (ConstraintLayout)object.findViewById(n4);
                        this.c = object2;
                        n4 = R$id.feedback_rating_list;
                        object2 = (RecyclerView)object.findViewById(n4);
                        this.e = object2;
                        n4 = R$id.tv_skip;
                        object2 = (TextView)object.findViewById(n4);
                        if (object2 != null) {
                            object2.setOnClickListener((View.OnClickListener)this);
                        }
                        if ((object2 = (TextView)object.findViewById(n4 = R$id.rate_other_product_txt)) != null) {
                            object2.setOnClickListener((View.OnClickListener)this);
                        }
                        n4 = R$id.frame_shimmer_feedback;
                        object2 = (ShimmerFrameLayout)object.findViewById(n4);
                        this.g = object2;
                        n4 = R$id.unrated_items_container;
                        object = (ConstraintLayout)object.findViewById(n4);
                        this.h = object;
                        object = this.a;
                        if (object == null) break block20;
                        n4 = object.hashCode();
                        int n7 = -1241485741;
                        object3 = "ORDER_LISTING";
                        n3 = 8;
                        string2 = "ORDER_DETAILS";
                        if (n4 == n7) break block21;
                        n7 = 79068;
                        if (n4 == n7) break block22;
                        n7 = 134260241;
                        if (n4 == n7 && (bl2 = object.equals(string2))) break block23;
                        break block20;
                    }
                    object2 = "PDP";
                    boolean bl3 = object.equals(object2);
                    if (bl3) {
                        object = this.b;
                        if (object != null) {
                            object.setVisibility(0);
                        }
                        if ((object = this.c) != null) {
                            object.setVisibility(n3);
                        }
                    }
                    break block20;
                }
                bl2 = object.equals(object3);
                if (!bl2) break block20;
            }
            if ((object = this.b) != null) {
                object.setVisibility(n3);
            }
            if ((object = this.c) != null) {
                object.setVisibility(0);
            }
            if ((object = this.getContext()) == null || (bl2 = (object = UserInformation.getInstance(this.getContext())).isUserOnline())) {
                Object object5;
                object = this.d;
                if (object != null && (object = object.b) != null) {
                    object2 = this.getViewLifecycleOwner();
                    n3 = 2;
                    object4 = new p8_0(this, n3);
                    object5 = new GD2$b((p8_0)object4);
                    object.e((mu1_1)object2, (F62)object5);
                }
                hv3_0.p0(this.g);
                object = this.a;
                n4 = (int)(Intrinsics.areEqual(object, object3) ? 1 : 0);
                object4 = "60";
                if (n4 != 0) {
                    cp_1.Companion.getClass();
                    cp$a.e().getClass();
                    object = "OLP";
                    object4 = cp_1.p((String)object, (String)object4);
                } else {
                    bl2 = Intrinsics.areEqual(object, string2);
                    if (bl2) {
                        cp_1.Companion.getClass();
                        cp$a.e().getClass();
                        object = "ODP";
                        object4 = cp_1.p((String)object, (String)object4);
                    }
                }
                object = this.d;
                if (object != null) {
                    Intrinsics.checkNotNullParameter(object4, "lastXDaysOrder");
                    object2 = sE2.a((String)object4);
                    object4 = new jd2_0(object, 0);
                    object3 = new hp2_0(1, (Function1)object4);
                    n3 = 2;
                    object4 = new F61(object, n3);
                    object5 = new fr_1(object4);
                    object2 = ((g53_0)object2).f((o60_0)object3, (o60_0)object5);
                    object = object.a;
                    object.b((yr0_2)object2);
                }
            }
        }
    }
}

