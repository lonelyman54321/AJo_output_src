/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Build$VERSION
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
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.D;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2$g;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.ratings.PopUpImageModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

public final class EO2
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public static final EO2$a Companion;
    public final ArrayList A;
    public boolean B;
    public final D a;
    public Product b;
    public final String c;
    public final String d;
    public final String e;
    public Context f;
    public ArrayList g;
    public String h;
    public Integer i;
    public View j;
    public TextView k;
    public TextView l;
    public CardView m;
    public TextView n;
    public TextView o;
    public TextView p;
    public ConstraintLayout q;
    public ImageView r;
    public ImageView s;
    public ImageView t;
    public ViewPager2 u;
    public CO2 v;
    public int w;
    public int x;
    public int y;
    public boolean z;

    static {
        EO2$a eO2$a;
        Companion = eO2$a = new Object();
    }

    public EO2() {
        ArrayList arrayList = Reflection.getOrCreateKotlinClass(yh0_0.class);
        EO2$b eO2$b = new EO2$b(this);
        EO2$c eO2$c = new EO2$c(this);
        EO2$d eO2$d = new EO2$d(this);
        arrayList = LW0.a(this, (yn1_2)((Object)arrayList), eO2$b, eO2$c, eO2$d);
        this.a = arrayList;
        this.c = "right swipe";
        this.d = "left swipe";
        this.e = "cross";
        arrayList = new ArrayList();
        this.g = arrayList;
        this.h = "";
        arrayList = 10;
        this.i = arrayList;
        this.A = arrayList = new ArrayList();
    }

    public final void Oa() {
        block18: {
            Object object;
            Object object2;
            int n3;
            String string2;
            Object object3;
            int n4;
            Object object4;
            block20: {
                block19: {
                    object4 = this.A;
                    n4 = this.w;
                    if ((object4 = (PopUpImageModel)CollectionsKt.N(n4, (List)object4)) == null) break block18;
                    object3 = this.k;
                    if (object3 != null) {
                        string2 = ((PopUpImageModel)object4).getReviewTitle();
                        object3.setText((CharSequence)string2);
                    }
                    object3 = ((PopUpImageModel)object4).getRating();
                    n3 = 8;
                    if (object3 == null) break block19;
                    object3 = ((PopUpImageModel)object4).getRating();
                    object2 = null;
                    n4 = (int)(Intrinsics.areEqual((Float)object3, 0.0f) ? 1 : 0);
                    if (n4 == 0) break block20;
                }
                if ((object3 = this.m) != null) {
                    object3.setVisibility(n3);
                }
            }
            object3 = ((PopUpImageModel)object4).getRating();
            object2 = null;
            if (object3 != null) {
                float f5 = object3.floatValue();
                object = this.m;
                if (object != null) {
                    object.setVisibility(0);
                }
                if ((object = this.l) != null) {
                    int n7 = (int)f5;
                    String string3 = String.valueOf(n7);
                    object.setText(string3);
                }
                cp_1.Companion.getClass();
                object = cp$a.e();
                double d2 = f5;
                object3 = this.q;
                Context context = this.f;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                    context = null;
                }
                ((Object)object).getClass();
                cp_1.D(d2, (View)object3, context, null);
            }
            if ((object3 = this.n) != null) {
                object = ((PopUpImageModel)object4).getReviewText();
                object3.setText((CharSequence)object);
            }
            if ((object3 = ((PopUpImageModel)object4).getImageStatus()) != null) {
                object2 = Locale.ROOT;
                object2 = object3.toUpperCase((Locale)object2);
                object3 = "toUpperCase(...)";
                Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
            }
            if ((n4 = (int)(Intrinsics.areEqual(object2, object3 = "REJECTED") ? 1 : 0)) != 0) {
                object3 = this.o;
                if (object3 != null) {
                    n3 = R$string.label_reject_reason;
                    string2 = this.getString(n3);
                    object4 = ((PopUpImageModel)object4).getImageStatusReason();
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(string2);
                    string2 = " ";
                    ((StringBuilder)object2).append(string2);
                    ((StringBuilder)object2).append((String)object4);
                    object4 = ((StringBuilder)object2).toString();
                    object3.setText((CharSequence)object4);
                }
                if ((object4 = this.o) != null) {
                    object4.setVisibility(0);
                }
                if ((object4 = this.o) != null) {
                    ai0_2.a((View)object4);
                }
            } else {
                object4 = this.o;
                if (object4 != null) {
                    object4.setVisibility(n3);
                }
            }
        }
    }

    public final void Pa() {
        Object object;
        Object object2;
        int n3;
        int n4 = this.w;
        ArrayList arrayList = this.A;
        int n7 = 1;
        if (n4 >= 0 && n4 < (n3 = arrayList.size())) {
            n4 = this.w;
            Object object3 = (PopUpImageModel)arrayList.get(n4);
            object2 = this.r;
            if (object2 != null) {
                object = new da$a();
                ((da$a)object).k = n7;
                ((da$a)object).g = n7;
                ((da$a)object).n = object3 = ((PopUpImageModel)object3).getImageUrl();
                ((da$a)object).u = object2;
                ((da$a)object).a();
            }
            this.Qa();
        }
        if ((n4 = (int)(this.z ? 1 : 0)) == 0) {
            n4 = arrayList.size();
            int n8 = this.w;
            if ((n4 -= n8) < (n8 = 5) && (n4 = this.x) < (n8 = this.y) && (n8 = (int)(this.B ? 1 : 0)) == 0) {
                Object object4;
                this.x = n4 += n7;
                this.B = n7;
                String string2 = this.h;
                n4 = 3;
                n8 = 0;
                arrayList = null;
                if (string2 != null && (object4 = this.i) != null) {
                    wh0_1 wh0_12;
                    int n10 = ((Number)object4).intValue();
                    object = object4 = this.a.getValue();
                    object = (yh0_0)object4;
                    int n14 = this.x;
                    object.getClass();
                    Intrinsics.checkNotNullParameter(string2, "optionCode");
                    object4 = md3_0.c((jD3)object);
                    object2 = wh0_12;
                    wh0_12 = new wh0_1((yh0_0)object, n14, n10, string2, null);
                    Ae3.d((i90_0)object4, null, null, wh0_12, n4);
                }
                object4 = nu1_0.a(this);
                object2 = new FO2(this, null);
                Ae3.d((i90_0)object4, null, null, (Function2)object2, n4);
            }
        }
    }

    public final void Qa() {
        ImageView imageView;
        int n3 = this.w;
        Object object = this.A;
        int n4 = ((ArrayList)object).size() + -1;
        int n7 = 8;
        if (n3 == n4 && (imageView = this.s) != null) {
            imageView.setVisibility(n7);
        }
        if ((n3 = this.w) == 0 && (imageView = this.t) != null) {
            imageView.setVisibility(n7);
        }
        n3 = this.w;
        n4 = ((ArrayList)object).size() + -1;
        n7 = 0;
        if (n3 < n4 && ((imageView = this.s) == null || (n3 = imageView.getVisibility()) != 0) && (imageView = this.s) != null) {
            imageView.setVisibility(0);
        }
        if ((n3 = this.w) > 0 && ((imageView = this.t) == null || (n3 = imageView.getVisibility()) != 0) && (imageView = this.t) != null) {
            imageView.setVisibility(0);
        }
        if ((n3 = ((ArrayList)object).size()) > 0 && (imageView = this.p) != null) {
            n4 = this.w;
            object = ((PopUpImageModel)((ArrayList)object).get(n4)).getCountText();
            imageView.setText((CharSequence)object);
        }
    }

    public final void Ra(String string2) {
        Object object;
        Object object2;
        Object object3 = this.b;
        Object object4 = LD2.a;
        object4 = "";
        if (object3 == null || (object2 = ((Product)object3).getCode()) == null) {
            object2 = object4;
        }
        if (object3 == null || (object = ((Product)object3).getName()) == null) {
            object = object4;
        }
        if (object3 != null && (object3 = ((Product)object3).getBrickCode()) != null) {
            object4 = object3;
        }
        LD2.c("photo interaction", string2, (String)object2, (String)object, (String)object4);
    }

    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.f = context;
    }

    public final void onClick(View object) {
        Object object2 = "v";
        Intrinsics.checkNotNullParameter(object, object2);
        int n3 = object.getId();
        int n4 = R$id.id_review_image_close_dialog;
        if (n3 == n4) {
            object = this.e;
            this.Ra((String)object);
            this.dismiss();
        } else {
            n4 = R$id.iv_next;
            if (n3 == n4) {
                this.w = n3 = this.w + 1;
                object = this.t;
                if (object != null) {
                    object.setVisibility(0);
                }
                if ((object = this.u) != null) {
                    n4 = this.w;
                    ((ViewPager2)((Object)object)).setCurrentItem(n4);
                }
                object = this.d;
                this.Ra((String)object);
                this.Qa();
            } else {
                n4 = R$id.iv_prev;
                if (n3 == n4) {
                    this.w = n3 = this.w + -1;
                    object2 = this.u;
                    if (object2 != null) {
                        ((ViewPager2)((Object)object2)).setCurrentItem(n3);
                    }
                    if ((object = this.s) != null) {
                        object.setVisibility(0);
                    }
                    object = this.c;
                    this.Ra((String)object);
                    this.Qa();
                }
            }
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        DO2 dO2 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)dO2);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        int n3;
        Object object2;
        int n4;
        String string2;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        object = this.getArguments();
        int n7 = -1;
        if (object != null) {
            string2 = "current_index";
            n4 = object.getInt(string2);
        } else {
            n4 = -1;
        }
        this.w = n4;
        if (object != null) {
            string2 = "current_page";
            n4 = object.getInt(string2);
        } else {
            n4 = -1;
        }
        this.x = n4;
        if (object != null) {
            object2 = "total_pages";
            n7 = object.getInt((String)object2);
        }
        this.y = n7;
        if (object != null) {
            object2 = "is_from_ODP";
            n7 = (int)(object.getBoolean((String)object2) ? 1 : 0);
        } else {
            n7 = 1;
        }
        this.z = n7;
        if (object == null || (object2 = (n7 = Build.VERSION.SDK_INT) >= (n4 = 33) ? s40_0.b((Bundle)object) : object.getParcelableArrayList("user_reviews")) == null) {
            object2 = new ArrayList();
        }
        this.g = object2;
        if (object == null || (object2 = object.getString("OptionCode")) == null) {
            object2 = "";
        }
        this.h = object2;
        if (object != null) {
            object2 = "PageSize";
            n3 = object.getInt((String)object2);
            object = n3;
        } else {
            n3 = 0;
            object = null;
        }
        this.i = object;
        object = this.A;
        ((ArrayList)object).clear();
        object2 = OD2.b(this.g);
        ((ArrayList)object).addAll(object2);
        n3 = R$layout.review_image_bottom_sheet;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
    }

    public final void onViewCreated(View object, Bundle object2) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.id_review_image_close_dialog;
        object2 = object.findViewById(n3);
        this.j = object2;
        n3 = R$id.tv_review_title_date;
        object2 = (TextView)object.findViewById(n3);
        this.k = object2;
        n3 = R$id.tv_review_text;
        object2 = (TextView)object.findViewById(n3);
        this.n = object2;
        n3 = R$id.tv_count;
        object2 = (TextView)object.findViewById(n3);
        this.p = object2;
        n3 = R$id.tv_rating_text;
        object2 = (TextView)object.findViewById(n3);
        this.l = object2;
        n3 = R$id.cv_rating;
        object2 = (CardView)object.findViewById(n3);
        this.m = object2;
        n3 = R$id.layout_rating_parent;
        object2 = (ConstraintLayout)object.findViewById(n3);
        this.q = object2;
        n3 = R$id.vp_review_image;
        object2 = (ViewPager2)object.findViewById(n3);
        this.u = object2;
        n3 = R$id.iv_review;
        object2 = (ImageView)object.findViewById(n3);
        this.r = object2;
        n3 = R$id.tv_error_msg;
        object2 = (TextView)object.findViewById(n3);
        this.o = object2;
        n3 = R$id.iv_next;
        object2 = (ImageView)object.findViewById(n3);
        this.s = object2;
        n3 = R$id.iv_prev;
        object = (ImageView)object.findViewById(n3);
        this.t = object;
        object = this.j;
        if (object != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        if ((object = this.s) != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        if ((object = this.t) != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        this.Oa();
        object = new CO2();
        this.v = object;
        object2 = this.A;
        string2 = "imageList";
        Intrinsics.checkNotNullParameter(object2, string2);
        ((CO2)object).a.addAll(object2);
        object = this.u;
        if (object != null) {
            object2 = this.v;
            ((ViewPager2)((Object)object)).setAdapter((RecyclerView$f)object2);
        }
        object = this.u;
        n3 = 0;
        object2 = null;
        if (object != null) {
            object.setClipChildren(false);
        }
        object = this.u;
        int n4 = 2;
        if (object != null) {
            ((ViewPager2)((Object)object)).setOffscreenPageLimit(n4);
        }
        if ((object = this.u) != null) {
            int n7 = this.w;
            ((ViewPager2)((Object)object)).setCurrentItem(n7, false);
        }
        if ((object = this.u) != null && (object = object.getChildAt(n3 = this.w)) != null) {
            object.setOverScrollMode(n4);
        }
        if ((object = this.u) != null) {
            object2 = new GO2(this);
            ((ViewPager2)((Object)object)).f((ViewPager2$g)object2);
        }
        this.Pa();
    }
}

