/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.databinding.FragmentIncentivizeKnowMoreBinding;
import com.ril.ajio.services.data.Cart.ActionContent;
import com.ril.ajio.services.data.Cart.Extra;
import com.ril.ajio.services.data.Cart.Howitworks;
import com.ril.ajio.services.data.Cart.PossibleActions;
import com.ril.ajio.services.data.Cart.PreventionTips;
import com.ril.ajio.services.data.Cart.ProfileHealth;
import com.ril.ajio.services.data.Cart.Value;
import com.ril.ajio.services.data.user.UserInformation;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from Ag1
 */
public final class ag1_1
extends BottomSheetDialogFragment {
    public static final Ag1$a Companion;
    public final NewCustomEventsRevamp a;
    public final String b;
    public final String c;
    public String d;
    public ProfileHealth e;
    public FragmentIncentivizeKnowMoreBinding f;
    public FragmentActivity g;
    public final UserInformation h;

    static {
        Ag1$a ag1$a;
        Companion = ag1$a = new Object();
    }

    public ag1_1() {
        Object object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.a = object2;
        object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.b = object2 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        this.c = object = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        this.d = "";
        object = this.g;
        object = object != null ? object.getApplicationContext() : null;
        this.h = object = UserInformation.getInstance((Context)object);
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.requireActivity();
        Intrinsics.checkNotNullExpressionValue(object, "requireActivity(...)");
        Object object2 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object3 = object.getViewModelStore();
        object2 = cX1.a((FragmentActivity)object, (String)object2, (FragmentActivity)object, (String)object2);
        String string2 = "factory";
        object = dX1.a((FragmentActivity)object, (rd3_0)object3, "store", (E$b)object2, string2);
        String string3 = "defaultCreationExtras";
        object = li_2.a((Wd0)object, string3, (rd3_0)object3, (E$b)object2, (Wd0)object);
        object2 = xq2_1.class;
        object3 = "modelClass";
        object2 = do_0.a(object2, (String)object3, object2, (String)object3, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            object = (xq2_1)((pD3)object).a((yn1_2)object2, (String)object3);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater object, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(object, "inflater");
        object = FragmentIncentivizeKnowMoreBinding.inflate((LayoutInflater)object, viewGroup, false);
        this.f = object;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            object = null;
        }
        return ((FragmentIncentivizeKnowMoreBinding)object).getRoot();
    }

    public final void onStart() {
        super.onStart();
        Object object = this.getDialog();
        if (object != null) {
            ViewGroup.LayoutParams layoutParams;
            int n3 = R$id.design_bottom_sheet;
            object = object.findViewById(n3);
            n3 = -1;
            if (object != null && (layoutParams = object.getLayoutParams()) != null) {
                layoutParams.height = n3;
            }
            object = BottomSheetBehavior.from((View)object);
            Intrinsics.checkNotNullExpressionValue(object, "from(...)");
            ((BottomSheetBehavior)object).setState(3);
            layoutParams = null;
            ((BottomSheetBehavior)object).setSkipCollapsed(false);
            ((BottomSheetBehavior)object).setDraggable(false);
            object = this.getDialog();
            if (object != null && (object = object.getWindow()) != null) {
                object.setLayout(n3, n3);
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Object object;
        ag1_1 ag1_12 = this;
        Object object2 = view;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object object3 = this.e;
        if (object3 != null) {
            int n3;
            Object object4;
            int n4;
            Object object5;
            Object object6;
            object2 = this.d;
            int n7 = Intrinsics.areEqual(object2, "ProceedPayment");
            object = "";
            Object object7 = "binding";
            Object object8 = null;
            if (n7 != 0) {
                object2 = this.f;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    n7 = 0;
                    object2 = null;
                }
                object2 = ((FragmentIncentivizeKnowMoreBinding)object2).includeItemDetails.headerTitle;
                object6 = ((ProfileHealth)object3).getActionContent();
                if (object6 == null || (object6 = ((ActionContent)object6).getTitle_nudge()) == null) {
                    object6 = object;
                }
                object2.setText((CharSequence)object6);
            } else {
                object2 = this.f;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    n7 = 0;
                    object2 = null;
                }
                object2 = ((FragmentIncentivizeKnowMoreBinding)object2).includeItemDetails.headerTitle;
                object6 = new StringBuilder("Hey ");
                object5 = ag1_12.h.getUserName();
                ((StringBuilder)object6).append((String)object5);
                ((StringBuilder)object6).append(", ");
                object5 = ((ProfileHealth)object3).getActionContent();
                if (object5 != null && (object5 = ((ActionContent)object5).getTitle_know_more()) != null) {
                    object5 = ((Object)StringsKt.m0((CharSequence)object5)).toString();
                } else {
                    n4 = 0;
                    object5 = null;
                }
                ((StringBuilder)object6).append((String)object5);
                object6 = ((StringBuilder)object6).toString();
                object5 = "toString(...)";
                Intrinsics.checkNotNullExpressionValue(object6, (String)object5);
                object2.setText((CharSequence)object6);
            }
            object2 = ag1_12.f;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                n7 = 0;
                object2 = null;
            }
            object2 = ((FragmentIncentivizeKnowMoreBinding)object2).includeItemDetails.headerSubTitle;
            object6 = ((ProfileHealth)object3).getActionContent();
            if (object6 == null || (object6 = ((ActionContent)object6).getDescription()) == null) {
                object6 = object;
            }
            object2.setText((CharSequence)object6);
            object2 = ag1_12.f;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                n7 = 0;
                object2 = null;
            }
            object2 = ((FragmentIncentivizeKnowMoreBinding)object2).includeItemDetails.rvpCautionText;
            object6 = ((ProfileHealth)object3).getActionContent();
            if (object6 == null || (object6 = ((ActionContent)object6).getBanner_text()) == null) {
                object6 = object;
            }
            object2.setText((CharSequence)object6);
            object2 = ag1_12.f;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                n7 = 0;
                object2 = null;
            }
            object2 = ((FragmentIncentivizeKnowMoreBinding)object2).includeItemDetails.possibleActionsHeadingText;
            object6 = ((ProfileHealth)object3).getActionContent();
            if (object6 == null || (object6 = ((ActionContent)object6).getPossibleActions()) == null || (object6 = ((PossibleActions)object6).getTitle()) == null) {
                object6 = object;
            }
            object2.setText((CharSequence)object6);
            object2 = ((ProfileHealth)object3).getActionContent();
            if (object2 != null && (object2 = ((ActionContent)object2).getPossibleActions()) != null) {
                object2 = ((PossibleActions)object2).getValues();
            } else {
                n7 = 0;
                object2 = null;
            }
            object2 = (Collection)object2;
            object6 = null;
            if (object2 != null && (n7 = object2.isEmpty()) == 0) {
                object2 = ((ProfileHealth)object3).getActionContent();
                if (object2 != null && (object2 = ((ActionContent)object2).getPossibleActions()) != null && (object2 = ((PossibleActions)object2).getValues()) != null) {
                    n7 = object2.size();
                    object2 = n7;
                } else {
                    n7 = 0;
                    object2 = null;
                }
                Intrinsics.checkNotNull(object2);
                n7 = (Integer)object2;
                if (n7 > 0) {
                    object2 = ag1_12.f;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                        n7 = 0;
                        object2 = null;
                    }
                    object2 = ((FragmentIncentivizeKnowMoreBinding)object2).includeItemDetails.possibleActionSubText1;
                    object5 = ((ProfileHealth)object3).getActionContent();
                    if (object5 == null || (object5 = ((ActionContent)object5).getPossibleActions()) == null || (object5 = ((PossibleActions)object5).getValues()) == null || (object5 = (Value)object5.get(0)) == null || (object5 = ((Value)object5).getText()) == null) {
                        object5 = object;
                    }
                    object2.setText((CharSequence)object5);
                }
            }
            if ((object2 = ((ProfileHealth)object3).getActionContent()) != null && (object2 = ((ActionContent)object2).getPossibleActions()) != null) {
                object2 = ((PossibleActions)object2).getValues();
            } else {
                n7 = 0;
                object2 = null;
            }
            object2 = (Collection)object2;
            n4 = 1;
            if (object2 != null && (n7 = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
                object2 = ((ProfileHealth)object3).getActionContent();
                if (object2 != null && (object2 = ((ActionContent)object2).getPossibleActions()) != null && (object2 = ((PossibleActions)object2).getValues()) != null) {
                    n7 = object2.size();
                    object2 = n7;
                } else {
                    n7 = 0;
                    object2 = null;
                }
                Intrinsics.checkNotNull(object2);
                n7 = (Integer)object2;
                if (n7 > n4) {
                    object2 = ag1_12.f;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                        n7 = 0;
                        object2 = null;
                    }
                    object2 = ((FragmentIncentivizeKnowMoreBinding)object2).includeItemDetails.possibleActionSubText2;
                    Object object9 = ((ProfileHealth)object3).getActionContent();
                    if (object9 == null || (object9 = ((ActionContent)object9).getPossibleActions()) == null || (object9 = ((PossibleActions)object9).getValues()) == null || (object9 = (Value)object9.get(n4)) == null || (object9 = ((Value)object9).getText()) == null) {
                        object9 = object;
                    }
                    object2.setText((CharSequence)object9);
                }
            }
            if ((object2 = ((ProfileHealth)object3).getActionContent()) != null && (object2 = ((ActionContent)object2).getPossibleActions()) != null) {
                object2 = ((PossibleActions)object2).getValues();
            } else {
                n7 = 0;
                object2 = null;
            }
            object2 = (Collection)object2;
            int n8 = 2;
            if (object2 != null && (n7 = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
                object2 = ((ProfileHealth)object3).getActionContent();
                if (object2 != null && (object2 = ((ActionContent)object2).getPossibleActions()) != null && (object2 = ((PossibleActions)object2).getValues()) != null) {
                    n7 = object2.size();
                    object2 = n7;
                } else {
                    n7 = 0;
                    object2 = null;
                }
                Intrinsics.checkNotNull(object2);
                n7 = (Integer)object2;
                if (n7 > n8) {
                    object2 = ag1_12.f;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                        n7 = 0;
                        object2 = null;
                    }
                    object2 = ((FragmentIncentivizeKnowMoreBinding)object2).includeItemDetails.possibleActionSubText3;
                    object4 = ((ProfileHealth)object3).getActionContent();
                    if (object4 == null || (object4 = ((ActionContent)object4).getPossibleActions()) == null || (object4 = ((PossibleActions)object4).getValues()) == null || (object4 = (Value)object4.get(n8)) == null || (object4 = ((Value)object4).getText()) == null) {
                        object4 = object;
                    }
                    object2.setText((CharSequence)object4);
                }
            }
            if ((object2 = ag1_12.f) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                n7 = 0;
                object2 = null;
            }
            object2 = ((FragmentIncentivizeKnowMoreBinding)object2).includeItemDetails.howItWorksHeadingText;
            object4 = ((ProfileHealth)object3).getActionContent();
            if (object4 == null || (object4 = ((ActionContent)object4).getHowitworks()) == null || (object4 = ((Howitworks)object4).getTitle()) == null) {
                object4 = object;
            }
            object2.setText((CharSequence)object4);
            object2 = ag1_12.f;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                n7 = 0;
                object2 = null;
            }
            object2 = ((FragmentIncentivizeKnowMoreBinding)object2).includeItemDetails.howItWorksSubText;
            object4 = ((ProfileHealth)object3).getActionContent();
            if (object4 == null || (object4 = ((ActionContent)object4).getHowitworks()) == null || (object4 = ((Howitworks)object4).getDesc()) == null) {
                object4 = object;
            }
            object2.setText((CharSequence)object4);
            object2 = ag1_12.f;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                n7 = 0;
                object2 = null;
            }
            object2 = ((FragmentIncentivizeKnowMoreBinding)object2).includeItemDetails.avoidPenalityHeadingText;
            object4 = ((ProfileHealth)object3).getActionContent();
            if (object4 == null || (object4 = ((ActionContent)object4).getPreventionTips()) == null || (object4 = ((PreventionTips)object4).getTitle()) == null) {
                object4 = object;
            }
            object2.setText((CharSequence)object4);
            object2 = ((ProfileHealth)object3).getActionContent();
            if (object2 != null && (object2 = ((ActionContent)object2).getPreventionTips()) != null) {
                object2 = ((PreventionTips)object2).getValues();
            } else {
                n7 = 0;
                object2 = null;
            }
            object2 = (Collection)object2;
            if (object2 != null && (n7 = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
                object2 = ((ProfileHealth)object3).getActionContent();
                if (object2 != null && (object2 = ((ActionContent)object2).getPreventionTips()) != null && (object2 = ((PreventionTips)object2).getValues()) != null) {
                    n7 = object2.size();
                    object2 = n7;
                } else {
                    n7 = 0;
                    object2 = null;
                }
                Intrinsics.checkNotNull(object2);
                n7 = (Integer)object2;
                if (n7 > 0) {
                    object2 = ag1_12.f;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                        n7 = 0;
                        object2 = null;
                    }
                    object2 = ((FragmentIncentivizeKnowMoreBinding)object2).includeItemDetails.avoidPenalitySubText1;
                    object4 = ((ProfileHealth)object3).getActionContent();
                    if (object4 == null || (object4 = ((ActionContent)object4).getPreventionTips()) == null || (object4 = ((PreventionTips)object4).getValues()) == null || (object4 = (Value)object4.get(0)) == null || (object4 = ((Value)object4).getText()) == null) {
                        object4 = object;
                    }
                    object2.setText((CharSequence)object4);
                }
            }
            if ((object2 = ((ProfileHealth)object3).getActionContent()) != null && (object2 = ((ActionContent)object2).getPreventionTips()) != null) {
                object2 = ((PreventionTips)object2).getValues();
            } else {
                n7 = 0;
                object2 = null;
            }
            object2 = (Collection)object2;
            if (object2 != null && (n7 = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
                object2 = ((ProfileHealth)object3).getActionContent();
                if (object2 != null && (object2 = ((ActionContent)object2).getPreventionTips()) != null && (object2 = ((PreventionTips)object2).getValues()) != null) {
                    n7 = object2.size();
                    object2 = n7;
                } else {
                    n7 = 0;
                    object2 = null;
                }
                Intrinsics.checkNotNull(object2);
                n7 = (Integer)object2;
                if (n7 > n4) {
                    object2 = ag1_12.f;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                        n7 = 0;
                        object2 = null;
                    }
                    object2 = ((FragmentIncentivizeKnowMoreBinding)object2).includeItemDetails.avoidPenalitySubText2;
                    object4 = ((ProfileHealth)object3).getActionContent();
                    if (object4 == null || (object4 = ((ActionContent)object4).getPreventionTips()) == null || (object4 = ((PreventionTips)object4).getValues()) == null || (object4 = (Value)object4.get(n4)) == null || (object4 = ((Value)object4).getText()) == null) {
                        object4 = object;
                    }
                    object2.setText((CharSequence)object4);
                }
            }
            if ((object2 = ((ProfileHealth)object3).getActionContent()) != null && (object2 = ((ActionContent)object2).getPreventionTips()) != null) {
                object2 = ((PreventionTips)object2).getValues();
            } else {
                n7 = 0;
                object2 = null;
            }
            object2 = (Collection)object2;
            if (object2 != null && (n7 = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
                object2 = ((ProfileHealth)object3).getActionContent();
                if (object2 != null && (object2 = ((ActionContent)object2).getPreventionTips()) != null && (object2 = ((PreventionTips)object2).getValues()) != null) {
                    n7 = object2.size();
                    object2 = n7;
                } else {
                    n7 = 0;
                    object2 = null;
                }
                Intrinsics.checkNotNull(object2);
                n7 = (Integer)object2;
                if (n7 > n8) {
                    object2 = ag1_12.f;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                        n7 = 0;
                        object2 = null;
                    }
                    object2 = ((FragmentIncentivizeKnowMoreBinding)object2).includeItemDetails.avoidPenalitySubText3;
                    object4 = ((ProfileHealth)object3).getActionContent();
                    if (object4 != null && (object4 = ((ActionContent)object4).getPreventionTips()) != null && (object4 = ((PreventionTips)object4).getValues()) != null && (object4 = (Value)object4.get(n8)) != null && (object4 = ((Value)object4).getText()) != null) {
                        object = object4;
                    }
                    object2.setText((CharSequence)object);
                }
            }
            if ((object2 = ag1_12.f) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                n7 = 0;
                object2 = null;
            }
            object2 = ((FragmentIncentivizeKnowMoreBinding)object2).rvpOkayBtn;
            object = ((ProfileHealth)object3).getActionContent();
            if (object == null || (object = ((ActionContent)object).getCta_hyper_link()) == null) {
                object = "Okay";
            }
            object2.setText((CharSequence)object);
            object2 = ag1_12.f;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                n7 = 0;
                object2 = null;
            }
            object2 = ((FragmentIncentivizeKnowMoreBinding)object2).rvpOkayBtn;
            int n10 = 1;
            object = new x6(ag1_12, n10);
            object2.setOnClickListener((View.OnClickListener)object);
            object2 = ag1_12.f;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                n7 = 0;
                object2 = null;
            }
            object2 = ((FragmentIncentivizeKnowMoreBinding)object2).ivBack;
            n10 = 1;
            object = new z11_0(ag1_12, n10);
            object2.setOnClickListener((View.OnClickListener)object);
            object2 = ((ProfileHealth)object3).getActionContent();
            if (object2 != null && (object2 = ((ActionContent)object2).getPossibleActions()) != null) {
                object2 = ((PossibleActions)object2).getValues();
            } else {
                n7 = 0;
                object2 = null;
            }
            object2 = (Collection)object2;
            if (object2 != null && (n7 = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
                object2 = ((ProfileHealth)object3).getActionContent();
                if (object2 != null && (object2 = ((ActionContent)object2).getPossibleActions()) != null && (object2 = ((PossibleActions)object2).getValues()) != null) {
                    n7 = object2.size();
                    object2 = n7;
                } else {
                    n7 = 0;
                    object2 = null;
                }
                Intrinsics.checkNotNull(object2);
                n7 = (Integer)object2;
                if (n7 > 0) {
                    object2 = new da$a();
                    ((da$a)object2).k = n4;
                    ((da$a)object2).r = n4;
                    n3 = R$string.acc_banner;
                    object = hv3_0.K(n3);
                    ((da$a)object2).b((String)object);
                    object = ((ProfileHealth)object3).getActionContent();
                    if (object != null && (object = ((ActionContent)object).getPossibleActions()) != null && (object = ((PossibleActions)object).getValues()) != null && (object = (Value)object.get(0)) != null) {
                        object = ((Value)object).getImageUrl();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    object4 = ag1_12.f;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                        n10 = 0;
                        object4 = null;
                    }
                    object4 = ((FragmentIncentivizeKnowMoreBinding)object4).includeItemDetails.possibleActionImage1;
                    ((da$a)object2).n = object;
                    ((da$a)object2).u = object4;
                    ((da$a)object2).a();
                }
            }
            if ((object2 = ((ProfileHealth)object3).getActionContent()) != null && (object2 = ((ActionContent)object2).getPossibleActions()) != null) {
                object2 = ((PossibleActions)object2).getValues();
            } else {
                n7 = 0;
                object2 = null;
            }
            object2 = (Collection)object2;
            if (object2 != null && (n7 = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
                object2 = ((ProfileHealth)object3).getActionContent();
                if (object2 != null && (object2 = ((ActionContent)object2).getPossibleActions()) != null && (object2 = ((PossibleActions)object2).getValues()) != null) {
                    n7 = object2.size();
                    object2 = n7;
                } else {
                    n7 = 0;
                    object2 = null;
                }
                Intrinsics.checkNotNull(object2);
                n7 = (Integer)object2;
                if (n7 > n4) {
                    object2 = new da$a();
                    ((da$a)object2).k = n4;
                    ((da$a)object2).r = n4;
                    n3 = R$string.acc_banner;
                    object = hv3_0.K(n3);
                    ((da$a)object2).b((String)object);
                    object = ((ProfileHealth)object3).getActionContent();
                    if (object != null && (object = ((ActionContent)object).getPossibleActions()) != null && (object = ((PossibleActions)object).getValues()) != null && (object = (Value)object.get(n4)) != null) {
                        object = ((Value)object).getImageUrl();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    object4 = ag1_12.f;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                        n10 = 0;
                        object4 = null;
                    }
                    object4 = ((FragmentIncentivizeKnowMoreBinding)object4).includeItemDetails.possibleActionImage2;
                    ((da$a)object2).n = object;
                    ((da$a)object2).u = object4;
                    ((da$a)object2).a();
                }
            }
            if ((object2 = ((ProfileHealth)object3).getActionContent()) != null && (object2 = ((ActionContent)object2).getPossibleActions()) != null) {
                object2 = ((PossibleActions)object2).getValues();
            } else {
                n7 = 0;
                object2 = null;
            }
            object2 = (Collection)object2;
            if (object2 != null && (n7 = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
                object2 = ((ProfileHealth)object3).getActionContent();
                if (object2 != null && (object2 = ((ActionContent)object2).getPossibleActions()) != null && (object2 = ((PossibleActions)object2).getValues()) != null) {
                    n7 = object2.size();
                    object2 = n7;
                } else {
                    n7 = 0;
                    object2 = null;
                }
                Intrinsics.checkNotNull(object2);
                n7 = (Integer)object2;
                if (n7 > n8) {
                    object2 = new da$a();
                    ((da$a)object2).k = n4;
                    ((da$a)object2).r = n4;
                    n3 = R$string.acc_banner;
                    object = hv3_0.K(n3);
                    ((da$a)object2).b((String)object);
                    object = ((ProfileHealth)object3).getActionContent();
                    if (object != null && (object = ((ActionContent)object).getPossibleActions()) != null && (object = ((PossibleActions)object).getValues()) != null && (object = (Value)object.get(n8)) != null) {
                        object = ((Value)object).getImageUrl();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    object4 = ag1_12.f;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                        n10 = 0;
                        object4 = null;
                    }
                    object4 = ((FragmentIncentivizeKnowMoreBinding)object4).includeItemDetails.possibleActionImage3;
                    ((da$a)object2).n = object;
                    ((da$a)object2).u = object4;
                    ((da$a)object2).a();
                }
            }
            if ((object2 = ((ProfileHealth)object3).getActionContent()) != null && (object2 = ((ActionContent)object2).getPreventionTips()) != null) {
                object2 = ((PreventionTips)object2).getValues();
            } else {
                n7 = 0;
                object2 = null;
            }
            object2 = (Collection)object2;
            if (object2 != null && (n7 = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
                object2 = ((ProfileHealth)object3).getActionContent();
                if (object2 != null && (object2 = ((ActionContent)object2).getPreventionTips()) != null && (object2 = ((PreventionTips)object2).getValues()) != null) {
                    n7 = object2.size();
                    object2 = n7;
                } else {
                    n7 = 0;
                    object2 = null;
                }
                Intrinsics.checkNotNull(object2);
                n7 = (Integer)object2;
                if (n7 > 0) {
                    object2 = new da$a();
                    ((da$a)object2).k = n4;
                    ((da$a)object2).r = n4;
                    n3 = R$string.acc_banner;
                    object = hv3_0.K(n3);
                    ((da$a)object2).b((String)object);
                    object = ((ProfileHealth)object3).getActionContent();
                    if (object != null && (object = ((ActionContent)object).getPreventionTips()) != null && (object = ((PreventionTips)object).getValues()) != null && (object = (Value)object.get(0)) != null) {
                        object = ((Value)object).getImageUrl();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    object6 = ag1_12.f;
                    if (object6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                        object6 = null;
                    }
                    object6 = ((FragmentIncentivizeKnowMoreBinding)object6).includeItemDetails.avoidPenalityImage1;
                    ((da$a)object2).n = object;
                    ((da$a)object2).u = object6;
                    ((da$a)object2).a();
                }
            }
            if ((object2 = ((ProfileHealth)object3).getActionContent()) != null && (object2 = ((ActionContent)object2).getPreventionTips()) != null) {
                object2 = ((PreventionTips)object2).getValues();
            } else {
                n7 = 0;
                object2 = null;
            }
            object2 = (Collection)object2;
            if (object2 != null && (n7 = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
                object2 = ((ProfileHealth)object3).getActionContent();
                if (object2 != null && (object2 = ((ActionContent)object2).getPreventionTips()) != null && (object2 = ((PreventionTips)object2).getValues()) != null) {
                    n7 = object2.size();
                    object2 = n7;
                } else {
                    n7 = 0;
                    object2 = null;
                }
                Intrinsics.checkNotNull(object2);
                n7 = (Integer)object2;
                if (n7 > n4) {
                    object2 = new da$a();
                    ((da$a)object2).k = n4;
                    ((da$a)object2).r = n4;
                    n3 = R$string.acc_banner;
                    object = hv3_0.K(n3);
                    ((da$a)object2).b((String)object);
                    object = ((ProfileHealth)object3).getActionContent();
                    if (object != null && (object = ((ActionContent)object).getPreventionTips()) != null && (object = ((PreventionTips)object).getValues()) != null && (object = (Value)object.get(n4)) != null) {
                        object = ((Value)object).getImageUrl();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    object6 = ag1_12.f;
                    if (object6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                        object6 = null;
                    }
                    object6 = ((FragmentIncentivizeKnowMoreBinding)object6).includeItemDetails.avoidPenalityImage2;
                    ((da$a)object2).n = object;
                    ((da$a)object2).u = object6;
                    ((da$a)object2).a();
                }
            }
            if ((object2 = ((ProfileHealth)object3).getActionContent()) != null && (object2 = ((ActionContent)object2).getPreventionTips()) != null) {
                object2 = ((PreventionTips)object2).getValues();
            } else {
                n7 = 0;
                object2 = null;
            }
            object2 = (Collection)object2;
            if (object2 != null && (n7 = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
                object2 = ((ProfileHealth)object3).getActionContent();
                if (object2 != null && (object2 = ((ActionContent)object2).getPreventionTips()) != null && (object2 = ((PreventionTips)object2).getValues()) != null) {
                    n7 = object2.size();
                    object2 = n7;
                } else {
                    n7 = 0;
                    object2 = null;
                }
                Intrinsics.checkNotNull(object2);
                n7 = (Integer)object2;
                if (n7 > n8) {
                    object2 = new da$a();
                    ((da$a)object2).k = n4;
                    ((da$a)object2).r = n4;
                    n3 = R$string.acc_banner;
                    object = hv3_0.K(n3);
                    ((da$a)object2).b((String)object);
                    object = ((ProfileHealth)object3).getActionContent();
                    if (object != null && (object = ((ActionContent)object).getPreventionTips()) != null && (object = ((PreventionTips)object).getValues()) != null && (object = (Value)object.get(n8)) != null) {
                        object = ((Value)object).getImageUrl();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    object6 = ag1_12.f;
                    if (object6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                        object6 = null;
                    }
                    object6 = ((FragmentIncentivizeKnowMoreBinding)object6).includeItemDetails.avoidPenalityImage3;
                    ((da$a)object2).n = object;
                    ((da$a)object2).u = object6;
                    ((da$a)object2).a();
                }
            }
            if ((object2 = ((ProfileHealth)object3).getExtra()) != null) {
                n7 = ((Extra)object2).getRvpPercent();
                if ((object3 = ((ProfileHealth)object3).getActionContent()) != null && (object3 = ((ActionContent)object3).getAjio_avg_perc()) != null) {
                    int n14 = ((Number)object3).intValue();
                    object = ag1_12.f;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    } else {
                        object8 = object;
                    }
                    object = ((FragmentIncentivizeKnowMoreBinding)object8).includeItemDetails.seekBarll.getViewTreeObserver();
                    object7 = new zg1_0(ag1_12, n14, n7);
                    object.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object7);
                }
            }
        }
        object3 = AnalyticsManager.Companion;
        object = ((AnalyticsManager$Companion)object3).getInstance().getNewCustomEventsRevamp();
        String string2 = bv_0.a((AnalyticsManager$Companion)object3);
        String string3 = cv_0.a((AnalyticsManager$Companion)object3);
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, "", "", "", "screen_view", "return - exchange nudge severe return detail screen", null, string2, null, string3, false, null, 1568, null);
    }
}

