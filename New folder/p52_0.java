/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.R$dimen;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.ItemTouchHelper$c;
import androidx.recyclerview.widget.ItemTouchHelper$d;
import androidx.recyclerview.widget.ItemTouchHelper$e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.RecyclerView$r;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from p52
 */
public final class p52_0
extends Fragment {
    public static final p52$a Companion;
    public n52_0 a;
    public RecyclerView b;
    public dz1_2 c;
    public ArrayList d;

    static {
        p52$a p52$a;
        Companion = p52$a = new Object();
    }

    public final void Oa(ArrayList arrayList) {
        this.d = arrayList;
        dz1_2 dz1_22 = this.c;
        if (dz1_22 != null) {
            Object object = AJIOApplication.Companion;
            object.getClass();
            object = AJIOApplication$a.a();
            try {
                o43_0.a((AJIOApplication)object, 0);
            }
            catch (Exception exception) {
                yn3$a yn3$a = yn3_0.a;
                yn3$a.e(exception);
            }
            object = dz1_22.c;
            ((jo_2)object).y(0);
            dz1_22.b = arrayList;
            dz1_22.notifyDataSetChanged();
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.getArguments();
        if (object != null) {
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 33;
            if (n3 >= n4) {
                object = o52_0.a(object);
            } else {
                String string2 = "NOTIFICATION_LIST";
                n3 = (object = object.getSerializable(string2)) instanceof ArrayList;
                if (n3 == 0) {
                    object = null;
                }
                object = (ArrayList)object;
            }
            object = (ArrayList)object;
            this.d = object;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_notification_list;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.notification_list;
        object = (RecyclerView)object.findViewById(n3);
        this.b = object;
        if (object != null) {
            object3 = this.requireActivity();
            object2 = new LinearLayoutManager((Context)object3);
            ((RecyclerView)object).setLayoutManager((RecyclerView$o)object2);
        }
        object2 = this.a;
        object3 = this.d;
        this.c = object = new dz1_2((n52_0)object2, (ArrayList)object3);
        object2 = this.b;
        if (object2 != null) {
            object2.setAdapter((RecyclerView$f)object);
        }
        object = this.getActivity();
        Objects.requireNonNull(object);
        object2 = new q52_0(this, (FragmentActivity)object);
        object = new ItemTouchHelper((q52_0)object2);
        object2 = this.b;
        object3 = ((ItemTouchHelper)object).r;
        if (object3 != object2) {
            float f5;
            int n4;
            Object object4 = ((ItemTouchHelper)object).z;
            if (object3 != null) {
                ((RecyclerView)object3).removeItemDecoration((RecyclerView$n)object);
                ((ItemTouchHelper)object).r.removeOnItemTouchListener((RecyclerView$r)object4);
                ((ItemTouchHelper)object).r.removeOnChildAttachStateChangeListener((RecyclerView$p)object);
                object3 = ((ItemTouchHelper)object).p;
                int n7 = ((ArrayList)object3).size() + -1;
                while (true) {
                    Object object5 = null;
                    if (n7 < 0) break;
                    object5 = (ItemTouchHelper$e)((ArrayList)object3).get(0);
                    ((ItemTouchHelper$e)object5).g.cancel();
                    RecyclerView recyclerView = ((ItemTouchHelper)object).r;
                    object5 = ((ItemTouchHelper$e)object5).e;
                    ItemTouchHelper$c itemTouchHelper$c = ((ItemTouchHelper)object).m;
                    itemTouchHelper$c.clearView(recyclerView, (RecyclerView$B)object5);
                    n7 += -1;
                }
                ((ArrayList)object3).clear();
                n4 = 0;
                f5 = 0.0f;
                object3 = null;
                ((ItemTouchHelper)object).w = null;
                Object object6 = ((ItemTouchHelper)object).t;
                if (object6 != null) {
                    object6.recycle();
                    ((ItemTouchHelper)object).t = null;
                }
                if ((object6 = ((ItemTouchHelper)object).y) != null) {
                    object6.a = false;
                    ((ItemTouchHelper)object).y = null;
                }
                if ((object6 = ((ItemTouchHelper)object).x) != null) {
                    ((ItemTouchHelper)object).x = null;
                }
            }
            ((ItemTouchHelper)object).r = object2;
            if (object2 != null) {
                float f6;
                object2 = object2.getResources();
                n4 = R$dimen.item_touch_helper_swipe_escape_velocity;
                ((ItemTouchHelper)object).f = f5 = object2.getDimension(n4);
                n4 = R$dimen.item_touch_helper_swipe_escape_max_velocity;
                ((ItemTouchHelper)object).g = f6 = object2.getDimension(n4);
                ((ItemTouchHelper)object).q = n3 = ViewConfiguration.get((Context)((ItemTouchHelper)object).r.getContext()).getScaledTouchSlop();
                ((ItemTouchHelper)object).r.addItemDecoration((RecyclerView$n)object);
                ((ItemTouchHelper)object).r.addOnItemTouchListener((RecyclerView$r)object4);
                ((ItemTouchHelper)object).r.addOnChildAttachStateChangeListener((RecyclerView$p)object);
                object2 = new ItemTouchHelper$d((ItemTouchHelper)object);
                ((ItemTouchHelper)object).y = object2;
                object3 = ((ItemTouchHelper)object).r.getContext();
                object4 = ((ItemTouchHelper)object).y;
                object2 = new GestureDetector((Context)object3, (GestureDetector.OnGestureListener)object4);
                ((ItemTouchHelper)object).x = object2;
            }
        }
    }
}

