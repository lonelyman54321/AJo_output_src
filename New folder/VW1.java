/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.f$a;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.data.database.entity.ShareProductExperience;
import com.ril.ajio.data.database.entity.SharedWithMe;
import com.ril.ajio.data.database.entity.SharedWithMe$Companion;
import com.ril.ajio.services.data.user.UserInformation;
import java.util.ArrayList;
import java.util.TreeSet;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class VW1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ VW1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View view) {
        Object object = this.b;
        int n3 = 1;
        boolean n4 = false;
        Object object2 = null;
        int n7 = this.a;
        switch (n7) {
            default: {
                Object object3 = B23.Companion;
                object = (B23)object;
                object3 = "this$0";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                n7 = view.getId();
                int n8 = R$id.fswmdMenuShare;
                Object object4 = null;
                String string2 = "mUserViewModel";
                String string3 = "Min. 1 product to be selected.";
                String string4 = "format(...)";
                String string5 = "sharedWithMeViewModel";
                if (n7 == n8) {
                    object3 = yn3_0.a;
                    Object object5 = "Share clicked";
                    Object object6 = new Object[]{};
                    ((yn3$a)object3).a((String)object5, (Object[])object6);
                    object3 = ((B23)object).f;
                    if (object3 != null) {
                        ArrayList arrayList = ((m23_0)object3).h();
                        n7 = arrayList.size();
                        object5 = AnalyticsManager.Companion;
                        object6 = object5.getInstance().getGtmEvents();
                        String string6 = hj0_0.a(n7, "Share_SharedWithMeDetail_Share_option_count:");
                        String string7 = "Share_SharedWithMeDetail_Share";
                        ak0_0.a((AnalyticsManager$Companion)object5, (GTMEvents)object6, string7, string6);
                        if (n7 > 0) {
                            object3 = ((B23)object).j;
                            if (object3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                n7 = 0;
                                object3 = null;
                            }
                            if ((n7 = (int)(((hy3_0)object3).p() ? 1 : 0)) == 0) {
                                ((B23)object).Ta();
                            } else {
                                object3 = z40_0.Companion;
                                object3 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object3).a;
                                object5 = "android_closet_share";
                                n7 = (int)(((ao0_0)object3).a((String)object5) ? 1 : 0);
                                if (n7 != 0) {
                                    ((B23)object).Ra().fswmdProgressView.show();
                                    Object object7 = ((B23)object).c;
                                    if (object7 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string5);
                                        n3 = 0;
                                        object7 = null;
                                    }
                                    Intrinsics.checkNotNull(arrayList);
                                    object2 = UserInformation.getInstance(((Fragment)object).requireContext().getApplicationContext()).getUserName();
                                    object7.getClass();
                                    object7 = "selectedPositions";
                                    Intrinsics.checkNotNullParameter(arrayList, (String)object7);
                                    n7 = arrayList.size();
                                    if (n7 == 0) {
                                        object2 = "";
                                    } else {
                                        object3 = new StringBuilder();
                                        if (object2 != null) {
                                            object5 = " has shared ";
                                            object2 = ((String)object2).concat((String)object5);
                                            ((StringBuilder)object3).append((String)object2);
                                        } else {
                                            object2 = "Sharing ";
                                            ((StringBuilder)object3).append((String)object2);
                                        }
                                        int n10 = arrayList.size();
                                        ((StringBuilder)object3).append(n10);
                                        ((StringBuilder)object3).append(" items with you from AJIO.");
                                        object2 = ((StringBuilder)object3).toString();
                                        Intrinsics.checkNotNull(object2);
                                    }
                                    object3 = ((B23)object).c;
                                    if (object3 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string5);
                                    } else {
                                        object4 = object3;
                                    }
                                    object4.getClass();
                                    Intrinsics.checkNotNullParameter(arrayList, (String)object7);
                                    long l2 = System.currentTimeMillis();
                                    object7 = UserInformation.getInstance((Context)((Hj)object4).getApplication());
                                    ((UserInformation)object7).getEncryptedUserName();
                                    String string8 = ((UserInformation)object7).getEncryptedUuid();
                                    String string9 = ((UserInformation)object7).getEncryptedUserName();
                                    object6 = SharedWithMe.Companion;
                                    Intrinsics.checkNotNull(string8);
                                    Intrinsics.checkNotNull(string9);
                                    object7 = ((SharedWithMe$Companion)object6).prepareClosetSharingUrl(arrayList, l2, string8, string9);
                                    d23_0.c((String)object2, (String)object7, (t13_0)object);
                                } else {
                                    object = StringCompanionObject.INSTANCE;
                                    int bl3 = R$string.acc_error_message;
                                    object = hv3_0.K(bl3);
                                    object3 = "Unable to share. Please try again later.";
                                    object5 = new Object[n3];
                                    object5[0] = object3;
                                    ZK1.e(object5, n3, (String)object, string4, (String)object3);
                                }
                            }
                        } else {
                            object = StringCompanionObject.INSTANCE;
                            int n19 = R$string.acc_error_message;
                            object = hv3_0.K(n19);
                            object3 = new Object[n3];
                            object3[0] = string3;
                            ZK1.e((Object[])object3, n3, (String)object, string4, string3);
                        }
                    }
                } else {
                    n8 = R$id.fswmdMenuDelete;
                    int n14 = -1;
                    if (n7 == n8) {
                        object3 = ((B23)object).f;
                        if (object3 != null) {
                            object4 = ((m23_0)object3).h();
                        }
                        if (object4 != null) {
                            n14 = ((ArrayList)object4).size();
                        }
                        object3 = AnalyticsManager.Companion;
                        Object object8 = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents();
                        string2 = hj0_0.a(n14, "Share_SharedWithMeDetail_Delete_option_count:");
                        string5 = "Share_SharedWithMeDetail_Delete";
                        ak0_0.a((AnalyticsManager$Companion)object3, (GTMEvents)object8, string5, string2);
                        if (n14 > 0) {
                            boolean n20;
                            boolean bl2;
                            Intrinsics.checkNotNull(object4);
                            object2 = ((Fragment)object).requireActivity();
                            f$a f$a = new f$a((Context)object2);
                            object2 = f$a.setMessage("Are you sure to delete the selected items?");
                            n7 = R$string.yes;
                            object8 = new r23((B23)object, (ArrayList)object4);
                            object2 = ((f$a)object2).setPositiveButton(n7, (DialogInterface.OnClickListener)object8);
                            n7 = R$string.no;
                            object8 = new Object();
                            ((f$a)object2).setNegativeButton(n7, (DialogInterface.OnClickListener)object8);
                            boolean bl3 = ((Fragment)object).isAdded();
                            if (bl3 && !(bl2 = ((Fragment)object).isRemoving()) && (n20 = ((Fragment)object).isVisible())) {
                                f$a.show();
                            }
                        } else {
                            object = StringCompanionObject.INSTANCE;
                            int n15 = R$string.acc_alert_message;
                            object = hv3_0.K(n15);
                            object3 = new Object[n3];
                            object3[0] = string3;
                            ZK1.e((Object[])object3, n3, (String)object, string4, string3);
                        }
                    } else {
                        n8 = R$id.fswmdMenuSaveToCloset;
                        int n16 = 3;
                        if (n7 == n8) {
                            String string10;
                            Object object9;
                            ArrayList<Object> arrayList;
                            Object object10;
                            object3 = ((B23)object).f;
                            if (object3 != null) {
                                int n17;
                                object10 = ((TreeSet)ex_2.B(((m23_0)object3).e)).iterator();
                                arrayList = new ArrayList<Object>();
                                while ((n17 = object10.hasNext()) != 0) {
                                    object9 = object10.next();
                                    string10 = "next(...)";
                                    Intrinsics.checkNotNullExpressionValue(object9, string10);
                                    n17 = ((Number)object9).intValue();
                                    object9 = ((m23_0)object3).i(n17);
                                    arrayList.add(object9);
                                }
                            } else {
                                arrayList = null;
                            }
                            n7 = arrayList != null ? arrayList.size() : -1;
                            object10 = AnalyticsManager.Companion;
                            object9 = ((AnalyticsManager$Companion)object10).getInstance().getGtmEvents();
                            string10 = hj0_0.a(n7, "Share_SharedWithMeDetail_SaveToCloset_option_count:");
                            Object object11 = "Share_SharedWithMeDetail_SaveToCloset";
                            ak0_0.a((AnalyticsManager$Companion)object10, (GTMEvents)object9, (String)object11, string10);
                            if (n7 > 0) {
                                object11 = ((B23)object).j;
                                if (object11 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                                    n3 = 0;
                                    object11 = null;
                                }
                                if ((n3 = (int)(((hy3_0)object11).p() ? 1 : 0)) == 0) {
                                    ((B23)object).Ta();
                                } else {
                                    Intrinsics.checkNotNull(arrayList);
                                    n3 = (int)(((Fragment)object).isAdded() ? 1 : 0);
                                    if (n3 != 0 && (n3 = (int)(((Fragment)object).isRemoving() ? 1 : 0)) == 0 && (n3 = (int)(((Fragment)object).isVisible() ? 1 : 0)) != 0) {
                                        object11 = ((B23)object).Ra().fswmdProgressView;
                                        ((AjioProgressView)((Object)object11)).show();
                                        object = ((B23)object).c;
                                        if (object == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(string5);
                                            boolean bl4 = false;
                                            object = null;
                                        }
                                        object.getClass();
                                        Intrinsics.checkNotNullParameter(arrayList, "selectedProductsCode");
                                        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
                                        ((w23_0)object).p = arrayList;
                                        ((w23_0)object).r = n3 = arrayList.size();
                                        ((w23_0)object).s = n14;
                                        ((w23_0)object).t = 0;
                                        object11 = md3_0.c((jD3)object);
                                        object2 = new v23_0((w23_0)object, null);
                                        Ae3.d((i90_0)object11, null, null, (Function2)object2, n16);
                                    }
                                }
                            } else {
                                object = StringCompanionObject.INSTANCE;
                                int n18 = R$string.acc_error_message;
                                object = hv3_0.K(n18);
                                n3 = 1;
                                object3 = new Object[n3];
                                object3[0] = string3;
                                ZK1.e((Object[])object3, n3, (String)object, string4, string3);
                            }
                        } else {
                            n3 = R$id.fswmdTvRestoreItems;
                            if (n7 == n3) {
                                Object object12 = ((B23)object).h;
                                if (object12 != null && (object12 = ((SharedWithMe)object12).getShareProductExperience()) != null) {
                                    int n19;
                                    ((B23)object).Ra().fswmdProgressView.show();
                                    object12 = ((B23)object).c;
                                    if (object12 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string5);
                                        n3 = 0;
                                        object12 = null;
                                    }
                                    object2 = ((B23)object).h;
                                    object3 = "sharedWithMe";
                                    if (object2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                                        boolean bl5 = false;
                                        object2 = null;
                                    }
                                    object2 = ((SharedWithMe)object2).getShareProductExperience();
                                    Intrinsics.checkNotNull(object2);
                                    object2 = ((ShareProductExperience)object2).getShortLink();
                                    object = ((B23)object).h;
                                    if (object == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                                        n19 = 0;
                                        object = null;
                                    }
                                    object = ((SharedWithMe)object).getShareProductExperience();
                                    Intrinsics.checkNotNull(object);
                                    n19 = ((ShareProductExperience)object).getId();
                                    object12.getClass();
                                    Intrinsics.checkNotNullParameter(object2, "shortLink");
                                    object2 = md3_0.c((jD3)object12);
                                    object3 = new a33((w23_0)object12, n19, null);
                                    Ae3.d((i90_0)object2, null, null, (Function2)object3, n16);
                                }
                            } else {
                                n3 = R$id.fswmdTvContinueShopping;
                                if (n7 == n3) {
                                    object = ((B23)object).d;
                                    if (object == null) {
                                        object = "sharedWithMeDetailListener";
                                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                                    } else {
                                        object4 = object;
                                    }
                                    object4.U0();
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 0: 
        }
        object = (BottomSheetDialog)object;
        Intrinsics.checkNotNullParameter(object, "$closetDeleteDialog");
        ((on)object).dismiss();
    }
}

