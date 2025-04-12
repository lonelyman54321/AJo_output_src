/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Cart.ActionContent;
import com.ril.ajio.services.data.Cart.Extra;
import com.ril.ajio.services.data.Cart.Howitworks;
import com.ril.ajio.services.data.Cart.PossibleActions;
import com.ril.ajio.services.data.Cart.PreventionTips;
import com.ril.ajio.services.data.Cart.ProfileHealth;
import com.ril.ajio.services.data.Cart.Value;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from RQ2
 */
public final class rq2_2
extends RecyclerView$f {
    public static final RQ2$a Companion;
    public final String a;
    public final ad2_0 b;
    public final ProfileHealth c;

    static {
        RQ2$a rQ2$a;
        Companion = rQ2$a = new Object();
    }

    public rq2_2(String string2, String string3, ad2_0 ad2_02, ProfileHealth profileHealth) {
        Intrinsics.checkNotNullParameter(ad2_02, "rvpBottomSheetClickListner");
        Intrinsics.checkNotNullParameter(profileHealth, "rvpData");
        this.a = string3;
        this.b = ad2_02;
        this.c = profileHealth;
    }

    public final int getItemCount() {
        return 2;
    }

    public final int getItemViewType(int n3) {
        n3 = n3 == 0 ? 2 : 1;
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        n3 = recyclerView$B instanceof RQ2$b;
        if (n3 != 0) {
            int n4;
            int n7;
            float f5;
            Object object2;
            recyclerView$B = (RQ2$b)recyclerView$B;
            recyclerView$B.getClass();
            object = this.c;
            Intrinsics.checkNotNullParameter(object, "rvpData");
            Object object3 = ((RQ2$b)recyclerView$B).x.a;
            int n8 = Intrinsics.areEqual(object3, "ProceedPayment");
            Object object4 = ((RQ2$b)recyclerView$B).e;
            Object object5 = "";
            if (n8 != 0) {
                object3 = ((ProfileHealth)object).getActionContent();
                if (object3 == null || (object3 = ((ActionContent)object3).getTitle_nudge()) == null) {
                    object3 = object5;
                }
                object4.setText((CharSequence)object3);
            } else {
                object3 = ((ProfileHealth)object).getActionContent();
                if (object3 == null || (object3 = ((ActionContent)object3).getTitle_hyper_link()) == null) {
                    object3 = object5;
                }
                object4.setText((CharSequence)object3);
            }
            object3 = ((ProfileHealth)object).getActionContent();
            if (object3 == null || (object3 = ((ActionContent)object3).getDescription()) == null) {
                object3 = object5;
            }
            object4 = ((RQ2$b)recyclerView$B).f;
            object4.setText((CharSequence)object3);
            object3 = ((ProfileHealth)object).getActionContent();
            if (object3 == null || (object3 = ((ActionContent)object3).getBanner_text()) == null) {
                object3 = object5;
            }
            if ((object4 = ((ProfileHealth)object).getActionContent()) == null || (object4 = ((ActionContent)object4).getReturn_fee_banner_text()) == null) {
                object4 = object5;
            }
            if ((object2 = ((ProfileHealth)object).getActionContent()) != null && (object2 = ((ActionContent)object2).getReturn_fee()) != null) {
                f5 = ((Float)object2).floatValue();
                n7 = (int)f5;
            } else {
                n7 = 0;
                f5 = 0.0f;
                object2 = null;
            }
            int n10 = ((String)object4).length();
            AjioTextView ajioTextView = ((RQ2$b)recyclerView$B).g;
            if (n10 > 0 && n7 > 0) {
                object3 = String.valueOf(n7);
                object2 = "{return_fee}";
                object3 = kotlin.text.b.n((String)object4, (String)object2, (String)object3, false);
                ajioTextView.setText((CharSequence)object3);
            } else {
                ajioTextView.setText((CharSequence)object3);
            }
            object3 = ((ProfileHealth)object).getActionContent();
            if (object3 == null || (object3 = ((ActionContent)object3).getPossibleActions()) == null || (object3 = ((PossibleActions)object3).getTitle()) == null) {
                object3 = object5;
            }
            ((RQ2$b)recyclerView$B).h.setText((CharSequence)object3);
            object3 = ((ProfileHealth)object).getActionContent();
            object4 = null;
            if (object3 != null && (object3 = ((ActionContent)object3).getPossibleActions()) != null) {
                object3 = ((PossibleActions)object3).getValues();
            } else {
                n8 = 0;
                object3 = null;
            }
            object3 = (Collection)object3;
            if (object3 != null && (n8 = object3.isEmpty()) == 0) {
                object3 = ((ProfileHealth)object).getActionContent();
                if (object3 != null && (object3 = ((ActionContent)object3).getPossibleActions()) != null && (object3 = ((PossibleActions)object3).getValues()) != null) {
                    n8 = object3.size();
                    object3 = n8;
                } else {
                    n8 = 0;
                    object3 = null;
                }
                Intrinsics.checkNotNull(object3);
                n8 = (Integer)object3;
                if (n8 > 0) {
                    object3 = ((ProfileHealth)object).getActionContent();
                    if (object3 == null || (object3 = ((ActionContent)object3).getPossibleActions()) == null || (object3 = ((PossibleActions)object3).getValues()) == null || (object3 = (Value)object3.get(0)) == null || (object3 = ((Value)object3).getText()) == null) {
                        object3 = object5;
                    }
                    object2 = ((RQ2$b)recyclerView$B).i;
                    object2.setText((CharSequence)object3);
                }
            }
            if ((object3 = ((ProfileHealth)object).getActionContent()) != null && (object3 = ((ActionContent)object3).getPossibleActions()) != null) {
                object3 = ((PossibleActions)object3).getValues();
            } else {
                n8 = 0;
                object3 = null;
            }
            object3 = (Collection)object3;
            n7 = 1;
            f5 = Float.MIN_VALUE;
            if (object3 != null && (n8 = (int)(object3.isEmpty() ? 1 : 0)) == 0) {
                object3 = ((ProfileHealth)object).getActionContent();
                if (object3 != null && (object3 = ((ActionContent)object3).getPossibleActions()) != null && (object3 = ((PossibleActions)object3).getValues()) != null) {
                    n8 = object3.size();
                    object3 = n8;
                } else {
                    n8 = 0;
                    object3 = null;
                }
                Intrinsics.checkNotNull(object3);
                n8 = (Integer)object3;
                if (n8 > n7) {
                    object3 = ((ProfileHealth)object).getActionContent();
                    if (object3 == null || (object3 = ((ActionContent)object3).getPossibleActions()) == null || (object3 = ((PossibleActions)object3).getValues()) == null || (object3 = (Value)object3.get(n7)) == null || (object3 = ((Value)object3).getText()) == null) {
                        object3 = object5;
                    }
                    AjioTextView ajioTextView2 = ((RQ2$b)recyclerView$B).j;
                    ajioTextView2.setText((CharSequence)object3);
                }
            }
            if ((object3 = ((ProfileHealth)object).getActionContent()) != null && (object3 = ((ActionContent)object3).getPossibleActions()) != null) {
                object3 = ((PossibleActions)object3).getValues();
            } else {
                n8 = 0;
                object3 = null;
            }
            object3 = (Collection)object3;
            n10 = 2;
            if (object3 != null && (n8 = (int)(object3.isEmpty() ? 1 : 0)) == 0) {
                object3 = ((ProfileHealth)object).getActionContent();
                if (object3 != null && (object3 = ((ActionContent)object3).getPossibleActions()) != null && (object3 = ((PossibleActions)object3).getValues()) != null) {
                    n8 = object3.size();
                    object3 = n8;
                } else {
                    n8 = 0;
                    object3 = null;
                }
                Intrinsics.checkNotNull(object3);
                n8 = (Integer)object3;
                if (n8 > n10) {
                    object3 = ((ProfileHealth)object).getActionContent();
                    if (object3 == null || (object3 = ((ActionContent)object3).getPossibleActions()) == null || (object3 = ((PossibleActions)object3).getValues()) == null || (object3 = (Value)object3.get(n10)) == null || (object3 = ((Value)object3).getText()) == null) {
                        object3 = object5;
                    }
                    ajioTextView = ((RQ2$b)recyclerView$B).k;
                    ajioTextView.setText((CharSequence)object3);
                }
            }
            if ((object3 = ((ProfileHealth)object).getActionContent()) == null || (object3 = ((ActionContent)object3).getHowitworks()) == null || (object3 = ((Howitworks)object3).getTitle()) == null) {
                object3 = object5;
            }
            ajioTextView = ((RQ2$b)recyclerView$B).l;
            ajioTextView.setText((CharSequence)object3);
            object3 = ((ProfileHealth)object).getActionContent();
            if (object3 == null || (object3 = ((ActionContent)object3).getHowitworks()) == null || (object3 = ((Howitworks)object3).getDesc()) == null) {
                object3 = object5;
            }
            ajioTextView = ((RQ2$b)recyclerView$B).m;
            ajioTextView.setText((CharSequence)object3);
            object3 = ((ProfileHealth)object).getActionContent();
            if (object3 != null && (object3 = ((ActionContent)object3).getPreventionTips()) != null) {
                object3 = ((PreventionTips)object3).getTitle();
            } else {
                n8 = 0;
                object3 = null;
            }
            ajioTextView = ((RQ2$b)recyclerView$B).n;
            ajioTextView.setText((CharSequence)object3);
            object3 = ((ProfileHealth)object).getActionContent();
            if (object3 != null && (object3 = ((ActionContent)object3).getPreventionTips()) != null) {
                object3 = ((PreventionTips)object3).getValues();
            } else {
                n8 = 0;
                object3 = null;
            }
            object3 = (Collection)object3;
            if (object3 != null && (n8 = (int)(object3.isEmpty() ? 1 : 0)) == 0) {
                object3 = ((ProfileHealth)object).getActionContent();
                if (object3 != null && (object3 = ((ActionContent)object3).getPreventionTips()) != null && (object3 = ((PreventionTips)object3).getValues()) != null) {
                    n8 = object3.size();
                    object3 = n8;
                } else {
                    n8 = 0;
                    object3 = null;
                }
                Intrinsics.checkNotNull(object3);
                n8 = (Integer)object3;
                if (n8 > 0) {
                    object3 = ((ProfileHealth)object).getActionContent();
                    if (object3 == null || (object3 = ((ActionContent)object3).getPreventionTips()) == null || (object3 = ((PreventionTips)object3).getValues()) == null || (object3 = (Value)object3.get(0)) == null || (object3 = ((Value)object3).getText()) == null) {
                        object3 = object5;
                    }
                    ajioTextView = ((RQ2$b)recyclerView$B).o;
                    ajioTextView.setText((CharSequence)object3);
                }
            }
            if ((object3 = ((ProfileHealth)object).getActionContent()) != null && (object3 = ((ActionContent)object3).getPreventionTips()) != null) {
                object3 = ((PreventionTips)object3).getValues();
            } else {
                n8 = 0;
                object3 = null;
            }
            object3 = (Collection)object3;
            if (object3 != null && (n8 = (int)(object3.isEmpty() ? 1 : 0)) == 0) {
                object3 = ((ProfileHealth)object).getActionContent();
                if (object3 != null && (object3 = ((ActionContent)object3).getPreventionTips()) != null && (object3 = ((PreventionTips)object3).getValues()) != null) {
                    n8 = object3.size();
                    object3 = n8;
                } else {
                    n8 = 0;
                    object3 = null;
                }
                Intrinsics.checkNotNull(object3);
                n8 = (Integer)object3;
                if (n8 > n7) {
                    object3 = ((ProfileHealth)object).getActionContent();
                    if (object3 == null || (object3 = ((ActionContent)object3).getPreventionTips()) == null || (object3 = ((PreventionTips)object3).getValues()) == null || (object3 = (Value)object3.get(n7)) == null || (object3 = ((Value)object3).getText()) == null) {
                        object3 = object5;
                    }
                    ajioTextView = ((RQ2$b)recyclerView$B).p;
                    ajioTextView.setText((CharSequence)object3);
                }
            }
            if ((object3 = ((ProfileHealth)object).getActionContent()) != null && (object3 = ((ActionContent)object3).getPreventionTips()) != null) {
                object3 = ((PreventionTips)object3).getValues();
            } else {
                n8 = 0;
                object3 = null;
            }
            object3 = (Collection)object3;
            if (object3 != null && (n8 = (int)(object3.isEmpty() ? 1 : 0)) == 0) {
                object3 = ((ProfileHealth)object).getActionContent();
                if (object3 != null && (object3 = ((ActionContent)object3).getPreventionTips()) != null && (object3 = ((PreventionTips)object3).getValues()) != null) {
                    n8 = object3.size();
                    object3 = n8;
                } else {
                    n8 = 0;
                    object3 = null;
                }
                Intrinsics.checkNotNull(object3);
                n8 = (Integer)object3;
                if (n8 > n10) {
                    object3 = ((ProfileHealth)object).getActionContent();
                    if (object3 != null && (object3 = ((ActionContent)object3).getPreventionTips()) != null && (object3 = ((PreventionTips)object3).getValues()) != null && (object3 = (Value)object3.get(n10)) != null && (object3 = ((Value)object3).getText()) != null) {
                        object5 = object3;
                    }
                    object3 = ((RQ2$b)recyclerView$B).q;
                    object3.setText((CharSequence)object5);
                }
            }
            if ((object3 = ((ProfileHealth)object).getActionContent()) != null && (object3 = ((ActionContent)object3).getPossibleActions()) != null) {
                object3 = ((PossibleActions)object3).getValues();
            } else {
                n8 = 0;
                object3 = null;
            }
            object3 = (Collection)object3;
            if (object3 != null && (n8 = (int)(object3.isEmpty() ? 1 : 0)) == 0) {
                object3 = ((ProfileHealth)object).getActionContent();
                if (object3 != null && (object3 = ((ActionContent)object3).getPossibleActions()) != null && (object3 = ((PossibleActions)object3).getValues()) != null) {
                    n8 = object3.size();
                    object3 = n8;
                } else {
                    n8 = 0;
                    object3 = null;
                }
                Intrinsics.checkNotNull(object3);
                n8 = (Integer)object3;
                if (n8 > 0) {
                    object3 = new da$a();
                    ((da$a)object3).k = n7;
                    ((da$a)object3).r = n7;
                    n4 = R$string.acc_banner;
                    object5 = hv3_0.K(n4);
                    ((da$a)object3).b((String)object5);
                    object5 = ((ProfileHealth)object).getActionContent();
                    if (object5 != null && (object5 = ((ActionContent)object5).getPossibleActions()) != null && (object5 = ((PossibleActions)object5).getValues()) != null && (object5 = (Value)object5.get(0)) != null) {
                        object5 = ((Value)object5).getImageUrl();
                    } else {
                        n4 = 0;
                        object5 = null;
                    }
                    ((da$a)object3).n = object5;
                    object5 = ((RQ2$b)recyclerView$B).r;
                    ((da$a)object3).u = object5;
                    ((da$a)object3).a();
                }
            }
            if ((object3 = ((ProfileHealth)object).getActionContent()) != null && (object3 = ((ActionContent)object3).getPossibleActions()) != null) {
                object3 = ((PossibleActions)object3).getValues();
            } else {
                n8 = 0;
                object3 = null;
            }
            object3 = (Collection)object3;
            if (object3 != null && (n8 = (int)(object3.isEmpty() ? 1 : 0)) == 0) {
                object3 = ((ProfileHealth)object).getActionContent();
                if (object3 != null && (object3 = ((ActionContent)object3).getPossibleActions()) != null && (object3 = ((PossibleActions)object3).getValues()) != null) {
                    n8 = object3.size();
                    object3 = n8;
                } else {
                    n8 = 0;
                    object3 = null;
                }
                Intrinsics.checkNotNull(object3);
                n8 = (Integer)object3;
                if (n8 > n7) {
                    object3 = new da$a();
                    ((da$a)object3).k = n7;
                    ((da$a)object3).r = n7;
                    n4 = R$string.acc_banner;
                    object5 = hv3_0.K(n4);
                    ((da$a)object3).b((String)object5);
                    object5 = ((ProfileHealth)object).getActionContent();
                    if (object5 != null && (object5 = ((ActionContent)object5).getPossibleActions()) != null && (object5 = ((PossibleActions)object5).getValues()) != null && (object5 = (Value)object5.get(n7)) != null) {
                        object5 = ((Value)object5).getImageUrl();
                    } else {
                        n4 = 0;
                        object5 = null;
                    }
                    ((da$a)object3).n = object5;
                    object5 = ((RQ2$b)recyclerView$B).s;
                    ((da$a)object3).u = object5;
                    ((da$a)object3).a();
                }
            }
            if ((object3 = ((ProfileHealth)object).getActionContent()) != null && (object3 = ((ActionContent)object3).getPossibleActions()) != null) {
                object3 = ((PossibleActions)object3).getValues();
            } else {
                n8 = 0;
                object3 = null;
            }
            object3 = (Collection)object3;
            if (object3 != null && (n8 = (int)(object3.isEmpty() ? 1 : 0)) == 0) {
                object3 = ((ProfileHealth)object).getActionContent();
                if (object3 != null && (object3 = ((ActionContent)object3).getPossibleActions()) != null && (object3 = ((PossibleActions)object3).getValues()) != null) {
                    n8 = object3.size();
                    object3 = n8;
                } else {
                    n8 = 0;
                    object3 = null;
                }
                Intrinsics.checkNotNull(object3);
                n8 = (Integer)object3;
                if (n8 > n10) {
                    object3 = new da$a();
                    ((da$a)object3).k = n7;
                    ((da$a)object3).r = n7;
                    n4 = R$string.acc_banner;
                    object5 = hv3_0.K(n4);
                    ((da$a)object3).b((String)object5);
                    object5 = ((ProfileHealth)object).getActionContent();
                    if (object5 != null && (object5 = ((ActionContent)object5).getPossibleActions()) != null && (object5 = ((PossibleActions)object5).getValues()) != null && (object5 = (Value)object5.get(n10)) != null) {
                        object5 = ((Value)object5).getImageUrl();
                    } else {
                        n4 = 0;
                        object5 = null;
                    }
                    ((da$a)object3).n = object5;
                    object5 = ((RQ2$b)recyclerView$B).t;
                    ((da$a)object3).u = object5;
                    ((da$a)object3).a();
                }
            }
            if ((object3 = ((ProfileHealth)object).getActionContent()) != null && (object3 = ((ActionContent)object3).getPreventionTips()) != null) {
                object3 = ((PreventionTips)object3).getValues();
            } else {
                n8 = 0;
                object3 = null;
            }
            object3 = (Collection)object3;
            if (object3 != null && (n8 = (int)(object3.isEmpty() ? 1 : 0)) == 0) {
                object3 = ((ProfileHealth)object).getActionContent();
                if (object3 != null && (object3 = ((ActionContent)object3).getPreventionTips()) != null && (object3 = ((PreventionTips)object3).getValues()) != null) {
                    n8 = object3.size();
                    object3 = n8;
                } else {
                    n8 = 0;
                    object3 = null;
                }
                Intrinsics.checkNotNull(object3);
                n8 = (Integer)object3;
                if (n8 > 0) {
                    object3 = new da$a();
                    ((da$a)object3).k = n7;
                    ((da$a)object3).r = n7;
                    n4 = R$string.acc_banner;
                    object5 = hv3_0.K(n4);
                    ((da$a)object3).b((String)object5);
                    object5 = ((ProfileHealth)object).getActionContent();
                    if (object5 != null && (object5 = ((ActionContent)object5).getPreventionTips()) != null && (object5 = ((PreventionTips)object5).getValues()) != null && (object5 = (Value)object5.get(0)) != null) {
                        object5 = ((Value)object5).getImageUrl();
                    } else {
                        n4 = 0;
                        object5 = null;
                    }
                    ((da$a)object3).n = object5;
                    object5 = ((RQ2$b)recyclerView$B).u;
                    ((da$a)object3).u = object5;
                    ((da$a)object3).a();
                }
            }
            if ((object3 = ((ProfileHealth)object).getActionContent()) != null && (object3 = ((ActionContent)object3).getPreventionTips()) != null) {
                object3 = ((PreventionTips)object3).getValues();
            } else {
                n8 = 0;
                object3 = null;
            }
            object3 = (Collection)object3;
            if (object3 != null && (n8 = (int)(object3.isEmpty() ? 1 : 0)) == 0) {
                object3 = ((ProfileHealth)object).getActionContent();
                if (object3 != null && (object3 = ((ActionContent)object3).getPreventionTips()) != null && (object3 = ((PreventionTips)object3).getValues()) != null) {
                    n8 = object3.size();
                    object3 = n8;
                } else {
                    n8 = 0;
                    object3 = null;
                }
                Intrinsics.checkNotNull(object3);
                n8 = (Integer)object3;
                if (n8 > n7) {
                    object3 = new da$a();
                    ((da$a)object3).k = n7;
                    ((da$a)object3).r = n7;
                    n4 = R$string.acc_banner;
                    object5 = hv3_0.K(n4);
                    ((da$a)object3).b((String)object5);
                    object5 = ((ProfileHealth)object).getActionContent();
                    if (object5 != null && (object5 = ((ActionContent)object5).getPreventionTips()) != null && (object5 = ((PreventionTips)object5).getValues()) != null && (object5 = (Value)object5.get(n7)) != null) {
                        object5 = ((Value)object5).getImageUrl();
                    } else {
                        n4 = 0;
                        object5 = null;
                    }
                    ((da$a)object3).n = object5;
                    object5 = ((RQ2$b)recyclerView$B).v;
                    ((da$a)object3).u = object5;
                    ((da$a)object3).a();
                }
            }
            if ((object3 = ((ProfileHealth)object).getActionContent()) != null && (object3 = ((ActionContent)object3).getPreventionTips()) != null) {
                object3 = ((PreventionTips)object3).getValues();
            } else {
                n8 = 0;
                object3 = null;
            }
            object3 = (Collection)object3;
            if (object3 != null && (n8 = (int)(object3.isEmpty() ? 1 : 0)) == 0) {
                object3 = ((ProfileHealth)object).getActionContent();
                if (object3 != null && (object3 = ((ActionContent)object3).getPreventionTips()) != null && (object3 = ((PreventionTips)object3).getValues()) != null) {
                    n8 = object3.size();
                    object3 = n8;
                } else {
                    n8 = 0;
                    object3 = null;
                }
                Intrinsics.checkNotNull(object3);
                n8 = (Integer)object3;
                if (n8 > n10) {
                    object3 = new da$a();
                    ((da$a)object3).k = n7;
                    ((da$a)object3).r = n7;
                    n4 = R$string.acc_banner;
                    object5 = hv3_0.K(n4);
                    ((da$a)object3).b((String)object5);
                    object5 = ((ProfileHealth)object).getActionContent();
                    if (object5 != null && (object5 = ((ActionContent)object5).getPreventionTips()) != null && (object5 = ((PreventionTips)object5).getValues()) != null && (object5 = (Value)object5.get(n10)) != null) {
                        object4 = ((Value)object5).getImageUrl();
                    }
                    ((da$a)object3).n = object4;
                    object4 = ((RQ2$b)recyclerView$B).w;
                    ((da$a)object3).u = object4;
                    ((da$a)object3).a();
                }
            }
            if ((object3 = ((ProfileHealth)object).getExtra()) != null) {
                n8 = ((Extra)object3).getRvpPercent();
                if ((object = ((ProfileHealth)object).getActionContent()) != null && (object = ((ActionContent)object).getAjio_avg_perc()) != null) {
                    n3 = ((Number)object).intValue();
                    object4 = ((RQ2$b)recyclerView$B).d.getViewTreeObserver();
                    object5 = new sq2_2((RQ2$b)recyclerView$B, n3, n8);
                    object4.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object5);
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object);
        int n4 = 2;
        Object object2 = "inflate(...)";
        String string2 = null;
        if (n3 == n4) {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.rvp_bottom_sheet_item;
            viewGroup = object.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, (String)object2);
            RQ2$b rQ2$b = new RQ2$b(this, (View)viewGroup);
            return rQ2$b;
        }
        object = LayoutInflater.from((Context)viewGroup.getContext());
        int n8 = R$layout.rvp_bottom_button_item;
        viewGroup = object.inflate(n8, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, (String)object2);
        object = this.c;
        object2 = this.b;
        string2 = this.a;
        RQ2$c rQ2$c = new RQ2$c((View)viewGroup, (ad2_0)object2, string2, (ProfileHealth)object);
        return rQ2$c;
    }
}

