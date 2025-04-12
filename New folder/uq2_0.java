/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.D;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$id;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.rto.entity.RTOReasonData;
import com.ril.ajio.rto.entity.RtoFirebaseData;
import com.ril.ajio.rto.ui.RtoBottomSheet$setKeyboardVisibilityListener$1;
import com.ril.ajio.services.data.Order.RtoData;
import com.ril.ajio.services.data.Order.RtoResponseData;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from uQ2
 */
public class uq2_0
extends q61
implements H82 {
    public final D f;
    public jo_2 g;
    public TextView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public RecyclerView l;
    public RecyclerView m;
    public TextView n;
    public ConstraintLayout o;
    public NestedScrollView p;
    public int q;
    public ConstraintLayout r;
    public TextView s;
    public EditText t;
    public ImageView u;
    public ArrayList v;
    public final wQ2 w;
    public final zQ2 x;
    public String y;
    public String z;

    public uq2_0() {
        Object object = Reflection.getOrCreateKotlinClass(lq2_0.class);
        Object object2 = new uQ2$c(this);
        uQ2$d uQ2$d = new uQ2$d(this);
        uQ2$e uQ2$e = new uQ2$e(this);
        this.f = object = LW0.a(this, (yn1_2)object, (Function0)object2, uQ2$d, uQ2$e);
        object = new RecyclerView$f();
        ((wQ2)object).a = object2;
        this.w = object;
        object2 = new ta_0(this, 2);
        this.x = object = new zQ2((ta_0)object2);
        object = AnalyticsManager.Companion;
        this.y = object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp().getCurrentScreen();
        this.z = object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp().getCurrentScreenType();
    }

    public final lq2_0 Qa() {
        return (lq2_0)this.f.getValue();
    }

    public final void Ra(View object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "view");
        int n3 = R$id.txtSubmit;
        this.n = object2 = (TextView)object.findViewById(n3);
        n3 = R$id.tvTitle;
        this.h = object2 = (TextView)object.findViewById(n3);
        n3 = R$id.tvReason;
        this.i = object2 = (TextView)object.findViewById(n3);
        n3 = R$id.tvError;
        this.k = object2 = (TextView)object.findViewById(n3);
        n3 = R$id.tvDescription;
        this.j = object2 = (TextView)object.findViewById(n3);
        n3 = R$id.rvReasons;
        object2 = (RecyclerView)object.findViewById(n3);
        this.m = object2;
        n3 = R$id.rvProductImages;
        object2 = (RecyclerView)object.findViewById(n3);
        this.l = object2;
        n3 = R$id.ivClose;
        object2 = (ImageView)object.findViewById(n3);
        this.u = object2;
        n3 = R$id.layoutReason;
        object2 = (ConstraintLayout)object.findViewById(n3);
        this.r = object2;
        n3 = R$id.editReason;
        object2 = (EditText)object.findViewById(n3);
        this.t = object2;
        n3 = R$id.tvCount;
        this.s = object2 = (TextView)object.findViewById(n3);
        n3 = R$id.layoutSuccess;
        object2 = (ConstraintLayout)object.findViewById(n3);
        this.o = object2;
        n3 = R$id.scrollRto;
        object = (NestedScrollView)object.findViewById(n3);
        this.p = object;
        if (object != null && (object = object.getViewTreeObserver()) != null) {
            object2 = new RtoBottomSheet$setKeyboardVisibilityListener$1(this, this);
            object.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object2);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void Sa(WX0 wX0, int n3) {
        void var10_14;
        void var9_11;
        Object object;
        int n4;
        Object object2;
        uq2_0 uq2_02;
        block8: {
            Object object3;
            block9: {
                block6: {
                    block7: {
                        uq2_02 = this;
                        object2 = wX0;
                        Intrinsics.checkNotNullParameter((Object)wX0, "gaEventType");
                        object3 = uQ2$a.$EnumSwitchMapping$0;
                        int n7 = wX0.ordinal();
                        n4 = object3[n7];
                        n7 = 1;
                        object = "";
                        if (n4 == n7) break block6;
                        n7 = 2;
                        if (n4 == n7) break block7;
                        n7 = 3;
                        if (n4 != n7) {
                            n7 = 4;
                            if (n4 != n7) {
                                object3 = new NoWhenBranchMatchedException();
                                throw object3;
                            }
                            object3 = "close";
                        } else {
                            object3 = "success screen halfcut load";
                        }
                        Object object4 = object3;
                        String string2 = object;
                        break block8;
                    }
                    object3 = this.Qa().d;
                    if (object3 == null || (object3 = ((RtoResponseData)object3).getRtoData()) == null || (object3 = ((RtoData)object3).getCreated()) == null) {
                        object3 = object;
                    }
                    object2 = "halfcut screen load";
                    break block9;
                }
                object3 = this.Qa().c;
                if (object3 == null) {
                    object3 = object;
                }
                object2 = "reason submit";
            }
            Object object5 = object3;
            Object object6 = object2;
        }
        n4 = (int)(EQ2.a ? 1 : 0);
        n4 = uq2_02.q;
        object2 = this.Qa().d;
        if (object2 != null && (object2 = ((RtoResponseData)object2).getRtoData()) != null && (object2 = ((RtoData)object2).getReturnId()) != null) {
            object = object2;
        }
        String string3 = uq2_02.y;
        String string4 = uq2_02.z;
        Intrinsics.checkNotNullParameter(var9_11, "action");
        Intrinsics.checkNotNullParameter(var10_14, "label");
        Intrinsics.checkNotNullParameter(object, "returnId");
        Bundle bundle = dm_1.a(string3, "screenName", string4, "screenType");
        bundle.putInt("no_of_products", n3);
        bundle.putInt("rto_attempts", n4);
        bundle.putString("order_id", (String)object);
        NewCustomEventsRevamp.newPushCustomEvent$default(EQ2.b, "RTO delivery reason", (String)var9_11, (String)var10_14, "rto_interactions", string3, string3, string3, bundle, string4, false, null, 1536, null);
    }

    public final void W() {
        NestedScrollView nestedScrollView = this.p;
        if (nestedScrollView != null) {
            ai0_2.s(nestedScrollView);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int n3 = R$style.BottomSheetDialogThemeNoFloating;
        this.setStyle(0, n3);
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        tQ2 tQ22 = new tQ2((BottomSheetDialog)object);
        object.setOnShowListener((DialogInterface.OnShowListener)tQ22);
        return object;
    }

    public final void onResume() {
        int n3;
        Object object;
        int n4;
        int n7;
        Object object2;
        int n8;
        Object object3;
        uq2_0 uq2_02 = this;
        super.onResume();
        Context context = this.requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        Object object4 = new jo_2(context);
        this.g = object4;
        object4 = this.l;
        int n10 = 0;
        context = null;
        Object object5 = null;
        if (object4 != null) {
            object3 = this.getView();
            if (object3 != null) {
                object3 = object3.getContext();
            } else {
                n8 = 0;
                object3 = null;
            }
            object2 = new LinearLayoutManager((Context)object3, 0, false);
            ((RecyclerView)object4).setLayoutManager((RecyclerView$o)object2);
        }
        object4 = uq2_02.l;
        object2 = uq2_02.w;
        if (object4 != null) {
            ((RecyclerView)object4).setAdapter((RecyclerView$f)object2);
        }
        if ((object4 = uq2_02.l) != null && (n7 = ((RecyclerView)object4).getItemDecorationCount()) == 0 && (object4 = uq2_02.l) != null) {
            n4 = hv3_0.q(R$dimen.dimen_8);
            object3 = new RecyclerView$n();
            ((s91_0)object3).a = n4;
            ((RecyclerView)object4).addItemDecoration((RecyclerView$n)object3);
        }
        if ((object4 = uq2_02.m) != null) {
            object = this.getView();
            if (object != null) {
                object = object.getContext();
            } else {
                n4 = 0;
                object = null;
            }
            object3 = new LinearLayoutManager((Context)object);
            ((RecyclerView)object4).setLayoutManager((RecyclerView$o)object3);
        }
        object4 = uq2_02.m;
        object3 = uq2_02.x;
        if (object4 != null) {
            ((RecyclerView)object4).setAdapter((RecyclerView$f)object3);
        }
        if ((object4 = uq2_02.m) != null && (n7 = ((RecyclerView)object4).getItemDecorationCount()) == 0) {
            int n14;
            object4 = od3_2.a;
            n4 = ((String)object4).length();
            if (n4 == 0) {
                object4 = od3_2.a();
            }
            if ((n7 = (int)(Intrinsics.areEqual(object4, object = ld3_2.STORE_LUXE.getStoreId()) ? 1 : 0)) != 0) {
                object4 = uq2_02.m;
                if (object4 != null) {
                    n14 = hv3_0.q(R$dimen.dimen_16);
                    object = new xb3_2(n14);
                    ((RecyclerView)object4).addItemDecoration((RecyclerView$n)object);
                }
            } else {
                object4 = uq2_02.m;
                if (object4 != null) {
                    n14 = hv3_0.q(R$dimen.dimen_8);
                    object = new xb3_2(n14);
                    ((RecyclerView)object4).addItemDecoration((RecyclerView$n)object);
                }
            }
        }
        object4 = this.Qa();
        object = this.Qa().l;
        if (object != null && (object = ((RtoFirebaseData)object).getReasons()) != null) {
            object = kotlin.collections.a.c((ArrayList)object);
        } else {
            n4 = 0;
            object = null;
        }
        object4.getClass();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        if (object != null) {
            boolean bl2;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                Object object6;
                Object object7 = object6 = object.next();
                object7 = (String)object6;
                Boolean bl3 = Boolean.FALSE;
                int n15 = 4;
                object6 = new Object((String)object7, bl3, false, n15, null);
                arrayList.add(object6);
            }
            object4 = ((lq2_0)object4).l;
            Object object8 = object4 != null ? (object4 = ((RtoFirebaseData)object4).getReasonNotListedText()) : null;
            Boolean bl4 = Boolean.FALSE;
            int n16 = 4;
            object = new RTOReasonData((String)object8, bl4, false, n16, null);
            arrayList.add(object);
        }
        object3.getClass();
        Intrinsics.checkNotNullParameter(arrayList, "reasons");
        ((zQ2)object3).b = arrayList;
        ((RecyclerView$f)object3).notifyDataSetChanged();
        object4 = this.Qa().d;
        if (object4 != null && (object4 = ((RtoResponseData)object4).getRtoData()) != null) {
            object4 = ((RtoData)object4).getEntries();
        } else {
            n7 = 0;
            object4 = null;
        }
        uq2_02.v = object4;
        if (object4 != null && (object4 = CollectionsKt.f0((Iterable)object4, n8 = 5)) != null) {
            object2.getClass();
            object3 = "imageList";
            Intrinsics.checkNotNullParameter(object4, (String)object3);
            ((wQ2)object2).a = object4;
            ((RecyclerView$f)object2).notifyDataSetChanged();
        }
        if ((object4 = uq2_02.h) != null) {
            object2 = this.Qa().l;
            if (object2 != null) {
                object2 = ((RtoFirebaseData)object2).getTitle();
            } else {
                n3 = 0;
                object2 = null;
            }
            object4.setText((CharSequence)object2);
        }
        if ((object4 = uq2_02.i) != null) {
            object2 = this.Qa().l;
            if (object2 != null) {
                object2 = ((RtoFirebaseData)object2).getSubTitle();
            } else {
                n3 = 0;
                object2 = null;
            }
            object4.setText((CharSequence)object2);
        }
        if ((object4 = uq2_02.j) != null) {
            object2 = this.Qa().l;
            if (object2 != null) {
                object5 = ((RtoFirebaseData)object2).getDescription();
            }
            object4.setText((CharSequence)object5);
        }
        if ((object4 = uq2_02.n) != null) {
            n3 = 1;
            object5 = new e8(uq2_02, n3);
            object4.setOnClickListener((View.OnClickListener)object5);
        }
        if ((object4 = uq2_02.u) != null) {
            n3 = 3;
            object5 = new XA(uq2_02, n3);
            object4.setOnClickListener((View.OnClickListener)object5);
        }
        if ((object4 = uq2_02.t) != null) {
            object5 = new sq2_0(uq2_02);
            Intrinsics.checkNotNullParameter(object4, "<this>");
            Intrinsics.checkNotNullParameter(object5, "afterTextChanged");
            object2 = new Object();
            object3 = new Object();
            ai0_2.n((EditText)object4, (Function1)object5, (hx0_2)object2, (hx0_2)object3);
        }
        object4 = WX0.DIALOG_LOAD;
        object5 = uq2_02.v;
        if (object5 != null) {
            n10 = ((ArrayList)object5).size();
        }
        uq2_02.Sa((WX0)((Object)object4), n10);
    }

    public void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object = this.Qa().k;
        object2 = this.getViewLifecycleOwner();
        np2_1 np2_12 = new np2_1(this, 1);
        uQ2$b uQ2$b = new uQ2$b(np2_12);
        ((R53)object).e((mu1_1)object2, uQ2$b);
    }
}

