/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.recyclerview.widget.RecyclerView$y;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Yh2
 */
public final class yh2_0
extends RecyclerView$B
implements View.OnClickListener {
    public final View a;
    public final q82_0 b;
    public final View c;
    public final LinearLayoutManager d;
    public final RecyclerView e;
    public final View f;
    public final View g;
    public final AjioTextView h;
    public final AjioTextView i;
    public final AjioImageView j;
    public final AjioImageView k;
    public int l;
    public j12_0 m;

    public yh2_0(View object, q82_0 object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(object2, "onColorClickListener");
        super((View)object);
        this.a = object;
        this.b = object2;
        Intrinsics.checkNotNullParameter(object, "itemView");
        this.c = object;
        int n3 = R$id.pdp_rv_color;
        this.e = object2 = (RecyclerView)object.findViewById(n3);
        Object object3 = object.getContext();
        LinearLayoutManager linearLayoutManager = null;
        this.d = object2 = new LinearLayoutManager((Context)object3, 0, false);
        object2 = this.e;
        object3 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mColorRv");
            n3 = 0;
            object2 = null;
        }
        if ((linearLayoutManager = this.d) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mColorLayoutManager");
            linearLayoutManager = null;
        }
        ((RecyclerView)object2).setLayoutManager(linearLayoutManager);
        n3 = R$id.color_top_divider;
        object2 = object.findViewById(n3);
        this.f = object2;
        n3 = R$id.pdp_color_layout;
        object2 = object.findViewById(n3);
        this.g = object2;
        n3 = R$id.pdp_tv_selected_color;
        this.h = object2 = (AjioTextView)object.findViewById(n3);
        n3 = R$id.pdp_tv_title;
        this.i = object2 = (AjioTextView)object.findViewById(n3);
        if (object2 == null) {
            object2 = "titleTV";
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            object3 = object2;
        }
        ai0_2.t((View)object3);
        object2 = h40_0.a;
        n3 = (int)(h40_0.s1() ? 1 : 0);
        if (n3 != 0 && (n3 = (int)(og1_1.c() ? 1 : 0)) == 0) {
            n3 = R$id.pdp_Imv_prev_color;
            object2 = (AjioImageView)object.findViewById(n3);
            this.j = object2;
            n3 = R$id.pdp_Imv_next_color;
            object = (AjioImageView)object.findViewById(n3);
            this.k = object;
        }
    }

    public final void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "v");
    }

    public final void w(String object, String object2, ArrayList object3) {
        int n3;
        int n4;
        LinearLayoutManager linearLayoutManager = this.d;
        View view = this.g;
        int n7 = 1;
        RecyclerView recyclerView = this.e;
        Object object4 = this.h;
        if (object3 == null) {
            return;
        }
        this.l = n4 = ((ArrayList)object3).size();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(object3);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        int n8 = 8;
        int n10 = 0;
        String string2 = "selectedColorTv";
        if (!bl2) {
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object3 = null;
            } else {
                object3 = object4;
            }
            object3.setText((CharSequence)object);
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            } else {
                object = object4;
            }
            object.setVisibility(0);
            object = this.f;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dividerView");
                n3 = 0;
                object = null;
            }
            object.setVisibility(0);
        } else {
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            } else {
                object = object4;
            }
            object.setVisibility(n8);
        }
        object = h40_0.a;
        n3 = h40_0.s1();
        if (n3 != 0 && (n3 = og1_1.c()) == 0) {
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            } else {
                object = object4;
            }
            object.setVisibility(n8);
        }
        n3 = arrayList.size();
        object3 = "colorLayout";
        if (n3 > 0) {
            int n14;
            object = this.m;
            String string3 = "mColorRv";
            if (object == null) {
                if (object2 != null && (n3 = ((String)object2).length()) != 0) {
                    object = this.i;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("titleTV");
                        n3 = 0;
                        object = null;
                    }
                    object.setText((CharSequence)object2);
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        object4 = null;
                    }
                    object4.setVisibility(n8);
                    n3 = 0;
                    object = null;
                } else {
                    n3 = 1;
                }
                object4 = this.b;
                this.m = object2 = new j12_0((q82_0)object4, arrayList, n3 != 0);
                if (recyclerView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n3 = 0;
                    object = null;
                } else {
                    object = recyclerView;
                }
                object2 = this.m;
                ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
                n3 = h40_0.s1();
                if (n3 != 0 && (n3 = (int)(og1_1.c() ? 1 : 0)) == 0) {
                    if (recyclerView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        n3 = 0;
                        object = null;
                    } else {
                        object = recyclerView;
                    }
                    object2 = new xh2_1(this);
                    ((RecyclerView)object).addOnScrollListener((RecyclerView$s)object2);
                }
            } else {
                ((j12_0)object).b = arrayList;
                ((RecyclerView$f)object).notifyDataSetChanged();
            }
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                view = null;
            }
            view.setVisibility(0);
            n3 = -1;
            while (n10 < (n14 = arrayList.size())) {
                object2 = (ProductOptionVariant)arrayList.get(n10);
                n14 = (int)(((ProductOptionVariant)object2).isSelected() ? 1 : 0);
                if (n14 != 0) {
                    n3 = n10;
                }
                n10 += n7;
            }
            object2 = h40_0.a;
            n14 = (int)(h40_0.s1() ? 1 : 0);
            object3 = "mColorLayoutManager";
            if (n14 != 0 && (n14 = (int)(og1_1.c() ? 1 : 0)) == 0) {
                if (n3 >= 0) {
                    if (linearLayoutManager == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        linearLayoutManager = null;
                    }
                    if (recyclerView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        recyclerView = null;
                    }
                    object2 = new RecyclerView$y();
                    linearLayoutManager.smoothScrollToPosition(recyclerView, (RecyclerView$y)object2, n3);
                }
            } else {
                if (linearLayoutManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    linearLayoutManager = null;
                }
                linearLayoutManager.scrollToPosition(n3);
            }
        } else {
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                view = null;
            }
            view.setVisibility(n8);
        }
    }
}

