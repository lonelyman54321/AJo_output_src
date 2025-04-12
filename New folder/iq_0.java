/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.ril.ajio.R$anim;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Facet;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iQ
 */
public class iq_0
extends sm3_0
implements zm0_0 {
    public static final iQ$a Companion;
    public View b;
    public View c;
    public ImageView d;
    public TextView e;
    public TextView f;
    public TextView g;
    public jv2_0 h;
    public final hh3_2 i;
    public TextView j;

    static {
        iQ$a iQ$a;
        Companion = iQ$a = new Object();
    }

    public iq_0() {
        Object object = new k8_0(this, 1);
        this.i = object = yr1_2.b((Function0)object);
    }

    public final void B4(String object, boolean bl2) {
        if (object == null) {
            return;
        }
        int n3 = 0;
        Object object2 = null;
        int n4 = 1;
        if (bl2) {
            Object object3 = this.Pa();
            if (object3 != null && (object3 = ((F12)object3).d) != null && (object3 = ((bv2_0)object3).i0) != null) {
                object2 = object3 = ((HashMap)object3).get(object);
                object2 = (Integer)object3;
            }
            if (object2 != null) {
                object3 = this.Pa();
                if (object3 != null && (object3 = ((F12)object3).d) != null && (object3 = ((bv2_0)object3).i0) != null) {
                    n3 = (Integer)object2 + n4;
                    object2 = n3;
                    object = (Integer)((HashMap)object3).put(object, object2);
                }
            } else {
                object3 = this.Pa();
                if (object3 != null && (object3 = ((F12)object3).d) != null && (object3 = ((bv2_0)object3).i0) != null) {
                    object2 = n4;
                    object = (Integer)((HashMap)object3).put(object, object2);
                }
            }
        } else {
            Object object4 = this.Pa();
            if (object4 != null && (object4 = ((F12)object4).d) != null && (object4 = ((bv2_0)object4).i0) != null) {
                object2 = object4 = ((HashMap)object4).get(object);
                object2 = (Integer)object4;
            }
            if (object2 != null) {
                object4 = this.Pa();
                if (object4 != null && (object4 = ((F12)object4).d) != null && (object4 = ((bv2_0)object4).i0) != null) {
                    n3 = (Integer)object2 - n4;
                    object2 = n3;
                    object = (Integer)((HashMap)object4).put(object, object2);
                }
            } else {
                object4 = this.Pa();
                if (object4 != null && (object4 = ((F12)object4).d) != null && (object4 = ((bv2_0)object4).i0) != null) {
                    n3 = 0;
                    object2 = 0;
                    object = (Integer)((HashMap)object4).put(object, object2);
                }
            }
        }
    }

    public final F12 Pa() {
        return (F12)this.i.getValue();
    }

    public void Qa(View view) {
        TextView textView;
        Intrinsics.checkNotNullParameter(view, "view");
        int n3 = R$id.category_facet_title_tv;
        this.j = textView = (TextView)view.findViewById(n3);
        n3 = R$id.category_filter_parent_view;
        textView = view.findViewById(n3);
        this.b = textView;
        n3 = R$id.category_cancel_view;
        textView = view.findViewById(n3);
        this.c = textView;
        n3 = R$id.category_cancel_iv;
        textView = (ImageView)view.findViewById(n3);
        this.d = textView;
        n3 = R$id.category_facet_view_all_tv;
        this.e = textView = (TextView)view.findViewById(n3);
        n3 = R$id.filter_view_cancel_tv;
        this.f = textView = (TextView)view.findViewById(n3);
        n3 = R$id.filter_view_apply_filter_tv;
        view = (TextView)view.findViewById(n3);
        this.g = view;
    }

    public final void Ra(sm3_0 sm3_02, String string2) {
        FragmentManager fragmentManager = this.getChildFragmentManager();
        fragmentManager.getClass();
        a a2 = new a(fragmentManager);
        Intrinsics.checkNotNullExpressionValue(a2, "beginTransaction(...)");
        int n3 = R$anim.slide_in_left;
        int n4 = R$anim.slide_out_right;
        a2.k(n3, n4, 0, 0);
        n3 = R$id.filter_view_facet_value_frag_container;
        a2.j(n3, sm3_02, string2);
        boolean bl2 = true;
        a2.o(bl2, bl2);
    }

    public final void onCreate(Bundle object) {
        int n3;
        int n4;
        Object object2;
        super.onCreate((Bundle)object);
        object = this.Pa();
        int n7 = 0;
        Integer n8 = null;
        if (object != null && (object = object.d) != null) {
            object2 = this.Pa();
            if (object2 != null && (object2 = ((F12)object2).d) != null) {
                object2 = ((bv2_0)object2).M;
            } else {
                n4 = 0;
                object2 = null;
            }
            object.N = object2;
        }
        if ((object = this.Pa()) != null && (object = object.d) != null) {
            object = object.W;
        } else {
            n3 = 0;
            object = null;
        }
        if (object == null) {
            object = this.Pa();
            if (object != null && (object = object.d) != null) {
                object2 = new Object();
                object.i0 = object2;
            }
        } else {
            object = this.Pa();
            if (object != null) {
                object = object.d;
            } else {
                n3 = 0;
                object = null;
            }
            Intrinsics.checkNotNull(object);
            Object object3 = this.Pa();
            Intrinsics.checkNotNull(object3);
            object3 = ((F12)object3).d.W;
            Intrinsics.checkNotNull(object3);
            object.i0 = object2 = new Object(object3);
        }
        if ((n3 = (object = this.getParentFragment()) instanceof jv2_0) != 0) {
            object = this.getParentFragment();
            object2 = "null cannot be cast to non-null type com.ril.ajio.plp.PlpFilterSortListener";
            Intrinsics.checkNotNull(object, (String)object2);
            object = (jv2_0)object;
            this.h = object;
        }
        if ((object = this.getArguments()) != null && (n3 = (object = this.requireArguments()).containsKey((String)(object2 = "PLP_TYPE"))) != 0) {
            object = this.getArguments();
            if (object != null) {
                n3 = object.getInt(object2);
                n8 = n3;
            }
            if (n8 != null && (n3 = n8.intValue()) == (n4 = 101)) {
                object = ld3_2.STORE_LUXE.getStoreId();
                this.Oa((String)object);
            } else if (n8 != null && (n3 = n8.intValue()) == (n7 = 103)) {
                object = ld3_2.STORE_AJIOGRAM.getStoreId();
                this.Oa((String)object);
            } else {
                object = ld3_2.STORE_AJIO.getStoreId();
                this.Oa((String)object);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.plp_category_filter_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroyView() {
        boolean bl2;
        super.onDestroyView();
        Object object = this.h;
        if (object != null) {
            object.M3();
        }
        if ((object = this.Pa()) != null && (object = ((F12)object).d) != null && !(bl2 = ((bv2_0)object).y0)) {
            object = this.Pa();
            Intrinsics.checkNotNull(object);
            ((F12)object).d.X = null;
            object = this.Pa();
            Intrinsics.checkNotNull(object);
            ((F12)object).d.Y = null;
            object = this.Pa();
            Intrinsics.checkNotNull(object);
            object = ((F12)object).d.R;
            if (object != null) {
                ((HashMap)object).clear();
            }
            object = this.Pa();
            Intrinsics.checkNotNull(object);
            object = ((F12)object).d.S;
            if (object != null) {
                ((HashMap)object).clear();
            }
        }
        if ((object = this.Pa()) != null && (object = ((F12)object).d) != null) {
            ((bv2_0)object).Z = null;
        }
        if ((object = this.Pa()) != null && (object = ((F12)object).d) != null) {
            ((bv2_0)object).a0 = null;
        }
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3;
        int n3;
        Object object4 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        super.onViewCreated((View)object, (Bundle)object2);
        this.Qa((View)object);
        object2 = this.c;
        if (object2 != null) {
            n3 = 1;
            object4 = new XA(this, n3);
            object2.setOnClickListener((View.OnClickListener)object4);
        }
        if ((object2 = this.d) != null) {
            n3 = 0;
            object3 = null;
            object4 = new cq_0(this, 0);
            object2.setOnClickListener((View.OnClickListener)object4);
        }
        if ((object2 = this.f) != null) {
            n3 = 0;
            object3 = null;
            object4 = new dQ(this, 0);
            object2.setOnClickListener((View.OnClickListener)object4);
        }
        if ((object2 = this.g) != null) {
            n3 = 0;
            object3 = null;
            object4 = new eQ(this, 0);
            object2.setOnClickListener((View.OnClickListener)object4);
        }
        if ((object2 = this.e) != null) {
            object4 = new fq_0(this);
            object2.setOnClickListener((View.OnClickListener)object4);
        }
        object2 = this.Pa();
        int n4 = 0;
        object4 = null;
        if (object2 != null && (object2 = object2.d) != null) {
            object3 = this.Pa();
            if (object3 != null && (object3 = ((F12)object3).d) != null) {
                object3 = ((bv2_0)object3).k0;
            } else {
                n3 = 0;
                object3 = null;
            }
            object2.X = object3;
        }
        if ((object2 = this.Pa()) != null && (object2 = object2.d) != null) {
            object3 = this.Pa();
            if (object3 != null && (object3 = ((F12)object3).d) != null && (object3 = ((bv2_0)object3).X) != null) {
                object3 = ((Facet)object3).getCode();
            } else {
                n3 = 0;
                object3 = null;
            }
            object2.Y = object3;
        }
        if ((object2 = this.j) != null) {
            object3 = this.Pa();
            if (object3 != null && (object3 = ((F12)object3).d) != null && (object3 = ((bv2_0)object3).X) != null) {
                object3 = ((Facet)object3).getName();
            } else {
                n3 = 0;
                object3 = null;
            }
            object2.setText((CharSequence)object3);
        }
        int n7 = R$id.title_view;
        object = (ConstraintLayout)object.findViewById(n7);
        object3 = Looper.getMainLooper();
        object2 = new Handler((Looper)object3);
        object3 = new gQ((ConstraintLayout)((Object)object), this);
        long l2 = 300L;
        object2.postDelayed((Runnable)object3, l2);
        object = this.getArguments();
        if (object != null) {
            boolean bl2;
            object = this.getArguments();
            object2 = "PLP_TYPE";
            if (object != null) {
                bl2 = object.containsKey((String)object2);
                object = bl2;
            } else {
                bl2 = false;
                object = null;
            }
            Intrinsics.checkNotNull(object);
            bl2 = (Boolean)object;
            if (bl2) {
                object = this.Pa();
                if (object != null && (object = ((F12)object).d) != null) {
                    object = ((bv2_0)object).X;
                } else {
                    bl2 = false;
                    object = null;
                }
                if (object != null) {
                    object = this.Pa();
                    if (object != null && (object = ((F12)object).d) != null) {
                        object = ((bv2_0)object).X;
                    } else {
                        bl2 = false;
                        object = null;
                    }
                    Intrinsics.checkNotNull(object);
                    object3 = ((Facet)object).getName();
                    n3 = (int)("category".equalsIgnoreCase((String)object3) ? 1 : 0);
                    String string2 = "l1l3nestedcategory";
                    if (n3 == 0 && (n3 = (int)(string2.equalsIgnoreCase((String)(object3 = ((Facet)object).getCode())) ? 1 : 0)) == 0) {
                        object3 = vy0_0.Companion;
                        string2 = this.getArguments();
                        if (string2 != null) {
                            n7 = string2.getInt((String)object2);
                            object4 = n7;
                        }
                        Intrinsics.checkNotNull(object4);
                        n7 = (Integer)object4;
                        object3.getClass();
                        n4 = 2;
                        object2 = VY0$a.a(n4, n7);
                        object = ((Facet)object).getCode();
                        Intrinsics.checkNotNull(object);
                        this.Ra((sm3_0)object2, (String)object);
                    } else {
                        object = zp_0.Companion;
                        object3 = this.getArguments();
                        if (object3 != null) {
                            n7 = object3.getInt((String)object2);
                            object4 = n7;
                        }
                        Intrinsics.checkNotNull(object4);
                        n7 = (Integer)object4;
                        object.getClass();
                        bl2 = true;
                        object = ZP$a.a(n7, bl2);
                        this.Ra((sm3_0)object, string2);
                    }
                }
            }
        }
    }
}

