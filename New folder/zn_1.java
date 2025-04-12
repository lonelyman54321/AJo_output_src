/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.widget.SeekBar
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2$i;
import androidx.viewpager2.widget.b;
import com.ril.ajio.R$id;
import com.ril.ajio.cart.cartlist.util.WrapperLinearLayoutManager;
import com.ril.ajio.data.repo.CartRepo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZN
 */
public final class zn_1
extends RecyclerView$B {
    public static final /* synthetic */ int h;
    public final Context a;
    public final dn_1 b;
    public final ViewPager2 c;
    public RecyclerView d;
    public final j82_0 e;
    public final TextView f;
    public final SeekBar g;

    public zn_1(View object, j82_0 object2, Context object3, dn_1 dn_12) {
        String string2 = "itemView";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, "onCartClickListener");
        String string3 = "context";
        Intrinsics.checkNotNullParameter(object3, string3);
        super((View)object);
        this.a = object3;
        this.b = dn_12;
        this.e = object2;
        Intrinsics.checkNotNullParameter(object, string2);
        boolean n3 = og1_1.b();
        int n4 = 14;
        if (n3) {
            this.w();
            object = this.d;
            if (object != null) {
                int n7 = mz3_0.d(16);
                n4 = mz3_0.d(n4);
                object2 = new lo_1(n7, n4);
                object.addItemDecoration((RecyclerView$n)object2);
            }
        } else {
            object2 = CartRepo.INSTANCE;
            boolean bl2 = ((CartRepo)object2).isOOSimilarEnabled();
            if (bl2) {
                int n8;
                int n10 = R$id.oosRv;
                object2 = (ViewPager2)object.findViewById(n10);
                this.c = object2;
                int n14 = R$id.oosCountTv;
                object2 = (TextView)object.findViewById(n14);
                this.f = object2;
                int n15 = R$id.progressIndicator;
                object = (SeekBar)object.findViewById(n15);
                this.g = object;
                if (object != null && (object = object.getThumb()) != null) {
                    object = object.mutate();
                } else {
                    n8 = 0;
                    object = null;
                }
                boolean bl3 = false;
                object2 = null;
                if (object != null && (object = this.g) != null && (object = object.getThumb()) != null && (object = object.mutate()) != null) {
                    object.setAlpha(0);
                }
                if ((object = this.g) != null) {
                    n4 = 1;
                    object.setProgress(n4);
                }
                if ((object = this.g) != null) {
                    object3 = new Object();
                    object.setOnTouchListener((View.OnTouchListener)object3);
                }
                if ((object = this.c) != null) {
                    object.setClipToPadding(false);
                    object.setClipChildren(false);
                    int n16 = 2;
                    object.setOffscreenPageLimit(n16);
                }
                n8 = mz3_0.d(6);
                object2 = new b(n8);
                object = this.c;
                if (object != null) {
                    object.setPageTransformer((ViewPager2$i)object2);
                }
                if ((object = this.c) != null) {
                    n4 = -9;
                    int n17 = mz3_0.d(n4);
                    n4 = mz3_0.d(n4);
                    object2 = new mo_2(n17, n4);
                    object = object.j;
                    object.addItemDecoration((RecyclerView$n)object2);
                }
            } else {
                this.w();
                object = this.d;
                if (object != null) {
                    n4 = mz3_0.d(n4);
                    int n18 = mz3_0.d(12);
                    object2 = new lo_1(n4, n18);
                    object.addItemDecoration((RecyclerView$n)object2);
                }
            }
        }
    }

    public final void w() {
        Object object = this.itemView;
        int n3 = R$id.oosRv;
        object = (RecyclerView)object.findViewById(n3);
        this.d = object;
        Object object2 = this.a;
        object = new WrapperLinearLayoutManager((Context)object2);
        n3 = 0;
        ((LinearLayoutManager)object).setOrientation(0);
        object2 = this.d;
        if (object2 != null) {
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object);
        }
    }
}

